/**
 */
package mm4.impl;

import java.util.Collection;

import mm4.DeliveryConstraint;
import mm4.Mm4Package;
import mm4.OrderConstraint;

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
 * An implementation of the model object '<em><b>Order Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm4.impl.OrderConstraintImpl#getPriorityLevel <em>Priority Level</em>}</li>
 *   <li>{@link mm4.impl.OrderConstraintImpl#getConstraintID <em>Constraint ID</em>}</li>
 *   <li>{@link mm4.impl.OrderConstraintImpl#getDeliveryconstraint <em>Deliveryconstraint</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderConstraintImpl extends MinimalEObjectImpl.Container implements OrderConstraint {
	/**
	 * The default value of the '{@link #getPriorityLevel() <em>Priority Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityLevel()
	 * @generated
	 * @ordered
	 */
	protected static final int PRIORITY_LEVEL_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPriorityLevel() <em>Priority Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorityLevel()
	 * @generated
	 * @ordered
	 */
	protected int priorityLevel = PRIORITY_LEVEL_EDEFAULT;

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
	 * The cached value of the '{@link #getDeliveryconstraint() <em>Deliveryconstraint</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliveryconstraint()
	 * @generated
	 * @ordered
	 */
	protected EList<DeliveryConstraint> deliveryconstraint;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm4Package.Literals.ORDER_CONSTRAINT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getPriorityLevel() {
		return priorityLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPriorityLevel(int newPriorityLevel) {
		int oldPriorityLevel = priorityLevel;
		priorityLevel = newPriorityLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm4Package.ORDER_CONSTRAINT__PRIORITY_LEVEL,
					oldPriorityLevel, priorityLevel));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mm4Package.ORDER_CONSTRAINT__CONSTRAINT_ID,
					oldConstraintID, constraintID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DeliveryConstraint> getDeliveryconstraint() {
		if (deliveryconstraint == null) {
			deliveryconstraint = new EObjectContainmentEList<DeliveryConstraint>(DeliveryConstraint.class, this,
					Mm4Package.ORDER_CONSTRAINT__DELIVERYCONSTRAINT);
		}
		return deliveryconstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mm4Package.ORDER_CONSTRAINT__DELIVERYCONSTRAINT:
			return ((InternalEList<?>) getDeliveryconstraint()).basicRemove(otherEnd, msgs);
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
		case Mm4Package.ORDER_CONSTRAINT__PRIORITY_LEVEL:
			return getPriorityLevel();
		case Mm4Package.ORDER_CONSTRAINT__CONSTRAINT_ID:
			return getConstraintID();
		case Mm4Package.ORDER_CONSTRAINT__DELIVERYCONSTRAINT:
			return getDeliveryconstraint();
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
		case Mm4Package.ORDER_CONSTRAINT__PRIORITY_LEVEL:
			setPriorityLevel((Integer) newValue);
			return;
		case Mm4Package.ORDER_CONSTRAINT__CONSTRAINT_ID:
			setConstraintID((String) newValue);
			return;
		case Mm4Package.ORDER_CONSTRAINT__DELIVERYCONSTRAINT:
			getDeliveryconstraint().clear();
			getDeliveryconstraint().addAll((Collection<? extends DeliveryConstraint>) newValue);
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
		case Mm4Package.ORDER_CONSTRAINT__PRIORITY_LEVEL:
			setPriorityLevel(PRIORITY_LEVEL_EDEFAULT);
			return;
		case Mm4Package.ORDER_CONSTRAINT__CONSTRAINT_ID:
			setConstraintID(CONSTRAINT_ID_EDEFAULT);
			return;
		case Mm4Package.ORDER_CONSTRAINT__DELIVERYCONSTRAINT:
			getDeliveryconstraint().clear();
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
		case Mm4Package.ORDER_CONSTRAINT__PRIORITY_LEVEL:
			return priorityLevel != PRIORITY_LEVEL_EDEFAULT;
		case Mm4Package.ORDER_CONSTRAINT__CONSTRAINT_ID:
			return CONSTRAINT_ID_EDEFAULT == null ? constraintID != null : !CONSTRAINT_ID_EDEFAULT.equals(constraintID);
		case Mm4Package.ORDER_CONSTRAINT__DELIVERYCONSTRAINT:
			return deliveryconstraint != null && !deliveryconstraint.isEmpty();
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
		result.append(" (priorityLevel: ");
		result.append(priorityLevel);
		result.append(", constraintID: ");
		result.append(constraintID);
		result.append(')');
		return result.toString();
	}

} //OrderConstraintImpl
