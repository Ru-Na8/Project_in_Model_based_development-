/**
 */
package mm6_1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Routes Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm6_1.RoutesModel#getRoutes <em>Routes</em>}</li>
 *   <li>{@link mm6_1.RoutesModel#getLocation <em>Location</em>}</li>
 *   <li>{@link mm6_1.RoutesModel#getShortestPaths <em>Shortest Paths</em>}</li>
 *   <li>{@link mm6_1.RoutesModel#getOrders <em>Orders</em>}</li>
 * </ul>
 *
 * @see mm6_1.Mm6_1Package#getRoutesModel()
 * @model
 * @generated
 */
public interface RoutesModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link mm6_1.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see mm6_1.Mm6_1Package#getRoutesModel_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference list.
	 * The list contents are of type {@link mm6_1.Location}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference list.
	 * @see mm6_1.Mm6_1Package#getRoutesModel_Location()
	 * @model containment="true"
	 * @generated
	 */
	EList<Location> getLocation();

	/**
	 * Returns the value of the '<em><b>Shortest Paths</b></em>' containment reference list.
	 * The list contents are of type {@link mm6_1.Route}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shortest Paths</em>' containment reference list.
	 * @see mm6_1.Mm6_1Package#getRoutesModel_ShortestPaths()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getShortestPaths();

	/**
	 * Returns the value of the '<em><b>Orders</b></em>' containment reference list.
	 * The list contents are of type {@link mm6_1.Order}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orders</em>' containment reference list.
	 * @see mm6_1.Mm6_1Package#getRoutesModel_Orders()
	 * @model containment="true"
	 * @generated
	 */
	EList<Order> getOrders();

} // RoutesModel
