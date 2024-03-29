/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2PushPatternProperties0;
import githubwf.GithubwfRootOnOneOf2PushPatternProperties0Items;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Push Pattern Properties0</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2PushPatternProperties0Impl#getKey <em>Key</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2PushPatternProperties0Impl#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2PushPatternProperties0Impl extends MinimalEObjectImpl.Container implements GithubwfRootOnOneOf2PushPatternProperties0 {
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
	 * The cached value of the '{@link #getPatternProperties0() <em>Pattern Properties0</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperties0()
	 * @generated
	 * @ordered
	 */
	protected EList<GithubwfRootOnOneOf2PushPatternProperties0Items> patternProperties0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2PushPatternProperties0Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2PushPatternProperties0();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GithubwfRootOnOneOf2PushPatternProperties0Items> getPatternProperties0() {
		if (patternProperties0 == null) {
			patternProperties0 = new EObjectContainmentEList<GithubwfRootOnOneOf2PushPatternProperties0Items>(GithubwfRootOnOneOf2PushPatternProperties0Items.class, this, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0);
		}
		return patternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean find(final String toBeEvaluated) {
		java.util.regex.Pattern  p = java.util.regex.Pattern.compile("^(branche|tag|path)s(-ignore)?$");
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
		java.util.regex.Pattern  p = java.util.regex.Pattern.compile("^(branche|tag|path)s(-ignore)?$");
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
				return ((InternalEList<?>)getPatternProperties0()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0__KEY:
				return getKey();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
				return getPatternProperties0();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0__KEY:
				setKey((String)newValue);
				return;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
				getPatternProperties0().clear();
				getPatternProperties0().addAll((Collection<? extends GithubwfRootOnOneOf2PushPatternProperties0Items>)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
				getPatternProperties0().clear();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
				return patternProperties0 != null && !patternProperties0.isEmpty();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0___FIND__STRING:
				return find((String)arguments.get(0));
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0___FIND:
				return find();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0___VALIDATE_KEY_ON_DEFINED_PATTERN_PROPERTIES:
				return validateKeyOnDefinedPatternProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0___VALIDATE_KEY_ON_DEFINED_PROPERTIES:
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

} //GithubwfRootOnOneOf2PushPatternProperties0Impl
