/**
 */
package mm4.impl;

import mm4.DeliveryConstraint;
import mm4.Mm4Factory;
import mm4.Mm4Package;
import mm4.OrderConstraint;
import mm4.OrderDeliveryConstraints;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Mm4PackageImpl extends EPackageImpl implements Mm4Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderDeliveryConstraintsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass deliveryConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderConstraintEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see mm4.Mm4Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Mm4PackageImpl() {
		super(eNS_URI, Mm4Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link Mm4Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Mm4Package init() {
		if (isInited)
			return (Mm4Package) EPackage.Registry.INSTANCE.getEPackage(Mm4Package.eNS_URI);

		// Obtain or create and register package
		Object registeredMm4Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Mm4PackageImpl theMm4Package = registeredMm4Package instanceof Mm4PackageImpl
				? (Mm4PackageImpl) registeredMm4Package
				: new Mm4PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMm4Package.createPackageContents();

		// Initialize created meta-data
		theMm4Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMm4Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Mm4Package.eNS_URI, theMm4Package);
		return theMm4Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderDeliveryConstraints() {
		return orderDeliveryConstraintsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderDeliveryConstraints_ConstraintsID() {
		return (EAttribute) orderDeliveryConstraintsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderDeliveryConstraints_Orderconstraint() {
		return (EReference) orderDeliveryConstraintsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDeliveryConstraint() {
		return deliveryConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeliveryConstraint_ConstraintID() {
		return (EAttribute) deliveryConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeliveryConstraint_MaximumWeight() {
		return (EAttribute) deliveryConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeliveryConstraint_MaximumVolume() {
		return (EAttribute) deliveryConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeliveryConstraint_DeliveryTimeFrameStart() {
		return (EAttribute) deliveryConstraintEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getDeliveryConstraint_DeliveryTimeFrameEnd() {
		return (EAttribute) deliveryConstraintEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOrderConstraint() {
		return orderConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderConstraint_PriorityLevel() {
		return (EAttribute) orderConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOrderConstraint_ConstraintID() {
		return (EAttribute) orderConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getOrderConstraint_Deliveryconstraint() {
		return (EReference) orderConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Mm4Factory getMm4Factory() {
		return (Mm4Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		orderDeliveryConstraintsEClass = createEClass(ORDER_DELIVERY_CONSTRAINTS);
		createEAttribute(orderDeliveryConstraintsEClass, ORDER_DELIVERY_CONSTRAINTS__CONSTRAINTS_ID);
		createEReference(orderDeliveryConstraintsEClass, ORDER_DELIVERY_CONSTRAINTS__ORDERCONSTRAINT);

		deliveryConstraintEClass = createEClass(DELIVERY_CONSTRAINT);
		createEAttribute(deliveryConstraintEClass, DELIVERY_CONSTRAINT__CONSTRAINT_ID);
		createEAttribute(deliveryConstraintEClass, DELIVERY_CONSTRAINT__MAXIMUM_WEIGHT);
		createEAttribute(deliveryConstraintEClass, DELIVERY_CONSTRAINT__MAXIMUM_VOLUME);
		createEAttribute(deliveryConstraintEClass, DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_START);
		createEAttribute(deliveryConstraintEClass, DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_END);

		orderConstraintEClass = createEClass(ORDER_CONSTRAINT);
		createEAttribute(orderConstraintEClass, ORDER_CONSTRAINT__PRIORITY_LEVEL);
		createEAttribute(orderConstraintEClass, ORDER_CONSTRAINT__CONSTRAINT_ID);
		createEReference(orderConstraintEClass, ORDER_CONSTRAINT__DELIVERYCONSTRAINT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes, features, and operations; add parameters
		initEClass(orderDeliveryConstraintsEClass, OrderDeliveryConstraints.class, "OrderDeliveryConstraints",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderDeliveryConstraints_ConstraintsID(), ecorePackage.getEString(), "constraintsID", null, 0,
				1, OrderDeliveryConstraints.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOrderDeliveryConstraints_Orderconstraint(), this.getOrderConstraint(), null,
				"orderconstraint", null, 0, -1, OrderDeliveryConstraints.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(deliveryConstraintEClass, DeliveryConstraint.class, "DeliveryConstraint", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDeliveryConstraint_ConstraintID(), ecorePackage.getEString(), "constraintID", null, 0, 1,
				DeliveryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryConstraint_MaximumWeight(), ecorePackage.getEInt(), "maximumWeight", null, 0, 1,
				DeliveryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryConstraint_MaximumVolume(), ecorePackage.getEInt(), "maximumVolume", null, 0, 1,
				DeliveryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryConstraint_DeliveryTimeFrameStart(), ecorePackage.getEDate(),
				"deliveryTimeFrameStart", null, 0, 1, DeliveryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDeliveryConstraint_DeliveryTimeFrameEnd(), ecorePackage.getEDate(), "deliveryTimeFrameEnd",
				null, 0, 1, DeliveryConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(orderConstraintEClass, OrderConstraint.class, "OrderConstraint", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderConstraint_PriorityLevel(), ecorePackage.getEInt(), "priorityLevel", null, 0, 1,
				OrderConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderConstraint_ConstraintID(), ecorePackage.getEString(), "constraintID", null, 0, 1,
				OrderConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getOrderConstraint_Deliveryconstraint(), this.getDeliveryConstraint(), null,
				"deliveryconstraint", null, 0, -1, OrderConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Mm4PackageImpl
