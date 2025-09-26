/**
 */
package mm3.impl;

import mm3.Mm3Package;
import mm3.SpecialCharacteristics;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Special Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm3.impl.SpecialCharacteristicsImpl#getCharacteristicID <em>Characteristic ID</em>}</li>
 *   <li>{@link mm3.impl.SpecialCharacteristicsImpl#getName <em>Name</em>}</li>
 *   <li>{@link mm3.impl.SpecialCharacteristicsImpl#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpecialCharacteristicsImpl extends MinimalEObjectImpl.Container implements SpecialCharacteristics {
	/**
	 * The default value of the '{@link #getCharacteristicID() <em>Characteristic ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicID()
	 * @generated
	 * @ordered
	 */
	protected static final String CHARACTERISTIC_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacteristicID() <em>Characteristic ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacteristicID()
	 * @generated
	 * @ordered
	 */
	protected String characteristicID = CHARACTERISTIC_ID_EDEFAULT;

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
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpecialCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm3Package.Literals.SPECIAL_CHARACTERISTICS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCharacteristicID() {
		return characteristicID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacteristicID(String newCharacteristicID) {
		String oldCharacteristicID = characteristicID;
		characteristicID = newCharacteristicID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.SPECIAL_CHARACTERISTICS__CHARACTERISTIC_ID,
					oldCharacteristicID, characteristicID));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.SPECIAL_CHARACTERISTICS__NAME, oldName,
					name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.SPECIAL_CHARACTERISTICS__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mm3Package.SPECIAL_CHARACTERISTICS__CHARACTERISTIC_ID:
			return getCharacteristicID();
		case Mm3Package.SPECIAL_CHARACTERISTICS__NAME:
			return getName();
		case Mm3Package.SPECIAL_CHARACTERISTICS__DESCRIPTION:
			return getDescription();
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
		case Mm3Package.SPECIAL_CHARACTERISTICS__CHARACTERISTIC_ID:
			setCharacteristicID((String) newValue);
			return;
		case Mm3Package.SPECIAL_CHARACTERISTICS__NAME:
			setName((String) newValue);
			return;
		case Mm3Package.SPECIAL_CHARACTERISTICS__DESCRIPTION:
			setDescription((String) newValue);
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
		case Mm3Package.SPECIAL_CHARACTERISTICS__CHARACTERISTIC_ID:
			setCharacteristicID(CHARACTERISTIC_ID_EDEFAULT);
			return;
		case Mm3Package.SPECIAL_CHARACTERISTICS__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Mm3Package.SPECIAL_CHARACTERISTICS__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
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
		case Mm3Package.SPECIAL_CHARACTERISTICS__CHARACTERISTIC_ID:
			return CHARACTERISTIC_ID_EDEFAULT == null ? characteristicID != null
					: !CHARACTERISTIC_ID_EDEFAULT.equals(characteristicID);
		case Mm3Package.SPECIAL_CHARACTERISTICS__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Mm3Package.SPECIAL_CHARACTERISTICS__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
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
		result.append(" (characteristicID: ");
		result.append(characteristicID);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //SpecialCharacteristicsImpl
