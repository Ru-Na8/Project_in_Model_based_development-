/**
 */
package mm5;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance Matrix</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm5.DistanceMatrix#getLocation <em>Location</em>}</li>
 *   <li>{@link mm5.DistanceMatrix#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @see mm5.Mm5Package#getDistanceMatrix()
 * @model
 * @generated
 */
public interface DistanceMatrix extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link mm5.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see mm5.Mm5Package#getDistanceMatrix_Location()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocation();

	/**
	 * Returns the value of the '<em><b>Distance</b></em>' containment reference list.
	 * The list contents are of type {@link mm5.Distance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' containment reference list.
	 * @see mm5.Mm5Package#getDistanceMatrix_Distance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Distance> getDistance();

} // DistanceMatrix
