/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtext.crossrefs.lazy.lazyLinking;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.LazyLinkingFactory
 * @model kind="package"
 * @generated
 */
public interface LazyLinkingPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "lazyLinking";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://eclipse.org/xtext/lazyLinkingTestLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "lazyLinking";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  LazyLinkingPackage eINSTANCE = org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.LazyLinkingPackageImpl.init();

  /**
   * The meta object id for the '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.ModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.ModelImpl
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.LazyLinkingPackageImpl#getModel()
   * @generated
   */
  int MODEL = 0;

  /**
   * The feature id for the '<em><b>Types</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL__TYPES = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.TypeImpl <em>Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.TypeImpl
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.LazyLinkingPackageImpl#getType()
   * @generated
   */
  int TYPE = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__EXTENDS = 1;

  /**
   * The feature id for the '<em><b>Parent Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__PARENT_ID = 2;

  /**
   * The feature id for the '<em><b>Properties</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE__PROPERTIES = 3;

  /**
   * The number of structural features of the '<em>Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.PropertyImpl <em>Property</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.PropertyImpl
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.LazyLinkingPackageImpl#getProperty()
   * @generated
   */
  int PROPERTY = 2;

  /**
   * The feature id for the '<em><b>Type</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__TYPE = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY__NAME = 1;

  /**
   * The number of structural features of the '<em>Property</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PROPERTY_FEATURE_COUNT = 2;


  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.Model <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.Model
   * @generated
   */
  EClass getModel();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.Model#getTypes <em>Types</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Types</em>'.
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.Model#getTypes()
   * @see #getModel()
   * @generated
   */
  EReference getModel_Types();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.Type <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type</em>'.
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.Type
   * @generated
   */
  EClass getType();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.Type#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.Type#getName()
   * @see #getType()
   * @generated
   */
  EAttribute getType_Name();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.Type#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.Type#getExtends()
   * @see #getType()
   * @generated
   */
  EReference getType_Extends();

  /**
   * Returns the meta object for the reference '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.Type#getParentId <em>Parent Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Parent Id</em>'.
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.Type#getParentId()
   * @see #getType()
   * @generated
   */
  EReference getType_ParentId();

  /**
   * Returns the meta object for the containment reference list '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.Type#getProperties <em>Properties</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Properties</em>'.
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.Type#getProperties()
   * @see #getType()
   * @generated
   */
  EReference getType_Properties();

  /**
   * Returns the meta object for class '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.Property <em>Property</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Property</em>'.
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.Property
   * @generated
   */
  EClass getProperty();

  /**
   * Returns the meta object for the reference list '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.Property#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Type</em>'.
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.Property#getType()
   * @see #getProperty()
   * @generated
   */
  EReference getProperty_Type();

  /**
   * Returns the meta object for the attribute '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.Property#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.Property#getName()
   * @see #getProperty()
   * @generated
   */
  EAttribute getProperty_Name();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  LazyLinkingFactory getLazyLinkingFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.ModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.ModelImpl
     * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.LazyLinkingPackageImpl#getModel()
     * @generated
     */
    EClass MODEL = eINSTANCE.getModel();

    /**
     * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MODEL__TYPES = eINSTANCE.getModel_Types();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.TypeImpl
     * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.LazyLinkingPackageImpl#getType()
     * @generated
     */
    EClass TYPE = eINSTANCE.getType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute TYPE__NAME = eINSTANCE.getType_Name();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__EXTENDS = eINSTANCE.getType_Extends();

    /**
     * The meta object literal for the '<em><b>Parent Id</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__PARENT_ID = eINSTANCE.getType_ParentId();

    /**
     * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE__PROPERTIES = eINSTANCE.getType_Properties();

    /**
     * The meta object literal for the '{@link org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.PropertyImpl
     * @see org.eclipse.xtext.crossrefs.lazy.lazyLinking.impl.LazyLinkingPackageImpl#getProperty()
     * @generated
     */
    EClass PROPERTY = eINSTANCE.getProperty();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PROPERTY__TYPE = eINSTANCE.getProperty_Type();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PROPERTY__NAME = eINSTANCE.getProperty_Name();

  }

} //LazyLinkingPackage
