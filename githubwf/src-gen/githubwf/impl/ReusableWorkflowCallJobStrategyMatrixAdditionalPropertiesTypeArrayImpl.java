/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems;
import githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reusable Workflow Call Job Strategy Matrix Additional Properties Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayImpl extends ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractImpl implements ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray {
	/**
	 * The cached value of the '{@link #getAdditionalProperties() <em>Additional Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems> additionalProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems> getAdditionalProperties() {
		if (additionalProperties == null) {
			additionalProperties = new EObjectContainmentEList<ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems>(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems.class, this, GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_ARRAY__ADDITIONAL_PROPERTIES);
		}
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_ARRAY__ADDITIONAL_PROPERTIES:
				return ((InternalEList<?>)getAdditionalProperties()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_ARRAY__ADDITIONAL_PROPERTIES:
				return getAdditionalProperties();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_ARRAY__ADDITIONAL_PROPERTIES:
				getAdditionalProperties().clear();
				getAdditionalProperties().addAll((Collection<? extends ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_ARRAY__ADDITIONAL_PROPERTIES:
				getAdditionalProperties().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_ARRAY__ADDITIONAL_PROPERTIES:
				return additionalProperties != null && !additionalProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayImpl
