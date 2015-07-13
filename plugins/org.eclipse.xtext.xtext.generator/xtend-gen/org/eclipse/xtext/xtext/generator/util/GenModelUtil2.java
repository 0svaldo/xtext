/**
 * Copyright (c) 2011 itemis AG (http://www.itemis.eu) and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package org.eclipse.xtext.xtext.generator.util;

import com.google.common.base.Objects;
import java.util.Map;
import org.eclipse.emf.codegen.ecore.genmodel.GenClass;
import org.eclipse.emf.codegen.ecore.genmodel.GenClassifier;
import org.eclipse.emf.codegen.ecore.genmodel.GenDataType;
import org.eclipse.emf.codegen.ecore.genmodel.GenEnum;
import org.eclipse.emf.codegen.ecore.genmodel.GenFeature;
import org.eclipse.emf.codegen.ecore.genmodel.GenModel;
import org.eclipse.emf.codegen.ecore.genmodel.GenPackage;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend2.lib.StringConcatenation;

@SuppressWarnings("all")
public class GenModelUtil2 {
  public static GenClass getGenClass(final EClass cls, final ResourceSet resourceSet) {
    GenClassifier _genClassifier = GenModelUtil2.getGenClassifier(cls, resourceSet);
    return ((GenClass) _genClassifier);
  }
  
  public static GenClassifier getGenClassifier(final EClassifier cls, final ResourceSet resourceSet) {
    EPackage _ePackage = cls.getEPackage();
    final GenPackage genPackage = GenModelUtil2.getGenPackage(_ePackage, resourceSet);
    EList<GenClassifier> _genClassifiers = genPackage.getGenClassifiers();
    for (final GenClassifier genCls : _genClassifiers) {
      String _name = cls.getName();
      EClassifier _ecoreClassifier = genCls.getEcoreClassifier();
      String _name_1 = _ecoreClassifier.getName();
      boolean _equals = Objects.equal(_name, _name_1);
      if (_equals) {
        return genCls;
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("No GenClassifier named \'");
    String _name_2 = cls.getName();
    _builder.append(_name_2, "");
    _builder.append("\' found in GenModel ");
    Resource _eResource = genPackage.eResource();
    URI _uRI = _eResource.getURI();
    _builder.append(_uRI, "");
    throw new RuntimeException(_builder.toString());
  }
  
  public static GenDataType getGenDataType(final EDataType dt, final ResourceSet resourceSet) {
    GenClassifier _genClassifier = GenModelUtil2.getGenClassifier(dt, resourceSet);
    return ((GenDataType) _genClassifier);
  }
  
  public static GenEnum getGenEnum(final EEnum en, final ResourceSet resourceSet) {
    GenClassifier _genClassifier = GenModelUtil2.getGenClassifier(en, resourceSet);
    return ((GenEnum) _genClassifier);
  }
  
  public static GenFeature getGenFeature(final EStructuralFeature feature, final ResourceSet resourceSet) {
    EClass _eContainingClass = feature.getEContainingClass();
    GenClassifier _genClassifier = GenModelUtil2.getGenClassifier(_eContainingClass, resourceSet);
    final GenClass genCls = ((GenClass) _genClassifier);
    EList<GenFeature> _genFeatures = genCls.getGenFeatures();
    for (final GenFeature genFeat : _genFeatures) {
      String _name = feature.getName();
      EStructuralFeature _ecoreFeature = genFeat.getEcoreFeature();
      String _name_1 = _ecoreFeature.getName();
      boolean _equals = Objects.equal(_name, _name_1);
      if (_equals) {
        return genFeat;
      }
    }
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("No GenFeature named \'");
    String _name_2 = feature.getName();
    _builder.append(_name_2, "");
    _builder.append("\' found in GenClass \'");
    _builder.append(genCls, "");
    _builder.append("\' from GenModel");
    Resource _eResource = genCls.eResource();
    URI _uRI = _eResource.getURI();
    _builder.append(_uRI, "");
    throw new RuntimeException(_builder.toString());
  }
  
  public static String getGenIntLiteral(final EClass clazz, final EStructuralFeature feature, final ResourceSet resourceSet) {
    final GenFeature genFeature = GenModelUtil2.getGenFeature(feature, resourceSet);
    final GenClass genClass = GenModelUtil2.getGenClass(clazz, resourceSet);
    GenPackage _genPackage = genClass.getGenPackage();
    String _packageInterfaceName = _genPackage.getPackageInterfaceName();
    String _plus = (_packageInterfaceName + ".");
    String _featureID = genClass.getFeatureID(genFeature);
    return (_plus + _featureID);
  }
  
  public static String getGenIntLiteral(final EClassifier classifier, final ResourceSet resourceSet) {
    final GenClassifier genClassifier = GenModelUtil2.getGenClassifier(classifier, resourceSet);
    GenPackage _genPackage = genClassifier.getGenPackage();
    String _packageInterfaceName = _genPackage.getPackageInterfaceName();
    String _plus = (_packageInterfaceName + ".");
    String _classifierID = genClassifier.getClassifierID();
    return (_plus + _classifierID);
  }
  
  public static GenPackage getGenPackage(final EPackage pkg, final ResourceSet resourceSet) {
    final String nsURI = pkg.getNsURI();
    String location = null;
    Resource _eResource = pkg.eResource();
    URI _uRI = null;
    if (_eResource!=null) {
      _uRI=_eResource.getURI();
    }
    boolean _tripleNotEquals = (_uRI != null);
    if (_tripleNotEquals) {
      Resource _eResource_1 = pkg.eResource();
      URI _uRI_1 = _eResource_1.getURI();
      String _string = _uRI_1.toString();
      location = _string;
    }
    final Resource genModelResource = GenModelUtil2.getGenModelResource(location, nsURI, resourceSet);
    if ((genModelResource != null)) {
      EList<EObject> _contents = genModelResource.getContents();
      for (final EObject model : _contents) {
        if ((model instanceof GenModel)) {
          final GenPackage genPkg = ((GenModel)model).findGenPackage(pkg);
          if ((genPkg != null)) {
            EPackage _ecorePackage = genPkg.getEcorePackage();
            _ecorePackage.getEClassifiers();
            return genPkg;
          }
        }
      }
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("No GenPackage for NsURI ");
      _builder.append(nsURI, "");
      _builder.append(" found in ");
      URI _uRI_2 = genModelResource.getURI();
      _builder.append(_uRI_2, "");
      throw new RuntimeException(_builder.toString());
    }
    StringConcatenation _builder_1 = new StringConcatenation();
    _builder_1.append("No GenPackage for NsURI ");
    _builder_1.append(nsURI, "");
    _builder_1.append(".");
    throw new RuntimeException(_builder_1.toString());
  }
  
  public static Resource getGenModelResource(final String locationInfo, final String nsURI, final ResourceSet resourceSet) {
    Map<String, URI> _ePackageNsURIToGenModelLocationMap = EcorePlugin.getEPackageNsURIToGenModelLocationMap(false);
    final URI genModelURI = _ePackageNsURIToGenModelLocationMap.get(nsURI);
    if ((genModelURI == null)) {
      boolean _equals = EcorePackage.eNS_URI.equals(nsURI);
      if (_equals) {
        return null;
      }
      EList<Resource> _resources = resourceSet.getResources();
      for (final Resource res : _resources) {
        EList<EObject> _contents = res.getContents();
        for (final EObject obj : _contents) {
          if ((obj instanceof GenModel)) {
            EList<GenPackage> _genPackages = ((GenModel)obj).getGenPackages();
            for (final GenPackage genPackage : _genPackages) {
              String _nSURI = genPackage.getNSURI();
              boolean _equals_1 = _nSURI.equals(nsURI);
              if (_equals_1) {
                return genPackage.eResource();
              }
            }
          }
        }
      }
      final StringBuilder buf = new StringBuilder();
      String loc = locationInfo;
      boolean _and = false;
      if (!(loc != null)) {
        _and = false;
      } else {
        int _length = loc.length();
        boolean _greaterThan = (_length > 0);
        _and = _greaterThan;
      }
      if (_and) {
        loc = (" from " + loc);
      } else {
        loc = "";
      }
      StringBuilder _append = buf.append("Could not find a GenModel for EPackage \'");
      StringBuilder _append_1 = _append.append(nsURI);
      StringBuilder _append_2 = _append_1.append("\'");
      StringBuilder _append_3 = _append_2.append(loc);
      _append_3.append("\n");
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("If the missing GenModel has been generated via EMFGeneratorFragment.class.getSimpleName() or org.eclipse.xtext.generator.ecore.EcoreGeneratorFragment.class.getSimpleName()");
      buf.append(_builder);
      buf.append(" make sure to run it first in the workflow.\n");
      StringConcatenation _builder_1 = new StringConcatenation();
      _builder_1.append("If you have a *.genmodel-file, make sure to register it via StandaloneSetup.registerGenModelFile(String)");
      buf.append(_builder_1);
      String _string = buf.toString();
      throw new RuntimeException(_string);
    }
    if ((resourceSet == null)) {
      StringConcatenation _builder_2 = new StringConcatenation();
      _builder_2.append("There is no ResourceSet for EPackage \'");
      _builder_2.append(nsURI, "");
      _builder_2.append("\'. Please make sure the EPackage has been loaded from a .ecore file and not from the generated Java file.");
      throw new RuntimeException(_builder_2.toString());
    }
    final Resource genModelResource = resourceSet.getResource(genModelURI, true);
    if ((genModelResource == null)) {
      StringConcatenation _builder_3 = new StringConcatenation();
      _builder_3.append("Error loading GenModel ");
      _builder_3.append(genModelURI, "");
      throw new RuntimeException(_builder_3.toString());
    }
    EList<EObject> _contents_1 = genModelResource.getContents();
    for (final EObject content : _contents_1) {
      if ((content instanceof GenModel)) {
        ((GenModel)content).reconcile();
      }
    }
    return genModelResource;
  }
  
  public static String getGenTypeLiteral(final EClassifier classifier, final ResourceSet resourceSet) {
    final GenClassifier genClassifier = GenModelUtil2.getGenClassifier(classifier, resourceSet);
    GenPackage _genPackage = genClassifier.getGenPackage();
    String pkg = _genPackage.getPackageInterfaceName();
    GenPackage _genPackage_1 = genClassifier.getGenPackage();
    boolean _isLiteralsInterface = _genPackage_1.isLiteralsInterface();
    if (_isLiteralsInterface) {
      String _classifierID = genClassifier.getClassifierID();
      return ((pkg + ".Literals.") + _classifierID);
    } else {
      String _classifierAccessorName = genClassifier.getClassifierAccessorName();
      String _plus = ((pkg + ".eINSTANCE.get") + _classifierAccessorName);
      return (_plus + "()");
    }
  }
  
  public static String getGenTypeLiteral(final EPackage pkg, final ResourceSet resourceSet) {
    GenPackage _genPackage = GenModelUtil2.getGenPackage(pkg, resourceSet);
    String _packageInterfaceName = _genPackage.getPackageInterfaceName();
    return (_packageInterfaceName + ".eINSTANCE");
  }
  
  public static String getGenTypeLiteral(final EStructuralFeature feature, final ResourceSet resourceSet) {
    final GenFeature genFeature = GenModelUtil2.getGenFeature(feature, resourceSet);
    GenPackage _genPackage = genFeature.getGenPackage();
    final String pkg = _genPackage.getPackageInterfaceName();
    GenPackage _genPackage_1 = genFeature.getGenPackage();
    boolean _isLiteralsInterface = _genPackage_1.isLiteralsInterface();
    if (_isLiteralsInterface) {
      GenClass _genClass = genFeature.getGenClass();
      String _featureID = _genClass.getFeatureID(genFeature);
      return ((pkg + ".Literals.") + _featureID);
    } else {
      String _featureAccessorName = genFeature.getFeatureAccessorName();
      String _plus = ((pkg + ".eINSTANCE.get") + _featureAccessorName);
      return (_plus + "()");
    }
  }
  
  public static String getJavaTypeName(final EClassifier classifier, final ResourceSet resourceSet) {
    final GenClassifier genClassifier = GenModelUtil2.getGenClassifier(classifier, resourceSet);
    if ((genClassifier instanceof GenClass)) {
      return ((GenClass)genClassifier).getQualifiedInterfaceName();
    } else {
      return ((GenDataType) genClassifier).getQualifiedInstanceClassName();
    }
  }
}
