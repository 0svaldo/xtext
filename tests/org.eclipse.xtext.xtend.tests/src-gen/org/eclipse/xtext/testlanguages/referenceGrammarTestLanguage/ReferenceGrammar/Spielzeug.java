/**
 * <copyright>
 * </copyright>
 *
 * $Id: Spielzeug.java,v 1.1 2009/02/05 19:05:39 jkohnlein Exp $
 */
package org.eclipse.xtext.testlanguages.referenceGrammarTestLanguage.ReferenceGrammar;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Spielzeug</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtext.testlanguages.referenceGrammarTestLanguage.ReferenceGrammar.Spielzeug#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.xtext.testlanguages.referenceGrammarTestLanguage.ReferenceGrammar.Spielzeug#getFarbe <em>Farbe</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtext.testlanguages.referenceGrammarTestLanguage.ReferenceGrammar.ReferenceGrammarPackage#getSpielzeug()
 * @model
 * @generated
 */
public interface Spielzeug extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.eclipse.xtext.testlanguages.referenceGrammarTestLanguage.ReferenceGrammar.ReferenceGrammarPackage#getSpielzeug_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.testlanguages.referenceGrammarTestLanguage.ReferenceGrammar.Spielzeug#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Farbe</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Farbe</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Farbe</em>' containment reference.
   * @see #setFarbe(Farbe)
   * @see org.eclipse.xtext.testlanguages.referenceGrammarTestLanguage.ReferenceGrammar.ReferenceGrammarPackage#getSpielzeug_Farbe()
   * @model containment="true"
   * @generated
   */
  Farbe getFarbe();

  /**
   * Sets the value of the '{@link org.eclipse.xtext.testlanguages.referenceGrammarTestLanguage.ReferenceGrammar.Spielzeug#getFarbe <em>Farbe</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Farbe</em>' containment reference.
   * @see #getFarbe()
   * @generated
   */
  void setFarbe(Farbe value);

} // Spielzeug
