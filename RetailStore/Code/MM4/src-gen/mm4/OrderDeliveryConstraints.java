/**
 */
package mm4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Delivery Constraints</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm4.OrderDeliveryConstraints#getConstraintsID <em>Constraints ID</em>}</li>
 *   <li>{@link mm4.OrderDeliveryConstraints#getOrderconstraint <em>Orderconstraint</em>}</li>
 * </ul>
 *
 * @see mm4.Mm4Package#getOrderDeliveryConstraints()
 * @model
 * @generated
 */
public interface OrderDeliveryConstraints extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraints ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraints ID</em>' attribute.
	 * @see #setConstraintsID(String)
	 * @see mm4.Mm4Package#getOrderDeliveryConstraints_ConstraintsID()
	 * @model
	 * @generated
	 */
	String getConstraintsID();

	/**
	 * Sets the value of the '{@link mm4.OrderDeliveryConstraints#getConstraintsID <em>Constraints ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraints ID</em>' attribute.
	 * @see #getConstraintsID()
	 * @generated
	 */
	void setConstraintsID(String value);

	/**
	 * Returns the value of the '<em><b>Orderconstraint</b></em>' containment reference list.
	 * The list contents are of type {@link mm4.OrderConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderconstraint</em>' containment reference list.
	 * @see mm4.Mm4Package#getOrderDeliveryConstraints_Orderconstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<OrderConstraint> getOrderconstraint();

} // OrderDeliveryConstraints
