package example4;

import java.util.ArrayList;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Node {
  private final ArrayList<Node> _contents = new Function0<ArrayList<Node>>() {
    public ArrayList<Node> apply() {
      ArrayList<Node> _newArrayList = CollectionLiterals.<Node>newArrayList();
      return _newArrayList;
    }
  }.apply();
  
  public ArrayList<Node> getContents() {
    return this._contents;
  }
  
  public String tagName() {
    Class<? extends Object> _class = this.getClass();
    String _simpleName = _class.getSimpleName();
    String _lowerCase = _simpleName.toLowerCase();
    return _lowerCase;
  }
  
  public Node() {
    super();
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_contents== null) ? 0 : _contents.hashCode());
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
    Node other = (Node) obj;
    if (_contents == null) {
      if (other._contents != null)
        return false;
    } else if (!_contents.equals(other._contents))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
