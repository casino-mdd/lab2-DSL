/*
 * generated by Xtext 2.18.0
 */
package org.xtext.lab2.layeredStyle.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.lab2.layeredStyle.LayeredStyleDSLRuntimeModule
import org.xtext.lab2.layeredStyle.LayeredStyleDSLStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class LayeredStyleDSLIdeSetup extends LayeredStyleDSLStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new LayeredStyleDSLRuntimeModule, new LayeredStyleDSLIdeModule))
	}
	
}
