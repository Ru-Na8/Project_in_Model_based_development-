/**
 */
package mm2;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Order Iteam</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm2.OrderIteam#getIteamName <em>Iteam Name</em>}</li>
 *   <li>{@link mm2.OrderIteam#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see mm2.Mm2Package#getOrderIteam()
 * @model
 * @generated
 */
public interface OrderIteam extends EObject {
	/**
	 * Returns the value of the '<em><b>Iteam Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Iteam Name</em>' attribute.
	 * @see #setIteamName(String)
	 * @see mm2.Mm2Package#getOrderIteam_IteamName()
	 * @model
	 * @generated
	 */
	String getIteamName();

	/**
	 * Sets the value of the '{@link mm2.OrderIteam#getIteamName <em>Iteam Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Iteam Name</em>' attribute.
	 * @see #getIteamName()
	 * @generated
	 */
	void setIteamName(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see mm2.Mm2Package#getOrderIteam_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link mm2.OrderIteam#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

} // OrderIteam
