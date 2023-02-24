/**
 */
package githubwf.impl;

import githubwf.Env;
import githubwf.GithubwfPackage;
import githubwf.ReusableWorkflowCallJobSecretsOneOf0;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reusable Workflow Call Job Secrets One Of0</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobSecretsOneOf0Impl#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReusableWorkflowCallJobSecretsOneOf0Impl extends MinimalEObjectImpl.Container implements ReusableWorkflowCallJobSecretsOneOf0 {
	/**
	 * The cached value of the '{@link #getSecrets() <em>Secrets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets()
	 * @generated
	 * @ordered
	 */
	protected Env secrets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReusableWorkflowCallJobSecretsOneOf0Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getReusableWorkflowCallJobSecretsOneOf0();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Env getSecrets() {
		return secrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecrets(Env newSecrets, NotificationChain msgs) {
		Env oldSecrets = secrets;
		secrets = newSecrets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_ONE_OF0__SECRETS, oldSecrets, newSecrets);
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
	public void setSecrets(Env newSecrets) {
		if (newSecrets != secrets) {
			NotificationChain msgs = null;
			if (secrets != null)
				msgs = ((InternalEObject)secrets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_ONE_OF0__SECRETS, null, msgs);
			if (newSecrets != null)
				msgs = ((InternalEObject)newSecrets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_ONE_OF0__SECRETS, null, msgs);
			msgs = basicSetSecrets(newSecrets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_ONE_OF0__SECRETS, newSecrets, newSecrets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_ONE_OF0__SECRETS:
				return basicSetSecrets(null, msgs);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_ONE_OF0__SECRETS:
				return getSecrets();
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_ONE_OF0__SECRETS:
				setSecrets((Env)newValue);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_ONE_OF0__SECRETS:
				setSecrets((Env)null);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_ONE_OF0__SECRETS:
				return secrets != null;
		}
		return super.eIsSet(featureID);
	}

} //ReusableWorkflowCallJobSecretsOneOf0Impl
