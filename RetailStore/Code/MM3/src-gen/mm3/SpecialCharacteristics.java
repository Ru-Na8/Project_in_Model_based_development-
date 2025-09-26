/**
 */
package mm3;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Special Characteristics</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm3.SpecialCharacteristics#getCharacteristicID <em>Characteristic ID</em>}</li>
 *   <li>{@link mm3.SpecialCharacteristics#getName <em>Name</em>}</li>
 *   <li>{@link mm3.SpecialCharacteristics#getDescription <em>Description</em>}</li>
 * </ul>
 *
 * @see mm3.Mm3Package#getSpecialCharacteristics()
 * @model
 * @generated
 */
public interface SpecialCharacteristics extends EObject {
	/**
	 * Returns the value of the '<em><b>Characteristic ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Characteristic ID</em>' attribute.
	 * @see #setCharacteristicID(String)
	 * @see mm3.Mm3Package#getSpecialCharacteristics_CharacteristicID()
	 * @model
	 * @generated
	 */
	String getCharacteristicID();

	/**
	 * Sets the value of the '{@link mm3.SpecialCharacteristics#getCharacteristicID <em>Characteristic ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Characteristic ID</em>' attribute.
	 * @see #getCharacteristicID()
	 * @generated
	 */
	void setCharacteristicID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mm3.Mm3Package#getSpecialCharacteristics_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm3.SpecialCharacteristics#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see mm3.Mm3Package#getSpecialCharacteristics_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link mm3.SpecialCharacteristics#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // SpecialCharacteristics
