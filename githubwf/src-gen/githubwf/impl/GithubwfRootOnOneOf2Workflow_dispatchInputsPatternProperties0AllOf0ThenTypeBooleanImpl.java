/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Then Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanImpl#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanImpl extends GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractImpl implements GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean {
	/**
	 * The default value of the '{@link #getPatternProperties0() <em>Pattern Properties0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperties0()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean PATTERN_PROPERTIES0_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatternProperties0() <em>Pattern Properties0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperties0()
	 * @generated
	 * @ordered
	 */
	protected Boolean patternProperties0 = PATTERN_PROPERTIES0_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getPatternProperties0() {
		return patternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatternProperties0(Boolean newPatternProperties0) {
		Boolean oldPatternProperties0 = patternProperties0;
		patternProperties0 = newPatternProperties0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_TYPE_BOOLEAN__PATTERN_PROPERTIES0, oldPatternProperties0, patternProperties0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_TYPE_BOOLEAN__PATTERN_PROPERTIES0:
				return getPatternProperties0();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_TYPE_BOOLEAN__PATTERN_PROPERTIES0:
				setPatternProperties0((Boolean)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_TYPE_BOOLEAN__PATTERN_PROPERTIES0:
				setPatternProperties0(PATTERN_PROPERTIES0_EDEFAULT);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_TYPE_BOOLEAN__PATTERN_PROPERTIES0:
				return PATTERN_PROPERTIES0_EDEFAULT == null ? patternProperties0 != null : !PATTERN_PROPERTIES0_EDEFAULT.equals(patternProperties0);
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
		result.append(" (patternProperties0: ");
		result.append(patternProperties0);
		result.append(')');
		return result.toString();
	}

} //GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanImpl
