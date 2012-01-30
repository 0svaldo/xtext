/**
 * <copyright>
 * </copyright>
 *
 */
package org.eclipse.xtend.core.xtend;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Xtend Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.xtend.core.xtend.XtendMember#getAnnotationInfo <em>Annotation Info</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.xtend.core.xtend.Xtend2Package#getXtendMember()
 * @model
 * @generated
 */
public interface XtendMember extends XtendAnnotationTarget
{
	/**
	 * Returns the value of the '<em><b>Annotation Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Annotation Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation Info</em>' containment reference.
	 * @see #setAnnotationInfo(XtendAnnotationTarget)
	 * @see org.eclipse.xtend.core.xtend.Xtend2Package#getXtendMember_AnnotationInfo()
	 * @model containment="true"
	 * @generated
	 */
	XtendAnnotationTarget getAnnotationInfo();

	/**
	 * Sets the value of the '{@link org.eclipse.xtend.core.xtend.XtendMember#getAnnotationInfo <em>Annotation Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation Info</em>' containment reference.
	 * @see #getAnnotationInfo()
	 * @generated
	 */
	void setAnnotationInfo(XtendAnnotationTarget value);

} // XtendMember
