/**
 */
package mm2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm2.OrderModel#getOrders <em>Orders</em>}</li>
 *   <li>{@link mm2.OrderModel#getLocations <em>Locations</em>}</li>
 * </ul>
 *
 * @see mm2.Mm2Package#getOrderModel()
 * @model
 * @generated
 */
public interface OrderModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link mm2.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see mm2.Mm2Package#getOrderModel_Orders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrders();

	/**
	 * Returns the value of the '<em><b>Locations</b></em>' containment reference list.
	 * The list contents are of type {@link mm2.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Locations</em>' containment reference list.
	 * @see mm2.Mm2Package#getOrderModel_Locations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocations();

} // OrderModel
