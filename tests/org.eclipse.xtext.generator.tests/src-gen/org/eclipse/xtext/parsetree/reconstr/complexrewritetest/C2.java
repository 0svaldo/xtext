/**
 * <copyright>
 * </copyright>
 *
 * $Id: C2.java,v 1.5 2009/02/19 21:09:47 sefftinge Exp $
 */
package org.eclipse.xtext.parsetree.reconstr.complexrewritetest;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>C2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.parsetree.reconstr.complexrewritetest.C2#getY <em>Y</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.parsetree.reconstr.complexrewritetest.ComplexrewritetestPackage#getC2()
 * @model
 * @generated
 */
public interface C2 extends TrickyC
{
  /**
   * Returns the value of the '<em><b>Y</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Y</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Y</em>' containment reference.
   * @see #setY(C1)
   * @see org.eclipse.xtext.parsetree.reconstr.complexrewritetest.ComplexrewritetestPackage#getC2_Y()
   * @model containment="true"
   * @generated
   */
  C1 getY();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.parsetree.reconstr.complexrewritetest.C2#getY <em>Y</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Y</em>' containment reference.
   * @see #getY()
   * @generated
   */
  void setY(C1 value);

} // C2
