/**
 * <copyright>
 * </copyright>
 *
 * $Id: TerminalRulesTestLanguageFactoryImpl.java,v 1.5 2009/02/19 21:10:06 sefftinge Exp $
 */
package org.eclipse.xtext.parser.terminalrules.terminalRulesTestLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.xtext.parser.terminalrules.terminalRulesTestLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TerminalRulesTestLanguageFactoryImpl extends EFactoryImpl implements TerminalRulesTestLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TerminalRulesTestLanguageFactory init()
  {
    try
    {
      TerminalRulesTestLanguageFactory theTerminalRulesTestLanguageFactory = (TerminalRulesTestLanguageFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/2008/tmf/xtext/TerminalRulesTest"); 
      if (theTerminalRulesTestLanguageFactory != null)
      {
        return theTerminalRulesTestLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TerminalRulesTestLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalRulesTestLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TerminalRulesTestLanguagePackage.MODEL: return createModel();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Model createModel()
  {
    ModelImpl model = new ModelImpl();
    return model;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TerminalRulesTestLanguagePackage getTerminalRulesTestLanguagePackage()
  {
    return (TerminalRulesTestLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TerminalRulesTestLanguagePackage getPackage()
  {
    return TerminalRulesTestLanguagePackage.eINSTANCE;
  }

} //TerminalRulesTestLanguageFactoryImpl
