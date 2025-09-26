/**
 */
package mm1;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see mm1.Mm1Factory
 * @model kind="package"
 * @generated
 */
public interface Mm1Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mm1";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mm1";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm1";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mm1Package eINSTANCE = mm1.impl.Mm1PackageImpl.init();

	/**
	 * The meta object id for the '{@link mm1.impl.RetailStoreImpl <em>Retail Store</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm1.impl.RetailStoreImpl
	 * @see mm1.impl.Mm1PackageImpl#getRetailStore()
	 * @generated
	 */
	int RETAIL_STORE = 0;

	/**
	 * The feature id for the '<em><b>Store ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIL_STORE__STORE_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIL_STORE__NAME = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIL_STORE__LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Stockes Iteams</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIL_STORE__STOCKES_ITEAMS = 3;

	/**
	 * The feature id for the '<em><b>Delivery Windows</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIL_STORE__DELIVERY_WINDOWS = 4;

	/**
	 * The number of structural features of the '<em>Retail Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIL_STORE_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Retail Store</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RETAIL_STORE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm1.impl.IteamImpl <em>Iteam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm1.impl.IteamImpl
	 * @see mm1.impl.Mm1PackageImpl#getIteam()
	 * @generated
	 */
	int ITEAM = 1;

	/**
	 * The feature id for the '<em><b>Item ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEAM__ITEM_ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEAM__NAME = 1;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEAM__QUANTITY = 2;

	/**
	 * The number of structural features of the '<em>Iteam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEAM_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Iteam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm1.impl.SupplierImpl <em>Supplier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm1.impl.SupplierImpl
	 * @see mm1.impl.Mm1PackageImpl#getSupplier()
	 * @generated
	 */
	int SUPPLIER = 2;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__NAME = 1;

	/**
	 * The feature id for the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__ORDER_ID = 2;

	/**
	 * The feature id for the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__AMOUNT = 3;

	/**
	 * The feature id for the '<em><b>Supplied Iteams</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER__SUPPLIED_ITEAMS = 4;

	/**
	 * The number of structural features of the '<em>Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Supplier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUPPLIER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm1.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm1.impl.LocationImpl
	 * @see mm1.impl.Mm1PackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Postal Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__POSTAL_CODE = 1;

	/**
	 * The feature id for the '<em><b>City</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__CITY = 2;

	/**
	 * The feature id for the '<em><b>Building Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__BUILDING_NUMBER = 3;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm1.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm1.impl.TimeIntervalImpl
	 * @see mm1.impl.Mm1PackageImpl#getTimeInterval()
	 * @generated
	 */
	int TIME_INTERVAL = 4;

	/**
	 * The feature id for the '<em><b>Start Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__START_TIME = 0;

	/**
	 * The feature id for the '<em><b>End Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL__END_TIME = 1;

	/**
	 * The number of structural features of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Time Interval</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_INTERVAL_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link mm1.RetailStore <em>Retail Store</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Retail Store</em>'.
	 * @see mm1.RetailStore
	 * @generated
	 */
	EClass getRetailStore();

	/**
	 * Returns the meta object for the attribute '{@link mm1.RetailStore#getStoreID <em>Store ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Store ID</em>'.
	 * @see mm1.RetailStore#getStoreID()
	 * @see #getRetailStore()
	 * @generated
	 */
	EAttribute getRetailStore_StoreID();

	/**
	 * Returns the meta object for the attribute '{@link mm1.RetailStore#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm1.RetailStore#getName()
	 * @see #getRetailStore()
	 * @generated
	 */
	EAttribute getRetailStore_Name();

	/**
	 * Returns the meta object for the containment reference '{@link mm1.RetailStore#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Location</em>'.
	 * @see mm1.RetailStore#getLocation()
	 * @see #getRetailStore()
	 * @generated
	 */
	EReference getRetailStore_Location();

	/**
	 * Returns the meta object for the containment reference list '{@link mm1.RetailStore#getStockesIteams <em>Stockes Iteams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Stockes Iteams</em>'.
	 * @see mm1.RetailStore#getStockesIteams()
	 * @see #getRetailStore()
	 * @generated
	 */
	EReference getRetailStore_StockesIteams();

	/**
	 * Returns the meta object for the reference list '{@link mm1.RetailStore#getDeliveryWindows <em>Delivery Windows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Delivery Windows</em>'.
	 * @see mm1.RetailStore#getDeliveryWindows()
	 * @see #getRetailStore()
	 * @generated
	 */
	EReference getRetailStore_DeliveryWindows();

	/**
	 * Returns the meta object for class '{@link mm1.Iteam <em>Iteam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Iteam</em>'.
	 * @see mm1.Iteam
	 * @generated
	 */
	EClass getIteam();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Iteam#getItemID <em>Item ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Item ID</em>'.
	 * @see mm1.Iteam#getItemID()
	 * @see #getIteam()
	 * @generated
	 */
	EAttribute getIteam_ItemID();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Iteam#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm1.Iteam#getName()
	 * @see #getIteam()
	 * @generated
	 */
	EAttribute getIteam_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Iteam#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see mm1.Iteam#getQuantity()
	 * @see #getIteam()
	 * @generated
	 */
	EAttribute getIteam_Quantity();

	/**
	 * Returns the meta object for class '{@link mm1.Supplier <em>Supplier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Supplier</em>'.
	 * @see mm1.Supplier
	 * @generated
	 */
	EClass getSupplier();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Supplier#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see mm1.Supplier#getID()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_ID();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Supplier#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm1.Supplier#getName()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_Name();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Supplier#getOrderID <em>Order ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order ID</em>'.
	 * @see mm1.Supplier#getOrderID()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_OrderID();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Supplier#getAmount <em>Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Amount</em>'.
	 * @see mm1.Supplier#getAmount()
	 * @see #getSupplier()
	 * @generated
	 */
	EAttribute getSupplier_Amount();

	/**
	 * Returns the meta object for the reference list '{@link mm1.Supplier#getSuppliedIteams <em>Supplied Iteams</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Supplied Iteams</em>'.
	 * @see mm1.Supplier#getSuppliedIteams()
	 * @see #getSupplier()
	 * @generated
	 */
	EReference getSupplier_SuppliedIteams();

	/**
	 * Returns the meta object for class '{@link mm1.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see mm1.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Location#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see mm1.Location#getAddress()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Address();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Location#getPostalCode <em>Postal Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Postal Code</em>'.
	 * @see mm1.Location#getPostalCode()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_PostalCode();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Location#getCity <em>City</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>City</em>'.
	 * @see mm1.Location#getCity()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_City();

	/**
	 * Returns the meta object for the attribute '{@link mm1.Location#getBuildingNumber <em>Building Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Building Number</em>'.
	 * @see mm1.Location#getBuildingNumber()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_BuildingNumber();

	/**
	 * Returns the meta object for class '{@link mm1.TimeInterval <em>Time Interval</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Interval</em>'.
	 * @see mm1.TimeInterval
	 * @generated
	 */
	EClass getTimeInterval();

	/**
	 * Returns the meta object for the attribute '{@link mm1.TimeInterval#getStartTime <em>Start Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Start Time</em>'.
	 * @see mm1.TimeInterval#getStartTime()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EAttribute getTimeInterval_StartTime();

	/**
	 * Returns the meta object for the attribute '{@link mm1.TimeInterval#getEndTime <em>End Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>End Time</em>'.
	 * @see mm1.TimeInterval#getEndTime()
	 * @see #getTimeInterval()
	 * @generated
	 */
	EAttribute getTimeInterval_EndTime();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mm1Factory getMm1Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link mm1.impl.RetailStoreImpl <em>Retail Store</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm1.impl.RetailStoreImpl
		 * @see mm1.impl.Mm1PackageImpl#getRetailStore()
		 * @generated
		 */
		EClass RETAIL_STORE = eINSTANCE.getRetailStore();

		/**
		 * The meta object literal for the '<em><b>Store ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETAIL_STORE__STORE_ID = eINSTANCE.getRetailStore_StoreID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RETAIL_STORE__NAME = eINSTANCE.getRetailStore_Name();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETAIL_STORE__LOCATION = eINSTANCE.getRetailStore_Location();

		/**
		 * The meta object literal for the '<em><b>Stockes Iteams</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETAIL_STORE__STOCKES_ITEAMS = eINSTANCE.getRetailStore_StockesIteams();

		/**
		 * The meta object literal for the '<em><b>Delivery Windows</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RETAIL_STORE__DELIVERY_WINDOWS = eINSTANCE.getRetailStore_DeliveryWindows();

		/**
		 * The meta object literal for the '{@link mm1.impl.IteamImpl <em>Iteam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm1.impl.IteamImpl
		 * @see mm1.impl.Mm1PackageImpl#getIteam()
		 * @generated
		 */
		EClass ITEAM = eINSTANCE.getIteam();

		/**
		 * The meta object literal for the '<em><b>Item ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEAM__ITEM_ID = eINSTANCE.getIteam_ItemID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEAM__NAME = eINSTANCE.getIteam_Name();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ITEAM__QUANTITY = eINSTANCE.getIteam_Quantity();

		/**
		 * The meta object literal for the '{@link mm1.impl.SupplierImpl <em>Supplier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm1.impl.SupplierImpl
		 * @see mm1.impl.Mm1PackageImpl#getSupplier()
		 * @generated
		 */
		EClass SUPPLIER = eINSTANCE.getSupplier();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER__ID = eINSTANCE.getSupplier_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER__NAME = eINSTANCE.getSupplier_Name();

		/**
		 * The meta object literal for the '<em><b>Order ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER__ORDER_ID = eINSTANCE.getSupplier_OrderID();

		/**
		 * The meta object literal for the '<em><b>Amount</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUPPLIER__AMOUNT = eINSTANCE.getSupplier_Amount();

		/**
		 * The meta object literal for the '<em><b>Supplied Iteams</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUPPLIER__SUPPLIED_ITEAMS = eINSTANCE.getSupplier_SuppliedIteams();

		/**
		 * The meta object literal for the '{@link mm1.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm1.impl.LocationImpl
		 * @see mm1.impl.Mm1PackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ADDRESS = eINSTANCE.getLocation_Address();

		/**
		 * The meta object literal for the '<em><b>Postal Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__POSTAL_CODE = eINSTANCE.getLocation_PostalCode();

		/**
		 * The meta object literal for the '<em><b>City</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__CITY = eINSTANCE.getLocation_City();

		/**
		 * The meta object literal for the '<em><b>Building Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__BUILDING_NUMBER = eINSTANCE.getLocation_BuildingNumber();

		/**
		 * The meta object literal for the '{@link mm1.impl.TimeIntervalImpl <em>Time Interval</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm1.impl.TimeIntervalImpl
		 * @see mm1.impl.Mm1PackageImpl#getTimeInterval()
		 * @generated
		 */
		EClass TIME_INTERVAL = eINSTANCE.getTimeInterval();

		/**
		 * The meta object literal for the '<em><b>Start Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL__START_TIME = eINSTANCE.getTimeInterval_StartTime();

		/**
		 * The meta object literal for the '<em><b>End Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIME_INTERVAL__END_TIME = eINSTANCE.getTimeInterval_EndTime();

	}

} //Mm1Package
