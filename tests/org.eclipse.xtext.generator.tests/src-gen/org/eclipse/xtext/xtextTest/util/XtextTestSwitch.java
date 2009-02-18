/**
 * <copyright>
 * </copyright>
 *
 * $Id: XtextTestSwitch.java,v 1.1 2009/02/18 19:42:47 sefftinge Exp $
 */
package org.eclipse.xtext.xtextTest.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.xtextTest.*;

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
 * @see org.eclipse.xtext.xtextTest.XtextTestPackage
 * @generated
 */
public class XtextTestSwitch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static XtextTestPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public XtextTestSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = XtextTestPackage.eINSTANCE;
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
      case XtextTestPackage.GRAMMAR:
      {
        Grammar grammar = (Grammar)theEObject;
        T result = caseGrammar(grammar);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.ABSTRACT_RULE:
      {
        AbstractRule abstractRule = (AbstractRule)theEObject;
        T result = caseAbstractRule(abstractRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.ABSTRACT_METAMODEL_DECLARATION:
      {
        AbstractMetamodelDeclaration abstractMetamodelDeclaration = (AbstractMetamodelDeclaration)theEObject;
        T result = caseAbstractMetamodelDeclaration(abstractMetamodelDeclaration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.GENERATED_METAMODEL:
      {
        GeneratedMetamodel generatedMetamodel = (GeneratedMetamodel)theEObject;
        T result = caseGeneratedMetamodel(generatedMetamodel);
        if (result == null) result = caseAbstractMetamodelDeclaration(generatedMetamodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.REFERENCED_METAMODEL:
      {
        ReferencedMetamodel referencedMetamodel = (ReferencedMetamodel)theEObject;
        T result = caseReferencedMetamodel(referencedMetamodel);
        if (result == null) result = caseAbstractMetamodelDeclaration(referencedMetamodel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.LEXER_RULE:
      {
        LexerRule lexerRule = (LexerRule)theEObject;
        T result = caseLexerRule(lexerRule);
        if (result == null) result = caseAbstractRule(lexerRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.PARSER_RULE:
      {
        ParserRule parserRule = (ParserRule)theEObject;
        T result = caseParserRule(parserRule);
        if (result == null) result = caseAbstractRule(parserRule);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.TYPE_REF:
      {
        TypeRef typeRef = (TypeRef)theEObject;
        T result = caseTypeRef(typeRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.ASSIGNMENT:
      {
        Assignment assignment = (Assignment)theEObject;
        T result = caseAssignment(assignment);
        if (result == null) result = caseAbstractElement(assignment);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.ACTION:
      {
        Action action = (Action)theEObject;
        T result = caseAction(action);
        if (result == null) result = caseAbstractElement(action);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.ABSTRACT_NEGATED_TOKEN:
      {
        AbstractNegatedToken abstractNegatedToken = (AbstractNegatedToken)theEObject;
        T result = caseAbstractNegatedToken(abstractNegatedToken);
        if (result == null) result = caseAbstractElement(abstractNegatedToken);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.NEGATED_TOKEN:
      {
        NegatedToken negatedToken = (NegatedToken)theEObject;
        T result = caseNegatedToken(negatedToken);
        if (result == null) result = caseAbstractNegatedToken(negatedToken);
        if (result == null) result = caseAbstractElement(negatedToken);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.UP_TO_TOKEN:
      {
        UpToToken upToToken = (UpToToken)theEObject;
        T result = caseUpToToken(upToToken);
        if (result == null) result = caseAbstractNegatedToken(upToToken);
        if (result == null) result = caseAbstractElement(upToToken);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.WILDCARD:
      {
        Wildcard wildcard = (Wildcard)theEObject;
        T result = caseWildcard(wildcard);
        if (result == null) result = caseAbstractElement(wildcard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.CROSS_REFERENCE:
      {
        CrossReference crossReference = (CrossReference)theEObject;
        T result = caseCrossReference(crossReference);
        if (result == null) result = caseAbstractElement(crossReference);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.KEYWORD:
      {
        Keyword keyword = (Keyword)theEObject;
        T result = caseKeyword(keyword);
        if (result == null) result = caseAbstractElement(keyword);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.RULE_CALL:
      {
        RuleCall ruleCall = (RuleCall)theEObject;
        T result = caseRuleCall(ruleCall);
        if (result == null) result = caseAbstractElement(ruleCall);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.ALTERNATIVES:
      {
        Alternatives alternatives = (Alternatives)theEObject;
        T result = caseAlternatives(alternatives);
        if (result == null) result = caseAbstractElement(alternatives);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.GROUP:
      {
        Group group = (Group)theEObject;
        T result = caseGroup(group);
        if (result == null) result = caseAbstractElement(group);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case XtextTestPackage.CHARACTER_RANGE:
      {
        CharacterRange characterRange = (CharacterRange)theEObject;
        T result = caseCharacterRange(characterRange);
        if (result == null) result = caseAbstractElement(characterRange);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Grammar</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Grammar</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGrammar(Grammar object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractRule(AbstractRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Metamodel Declaration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Metamodel Declaration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractMetamodelDeclaration(AbstractMetamodelDeclaration object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Generated Metamodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Generated Metamodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGeneratedMetamodel(GeneratedMetamodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referenced Metamodel</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenced Metamodel</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferencedMetamodel(ReferencedMetamodel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Lexer Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Lexer Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLexerRule(LexerRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parser Rule</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parser Rule</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParserRule(ParserRule object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeRef(TypeRef object)
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
   * Returns the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignment(Assignment object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Action</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAction(Action object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Negated Token</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Negated Token</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractNegatedToken(AbstractNegatedToken object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Negated Token</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Negated Token</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNegatedToken(NegatedToken object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Up To Token</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Up To Token</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseUpToToken(UpToToken object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcard(Wildcard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Cross Reference</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Cross Reference</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCrossReference(CrossReference object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Keyword</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Keyword</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKeyword(Keyword object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Rule Call</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Rule Call</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRuleCall(RuleCall object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Alternatives</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Alternatives</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlternatives(Alternatives object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Group</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Group</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGroup(Group object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Character Range</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Character Range</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCharacterRange(CharacterRange object)
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

} //XtextTestSwitch
