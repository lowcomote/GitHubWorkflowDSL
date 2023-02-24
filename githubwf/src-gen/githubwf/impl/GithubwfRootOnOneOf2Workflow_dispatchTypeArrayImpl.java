/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchItems;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeArray;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Workflow dispatch Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_dispatchTypeArrayImpl#getWorkflow_dispatch <em>Workflow dispatch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_dispatchTypeArrayImpl extends GithubwfRootOnOneOf2Workflow_dispatchAbstractImpl implements GithubwfRootOnOneOf2Workflow_dispatchTypeArray {
	/**
	 * The cached value of the '{@link #getWorkflow_dispatch() <em>Workflow dispatch</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow_dispatch()
	 * @generated
	 * @ordered
	 */
	protected EList<GithubwfRootOnOneOf2Workflow_dispatchItems> workflow_dispatch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Workflow_dispatchTypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchTypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GithubwfRootOnOneOf2Workflow_dispatchItems> getWorkflow_dispatch() {
		if (workflow_dispatch == null) {
			workflow_dispatch = new EObjectContainmentEList<GithubwfRootOnOneOf2Workflow_dispatchItems>(GithubwfRootOnOneOf2Workflow_dispatchItems.class, this, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_ARRAY__WORKFLOW_DISPATCH);
		}
		return workflow_dispatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_ARRAY__WORKFLOW_DISPATCH:
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_ARRAY__WORKFLOW_DISPATCH:
				return getWorkflow_dispatch();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_ARRAY__WORKFLOW_DISPATCH:
				getWorkflow_dispatch().clear();
				getWorkflow_dispatch().addAll((Collection<? extends GithubwfRootOnOneOf2Workflow_dispatchItems>)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_ARRAY__WORKFLOW_DISPATCH:
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_ARRAY__WORKFLOW_DISPATCH:
				return workflow_dispatch != null && !workflow_dispatch.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootOnOneOf2Workflow_dispatchTypeArrayImpl
