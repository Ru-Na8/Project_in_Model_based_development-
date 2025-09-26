/**
 */
package mm4;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Delivery Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mm4.DeliveryConstraint#getConstraintID <em>Constraint ID</em>}</li>
 *   <li>{@link mm4.DeliveryConstraint#getMaximumWeight <em>Maximum Weight</em>}</li>
 *   <li>{@link mm4.DeliveryConstraint#getMaximumVolume <em>Maximum Volume</em>}</li>
 *   <li>{@link mm4.DeliveryConstraint#getDeliveryTimeFrameStart <em>Delivery Time Frame Start</em>}</li>
 *   <li>{@link mm4.DeliveryConstraint#getDeliveryTimeFrameEnd <em>Delivery Time Frame End</em>}</li>
 * </ul>
 *
 * @see mm4.Mm4Package#getDeliveryConstraint()
 * @model
 * @generated
 */
public interface DeliveryConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Constraint ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint ID</em>' attribute.
	 * @see #setConstraintID(String)
	 * @see mm4.Mm4Package#getDeliveryConstraint_ConstraintID()
	 * @model
	 * @generated
	 */
	String getConstraintID();

	/**
	 * Sets the value of the '{@link mm4.DeliveryConstraint#getConstraintID <em>Constraint ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Constraint ID</em>' attribute.
	 * @see #getConstraintID()
	 * @generated
	 */
	void setConstraintID(String value);

	/**
	 * Returns the value of the '<em><b>Maximum Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Weight</em>' attribute.
	 * @see #setMaximumWeight(int)
	 * @see mm4.Mm4Package#getDeliveryConstraint_MaximumWeight()
	 * @model
	 * @generated
	 */
	int getMaximumWeight();

	/**
	 * Sets the value of the '{@link mm4.DeliveryConstraint#getMaximumWeight <em>Maximum Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Weight</em>' attribute.
	 * @see #getMaximumWeight()
	 * @generated
	 */
	void setMaximumWeight(int value);

	/**
	 * Returns the value of the '<em><b>Maximum Volume</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Maximum Volume</em>' attribute.
	 * @see #setMaximumVolume(int)
	 * @see mm4.Mm4Package#getDeliveryConstraint_MaximumVolume()
	 * @model
	 * @generated
	 */
	int getMaximumVolume();

	/**
	 * Sets the value of the '{@link mm4.DeliveryConstraint#getMaximumVolume <em>Maximum Volume</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Maximum Volume</em>' attribute.
	 * @see #getMaximumVolume()
	 * @generated
	 */
	void setMaximumVolume(int value);

	/**
	 * Returns the value of the '<em><b>Delivery Time Frame Start</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Time Frame Start</em>' attribute.
	 * @see #setDeliveryTimeFrameStart(Date)
	 * @see mm4.Mm4Package#getDeliveryConstraint_DeliveryTimeFrameStart()
	 * @model
	 * @generated
	 */
	Date getDeliveryTimeFrameStart();

	/**
	 * Sets the value of the '{@link mm4.DeliveryConstraint#getDeliveryTimeFrameStart <em>Delivery Time Frame Start</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Time Frame Start</em>' attribute.
	 * @see #getDeliveryTimeFrameStart()
	 * @generated
	 */
	void setDeliveryTimeFrameStart(Date value);

	/**
	 * Returns the value of the '<em><b>Delivery Time Frame End</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delivery Time Frame End</em>' attribute.
	 * @see #setDeliveryTimeFrameEnd(Date)
	 * @see mm4.Mm4Package#getDeliveryConstraint_DeliveryTimeFrameEnd()
	 * @model
	 * @generated
	 */
	Date getDeliveryTimeFrameEnd();

	/**
	 * Sets the value of the '{@link mm4.DeliveryConstraint#getDeliveryTimeFrameEnd <em>Delivery Time Frame End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delivery Time Frame End</em>' attribute.
	 * @see #getDeliveryTimeFrameEnd()
	 * @generated
	 */
	void setDeliveryTimeFrameEnd(Date value);

} // DeliveryConstraint
