/**
 * <copyright>
 * </copyright>
 *
 * $Id: AmetamodelFactoryImpl.java,v 1.2 2009/05/05 15:32:30 sefftinge Exp $
 */
package org.eclipse.xtext.grammarinheritance.ametamodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.xtext.grammarinheritance.ametamodel.AModel;
import org.eclipse.xtext.grammarinheritance.ametamodel.AType;
import org.eclipse.xtext.grammarinheritance.ametamodel.AmetamodelFactory;
import org.eclipse.xtext.grammarinheritance.ametamodel.AmetamodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AmetamodelFactoryImpl extends EFactoryImpl implements AmetamodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmetamodelFactory init() {
		try {
			AmetamodelFactory theAmetamodelFactory = (AmetamodelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/xtext/tests/grammarinheritance"); 
			if (theAmetamodelFactory != null) {
				return theAmetamodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new AmetamodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmetamodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case AmetamodelPackage.ATYPE: return createAType();
			case AmetamodelPackage.AMODEL: return createAModel();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AType createAType() {
		ATypeImpl aType = new ATypeImpl();
		return aType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AModel createAModel() {
		AModelImpl aModel = new AModelImpl();
		return aModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmetamodelPackage getAmetamodelPackage() {
		return (AmetamodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static AmetamodelPackage getPackage() {
		return AmetamodelPackage.eINSTANCE;
	}

} //AmetamodelFactoryImpl
