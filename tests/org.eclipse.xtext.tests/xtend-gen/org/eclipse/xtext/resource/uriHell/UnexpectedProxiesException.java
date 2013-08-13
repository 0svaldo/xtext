/**
 * Copyright (c) 2013 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.resource.uriHell;

import com.google.common.collect.Iterables;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature.Setting;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * @author Sebastian Zarnekow - Initial contribution and API
 */
@SuppressWarnings("all")
public class UnexpectedProxiesException extends RuntimeException {
  public UnexpectedProxiesException(final Map<EObject,Collection<Setting>> unresolved) {
    super(new Function0<String>() {
      public String apply() {
        Collection<Collection<Setting>> _values = unresolved.values();
        Iterable<Setting> _flatten = Iterables.<Setting>concat(_values);
        final Function1<Setting,List<URI>> _function = new Function1<Setting,List<URI>>() {
          public List<URI> apply(final Setting it) {
            List<URI> _uRIs = UnexpectedProxiesException.getURIs(it);
            return _uRIs;
          }
        };
        Iterable<List<URI>> _map = IterableExtensions.<Setting, List<URI>>map(_flatten, _function);
        Iterable<URI> _flatten_1 = Iterables.<URI>concat(_map);
        Set<URI> _set = IterableExtensions.<URI>toSet(_flatten_1);
        String _string = _set.toString();
        return _string;
      }
    }.apply());
  }
  
  public static List<URI> getURIs(final Setting setting) {
    List<URI> _switchResult = null;
    Object _get = setting.get(false);
    final Object it = _get;
    boolean _matched = false;
    if (!_matched) {
      if (it instanceof EObject) {
        final EObject _eObject = (EObject)it;
        _matched=true;
        URI _uRI = EcoreUtil.getURI(_eObject);
        List<URI> _newImmutableList = CollectionLiterals.<URI>newImmutableList(_uRI);
        _switchResult = _newImmutableList;
      }
    }
    if (!_matched) {
      if (it instanceof List) {
        final List<EObject> _list = (List<EObject>)it;
        _matched=true;
        final Function1<EObject,URI> _function = new Function1<EObject,URI>() {
          public URI apply(final EObject it) {
            URI _uRI = EcoreUtil.getURI(it);
            return _uRI;
          }
        };
        List<URI> _map = ListExtensions.<EObject, URI>map(_list, _function);
        _switchResult = _map;
      }
    }
    return _switchResult;
  }
}
