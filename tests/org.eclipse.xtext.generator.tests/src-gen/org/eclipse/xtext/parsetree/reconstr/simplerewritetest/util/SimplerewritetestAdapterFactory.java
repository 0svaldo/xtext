/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimplerewritetestAdapterFactory.java,v 1.4 2009/02/19 16:27:15 sefftinge Exp $
 */
package org.eclipse.xtext.parsetree.reconstr.simplerewritetest.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Atom;
import org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Expression;
import org.eclipse.xtext.parsetree.reconstr.simplerewritetest.ManyStrings;
import org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Op;
import org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Ref2;
import org.eclipse.xtext.parsetree.reconstr.simplerewritetest.SimplerewritetestPackage;
import org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Spare;
import org.eclipse.xtext.parsetree.reconstr.simplerewritetest.TwoNumbers;
import org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Type;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.parsetree.reconstr.simplerewritetest.SimplerewritetestPackage
 * @generated
 */
public class SimplerewritetestAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static SimplerewritetestPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimplerewritetestAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = SimplerewritetestPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimplerewritetestSwitch<Adapter> modelSwitch =
    new SimplerewritetestSwitch<Adapter>()
    {
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseAtom(Atom object)
      {
        return createAtomAdapter();
      }
      @Override
      public Adapter caseTwoNumbers(TwoNumbers object)
      {
        return createTwoNumbersAdapter();
      }
      @Override
      public Adapter caseManyStrings(ManyStrings object)
      {
        return createManyStringsAdapter();
      }
      @Override
      public Adapter caseType(Type object)
      {
        return createTypeAdapter();
      }
      @Override
      public Adapter caseRef2(Ref2 object)
      {
        return createRef2Adapter();
      }
      @Override
      public Adapter caseSpare(Spare object)
      {
        return createSpareAdapter();
      }
      @Override
      public Adapter caseBoolean(org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Boolean object)
      {
        return createBooleanAdapter();
      }
      @Override
      public Adapter caseOp(Op object)
      {
        return createOpAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Atom <em>Atom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Atom
   * @generated
   */
  public Adapter createAtomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.parsetree.reconstr.simplerewritetest.TwoNumbers <em>Two Numbers</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.parsetree.reconstr.simplerewritetest.TwoNumbers
   * @generated
   */
  public Adapter createTwoNumbersAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.parsetree.reconstr.simplerewritetest.ManyStrings <em>Many Strings</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.parsetree.reconstr.simplerewritetest.ManyStrings
   * @generated
   */
  public Adapter createManyStringsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Type
   * @generated
   */
  public Adapter createTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Ref2 <em>Ref2</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Ref2
   * @generated
   */
  public Adapter createRef2Adapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Spare <em>Spare</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Spare
   * @generated
   */
  public Adapter createSpareAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Boolean <em>Boolean</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Boolean
   * @generated
   */
  public Adapter createBooleanAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Op <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.eclipse.xtext.parsetree.reconstr.simplerewritetest.Op
   * @generated
   */
  public Adapter createOpAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //SimplerewritetestAdapterFactory
