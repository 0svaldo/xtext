/**
 */
package org.eclipse.xtend.core.xtend;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.xtext.xbase.XbasePackage;

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
 * @see org.eclipse.xtend.core.xtend.XtendFactory
 * @model kind="package"
 * @generated
 */
public interface XtendPackage extends EPackage
{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "xtend";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/xtend";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "xtend";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	XtendPackage eINSTANCE = org.eclipse.xtend.core.xtend.impl.XtendPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.XtendFileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.XtendFileImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendFile()
	 * @generated
	 */
	int XTEND_FILE = 0;

	/**
	 * The feature id for the '<em><b>Imports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FILE__IMPORTS = 0;

	/**
	 * The feature id for the '<em><b>Xtend Classes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FILE__XTEND_CLASSES = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FILE__PACKAGE = 2;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FILE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.XtendImportImpl <em>Import</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.XtendImportImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendImport()
	 * @generated
	 */
	int XTEND_IMPORT = 1;

	/**
	 * The feature id for the '<em><b>Imported Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_IMPORT__IMPORTED_NAMESPACE = 0;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_IMPORT__STATIC = 1;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_IMPORT__EXTENSION = 2;

	/**
	 * The feature id for the '<em><b>Imported Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_IMPORT__IMPORTED_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Import</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_IMPORT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.XtendAnnotationTargetImpl <em>Annotation Target</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.XtendAnnotationTargetImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendAnnotationTarget()
	 * @generated
	 */
	int XTEND_ANNOTATION_TARGET = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_ANNOTATION_TARGET__ANNOTATIONS = 0;

	/**
	 * The number of structural features of the '<em>Annotation Target</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_ANNOTATION_TARGET_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.XtendClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.XtendClassImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendClass()
	 * @generated
	 */
	int XTEND_CLASS = 2;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CLASS__ANNOTATIONS = XTEND_ANNOTATION_TARGET__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CLASS__NAME = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CLASS__ABSTRACT = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Extends</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CLASS__EXTENDS = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Implements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CLASS__IMPLEMENTS = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Super Types</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CLASS__SUPER_TYPES = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Members</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CLASS__MEMBERS = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CLASS__TYPE_PARAMETERS = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CLASS_FEATURE_COUNT = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.XtendMemberImpl <em>Member</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.XtendMemberImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendMember()
	 * @generated
	 */
	int XTEND_MEMBER = 4;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_MEMBER__ANNOTATIONS = XTEND_ANNOTATION_TARGET__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_MEMBER__ANNOTATION_INFO = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Member</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_MEMBER_FEATURE_COUNT = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.XtendFunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.XtendFunctionImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendFunction()
	 * @generated
	 */
	int XTEND_FUNCTION = 5;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FUNCTION__ANNOTATIONS = XTEND_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FUNCTION__ANNOTATION_INFO = XTEND_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FUNCTION__NAME = XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FUNCTION__EXPRESSION = XTEND_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FUNCTION__RETURN_TYPE = XTEND_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FUNCTION__PARAMETERS = XTEND_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Override</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FUNCTION__OVERRIDE = XTEND_MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Dispatch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FUNCTION__DISPATCH = XTEND_MEMBER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Create Extension Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FUNCTION__CREATE_EXTENSION_INFO = XTEND_MEMBER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FUNCTION__TYPE_PARAMETERS = XTEND_MEMBER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FUNCTION__VISIBILITY = XTEND_MEMBER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FUNCTION__STATIC = XTEND_MEMBER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FUNCTION__EXCEPTIONS = XTEND_MEMBER_FEATURE_COUNT + 10;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FUNCTION_FEATURE_COUNT = XTEND_MEMBER_FEATURE_COUNT + 11;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.XtendFieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.XtendFieldImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendField()
	 * @generated
	 */
	int XTEND_FIELD = 6;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FIELD__ANNOTATIONS = XTEND_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FIELD__ANNOTATION_INFO = XTEND_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FIELD__NAME = XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Final</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FIELD__FINAL = XTEND_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FIELD__TYPE = XTEND_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Extension</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FIELD__EXTENSION = XTEND_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FIELD__VISIBILITY = XTEND_MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FIELD__STATIC = XTEND_MEMBER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Initial Value</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FIELD__INITIAL_VALUE = XTEND_MEMBER_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_FIELD_FEATURE_COUNT = XTEND_MEMBER_FEATURE_COUNT + 7;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.XtendParameterImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendParameter()
	 * @generated
	 */
	int XTEND_PARAMETER = 7;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_PARAMETER__ANNOTATIONS = XTEND_ANNOTATION_TARGET__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_PARAMETER__NAME = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parameter Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_PARAMETER__PARAMETER_TYPE = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Var Arg</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_PARAMETER__VAR_ARG = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_PARAMETER_FEATURE_COUNT = XTEND_ANNOTATION_TARGET_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.RichStringImpl <em>Rich String</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.RichStringImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getRichString()
	 * @generated
	 */
	int RICH_STRING = 8;

