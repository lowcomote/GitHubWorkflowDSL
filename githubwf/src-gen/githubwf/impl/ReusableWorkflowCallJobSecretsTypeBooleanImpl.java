/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.ReusableWorkflowCallJobSecretsTypeBoolean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reusable Workflow Call Job Secrets Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobSecretsTypeBooleanImpl#getSecrets <em>Secrets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReusableWorkflowCallJobSecretsTypeBooleanImpl extends ReusableWorkflowCallJobSecretsAbstractImpl implements ReusableWorkflowCallJobSecretsTypeBoolean {
	/**
	 * The default value of the '{@link #getSecrets() <em>Secrets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean SECRETS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSecrets() <em>Secrets</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecrets()
	 * @generated
	 * @ordered
	 */
	protected Boolean secrets = SECRETS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReusableWorkflowCallJobSecretsTypeBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getReusableWorkflowCallJobSecretsTypeBoolean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getSecrets() {
		return secrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSecrets(Boolean newSecrets) {
		Boolean oldSecrets = secrets;
		secrets = newSecrets;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_TYPE_BOOLEAN__SECRETS, oldSecrets, secrets));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_TYPE_BOOLEAN__SECRETS:
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_TYPE_BOOLEAN__SECRETS:
				setSecrets((Boolean)newValue);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_TYPE_BOOLEAN__SECRETS:
				setSecrets(SECRETS_EDEFAULT);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_TYPE_BOOLEAN__SECRETS:
				return SECRETS_EDEFAULT == null ? secrets != null : !SECRETS_EDEFAULT.equals(secrets);
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
		result.append(" (secrets: ");
		result.append(secrets);
		result.append(')');
		return result.toString();
	}

} //ReusableWorkflowCallJobSecretsTypeBooleanImpl
