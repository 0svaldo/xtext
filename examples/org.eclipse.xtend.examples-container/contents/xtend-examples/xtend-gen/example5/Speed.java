package example5;

import example5.Distance;
import example5.Time;
import java.math.BigDecimal;
import java.math.MathContext;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class Speed {
  private final BigDecimal _mmPerMsec;
  
  public BigDecimal getMmPerMsec() {
    return this._mmPerMsec;
  }
  
  public static Speed operator_divide(final Distance d, final Time t) {
    BigDecimal _mm = d.getMm();
    BigDecimal _msec = t.getMsec();
    BigDecimal _divide = _mm.divide(_msec, MathContext.DECIMAL128);
    Speed _speed = new Speed(_divide);
    return _speed;
  }
  
  public Speed(final BigDecimal mmPerMsec) {
    super();
    this._mmPerMsec = mmPerMsec;
  }
  
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((_mmPerMsec== null) ? 0 : _mmPerMsec.hashCode());
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
    Speed other = (Speed) obj;
    if (_mmPerMsec == null) {
      if (other._mmPerMsec != null)
        return false;
    } else if (!_mmPerMsec.equals(other._mmPerMsec))
      return false;
    return true;
  }
  
  @Override
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
}
