/**
 * <copyright>
 * </copyright>
 *
 * $Id: TestLangSwitch.java,v 1.1 2009/02/18 19:45:29 sefftinge Exp $
 */
package org.eclipse.xtext.testlanguages.testLang.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.testlanguages.testLang.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.testlanguages.testLang.TestLangPackage
 * @generated
 */
public class TestLangSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TestLangPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TestLangSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TestLangPackage.eINSTANCE;
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  public T doSwitch(EObject theEObject)
  {
    return doSwitch(theEObject.eClass(), theEObject);
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(EClass theEClass, EObject theEObject)
  {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TestLangPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TestLangPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TestLangPackage.CHOICE_ELEMENT:
      {
        ChoiceElement choiceElement = (ChoiceElement)theEObject;
        T result = caseChoiceElement(choiceElement);
        if (result == null) result = caseAbstractElement(choiceElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TestLangPackage.REDUCIBLE_ELEMENT:
      {
        ReducibleElement reducibleElement = (ReducibleElement)theEObject;
        T result = caseReducibleElement(reducibleElement);
        if (result == null) result = caseAbstractElement(reducibleElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TestLangPackage.TERMINAL_ELEMENT:
      {
        TerminalElement terminalElement = (TerminalElement)theEObject;
        T result = caseTerminalElement(terminalElement);
        if (result == null) result = caseReducibleElement(terminalElement);
        if (result == null) result = caseAbstractElement(terminalElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TestLangPackage.REDUCIBLE_COMPOSITE:
      {
        ReducibleComposite reducibleComposite = (ReducibleComposite)theEObject;
        T result = caseReducibleComposite(reducibleComposite);
        if (result == null) result = caseReducibleElement(reducibleComposite);
        if (result == null) result = caseAbstractElement(reducibleComposite);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choice Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choice Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoiceElement(ChoiceElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reducible Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reducible Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReducibleElement(ReducibleElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Terminal Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Terminal Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTerminalElement(TerminalElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Reducible Composite</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reducible Composite</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReducibleComposite(ReducibleComposite object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TestLangSwitch
