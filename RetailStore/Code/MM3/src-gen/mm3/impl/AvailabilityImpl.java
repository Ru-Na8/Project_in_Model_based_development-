/**
 */
package mm3.impl;

import java.util.Date;

import mm3.Availability;
import mm3.Mm3Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Availability</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm3.impl.AvailabilityImpl#getAvailabilityID <em>Availability ID</em>}</li>
 *   <li>{@link mm3.impl.AvailabilityImpl#getStatus <em>Status</em>}</li>
 *   <li>{@link mm3.impl.AvailabilityImpl#getAvailabilityStart <em>Availability Start</em>}</li>
 *   <li>{@link mm3.impl.AvailabilityImpl#getAvailabilityEnd <em>Availability End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AvailabilityImpl extends MinimalEObjectImpl.Container implements Availability {
	/**
	 * The default value of the '{@link #getAvailabilityID() <em>Availability ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityID()
	 * @generated
	 * @ordered
	 */
	protected static final String AVAILABILITY_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityID() <em>Availability ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityID()
	 * @generated
	 * @ordered
	 */
	protected String availabilityID = AVAILABILITY_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final String STATUS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected String status = STATUS_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailabilityStart() <em>Availability Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityStart()
	 * @generated
	 * @ordered
	 */
	protected static final Date AVAILABILITY_START_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityStart() <em>Availability Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityStart()
	 * @generated
	 * @ordered
	 */
	protected Date availabilityStart = AVAILABILITY_START_EDEFAULT;

	/**
	 * The default value of the '{@link #getAvailabilityEnd() <em>Availability End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityEnd()
	 * @generated
	 * @ordered
	 */
	protected static final Date AVAILABILITY_END_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAvailabilityEnd() <em>Availability End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAvailabilityEnd()
	 * @generated
	 * @ordered
	 */
	protected Date availabilityEnd = AVAILABILITY_END_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AvailabilityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm3Package.Literals.AVAILABILITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAvailabilityID() {
		return availabilityID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilityID(String newAvailabilityID) {
		String oldAvailabilityID = availabilityID;
		availabilityID = newAvailabilityID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.AVAILABILITY__AVAILABILITY_ID,
					oldAvailabilityID, availabilityID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(String newStatus) {
		String oldStatus = status;
		status = newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.AVAILABILITY__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAvailabilityStart() {
		return availabilityStart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilityStart(Date newAvailabilityStart) {
		Date oldAvailabilityStart = availabilityStart;
		availabilityStart = newAvailabilityStart;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.AVAILABILITY__AVAILABILITY_START,
					oldAvailabilityStart, availabilityStart));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getAvailabilityEnd() {
		return availabilityEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAvailabilityEnd(Date newAvailabilityEnd) {
		Date oldAvailabilityEnd = availabilityEnd;
		availabilityEnd = newAvailabilityEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm3Package.AVAILABILITY__AVAILABILITY_END,
					oldAvailabilityEnd, availabilityEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mm3Package.AVAILABILITY__AVAILABILITY_ID:
			return getAvailabilityID();
		case Mm3Package.AVAILABILITY__STATUS:
			return getStatus();
		case Mm3Package.AVAILABILITY__AVAILABILITY_START:
			return getAvailabilityStart();
		case Mm3Package.AVAILABILITY__AVAILABILITY_END:
			return getAvailabilityEnd();
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
		case Mm3Package.AVAILABILITY__AVAILABILITY_ID:
			setAvailabilityID((String) newValue);
			return;
		case Mm3Package.AVAILABILITY__STATUS:
			setStatus((String) newValue);
			return;
		case Mm3Package.AVAILABILITY__AVAILABILITY_START:
			setAvailabilityStart((Date) newValue);
			return;
		case Mm3Package.AVAILABILITY__AVAILABILITY_END:
			setAvailabilityEnd((Date) newValue);
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
		case Mm3Package.AVAILABILITY__AVAILABILITY_ID:
			setAvailabilityID(AVAILABILITY_ID_EDEFAULT);
			return;
		case Mm3Package.AVAILABILITY__STATUS:
			setStatus(STATUS_EDEFAULT);
			return;
		case Mm3Package.AVAILABILITY__AVAILABILITY_START:
			setAvailabilityStart(AVAILABILITY_START_EDEFAULT);
			return;
		case Mm3Package.AVAILABILITY__AVAILABILITY_END:
			setAvailabilityEnd(AVAILABILITY_END_EDEFAULT);
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
		case Mm3Package.AVAILABILITY__AVAILABILITY_ID:
			return AVAILABILITY_ID_EDEFAULT == null ? availabilityID != null
					: !AVAILABILITY_ID_EDEFAULT.equals(availabilityID);
		case Mm3Package.AVAILABILITY__STATUS:
			return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
		case Mm3Package.AVAILABILITY__AVAILABILITY_START:
			return AVAILABILITY_START_EDEFAULT == null ? availabilityStart != null
					: !AVAILABILITY_START_EDEFAULT.equals(availabilityStart);
		case Mm3Package.AVAILABILITY__AVAILABILITY_END:
			return AVAILABILITY_END_EDEFAULT == null ? availabilityEnd != null
					: !AVAILABILITY_END_EDEFAULT.equals(availabilityEnd);
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
		result.append(" (availabilityID: ");
		result.append(availabilityID);
		result.append(", status: ");
		result.append(status);
		result.append(", availabilityStart: ");
		result.append(availabilityStart);
		result.append(", availabilityEnd: ");
		result.append(availabilityEnd);
		result.append(')');
		return result.toString();
	}

} //AvailabilityImpl
