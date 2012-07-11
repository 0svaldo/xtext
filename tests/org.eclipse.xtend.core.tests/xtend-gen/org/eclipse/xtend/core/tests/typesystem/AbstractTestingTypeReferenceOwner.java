package org.eclipse.xtend.core.tests.typesystem;

import com.google.inject.Inject;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtend.core.tests.AbstractXtendTestCase;
import org.eclipse.xtend.core.xtend.XtendFunction;
import org.eclipse.xtext.common.types.JvmTypeReference;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.eclipse.xtext.xbase.typesystem.references.LightweightBoundTypeArgument;
import org.eclipse.xtext.xbase.typesystem.references.LightweightTypeReference;
import org.eclipse.xtext.xbase.typesystem.references.OwnedConverter;
import org.eclipse.xtext.xbase.typesystem.references.TypeReferenceOwner;
import org.eclipse.xtext.xbase.typesystem.util.CommonTypeComputationServices;
import org.junit.After;

/**
 * @author Sebastian Zarnekow
 */
@SuppressWarnings("all")
public abstract class AbstractTestingTypeReferenceOwner extends AbstractXtendTestCase implements TypeReferenceOwner {
  @Inject
  private CommonTypeComputationServices services;
  
  private ResourceSet contextResourceSet;
  
  private OwnedConverter owner = new Function0<OwnedConverter>() {
    public OwnedConverter apply() {
      OwnedConverter _ownedConverter = new OwnedConverter(AbstractTestingTypeReferenceOwner.this);
      return _ownedConverter;
    }
  }.apply();
  
  public LightweightTypeReference toLightweightReference(final JvmTypeReference reference) {
    return this.owner.toLightweightReference(reference);
  }
  
  @After
  public void tearDown() {
    this.contextResourceSet = null;
  }
  
  protected XtendFunction function(final String string) throws Exception {
    final XtendFunction result = super.function(string);
    Resource _eResource = result.eResource();
    ResourceSet _resourceSet = _eResource.getResourceSet();
    this.contextResourceSet = _resourceSet;
    return result;
  }
  
  public void acceptHint(final Object handle, final LightweightBoundTypeArgument boundTypeArgument) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("Auto-generated function stub");
    throw _unsupportedOperationException;
  }
  
  public List<LightweightBoundTypeArgument> getAllHints(final Object handle) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("Auto-generated function stub");
    throw _unsupportedOperationException;
  }
  
  public ResourceSet getContextResourceSet() {
    return this.contextResourceSet;
  }
  
  public CommonTypeComputationServices getServices() {
    return this.services;
  }
  
  public boolean isResolved(final Object handle) {
    UnsupportedOperationException _unsupportedOperationException = new UnsupportedOperationException("Auto-generated function stub");
    throw _unsupportedOperationException;
  }
}
