/**
 */
package mm2.impl;

import java.util.Date;

import mm2.DeliveryDetails;
import mm2.Mm2Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delivery Details</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm2.impl.DeliveryDetailsImpl#getDeliveryAddress <em>Delivery Address</em>}</li>
 *   <li>{@link mm2.impl.DeliveryDetailsImpl#getDeliveryDate <em>Delivery Date</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliveryDetailsImpl extends MinimalEObjectImpl.Container implements DeliveryDetails {
	/**
	 * The default value of the '{@link #getDeliveryAddress() <em>Delivery Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryAddress()
	 * @generated
	 * @ordered
	 */
	protected static final String DELIVERY_ADDRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryAddress() <em>Delivery Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryAddress()
	 * @generated
	 * @ordered
	 */
	protected String deliveryAddress = DELIVERY_ADDRESS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DELIVERY_DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryDate() <em>Delivery Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryDate()
	 * @generated
	 * @ordered
	 */
	protected Date deliveryDate = DELIVERY_DATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliveryDetailsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm2Package.Literals.DELIVERY_DETAILS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryAddress(String newDeliveryAddress) {
		String oldDeliveryAddress = deliveryAddress;
		deliveryAddress = newDeliveryAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.DELIVERY_DETAILS__DELIVERY_ADDRESS,
					oldDeliveryAddress, deliveryAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliveryDate(Date newDeliveryDate) {
		Date oldDeliveryDate = deliveryDate;
		deliveryDate = newDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.DELIVERY_DETAILS__DELIVERY_DATE,
					oldDeliveryDate, deliveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mm2Package.DELIVERY_DETAILS__DELIVERY_ADDRESS:
			return getDeliveryAddress();
		case Mm2Package.DELIVERY_DETAILS__DELIVERY_DATE:
			return getDeliveryDate();
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
		case Mm2Package.DELIVERY_DETAILS__DELIVERY_ADDRESS:
			setDeliveryAddress((String) newValue);
			return;
		case Mm2Package.DELIVERY_DETAILS__DELIVERY_DATE:
			setDeliveryDate((Date) newValue);
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
		case Mm2Package.DELIVERY_DETAILS__DELIVERY_ADDRESS:
			setDeliveryAddress(DELIVERY_ADDRESS_EDEFAULT);
			return;
		case Mm2Package.DELIVERY_DETAILS__DELIVERY_DATE:
			setDeliveryDate(DELIVERY_DATE_EDEFAULT);
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
		case Mm2Package.DELIVERY_DETAILS__DELIVERY_ADDRESS:
			return DELIVERY_ADDRESS_EDEFAULT == null ? deliveryAddress != null
					: !DELIVERY_ADDRESS_EDEFAULT.equals(deliveryAddress);
		case Mm2Package.DELIVERY_DETAILS__DELIVERY_DATE:
			return DELIVERY_DATE_EDEFAULT == null ? deliveryDate != null : !DELIVERY_DATE_EDEFAULT.equals(deliveryDate);
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
		result.append(" (deliveryAddress: ");
		result.append(deliveryAddress);
		result.append(", deliveryDate: ");
		result.append(deliveryDate);
		result.append(')');
		return result.toString();
	}

} //DeliveryDetailsImpl
