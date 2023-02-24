/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatch;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchAbstract;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Workflow dispatch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_dispatchImpl#getWorkflow_dispatch <em>Workflow dispatch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_dispatchImpl extends GithubwfRootOnOneOf2PropertiesAbstractImpl implements GithubwfRootOnOneOf2Workflow_dispatch {
	/**
	 * The cached value of the '{@link #getWorkflow_dispatch() <em>Workflow dispatch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow_dispatch()
	 * @generated
	 * @ordered
	 */
	protected GithubwfRootOnOneOf2Workflow_dispatchAbstract workflow_dispatch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Workflow_dispatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchAbstract getWorkflow_dispatch() {
		return workflow_dispatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorkflow_dispatch(GithubwfRootOnOneOf2Workflow_dispatchAbstract newWorkflow_dispatch, NotificationChain msgs) {
		GithubwfRootOnOneOf2Workflow_dispatchAbstract oldWorkflow_dispatch = workflow_dispatch;
		workflow_dispatch = newWorkflow_dispatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH__WORKFLOW_DISPATCH, oldWorkflow_dispatch, newWorkflow_dispatch);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorkflow_dispatch(GithubwfRootOnOneOf2Workflow_dispatchAbstract newWorkflow_dispatch) {
		if (newWorkflow_dispatch != workflow_dispatch) {
			NotificationChain msgs = null;
			if (workflow_dispatch != null)
				msgs = ((InternalEObject)workflow_dispatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH__WORKFLOW_DISPATCH, null, msgs);
			if (newWorkflow_dispatch != null)
				msgs = ((InternalEObject)newWorkflow_dispatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH__WORKFLOW_DISPATCH, null, msgs);
			msgs = basicSetWorkflow_dispatch(newWorkflow_dispatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH__WORKFLOW_DISPATCH, newWorkflow_dispatch, newWorkflow_dispatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH__WORKFLOW_DISPATCH:
				return basicSetWorkflow_dispatch(null, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH__WORKFLOW_DISPATCH:
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH__WORKFLOW_DISPATCH:
				setWorkflow_dispatch((GithubwfRootOnOneOf2Workflow_dispatchAbstract)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH__WORKFLOW_DISPATCH:
				setWorkflow_dispatch((GithubwfRootOnOneOf2Workflow_dispatchAbstract)null);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH__WORKFLOW_DISPATCH:
				return workflow_dispatch != null;
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootOnOneOf2Workflow_dispatchImpl