	/**
	 * The feature id for the '<em><b>Expressions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING__EXPRESSIONS = XbasePackage.XBLOCK_EXPRESSION__EXPRESSIONS;

	/**
	 * The number of structural features of the '<em>Rich String</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FEATURE_COUNT = XbasePackage.XBLOCK_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.RichStringLiteralImpl <em>Rich String Literal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.RichStringLiteralImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getRichStringLiteral()
	 * @generated
	 */
	int RICH_STRING_LITERAL = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_LITERAL__VALUE = XbasePackage.XSTRING_LITERAL__VALUE;

	/**
	 * The number of structural features of the '<em>Rich String Literal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_LITERAL_FEATURE_COUNT = XbasePackage.XSTRING_LITERAL_FEATURE_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.RichStringForLoopImpl <em>Rich String For Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.RichStringForLoopImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getRichStringForLoop()
	 * @generated
	 */
	int RICH_STRING_FOR_LOOP = 10;

	/**
	 * The feature id for the '<em><b>For Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__FOR_EXPRESSION = XbasePackage.XFOR_LOOP_EXPRESSION__FOR_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Each Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__EACH_EXPRESSION = XbasePackage.XFOR_LOOP_EXPRESSION__EACH_EXPRESSION;

	/**
	 * The feature id for the '<em><b>Declared Param</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__DECLARED_PARAM = XbasePackage.XFOR_LOOP_EXPRESSION__DECLARED_PARAM;

	/**
	 * The feature id for the '<em><b>Separator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__SEPARATOR = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Before</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__BEFORE = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>After</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP__AFTER = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Rich String For Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_FOR_LOOP_FEATURE_COUNT = XbasePackage.XFOR_LOOP_EXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl <em>Rich String If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.RichStringIfImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getRichStringIf()
	 * @generated
	 */
	int RICH_STRING_IF = 11;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__IF = XbasePackage.XEXPRESSION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__THEN = XbasePackage.XEXPRESSION_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Else Ifs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__ELSE_IFS = XbasePackage.XEXPRESSION_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Else</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF__ELSE = XbasePackage.XEXPRESSION_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Rich String If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_IF_FEATURE_COUNT = XbasePackage.XEXPRESSION_FEATURE_COUNT + 4;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.RichStringElseIfImpl <em>Rich String Else If</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.RichStringElseIfImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getRichStringElseIf()
	 * @generated
	 */
	int RICH_STRING_ELSE_IF = 12;

	/**
	 * The feature id for the '<em><b>If</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ELSE_IF__IF = 0;

	/**
	 * The feature id for the '<em><b>Then</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ELSE_IF__THEN = 1;

	/**
	 * The number of structural features of the '<em>Rich String Else If</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RICH_STRING_ELSE_IF_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.CreateExtensionInfoImpl <em>Create Extension Info</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.CreateExtensionInfoImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getCreateExtensionInfo()
	 * @generated
	 */
	int CREATE_EXTENSION_INFO = 13;

	/**
	 * The feature id for the '<em><b>Create Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_INFO__CREATE_EXPRESSION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_INFO__NAME = 1;

	/**
	 * The number of structural features of the '<em>Create Extension Info</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CREATE_EXTENSION_INFO_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.xtend.core.xtend.impl.XtendConstructorImpl <em>Constructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.xtend.core.xtend.impl.XtendConstructorImpl
	 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendConstructor()
	 * @generated
	 */
	int XTEND_CONSTRUCTOR = 14;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CONSTRUCTOR__ANNOTATIONS = XTEND_MEMBER__ANNOTATIONS;

	/**
	 * The feature id for the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CONSTRUCTOR__ANNOTATION_INFO = XTEND_MEMBER__ANNOTATION_INFO;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CONSTRUCTOR__NAME = XTEND_MEMBER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CONSTRUCTOR__EXPRESSION = XTEND_MEMBER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CONSTRUCTOR__PARAMETERS = XTEND_MEMBER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CONSTRUCTOR__TYPE_PARAMETERS = XTEND_MEMBER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CONSTRUCTOR__VISIBILITY = XTEND_MEMBER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exceptions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CONSTRUCTOR__EXCEPTIONS = XTEND_MEMBER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Constructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int XTEND_CONSTRUCTOR_FEATURE_COUNT = XTEND_MEMBER_FEATURE_COUNT + 6;


	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFile
	 * @generated
	 */
	EClass getXtendFile();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendFile#getImports <em>Imports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imports</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFile#getImports()
	 * @see #getXtendFile()
	 * @generated
	 */
	EReference getXtendFile_Imports();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendFile#getXtendClasses <em>Xtend Classes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Xtend Classes</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFile#getXtendClasses()
	 * @see #getXtendFile()
	 * @generated
	 */
	EReference getXtendFile_XtendClasses();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendFile#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFile#getPackage()
	 * @see #getXtendFile()
	 * @generated
	 */
	EAttribute getXtendFile_Package();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendImport <em>Import</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Import</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendImport
	 * @generated
	 */
	EClass getXtendImport();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendImport#getImportedNamespace <em>Imported Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Imported Namespace</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendImport#getImportedNamespace()
	 * @see #getXtendImport()
	 * @generated
	 */
	EAttribute getXtendImport_ImportedNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendImport#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendImport#isStatic()
	 * @see #getXtendImport()
	 * @generated
	 */
	EAttribute getXtendImport_Static();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendImport#isExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendImport#isExtension()
	 * @see #getXtendImport()
	 * @generated
	 */
	EAttribute getXtendImport_Extension();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.xtend.core.xtend.XtendImport#getImportedType <em>Imported Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Imported Type</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendImport#getImportedType()
	 * @see #getXtendImport()
	 * @generated
	 */
	EReference getXtendImport_ImportedType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendClass <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendClass
	 * @generated
	 */
	EClass getXtendClass();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendClass#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendClass#getName()
	 * @see #getXtendClass()
	 * @generated
	 */
	EAttribute getXtendClass_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendClass#isAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Abstract</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendClass#isAbstract()
	 * @see #getXtendClass()
	 * @generated
	 */
	EAttribute getXtendClass_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendClass#getExtends <em>Extends</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Extends</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendClass#getExtends()
	 * @see #getXtendClass()
	 * @generated
	 */
	EReference getXtendClass_Extends();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendClass#getImplements <em>Implements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Implements</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendClass#getImplements()
	 * @see #getXtendClass()
	 * @generated
	 */
	EReference getXtendClass_Implements();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.xtend.core.xtend.XtendClass#getSuperTypes <em>Super Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Super Types</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendClass#getSuperTypes()
	 * @see #getXtendClass()
	 * @generated
	 */
	EReference getXtendClass_SuperTypes();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendClass#getMembers <em>Members</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Members</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendClass#getMembers()
	 * @see #getXtendClass()
	 * @generated
	 */
	EReference getXtendClass_Members();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendClass#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendClass#getTypeParameters()
	 * @see #getXtendClass()
	 * @generated
	 */
	EReference getXtendClass_TypeParameters();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendAnnotationTarget <em>Annotation Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation Target</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendAnnotationTarget
	 * @generated
	 */
	EClass getXtendAnnotationTarget();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendAnnotationTarget#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Annotations</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendAnnotationTarget#getAnnotations()
	 * @see #getXtendAnnotationTarget()
	 * @generated
	 */
	EReference getXtendAnnotationTarget_Annotations();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendMember <em>Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Member</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendMember
	 * @generated
	 */
	EClass getXtendMember();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendMember#getAnnotationInfo <em>Annotation Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Annotation Info</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendMember#getAnnotationInfo()
	 * @see #getXtendMember()
	 * @generated
	 */
	EReference getXtendMember_AnnotationInfo();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction
	 * @generated
	 */
	EClass getXtendFunction();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendFunction#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction#getName()
	 * @see #getXtendFunction()
	 * @generated
	 */
	EAttribute getXtendFunction_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendFunction#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction#getExpression()
	 * @see #getXtendFunction()
	 * @generated
	 */
	EReference getXtendFunction_Expression();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendFunction#getReturnType <em>Return Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Return Type</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction#getReturnType()
	 * @see #getXtendFunction()
	 * @generated
	 */
	EReference getXtendFunction_ReturnType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendFunction#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction#getParameters()
	 * @see #getXtendFunction()
	 * @generated
	 */
	EReference getXtendFunction_Parameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendFunction#isOverride <em>Override</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Override</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction#isOverride()
	 * @see #getXtendFunction()
	 * @generated
	 */
	EAttribute getXtendFunction_Override();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendFunction#isDispatch <em>Dispatch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dispatch</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction#isDispatch()
	 * @see #getXtendFunction()
	 * @generated
	 */
	EAttribute getXtendFunction_Dispatch();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendFunction#getCreateExtensionInfo <em>Create Extension Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Extension Info</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction#getCreateExtensionInfo()
	 * @see #getXtendFunction()
	 * @generated
	 */
	EReference getXtendFunction_CreateExtensionInfo();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendFunction#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction#getTypeParameters()
	 * @see #getXtendFunction()
	 * @generated
	 */
	EReference getXtendFunction_TypeParameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendFunction#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction#getVisibility()
	 * @see #getXtendFunction()
	 * @generated
	 */
	EAttribute getXtendFunction_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendFunction#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction#isStatic()
	 * @see #getXtendFunction()
	 * @generated
	 */
	EAttribute getXtendFunction_Static();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendFunction#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendFunction#getExceptions()
	 * @see #getXtendFunction()
	 * @generated
	 */
	EReference getXtendFunction_Exceptions();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendField
	 * @generated
	 */
	EClass getXtendField();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendField#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendField#getName()
	 * @see #getXtendField()
	 * @generated
	 */
	EAttribute getXtendField_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendField#isFinal <em>Final</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Final</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendField#isFinal()
	 * @see #getXtendField()
	 * @generated
	 */
	EAttribute getXtendField_Final();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Type</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendField#getType()
	 * @see #getXtendField()
	 * @generated
	 */
	EReference getXtendField_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendField#isExtension <em>Extension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Extension</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendField#isExtension()
	 * @see #getXtendField()
	 * @generated
	 */
	EAttribute getXtendField_Extension();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendField#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendField#getVisibility()
	 * @see #getXtendField()
	 * @generated
	 */
	EAttribute getXtendField_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendField#isStatic <em>Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Static</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendField#isStatic()
	 * @see #getXtendField()
	 * @generated
	 */
	EAttribute getXtendField_Static();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendField#getInitialValue <em>Initial Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Initial Value</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendField#getInitialValue()
	 * @see #getXtendField()
	 * @generated
	 */
	EReference getXtendField_InitialValue();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendParameter
	 * @generated
	 */
	EClass getXtendParameter();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendParameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendParameter#getName()
	 * @see #getXtendParameter()
	 * @generated
	 */
	EAttribute getXtendParameter_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendParameter#getParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter Type</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendParameter#getParameterType()
	 * @see #getXtendParameter()
	 * @generated
	 */
	EReference getXtendParameter_ParameterType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendParameter#isVarArg <em>Var Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Var Arg</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendParameter#isVarArg()
	 * @see #getXtendParameter()
	 * @generated
	 */
	EAttribute getXtendParameter_VarArg();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.RichString <em>Rich String</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichString
	 * @generated
	 */
	EClass getRichString();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.RichStringLiteral <em>Rich String Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String Literal</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringLiteral
	 * @generated
	 */
	EClass getRichStringLiteral();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.RichStringForLoop <em>Rich String For Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String For Loop</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringForLoop
	 * @generated
	 */
	EClass getRichStringForLoop();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getSeparator <em>Separator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Separator</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringForLoop#getSeparator()
	 * @see #getRichStringForLoop()
	 * @generated
	 */
	EReference getRichStringForLoop_Separator();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getBefore <em>Before</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Before</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringForLoop#getBefore()
	 * @see #getRichStringForLoop()
	 * @generated
	 */
	EReference getRichStringForLoop_Before();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringForLoop#getAfter <em>After</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>After</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringForLoop#getAfter()
	 * @see #getRichStringForLoop()
	 * @generated
	 */
	EReference getRichStringForLoop_After();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.RichStringIf <em>Rich String If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String If</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringIf
	 * @generated
	 */
	EClass getRichStringIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringIf#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringIf#getIf()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringIf#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringIf#getThen()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_Then();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.RichStringIf#getElseIfs <em>Else Ifs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Else Ifs</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringIf#getElseIfs()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_ElseIfs();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringIf#getElse <em>Else</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Else</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringIf#getElse()
	 * @see #getRichStringIf()
	 * @generated
	 */
	EReference getRichStringIf_Else();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.RichStringElseIf <em>Rich String Else If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rich String Else If</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringElseIf
	 * @generated
	 */
	EClass getRichStringElseIf();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringElseIf#getIf <em>If</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>If</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringElseIf#getIf()
	 * @see #getRichStringElseIf()
	 * @generated
	 */
	EReference getRichStringElseIf_If();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.RichStringElseIf#getThen <em>Then</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Then</em>'.
	 * @see org.eclipse.xtend.core.xtend.RichStringElseIf#getThen()
	 * @see #getRichStringElseIf()
	 * @generated
	 */
	EReference getRichStringElseIf_Then();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.CreateExtensionInfo <em>Create Extension Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Create Extension Info</em>'.
	 * @see org.eclipse.xtend.core.xtend.CreateExtensionInfo
	 * @generated
	 */
	EClass getCreateExtensionInfo();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.CreateExtensionInfo#getCreateExpression <em>Create Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Create Expression</em>'.
	 * @see org.eclipse.xtend.core.xtend.CreateExtensionInfo#getCreateExpression()
	 * @see #getCreateExtensionInfo()
	 * @generated
	 */
	EReference getCreateExtensionInfo_CreateExpression();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.CreateExtensionInfo#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.core.xtend.CreateExtensionInfo#getName()
	 * @see #getCreateExtensionInfo()
	 * @generated
	 */
	EAttribute getCreateExtensionInfo_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.xtend.core.xtend.XtendConstructor <em>Constructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constructor</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendConstructor
	 * @generated
	 */
	EClass getXtendConstructor();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendConstructor#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendConstructor#getName()
	 * @see #getXtendConstructor()
	 * @generated
	 */
	EAttribute getXtendConstructor_Name();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.xtend.core.xtend.XtendConstructor#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Expression</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendConstructor#getExpression()
	 * @see #getXtendConstructor()
	 * @generated
	 */
	EReference getXtendConstructor_Expression();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendConstructor#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameters</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendConstructor#getParameters()
	 * @see #getXtendConstructor()
	 * @generated
	 */
	EReference getXtendConstructor_Parameters();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendConstructor#getTypeParameters <em>Type Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Type Parameters</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendConstructor#getTypeParameters()
	 * @see #getXtendConstructor()
	 * @generated
	 */
	EReference getXtendConstructor_TypeParameters();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.xtend.core.xtend.XtendConstructor#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendConstructor#getVisibility()
	 * @see #getXtendConstructor()
	 * @generated
	 */
	EAttribute getXtendConstructor_Visibility();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.xtend.core.xtend.XtendConstructor#getExceptions <em>Exceptions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exceptions</em>'.
	 * @see org.eclipse.xtend.core.xtend.XtendConstructor#getExceptions()
	 * @see #getXtendConstructor()
	 * @generated
	 */
	EReference getXtendConstructor_Exceptions();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	XtendFactory getXtendFactory();

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
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.XtendFileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.XtendFileImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendFile()
		 * @generated
		 */
		EClass XTEND_FILE = eINSTANCE.getXtendFile();

		/**
		 * The meta object literal for the '<em><b>Imports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_FILE__IMPORTS = eINSTANCE.getXtendFile_Imports();

		/**
		 * The meta object literal for the '<em><b>Xtend Classes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_FILE__XTEND_CLASSES = eINSTANCE.getXtendFile_XtendClasses();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_FILE__PACKAGE = eINSTANCE.getXtendFile_Package();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.XtendImportImpl <em>Import</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.XtendImportImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendImport()
		 * @generated
		 */
		EClass XTEND_IMPORT = eINSTANCE.getXtendImport();

		/**
		 * The meta object literal for the '<em><b>Imported Namespace</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_IMPORT__IMPORTED_NAMESPACE = eINSTANCE.getXtendImport_ImportedNamespace();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_IMPORT__STATIC = eINSTANCE.getXtendImport_Static();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_IMPORT__EXTENSION = eINSTANCE.getXtendImport_Extension();

		/**
		 * The meta object literal for the '<em><b>Imported Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_IMPORT__IMPORTED_TYPE = eINSTANCE.getXtendImport_ImportedType();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.XtendClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.XtendClassImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendClass()
		 * @generated
		 */
		EClass XTEND_CLASS = eINSTANCE.getXtendClass();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_CLASS__NAME = eINSTANCE.getXtendClass_Name();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_CLASS__ABSTRACT = eINSTANCE.getXtendClass_Abstract();

