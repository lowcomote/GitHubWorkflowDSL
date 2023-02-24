/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeNumber;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Workflow dispatch Type Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_dispatchTypeNumberImpl#getWorkflow_dispatch <em>Workflow dispatch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_dispatchTypeNumberImpl extends GithubwfRootOnOneOf2Workflow_dispatchAbstractImpl implements GithubwfRootOnOneOf2Workflow_dispatchTypeNumber {
	/**
	 * The default value of the '{@link #getWorkflow_dispatch() <em>Workflow dispatch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow_dispatch()
	 * @generated
	 * @ordered
	 */
	protected static final Double WORKFLOW_DISPATCH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorkflow_dispatch() <em>Workflow dispatch</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow_dispatch()
	 * @generated
	 * @ordered
	 */
	protected Double workflow_dispatch = WORKFLOW_DISPATCH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Workflow_dispatchTypeNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchTypeNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getWorkflow_dispatch() {
		return workflow_dispatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkflow_dispatch(Double newWorkflow_dispatch) {
		Double oldWorkflow_dispatch = workflow_dispatch;
		workflow_dispatch = newWorkflow_dispatch;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_NUMBER__WORKFLOW_DISPATCH, oldWorkflow_dispatch, workflow_dispatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_NUMBER__WORKFLOW_DISPATCH:
				return getWorkflow_dispatch();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_NUMBER__WORKFLOW_DISPATCH:
				setWorkflow_dispatch((Double)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_NUMBER__WORKFLOW_DISPATCH:
				setWorkflow_dispatch(WORKFLOW_DISPATCH_EDEFAULT);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_NUMBER__WORKFLOW_DISPATCH:
				return WORKFLOW_DISPATCH_EDEFAULT == null ? workflow_dispatch != null : !WORKFLOW_DISPATCH_EDEFAULT.equals(workflow_dispatch);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (workflow_dispatch: ");
		result.append(workflow_dispatch);
		result.append(')');
		return result.toString();
	}

} //GithubwfRootOnOneOf2Workflow_dispatchTypeNumberImpl
