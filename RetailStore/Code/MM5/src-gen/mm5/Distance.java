/**
 */
package mm5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Distance</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm5.Distance#getDistance <em>Distance</em>}</li>
 *   <li>{@link mm5.Distance#getTravelTime <em>Travel Time</em>}</li>
 *   <li>{@link mm5.Distance#getFrom <em>From</em>}</li>
 *   <li>{@link mm5.Distance#getTo <em>To</em>}</li>
 *   <li>{@link mm5.Distance#getRouteID <em>Route ID</em>}</li>
 * </ul>
 *
 * @see mm5.Mm5Package#getDistance()
 * @model
 * @generated
 */
public interface Distance extends EObject {
	/**
	 * Returns the value of the '<em><b>Distance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Distance</em>' attribute.
	 * @see #setDistance(double)
	 * @see mm5.Mm5Package#getDistance_Distance()
	 * @model
	 * @generated
	 */
	//double getDistance();
	double getDistance();

	/**
	 * Sets the value of the '{@link mm5.Distance#getDistance <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Distance</em>' attribute.
	 * @see #getDistance()
	 * @generated
	 */
	void setDistance(double value);

	/**
	 * Returns the value of the '<em><b>Travel Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Travel Time</em>' attribute.
	 * @see #setTravelTime(double)
	 * @see mm5.Mm5Package#getDistance_TravelTime()
	 * @model
	 * @generated
	 */
	//double getTravelTime();
	double getTravelTime();

	/**
	 * Sets the value of the '{@link mm5.Distance#getTravelTime <em>Travel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Travel Time</em>' attribute.
	 * @see #getTravelTime()
	 * @generated
	 */
	void setTravelTime(double value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(Location)
	 * @see mm5.Mm5Package#getDistance_From()
	 * @model
	 * @generated
	 */
	Location getFrom();

	/**
	 * Sets the value of the '{@link mm5.Distance#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(Location value);

	Location getTo(); // Added

	void setTo(Location value); // Added

	/**
	 * Returns the value of the '<em><b>Route ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route ID</em>' attribute.
	 * @see #setRouteID(String)
	 * @see mm5.Mm5Package#getDistance_RouteID()
	 * @model
	 * @generated
	 */
	String getRouteID();

	/**
	 * Sets the value of the '{@link mm5.Distance#getRouteID <em>Route ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route ID</em>' attribute.
	 * @see #getRouteID()
	 * @generated
	 */
	void setRouteID(String value);

} // Distance
