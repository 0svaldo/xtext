/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimpleTestPackageImpl.java,v 1.3 2009/02/19 14:40:05 sefftinge Exp $
 */
package org.eclipse.xtext.metamodelreferencing.tests.simpleTest.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.xtext.metamodelreferencing.tests.otherTest.OtherTestPackage;

import org.eclipse.xtext.metamodelreferencing.tests.otherTest.impl.OtherTestPackageImpl;

import org.eclipse.xtext.metamodelreferencing.tests.simpleTest.Foo;
import org.eclipse.xtext.metamodelreferencing.tests.simpleTest.SimpleTestFactory;
import org.eclipse.xtext.metamodelreferencing.tests.simpleTest.SimpleTestPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleTestPackageImpl extends EPackageImpl implements SimpleTestPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fooEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.eclipse.xtext.metamodelreferencing.tests.simpleTest.SimpleTestPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private SimpleTestPackageImpl()
  {
    super(eNS_URI, SimpleTestFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this
   * model, and for any others upon which it depends.  Simple
   * dependencies are satisfied by calling this method on all
   * dependent packages before doing anything else.  This method drives
   * initialization for interdependent packages directly, in parallel
   * with this package, itself.
   * <p>Of this package and its interdependencies, all packages which
   * have not yet been registered by their URI values are first created
   * and registered.  The packages are then initialized in two steps:
   * meta-model objects for all of the packages are created before any
   * are initialized, since one package's meta-model objects may refer to
   * those of another.
   * <p>Invocation of this method will not affect any packages that have
   * already been initialized.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static SimpleTestPackage init()
  {
    if (isInited) return (SimpleTestPackage)EPackage.Registry.INSTANCE.getEPackage(SimpleTestPackage.eNS_URI);

    // Obtain or create and register package
    SimpleTestPackageImpl theSimpleTestPackage = (SimpleTestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof SimpleTestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new SimpleTestPackageImpl());

    isInited = true;

    // Obtain or create and register interdependencies
    OtherTestPackageImpl theOtherTestPackage = (OtherTestPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(OtherTestPackage.eNS_URI) instanceof OtherTestPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(OtherTestPackage.eNS_URI) : OtherTestPackage.eINSTANCE);

    // Create package meta-data objects
    theSimpleTestPackage.createPackageContents();
    theOtherTestPackage.createPackageContents();

    // Initialize created meta-data
    theSimpleTestPackage.initializePackageContents();
    theOtherTestPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theSimpleTestPackage.freeze();

    return theSimpleTestPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFoo()
  {
    return fooEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFoo_Name()
  {
    return (EAttribute)fooEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFoo_NameRefs()
  {
    return (EReference)fooEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleTestFactory getSimpleTestFactory()
  {
    return (SimpleTestFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    fooEClass = createEClass(FOO);
    createEAttribute(fooEClass, FOO__NAME);
    createEReference(fooEClass, FOO__NAME_REFS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    OtherTestPackage theOtherTestPackage = (OtherTestPackage)EPackage.Registry.INSTANCE.getEPackage(OtherTestPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes

    // Initialize classes and features; add operations and parameters
    initEClass(fooEClass, Foo.class, "Foo", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getFoo_Name(), ecorePackage.getEString(), "name", null, 0, 1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFoo_NameRefs(), theOtherTestPackage.getFooBar(), null, "nameRefs", null, 0, -1, Foo.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //SimpleTestPackageImpl
