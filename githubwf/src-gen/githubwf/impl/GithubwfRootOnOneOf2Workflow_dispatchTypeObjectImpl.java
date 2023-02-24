/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputs;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstract;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeObject;

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
 * An implementation of the model object '<em><b>Root On One Of2 Workflow dispatch Type Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_dispatchTypeObjectImpl#getWorkflow_dispatch <em>Workflow dispatch</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_dispatchTypeObjectImpl#getInputs <em>Inputs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_dispatchTypeObjectImpl extends GithubwfRootOnOneOf2Workflow_dispatchAbstractImpl implements GithubwfRootOnOneOf2Workflow_dispatchTypeObject {
	/**
	 * The cached value of the '{@link #getWorkflow_dispatch() <em>Workflow dispatch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow_dispatch()
	 * @generated
	 * @ordered
	 */
	protected EList<GithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstract> workflow_dispatch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Workflow_dispatchTypeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchTypeObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstract> getWorkflow_dispatch() {
		if (workflow_dispatch == null) {
			workflow_dispatch = new EObjectContainmentEList<GithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstract>(GithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstract.class, this, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_OBJECT__WORKFLOW_DISPATCH);
		}
		return workflow_dispatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputs getInputs() {
		return this.getWorkflow_dispatch().stream().filter(githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputs.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputs.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("inputs".equals(key) ){return this.getInputs();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		additionalOrPatternPropertyClasses.add(githubwf.GithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties.class); 
		
		for (GithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstract child : this.getWorkflow_dispatch()){
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_OBJECT__WORKFLOW_DISPATCH:
				return ((InternalEList<?>)getWorkflow_dispatch()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_OBJECT__WORKFLOW_DISPATCH:
				return getWorkflow_dispatch();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_OBJECT__INPUTS:
				return getInputs();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_OBJECT__WORKFLOW_DISPATCH:
				getWorkflow_dispatch().clear();
				getWorkflow_dispatch().addAll((Collection<? extends GithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstract>)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_OBJECT__WORKFLOW_DISPATCH:
				getWorkflow_dispatch().clear();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_OBJECT__WORKFLOW_DISPATCH:
				return workflow_dispatch != null && !workflow_dispatch.isEmpty();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_OBJECT__INPUTS:
				return getInputs() != null;
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_OBJECT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GithubwfRootOnOneOf2Workflow_dispatchTypeObjectImpl
