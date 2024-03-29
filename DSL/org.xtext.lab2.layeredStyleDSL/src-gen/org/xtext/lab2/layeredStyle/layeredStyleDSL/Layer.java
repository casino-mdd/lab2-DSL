/**
 * generated by Xtext 2.18.0
 */
package org.xtext.lab2.layeredStyle.layeredStyleDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Layer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.lab2.layeredStyle.layeredStyleDSL.Layer#getLayerSegments <em>Layer Segments</em>}</li>
 * </ul>
 *
 * @see org.xtext.lab2.layeredStyle.layeredStyleDSL.LayeredStyleDSLPackage#getLayer()
 * @model
 * @generated
 */
public interface Layer extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Layer Segments</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.lab2.layeredStyle.layeredStyleDSL.LayerSegment}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Layer Segments</em>' containment reference list.
   * @see org.xtext.lab2.layeredStyle.layeredStyleDSL.LayeredStyleDSLPackage#getLayer_LayerSegments()
   * @model containment="true"
   * @generated
   */
  EList<LayerSegment> getLayerSegments();

} // Layer
