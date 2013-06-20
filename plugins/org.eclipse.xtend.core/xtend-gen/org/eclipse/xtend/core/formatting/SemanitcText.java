package org.eclipse.xtend.core.formatting;

import org.eclipse.xtend.core.formatting.Chunk;
import org.eclipse.xtend.lib.Data;

@Data
@SuppressWarnings("all")
public class SemanitcText extends Chunk {
  public String toString() {
    CharSequence _text = this.getText();
    String _string = _text.toString();
    return _string;
  }
  
  public SemanitcText(final CharSequence text) {
    super(text);
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    return result;
  }
  
  @Override
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    if (!super.equals(obj))
      return false;
    SemanitcText other = (SemanitcText) obj;
    return true;
  }
}
