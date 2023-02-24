/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0;
import githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Abstract;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Workflow call Secrets Pattern Properties0</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Impl#getKey <em>Key</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Impl#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Impl extends GithubwfRootOnOneOf2Workflow_callSecretsPropertiesAbstractImpl implements GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0 {
	/**
	 * The default value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected static final String KEY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getKey() <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getKey()
	 * @generated
	 * @ordered
	 */
	protected String key = KEY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPatternProperties0() <em>Pattern Properties0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperties0()
	 * @generated
	 * @ordered
	 */
	protected GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Abstract patternProperties0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getKey() {
		return key;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setKey(String newKey) {
		String oldKey = key;
		key = newKey;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Abstract getPatternProperties0() {
		return patternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternProperties0(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Abstract newPatternProperties0, NotificationChain msgs) {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Abstract oldPatternProperties0 = patternProperties0;
		patternProperties0 = newPatternProperties0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0, oldPatternProperties0, newPatternProperties0);
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
	public void setPatternProperties0(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Abstract newPatternProperties0) {
		if (newPatternProperties0 != patternProperties0) {
			NotificationChain msgs = null;
			if (patternProperties0 != null)
				msgs = ((InternalEObject)patternProperties0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0, null, msgs);
			if (newPatternProperties0 != null)
				msgs = ((InternalEObject)newPatternProperties0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0, null, msgs);
			msgs = basicSetPatternProperties0(newPatternProperties0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0, newPatternProperties0, newPatternProperties0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean find(final String toBeEvaluated) {
		java.util.regex.Pattern  p = java.util.regex.Pattern.compile("^[_a-zA-Z][a-zA-Z0-9_-]*$");
		java.util.regex.Matcher m = p.matcher(toBeEvaluated);
		return m.find();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean find() {
		java.util.regex.Pattern  p = java.util.regex.Pattern.compile("^[_a-zA-Z][a-zA-Z0-9_-]*$");
		java.util.regex.Matcher m = p.matcher(this.key);
		return m.find();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String validateKeyOnDefinedPatternProperties() {
		return null;
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String validateKeyOnDefinedProperties() {
		return null;
		
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
				return basicSetPatternProperties0(null, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0__KEY:
				return getKey();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0__KEY:
				setKey((String)newValue);
				return;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
				setPatternProperties0((GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Abstract)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
				setPatternProperties0((GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Abstract)null);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
				return patternProperties0 != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0___FIND__STRING:
				return find((String)arguments.get(0));
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0___FIND:
				return find();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0___VALIDATE_KEY_ON_DEFINED_PATTERN_PROPERTIES:
				return validateKeyOnDefinedPatternProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0___VALIDATE_KEY_ON_DEFINED_PROPERTIES:
				return validateKeyOnDefinedProperties();
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (key: ");
		result.append(key);
		result.append(')');
		return result.toString();
	}

} //GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Impl
