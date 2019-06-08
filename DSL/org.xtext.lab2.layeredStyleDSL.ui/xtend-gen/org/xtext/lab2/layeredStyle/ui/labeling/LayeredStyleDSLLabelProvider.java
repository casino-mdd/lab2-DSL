/**
 * generated by Xtext 2.18.0
 */
package org.xtext.lab2.layeredStyle.ui.labeling;

import com.google.inject.Inject;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.xtext.ui.label.DefaultEObjectLabelProvider;

/**
 * Provides labels for EObjects.
 * 
 * See https://www.eclipse.org/Xtext/documentation/304_ide_concepts.html#label-provider
 */
@SuppressWarnings("all")
public class LayeredStyleDSLLabelProvider extends DefaultEObjectLabelProvider {
  @Inject
  public LayeredStyleDSLLabelProvider(final AdapterFactoryLabelProvider delegate) {
    super(delegate);
  }
}