		/**
		 * The meta object literal for the '<em><b>Extends</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_CLASS__EXTENDS = eINSTANCE.getXtendClass_Extends();

		/**
		 * The meta object literal for the '<em><b>Implements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_CLASS__IMPLEMENTS = eINSTANCE.getXtendClass_Implements();

		/**
		 * The meta object literal for the '<em><b>Super Types</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_CLASS__SUPER_TYPES = eINSTANCE.getXtendClass_SuperTypes();

		/**
		 * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_CLASS__MEMBERS = eINSTANCE.getXtendClass_Members();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_CLASS__TYPE_PARAMETERS = eINSTANCE.getXtendClass_TypeParameters();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.XtendAnnotationTargetImpl <em>Annotation Target</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.XtendAnnotationTargetImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendAnnotationTarget()
		 * @generated
		 */
		EClass XTEND_ANNOTATION_TARGET = eINSTANCE.getXtendAnnotationTarget();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_ANNOTATION_TARGET__ANNOTATIONS = eINSTANCE.getXtendAnnotationTarget_Annotations();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.XtendMemberImpl <em>Member</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.XtendMemberImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendMember()
		 * @generated
		 */
		EClass XTEND_MEMBER = eINSTANCE.getXtendMember();

		/**
		 * The meta object literal for the '<em><b>Annotation Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_MEMBER__ANNOTATION_INFO = eINSTANCE.getXtendMember_AnnotationInfo();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.XtendFunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.XtendFunctionImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendFunction()
		 * @generated
		 */
		EClass XTEND_FUNCTION = eINSTANCE.getXtendFunction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_FUNCTION__NAME = eINSTANCE.getXtendFunction_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_FUNCTION__EXPRESSION = eINSTANCE.getXtendFunction_Expression();

