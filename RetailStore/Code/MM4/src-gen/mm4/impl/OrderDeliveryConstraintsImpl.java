/**
 */
package mm4.impl;

import java.util.Collection;

import mm4.Mm4Package;
import mm4.OrderConstraint;
import mm4.OrderDeliveryConstraints;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Order Delivery Constraints</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm4.impl.OrderDeliveryConstraintsImpl#getConstraintsID <em>Constraints ID</em>}</li>
 *   <li>{@link mm4.impl.OrderDeliveryConstraintsImpl#getOrderconstraint <em>Orderconstraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderDeliveryConstraintsImpl extends MinimalEObjectImpl.Container implements OrderDeliveryConstraints {
	/**
	 * The default value of the '{@link #getConstraintsID() <em>Constraints ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintsID()
	 * @generated
	 * @ordered
	 */
	protected static final String CONSTRAINTS_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConstraintsID() <em>Constraints ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintsID()
	 * @generated
	 * @ordered
	 */
	protected String constraintsID = CONSTRAINTS_ID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOrderconstraint() <em>Orderconstraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderconstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderConstraint> orderconstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderDeliveryConstraintsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm4Package.Literals.ORDER_DELIVERY_CONSTRAINTS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getConstraintsID() {
		return constraintsID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConstraintsID(String newConstraintsID) {
		String oldConstraintsID = constraintsID;
		constraintsID = newConstraintsID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm4Package.ORDER_DELIVERY_CONSTRAINTS__CONSTRAINTS_ID,
					oldConstraintsID, constraintsID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<OrderConstraint> getOrderconstraint() {
		if (orderconstraint == null) {
			orderconstraint = new EObjectContainmentEList<OrderConstraint>(OrderConstraint.class, this,
					Mm4Package.ORDER_DELIVERY_CONSTRAINTS__ORDERCONSTRAINT);
		}
		return orderconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mm4Package.ORDER_DELIVERY_CONSTRAINTS__ORDERCONSTRAINT:
			return ((InternalEList<?>) getOrderconstraint()).basicRemove(otherEnd, msgs);
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
		case Mm4Package.ORDER_DELIVERY_CONSTRAINTS__CONSTRAINTS_ID:
			return getConstraintsID();
		case Mm4Package.ORDER_DELIVERY_CONSTRAINTS__ORDERCONSTRAINT:
			return getOrderconstraint();
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
		case Mm4Package.ORDER_DELIVERY_CONSTRAINTS__CONSTRAINTS_ID:
			setConstraintsID((String) newValue);
			return;
		case Mm4Package.ORDER_DELIVERY_CONSTRAINTS__ORDERCONSTRAINT:
			getOrderconstraint().clear();
			getOrderconstraint().addAll((Collection<? extends OrderConstraint>) newValue);
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
		case Mm4Package.ORDER_DELIVERY_CONSTRAINTS__CONSTRAINTS_ID:
			setConstraintsID(CONSTRAINTS_ID_EDEFAULT);
			return;
		case Mm4Package.ORDER_DELIVERY_CONSTRAINTS__ORDERCONSTRAINT:
			getOrderconstraint().clear();
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
		case Mm4Package.ORDER_DELIVERY_CONSTRAINTS__CONSTRAINTS_ID:
			return CONSTRAINTS_ID_EDEFAULT == null ? constraintsID != null
					: !CONSTRAINTS_ID_EDEFAULT.equals(constraintsID);
		case Mm4Package.ORDER_DELIVERY_CONSTRAINTS__ORDERCONSTRAINT:
			return orderconstraint != null && !orderconstraint.isEmpty();
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
		result.append(" (constraintsID: ");
		result.append(constraintsID);
		result.append(')');
		return result.toString();
	}

} //OrderDeliveryConstraintsImpl
