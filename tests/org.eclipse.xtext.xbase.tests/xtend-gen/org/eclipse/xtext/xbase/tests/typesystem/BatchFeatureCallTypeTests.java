package org.eclipse.xtext.xbase.tests.typesystem;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.XAbstractFeatureCall;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure2;
import org.eclipse.xtext.xbase.tests.typesystem.AbstractFeatureCallTypeTest;
import org.eclipse.xtext.xbase.typesystem.IBatchTypeResolver;
import org.eclipse.xtext.xbase.typesystem.IResolvedTypes;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.junit.Assert;

/**
 * @author Sebastian Zarnekow
 */
@SuppressWarnings("all")
public class BatchFeatureCallTypeTests extends AbstractFeatureCallTypeTest {
  @Inject
  private IBatchTypeResolver typeResolver;
  
  public void resolvesFeatureCallsTo(final String expression, final String... types) {
    final String expressionWithQualifiedNames = expression.replace("$$", "org::eclipse::xtext::xbase::lib::");
    final List<XAbstractFeatureCall> featureCalls = this.findFeatureCalls(expressionWithQualifiedNames);
    boolean _isEmpty = featureCalls.isEmpty();
    Assert.assertFalse(_isEmpty);
    int _size = ((List<String>)Conversions.doWrapArray(types)).size();
    int _size_1 = featureCalls.size();
    Assert.assertEquals(_size, _size_1);
    XAbstractFeatureCall _head = IterableExtensions.<XAbstractFeatureCall>head(featureCalls);
    final IResolvedTypes resolvedTypes = this.typeResolver.resolveTypes(_head);
    final Procedure2<XAbstractFeatureCall,Integer> _function = new Procedure2<XAbstractFeatureCall,Integer>() {
        public void apply(final XAbstractFeatureCall featureCall, final Integer index) {
          final LightweightTypeReference type = resolvedTypes.getActualType(featureCall);
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("failed for feature call at ");
          _builder.append(index, "");
          String _get = ((List<String>)Conversions.doWrapArray(types)).get((index).intValue());
          String _simpleName = type.getSimpleName();
          Assert.assertEquals(_builder.toString(), _get, _simpleName);
        }
      };
    IterableExtensions.<XAbstractFeatureCall>forEach(featureCalls, _function);
  }
}
