/**
 */
package mm1.impl;

import java.util.Collection;

import mm1.Iteam;
import mm1.Mm1Package;
import mm1.Supplier;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm1.impl.SupplierImpl#getID <em>ID</em>}</li>
 *   <li>{@link mm1.impl.SupplierImpl#getName <em>Name</em>}</li>
 *   <li>{@link mm1.impl.SupplierImpl#getOrderID <em>Order ID</em>}</li>
 *   <li>{@link mm1.impl.SupplierImpl#getAmount <em>Amount</em>}</li>
 *   <li>{@link mm1.impl.SupplierImpl#getSuppliedIteams <em>Supplied Iteams</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SupplierImpl extends MinimalEObjectImpl.Container implements Supplier {
	/**
	 * The default value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getID() <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getID()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected static final int AMOUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getAmount() <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmount()
	 * @generated
	 * @ordered
	 */
	protected int amount = AMOUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuppliedIteams() <em>Supplied Iteams</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuppliedIteams()
	 * @generated
	 * @ordered
	 */
	protected EList<Iteam> suppliedIteams;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SupplierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm1Package.Literals.SUPPLIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getID() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setID(String newID) {
		String oldID = id;
		id = newID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm1Package.SUPPLIER__ID, oldID, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mm1Package.SUPPLIER__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mm1Package.SUPPLIER__ORDER_ID, oldOrderID, orderID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getAmount() {
		return amount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAmount(int newAmount) {
		int oldAmount = amount;
		amount = newAmount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm1Package.SUPPLIER__AMOUNT, oldAmount, amount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Iteam> getSuppliedIteams() {
		if (suppliedIteams == null) {
			suppliedIteams = new EObjectResolvingEList<Iteam>(Iteam.class, this, Mm1Package.SUPPLIER__SUPPLIED_ITEAMS);
		}
		return suppliedIteams;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mm1Package.SUPPLIER__ID:
			return getID();
		case Mm1Package.SUPPLIER__NAME:
			return getName();
		case Mm1Package.SUPPLIER__ORDER_ID:
			return getOrderID();
		case Mm1Package.SUPPLIER__AMOUNT:
			return getAmount();
		case Mm1Package.SUPPLIER__SUPPLIED_ITEAMS:
			return getSuppliedIteams();
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
		case Mm1Package.SUPPLIER__ID:
			setID((String) newValue);
			return;
		case Mm1Package.SUPPLIER__NAME:
			setName((String) newValue);
			return;
		case Mm1Package.SUPPLIER__ORDER_ID:
			setOrderID((String) newValue);
			return;
		case Mm1Package.SUPPLIER__AMOUNT:
			setAmount((Integer) newValue);
			return;
		case Mm1Package.SUPPLIER__SUPPLIED_ITEAMS:
			getSuppliedIteams().clear();
			getSuppliedIteams().addAll((Collection<? extends Iteam>) newValue);
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
		case Mm1Package.SUPPLIER__ID:
			setID(ID_EDEFAULT);
			return;
		case Mm1Package.SUPPLIER__NAME:
			setName(NAME_EDEFAULT);
			return;
		case Mm1Package.SUPPLIER__ORDER_ID:
			setOrderID(ORDER_ID_EDEFAULT);
			return;
		case Mm1Package.SUPPLIER__AMOUNT:
			setAmount(AMOUNT_EDEFAULT);
			return;
		case Mm1Package.SUPPLIER__SUPPLIED_ITEAMS:
			getSuppliedIteams().clear();
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
		case Mm1Package.SUPPLIER__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case Mm1Package.SUPPLIER__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case Mm1Package.SUPPLIER__ORDER_ID:
			return ORDER_ID_EDEFAULT == null ? orderID != null : !ORDER_ID_EDEFAULT.equals(orderID);
		case Mm1Package.SUPPLIER__AMOUNT:
			return amount != AMOUNT_EDEFAULT;
		case Mm1Package.SUPPLIER__SUPPLIED_ITEAMS:
			return suppliedIteams != null && !suppliedIteams.isEmpty();
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
		result.append(" (ID: ");
		result.append(id);
		result.append(", name: ");
		result.append(name);
		result.append(", orderID: ");
		result.append(orderID);
		result.append(", amount: ");
		result.append(amount);
		result.append(')');
		return result.toString();
	}

} //SupplierImpl
