/**
 */
package mm3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capacity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm3.Capacity#getCapacityID <em>Capacity ID</em>}</li>
 *   <li>{@link mm3.Capacity#getWeight <em>Weight</em>}</li>
 *   <li>{@link mm3.Capacity#getVolume <em>Volume</em>}</li>
 *   <li>{@link mm3.Capacity#getNumberOfItems <em>Number Of Items</em>}</li>
 * </ul>
 *
 * @see mm3.Mm3Package#getCapacity()
 * @model
 * @generated
 */
public interface Capacity extends EObject {
	/**
	 * Returns the value of the '<em><b>Capacity ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Capacity ID</em>' attribute.
	 * @see #setCapacityID(String)
	 * @see mm3.Mm3Package#getCapacity_CapacityID()
	 * @model
	 * @generated
	 */
	String getCapacityID();

	/**
	 * Sets the value of the '{@link mm3.Capacity#getCapacityID <em>Capacity ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Capacity ID</em>' attribute.
	 * @see #getCapacityID()
	 * @generated
	 */
	void setCapacityID(String value);

	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see mm3.Mm3Package#getCapacity_Weight()
	 * @model
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link mm3.Capacity#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volume</em>' attribute.
	 * @see #setVolume(int)
	 * @see mm3.Mm3Package#getCapacity_Volume()
	 * @model
	 * @generated
	 */
	int getVolume();

	/**
	 * Sets the value of the '{@link mm3.Capacity#getVolume <em>Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Volume</em>' attribute.
	 * @see #getVolume()
	 * @generated
	 */
	void setVolume(int value);

	/**
	 * Returns the value of the '<em><b>Number Of Items</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Items</em>' attribute.
	 * @see #setNumberOfItems(int)
	 * @see mm3.Mm3Package#getCapacity_NumberOfItems()
	 * @model
	 * @generated
	 */
	int getNumberOfItems();

	/**
	 * Sets the value of the '{@link mm3.Capacity#getNumberOfItems <em>Number Of Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number Of Items</em>' attribute.
	 * @see #getNumberOfItems()
	 * @generated
	 */
	void setNumberOfItems(int value);

} // Capacity
