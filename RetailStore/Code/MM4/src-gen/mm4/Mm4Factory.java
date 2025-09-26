/**
 */
package mm4;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mm4.Mm4Package
 * @generated
 */
public interface Mm4Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mm4Factory eINSTANCE = mm4.impl.Mm4FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Order Delivery Constraints</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Delivery Constraints</em>'.
	 * @generated
	 */
	OrderDeliveryConstraints createOrderDeliveryConstraints();

	/**
	 * Returns a new object of class '<em>Delivery Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Delivery Constraint</em>'.
	 * @generated
	 */
	DeliveryConstraint createDeliveryConstraint();

	/**
	 * Returns a new object of class '<em>Order Constraint</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Order Constraint</em>'.
	 * @generated
	 */
	OrderConstraint createOrderConstraint();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Mm4Package getMm4Package();

} //Mm4Factory
