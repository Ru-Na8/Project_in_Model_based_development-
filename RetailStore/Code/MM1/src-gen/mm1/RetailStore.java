/**
 */
package mm1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Retail Store</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm1.RetailStore#getStoreID <em>Store ID</em>}</li>
 *   <li>{@link mm1.RetailStore#getName <em>Name</em>}</li>
 *   <li>{@link mm1.RetailStore#getLocation <em>Location</em>}</li>
 *   <li>{@link mm1.RetailStore#getStockesIteams <em>Stockes Iteams</em>}</li>
 *   <li>{@link mm1.RetailStore#getDeliveryWindows <em>Delivery Windows</em>}</li>
 * </ul>
 *
 * @see mm1.Mm1Package#getRetailStore()
 * @model
 * @generated
 */
public interface RetailStore extends EObject {
	/**
	 * Returns the value of the '<em><b>Store ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Store ID</em>' attribute.
	 * @see #setStoreID(String)
	 * @see mm1.Mm1Package#getRetailStore_StoreID()
	 * @model
	 * @generated
	 */
	String getStoreID();

	/**
	 * Sets the value of the '{@link mm1.RetailStore#getStoreID <em>Store ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Store ID</em>' attribute.
	 * @see #getStoreID()
	 * @generated
	 */
	void setStoreID(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see mm1.Mm1Package#getRetailStore_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link mm1.RetailStore#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' containment reference.
	 * @see #setLocation(Location)
	 * @see mm1.Mm1Package#getRetailStore_Location()
	 * @model containment="true"
	 * @generated
	 */
	Location getLocation();

	/**
	 * Sets the value of the '{@link mm1.RetailStore#getLocation <em>Location</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' containment reference.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(Location value);

	/**
	 * Returns the value of the '<em><b>Stockes Iteams</b></em>' containment reference list.
	 * The list contents are of type {@link mm1.Iteam}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Stockes Iteams</em>' containment reference list.
	 * @see mm1.Mm1Package#getRetailStore_StockesIteams()
	 * @model containment="true"
	 * @generated
	 */
	EList<Iteam> getStockesIteams();

	/**
	 * Returns the value of the '<em><b>Delivery Windows</b></em>' reference list.
	 * The list contents are of type {@link mm1.TimeInterval}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Windows</em>' reference list.
	 * @see mm1.Mm1Package#getRetailStore_DeliveryWindows()
	 * @model
	 * @generated
	 */
	EList<TimeInterval> getDeliveryWindows();

} // RetailStore
