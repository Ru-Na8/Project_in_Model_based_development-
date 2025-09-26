/**
 */
package mm3.impl;

import mm3.Availability;
import mm3.Capacity;
import mm3.Fleet;
import mm3.Mm3Factory;
import mm3.Mm3Package;
import mm3.SpecialCharacteristics;
import mm3.Vehicle;
import mm3.VehicleType;

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
public class Mm3PackageImpl extends EPackageImpl implements Mm3Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fleetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass vehicleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass capacityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass availabilityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass specialCharacteristicsEClass = null;

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
	 * @see mm3.Mm3Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Mm3PackageImpl() {
		super(eNS_URI, Mm3Factory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link Mm3Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Mm3Package init() {
		if (isInited)
			return (Mm3Package) EPackage.Registry.INSTANCE.getEPackage(Mm3Package.eNS_URI);

		// Obtain or create and register package
		Object registeredMm3Package = EPackage.Registry.INSTANCE.get(eNS_URI);
		Mm3PackageImpl theMm3Package = registeredMm3Package instanceof Mm3PackageImpl
				? (Mm3PackageImpl) registeredMm3Package
				: new Mm3PackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMm3Package.createPackageContents();

		// Initialize created meta-data
		theMm3Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMm3Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Mm3Package.eNS_URI, theMm3Package);
		return theMm3Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFleet() {
		return fleetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFleet_FleetID() {
		return (EAttribute) fleetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFleet_Name() {
		return (EAttribute) fleetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFleet_Vehicles() {
		return (EReference) fleetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicle() {
		return vehicleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicle_VehicleID() {
		return (EAttribute) vehicleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicle_Vehicletype() {
		return (EReference) vehicleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicle_Capacity() {
		return (EReference) vehicleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicle_Availability() {
		return (EReference) vehicleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVehicle_Specialcharacteristics() {
		return (EReference) vehicleEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVehicleType() {
		return vehicleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleType_TypeID() {
		return (EAttribute) vehicleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleType_Name() {
		return (EAttribute) vehicleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVehicleType_Description() {
		return (EAttribute) vehicleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCapacity() {
		return capacityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacity_CapacityID() {
		return (EAttribute) capacityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacity_Weight() {
		return (EAttribute) capacityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacity_Volume() {
		return (EAttribute) capacityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCapacity_NumberOfItems() {
		return (EAttribute) capacityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAvailability() {
		return availabilityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_AvailabilityID() {
		return (EAttribute) availabilityEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_Status() {
		return (EAttribute) availabilityEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_AvailabilityStart() {
		return (EAttribute) availabilityEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAvailability_AvailabilityEnd() {
		return (EAttribute) availabilityEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSpecialCharacteristics() {
		return specialCharacteristicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialCharacteristics_CharacteristicID() {
		return (EAttribute) specialCharacteristicsEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialCharacteristics_Name() {
		return (EAttribute) specialCharacteristicsEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSpecialCharacteristics_Description() {
		return (EAttribute) specialCharacteristicsEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mm3Factory getMm3Factory() {
		return (Mm3Factory) getEFactoryInstance();
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
		fleetEClass = createEClass(FLEET);
		createEAttribute(fleetEClass, FLEET__FLEET_ID);
		createEAttribute(fleetEClass, FLEET__NAME);
		createEReference(fleetEClass, FLEET__VEHICLES);

		vehicleEClass = createEClass(VEHICLE);
		createEAttribute(vehicleEClass, VEHICLE__VEHICLE_ID);
		createEReference(vehicleEClass, VEHICLE__VEHICLETYPE);
		createEReference(vehicleEClass, VEHICLE__CAPACITY);
		createEReference(vehicleEClass, VEHICLE__AVAILABILITY);
		createEReference(vehicleEClass, VEHICLE__SPECIALCHARACTERISTICS);

		vehicleTypeEClass = createEClass(VEHICLE_TYPE);
		createEAttribute(vehicleTypeEClass, VEHICLE_TYPE__TYPE_ID);
		createEAttribute(vehicleTypeEClass, VEHICLE_TYPE__NAME);
		createEAttribute(vehicleTypeEClass, VEHICLE_TYPE__DESCRIPTION);

		capacityEClass = createEClass(CAPACITY);
		createEAttribute(capacityEClass, CAPACITY__CAPACITY_ID);
		createEAttribute(capacityEClass, CAPACITY__WEIGHT);
		createEAttribute(capacityEClass, CAPACITY__VOLUME);
		createEAttribute(capacityEClass, CAPACITY__NUMBER_OF_ITEMS);

		availabilityEClass = createEClass(AVAILABILITY);
		createEAttribute(availabilityEClass, AVAILABILITY__AVAILABILITY_ID);
		createEAttribute(availabilityEClass, AVAILABILITY__STATUS);
		createEAttribute(availabilityEClass, AVAILABILITY__AVAILABILITY_START);
		createEAttribute(availabilityEClass, AVAILABILITY__AVAILABILITY_END);

		specialCharacteristicsEClass = createEClass(SPECIAL_CHARACTERISTICS);
		createEAttribute(specialCharacteristicsEClass, SPECIAL_CHARACTERISTICS__CHARACTERISTIC_ID);
		createEAttribute(specialCharacteristicsEClass, SPECIAL_CHARACTERISTICS__NAME);
		createEAttribute(specialCharacteristicsEClass, SPECIAL_CHARACTERISTICS__DESCRIPTION);
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
		initEClass(fleetEClass, Fleet.class, "Fleet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFleet_FleetID(), ecorePackage.getEString(), "fleetID", null, 0, 1, Fleet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFleet_Name(), ecorePackage.getEString(), "name", null, 0, 1, Fleet.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFleet_Vehicles(), this.getVehicle(), null, "vehicles", null, 0, -1, Fleet.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleEClass, Vehicle.class, "Vehicle", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicle_VehicleID(), ecorePackage.getEString(), "vehicleID", null, 0, 1, Vehicle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicle_Vehicletype(), this.getVehicleType(), null, "vehicletype", null, 0, 1, Vehicle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicle_Capacity(), this.getCapacity(), null, "capacity", null, 0, 1, Vehicle.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicle_Availability(), this.getAvailability(), null, "availability", null, 0, 1,
				Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVehicle_Specialcharacteristics(), this.getSpecialCharacteristics(), null,
				"specialcharacteristics", null, 0, -1, Vehicle.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(vehicleTypeEClass, VehicleType.class, "VehicleType", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVehicleType_TypeID(), ecorePackage.getEString(), "typeID", null, 0, 1, VehicleType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleType_Name(), ecorePackage.getEString(), "name", null, 0, 1, VehicleType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVehicleType_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				VehicleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(capacityEClass, Capacity.class, "Capacity", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCapacity_CapacityID(), ecorePackage.getEString(), "capacityID", null, 0, 1, Capacity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_Weight(), ecorePackage.getEInt(), "weight", null, 0, 1, Capacity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_Volume(), ecorePackage.getEInt(), "volume", null, 0, 1, Capacity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCapacity_NumberOfItems(), ecorePackage.getEInt(), "numberOfItems", null, 0, 1, Capacity.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(availabilityEClass, Availability.class, "Availability", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAvailability_AvailabilityID(), ecorePackage.getEString(), "availabilityID", null, 0, 1,
				Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailability_Status(), ecorePackage.getEString(), "status", null, 0, 1, Availability.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailability_AvailabilityStart(), ecorePackage.getEDate(), "availabilityStart", null, 0, 1,
				Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAvailability_AvailabilityEnd(), ecorePackage.getEDate(), "availabilityEnd", null, 0, 1,
				Availability.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(specialCharacteristicsEClass, SpecialCharacteristics.class, "SpecialCharacteristics", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpecialCharacteristics_CharacteristicID(), ecorePackage.getEString(), "characteristicID",
				null, 0, 1, SpecialCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialCharacteristics_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				SpecialCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpecialCharacteristics_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				SpecialCharacteristics.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //Mm3PackageImpl
