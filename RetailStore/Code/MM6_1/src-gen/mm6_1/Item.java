/**
 */
package mm6_1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm6_1.Item#getItemName <em>Item Name</em>}</li>
 *   <li>{@link mm6_1.Item#getQuantity <em>Quantity</em>}</li>
 * </ul>
 *
 * @see mm6_1.Mm6_1Package#getItem()
 * @model
 * @generated
 */
public interface Item extends EObject {
	/**
	 * Returns the value of the '<em><b>Item Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item Name</em>' attribute.
	 * @see #setItemName(String)
	 * @see mm6_1.Mm6_1Package#getItem_ItemName()
	 * @model
	 * @generated
	 */
	String getItemName();

	/**
	 * Sets the value of the '{@link mm6_1.Item#getItemName <em>Item Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item Name</em>' attribute.
	 * @see #getItemName()
	 * @generated
	 */
	void setItemName(String value);

	/**
	 * Returns the value of the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity</em>' attribute.
	 * @see #setQuantity(int)
	 * @see mm6_1.Mm6_1Package#getItem_Quantity()
	 * @model
	 * @generated
	 */
	int getQuantity();

	/**
	 * Sets the value of the '{@link mm6_1.Item#getQuantity <em>Quantity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Quantity</em>' attribute.
	 * @see #getQuantity()
	 * @generated
	 */
	void setQuantity(int value);

} // Item
