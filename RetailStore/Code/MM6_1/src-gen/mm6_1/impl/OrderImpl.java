/**
 */
package mm6_1.impl;

import java.util.Collection;
import java.util.Date;

import mm6_1.Item;
import mm6_1.Mm6_1Package;
import mm6_1.Order;

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
 *   <li>{@link mm6_1.impl.OrderImpl#getOrderID <em>Order ID</em>}</li>
 *   <li>{@link mm6_1.impl.OrderImpl#getName <em>Name</em>}</li>
 *   <li>{@link mm6_1.impl.OrderImpl#getDeliveryAddress <em>Delivery Address</em>}</li>
 *   <li>{@link mm6_1.impl.OrderImpl#getDeliveryDate <em>Delivery Date</em>}</li>
 *   <li>{@link mm6_1.impl.OrderImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OrderImpl extends MinimalEObjectImpl.Container implements Order {
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
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<Item> items;

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
		return Mm6_1Package.Literals.ORDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOrderID() {
		return orderID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOrderID(String newOrderID) {
		String oldOrderID = orderID;
		orderID = newOrderID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm6_1Package.ORDER__ORDER_ID, oldOrderID, orderID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm6_1Package.ORDER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeliveryAddress() {
		return deliveryAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryAddress(String newDeliveryAddress) {
		String oldDeliveryAddress = deliveryAddress;
		deliveryAddress = newDeliveryAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm6_1Package.ORDER__DELIVERY_ADDRESS,
					oldDeliveryAddress, deliveryAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Date getDeliveryDate() {
		return deliveryDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeliveryDate(Date newDeliveryDate) {
		Date oldDeliveryDate = deliveryDate;
		deliveryDate = newDeliveryDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm6_1Package.ORDER__DELIVERY_DATE, oldDeliveryDate,
					deliveryDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Item> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<Item>(Item.class, this, Mm6_1Package.ORDER__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mm6_1Package.ORDER__ITEMS:
			return ((InternalEList<?>) getItems()).basicRemove(otherEnd, msgs);
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
		case Mm6_1Package.ORDER__ORDER_ID:
			return getOrderID();
		case Mm6_1Package.ORDER__NAME:
			return getName();
		case Mm6_1Package.ORDER__DELIVERY_ADDRESS:
			return getDeliveryAddress();
		case Mm6_1Package.ORDER__DELIVERY_DATE:
			return getDeliveryDate();
		case Mm6_1Package.ORDER__ITEMS:
			return getItems();
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
		case Mm6_1Package.ORDER__ORDER_ID:
			setOrderID((String) newValue);
			return;
		case Mm6_1Package.ORDER__NAME:
			setName((String) newValue);
			return;
		case Mm6_1Package.ORDER__DELIVERY_ADDRESS:
			setDeliveryAddress((String) newValue);
			return;
		case Mm6_1Package.ORDER__DELIVERY_DATE:
			setDeliveryDate((Date) newValue);
			return;
		case Mm6_1Package.ORDER__ITEMS:
			getItems().clear();
			getItems().addAll((Collection<? extends Item>) newValue);
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
		case Mm6_1Package.ORDER__ORDER_ID:
			setOrderID(ORDER_ID_EDEFAULT);
			return;
		case Mm6_1Package.ORDER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Mm6_1Package.ORDER__DELIVERY_ADDRESS:
			setDeliveryAddress(DELIVERY_ADDRESS_EDEFAULT);
			return;
		case Mm6_1Package.ORDER__DELIVERY_DATE:
			setDeliveryDate(DELIVERY_DATE_EDEFAULT);
			return;
		case Mm6_1Package.ORDER__ITEMS:
			getItems().clear();
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
		case Mm6_1Package.ORDER__ORDER_ID:
			return ORDER_ID_EDEFAULT == null ? orderID != null : !ORDER_ID_EDEFAULT.equals(orderID);
		case Mm6_1Package.ORDER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Mm6_1Package.ORDER__DELIVERY_ADDRESS:
			return DELIVERY_ADDRESS_EDEFAULT == null ? deliveryAddress != null
					: !DELIVERY_ADDRESS_EDEFAULT.equals(deliveryAddress);
		case Mm6_1Package.ORDER__DELIVERY_DATE:
			return DELIVERY_DATE_EDEFAULT == null ? deliveryDate != null : !DELIVERY_DATE_EDEFAULT.equals(deliveryDate);
		case Mm6_1Package.ORDER__ITEMS:
			return items != null && !items.isEmpty();
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
		result.append(", deliveryAddress: ");
		result.append(deliveryAddress);
		result.append(", deliveryDate: ");
		result.append(deliveryDate);
		result.append(')');
		return result.toString();
	}

} //OrderImpl
