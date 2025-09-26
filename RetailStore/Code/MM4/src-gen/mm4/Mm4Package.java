/**
 */
package mm4;

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
 * @see mm4.Mm4Factory
 * @model kind="package"
 * @generated
 */
public interface Mm4Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mm4";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/mm4";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mm4";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Mm4Package eINSTANCE = mm4.impl.Mm4PackageImpl.init();

	/**
	 * The meta object id for the '{@link mm4.impl.OrderDeliveryConstraintsImpl <em>Order Delivery Constraints</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm4.impl.OrderDeliveryConstraintsImpl
	 * @see mm4.impl.Mm4PackageImpl#getOrderDeliveryConstraints()
	 * @generated
	 */
	int ORDER_DELIVERY_CONSTRAINTS = 0;

	/**
	 * The feature id for the '<em><b>Constraints ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_CONSTRAINTS__CONSTRAINTS_ID = 0;

	/**
	 * The feature id for the '<em><b>Orderconstraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_CONSTRAINTS__ORDERCONSTRAINT = 1;

	/**
	 * The number of structural features of the '<em>Order Delivery Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_CONSTRAINTS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Order Delivery Constraints</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_DELIVERY_CONSTRAINTS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm4.impl.DeliveryConstraintImpl <em>Delivery Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm4.impl.DeliveryConstraintImpl
	 * @see mm4.impl.Mm4PackageImpl#getDeliveryConstraint()
	 * @generated
	 */
	int DELIVERY_CONSTRAINT = 1;

	/**
	 * The feature id for the '<em><b>Constraint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONSTRAINT__CONSTRAINT_ID = 0;

	/**
	 * The feature id for the '<em><b>Maximum Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONSTRAINT__MAXIMUM_WEIGHT = 1;

	/**
	 * The feature id for the '<em><b>Maximum Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONSTRAINT__MAXIMUM_VOLUME = 2;

	/**
	 * The feature id for the '<em><b>Delivery Time Frame Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_START = 3;

	/**
	 * The feature id for the '<em><b>Delivery Time Frame End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_END = 4;

	/**
	 * The number of structural features of the '<em>Delivery Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONSTRAINT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Delivery Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DELIVERY_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mm4.impl.OrderConstraintImpl <em>Order Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mm4.impl.OrderConstraintImpl
	 * @see mm4.impl.Mm4PackageImpl#getOrderConstraint()
	 * @generated
	 */
	int ORDER_CONSTRAINT = 2;

	/**
	 * The feature id for the '<em><b>Priority Level</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__PRIORITY_LEVEL = 0;

	/**
	 * The feature id for the '<em><b>Constraint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__CONSTRAINT_ID = 1;

	/**
	 * The feature id for the '<em><b>Deliveryconstraint</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT__DELIVERYCONSTRAINT = 2;

	/**
	 * The number of structural features of the '<em>Order Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Order Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDER_CONSTRAINT_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link mm4.OrderDeliveryConstraints <em>Order Delivery Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Delivery Constraints</em>'.
	 * @see mm4.OrderDeliveryConstraints
	 * @generated
	 */
	EClass getOrderDeliveryConstraints();

	/**
	 * Returns the meta object for the attribute '{@link mm4.OrderDeliveryConstraints#getConstraintsID <em>Constraints ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraints ID</em>'.
	 * @see mm4.OrderDeliveryConstraints#getConstraintsID()
	 * @see #getOrderDeliveryConstraints()
	 * @generated
	 */
	EAttribute getOrderDeliveryConstraints_ConstraintsID();

	/**
	 * Returns the meta object for the containment reference list '{@link mm4.OrderDeliveryConstraints#getOrderconstraint <em>Orderconstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orderconstraint</em>'.
	 * @see mm4.OrderDeliveryConstraints#getOrderconstraint()
	 * @see #getOrderDeliveryConstraints()
	 * @generated
	 */
	EReference getOrderDeliveryConstraints_Orderconstraint();

	/**
	 * Returns the meta object for class '{@link mm4.DeliveryConstraint <em>Delivery Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Delivery Constraint</em>'.
	 * @see mm4.DeliveryConstraint
	 * @generated
	 */
	EClass getDeliveryConstraint();

	/**
	 * Returns the meta object for the attribute '{@link mm4.DeliveryConstraint#getConstraintID <em>Constraint ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint ID</em>'.
	 * @see mm4.DeliveryConstraint#getConstraintID()
	 * @see #getDeliveryConstraint()
	 * @generated
	 */
	EAttribute getDeliveryConstraint_ConstraintID();

	/**
	 * Returns the meta object for the attribute '{@link mm4.DeliveryConstraint#getMaximumWeight <em>Maximum Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Weight</em>'.
	 * @see mm4.DeliveryConstraint#getMaximumWeight()
	 * @see #getDeliveryConstraint()
	 * @generated
	 */
	EAttribute getDeliveryConstraint_MaximumWeight();

	/**
	 * Returns the meta object for the attribute '{@link mm4.DeliveryConstraint#getMaximumVolume <em>Maximum Volume</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Maximum Volume</em>'.
	 * @see mm4.DeliveryConstraint#getMaximumVolume()
	 * @see #getDeliveryConstraint()
	 * @generated
	 */
	EAttribute getDeliveryConstraint_MaximumVolume();

	/**
	 * Returns the meta object for the attribute '{@link mm4.DeliveryConstraint#getDeliveryTimeFrameStart <em>Delivery Time Frame Start</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Time Frame Start</em>'.
	 * @see mm4.DeliveryConstraint#getDeliveryTimeFrameStart()
	 * @see #getDeliveryConstraint()
	 * @generated
	 */
	EAttribute getDeliveryConstraint_DeliveryTimeFrameStart();

	/**
	 * Returns the meta object for the attribute '{@link mm4.DeliveryConstraint#getDeliveryTimeFrameEnd <em>Delivery Time Frame End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delivery Time Frame End</em>'.
	 * @see mm4.DeliveryConstraint#getDeliveryTimeFrameEnd()
	 * @see #getDeliveryConstraint()
	 * @generated
	 */
	EAttribute getDeliveryConstraint_DeliveryTimeFrameEnd();

	/**
	 * Returns the meta object for class '{@link mm4.OrderConstraint <em>Order Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Order Constraint</em>'.
	 * @see mm4.OrderConstraint
	 * @generated
	 */
	EClass getOrderConstraint();

	/**
	 * Returns the meta object for the attribute '{@link mm4.OrderConstraint#getPriorityLevel <em>Priority Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority Level</em>'.
	 * @see mm4.OrderConstraint#getPriorityLevel()
	 * @see #getOrderConstraint()
	 * @generated
	 */
	EAttribute getOrderConstraint_PriorityLevel();

	/**
	 * Returns the meta object for the attribute '{@link mm4.OrderConstraint#getConstraintID <em>Constraint ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Constraint ID</em>'.
	 * @see mm4.OrderConstraint#getConstraintID()
	 * @see #getOrderConstraint()
	 * @generated
	 */
	EAttribute getOrderConstraint_ConstraintID();

	/**
	 * Returns the meta object for the containment reference list '{@link mm4.OrderConstraint#getDeliveryconstraint <em>Deliveryconstraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Deliveryconstraint</em>'.
	 * @see mm4.OrderConstraint#getDeliveryconstraint()
	 * @see #getOrderConstraint()
	 * @generated
	 */
	EReference getOrderConstraint_Deliveryconstraint();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Mm4Factory getMm4Factory();

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
		 * The meta object literal for the '{@link mm4.impl.OrderDeliveryConstraintsImpl <em>Order Delivery Constraints</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm4.impl.OrderDeliveryConstraintsImpl
		 * @see mm4.impl.Mm4PackageImpl#getOrderDeliveryConstraints()
		 * @generated
		 */
		EClass ORDER_DELIVERY_CONSTRAINTS = eINSTANCE.getOrderDeliveryConstraints();

		/**
		 * The meta object literal for the '<em><b>Constraints ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_DELIVERY_CONSTRAINTS__CONSTRAINTS_ID = eINSTANCE.getOrderDeliveryConstraints_ConstraintsID();

		/**
		 * The meta object literal for the '<em><b>Orderconstraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_DELIVERY_CONSTRAINTS__ORDERCONSTRAINT = eINSTANCE
				.getOrderDeliveryConstraints_Orderconstraint();

		/**
		 * The meta object literal for the '{@link mm4.impl.DeliveryConstraintImpl <em>Delivery Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm4.impl.DeliveryConstraintImpl
		 * @see mm4.impl.Mm4PackageImpl#getDeliveryConstraint()
		 * @generated
		 */
		EClass DELIVERY_CONSTRAINT = eINSTANCE.getDeliveryConstraint();

		/**
		 * The meta object literal for the '<em><b>Constraint ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_CONSTRAINT__CONSTRAINT_ID = eINSTANCE.getDeliveryConstraint_ConstraintID();

		/**
		 * The meta object literal for the '<em><b>Maximum Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_CONSTRAINT__MAXIMUM_WEIGHT = eINSTANCE.getDeliveryConstraint_MaximumWeight();

		/**
		 * The meta object literal for the '<em><b>Maximum Volume</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_CONSTRAINT__MAXIMUM_VOLUME = eINSTANCE.getDeliveryConstraint_MaximumVolume();

		/**
		 * The meta object literal for the '<em><b>Delivery Time Frame Start</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_START = eINSTANCE
				.getDeliveryConstraint_DeliveryTimeFrameStart();

		/**
		 * The meta object literal for the '<em><b>Delivery Time Frame End</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DELIVERY_CONSTRAINT__DELIVERY_TIME_FRAME_END = eINSTANCE
				.getDeliveryConstraint_DeliveryTimeFrameEnd();

		/**
		 * The meta object literal for the '{@link mm4.impl.OrderConstraintImpl <em>Order Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mm4.impl.OrderConstraintImpl
		 * @see mm4.impl.Mm4PackageImpl#getOrderConstraint()
		 * @generated
		 */
		EClass ORDER_CONSTRAINT = eINSTANCE.getOrderConstraint();

		/**
		 * The meta object literal for the '<em><b>Priority Level</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_CONSTRAINT__PRIORITY_LEVEL = eINSTANCE.getOrderConstraint_PriorityLevel();

		/**
		 * The meta object literal for the '<em><b>Constraint ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDER_CONSTRAINT__CONSTRAINT_ID = eINSTANCE.getOrderConstraint_ConstraintID();

		/**
		 * The meta object literal for the '<em><b>Deliveryconstraint</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ORDER_CONSTRAINT__DELIVERYCONSTRAINT = eINSTANCE.getOrderConstraint_Deliveryconstraint();

	}

} //Mm4Package
