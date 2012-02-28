package org.eclipse.xtext.xbase.tests.jvmmodel;

import com.google.common.collect.Iterables;
import com.google.inject.Inject;
import com.google.inject.Injector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.common.types.JvmConstructor;
import org.eclipse.xtext.common.types.JvmDeclaredType;
import org.eclipse.xtext.common.types.JvmGenericType;
import org.eclipse.xtext.common.types.JvmMember;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.resource.DerivedStateAwareResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.xbase.XbaseStandaloneSetup;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor;
import org.eclipse.xtext.xbase.jvmmodel.IJvmDeclaredTypeAcceptor.IPostIndexingInitializing;
import org.eclipse.xtext.xbase.jvmmodel.IJvmModelInferrer;
import org.eclipse.xtext.xbase.jvmmodel.JvmModelAssociator;
import org.eclipse.xtext.xbase.jvmmodel.JvmTypesBuilder;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure3;
import org.eclipse.xtext.xbase.tests.jvmmodel.AbstractJvmModelTest;
import org.junit.Assert;
import org.junit.Test;

@SuppressWarnings("all")
public class JvmModelAssociaterTest extends AbstractJvmModelTest {
  @Inject
  private JvmTypesBuilder _jvmTypesBuilder;
  
  @Inject
  private JvmModelAssociator assoc;
  
  @Inject
  private XtextResourceSet resourceSet;
  
  @Inject
  private DerivedStateAwareResource resource;
  
  public Injector getInjector() {
    XbaseStandaloneSetup _xbaseStandaloneSetup = new XbaseStandaloneSetup();
    Injector _createInjector = _xbaseStandaloneSetup.createInjector();
    return _createInjector;
  }
  
  @Test
  public void testInference() {
    final Procedure3<EObject,IJvmDeclaredTypeAcceptor,Boolean> _function = new Procedure3<EObject,IJvmDeclaredTypeAcceptor,Boolean>() {
        public void apply(final EObject obj, final IJvmDeclaredTypeAcceptor acceptor, final Boolean preIndexing) {
          JvmGenericType _class = JvmModelAssociaterTest.this._jvmTypesBuilder.toClass(obj, "foo.Bar");
          final JvmGenericType firstType = _class;
          JvmGenericType _class_1 = JvmModelAssociaterTest.this._jvmTypesBuilder.toClass(obj, "foo.Baz");
          final JvmGenericType secondType = _class_1;
          Resource _eResource = secondType.eResource();
          Assert.assertNull(_eResource);
          IPostIndexingInitializing<JvmGenericType> _accept = acceptor.<JvmGenericType>accept(firstType);
          final Procedure1<JvmGenericType> _function = new Procedure1<JvmGenericType>() {
              public void apply(final JvmGenericType it) {
                it.setAbstract(true);
                Resource _eResource = firstType.eResource();
                Assert.assertNotNull(_eResource);
                Resource _eResource_1 = secondType.eResource();
                Assert.assertNotNull(_eResource_1);
              }
            };
          _accept.initializeLater(_function);
          IPostIndexingInitializing<JvmGenericType> _accept_1 = acceptor.<JvmGenericType>accept(secondType);
          final Procedure1<JvmGenericType> _function_1 = new Procedure1<JvmGenericType>() {
              public void apply(final JvmGenericType it) {
                it.setAbstract(true);
                Resource _eResource = firstType.eResource();
                Assert.assertNotNull(_eResource);
              }
            };
          _accept_1.initializeLater(_function_1);
        }
      };
    this.assoc.setInferrer(new IJvmModelInferrer() {
        public void infer(EObject e,IJvmDeclaredTypeAcceptor acceptor,boolean preIndexingPhase) {
          _function.apply(e,acceptor,preIndexingPhase);
        }
    });
    this.resource.setDerivedStateComputer(null);
    URI _createURI = URI.createURI("foo.txt");
    this.resource.setURI(_createURI);
    Class<? extends Object> _class = this.getClass();
    this.resourceSet.setClasspathURIContext(_class);
    EList<Resource> _resources = this.resourceSet.getResources();
    _resources.add(this.resource);
    EList<EObject> _contents = this.resource.getContents();
    EClass _createEClass = EcoreFactory.eINSTANCE.createEClass();
    _contents.add(_createEClass);
    this.assoc.installDerivedState(this.resource, true);
    EList<EObject> _contents_1 = this.resource.getContents();
    EObject _get = _contents_1.get(1);
    boolean _isAbstract = ((JvmDeclaredType) _get).isAbstract();
    Assert.assertFalse(_isAbstract);
    EList<EObject> _contents_2 = this.resource.getContents();
    _contents_2.clear();
    EList<EObject> _contents_3 = this.resource.getContents();
    EClass _createEClass_1 = EcoreFactory.eINSTANCE.createEClass();
    _contents_3.add(_createEClass_1);
    this.assoc.installDerivedState(this.resource, false);
    EList<EObject> _contents_4 = this.resource.getContents();
    EObject _get_1 = _contents_4.get(1);
    final JvmGenericType type = ((JvmGenericType) _get_1);
    boolean _isAbstract_1 = type.isAbstract();
    Assert.assertTrue(_isAbstract_1);
    EList<JvmMember> _members = type.getMembers();
    Iterable<JvmConstructor> _filter = Iterables.<JvmConstructor>filter(_members, JvmConstructor.class);
    int _size = IterableExtensions.size(_filter);
    Assert.assertEquals(1, _size);
    EList<JvmTypeReference> _superTypes = type.getSuperTypes();
    JvmTypeReference _head = IterableExtensions.<JvmTypeReference>head(_superTypes);
    String _qualifiedName = _head==null?(String)null:_head.getQualifiedName();
    Assert.assertEquals("java.lang.Object", _qualifiedName);
  }
}
