/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.ReusableWorkflowCallJobSecrets;
import githubwf.ReusableWorkflowCallJobSecretsAbstract;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reusable Workflow Call Job Secrets</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobSecretsImpl#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReusableWorkflowCallJobSecretsImpl extends ReusableWorkflowCallJobPropertiesAbstractImpl implements ReusableWorkflowCallJobSecrets {
	/**
	 * The cached value of the '{@link #getSecrets() <em>Secrets</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets()
	 * @generated
	 * @ordered
	 */
	protected ReusableWorkflowCallJobSecretsAbstract secrets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReusableWorkflowCallJobSecretsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getReusableWorkflowCallJobSecrets();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobSecretsAbstract getSecrets() {
		return secrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecrets(ReusableWorkflowCallJobSecretsAbstract newSecrets, NotificationChain msgs) {
		ReusableWorkflowCallJobSecretsAbstract oldSecrets = secrets;
		secrets = newSecrets;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS__SECRETS, oldSecrets, newSecrets);
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
	public void setSecrets(ReusableWorkflowCallJobSecretsAbstract newSecrets) {
		if (newSecrets != secrets) {
			NotificationChain msgs = null;
			if (secrets != null)
				msgs = ((InternalEObject)secrets).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS__SECRETS, null, msgs);
			if (newSecrets != null)
				msgs = ((InternalEObject)newSecrets).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS__SECRETS, null, msgs);
			msgs = basicSetSecrets(newSecrets, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS__SECRETS, newSecrets, newSecrets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS__SECRETS:
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS__SECRETS:
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS__SECRETS:
				setSecrets((ReusableWorkflowCallJobSecretsAbstract)newValue);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS__SECRETS:
				setSecrets((ReusableWorkflowCallJobSecretsAbstract)null);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS__SECRETS:
				return secrets != null;
		}
		return super.eIsSet(featureID);
	}

} //ReusableWorkflowCallJobSecretsImpl