		/**
		 * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_FUNCTION__RETURN_TYPE = eINSTANCE.getXtendFunction_ReturnType();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_FUNCTION__PARAMETERS = eINSTANCE.getXtendFunction_Parameters();

		/**
		 * The meta object literal for the '<em><b>Override</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_FUNCTION__OVERRIDE = eINSTANCE.getXtendFunction_Override();

		/**
		 * The meta object literal for the '<em><b>Dispatch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_FUNCTION__DISPATCH = eINSTANCE.getXtendFunction_Dispatch();

		/**
		 * The meta object literal for the '<em><b>Create Extension Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_FUNCTION__CREATE_EXTENSION_INFO = eINSTANCE.getXtendFunction_CreateExtensionInfo();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_FUNCTION__TYPE_PARAMETERS = eINSTANCE.getXtendFunction_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_FUNCTION__VISIBILITY = eINSTANCE.getXtendFunction_Visibility();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_FUNCTION__STATIC = eINSTANCE.getXtendFunction_Static();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_FUNCTION__EXCEPTIONS = eINSTANCE.getXtendFunction_Exceptions();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.XtendFieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.XtendFieldImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendField()
		 * @generated
		 */
		EClass XTEND_FIELD = eINSTANCE.getXtendField();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_FIELD__NAME = eINSTANCE.getXtendField_Name();

		/**
		 * The meta object literal for the '<em><b>Final</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_FIELD__FINAL = eINSTANCE.getXtendField_Final();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_FIELD__TYPE = eINSTANCE.getXtendField_Type();

		/**
		 * The meta object literal for the '<em><b>Extension</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_FIELD__EXTENSION = eINSTANCE.getXtendField_Extension();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_FIELD__VISIBILITY = eINSTANCE.getXtendField_Visibility();

		/**
		 * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_FIELD__STATIC = eINSTANCE.getXtendField_Static();

		/**
		 * The meta object literal for the '<em><b>Initial Value</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_FIELD__INITIAL_VALUE = eINSTANCE.getXtendField_InitialValue();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.XtendParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.XtendParameterImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendParameter()
		 * @generated
		 */
		EClass XTEND_PARAMETER = eINSTANCE.getXtendParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_PARAMETER__NAME = eINSTANCE.getXtendParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Parameter Type</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_PARAMETER__PARAMETER_TYPE = eINSTANCE.getXtendParameter_ParameterType();

