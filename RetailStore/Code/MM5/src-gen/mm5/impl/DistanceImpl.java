/**
 */
package mm5.impl;

import mm5.Distance;
import mm5.Location;
import mm5.Mm5Package;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm5.impl.DistanceImpl#getDistance <em>Distance</em>}</li>
 *   <li>{@link mm5.impl.DistanceImpl#getTravelTime <em>Travel Time</em>}</li>
 *   <li>{@link mm5.impl.DistanceImpl#getFrom <em>From</em>}</li>
 *   <li>{@link mm5.impl.DistanceImpl#getTo <em>To</em>}</li>
 *   <li>{@link mm5.impl.DistanceImpl#getRouteID <em>Route ID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistanceImpl extends MinimalEObjectImpl.Container implements Distance {
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
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected Location from;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm5Package.Literals.DISTANCE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mm5Package.DISTANCE__DISTANCE, oldDistance,
					distance));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mm5Package.DISTANCE__TRAVEL_TIME, oldTravelTime,
					travelTime));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Location getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject) from;
			from = (Location) eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mm5Package.DISTANCE__FROM, oldFrom,
							from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(Location newFrom) {
		Location oldFrom = from;
		from = newFrom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm5Package.DISTANCE__FROM, oldFrom, from));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mm5Package.DISTANCE__DISTANCE:
			return getDistance();
		case Mm5Package.DISTANCE__TRAVEL_TIME:
			return getTravelTime();
		case Mm5Package.DISTANCE__FROM:
			if (resolve)
				return getFrom();
			return basicGetFrom();
		case Mm5Package.DISTANCE__TO:
			if (resolve)
				return getTo();
			return basicGetTo();
		case Mm5Package.DISTANCE__ROUTE_ID:
			return getRouteID();
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
		case Mm5Package.DISTANCE__DISTANCE:
			setDistance((Double) newValue);
			return;
		case Mm5Package.DISTANCE__TRAVEL_TIME:
			setTravelTime((Double) newValue);
			return;
		case Mm5Package.DISTANCE__FROM:
			setFrom((Location) newValue);
			return;
		case Mm5Package.DISTANCE__TO:
			setTo((Location) newValue);
			return;
		case Mm5Package.DISTANCE__ROUTE_ID:
			setRouteID((String) newValue);
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
		case Mm5Package.DISTANCE__DISTANCE:
			setDistance(DISTANCE_EDEFAULT);
			return;
		case Mm5Package.DISTANCE__TRAVEL_TIME:
			setTravelTime(TRAVEL_TIME_EDEFAULT);
			return;
		case Mm5Package.DISTANCE__FROM:
			setFrom((Location) null);
			return;
		case Mm5Package.DISTANCE__TO:
			setTo((Location) null);
			return;
		case Mm5Package.DISTANCE__ROUTE_ID:
			setRouteID(ROUTE_ID_EDEFAULT);
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
		case Mm5Package.DISTANCE__DISTANCE:
			return distance != DISTANCE_EDEFAULT;
		case Mm5Package.DISTANCE__TRAVEL_TIME:
			return travelTime != TRAVEL_TIME_EDEFAULT;
		case Mm5Package.DISTANCE__FROM:
			return from != null;
		case Mm5Package.DISTANCE__TO:
			return to != null;
		case Mm5Package.DISTANCE__ROUTE_ID:
			return ROUTE_ID_EDEFAULT == null ? routeID != null : !ROUTE_ID_EDEFAULT.equals(routeID);
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
		result.append(" (distance: ");
		result.append(distance);
		result.append(", travelTime: ");
		result.append(travelTime);
		result.append(", routeID: ");
		result.append(routeID);
		result.append(')');
		return result.toString();
	}

	protected Location to; // Field for the 'to' reference

	/**
	 * The default value of the '{@link #getRouteID() <em>Route ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteID()
	 * @generated
	 * @ordered
	 */
	protected static final String ROUTE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRouteID() <em>Route ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteID()
	 * @generated
	 * @ordered
	 */
	protected String routeID = ROUTE_ID_EDEFAULT;

	@Override
	public void setTo(Location value) {
		// TODO Auto-generated method stub
		this.to = value;

	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRouteID() {
		return routeID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRouteID(String newRouteID) {
		String oldRouteID = routeID;
		routeID = newRouteID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm5Package.DISTANCE__ROUTE_ID, oldRouteID, routeID));
	}

	@Override
	public Location getTo() {
		// TODO Auto-generated method stub
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Location basicGetTo() {
		return to;
	}
} //DistanceImpl
