/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.web.server.hover;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.Collections;
import java.util.List;
import org.apache.log4j.Logger;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.documentation.IEObjectDocumentationProvider;
import org.eclipse.xtext.ide.labels.AlternativeImageDescription;
import org.eclipse.xtext.ide.labels.DecoratedImageDescription;
import org.eclipse.xtext.ide.labels.IImageDescription;
import org.eclipse.xtext.ide.labels.IImageDescriptionProvider;
import org.eclipse.xtext.ide.labels.INameLabelProvider;
import org.eclipse.xtext.ide.labels.SimpleImageDescription;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.util.concurrent.CancelableUnitOfWork;
import org.eclipse.xtext.util.internal.Log;
import org.eclipse.xtext.web.server.hover.HoverResult;
import org.eclipse.xtext.web.server.model.IXtextWebDocument;
import org.eclipse.xtext.web.server.model.XtextWebDocumentAccess;
import org.eclipse.xtext.web.server.util.ElementAtOffsetUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Service class for mouse hover information.
 */
@Singleton
@Log
@SuppressWarnings("all")
public class HoverService {
  @Inject
  @Extension
  private ElementAtOffsetUtil _elementAtOffsetUtil;
  
  @Inject
  @Extension
  private IEObjectDocumentationProvider _iEObjectDocumentationProvider;
  
  @Inject
  @Extension
  private IImageDescriptionProvider _iImageDescriptionProvider;
  
  @Inject
  @Extension
  private INameLabelProvider _iNameLabelProvider;
  
  /**
   * Compute a hover result at the given offset in the document. If no information is
   * available, {@code null} is returned.
   */
  public HoverResult getHover(final XtextWebDocumentAccess document, final int offset) {
    final CancelableUnitOfWork<HoverResult, IXtextWebDocument> _function = new CancelableUnitOfWork<HoverResult, IXtextWebDocument>() {
      @Override
      public HoverResult exec(final IXtextWebDocument it, final CancelIndicator cancelIndicator) throws Exception {
        HoverResult _xblockexpression = null;
        {
          XtextResource _resource = it.getResource();
          final EObject element = HoverService.this._elementAtOffsetUtil.getElementAt(_resource, offset);
          String _nameLabel = null;
          if (element!=null) {
            _nameLabel=HoverService.this._iNameLabelProvider.getNameLabel(element);
          }
          String _surroundWithDiv = null;
          if (_nameLabel!=null) {
            _surroundWithDiv=HoverService.this.surroundWithDiv(_nameLabel, "element-name");
          }
          final String nameLabel = _surroundWithDiv;
          HoverResult _xifexpression = null;
          boolean _notEquals = (!Objects.equal(nameLabel, null));
          if (_notEquals) {
            HoverResult _xblockexpression_1 = null;
            {
              IImageDescription _imageDescription = HoverService.this._iImageDescriptionProvider.getImageDescription(element);
              String _addIconDivs = HoverService.this.addIconDivs(_imageDescription, nameLabel);
              final String titleHtml = HoverService.this.surroundWithDiv(_addIconDivs, "hover");
              String _elvis = null;
              String _documentation = HoverService.this._iEObjectDocumentationProvider.getDocumentation(element);
              if (_documentation != null) {
                _elvis = _documentation;
              } else {
                _elvis = "";
              }
              final String bodyHtml = HoverService.this.surroundWithDiv(_elvis, "hover");
              String _stateId = it.getStateId();
              final HoverResult result = new HoverResult(_stateId, titleHtml, bodyHtml);
              HoverService.LOG.trace(result);
              _xblockexpression_1 = result;
            }
            _xifexpression = _xblockexpression_1;
          } else {
            _xifexpression = null;
          }
          _xblockexpression = _xifexpression;
        }
        return _xblockexpression;
      }
    };
    return document.<HoverResult>readOnly(_function);
  }
  
  protected String addIconDivs(final IImageDescription it, final String nameHtml) {
    String _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (it instanceof SimpleImageDescription) {
        _matched=true;
        String _imageID = ((SimpleImageDescription)it).getImageID();
        String _plus = (_imageID + "-icon");
        _switchResult = this.surroundWithDiv(nameHtml, _plus);
      }
    }
    if (!_matched) {
      if (it instanceof AlternativeImageDescription) {
        _matched=true;
        List<String> _imageIDs = ((AlternativeImageDescription)it).getImageIDs();
        final Function1<String, String> _function = new Function1<String, String>() {
          @Override
          public String apply(final String it) {
            return (it + "-icon");
          }
        };
        List<String> _map = ListExtensions.<String, String>map(_imageIDs, _function);
        _switchResult = this.surroundWithDiv(nameHtml, ((String[])Conversions.unwrapArray(_map, String.class)));
      }
    }
    if (!_matched) {
      if (it instanceof DecoratedImageDescription) {
        _matched=true;
        List<IImageDescription> _decorators = ((DecoratedImageDescription)it).getDecorators();
        IImageDescription _baseImage = ((DecoratedImageDescription)it).getBaseImage();
        Iterable<IImageDescription> _plus = Iterables.<IImageDescription>concat(_decorators, Collections.<IImageDescription>unmodifiableList(CollectionLiterals.<IImageDescription>newArrayList(_baseImage)));
        final Function2<String, IImageDescription, String> _function = new Function2<String, IImageDescription, String>() {
          @Override
          public String apply(final String $0, final IImageDescription $1) {
            return HoverService.this.addIconDivs($1, $0);
          }
        };
        _switchResult = IterableExtensions.<IImageDescription, String>fold(_plus, nameHtml, _function);
      }
    }
    return _switchResult;
  }
  
  protected String surroundWithDiv(final String html, final String... divClasses) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("<div class=\"");
    final Function1<String, String> _function = new Function1<String, String>() {
      @Override
      public String apply(final String it) {
        return it;
      }
    };
    List<String> _map = ListExtensions.<String, String>map(((List<String>)Conversions.doWrapArray(divClasses)), _function);
    String _join = IterableExtensions.join(_map, " ");
    _builder.append(_join, "");
    _builder.append("\">");
    _builder.newLineIfNotEmpty();
    _builder.append("\t");
    _builder.append(html, "\t");
    _builder.newLineIfNotEmpty();
    _builder.append("</div>");
    _builder.newLine();
    return _builder.toString();
  }
  
  private final static Logger LOG = Logger.getLogger(HoverService.class);
}
