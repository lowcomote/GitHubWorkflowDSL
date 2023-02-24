/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract;
import githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reusable Workflow Call Job Strategy Matrix Additional Properties Type Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectImpl extends ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractImpl implements ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject {
	/**
	 * The cached value of the '{@link #getAdditionalProperties() <em>Additional Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract> additionalProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract> getAdditionalProperties() {
		if (additionalProperties == null) {
			additionalProperties = new EObjectContainmentEList<ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract>(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract.class, this, GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_OBJECT__ADDITIONAL_PROPERTIES);
		}
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		additionalOrPatternPropertyClasses.add(githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties.class); 
		
		for (ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract child : this.getAdditionalProperties()){
			if (!java.util.Collections.disjoint(additionalOrPatternPropertyClasses, java.util.Arrays.asList(child.getClass().getInterfaces()))){
				try{
					java.lang.reflect.Field keyField = child.getClass().getDeclaredField("key");
					if (jku.se.atl.transformation.utils.Utils.getIdentifier(keyField.get(child).toString()).equals(key)) {
						java.lang.reflect.Field valueField = java.util.Arrays.asList(child.getClass().getDeclaredFields()).stream().filter(field -> field.getName().equals("additionalProperties") || field.getName().startsWith("patternProperties") ).findAny().get();
						return valueField.get(child);
					}
				} catch (Exception e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			}
		}
		return null;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_OBJECT__ADDITIONAL_PROPERTIES:
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_OBJECT__ADDITIONAL_PROPERTIES:
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_OBJECT__ADDITIONAL_PROPERTIES:
				getAdditionalProperties().clear();
				getAdditionalProperties().addAll((Collection<? extends ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract>)newValue);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_OBJECT__ADDITIONAL_PROPERTIES:
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_OBJECT__ADDITIONAL_PROPERTIES:
				return additionalProperties != null && !additionalProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_OBJECT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectImpl
