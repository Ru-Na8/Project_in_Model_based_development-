/**
 */
package mm3.impl;

import mm3.*;

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
public class Mm3FactoryImpl extends EFactoryImpl implements Mm3Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Mm3Factory init() {
		try {
			Mm3Factory theMm3Factory = (Mm3Factory) EPackage.Registry.INSTANCE.getEFactory(Mm3Package.eNS_URI);
			if (theMm3Factory != null) {
				return theMm3Factory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Mm3FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mm3FactoryImpl() {
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
		case Mm3Package.FLEET:
			return createFleet();
		case Mm3Package.VEHICLE:
			return createVehicle();
		case Mm3Package.VEHICLE_TYPE:
			return createVehicleType();
		case Mm3Package.CAPACITY:
			return createCapacity();
		case Mm3Package.AVAILABILITY:
			return createAvailability();
		case Mm3Package.SPECIAL_CHARACTERISTICS:
			return createSpecialCharacteristics();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fleet createFleet() {
		FleetImpl fleet = new FleetImpl();
		return fleet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vehicle createVehicle() {
		VehicleImpl vehicle = new VehicleImpl();
		return vehicle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleType createVehicleType() {
		VehicleTypeImpl vehicleType = new VehicleTypeImpl();
		return vehicleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capacity createCapacity() {
		CapacityImpl capacity = new CapacityImpl();
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availability createAvailability() {
		AvailabilityImpl availability = new AvailabilityImpl();
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialCharacteristics createSpecialCharacteristics() {
		SpecialCharacteristicsImpl specialCharacteristics = new SpecialCharacteristicsImpl();
		return specialCharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mm3Package getMm3Package() {
		return (Mm3Package) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Mm3Package getPackage() {
		return Mm3Package.eINSTANCE;
	}

} //Mm3FactoryImpl
