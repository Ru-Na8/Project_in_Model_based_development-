/**
 */
package mm6_1.impl;

import mm6_1.Mm6_1Package;
import mm6_1.Route;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm6_1.impl.RouteImpl#getFrom <em>From</em>}</li>
 *   <li>{@link mm6_1.impl.RouteImpl#getTo <em>To</em>}</li>
 *   <li>{@link mm6_1.impl.RouteImpl#getTravelTime <em>Travel Time</em>}</li>
 *   <li>{@link mm6_1.impl.RouteImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RouteImpl extends MinimalEObjectImpl.Container implements Route {
	/**
	 * The default value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected static final String FROM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected String from = FROM_EDEFAULT;

	/**
	 * The default value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected static final String TO_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected String to = TO_EDEFAULT;

	/**
	 * The default value of the '{@link #getTravelTime() <em>Travel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelTime()
	 * @generated
	 * @ordered
	 */
	protected static final double TRAVEL_TIME_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getTravelTime() <em>Travel Time</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTravelTime()
	 * @generated
	 * @ordered
	 */
	protected double travelTime = TRAVEL_TIME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected static final double DISTANCE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected double distance = DISTANCE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RouteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm6_1Package.Literals.ROUTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(String newFrom) {
		String oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm6_1Package.ROUTE__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(String newTo) {
		String oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm6_1Package.ROUTE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getTravelTime() {
		return travelTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTravelTime(double newTravelTime) {
		double oldTravelTime = travelTime;
		travelTime = newTravelTime;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm6_1Package.ROUTE__TRAVEL_TIME, oldTravelTime,
					travelTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getDistance() {
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDistance(double newDistance) {
		double oldDistance = distance;
		distance = newDistance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm6_1Package.ROUTE__DISTANCE, oldDistance, distance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mm6_1Package.ROUTE__FROM:
			return getFrom();
		case Mm6_1Package.ROUTE__TO:
			return getTo();
		case Mm6_1Package.ROUTE__TRAVEL_TIME:
			return getTravelTime();
		case Mm6_1Package.ROUTE__DISTANCE:
			return getDistance();
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
		case Mm6_1Package.ROUTE__FROM:
			setFrom((String) newValue);
			return;
		case Mm6_1Package.ROUTE__TO:
			setTo((String) newValue);
			return;
		case Mm6_1Package.ROUTE__TRAVEL_TIME:
			setTravelTime((Double) newValue);
			return;
		case Mm6_1Package.ROUTE__DISTANCE:
			setDistance((Double) newValue);
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
		case Mm6_1Package.ROUTE__FROM:
			setFrom(FROM_EDEFAULT);
			return;
		case Mm6_1Package.ROUTE__TO:
			setTo(TO_EDEFAULT);
			return;
		case Mm6_1Package.ROUTE__TRAVEL_TIME:
			setTravelTime(TRAVEL_TIME_EDEFAULT);
			return;
		case Mm6_1Package.ROUTE__DISTANCE:
			setDistance(DISTANCE_EDEFAULT);
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
		case Mm6_1Package.ROUTE__FROM:
			return FROM_EDEFAULT == null ? from != null : !FROM_EDEFAULT.equals(from);
		case Mm6_1Package.ROUTE__TO:
			return TO_EDEFAULT == null ? to != null : !TO_EDEFAULT.equals(to);
		case Mm6_1Package.ROUTE__TRAVEL_TIME:
			return travelTime != TRAVEL_TIME_EDEFAULT;
		case Mm6_1Package.ROUTE__DISTANCE:
			return distance != DISTANCE_EDEFAULT;
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
		result.append(" (from: ");
		result.append(from);
		result.append(", to: ");
		result.append(to);
		result.append(", travelTime: ");
		result.append(travelTime);
		result.append(", distance: ");
		result.append(distance);
		result.append(')');
		return result.toString();
	}

} //RouteImpl
