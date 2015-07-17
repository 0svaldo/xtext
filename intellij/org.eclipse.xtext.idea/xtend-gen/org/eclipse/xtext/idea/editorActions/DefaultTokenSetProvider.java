/**
 * Copyright (c) 2015 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.idea.editorActions;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import com.intellij.lang.CodeDocumentationAwareCommenter;
import com.intellij.openapi.editor.ex.DocumentEx;
import com.intellij.openapi.editor.ex.EditorEx;
import com.intellij.openapi.editor.highlighter.EditorHighlighter;
import com.intellij.openapi.editor.highlighter.HighlighterIterator;
import com.intellij.openapi.util.TextRange;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.tree.TokenSet;
import javax.inject.Singleton;
import org.eclipse.xtext.idea.editorActions.TokenSetProvider;
import org.eclipse.xtext.idea.parser.TokenTypeProvider;

/**
 * @author kosyakov - Initial contribution and API
 */
@Singleton
@SuppressWarnings("all")
public class DefaultTokenSetProvider implements TokenSetProvider {
  @Inject
  private TokenTypeProvider tokenTypeProvider;
  
  private TokenSet slCommentTokens;
  
  @Inject
  public void setCommenter(final CodeDocumentationAwareCommenter commenter) {
    final IElementType lineCommentTokenType = commenter.getLineCommentTokenType();
    TokenSet _xifexpression = null;
    boolean _equals = Objects.equal(lineCommentTokenType, null);
    if (_equals) {
      _xifexpression = TokenSet.EMPTY;
    } else {
      _xifexpression = TokenSet.create(lineCommentTokenType);
    }
    this.slCommentTokens = _xifexpression;
  }
  
  @Override
  public TokenSet getTokenSet(final EditorEx editor, final int offset) {
    IElementType _tokenType = this.getTokenType(editor, offset);
    return this.getTokenSet(_tokenType);
  }
  
  @Override
  public TokenSet getTokenSet(final IElementType tokenType) {
    TokenSet _stringLiteralTokens = this.getStringLiteralTokens();
    boolean _contains = _stringLiteralTokens.contains(tokenType);
    if (_contains) {
      return this.getStringLiteralTokens();
    }
    TokenSet _singleLineCommentTokens = this.getSingleLineCommentTokens();
    boolean _contains_1 = _singleLineCommentTokens.contains(tokenType);
    if (_contains_1) {
      return this.getSingleLineCommentTokens();
    }
    TokenSet _commentTokens = this.getCommentTokens();
    boolean _contains_2 = _commentTokens.contains(tokenType);
    if (_contains_2) {
      return this.getCommentTokens();
    }
    return null;
  }
  
  protected IElementType getTokenType(final EditorEx editor, final int offset) {
    IElementType _xblockexpression = null;
    {
      boolean _or = false;
      if ((offset < 0)) {
        _or = true;
      } else {
        DocumentEx _document = editor.getDocument();
        int _textLength = _document.getTextLength();
        boolean _greaterThan = (offset > _textLength);
        _or = _greaterThan;
      }
      if (_or) {
        return null;
      }
      EditorHighlighter _highlighter = editor.getHighlighter();
      final HighlighterIterator iterator = _highlighter.createIterator(offset);
      boolean _atEnd = iterator.atEnd();
      if (_atEnd) {
        return null;
      }
      _xblockexpression = iterator.getTokenType();
    }
    return _xblockexpression;
  }
  
  @Override
  public TokenSet getCommentTokens() {
    return this.tokenTypeProvider.getCommentTokens();
  }
  
  @Override
  public TokenSet getSingleLineCommentTokens() {
    return this.slCommentTokens;
  }
  
  @Override
  public TokenSet getStringLiteralTokens() {
    return this.tokenTypeProvider.getStringLiteralTokens();
  }
  
  @Override
  public boolean isStartOfLine(final EditorEx editor, final int offset) {
    TokenSet _tokenSet = this.getTokenSet(editor, offset);
    return this.isStartOfLine(_tokenSet, editor, offset);
  }
  
  @Override
  public boolean isStartOfLine(final TokenSet tokenSet, final EditorEx editor, final int offset) {
    String _beginningOfLine = this.getBeginningOfLine(editor, offset);
    String _trim = _beginningOfLine.trim();
    return _trim.isEmpty();
  }
  
  @Override
  public boolean isEndOfLine(final EditorEx editor, final int offset) {
    TokenSet _tokenSet = this.getTokenSet(editor, offset);
    return this.isEndOfLine(_tokenSet, editor, offset);
  }
  
  @Override
  public boolean isEndOfLine(final TokenSet tokenSet, final EditorEx editor, final int offset) {
    String _endOfLine = this.getEndOfLine(editor, offset);
    String _trim = _endOfLine.trim();
    return _trim.isEmpty();
  }
  
  protected String getBeginningOfLine(final EditorEx editor, final int offset) {
    String _xblockexpression = null;
    {
      final DocumentEx document = editor.getDocument();
      DocumentEx _document = editor.getDocument();
      final int lineNumber = _document.getLineNumber(offset);
      DocumentEx _document_1 = editor.getDocument();
      final int lineStartOffset = _document_1.getLineStartOffset(lineNumber);
      TextRange _textRange = new TextRange(lineStartOffset, offset);
      _xblockexpression = document.getText(_textRange);
    }
    return _xblockexpression;
  }
  
  protected String getEndOfLine(final EditorEx editor, final int offset) {
    String _xblockexpression = null;
    {
      final DocumentEx document = editor.getDocument();
      DocumentEx _document = editor.getDocument();
      final int lineNumber = _document.getLineNumber(offset);
      DocumentEx _document_1 = editor.getDocument();
      final int lineEndOffset = _document_1.getLineEndOffset(lineNumber);
      TextRange _textRange = new TextRange(offset, lineEndOffset);
      _xblockexpression = document.getText(_textRange);
    }
    return _xblockexpression;
  }
}
