/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Pull request target Pattern Properties0 Type Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeIntegerImpl#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeIntegerImpl extends GithubwfRootOnOneOf2Pull_request_targetPatternProperties0AbstractImpl implements GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger {
	/**
	 * The default value of the '{@link #getPatternProperties0() <em>Pattern Properties0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperties0()
	 * @generated
	 * @ordered
	 */
	protected static final Double PATTERN_PROPERTIES0_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatternProperties0() <em>Pattern Properties0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperties0()
	 * @generated
	 * @ordered
	 */
	protected Double patternProperties0 = PATTERN_PROPERTIES0_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeIntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getPatternProperties0() {
		return patternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPatternProperties0(Double newPatternProperties0) {
		Double oldPatternProperties0 = patternProperties0;
		patternProperties0 = newPatternProperties0;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0_TYPE_INTEGER__PATTERN_PROPERTIES0, oldPatternProperties0, patternProperties0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0_TYPE_INTEGER__PATTERN_PROPERTIES0:
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0_TYPE_INTEGER__PATTERN_PROPERTIES0:
				setPatternProperties0((Double)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0_TYPE_INTEGER__PATTERN_PROPERTIES0:
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0_TYPE_INTEGER__PATTERN_PROPERTIES0:
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

} //GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeIntegerImpl
