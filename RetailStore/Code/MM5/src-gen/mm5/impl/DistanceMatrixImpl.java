/**
 */
package mm5.impl;

import java.util.Collection;

import mm5.Distance;
import mm5.DistanceMatrix;
import mm5.Location;
import mm5.Mm5Package;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Distance Matrix</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm5.impl.DistanceMatrixImpl#getLocation <em>Location</em>}</li>
 *   <li>{@link mm5.impl.DistanceMatrixImpl#getDistance <em>Distance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DistanceMatrixImpl extends MinimalEObjectImpl.Container implements DistanceMatrix {
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
	 * The cached value of the '{@link #getDistance() <em>Distance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDistance()
	 * @generated
	 * @ordered
	 */
	protected EList<Distance> distance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DistanceMatrixImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm5Package.Literals.DISTANCE_MATRIX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Location> getLocation() {
		if (location == null) {
			location = new EObjectContainmentEList<Location>(Location.class, this,
					Mm5Package.DISTANCE_MATRIX__LOCATION);
		}
		return location;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Distance> getDistance() {
		if (distance == null) {
			distance = new EObjectContainmentEList<Distance>(Distance.class, this,
					Mm5Package.DISTANCE_MATRIX__DISTANCE);
		}
		return distance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mm5Package.DISTANCE_MATRIX__LOCATION:
			return ((InternalEList<?>) getLocation()).basicRemove(otherEnd, msgs);
		case Mm5Package.DISTANCE_MATRIX__DISTANCE:
			return ((InternalEList<?>) getDistance()).basicRemove(otherEnd, msgs);
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
		case Mm5Package.DISTANCE_MATRIX__LOCATION:
			return getLocation();
		case Mm5Package.DISTANCE_MATRIX__DISTANCE:
			return getDistance();
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
		case Mm5Package.DISTANCE_MATRIX__LOCATION:
			getLocation().clear();
			getLocation().addAll((Collection<? extends Location>) newValue);
			return;
		case Mm5Package.DISTANCE_MATRIX__DISTANCE:
			getDistance().clear();
			getDistance().addAll((Collection<? extends Distance>) newValue);
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
		case Mm5Package.DISTANCE_MATRIX__LOCATION:
			getLocation().clear();
			return;
		case Mm5Package.DISTANCE_MATRIX__DISTANCE:
			getDistance().clear();
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
		case Mm5Package.DISTANCE_MATRIX__LOCATION:
			return location != null && !location.isEmpty();
		case Mm5Package.DISTANCE_MATRIX__DISTANCE:
			return distance != null && !distance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DistanceMatrixImpl