		/**
		 * The meta object literal for the '<em><b>Var Arg</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_PARAMETER__VAR_ARG = eINSTANCE.getXtendParameter_VarArg();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.RichStringImpl <em>Rich String</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.RichStringImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getRichString()
		 * @generated
		 */
		EClass RICH_STRING = eINSTANCE.getRichString();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.RichStringLiteralImpl <em>Rich String Literal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.RichStringLiteralImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getRichStringLiteral()
		 * @generated
		 */
		EClass RICH_STRING_LITERAL = eINSTANCE.getRichStringLiteral();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.RichStringForLoopImpl <em>Rich String For Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.RichStringForLoopImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getRichStringForLoop()
		 * @generated
		 */
		EClass RICH_STRING_FOR_LOOP = eINSTANCE.getRichStringForLoop();

		/**
		 * The meta object literal for the '<em><b>Separator</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_FOR_LOOP__SEPARATOR = eINSTANCE.getRichStringForLoop_Separator();

		/**
		 * The meta object literal for the '<em><b>Before</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_FOR_LOOP__BEFORE = eINSTANCE.getRichStringForLoop_Before();

		/**
		 * The meta object literal for the '<em><b>After</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_FOR_LOOP__AFTER = eINSTANCE.getRichStringForLoop_After();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.RichStringIfImpl <em>Rich String If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.RichStringIfImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getRichStringIf()
		 * @generated
		 */
		EClass RICH_STRING_IF = eINSTANCE.getRichStringIf();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_IF__IF = eINSTANCE.getRichStringIf_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_IF__THEN = eINSTANCE.getRichStringIf_Then();

		/**
		 * The meta object literal for the '<em><b>Else Ifs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_IF__ELSE_IFS = eINSTANCE.getRichStringIf_ElseIfs();

		/**
		 * The meta object literal for the '<em><b>Else</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_IF__ELSE = eINSTANCE.getRichStringIf_Else();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.RichStringElseIfImpl <em>Rich String Else If</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.RichStringElseIfImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getRichStringElseIf()
		 * @generated
		 */
		EClass RICH_STRING_ELSE_IF = eINSTANCE.getRichStringElseIf();

		/**
		 * The meta object literal for the '<em><b>If</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_ELSE_IF__IF = eINSTANCE.getRichStringElseIf_If();

		/**
		 * The meta object literal for the '<em><b>Then</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RICH_STRING_ELSE_IF__THEN = eINSTANCE.getRichStringElseIf_Then();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.CreateExtensionInfoImpl <em>Create Extension Info</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.CreateExtensionInfoImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getCreateExtensionInfo()
		 * @generated
		 */
		EClass CREATE_EXTENSION_INFO = eINSTANCE.getCreateExtensionInfo();

		/**
		 * The meta object literal for the '<em><b>Create Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CREATE_EXTENSION_INFO__CREATE_EXPRESSION = eINSTANCE.getCreateExtensionInfo_CreateExpression();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CREATE_EXTENSION_INFO__NAME = eINSTANCE.getCreateExtensionInfo_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.xtend.core.xtend.impl.XtendConstructorImpl <em>Constructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.xtend.core.xtend.impl.XtendConstructorImpl
		 * @see org.eclipse.xtend.core.xtend.impl.XtendPackageImpl#getXtendConstructor()
		 * @generated
		 */
		EClass XTEND_CONSTRUCTOR = eINSTANCE.getXtendConstructor();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_CONSTRUCTOR__NAME = eINSTANCE.getXtendConstructor_Name();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_CONSTRUCTOR__EXPRESSION = eINSTANCE.getXtendConstructor_Expression();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_CONSTRUCTOR__PARAMETERS = eINSTANCE.getXtendConstructor_Parameters();

		/**
		 * The meta object literal for the '<em><b>Type Parameters</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_CONSTRUCTOR__TYPE_PARAMETERS = eINSTANCE.getXtendConstructor_TypeParameters();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute XTEND_CONSTRUCTOR__VISIBILITY = eINSTANCE.getXtendConstructor_Visibility();

		/**
		 * The meta object literal for the '<em><b>Exceptions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference XTEND_CONSTRUCTOR__EXCEPTIONS = eINSTANCE.getXtendConstructor_Exceptions();

	}

} //XtendPackage
