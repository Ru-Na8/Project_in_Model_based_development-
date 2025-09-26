/**
 */
package mm2.impl;

import java.util.Collection;

import mm2.DeliveryDetails;
import mm2.Mm2Package;
import mm2.Order;
import mm2.OrderIteam;

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
 * An implementation of the model object '<em><b>Order</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm2.impl.OrderImpl#getOrderiteam <em>Orderiteam</em>}</li>
 *   <li>{@link mm2.impl.OrderImpl#getDeliverydetails <em>Deliverydetails</em>}</li>
 *   <li>{@link mm2.impl.OrderImpl#getOrderID <em>Order ID</em>}</li>
 *   <li>{@link mm2.impl.OrderImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
	/**
	 * The cached value of the '{@link #getOrderiteam() <em>Orderiteam</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderiteam()
	 * @generated
	 * @ordered
	 */
	protected EList<OrderIteam> orderiteam;

	/**
	 * The cached value of the '{@link #getDeliverydetails() <em>Deliverydetails</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeliverydetails()
	 * @generated
	 * @ordered
	 */
	protected DeliveryDetails deliverydetails;

	/**
	 * The default value of the '{@link #getOrderID() <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderID()
	 * @generated
	 * @ordered
	 */
	protected static final String ORDER_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrderID() <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrderID()
	 * @generated
	 * @ordered
	 */
	protected String orderID = ORDER_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OrderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm2Package.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderIteam> getOrderiteam() {
		if (orderiteam == null) {
			orderiteam = new EObjectContainmentEList<OrderIteam>(OrderIteam.class, this, Mm2Package.ORDER__ORDERITEAM);
		}
		return orderiteam;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DeliveryDetails getDeliverydetails() {
		return deliverydetails;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDeliverydetails(DeliveryDetails newDeliverydetails, NotificationChain msgs) {
		DeliveryDetails oldDeliverydetails = deliverydetails;
		deliverydetails = newDeliverydetails;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mm2Package.ORDER__DELIVERYDETAILS, oldDeliverydetails, newDeliverydetails);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeliverydetails(DeliveryDetails newDeliverydetails) {
		if (newDeliverydetails != deliverydetails) {
			NotificationChain msgs = null;
			if (deliverydetails != null)
				msgs = ((InternalEObject) deliverydetails).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Mm2Package.ORDER__DELIVERYDETAILS, null, msgs);
			if (newDeliverydetails != null)
				msgs = ((InternalEObject) newDeliverydetails).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Mm2Package.ORDER__DELIVERYDETAILS, null, msgs);
			msgs = basicSetDeliverydetails(newDeliverydetails, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.ORDER__DELIVERYDETAILS, newDeliverydetails,
					newDeliverydetails));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOrderID() {
		return orderID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrderID(String newOrderID) {
		String oldOrderID = orderID;
		orderID = newOrderID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.ORDER__ORDER_ID, oldOrderID, orderID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.ORDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mm2Package.ORDER__ORDERITEAM:
			return ((InternalEList<?>) getOrderiteam()).basicRemove(otherEnd, msgs);
		case Mm2Package.ORDER__DELIVERYDETAILS:
			return basicSetDeliverydetails(null, msgs);
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
		case Mm2Package.ORDER__ORDERITEAM:
			return getOrderiteam();
		case Mm2Package.ORDER__DELIVERYDETAILS:
			return getDeliverydetails();
		case Mm2Package.ORDER__ORDER_ID:
			return getOrderID();
		case Mm2Package.ORDER__NAME:
			return getName();
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
		case Mm2Package.ORDER__ORDERITEAM:
			getOrderiteam().clear();
			getOrderiteam().addAll((Collection<? extends OrderIteam>) newValue);
			return;
		case Mm2Package.ORDER__DELIVERYDETAILS:
			setDeliverydetails((DeliveryDetails) newValue);
			return;
		case Mm2Package.ORDER__ORDER_ID:
			setOrderID((String) newValue);
			return;
		case Mm2Package.ORDER__NAME:
			setName((String) newValue);
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
		case Mm2Package.ORDER__ORDERITEAM:
			getOrderiteam().clear();
			return;
		case Mm2Package.ORDER__DELIVERYDETAILS:
			setDeliverydetails((DeliveryDetails) null);
			return;
		case Mm2Package.ORDER__ORDER_ID:
			setOrderID(ORDER_ID_EDEFAULT);
			return;
		case Mm2Package.ORDER__NAME:
			setName(NAME_EDEFAULT);
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
		case Mm2Package.ORDER__ORDERITEAM:
			return orderiteam != null && !orderiteam.isEmpty();
		case Mm2Package.ORDER__DELIVERYDETAILS:
			return deliverydetails != null;
		case Mm2Package.ORDER__ORDER_ID:
			return ORDER_ID_EDEFAULT == null ? orderID != null : !ORDER_ID_EDEFAULT.equals(orderID);
		case Mm2Package.ORDER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
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
		result.append(" (orderID: ");
		result.append(orderID);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
