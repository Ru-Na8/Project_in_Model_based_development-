/**
 */
package mm3;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mm3.Mm3Factory
 * @model kind="package"
 * @generated
 */
public interface Mm3Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mm3";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mm3";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm3";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mm3Package eINSTANCE = mm3.impl.Mm3PackageImpl.init();

	/**
	 * The meta object id for the '{@link mm3.impl.FleetImpl <em>Fleet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm3.impl.FleetImpl
	 * @see mm3.impl.Mm3PackageImpl#getFleet()
	 * @generated
	 */
	int FLEET = 0;

	/**
	 * The feature id for the '<em><b>Fleet ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET__FLEET_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET__NAME = 1;

	/**
	 * The feature id for the '<em><b>Vehicles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET__VEHICLES = 2;

	/**
	 * The number of structural features of the '<em>Fleet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Fleet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FLEET_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm3.impl.VehicleImpl <em>Vehicle</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm3.impl.VehicleImpl
	 * @see mm3.impl.Mm3PackageImpl#getVehicle()
	 * @generated
	 */
	int VEHICLE = 1;

	/**
	 * The feature id for the '<em><b>Vehicle ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__VEHICLE_ID = 0;

	/**
	 * The feature id for the '<em><b>Vehicletype</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__VEHICLETYPE = 1;

	/**
	 * The feature id for the '<em><b>Capacity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__CAPACITY = 2;

	/**
	 * The feature id for the '<em><b>Availability</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__AVAILABILITY = 3;

	/**
	 * The feature id for the '<em><b>Specialcharacteristics</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE__SPECIALCHARACTERISTICS = 4;

	/**
	 * The number of structural features of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Vehicle</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm3.impl.VehicleTypeImpl <em>Vehicle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm3.impl.VehicleTypeImpl
	 * @see mm3.impl.Mm3PackageImpl#getVehicleType()
	 * @generated
	 */
	int VEHICLE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Type ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__TYPE_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Vehicle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Vehicle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VEHICLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm3.impl.CapacityImpl <em>Capacity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm3.impl.CapacityImpl
	 * @see mm3.impl.Mm3PackageImpl#getCapacity()
	 * @generated
	 */
	int CAPACITY = 3;

	/**
	 * The feature id for the '<em><b>Capacity ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__CAPACITY_ID = 0;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__WEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__VOLUME = 2;

	/**
	 * The feature id for the '<em><b>Number Of Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY__NUMBER_OF_ITEMS = 3;

	/**
	 * The number of structural features of the '<em>Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Capacity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CAPACITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm3.impl.AvailabilityImpl <em>Availability</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm3.impl.AvailabilityImpl
	 * @see mm3.impl.Mm3PackageImpl#getAvailability()
	 * @generated
	 */
	int AVAILABILITY = 4;

	/**
	 * The feature id for the '<em><b>Availability ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__AVAILABILITY_ID = 0;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__STATUS = 1;

	/**
	 * The feature id for the '<em><b>Availability Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__AVAILABILITY_START = 2;

	/**
	 * The feature id for the '<em><b>Availability End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY__AVAILABILITY_END = 3;

	/**
	 * The number of structural features of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Availability</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AVAILABILITY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm3.impl.SpecialCharacteristicsImpl <em>Special Characteristics</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm3.impl.SpecialCharacteristicsImpl
	 * @see mm3.impl.Mm3PackageImpl#getSpecialCharacteristics()
	 * @generated
	 */
	int SPECIAL_CHARACTERISTICS = 5;

	/**
	 * The feature id for the '<em><b>Characteristic ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_CHARACTERISTICS__CHARACTERISTIC_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_CHARACTERISTICS__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_CHARACTERISTICS__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Special Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_CHARACTERISTICS_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Special Characteristics</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPECIAL_CHARACTERISTICS_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link mm3.Fleet <em>Fleet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fleet</em>'.
	 * @see mm3.Fleet
	 * @generated
	 */
	EClass getFleet();

	/**
	 * Returns the meta object for the attribute '{@link mm3.Fleet#getFleetID <em>Fleet ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fleet ID</em>'.
	 * @see mm3.Fleet#getFleetID()
	 * @see #getFleet()
	 * @generated
	 */
	EAttribute getFleet_FleetID();

	/**
	 * Returns the meta object for the attribute '{@link mm3.Fleet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm3.Fleet#getName()
	 * @see #getFleet()
	 * @generated
	 */
	EAttribute getFleet_Name();

	/**
	 * Returns the meta object for the reference list '{@link mm3.Fleet#getVehicles <em>Vehicles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Vehicles</em>'.
	 * @see mm3.Fleet#getVehicles()
	 * @see #getFleet()
	 * @generated
	 */
	EReference getFleet_Vehicles();

	/**
	 * Returns the meta object for class '{@link mm3.Vehicle <em>Vehicle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle</em>'.
	 * @see mm3.Vehicle
	 * @generated
	 */
	EClass getVehicle();

	/**
	 * Returns the meta object for the attribute '{@link mm3.Vehicle#getVehicleID <em>Vehicle ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Vehicle ID</em>'.
	 * @see mm3.Vehicle#getVehicleID()
	 * @see #getVehicle()
	 * @generated
	 */
	EAttribute getVehicle_VehicleID();

	/**
	 * Returns the meta object for the reference '{@link mm3.Vehicle#getVehicletype <em>Vehicletype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Vehicletype</em>'.
	 * @see mm3.Vehicle#getVehicletype()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Vehicletype();

	/**
	 * Returns the meta object for the reference '{@link mm3.Vehicle#getCapacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Capacity</em>'.
	 * @see mm3.Vehicle#getCapacity()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Capacity();

	/**
	 * Returns the meta object for the reference '{@link mm3.Vehicle#getAvailability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Availability</em>'.
	 * @see mm3.Vehicle#getAvailability()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Availability();

	/**
	 * Returns the meta object for the reference list '{@link mm3.Vehicle#getSpecialcharacteristics <em>Specialcharacteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Specialcharacteristics</em>'.
	 * @see mm3.Vehicle#getSpecialcharacteristics()
	 * @see #getVehicle()
	 * @generated
	 */
	EReference getVehicle_Specialcharacteristics();

	/**
	 * Returns the meta object for class '{@link mm3.VehicleType <em>Vehicle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vehicle Type</em>'.
	 * @see mm3.VehicleType
	 * @generated
	 */
	EClass getVehicleType();

	/**
	 * Returns the meta object for the attribute '{@link mm3.VehicleType#getTypeID <em>Type ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type ID</em>'.
	 * @see mm3.VehicleType#getTypeID()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_TypeID();

	/**
	 * Returns the meta object for the attribute '{@link mm3.VehicleType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm3.VehicleType#getName()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm3.VehicleType#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mm3.VehicleType#getDescription()
	 * @see #getVehicleType()
	 * @generated
	 */
	EAttribute getVehicleType_Description();

	/**
	 * Returns the meta object for class '{@link mm3.Capacity <em>Capacity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Capacity</em>'.
	 * @see mm3.Capacity
	 * @generated
	 */
	EClass getCapacity();

	/**
	 * Returns the meta object for the attribute '{@link mm3.Capacity#getCapacityID <em>Capacity ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Capacity ID</em>'.
	 * @see mm3.Capacity#getCapacityID()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_CapacityID();

	/**
	 * Returns the meta object for the attribute '{@link mm3.Capacity#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see mm3.Capacity#getWeight()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_Weight();

	/**
	 * Returns the meta object for the attribute '{@link mm3.Capacity#getVolume <em>Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Volume</em>'.
	 * @see mm3.Capacity#getVolume()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_Volume();

	/**
	 * Returns the meta object for the attribute '{@link mm3.Capacity#getNumberOfItems <em>Number Of Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Number Of Items</em>'.
	 * @see mm3.Capacity#getNumberOfItems()
	 * @see #getCapacity()
	 * @generated
	 */
	EAttribute getCapacity_NumberOfItems();

	/**
	 * Returns the meta object for class '{@link mm3.Availability <em>Availability</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Availability</em>'.
	 * @see mm3.Availability
	 * @generated
	 */
	EClass getAvailability();

	/**
	 * Returns the meta object for the attribute '{@link mm3.Availability#getAvailabilityID <em>Availability ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability ID</em>'.
	 * @see mm3.Availability#getAvailabilityID()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_AvailabilityID();

	/**
	 * Returns the meta object for the attribute '{@link mm3.Availability#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see mm3.Availability#getStatus()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_Status();

	/**
	 * Returns the meta object for the attribute '{@link mm3.Availability#getAvailabilityStart <em>Availability Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability Start</em>'.
	 * @see mm3.Availability#getAvailabilityStart()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_AvailabilityStart();

	/**
	 * Returns the meta object for the attribute '{@link mm3.Availability#getAvailabilityEnd <em>Availability End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Availability End</em>'.
	 * @see mm3.Availability#getAvailabilityEnd()
	 * @see #getAvailability()
	 * @generated
	 */
	EAttribute getAvailability_AvailabilityEnd();

	/**
	 * Returns the meta object for class '{@link mm3.SpecialCharacteristics <em>Special Characteristics</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Special Characteristics</em>'.
	 * @see mm3.SpecialCharacteristics
	 * @generated
	 */
	EClass getSpecialCharacteristics();

	/**
	 * Returns the meta object for the attribute '{@link mm3.SpecialCharacteristics#getCharacteristicID <em>Characteristic ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Characteristic ID</em>'.
	 * @see mm3.SpecialCharacteristics#getCharacteristicID()
	 * @see #getSpecialCharacteristics()
	 * @generated
	 */
	EAttribute getSpecialCharacteristics_CharacteristicID();

	/**
	 * Returns the meta object for the attribute '{@link mm3.SpecialCharacteristics#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm3.SpecialCharacteristics#getName()
	 * @see #getSpecialCharacteristics()
	 * @generated
	 */
	EAttribute getSpecialCharacteristics_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm3.SpecialCharacteristics#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see mm3.SpecialCharacteristics#getDescription()
	 * @see #getSpecialCharacteristics()
	 * @generated
	 */
	EAttribute getSpecialCharacteristics_Description();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mm3Factory getMm3Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mm3.impl.FleetImpl <em>Fleet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm3.impl.FleetImpl
		 * @see mm3.impl.Mm3PackageImpl#getFleet()
		 * @generated
		 */
		EClass FLEET = eINSTANCE.getFleet();

		/**
		 * The meta object literal for the '<em><b>Fleet ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLEET__FLEET_ID = eINSTANCE.getFleet_FleetID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FLEET__NAME = eINSTANCE.getFleet_Name();

		/**
		 * The meta object literal for the '<em><b>Vehicles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FLEET__VEHICLES = eINSTANCE.getFleet_Vehicles();

		/**
		 * The meta object literal for the '{@link mm3.impl.VehicleImpl <em>Vehicle</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm3.impl.VehicleImpl
		 * @see mm3.impl.Mm3PackageImpl#getVehicle()
		 * @generated
		 */
		EClass VEHICLE = eINSTANCE.getVehicle();

		/**
		 * The meta object literal for the '<em><b>Vehicle ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE__VEHICLE_ID = eINSTANCE.getVehicle_VehicleID();

		/**
		 * The meta object literal for the '<em><b>Vehicletype</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__VEHICLETYPE = eINSTANCE.getVehicle_Vehicletype();

		/**
		 * The meta object literal for the '<em><b>Capacity</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__CAPACITY = eINSTANCE.getVehicle_Capacity();

		/**
		 * The meta object literal for the '<em><b>Availability</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__AVAILABILITY = eINSTANCE.getVehicle_Availability();

		/**
		 * The meta object literal for the '<em><b>Specialcharacteristics</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VEHICLE__SPECIALCHARACTERISTICS = eINSTANCE.getVehicle_Specialcharacteristics();

		/**
		 * The meta object literal for the '{@link mm3.impl.VehicleTypeImpl <em>Vehicle Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm3.impl.VehicleTypeImpl
		 * @see mm3.impl.Mm3PackageImpl#getVehicleType()
		 * @generated
		 */
		EClass VEHICLE_TYPE = eINSTANCE.getVehicleType();

		/**
		 * The meta object literal for the '<em><b>Type ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__TYPE_ID = eINSTANCE.getVehicleType_TypeID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__NAME = eINSTANCE.getVehicleType_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VEHICLE_TYPE__DESCRIPTION = eINSTANCE.getVehicleType_Description();

		/**
		 * The meta object literal for the '{@link mm3.impl.CapacityImpl <em>Capacity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm3.impl.CapacityImpl
		 * @see mm3.impl.Mm3PackageImpl#getCapacity()
		 * @generated
		 */
		EClass CAPACITY = eINSTANCE.getCapacity();

		/**
		 * The meta object literal for the '<em><b>Capacity ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__CAPACITY_ID = eINSTANCE.getCapacity_CapacityID();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__WEIGHT = eINSTANCE.getCapacity_Weight();

		/**
		 * The meta object literal for the '<em><b>Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__VOLUME = eINSTANCE.getCapacity_Volume();

		/**
		 * The meta object literal for the '<em><b>Number Of Items</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CAPACITY__NUMBER_OF_ITEMS = eINSTANCE.getCapacity_NumberOfItems();

		/**
		 * The meta object literal for the '{@link mm3.impl.AvailabilityImpl <em>Availability</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm3.impl.AvailabilityImpl
		 * @see mm3.impl.Mm3PackageImpl#getAvailability()
		 * @generated
		 */
		EClass AVAILABILITY = eINSTANCE.getAvailability();

		/**
		 * The meta object literal for the '<em><b>Availability ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__AVAILABILITY_ID = eINSTANCE.getAvailability_AvailabilityID();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__STATUS = eINSTANCE.getAvailability_Status();

		/**
		 * The meta object literal for the '<em><b>Availability Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__AVAILABILITY_START = eINSTANCE.getAvailability_AvailabilityStart();

		/**
		 * The meta object literal for the '<em><b>Availability End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AVAILABILITY__AVAILABILITY_END = eINSTANCE.getAvailability_AvailabilityEnd();

		/**
		 * The meta object literal for the '{@link mm3.impl.SpecialCharacteristicsImpl <em>Special Characteristics</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm3.impl.SpecialCharacteristicsImpl
		 * @see mm3.impl.Mm3PackageImpl#getSpecialCharacteristics()
		 * @generated
		 */
		EClass SPECIAL_CHARACTERISTICS = eINSTANCE.getSpecialCharacteristics();

		/**
		 * The meta object literal for the '<em><b>Characteristic ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_CHARACTERISTICS__CHARACTERISTIC_ID = eINSTANCE.getSpecialCharacteristics_CharacteristicID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_CHARACTERISTICS__NAME = eINSTANCE.getSpecialCharacteristics_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPECIAL_CHARACTERISTICS__DESCRIPTION = eINSTANCE.getSpecialCharacteristics_Description();

	}

} //Mm3Package
