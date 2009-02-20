package org.eclipse.emf.index;

import java.util.Collection;

import junit.framework.TestCase;

import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.index.ecore.EPackageRegistryIndexFeeder;

public class EPackageRegistryTest extends TestCase {

	public void testRegistry() throws Exception {
		EcorePackage.eINSTANCE.eClass();
		IIndexStore indexStore = IIndexStore.eINSTANCE;
		EPackageRegistryIndexFeeder.feedEPackagesFromRegistry(indexStore);
		Collection<EPackageDescriptor> ePackageDescriptors = indexStore.ePackageDAO().createQueryEPackage(EcorePackage.eINSTANCE).executeListResult();
		assertNotNull(ePackageDescriptors);
		assertEquals(1, ePackageDescriptors.size());
		assertEquals("ecore", ePackageDescriptors.iterator().next().getName());
		
		Collection<EClassDescriptor> eClassDescriptors = indexStore.eClassDAO().createQueryEClass(EcorePackage.Literals.ECLASS).executeListResult();
		assertNotNull(eClassDescriptors);
		assertEquals(1, eClassDescriptors.size());
		assertEquals("EClass", eClassDescriptors.iterator().next().getName());
	}
}
