/**
 */
package mm3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Vehicle Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm3.VehicleType#getTypeID <em>Type ID</em>}</li>
 *   <li>{@link mm3.VehicleType#getName <em>Name</em>}</li>
 *   <li>{@link mm3.VehicleType#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see mm3.Mm3Package#getVehicleType()
 * @model
 * @generated
 */
public interface VehicleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type ID</em>' attribute.
	 * @see #setTypeID(String)
	 * @see mm3.Mm3Package#getVehicleType_TypeID()
	 * @model
	 * @generated
	 */
	String getTypeID();

	/**
	 * Sets the value of the '{@link mm3.VehicleType#getTypeID <em>Type ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type ID</em>' attribute.
	 * @see #getTypeID()
	 * @generated
	 */
	void setTypeID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mm3.Mm3Package#getVehicleType_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm3.VehicleType#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mm3.Mm3Package#getVehicleType_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mm3.VehicleType#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // VehicleType
