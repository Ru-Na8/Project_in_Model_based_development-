/**
 */
package mm2.impl;

import mm2.Mm2Package;
import mm2.OrderIteam;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Iteam</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm2.impl.OrderIteamImpl#getIteamName <em>Iteam Name</em>}</li>
 *   <li>{@link mm2.impl.OrderIteamImpl#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderIteamImpl extends MinimalEObjectImpl.Container implements OrderIteam {
	/**
	 * The default value of the '{@link #getIteamName() <em>Iteam Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteamName()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIteamName() <em>Iteam Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIteamName()
	 * @generated
	 * @ordered
	 */
	protected String iteamName = ITEAM_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected static final int QUANTITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getQuantity() <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantity()
	 * @generated
	 * @ordered
	 */
	protected int quantity = QUANTITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderIteamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm2Package.Literals.ORDER_ITEAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIteamName() {
		return iteamName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIteamName(String newIteamName) {
		String oldIteamName = iteamName;
		iteamName = newIteamName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.ORDER_ITEAM__ITEAM_NAME, oldIteamName,
					iteamName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantity(int newQuantity) {
		int oldQuantity = quantity;
		quantity = newQuantity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.ORDER_ITEAM__QUANTITY, oldQuantity,
					quantity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mm2Package.ORDER_ITEAM__ITEAM_NAME:
			return getIteamName();
		case Mm2Package.ORDER_ITEAM__QUANTITY:
			return getQuantity();
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
		case Mm2Package.ORDER_ITEAM__ITEAM_NAME:
			setIteamName((String) newValue);
			return;
		case Mm2Package.ORDER_ITEAM__QUANTITY:
			setQuantity((Integer) newValue);
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
		case Mm2Package.ORDER_ITEAM__ITEAM_NAME:
			setIteamName(ITEAM_NAME_EDEFAULT);
			return;
		case Mm2Package.ORDER_ITEAM__QUANTITY:
			setQuantity(QUANTITY_EDEFAULT);
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
		case Mm2Package.ORDER_ITEAM__ITEAM_NAME:
			return ITEAM_NAME_EDEFAULT == null ? iteamName != null : !ITEAM_NAME_EDEFAULT.equals(iteamName);
		case Mm2Package.ORDER_ITEAM__QUANTITY:
			return quantity != QUANTITY_EDEFAULT;
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
		result.append(" (iteamName: ");
		result.append(iteamName);
		result.append(", quantity: ");
		result.append(quantity);
		result.append(')');
		return result.toString();
	}

} //OrderIteamImpl
