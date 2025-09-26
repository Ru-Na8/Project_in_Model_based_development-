/**
 */
package mm6_1;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm6_1.Order#getOrderID <em>Order ID</em>}</li>
 *   <li>{@link mm6_1.Order#getName <em>Name</em>}</li>
 *   <li>{@link mm6_1.Order#getDeliveryAddress <em>Delivery Address</em>}</li>
 *   <li>{@link mm6_1.Order#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link mm6_1.Order#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @see mm6_1.Mm6_1Package#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order ID</em>' attribute.
	 * @see #setOrderID(String)
	 * @see mm6_1.Mm6_1Package#getOrder_OrderID()
	 * @model
	 * @generated
	 */
	String getOrderID();

	/**
	 * Sets the value of the '{@link mm6_1.Order#getOrderID <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order ID</em>' attribute.
	 * @see #getOrderID()
	 * @generated
	 */
	void setOrderID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mm6_1.Mm6_1Package#getOrder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm6_1.Order#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Delivery Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Address</em>' attribute.
	 * @see #setDeliveryAddress(String)
	 * @see mm6_1.Mm6_1Package#getOrder_DeliveryAddress()
	 * @model
	 * @generated
	 */
	String getDeliveryAddress();

	/**
	 * Sets the value of the '{@link mm6_1.Order#getDeliveryAddress <em>Delivery Address</em>}' attribute.
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
	 * @see mm6_1.Mm6_1Package#getOrder_DeliveryDate()
	 * @model
	 * @generated
	 */
	Date getDeliveryDate();

	/**
	 * Sets the value of the '{@link mm6_1.Order#getDeliveryDate <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Date</em>' attribute.
	 * @see #getDeliveryDate()
	 * @generated
	 */
	void setDeliveryDate(Date value);

	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link mm6_1.Item}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see mm6_1.Mm6_1Package#getOrder_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<Item> getItems();

} // Order
