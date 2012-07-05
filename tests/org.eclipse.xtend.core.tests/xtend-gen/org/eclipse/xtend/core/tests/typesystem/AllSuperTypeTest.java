package org.eclipse.xtend.core.tests.typesystem;

import java.util.Collection;
import java.util.List;
import org.eclipse.xtend.core.tests.typesystem.AbstractSuperTypeTest;
import org.eclipse.xtext.xbase.lib.Pair;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.junit.Test;

/**
 * @author Sebastian Zarnekow
 */
@SuppressWarnings("all")
public class AllSuperTypeTest extends AbstractSuperTypeTest {
  public Iterable<LightweightTypeReference> collectSuperTypes(final LightweightTypeReference reference) {
    List<LightweightTypeReference> _allSuperTypes = reference.getAllSuperTypes();
    return _allSuperTypes;
  }
  
  @Test
  public void testString() {
    this.assertSuperTypes(String.class, "Serializable", "Comparable<String>", "CharSequence", "Object");
  }
  
  @Test
  public void testRawCollection() {
    this.assertSuperTypes(Collection.class, "Iterable", "Object");
  }
  
  @Test
  public void testStringCollection() {
    this.assertSuperTypes("java.util.Collection<String>", "Iterable<String>", "Object");
  }
  
  @Test
  public void testStringArray() {
    this.assertSuperTypes("String[]", "Serializable[]", "Comparable<String>[]", "CharSequence[]", "Object[]", "Cloneable", "Serializable", "Object");
  }
  
  @Test
  public void testObjectArray() {
    this.assertSuperTypes("Object[]", "Cloneable", "Serializable", "Object");
  }
  
  @Test
  public void testPrimitiveArray() {
    this.assertSuperTypes("int[]", "Cloneable", "Serializable", "Object");
  }
  
  @Test
  public void testRawList() {
    this.assertSuperTypes(List.class, "Collection", "Iterable", "Object");
  }
  
  @Test
  public void testStringList() {
    this.assertSuperTypes("java.util.List<String>", "Collection<String>", "Iterable<String>", "Object");
  }
  
  @Test
  public void testStringArrayArrayList() {
    this.assertSuperTypes("java.util.ArrayList<? extends String[]>", 
      "AbstractList<? extends String[]>", 
      "RandomAccess", 
      "Cloneable", 
      "Serializable", 
      "AbstractCollection<? extends String[]>", 
      "List<? extends String[]>", 
      "Collection<? extends String[]>", 
      "Iterable<? extends String[]>", 
      "Object");
  }
  
  @Test
  public void testTypeParameters() {
    Pair<String,String> _mappedTo = Pair.<String, String>of("T", "T extends CharSequence");
    this.assertSuperTypes(_mappedTo, "CharSequence", "Object");
  }
  
  @Test
  public void testDependentTypeParameters() {
    Pair<String,String> _mappedTo = Pair.<String, String>of("T", "V, T extends V");
    this.assertSuperTypes(_mappedTo, "V", "Object");
  }
  
  @Test
  public void testDependentTypeParametersWithBounds() {
    Pair<String,String> _mappedTo = Pair.<String, String>of("T", "V extends CharSequence, T extends V");
    this.assertSuperTypes(_mappedTo, "V", "CharSequence", "Object");
  }
  
  @Test
  public void testTypeParameterArray() {
    Pair<String,String> _mappedTo = Pair.<String, String>of("T", "T extends Object[]");
    this.assertSuperTypes(_mappedTo, "Object[]", "Cloneable", "Serializable", "Object");
  }
}
