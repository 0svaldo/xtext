/**
 * <copyright>
 * </copyright>
 *
 * $Id: FormattertestlanguageFactory.java,v 1.2 2009/02/18 21:22:45 sefftinge Exp $
 */
package org.eclipse.xtext.parsetree.formatter.formattertestlanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.parsetree.formatter.formattertestlanguage.FormattertestlanguagePackage
 * @generated
 */
public interface FormattertestlanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  FormattertestlanguageFactory eINSTANCE = org.eclipse.xtext.parsetree.formatter.formattertestlanguage.impl.FormattertestlanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Root</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Root</em>'.
   * @generated
   */
  Root createRoot();

  /**
   * Returns a new object of class '<em>Line</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Line</em>'.
   * @generated
   */
  Line createLine();

  /**
   * Returns a new object of class '<em>Test Linewrap</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Linewrap</em>'.
   * @generated
   */
  TestLinewrap createTestLinewrap();

  /**
   * Returns a new object of class '<em>Test Indentation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Test Indentation</em>'.
   * @generated
   */
  TestIndentation createTestIndentation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  FormattertestlanguagePackage getFormattertestlanguagePackage();

} //FormattertestlanguageFactory
