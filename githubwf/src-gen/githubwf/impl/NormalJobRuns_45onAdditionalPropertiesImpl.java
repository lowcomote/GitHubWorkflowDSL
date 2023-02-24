/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobRuns_45onAdditionalProperties;

import java.lang.reflect.InvocationTargetException;

import jsonMM.JsonDocument;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Runs 45on Additional Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobRuns_45onAdditionalPropertiesImpl#getKey <em>Key</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobRuns_45onAdditionalPropertiesImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobRuns_45onAdditionalPropertiesImpl extends NormalJobRuns_45onPropertiesAbstractImpl implements NormalJobRuns_45onAdditionalProperties {
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
	 * The cached value of the '{@link #getAdditionalProperties() <em>Additional Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties()
	 * @generated
	 * @ordered
	 */
	protected JsonDocument additionalProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobRuns_45onAdditionalPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobRuns_45onAdditionalProperties();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonDocument getAdditionalProperties() {
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalProperties(JsonDocument newAdditionalProperties, NotificationChain msgs) {
		JsonDocument oldAdditionalProperties = additionalProperties;
		additionalProperties = newAdditionalProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES, oldAdditionalProperties, newAdditionalProperties);
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
	public void setAdditionalProperties(JsonDocument newAdditionalProperties) {
		if (newAdditionalProperties != additionalProperties) {
			NotificationChain msgs = null;
			if (additionalProperties != null)
				msgs = ((InternalEObject)additionalProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES, null, msgs);
			if (newAdditionalProperties != null)
				msgs = ((InternalEObject)newAdditionalProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES, null, msgs);
			msgs = basicSetAdditionalProperties(newAdditionalProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES, newAdditionalProperties, newAdditionalProperties));
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
				return basicSetAdditionalProperties(null, msgs);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES__KEY:
				return getKey();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
				return getAdditionalProperties();
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES__KEY:
				setKey((String)newValue);
				return;
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((JsonDocument)newValue);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((JsonDocument)null);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
				return additionalProperties != null;
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES___VALIDATE_KEY_ON_DEFINED_PATTERN_PROPERTIES:
				return validateKeyOnDefinedPatternProperties();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES___VALIDATE_KEY_ON_DEFINED_PROPERTIES:
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

} //NormalJobRuns_45onAdditionalPropertiesImpl
