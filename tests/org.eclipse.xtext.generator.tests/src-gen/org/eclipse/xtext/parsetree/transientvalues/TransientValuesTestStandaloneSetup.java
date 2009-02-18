
/*
*/
package org.eclipse.xtext.parsetree.transientvalues;

import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.ISetup;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.resource.IResourceFactory;

import com.google.inject.Guice;
import com.google.inject.Injector;

/**
 * Generated from StandaloneSetup.xpt!
 */
public class TransientValuesTestStandaloneSetup implements ISetup {

	public static void doSetup() {
		new TransientValuesTestStandaloneSetup().createInjectorAndDoEMFRegistration();
	}

	public Injector createInjectorAndDoEMFRegistration() {
		
		org.eclipse.xtext.builtin.XtextBuiltinStandaloneSetup.doSetup();
		Injector injector = createInjector();
		register(injector);
		return injector;
	}
	
	public Injector createInjector() {
		return Guice.createInjector(new org.eclipse.xtext.parsetree.transientvalues.TransientValuesTestRuntimeModule());
	}
	
	public void register(Injector injector) {
	if (!EPackage.Registry.INSTANCE.containsKey("http://simple/transientvaluestest")) {
		EPackage.Registry.INSTANCE.put("http://simple/transientvaluestest", org.eclipse.xtext.parsetree.transientvalues.transientvaluestest.TransientvaluestestPackage.eINSTANCE);
	}


		org.eclipse.xtext.resource.IResourceFactory resourceFactory = injector.getInstance(org.eclipse.xtext.resource.IResourceFactory.class);
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("transientvaluestest", resourceFactory);
		

	//TODO registration of EValidators should be added here, too

	}
}
