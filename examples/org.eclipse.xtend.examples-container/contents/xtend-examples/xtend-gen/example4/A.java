package example4;

import example4.ContentNode;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class A extends ContentNode {
  private final String _href;
  
  public String getHref() {
    return this._href;
  }
  
  public A(final String href) {
    super();
    this._href = href;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((_href== null) ? 0 : _href.hashCode());
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
    A other = (A) obj;
    if (_href == null) {
      if (other._href != null)
        return false;
    } else if (!_href.equals(other._href))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
