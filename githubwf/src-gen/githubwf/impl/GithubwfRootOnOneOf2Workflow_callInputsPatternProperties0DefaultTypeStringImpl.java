/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Workflow call Inputs Pattern Properties0 Default Type String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeStringImpl#getDefault_ <em>Default </em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeStringImpl extends GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstractImpl implements GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString {
	/**
	 * The default value of the '{@link #getDefault_() <em>Default </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT__EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefault_() <em>Default </em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_()
	 * @generated
	 * @ordered
	 */
	protected String default_ = DEFAULT__EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDefault_() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefault_(String newDefault_) {
		String oldDefault_ = default_;
		default_ = newDefault_;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_STRING__DEFAULT_, oldDefault_, default_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_STRING__DEFAULT_:
				return getDefault_();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_STRING__DEFAULT_:
				setDefault_((String)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_STRING__DEFAULT_:
				setDefault_(DEFAULT__EDEFAULT);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_STRING__DEFAULT_:
				return DEFAULT__EDEFAULT == null ? default_ != null : !DEFAULT__EDEFAULT.equals(default_);
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
		result.append(" (default_: ");
		result.append(default_);
		result.append(')');
		return result.toString();
	}

} //GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeStringImpl
