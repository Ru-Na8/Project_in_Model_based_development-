/**
 */
package mm3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fleet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm3.Fleet#getFleetID <em>Fleet ID</em>}</li>
 *   <li>{@link mm3.Fleet#getName <em>Name</em>}</li>
 *   <li>{@link mm3.Fleet#getVehicles <em>Vehicles</em>}</li>
 * </ul>
 *
 * @see mm3.Mm3Package#getFleet()
 * @model
 * @generated
 */
public interface Fleet extends EObject {
	/**
	 * Returns the value of the '<em><b>Fleet ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fleet ID</em>' attribute.
	 * @see #setFleetID(String)
	 * @see mm3.Mm3Package#getFleet_FleetID()
	 * @model
	 * @generated
	 */
	String getFleetID();

	/**
	 * Sets the value of the '{@link mm3.Fleet#getFleetID <em>Fleet ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fleet ID</em>' attribute.
	 * @see #getFleetID()
	 * @generated
	 */
	void setFleetID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mm3.Mm3Package#getFleet_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm3.Fleet#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Vehicles</b></em>' reference list.
	 * The list contents are of type {@link mm3.Vehicle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicles</em>' reference list.
	 * @see mm3.Mm3Package#getFleet_Vehicles()
	 * @model
	 * @generated
	 */
	EList<Vehicle> getVehicles();

} // Fleet
