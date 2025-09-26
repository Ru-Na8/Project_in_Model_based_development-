/**
 */
package mm4;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm4.OrderConstraint#getPriorityLevel <em>Priority Level</em>}</li>
 *   <li>{@link mm4.OrderConstraint#getConstraintID <em>Constraint ID</em>}</li>
 *   <li>{@link mm4.OrderConstraint#getDeliveryconstraint <em>Deliveryconstraint</em>}</li>
 * </ul>
 *
 * @see mm4.Mm4Package#getOrderConstraint()
 * @model
 * @generated
 */
public interface OrderConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Priority Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority Level</em>' attribute.
	 * @see #setPriorityLevel(int)
	 * @see mm4.Mm4Package#getOrderConstraint_PriorityLevel()
	 * @model
	 * @generated
	 */
	int getPriorityLevel();

	/**
	 * Sets the value of the '{@link mm4.OrderConstraint#getPriorityLevel <em>Priority Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority Level</em>' attribute.
	 * @see #getPriorityLevel()
	 * @generated
	 */
	void setPriorityLevel(int value);

	/**
	 * Returns the value of the '<em><b>Constraint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint ID</em>' attribute.
	 * @see #setConstraintID(String)
	 * @see mm4.Mm4Package#getOrderConstraint_ConstraintID()
	 * @model
	 * @generated
	 */
	String getConstraintID();

	/**
	 * Sets the value of the '{@link mm4.OrderConstraint#getConstraintID <em>Constraint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint ID</em>' attribute.
	 * @see #getConstraintID()
	 * @generated
	 */
	void setConstraintID(String value);

	/**
	 * Returns the value of the '<em><b>Deliveryconstraint</b></em>' containment reference list.
	 * The list contents are of type {@link mm4.DeliveryConstraint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deliveryconstraint</em>' containment reference list.
	 * @see mm4.Mm4Package#getOrderConstraint_Deliveryconstraint()
	 * @model containment="true"
	 * @generated
	 */
	EList<DeliveryConstraint> getDeliveryconstraint();

} // OrderConstraint
