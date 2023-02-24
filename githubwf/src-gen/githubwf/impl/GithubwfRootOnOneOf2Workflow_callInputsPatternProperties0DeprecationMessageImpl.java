/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Workflow call Inputs Pattern Properties0 Deprecation Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessageImpl#getDeprecationMessage <em>Deprecation Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessageImpl extends GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstractImpl implements GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage {
	/**
	 * The default value of the '{@link #getDeprecationMessage() <em>Deprecation Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecationMessage()
	 * @generated
	 * @ordered
	 */
	protected static final String DEPRECATION_MESSAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDeprecationMessage() <em>Deprecation Message</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeprecationMessage()
	 * @generated
	 * @ordered
	 */
	protected String deprecationMessage = DEPRECATION_MESSAGE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDeprecationMessage() {
		return deprecationMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDeprecationMessage(String newDeprecationMessage) {
		String oldDeprecationMessage = deprecationMessage;
		deprecationMessage = newDeprecationMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEPRECATION_MESSAGE__DEPRECATION_MESSAGE, oldDeprecationMessage, deprecationMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEPRECATION_MESSAGE__DEPRECATION_MESSAGE:
				return getDeprecationMessage();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEPRECATION_MESSAGE__DEPRECATION_MESSAGE:
				setDeprecationMessage((String)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEPRECATION_MESSAGE__DEPRECATION_MESSAGE:
				setDeprecationMessage(DEPRECATION_MESSAGE_EDEFAULT);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEPRECATION_MESSAGE__DEPRECATION_MESSAGE:
				return DEPRECATION_MESSAGE_EDEFAULT == null ? deprecationMessage != null : !DEPRECATION_MESSAGE_EDEFAULT.equals(deprecationMessage);
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
		result.append(" (deprecationMessage: ");
		result.append(deprecationMessage);
		result.append(')');
		return result.toString();
	}

} //GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessageImpl
