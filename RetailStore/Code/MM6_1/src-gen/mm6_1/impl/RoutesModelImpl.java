/**
 */
package mm6_1.impl;

import java.util.Collection;

import mm6_1.Location;
import mm6_1.Mm6_1Package;
import mm6_1.Order;
import mm6_1.Route;
import mm6_1.RoutesModel;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Routes Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm6_1.impl.RoutesModelImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link mm6_1.impl.RoutesModelImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link mm6_1.impl.RoutesModelImpl#getShortestPaths <em>Shortest Paths</em>}</li>
 *   <li>{@link mm6_1.impl.RoutesModelImpl#getOrders <em>Orders</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RoutesModelImpl extends MinimalEObjectImpl.Container implements RoutesModel {
	/**
	 * The cached value of the '{@link #getRoutes() <em>Routes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> routes;

	/**
	 * The cached value of the '{@link #getLocation() <em>Location</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocation()
	 * @generated
	 * @ordered
	 */
	protected EList<Location> location;

	/**
	 * The cached value of the '{@link #getShortestPaths() <em>Shortest Paths</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortestPaths()
	 * @generated
	 * @ordered
	 */
	protected EList<Route> shortestPaths;

	/**
	 * The cached value of the '{@link #getOrders() <em>Orders</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrders()
	 * @generated
	 * @ordered
	 */
	protected EList<Order> orders;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RoutesModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm6_1Package.Literals.ROUTES_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Route> getRoutes() {
		if (routes == null) {
			routes = new EObjectContainmentEList<Route>(Route.class, this, Mm6_1Package.ROUTES_MODEL__ROUTES);
		}
		return routes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Location> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<Location>(Location.class, this, Mm6_1Package.ROUTES_MODEL__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Route> getShortestPaths() {
		if (shortestPaths == null) {
			shortestPaths = new EObjectContainmentEList<Route>(Route.class, this,
					Mm6_1Package.ROUTES_MODEL__SHORTEST_PATHS);
		}
		return shortestPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Order> getOrders() {
		if (orders == null) {
			orders = new EObjectContainmentEList<Order>(Order.class, this, Mm6_1Package.ROUTES_MODEL__ORDERS);
		}
		return orders;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mm6_1Package.ROUTES_MODEL__ROUTES:
			return ((InternalEList<?>) getRoutes()).basicRemove(otherEnd, msgs);
		case Mm6_1Package.ROUTES_MODEL__LOCATION:
			return ((InternalEList<?>) getLocation()).basicRemove(otherEnd, msgs);
		case Mm6_1Package.ROUTES_MODEL__SHORTEST_PATHS:
			return ((InternalEList<?>) getShortestPaths()).basicRemove(otherEnd, msgs);
		case Mm6_1Package.ROUTES_MODEL__ORDERS:
			return ((InternalEList<?>) getOrders()).basicRemove(otherEnd, msgs);
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
		case Mm6_1Package.ROUTES_MODEL__ROUTES:
			return getRoutes();
		case Mm6_1Package.ROUTES_MODEL__LOCATION:
			return getLocation();
		case Mm6_1Package.ROUTES_MODEL__SHORTEST_PATHS:
			return getShortestPaths();
		case Mm6_1Package.ROUTES_MODEL__ORDERS:
			return getOrders();
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
		case Mm6_1Package.ROUTES_MODEL__ROUTES:
			getRoutes().clear();
			getRoutes().addAll((Collection<? extends Route>) newValue);
			return;
		case Mm6_1Package.ROUTES_MODEL__LOCATION:
			getLocation().clear();
			getLocation().addAll((Collection<? extends Location>) newValue);
			return;
		case Mm6_1Package.ROUTES_MODEL__SHORTEST_PATHS:
			getShortestPaths().clear();
			getShortestPaths().addAll((Collection<? extends Route>) newValue);
			return;
		case Mm6_1Package.ROUTES_MODEL__ORDERS:
			getOrders().clear();
			getOrders().addAll((Collection<? extends Order>) newValue);
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
		case Mm6_1Package.ROUTES_MODEL__ROUTES:
			getRoutes().clear();
			return;
		case Mm6_1Package.ROUTES_MODEL__LOCATION:
			getLocation().clear();
			return;
		case Mm6_1Package.ROUTES_MODEL__SHORTEST_PATHS:
			getShortestPaths().clear();
			return;
		case Mm6_1Package.ROUTES_MODEL__ORDERS:
			getOrders().clear();
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
		case Mm6_1Package.ROUTES_MODEL__ROUTES:
			return routes != null && !routes.isEmpty();
		case Mm6_1Package.ROUTES_MODEL__LOCATION:
			return location != null && !location.isEmpty();
		case Mm6_1Package.ROUTES_MODEL__SHORTEST_PATHS:
			return shortestPaths != null && !shortestPaths.isEmpty();
		case Mm6_1Package.ROUTES_MODEL__ORDERS:
			return orders != null && !orders.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RoutesModelImpl
