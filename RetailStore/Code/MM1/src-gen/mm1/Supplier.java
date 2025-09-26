/**
 */
package mm1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Supplier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm1.Supplier#getID <em>ID</em>}</li>
 *   <li>{@link mm1.Supplier#getName <em>Name</em>}</li>
 *   <li>{@link mm1.Supplier#getOrderID <em>Order ID</em>}</li>
 *   <li>{@link mm1.Supplier#getAmount <em>Amount</em>}</li>
 *   <li>{@link mm1.Supplier#getSuppliedIteams <em>Supplied Iteams</em>}</li>
 * </ul>
 *
 * @see mm1.Mm1Package#getSupplier()
 * @model
 * @generated
 */
public interface Supplier extends EObject {
	/**
	 * Returns the value of the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>ID</em>' attribute.
	 * @see #setID(String)
	 * @see mm1.Mm1Package#getSupplier_ID()
	 * @model
	 * @generated
	 */
	String getID();

	/**
	 * Sets the value of the '{@link mm1.Supplier#getID <em>ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ID</em>' attribute.
	 * @see #getID()
	 * @generated
	 */
	void setID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mm1.Mm1Package#getSupplier_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm1.Supplier#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Order ID</em>' attribute.
	 * @see #setOrderID(String)
	 * @see mm1.Mm1Package#getSupplier_OrderID()
	 * @model
	 * @generated
	 */
	String getOrderID();

	/**
	 * Sets the value of the '{@link mm1.Supplier#getOrderID <em>Order ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Order ID</em>' attribute.
	 * @see #getOrderID()
	 * @generated
	 */
	void setOrderID(String value);

	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(int)
	 * @see mm1.Mm1Package#getSupplier_Amount()
	 * @model
	 * @generated
	 */
	int getAmount();

	/**
	 * Sets the value of the '{@link mm1.Supplier#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(int value);

	/**
	 * Returns the value of the '<em><b>Supplied Iteams</b></em>' reference list.
	 * The list contents are of type {@link mm1.Iteam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supplied Iteams</em>' reference list.
	 * @see mm1.Mm1Package#getSupplier_SuppliedIteams()
	 * @model
	 * @generated
	 */
	EList<Iteam> getSuppliedIteams();

} // Supplier
