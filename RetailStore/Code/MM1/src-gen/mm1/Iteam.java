/**
 */
package mm1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Iteam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm1.Iteam#getItemID <em>Item ID</em>}</li>
 *   <li>{@link mm1.Iteam#getName <em>Name</em>}</li>
 *   <li>{@link mm1.Iteam#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see mm1.Mm1Package#getIteam()
 * @model
 * @generated
 */
public interface Iteam extends EObject {
	/**
	 * Returns the value of the '<em><b>Item ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item ID</em>' attribute.
	 * @see #setItemID(String)
	 * @see mm1.Mm1Package#getIteam_ItemID()
	 * @model
	 * @generated
	 */
	String getItemID();

	/**
	 * Sets the value of the '{@link mm1.Iteam#getItemID <em>Item ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item ID</em>' attribute.
	 * @see #getItemID()
	 * @generated
	 */
	void setItemID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mm1.Mm1Package#getIteam_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm1.Iteam#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see mm1.Mm1Package#getIteam_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link mm1.Iteam#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

} // Iteam
