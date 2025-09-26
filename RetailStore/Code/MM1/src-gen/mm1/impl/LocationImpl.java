/**
 */
package mm1.impl;

import mm1.Location;
import mm1.Mm1Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm1.impl.LocationImpl#getAddress <em>Address</em>}</li>
 *   <li>{@link mm1.impl.LocationImpl#getPostalCode <em>Postal Code</em>}</li>
 *   <li>{@link mm1.impl.LocationImpl#getCity <em>City</em>}</li>
 *   <li>{@link mm1.impl.LocationImpl#getBuildingNumber <em>Building Number</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocationImpl extends MinimalEObjectImpl.Container implements Location {
	/**
	 * The default value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected String address = ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected static final int POSTAL_CODE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPostalCode() <em>Postal Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPostalCode()
	 * @generated
	 * @ordered
	 */
	protected int postalCode = POSTAL_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected static final String CITY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCity() <em>City</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCity()
	 * @generated
	 * @ordered
	 */
	protected String city = CITY_EDEFAULT;

	/**
	 * The default value of the '{@link #getBuildingNumber() <em>Building Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int BUILDING_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getBuildingNumber() <em>Building Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBuildingNumber()
	 * @generated
	 * @ordered
	 */
	protected int buildingNumber = BUILDING_NUMBER_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm1Package.Literals.LOCATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(String newAddress) {
		String oldAddress = address;
		address = newAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm1Package.LOCATION__ADDRESS, oldAddress, address));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPostalCode() {
		return postalCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPostalCode(int newPostalCode) {
		int oldPostalCode = postalCode;
		postalCode = newPostalCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm1Package.LOCATION__POSTAL_CODE, oldPostalCode,
					postalCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCity() {
		return city;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCity(String newCity) {
		String oldCity = city;
		city = newCity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm1Package.LOCATION__CITY, oldCity, city));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getBuildingNumber() {
		return buildingNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBuildingNumber(int newBuildingNumber) {
		int oldBuildingNumber = buildingNumber;
		buildingNumber = newBuildingNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm1Package.LOCATION__BUILDING_NUMBER,
					oldBuildingNumber, buildingNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mm1Package.LOCATION__ADDRESS:
			return getAddress();
		case Mm1Package.LOCATION__POSTAL_CODE:
			return getPostalCode();
		case Mm1Package.LOCATION__CITY:
			return getCity();
		case Mm1Package.LOCATION__BUILDING_NUMBER:
			return getBuildingNumber();
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
		case Mm1Package.LOCATION__ADDRESS:
			setAddress((String) newValue);
			return;
		case Mm1Package.LOCATION__POSTAL_CODE:
			setPostalCode((Integer) newValue);
			return;
		case Mm1Package.LOCATION__CITY:
			setCity((String) newValue);
			return;
		case Mm1Package.LOCATION__BUILDING_NUMBER:
			setBuildingNumber((Integer) newValue);
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
		case Mm1Package.LOCATION__ADDRESS:
			setAddress(ADDRESS_EDEFAULT);
			return;
		case Mm1Package.LOCATION__POSTAL_CODE:
			setPostalCode(POSTAL_CODE_EDEFAULT);
			return;
		case Mm1Package.LOCATION__CITY:
			setCity(CITY_EDEFAULT);
			return;
		case Mm1Package.LOCATION__BUILDING_NUMBER:
			setBuildingNumber(BUILDING_NUMBER_EDEFAULT);
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
		case Mm1Package.LOCATION__ADDRESS:
			return ADDRESS_EDEFAULT == null ? address != null : !ADDRESS_EDEFAULT.equals(address);
		case Mm1Package.LOCATION__POSTAL_CODE:
			return postalCode != POSTAL_CODE_EDEFAULT;
		case Mm1Package.LOCATION__CITY:
			return CITY_EDEFAULT == null ? city != null : !CITY_EDEFAULT.equals(city);
		case Mm1Package.LOCATION__BUILDING_NUMBER:
			return buildingNumber != BUILDING_NUMBER_EDEFAULT;
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
		result.append(" (address: ");
		result.append(address);
		result.append(", postalCode: ");
		result.append(postalCode);
		result.append(", city: ");
		result.append(city);
		result.append(", buildingNumber: ");
		result.append(buildingNumber);
		result.append(')');
		return result.toString();
	}

} //LocationImpl
