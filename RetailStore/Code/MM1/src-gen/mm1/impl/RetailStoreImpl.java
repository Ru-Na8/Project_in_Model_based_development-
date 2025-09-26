/**
 */
package mm1.impl;

import java.util.Collection;

import mm1.Iteam;
import mm1.Location;
import mm1.Mm1Package;
import mm1.RetailStore;

import mm1.TimeInterval;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Retail Store</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm1.impl.RetailStoreImpl#getStoreID <em>Store ID</em>}</li>
 *   <li>{@link mm1.impl.RetailStoreImpl#getName <em>Name</em>}</li>
 *   <li>{@link mm1.impl.RetailStoreImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link mm1.impl.RetailStoreImpl#getStockesIteams <em>Stockes Iteams</em>}</li>
 *   <li>{@link mm1.impl.RetailStoreImpl#getDeliveryWindows <em>Delivery Windows</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RetailStoreImpl extends MinimalEObjectImpl.Container implements RetailStore {
	/**
	 * The default value of the '{@link #getStoreID() <em>Store ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreID()
	 * @generated
	 * @ordered
	 */
	protected static final String STORE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStoreID() <em>Store ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStoreID()
	 * @generated
	 * @ordered
	 */
	protected String storeID = STORE_ID_EDEFAULT;

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
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected Location location;

	/**
	 * The cached value of the '{@link #getStockesIteams() <em>Stockes Iteams</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStockesIteams()
	 * @generated
	 * @ordered
	 */
	protected EList<Iteam> stockesIteams;

	/**
	 * The cached value of the '{@link #getDeliveryWindows() <em>Delivery Windows</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryWindows()
	 * @generated
	 * @ordered
	 */
	protected EList<TimeInterval> deliveryWindows;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RetailStoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm1Package.Literals.RETAIL_STORE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStoreID() {
		return storeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStoreID(String newStoreID) {
		String oldStoreID = storeID;
		storeID = newStoreID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm1Package.RETAIL_STORE__STORE_ID, oldStoreID,
					storeID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mm1Package.RETAIL_STORE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLocation(Location newLocation, NotificationChain msgs) {
		Location oldLocation = location;
		location = newLocation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mm1Package.RETAIL_STORE__LOCATION, oldLocation, newLocation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocation(Location newLocation) {
		if (newLocation != location) {
			NotificationChain msgs = null;
			if (location != null)
				msgs = ((InternalEObject) location).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Mm1Package.RETAIL_STORE__LOCATION, null, msgs);
			if (newLocation != null)
				msgs = ((InternalEObject) newLocation).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Mm1Package.RETAIL_STORE__LOCATION, null, msgs);
			msgs = basicSetLocation(newLocation, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm1Package.RETAIL_STORE__LOCATION, newLocation,
					newLocation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Iteam> getStockesIteams() {
		if (stockesIteams == null) {
			stockesIteams = new EObjectContainmentEList<Iteam>(Iteam.class, this,
					Mm1Package.RETAIL_STORE__STOCKES_ITEAMS);
		}
		return stockesIteams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TimeInterval> getDeliveryWindows() {
		if (deliveryWindows == null) {
			deliveryWindows = new EObjectResolvingEList<TimeInterval>(TimeInterval.class, this,
					Mm1Package.RETAIL_STORE__DELIVERY_WINDOWS);
		}
		return deliveryWindows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mm1Package.RETAIL_STORE__LOCATION:
			return basicSetLocation(null, msgs);
		case Mm1Package.RETAIL_STORE__STOCKES_ITEAMS:
			return ((InternalEList<?>) getStockesIteams()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mm1Package.RETAIL_STORE__STORE_ID:
			return getStoreID();
		case Mm1Package.RETAIL_STORE__NAME:
			return getName();
		case Mm1Package.RETAIL_STORE__LOCATION:
			return getLocation();
		case Mm1Package.RETAIL_STORE__STOCKES_ITEAMS:
			return getStockesIteams();
		case Mm1Package.RETAIL_STORE__DELIVERY_WINDOWS:
			return getDeliveryWindows();
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
		case Mm1Package.RETAIL_STORE__STORE_ID:
			setStoreID((String) newValue);
			return;
		case Mm1Package.RETAIL_STORE__NAME:
			setName((String) newValue);
			return;
		case Mm1Package.RETAIL_STORE__LOCATION:
			setLocation((Location) newValue);
			return;
		case Mm1Package.RETAIL_STORE__STOCKES_ITEAMS:
			getStockesIteams().clear();
			getStockesIteams().addAll((Collection<? extends Iteam>) newValue);
			return;
		case Mm1Package.RETAIL_STORE__DELIVERY_WINDOWS:
			getDeliveryWindows().clear();
			getDeliveryWindows().addAll((Collection<? extends TimeInterval>) newValue);
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
		case Mm1Package.RETAIL_STORE__STORE_ID:
			setStoreID(STORE_ID_EDEFAULT);
			return;
		case Mm1Package.RETAIL_STORE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Mm1Package.RETAIL_STORE__LOCATION:
			setLocation((Location) null);
			return;
		case Mm1Package.RETAIL_STORE__STOCKES_ITEAMS:
			getStockesIteams().clear();
			return;
		case Mm1Package.RETAIL_STORE__DELIVERY_WINDOWS:
			getDeliveryWindows().clear();
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
		case Mm1Package.RETAIL_STORE__STORE_ID:
			return STORE_ID_EDEFAULT == null ? storeID != null : !STORE_ID_EDEFAULT.equals(storeID);
		case Mm1Package.RETAIL_STORE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Mm1Package.RETAIL_STORE__LOCATION:
			return location != null;
		case Mm1Package.RETAIL_STORE__STOCKES_ITEAMS:
			return stockesIteams != null && !stockesIteams.isEmpty();
		case Mm1Package.RETAIL_STORE__DELIVERY_WINDOWS:
			return deliveryWindows != null && !deliveryWindows.isEmpty();
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
		result.append(" (storeID: ");
		result.append(storeID);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //RetailStoreImpl
