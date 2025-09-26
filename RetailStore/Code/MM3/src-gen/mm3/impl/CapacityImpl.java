/**
 */
package mm3.impl;

import mm3.Capacity;
import mm3.Mm3Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Capacity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm3.impl.CapacityImpl#getCapacityID <em>Capacity ID</em>}</li>
 *   <li>{@link mm3.impl.CapacityImpl#getWeight <em>Weight</em>}</li>
 *   <li>{@link mm3.impl.CapacityImpl#getVolume <em>Volume</em>}</li>
 *   <li>{@link mm3.impl.CapacityImpl#getNumberOfItems <em>Number Of Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CapacityImpl extends MinimalEObjectImpl.Container implements Capacity {
	/**
	 * The default value of the '{@link #getCapacityID() <em>Capacity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityID()
	 * @generated
	 * @ordered
	 */
	protected static final String CAPACITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapacityID() <em>Capacity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapacityID()
	 * @generated
	 * @ordered
	 */
	protected String capacityID = CAPACITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWeight() <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWeight()
	 * @generated
	 * @ordered
	 */
	protected int weight = WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected static final int VOLUME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getVolume() <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVolume()
	 * @generated
	 * @ordered
	 */
	protected int volume = VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumberOfItems() <em>Number Of Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfItems()
	 * @generated
	 * @ordered
	 */
	protected static final int NUMBER_OF_ITEMS_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumberOfItems() <em>Number Of Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfItems()
	 * @generated
	 * @ordered
	 */
	protected int numberOfItems = NUMBER_OF_ITEMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CapacityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm3Package.Literals.CAPACITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCapacityID() {
		return capacityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapacityID(String newCapacityID) {
		String oldCapacityID = capacityID;
		capacityID = newCapacityID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.CAPACITY__CAPACITY_ID, oldCapacityID,
					capacityID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWeight(int newWeight) {
		int oldWeight = weight;
		weight = newWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.CAPACITY__WEIGHT, oldWeight, weight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getVolume() {
		return volume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVolume(int newVolume) {
		int oldVolume = volume;
		volume = newVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.CAPACITY__VOLUME, oldVolume, volume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumberOfItems() {
		return numberOfItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumberOfItems(int newNumberOfItems) {
		int oldNumberOfItems = numberOfItems;
		numberOfItems = newNumberOfItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.CAPACITY__NUMBER_OF_ITEMS,
					oldNumberOfItems, numberOfItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mm3Package.CAPACITY__CAPACITY_ID:
			return getCapacityID();
		case Mm3Package.CAPACITY__WEIGHT:
			return getWeight();
		case Mm3Package.CAPACITY__VOLUME:
			return getVolume();
		case Mm3Package.CAPACITY__NUMBER_OF_ITEMS:
			return getNumberOfItems();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Mm3Package.CAPACITY__CAPACITY_ID:
			setCapacityID((String) newValue);
			return;
		case Mm3Package.CAPACITY__WEIGHT:
			setWeight((Integer) newValue);
			return;
		case Mm3Package.CAPACITY__VOLUME:
			setVolume((Integer) newValue);
			return;
		case Mm3Package.CAPACITY__NUMBER_OF_ITEMS:
			setNumberOfItems((Integer) newValue);
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
		case Mm3Package.CAPACITY__CAPACITY_ID:
			setCapacityID(CAPACITY_ID_EDEFAULT);
			return;
		case Mm3Package.CAPACITY__WEIGHT:
			setWeight(WEIGHT_EDEFAULT);
			return;
		case Mm3Package.CAPACITY__VOLUME:
			setVolume(VOLUME_EDEFAULT);
			return;
		case Mm3Package.CAPACITY__NUMBER_OF_ITEMS:
			setNumberOfItems(NUMBER_OF_ITEMS_EDEFAULT);
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
		case Mm3Package.CAPACITY__CAPACITY_ID:
			return CAPACITY_ID_EDEFAULT == null ? capacityID != null : !CAPACITY_ID_EDEFAULT.equals(capacityID);
		case Mm3Package.CAPACITY__WEIGHT:
			return weight != WEIGHT_EDEFAULT;
		case Mm3Package.CAPACITY__VOLUME:
			return volume != VOLUME_EDEFAULT;
		case Mm3Package.CAPACITY__NUMBER_OF_ITEMS:
			return numberOfItems != NUMBER_OF_ITEMS_EDEFAULT;
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
		result.append(" (capacityID: ");
		result.append(capacityID);
		result.append(", weight: ");
		result.append(weight);
		result.append(", volume: ");
		result.append(volume);
		result.append(", numberOfItems: ");
		result.append(numberOfItems);
		result.append(')');
		return result.toString();
	}

} //CapacityImpl
