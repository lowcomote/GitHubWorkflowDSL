/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_callInputs;
import githubwf.GithubwfRootOnOneOf2Workflow_callPropertiesAbstract;
import githubwf.GithubwfRootOnOneOf2Workflow_callSecretsAbstract;
import githubwf.GithubwfRootOnOneOf2Workflow_callTypeObject;

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
 * An implementation of the model object '<em><b>Root On One Of2 Workflow call Type Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_callTypeObjectImpl#getWorkflow_call <em>Workflow call</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_callTypeObjectImpl#getInputs <em>Inputs</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_callTypeObjectImpl#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_callTypeObjectImpl extends GithubwfRootOnOneOf2Workflow_callAbstractImpl implements GithubwfRootOnOneOf2Workflow_callTypeObject {
	/**
	 * The cached value of the '{@link #getWorkflow_call() <em>Workflow call</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow_call()
	 * @generated
	 * @ordered
	 */
	protected EList<GithubwfRootOnOneOf2Workflow_callPropertiesAbstract> workflow_call;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Workflow_callTypeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_callTypeObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GithubwfRootOnOneOf2Workflow_callPropertiesAbstract> getWorkflow_call() {
		if (workflow_call == null) {
			workflow_call = new EObjectContainmentEList<GithubwfRootOnOneOf2Workflow_callPropertiesAbstract>(GithubwfRootOnOneOf2Workflow_callPropertiesAbstract.class, this, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_OBJECT__WORKFLOW_CALL);
		}
		return workflow_call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callInputs getInputs() {
		return this.getWorkflow_call().stream().filter(githubwf.GithubwfRootOnOneOf2Workflow_callInputs.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Workflow_callInputs.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsAbstract getSecrets() {
		return this.getWorkflow_call().stream().filter(githubwf.GithubwfRootOnOneOf2Workflow_callSecrets.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Workflow_callSecrets.class::cast).map(instance->instance.getSecrets()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("inputs".equals(key) ){return this.getInputs();}
		
		if ("secrets".equals(key) ){return this.getSecrets();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		additionalOrPatternPropertyClasses.add(githubwf.GithubwfRootOnOneOf2Workflow_callAdditionalProperties.class); 
		
		for (GithubwfRootOnOneOf2Workflow_callPropertiesAbstract child : this.getWorkflow_call()){
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_OBJECT__WORKFLOW_CALL:
				return ((InternalEList<?>)getWorkflow_call()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_OBJECT__WORKFLOW_CALL:
				return getWorkflow_call();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_OBJECT__INPUTS:
				return getInputs();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_OBJECT__SECRETS:
				return getSecrets();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_OBJECT__WORKFLOW_CALL:
				getWorkflow_call().clear();
				getWorkflow_call().addAll((Collection<? extends GithubwfRootOnOneOf2Workflow_callPropertiesAbstract>)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_OBJECT__WORKFLOW_CALL:
				getWorkflow_call().clear();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_OBJECT__WORKFLOW_CALL:
				return workflow_call != null && !workflow_call.isEmpty();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_OBJECT__INPUTS:
				return getInputs() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_OBJECT__SECRETS:
				return getSecrets() != null;
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_OBJECT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GithubwfRootOnOneOf2Workflow_callTypeObjectImpl
