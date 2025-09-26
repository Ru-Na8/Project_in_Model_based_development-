/**
 */
package mm2;

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
 *   <li>{@link mm2.Order#getOrderiteam <em>Orderiteam</em>}</li>
 *   <li>{@link mm2.Order#getDeliverydetails <em>Deliverydetails</em>}</li>
 *   <li>{@link mm2.Order#getOrderID <em>Order ID</em>}</li>
 *   <li>{@link mm2.Order#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see mm2.Mm2Package#getOrder()
 * @model
 * @generated
 */
public interface Order extends EObject {
	/**
	 * Returns the value of the '<em><b>Orderiteam</b></em>' containment reference list.
	 * The list contents are of type {@link mm2.OrderIteam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderiteam</em>' containment reference list.
	 * @see mm2.Mm2Package#getOrder_Orderiteam()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderIteam> getOrderiteam();

	/**
	 * Returns the value of the '<em><b>Deliverydetails</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliverydetails</em>' containment reference.
	 * @see #setDeliverydetails(DeliveryDetails)
	 * @see mm2.Mm2Package#getOrder_Deliverydetails()
	 * @model containment="true"
	 * @generated
	 */
	DeliveryDetails getDeliverydetails();

	/**
	 * Sets the value of the '{@link mm2.Order#getDeliverydetails <em>Deliverydetails</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deliverydetails</em>' containment reference.
	 * @see #getDeliverydetails()
	 * @generated
	 */
	void setDeliverydetails(DeliveryDetails value);

	/**
	 * Returns the value of the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order ID</em>' attribute.
	 * @see #setOrderID(String)
	 * @see mm2.Mm2Package#getOrder_OrderID()
	 * @model
	 * @generated
	 */
	String getOrderID();

	/**
	 * Sets the value of the '{@link mm2.Order#getOrderID <em>Order ID</em>}' attribute.
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
	 * @see mm2.Mm2Package#getOrder_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm2.Order#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Order
