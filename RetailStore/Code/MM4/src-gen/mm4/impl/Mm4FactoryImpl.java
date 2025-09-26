/**
 */
package mm4.impl;

import mm4.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mm4FactoryImpl extends EFactoryImpl implements Mm4Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mm4Factory init() {
		try {
			Mm4Factory theMm4Factory = (Mm4Factory) EPackage.Registry.INSTANCE.getEFactory(Mm4Package.eNS_URI);
			if (theMm4Factory != null) {
				return theMm4Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Mm4FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mm4FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case Mm4Package.ORDER_DELIVERY_CONSTRAINTS:
			return createOrderDeliveryConstraints();
		case Mm4Package.DELIVERY_CONSTRAINT:
			return createDeliveryConstraint();
		case Mm4Package.ORDER_CONSTRAINT:
			return createOrderConstraint();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderDeliveryConstraints createOrderDeliveryConstraints() {
		OrderDeliveryConstraintsImpl orderDeliveryConstraints = new OrderDeliveryConstraintsImpl();
		return orderDeliveryConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DeliveryConstraint createDeliveryConstraint() {
		DeliveryConstraintImpl deliveryConstraint = new DeliveryConstraintImpl();
		return deliveryConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OrderConstraint createOrderConstraint() {
		OrderConstraintImpl orderConstraint = new OrderConstraintImpl();
		return orderConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mm4Package getMm4Package() {
		return (Mm4Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Mm4Package getPackage() {
		return Mm4Package.eINSTANCE;
	}

} //Mm4FactoryImpl
