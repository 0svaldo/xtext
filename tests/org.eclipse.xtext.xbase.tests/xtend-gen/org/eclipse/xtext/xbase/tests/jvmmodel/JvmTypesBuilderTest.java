package org.eclipse.xtext.xbase.tests.jvmmodel;

import com.google.inject.Inject;
import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.util.EList;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.common.types.JvmAnnotationReference;
import org.eclipse.xtext.common.types.JvmAnnotationType;
import org.eclipse.xtext.common.types.JvmAnnotationValue;
import org.eclipse.xtext.common.types.JvmEnumerationLiteral;
import org.eclipse.xtext.common.types.JvmEnumerationType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmOperation;
import org.eclipse.xtext.common.types.JvmStringAnnotationValue;
import org.eclipse.xtext.common.types.JvmType;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.common.types.TypesFactory;
import org.eclipse.xtext.common.types.util.TypeReferences;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotation;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationElementValuePair;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationValueArray;
import org.eclipse.xtext.xbase.annotations.xAnnotations.XAnnotationsFactory;
import org.eclipse.xtext.xbase.compiler.output.ITreeAppendable;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.tests.AbstractXbaseTestCase;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class JvmTypesBuilderTest extends AbstractXbaseTestCase {
  @Inject
  private TypesFactory typesFactory;
  
  @Inject
  private TypeReferences references;
  
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Test
  public void testEmptyAnnotation() {
    try {
      final XAnnotationsFactory f = XAnnotationsFactory.eINSTANCE;
      final XExpression e = this.expression("\'Foo\'");
      final XAnnotation anno = f.createXAnnotation();
      JvmType _findDeclaredType = this.references.findDeclaredType(Inject.class, e);
      anno.setAnnotationType(((JvmAnnotationType) _findDeclaredType));
      final JvmGenericType type = this.typesFactory.createJvmGenericType();
      ArrayList<XAnnotation> _newArrayList = CollectionLiterals.<XAnnotation>newArrayList(anno);
      this._jvmTypesBuilder.translateAnnotationsTo(_newArrayList, type);
      JvmAnnotationType _annotationType = anno.getAnnotationType();
      EList<JvmAnnotationReference> _annotations = type.getAnnotations();
      JvmAnnotationReference _head = IterableExtensions.<JvmAnnotationReference>head(_annotations);
      JvmAnnotationType _annotation = _head.getAnnotation();
      Assert.assertEquals(_annotationType, _annotation);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testStringAnnotation() {
    try {
      final XAnnotationsFactory f = XAnnotationsFactory.eINSTANCE;
      final XExpression e = this.expression("\'Foo\'");
      final XAnnotation anno = f.createXAnnotation();
      JvmType _findDeclaredType = this.references.findDeclaredType(Inject.class, e);
      anno.setAnnotationType(((JvmAnnotationType) _findDeclaredType));
      anno.setValue(e);
      final JvmGenericType type = this.typesFactory.createJvmGenericType();
      ArrayList<XAnnotation> _newArrayList = CollectionLiterals.<XAnnotation>newArrayList(anno);
      this._jvmTypesBuilder.translateAnnotationsTo(_newArrayList, type);
      JvmAnnotationType _annotationType = anno.getAnnotationType();
      EList<JvmAnnotationReference> _annotations = type.getAnnotations();
      JvmAnnotationReference _head = IterableExtensions.<JvmAnnotationReference>head(_annotations);
      JvmAnnotationType _annotation = _head.getAnnotation();
      Assert.assertEquals(_annotationType, _annotation);
      EList<JvmAnnotationReference> _annotations_1 = type.getAnnotations();
      JvmAnnotationReference _head_1 = IterableExtensions.<JvmAnnotationReference>head(_annotations_1);
      EList<JvmAnnotationValue> _values = _head_1.getValues();
      JvmAnnotationValue _head_2 = IterableExtensions.<JvmAnnotationValue>head(_values);
      EList<String> _values_1 = ((JvmStringAnnotationValue) _head_2).getValues();
      String _head_3 = IterableExtensions.<String>head(_values_1);
      Assert.assertEquals("Foo", _head_3);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testStringAnnotationWithNullExpression() {
    try {
      final XAnnotationsFactory f = XAnnotationsFactory.eINSTANCE;
      final XExpression context = this.expression("\'Foo\'");
      final XAnnotation anno = f.createXAnnotation();
      JvmType _findDeclaredType = this.references.findDeclaredType(Inject.class, context);
      anno.setAnnotationType(((JvmAnnotationType) _findDeclaredType));
      final XAnnotationElementValuePair pair = f.createXAnnotationElementValuePair();
      EList<XAnnotationElementValuePair> _elementValuePairs = anno.getElementValuePairs();
      _elementValuePairs.add(pair);
      final JvmGenericType type = this.typesFactory.createJvmGenericType();
      ArrayList<XAnnotation> _newArrayList = CollectionLiterals.<XAnnotation>newArrayList(anno);
      this._jvmTypesBuilder.translateAnnotationsTo(_newArrayList, type);
      JvmAnnotationType _annotationType = anno.getAnnotationType();
      EList<JvmAnnotationReference> _annotations = type.getAnnotations();
      JvmAnnotationReference _head = IterableExtensions.<JvmAnnotationReference>head(_annotations);
      JvmAnnotationType _annotation = _head.getAnnotation();
      Assert.assertEquals(_annotationType, _annotation);
      EList<JvmAnnotationReference> _annotations_1 = type.getAnnotations();
      JvmAnnotationReference _head_1 = IterableExtensions.<JvmAnnotationReference>head(_annotations_1);
      EList<JvmAnnotationValue> _values = _head_1.getValues();
      boolean _isEmpty = _values.isEmpty();
      Assert.assertTrue(_isEmpty);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testStringArrayAnnotation() {
    try {
      final XAnnotationsFactory f = XAnnotationsFactory.eINSTANCE;
      final XExpression e = this.expression("\'Foo\'");
      final XExpression e2 = this.expression("\'Bar\'");
      final XAnnotation anno = f.createXAnnotation();
      JvmType _findDeclaredType = this.references.findDeclaredType(Inject.class, e);
      anno.setAnnotationType(((JvmAnnotationType) _findDeclaredType));
      final XAnnotationValueArray array = f.createXAnnotationValueArray();
      anno.setValue(array);
      EList<XExpression> _values = array.getValues();
      _values.add(e);
      EList<XExpression> _values_1 = array.getValues();
      _values_1.add(e2);
      final JvmGenericType type = this.typesFactory.createJvmGenericType();
      ArrayList<XAnnotation> _newArrayList = CollectionLiterals.<XAnnotation>newArrayList(anno);
      this._jvmTypesBuilder.translateAnnotationsTo(_newArrayList, type);
      JvmAnnotationType _annotationType = anno.getAnnotationType();
      EList<JvmAnnotationReference> _annotations = type.getAnnotations();
      JvmAnnotationReference _head = IterableExtensions.<JvmAnnotationReference>head(_annotations);
      JvmAnnotationType _annotation = _head.getAnnotation();
      Assert.assertEquals(_annotationType, _annotation);
      EList<JvmAnnotationReference> _annotations_1 = type.getAnnotations();
      JvmAnnotationReference _head_1 = IterableExtensions.<JvmAnnotationReference>head(_annotations_1);
      EList<JvmAnnotationValue> _values_2 = _head_1.getValues();
      JvmAnnotationValue _head_2 = IterableExtensions.<JvmAnnotationValue>head(_values_2);
      EList<String> _values_3 = ((JvmStringAnnotationValue) _head_2).getValues();
      String _head_3 = IterableExtensions.<String>head(_values_3);
      Assert.assertEquals("Foo", _head_3);
      EList<JvmAnnotationReference> _annotations_2 = type.getAnnotations();
      JvmAnnotationReference _head_4 = IterableExtensions.<JvmAnnotationReference>head(_annotations_2);
      EList<JvmAnnotationValue> _values_4 = _head_4.getValues();
      JvmAnnotationValue _head_5 = IterableExtensions.<JvmAnnotationValue>head(_values_4);
      EList<String> _values_5 = ((JvmStringAnnotationValue) _head_5).getValues();
      String _get = _values_5.get(1);
      Assert.assertEquals("Bar", _get);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testStringArrayAnnotationWithNullExpression() {
    try {
      final XAnnotationsFactory f = XAnnotationsFactory.eINSTANCE;
      final XExpression context = this.expression("\"foo\"");
      final XAnnotation anno = f.createXAnnotation();
      JvmType _findDeclaredType = this.references.findDeclaredType(Inject.class, context);
      anno.setAnnotationType(((JvmAnnotationType) _findDeclaredType));
      final XAnnotationValueArray array = f.createXAnnotationValueArray();
      anno.setValue(array);
      final JvmGenericType type = this.typesFactory.createJvmGenericType();
      ArrayList<XAnnotation> _newArrayList = CollectionLiterals.<XAnnotation>newArrayList(anno);
      this._jvmTypesBuilder.translateAnnotationsTo(_newArrayList, type);
      JvmAnnotationType _annotationType = anno.getAnnotationType();
      EList<JvmAnnotationReference> _annotations = type.getAnnotations();
      JvmAnnotationReference _head = IterableExtensions.<JvmAnnotationReference>head(_annotations);
      JvmAnnotationType _annotation = _head.getAnnotation();
      Assert.assertEquals(_annotationType, _annotation);
      EList<JvmAnnotationReference> _annotations_1 = type.getAnnotations();
      JvmAnnotationReference _head_1 = IterableExtensions.<JvmAnnotationReference>head(_annotations_1);
      EList<JvmAnnotationValue> _values = _head_1.getValues();
      boolean _isEmpty = _values.isEmpty();
      Assert.assertTrue(_isEmpty);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testAnnotationCreation() {
    try {
      final XExpression e = this.expression("\'foo\'");
      final Procedure1<JvmAnnotationType> _function = new Procedure1<JvmAnnotationType>() {
          public void apply(final JvmAnnotationType it) {
            JvmTypesBuilderTest.this._jvmTypesBuilder.setDocumentation(it, "Foo");
          }
        };
      final JvmAnnotationType anno = this._jvmTypesBuilder.toAnnotationType(e, "foo.bar.MyAnnotation", _function);
      String _packageName = anno.getPackageName();
      Assert.assertEquals("foo.bar", _packageName);
      String _simpleName = anno.getSimpleName();
      Assert.assertEquals("MyAnnotation", _simpleName);
      String _documentation = this._jvmTypesBuilder.getDocumentation(anno);
      Assert.assertEquals("Foo", _documentation);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testInterfaceCreation() {
    try {
      final XExpression e = this.expression("\'foo\'");
      final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
          public void apply(final JvmGenericType it) {
            EList<JvmTypeReference> _superTypes = it.getSuperTypes();
            JvmTypeReference _newTypeRef = JvmTypesBuilderTest.this._jvmTypesBuilder.newTypeRef(e, Iterable.class);
            _superTypes.add(_newTypeRef);
          }
        };
      final JvmGenericType anno = this._jvmTypesBuilder.toInterface(e, "foo.bar.MyAnnotation", _function);
      boolean _isInterface = anno.isInterface();
      Assert.assertTrue(_isInterface);
      String _packageName = anno.getPackageName();
      Assert.assertEquals("foo.bar", _packageName);
      String _simpleName = anno.getSimpleName();
      Assert.assertEquals("MyAnnotation", _simpleName);
      EList<JvmTypeReference> _superTypes = anno.getSuperTypes();
      int _size = _superTypes.size();
      Assert.assertEquals(1, _size);
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testEnumCreation() {
    try {
      final XExpression e = this.expression("\'foo\'");
      final Procedure1<JvmEnumerationType> _function = new Procedure1<JvmEnumerationType>() {
          public void apply(final JvmEnumerationType it) {
            JvmTypesBuilderTest.this._jvmTypesBuilder.setDocumentation(it, "Foo");
            EList<JvmMember> _members = it.getMembers();
            JvmEnumerationLiteral _enumerationLiteral = JvmTypesBuilderTest.this._jvmTypesBuilder.toEnumerationLiteral(e, "LITERAL0");
            _members.add(_enumerationLiteral);
            EList<JvmMember> _members_1 = it.getMembers();
            JvmEnumerationLiteral _enumerationLiteral_1 = JvmTypesBuilderTest.this._jvmTypesBuilder.toEnumerationLiteral(e, "LITERAL1");
            _members_1.add(_enumerationLiteral_1);
          }
        };
      final JvmEnumerationType myEnum = this._jvmTypesBuilder.toEnumerationType(e, "MyEnum", _function);
      String _packageName = myEnum.getPackageName();
      Assert.assertNull(_packageName);
      String _simpleName = myEnum.getSimpleName();
      Assert.assertEquals("MyEnum", _simpleName);
      String _documentation = this._jvmTypesBuilder.getDocumentation(myEnum);
      Assert.assertEquals("Foo", _documentation);
      ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList("LITERAL0", "LITERAL1");
      EList<JvmEnumerationLiteral> _literals = myEnum.getLiterals();
      final Function1<JvmEnumerationLiteral,String> _function_1 = new Function1<JvmEnumerationLiteral,String>() {
          public String apply(final JvmEnumerationLiteral it) {
            String _simpleName = it.getSimpleName();
            return _simpleName;
          }
        };
      List<String> _map = ListExtensions.<JvmEnumerationLiteral, String>map(_literals, _function_1);
      Assert.assertArrayEquals(((Object[])Conversions.unwrapArray(_newArrayList, Object.class)), ((Object[])Conversions.unwrapArray(_map, Object.class)));
    } catch (Exception _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testSetBody() {
    final JvmOperation op = this.typesFactory.createJvmOperation();
    final Procedure1<ITreeAppendable> _function = new Procedure1<ITreeAppendable>() {
        public void apply(final ITreeAppendable it) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("foo");
        }
      };
    this._jvmTypesBuilder.setBody(op, _function);
    final Procedure1<ITreeAppendable> _function_1 = new Procedure1<ITreeAppendable>() {
        public void apply(final ITreeAppendable it) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("bar");
        }
      };
    this._jvmTypesBuilder.setBody(op, _function_1);
    EList<Adapter> _eAdapters = op.eAdapters();
    int _size = _eAdapters.size();
    Assert.assertEquals(1, _size);
  }
}
