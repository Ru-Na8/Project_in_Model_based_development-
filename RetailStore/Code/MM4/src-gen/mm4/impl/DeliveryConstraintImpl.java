/**
 */
package mm4.impl;

import java.util.Date;

import mm4.DeliveryConstraint;
import mm4.Mm4Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Delivery Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm4.impl.DeliveryConstraintImpl#getConstraintID <em>Constraint ID</em>}</li>
 *   <li>{@link mm4.impl.DeliveryConstraintImpl#getMaximumWeight <em>Maximum Weight</em>}</li>
 *   <li>{@link mm4.impl.DeliveryConstraintImpl#getMaximumVolume <em>Maximum Volume</em>}</li>
 *   <li>{@link mm4.impl.DeliveryConstraintImpl#getDeliveryTimeFrameStart <em>Delivery Time Frame Start</em>}</li>
 *   <li>{@link mm4.impl.DeliveryConstraintImpl#getDeliveryTimeFrameEnd <em>Delivery Time Frame End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DeliveryConstraintImpl extends MinimalEObjectImpl.Container implements DeliveryConstraint {
	/**
	 * The default value of the '{@link #getConstraintID() <em>Constraint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINT_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintID() <em>Constraint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintID()
	 * @generated
	 * @ordered
	 */
	protected String constraintID = CONSTRAINT_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumWeight() <em>Maximum Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumWeight()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_WEIGHT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumWeight() <em>Maximum Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumWeight()
	 * @generated
	 * @ordered
	 */
	protected int maximumWeight = MAXIMUM_WEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaximumVolume() <em>Maximum Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumVolume()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_VOLUME_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getMaximumVolume() <em>Maximum Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximumVolume()
	 * @generated
	 * @ordered
	 */
	protected int maximumVolume = MAXIMUM_VOLUME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryTimeFrameStart() <em>Delivery Time Frame Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryTimeFrameStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date DELIVERY_TIME_FRAME_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryTimeFrameStart() <em>Delivery Time Frame Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryTimeFrameStart()
	 * @generated
	 * @ordered
	 */
	protected Date deliveryTimeFrameStart = DELIVERY_TIME_FRAME_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getDeliveryTimeFrameEnd() <em>Delivery Time Frame End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryTimeFrameEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date DELIVERY_TIME_FRAME_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeliveryTimeFrameEnd() <em>Delivery Time Frame End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryTimeFrameEnd()
	 * @generated
	 * @ordered
	 */
	protected Date deliveryTimeFrameEnd = DELIVERY_TIME_FRAME_END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DeliveryConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm4Package.Literals.DELIVERY_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstraintID() {
		return constraintID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintID(String newConstraintID) {
		String oldConstraintID = constraintID;
		constraintID = newConstraintID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm4Package.DELIVERY_CONSTRAINT__CONSTRAINT_ID,
					oldConstraintID, constraintID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaximumWeight() {
		return maximumWeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumWeight(int newMaximumWeight) {
		int oldMaximumWeight = maximumWeight;
		maximumWeight = newMaximumWeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm4Package.DELIVERY_CONSTRAINT__MAXIMUM_WEIGHT,
					oldMaximumWeight, maximumWeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getMaximumVolume() {
		return maximumVolume;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMaximumVolume(int newMaximumVolume) {
		int oldMaximumVolume = maximumVolume;
		maximumVolume = newMaximumVolume;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm4Package.DELIVERY_CONSTRAINT__MAXIMUM_VOLUME,
					oldMaximumVolume, maximumVolume));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDeliveryTimeFrameStart() {
		return deliveryTimeFrameStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryTimeFrameStart(Date newDeliveryTimeFrameStart) {
		Date oldDeliveryTimeFrameStart = deliveryTimeFrameStart;
		deliveryTimeFrameStart = newDeliveryTimeFrameStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Mm4Package.DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_START, oldDeliveryTimeFrameStart,
					deliveryTimeFrameStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDeliveryTimeFrameEnd() {
		return deliveryTimeFrameEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryTimeFrameEnd(Date newDeliveryTimeFrameEnd) {
		Date oldDeliveryTimeFrameEnd = deliveryTimeFrameEnd;
		deliveryTimeFrameEnd = newDeliveryTimeFrameEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					Mm4Package.DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_END, oldDeliveryTimeFrameEnd,
					deliveryTimeFrameEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mm4Package.DELIVERY_CONSTRAINT__CONSTRAINT_ID:
			return getConstraintID();
		case Mm4Package.DELIVERY_CONSTRAINT__MAXIMUM_WEIGHT:
			return getMaximumWeight();
		case Mm4Package.DELIVERY_CONSTRAINT__MAXIMUM_VOLUME:
			return getMaximumVolume();
		case Mm4Package.DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_START:
			return getDeliveryTimeFrameStart();
		case Mm4Package.DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_END:
			return getDeliveryTimeFrameEnd();
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
		case Mm4Package.DELIVERY_CONSTRAINT__CONSTRAINT_ID:
			setConstraintID((String) newValue);
			return;
		case Mm4Package.DELIVERY_CONSTRAINT__MAXIMUM_WEIGHT:
			setMaximumWeight((Integer) newValue);
			return;
		case Mm4Package.DELIVERY_CONSTRAINT__MAXIMUM_VOLUME:
			setMaximumVolume((Integer) newValue);
			return;
		case Mm4Package.DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_START:
			setDeliveryTimeFrameStart((Date) newValue);
			return;
		case Mm4Package.DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_END:
			setDeliveryTimeFrameEnd((Date) newValue);
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
		case Mm4Package.DELIVERY_CONSTRAINT__CONSTRAINT_ID:
			setConstraintID(CONSTRAINT_ID_EDEFAULT);
			return;
		case Mm4Package.DELIVERY_CONSTRAINT__MAXIMUM_WEIGHT:
			setMaximumWeight(MAXIMUM_WEIGHT_EDEFAULT);
			return;
		case Mm4Package.DELIVERY_CONSTRAINT__MAXIMUM_VOLUME:
			setMaximumVolume(MAXIMUM_VOLUME_EDEFAULT);
			return;
		case Mm4Package.DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_START:
			setDeliveryTimeFrameStart(DELIVERY_TIME_FRAME_START_EDEFAULT);
			return;
		case Mm4Package.DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_END:
			setDeliveryTimeFrameEnd(DELIVERY_TIME_FRAME_END_EDEFAULT);
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
		case Mm4Package.DELIVERY_CONSTRAINT__CONSTRAINT_ID:
			return CONSTRAINT_ID_EDEFAULT == null ? constraintID != null : !CONSTRAINT_ID_EDEFAULT.equals(constraintID);
		case Mm4Package.DELIVERY_CONSTRAINT__MAXIMUM_WEIGHT:
			return maximumWeight != MAXIMUM_WEIGHT_EDEFAULT;
		case Mm4Package.DELIVERY_CONSTRAINT__MAXIMUM_VOLUME:
			return maximumVolume != MAXIMUM_VOLUME_EDEFAULT;
		case Mm4Package.DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_START:
			return DELIVERY_TIME_FRAME_START_EDEFAULT == null ? deliveryTimeFrameStart != null
					: !DELIVERY_TIME_FRAME_START_EDEFAULT.equals(deliveryTimeFrameStart);
		case Mm4Package.DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_END:
			return DELIVERY_TIME_FRAME_END_EDEFAULT == null ? deliveryTimeFrameEnd != null
					: !DELIVERY_TIME_FRAME_END_EDEFAULT.equals(deliveryTimeFrameEnd);
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
		result.append(" (constraintID: ");
		result.append(constraintID);
		result.append(", maximumWeight: ");
		result.append(maximumWeight);
		result.append(", maximumVolume: ");
		result.append(maximumVolume);
		result.append(", deliveryTimeFrameStart: ");
		result.append(deliveryTimeFrameStart);
		result.append(", deliveryTimeFrameEnd: ");
		result.append(deliveryTimeFrameEnd);
		result.append(')');
		return result.toString();
	}

} //DeliveryConstraintImpl
