/**
 */
package mm2;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Details</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm2.DeliveryDetails#getDeliveryAddress <em>Delivery Address</em>}</li>
 *   <li>{@link mm2.DeliveryDetails#getDeliveryDate <em>Delivery Date</em>}</li>
 * </ul>
 *
 * @see mm2.Mm2Package#getDeliveryDetails()
 * @model
 * @generated
 */
public interface DeliveryDetails extends EObject {
	/**
	 * Returns the value of the '<em><b>Delivery Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Address</em>' attribute.
	 * @see #setDeliveryAddress(String)
	 * @see mm2.Mm2Package#getDeliveryDetails_DeliveryAddress()
	 * @model
	 * @generated
	 */
	String getDeliveryAddress();

	/**
	 * Sets the value of the '{@link mm2.DeliveryDetails#getDeliveryAddress <em>Delivery Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Address</em>' attribute.
	 * @see #getDeliveryAddress()
	 * @generated
	 */
	void setDeliveryAddress(String value);

	/**
	 * Returns the value of the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Date</em>' attribute.
	 * @see #setDeliveryDate(Date)
	 * @see mm2.Mm2Package#getDeliveryDetails_DeliveryDate()
	 * @model
	 * @generated
	 */
	Date getDeliveryDate();

	/**
	 * Sets the value of the '{@link mm2.DeliveryDetails#getDeliveryDate <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Date</em>' attribute.
	 * @see #getDeliveryDate()
	 * @generated
	 */
	void setDeliveryDate(Date value);

} // DeliveryDetails
