/**
 */
package mm3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm3.Vehicle#getVehicleID <em>Vehicle ID</em>}</li>
 *   <li>{@link mm3.Vehicle#getVehicletype <em>Vehicletype</em>}</li>
 *   <li>{@link mm3.Vehicle#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link mm3.Vehicle#getAvailability <em>Availability</em>}</li>
 *   <li>{@link mm3.Vehicle#getSpecialcharacteristics <em>Specialcharacteristics</em>}</li>
 * </ul>
 *
 * @see mm3.Mm3Package#getVehicle()
 * @model
 * @generated
 */
public interface Vehicle extends EObject {
	/**
	 * Returns the value of the '<em><b>Vehicle ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicle ID</em>' attribute.
	 * @see #setVehicleID(String)
	 * @see mm3.Mm3Package#getVehicle_VehicleID()
	 * @model
	 * @generated
	 */
	String getVehicleID();

	/**
	 * Sets the value of the '{@link mm3.Vehicle#getVehicleID <em>Vehicle ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicle ID</em>' attribute.
	 * @see #getVehicleID()
	 * @generated
	 */
	void setVehicleID(String value);

	/**
	 * Returns the value of the '<em><b>Vehicletype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Vehicletype</em>' reference.
	 * @see #setVehicletype(VehicleType)
	 * @see mm3.Mm3Package#getVehicle_Vehicletype()
	 * @model
	 * @generated
	 */
	VehicleType getVehicletype();

	/**
	 * Sets the value of the '{@link mm3.Vehicle#getVehicletype <em>Vehicletype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Vehicletype</em>' reference.
	 * @see #getVehicletype()
	 * @generated
	 */
	void setVehicletype(VehicleType value);

	/**
	 * Returns the value of the '<em><b>Capacity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity</em>' reference.
	 * @see #setCapacity(Capacity)
	 * @see mm3.Mm3Package#getVehicle_Capacity()
	 * @model
	 * @generated
	 */
	Capacity getCapacity();

	/**
	 * Sets the value of the '{@link mm3.Vehicle#getCapacity <em>Capacity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity</em>' reference.
	 * @see #getCapacity()
	 * @generated
	 */
	void setCapacity(Capacity value);

	/**
	 * Returns the value of the '<em><b>Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability</em>' reference.
	 * @see #setAvailability(Availability)
	 * @see mm3.Mm3Package#getVehicle_Availability()
	 * @model
	 * @generated
	 */
	Availability getAvailability();

	/**
	 * Sets the value of the '{@link mm3.Vehicle#getAvailability <em>Availability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability</em>' reference.
	 * @see #getAvailability()
	 * @generated
	 */
	void setAvailability(Availability value);

	/**
	 * Returns the value of the '<em><b>Specialcharacteristics</b></em>' reference list.
	 * The list contents are of type {@link mm3.SpecialCharacteristics}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialcharacteristics</em>' reference list.
	 * @see mm3.Mm3Package#getVehicle_Specialcharacteristics()
	 * @model
	 * @generated
	 */
	EList<SpecialCharacteristics> getSpecialcharacteristics();

} // Vehicle
