/**
 */
package mm3.impl;

import java.util.Collection;

import mm3.Fleet;
import mm3.Mm3Package;
import mm3.Vehicle;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fleet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm3.impl.FleetImpl#getFleetID <em>Fleet ID</em>}</li>
 *   <li>{@link mm3.impl.FleetImpl#getName <em>Name</em>}</li>
 *   <li>{@link mm3.impl.FleetImpl#getVehicles <em>Vehicles</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FleetImpl extends MinimalEObjectImpl.Container implements Fleet {
	/**
	 * The default value of the '{@link #getFleetID() <em>Fleet ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFleetID()
	 * @generated
	 * @ordered
	 */
	protected static final String FLEET_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFleetID() <em>Fleet ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFleetID()
	 * @generated
	 * @ordered
	 */
	protected String fleetID = FLEET_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getVehicles() <em>Vehicles</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVehicles()
	 * @generated
	 * @ordered
	 */
	protected EList<Vehicle> vehicles;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FleetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm3Package.Literals.FLEET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFleetID() {
		return fleetID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFleetID(String newFleetID) {
		String oldFleetID = fleetID;
		fleetID = newFleetID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.FLEET__FLEET_ID, oldFleetID, fleetID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.FLEET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Vehicle> getVehicles() {
		if (vehicles == null) {
			vehicles = new EObjectResolvingEList<Vehicle>(Vehicle.class, this, Mm3Package.FLEET__VEHICLES);
		}
		return vehicles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mm3Package.FLEET__FLEET_ID:
			return getFleetID();
		case Mm3Package.FLEET__NAME:
			return getName();
		case Mm3Package.FLEET__VEHICLES:
			return getVehicles();
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
		case Mm3Package.FLEET__FLEET_ID:
			setFleetID((String) newValue);
			return;
		case Mm3Package.FLEET__NAME:
			setName((String) newValue);
			return;
		case Mm3Package.FLEET__VEHICLES:
			getVehicles().clear();
			getVehicles().addAll((Collection<? extends Vehicle>) newValue);
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
		case Mm3Package.FLEET__FLEET_ID:
			setFleetID(FLEET_ID_EDEFAULT);
			return;
		case Mm3Package.FLEET__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Mm3Package.FLEET__VEHICLES:
			getVehicles().clear();
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
		case Mm3Package.FLEET__FLEET_ID:
			return FLEET_ID_EDEFAULT == null ? fleetID != null : !FLEET_ID_EDEFAULT.equals(fleetID);
		case Mm3Package.FLEET__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Mm3Package.FLEET__VEHICLES:
			return vehicles != null && !vehicles.isEmpty();
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
		result.append(" (fleetID: ");
		result.append(fleetID);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //FleetImpl
