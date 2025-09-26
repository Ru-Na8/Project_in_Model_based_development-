/**
 */
package mm3;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm3.Availability#getAvailabilityID <em>Availability ID</em>}</li>
 *   <li>{@link mm3.Availability#getStatus <em>Status</em>}</li>
 *   <li>{@link mm3.Availability#getAvailabilityStart <em>Availability Start</em>}</li>
 *   <li>{@link mm3.Availability#getAvailabilityEnd <em>Availability End</em>}</li>
 * </ul>
 *
 * @see mm3.Mm3Package#getAvailability()
 * @model
 * @generated
 */
public interface Availability extends EObject {
	/**
	 * Returns the value of the '<em><b>Availability ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability ID</em>' attribute.
	 * @see #setAvailabilityID(String)
	 * @see mm3.Mm3Package#getAvailability_AvailabilityID()
	 * @model
	 * @generated
	 */
	String getAvailabilityID();

	/**
	 * Sets the value of the '{@link mm3.Availability#getAvailabilityID <em>Availability ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability ID</em>' attribute.
	 * @see #getAvailabilityID()
	 * @generated
	 */
	void setAvailabilityID(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see #setStatus(String)
	 * @see mm3.Mm3Package#getAvailability_Status()
	 * @model
	 * @generated
	 */
	String getStatus();

	/**
	 * Sets the value of the '{@link mm3.Availability#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(String value);

	/**
	 * Returns the value of the '<em><b>Availability Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability Start</em>' attribute.
	 * @see #setAvailabilityStart(Date)
	 * @see mm3.Mm3Package#getAvailability_AvailabilityStart()
	 * @model
	 * @generated
	 */
	Date getAvailabilityStart();

	/**
	 * Sets the value of the '{@link mm3.Availability#getAvailabilityStart <em>Availability Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability Start</em>' attribute.
	 * @see #getAvailabilityStart()
	 * @generated
	 */
	void setAvailabilityStart(Date value);

	/**
	 * Returns the value of the '<em><b>Availability End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Availability End</em>' attribute.
	 * @see #setAvailabilityEnd(Date)
	 * @see mm3.Mm3Package#getAvailability_AvailabilityEnd()
	 * @model
	 * @generated
	 */
	Date getAvailabilityEnd();

	/**
	 * Sets the value of the '{@link mm3.Availability#getAvailabilityEnd <em>Availability End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Availability End</em>' attribute.
	 * @see #getAvailabilityEnd()
	 * @generated
	 */
	void setAvailabilityEnd(Date value);

} // Availability
