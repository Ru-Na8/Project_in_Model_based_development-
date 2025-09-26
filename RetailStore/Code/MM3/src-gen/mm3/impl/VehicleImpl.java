/**
 */
package mm3.impl;

import java.util.Collection;

import mm3.Availability;
import mm3.Capacity;
import mm3.Mm3Package;
import mm3.SpecialCharacteristics;
import mm3.Vehicle;
import mm3.VehicleType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vehicle</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm3.impl.VehicleImpl#getVehicleID <em>Vehicle ID</em>}</li>
 *   <li>{@link mm3.impl.VehicleImpl#getVehicletype <em>Vehicletype</em>}</li>
 *   <li>{@link mm3.impl.VehicleImpl#getCapacity <em>Capacity</em>}</li>
 *   <li>{@link mm3.impl.VehicleImpl#getAvailability <em>Availability</em>}</li>
 *   <li>{@link mm3.impl.VehicleImpl#getSpecialcharacteristics <em>Specialcharacteristics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VehicleImpl extends MinimalEObjectImpl.Container implements Vehicle {
	/**
	 * The default value of the '{@link #getVehicleID() <em>Vehicle ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleID()
	 * @generated
	 * @ordered
	 */
	protected static final String VEHICLE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVehicleID() <em>Vehicle ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicleID()
	 * @generated
	 * @ordered
	 */
	protected String vehicleID = VEHICLE_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVehicletype() <em>Vehicletype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicletype()
	 * @generated
	 * @ordered
	 */
	protected VehicleType vehicletype;

	/**
	 * The cached value of the '{@link #getCapacity() <em>Capacity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacity()
	 * @generated
	 * @ordered
	 */
	protected Capacity capacity;

	/**
	 * The cached value of the '{@link #getAvailability() <em>Availability</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailability()
	 * @generated
	 * @ordered
	 */
	protected Availability availability;

	/**
	 * The cached value of the '{@link #getSpecialcharacteristics() <em>Specialcharacteristics</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialcharacteristics()
	 * @generated
	 * @ordered
	 */
	protected EList<SpecialCharacteristics> specialcharacteristics;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VehicleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm3Package.Literals.VEHICLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVehicleID() {
		return vehicleID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicleID(String newVehicleID) {
		String oldVehicleID = vehicleID;
		vehicleID = newVehicleID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.VEHICLE__VEHICLE_ID, oldVehicleID,
					vehicleID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleType getVehicletype() {
		if (vehicletype != null && vehicletype.eIsProxy()) {
			InternalEObject oldVehicletype = (InternalEObject) vehicletype;
			vehicletype = (VehicleType) eResolveProxy(oldVehicletype);
			if (vehicletype != oldVehicletype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mm3Package.VEHICLE__VEHICLETYPE,
							oldVehicletype, vehicletype));
			}
		}
		return vehicletype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleType basicGetVehicletype() {
		return vehicletype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVehicletype(VehicleType newVehicletype) {
		VehicleType oldVehicletype = vehicletype;
		vehicletype = newVehicletype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.VEHICLE__VEHICLETYPE, oldVehicletype,
					vehicletype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capacity getCapacity() {
		if (capacity != null && capacity.eIsProxy()) {
			InternalEObject oldCapacity = (InternalEObject) capacity;
			capacity = (Capacity) eResolveProxy(oldCapacity);
			if (capacity != oldCapacity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mm3Package.VEHICLE__CAPACITY, oldCapacity,
							capacity));
			}
		}
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Capacity basicGetCapacity() {
		return capacity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacity(Capacity newCapacity) {
		Capacity oldCapacity = capacity;
		capacity = newCapacity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.VEHICLE__CAPACITY, oldCapacity, capacity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availability getAvailability() {
		if (availability != null && availability.eIsProxy()) {
			InternalEObject oldAvailability = (InternalEObject) availability;
			availability = (Availability) eResolveProxy(oldAvailability);
			if (availability != oldAvailability) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mm3Package.VEHICLE__AVAILABILITY,
							oldAvailability, availability));
			}
		}
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Availability basicGetAvailability() {
		return availability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailability(Availability newAvailability) {
		Availability oldAvailability = availability;
		availability = newAvailability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.VEHICLE__AVAILABILITY, oldAvailability,
					availability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SpecialCharacteristics> getSpecialcharacteristics() {
		if (specialcharacteristics == null) {
			specialcharacteristics = new EObjectResolvingEList<SpecialCharacteristics>(SpecialCharacteristics.class,
					this, Mm3Package.VEHICLE__SPECIALCHARACTERISTICS);
		}
		return specialcharacteristics;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mm3Package.VEHICLE__VEHICLE_ID:
			return getVehicleID();
		case Mm3Package.VEHICLE__VEHICLETYPE:
			if (resolve)
				return getVehicletype();
			return basicGetVehicletype();
		case Mm3Package.VEHICLE__CAPACITY:
			if (resolve)
				return getCapacity();
			return basicGetCapacity();
		case Mm3Package.VEHICLE__AVAILABILITY:
			if (resolve)
				return getAvailability();
			return basicGetAvailability();
		case Mm3Package.VEHICLE__SPECIALCHARACTERISTICS:
			return getSpecialcharacteristics();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Mm3Package.VEHICLE__VEHICLE_ID:
			setVehicleID((String) newValue);
			return;
		case Mm3Package.VEHICLE__VEHICLETYPE:
			setVehicletype((VehicleType) newValue);
			return;
		case Mm3Package.VEHICLE__CAPACITY:
			setCapacity((Capacity) newValue);
			return;
		case Mm3Package.VEHICLE__AVAILABILITY:
			setAvailability((Availability) newValue);
			return;
		case Mm3Package.VEHICLE__SPECIALCHARACTERISTICS:
			getSpecialcharacteristics().clear();
			getSpecialcharacteristics().addAll((Collection<? extends SpecialCharacteristics>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case Mm3Package.VEHICLE__VEHICLE_ID:
			setVehicleID(VEHICLE_ID_EDEFAULT);
			return;
		case Mm3Package.VEHICLE__VEHICLETYPE:
			setVehicletype((VehicleType) null);
			return;
		case Mm3Package.VEHICLE__CAPACITY:
			setCapacity((Capacity) null);
			return;
		case Mm3Package.VEHICLE__AVAILABILITY:
			setAvailability((Availability) null);
			return;
		case Mm3Package.VEHICLE__SPECIALCHARACTERISTICS:
			getSpecialcharacteristics().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case Mm3Package.VEHICLE__VEHICLE_ID:
			return VEHICLE_ID_EDEFAULT == null ? vehicleID != null : !VEHICLE_ID_EDEFAULT.equals(vehicleID);
		case Mm3Package.VEHICLE__VEHICLETYPE:
			return vehicletype != null;
		case Mm3Package.VEHICLE__CAPACITY:
			return capacity != null;
		case Mm3Package.VEHICLE__AVAILABILITY:
			return availability != null;
		case Mm3Package.VEHICLE__SPECIALCHARACTERISTICS:
			return specialcharacteristics != null && !specialcharacteristics.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (vehicleID: ");
		result.append(vehicleID);
		result.append(')');
		return result.toString();
	}

} //VehicleImpl
