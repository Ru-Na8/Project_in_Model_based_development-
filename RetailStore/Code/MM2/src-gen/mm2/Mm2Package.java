/**
 */
package mm2;

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
 * @see mm2.Mm2Factory
 * @model kind="package"
 * @generated
 */
public interface Mm2Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mm2";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mm2";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm2";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mm2Package eINSTANCE = mm2.impl.Mm2PackageImpl.init();

	/**
	 * The meta object id for the '{@link mm2.impl.OrderImpl <em>Order</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.OrderImpl
	 * @see mm2.impl.Mm2PackageImpl#getOrder()
	 * @generated
	 */
	int ORDER = 0;

	/**
	 * The feature id for the '<em><b>Orderiteam</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDERITEAM = 0;

	/**
	 * The feature id for the '<em><b>Deliverydetails</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__DELIVERYDETAILS = 1;

	/**
	 * The feature id for the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__ORDER_ID = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER__NAME = 3;

	/**
	 * The number of structural features of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Order</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm2.impl.DeliveryDetailsImpl <em>Delivery Details</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.DeliveryDetailsImpl
	 * @see mm2.impl.Mm2PackageImpl#getDeliveryDetails()
	 * @generated
	 */
	int DELIVERY_DETAILS = 1;

	/**
	 * The feature id for the '<em><b>Delivery Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DETAILS__DELIVERY_ADDRESS = 0;

	/**
	 * The feature id for the '<em><b>Delivery Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DETAILS__DELIVERY_DATE = 1;

	/**
	 * The number of structural features of the '<em>Delivery Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DETAILS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Delivery Details</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_DETAILS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm2.impl.OrderIteamImpl <em>Order Iteam</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.OrderIteamImpl
	 * @see mm2.impl.Mm2PackageImpl#getOrderIteam()
	 * @generated
	 */
	int ORDER_ITEAM = 2;

	/**
	 * The feature id for the '<em><b>Iteam Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEAM__ITEAM_NAME = 0;

	/**
	 * The feature id for the '<em><b>Quantity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEAM__QUANTITY = 1;

	/**
	 * The number of structural features of the '<em>Order Iteam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEAM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Order Iteam</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_ITEAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm2.impl.OrderModelImpl <em>Order Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.OrderModelImpl
	 * @see mm2.impl.Mm2PackageImpl#getOrderModel()
	 * @generated
	 */
	int ORDER_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Orders</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_MODEL__ORDERS = 0;

	/**
	 * The feature id for the '<em><b>Locations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_MODEL__LOCATIONS = 1;

	/**
	 * The number of structural features of the '<em>Order Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_MODEL_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Order Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm2.impl.LocationImpl <em>Location</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm2.impl.LocationImpl
	 * @see mm2.impl.Mm2PackageImpl#getLocation()
	 * @generated
	 */
	int LOCATION = 4;

	/**
	 * The feature id for the '<em><b>Order ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ORDER_ID = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION__ADDRESS = 1;

	/**
	 * The number of structural features of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Location</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCATION_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link mm2.Order <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order</em>'.
	 * @see mm2.Order
	 * @generated
	 */
	EClass getOrder();

	/**
	 * Returns the meta object for the containment reference list '{@link mm2.Order#getOrderiteam <em>Orderiteam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orderiteam</em>'.
	 * @see mm2.Order#getOrderiteam()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Orderiteam();

	/**
	 * Returns the meta object for the containment reference '{@link mm2.Order#getDeliverydetails <em>Deliverydetails</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Deliverydetails</em>'.
	 * @see mm2.Order#getDeliverydetails()
	 * @see #getOrder()
	 * @generated
	 */
	EReference getOrder_Deliverydetails();

	/**
	 * Returns the meta object for the attribute '{@link mm2.Order#getOrderID <em>Order ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order ID</em>'.
	 * @see mm2.Order#getOrderID()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_OrderID();

	/**
	 * Returns the meta object for the attribute '{@link mm2.Order#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see mm2.Order#getName()
	 * @see #getOrder()
	 * @generated
	 */
	EAttribute getOrder_Name();

	/**
	 * Returns the meta object for class '{@link mm2.DeliveryDetails <em>Delivery Details</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery Details</em>'.
	 * @see mm2.DeliveryDetails
	 * @generated
	 */
	EClass getDeliveryDetails();

	/**
	 * Returns the meta object for the attribute '{@link mm2.DeliveryDetails#getDeliveryAddress <em>Delivery Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Address</em>'.
	 * @see mm2.DeliveryDetails#getDeliveryAddress()
	 * @see #getDeliveryDetails()
	 * @generated
	 */
	EAttribute getDeliveryDetails_DeliveryAddress();

	/**
	 * Returns the meta object for the attribute '{@link mm2.DeliveryDetails#getDeliveryDate <em>Delivery Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Date</em>'.
	 * @see mm2.DeliveryDetails#getDeliveryDate()
	 * @see #getDeliveryDetails()
	 * @generated
	 */
	EAttribute getDeliveryDetails_DeliveryDate();

	/**
	 * Returns the meta object for class '{@link mm2.OrderIteam <em>Order Iteam</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Iteam</em>'.
	 * @see mm2.OrderIteam
	 * @generated
	 */
	EClass getOrderIteam();

	/**
	 * Returns the meta object for the attribute '{@link mm2.OrderIteam#getIteamName <em>Iteam Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Iteam Name</em>'.
	 * @see mm2.OrderIteam#getIteamName()
	 * @see #getOrderIteam()
	 * @generated
	 */
	EAttribute getOrderIteam_IteamName();

	/**
	 * Returns the meta object for the attribute '{@link mm2.OrderIteam#getQuantity <em>Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Quantity</em>'.
	 * @see mm2.OrderIteam#getQuantity()
	 * @see #getOrderIteam()
	 * @generated
	 */
	EAttribute getOrderIteam_Quantity();

	/**
	 * Returns the meta object for class '{@link mm2.OrderModel <em>Order Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Model</em>'.
	 * @see mm2.OrderModel
	 * @generated
	 */
	EClass getOrderModel();

	/**
	 * Returns the meta object for the containment reference list '{@link mm2.OrderModel#getOrders <em>Orders</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orders</em>'.
	 * @see mm2.OrderModel#getOrders()
	 * @see #getOrderModel()
	 * @generated
	 */
	EReference getOrderModel_Orders();

	/**
	 * Returns the meta object for the containment reference list '{@link mm2.OrderModel#getLocations <em>Locations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Locations</em>'.
	 * @see mm2.OrderModel#getLocations()
	 * @see #getOrderModel()
	 * @generated
	 */
	EReference getOrderModel_Locations();

	/**
	 * Returns the meta object for class '{@link mm2.Location <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Location</em>'.
	 * @see mm2.Location
	 * @generated
	 */
	EClass getLocation();

	/**
	 * Returns the meta object for the attribute '{@link mm2.Location#getOrderID <em>Order ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order ID</em>'.
	 * @see mm2.Location#getOrderID()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_OrderID();

	/**
	 * Returns the meta object for the attribute '{@link mm2.Location#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Address</em>'.
	 * @see mm2.Location#getAddress()
	 * @see #getLocation()
	 * @generated
	 */
	EAttribute getLocation_Address();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mm2Factory getMm2Factory();

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
		 * The meta object literal for the '{@link mm2.impl.OrderImpl <em>Order</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.OrderImpl
		 * @see mm2.impl.Mm2PackageImpl#getOrder()
		 * @generated
		 */
		EClass ORDER = eINSTANCE.getOrder();

		/**
		 * The meta object literal for the '<em><b>Orderiteam</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__ORDERITEAM = eINSTANCE.getOrder_Orderiteam();

		/**
		 * The meta object literal for the '<em><b>Deliverydetails</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER__DELIVERYDETAILS = eINSTANCE.getOrder_Deliverydetails();

		/**
		 * The meta object literal for the '<em><b>Order ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__ORDER_ID = eINSTANCE.getOrder_OrderID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER__NAME = eINSTANCE.getOrder_Name();

		/**
		 * The meta object literal for the '{@link mm2.impl.DeliveryDetailsImpl <em>Delivery Details</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.DeliveryDetailsImpl
		 * @see mm2.impl.Mm2PackageImpl#getDeliveryDetails()
		 * @generated
		 */
		EClass DELIVERY_DETAILS = eINSTANCE.getDeliveryDetails();

		/**
		 * The meta object literal for the '<em><b>Delivery Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_DETAILS__DELIVERY_ADDRESS = eINSTANCE.getDeliveryDetails_DeliveryAddress();

		/**
		 * The meta object literal for the '<em><b>Delivery Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_DETAILS__DELIVERY_DATE = eINSTANCE.getDeliveryDetails_DeliveryDate();

		/**
		 * The meta object literal for the '{@link mm2.impl.OrderIteamImpl <em>Order Iteam</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.OrderIteamImpl
		 * @see mm2.impl.Mm2PackageImpl#getOrderIteam()
		 * @generated
		 */
		EClass ORDER_ITEAM = eINSTANCE.getOrderIteam();

		/**
		 * The meta object literal for the '<em><b>Iteam Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEAM__ITEAM_NAME = eINSTANCE.getOrderIteam_IteamName();

		/**
		 * The meta object literal for the '<em><b>Quantity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_ITEAM__QUANTITY = eINSTANCE.getOrderIteam_Quantity();

		/**
		 * The meta object literal for the '{@link mm2.impl.OrderModelImpl <em>Order Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.OrderModelImpl
		 * @see mm2.impl.Mm2PackageImpl#getOrderModel()
		 * @generated
		 */
		EClass ORDER_MODEL = eINSTANCE.getOrderModel();

		/**
		 * The meta object literal for the '<em><b>Orders</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_MODEL__ORDERS = eINSTANCE.getOrderModel_Orders();

		/**
		 * The meta object literal for the '<em><b>Locations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_MODEL__LOCATIONS = eINSTANCE.getOrderModel_Locations();

		/**
		 * The meta object literal for the '{@link mm2.impl.LocationImpl <em>Location</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm2.impl.LocationImpl
		 * @see mm2.impl.Mm2PackageImpl#getLocation()
		 * @generated
		 */
		EClass LOCATION = eINSTANCE.getLocation();

		/**
		 * The meta object literal for the '<em><b>Order ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ORDER_ID = eINSTANCE.getLocation_OrderID();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCATION__ADDRESS = eINSTANCE.getLocation_Address();

	}

} //Mm2Package
