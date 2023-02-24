/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalProperties;
import githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reusable Workflow Call Job Strategy Matrix Additional Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesImpl#getKey <em>Key</em>}</li>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesImpl extends ReusableWorkflowCallJobStrategyMatrixPropertiesAbstractImpl implements ReusableWorkflowCallJobStrategyMatrixAdditionalProperties {
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
	protected ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract additionalProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getReusableWorkflowCallJobStrategyMatrixAdditionalProperties();
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
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES__KEY, oldKey, key));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract getAdditionalProperties() {
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalProperties(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract newAdditionalProperties, NotificationChain msgs) {
		ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract oldAdditionalProperties = additionalProperties;
		additionalProperties = newAdditionalProperties;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES, oldAdditionalProperties, newAdditionalProperties);
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
	public void setAdditionalProperties(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract newAdditionalProperties) {
		if (newAdditionalProperties != additionalProperties) {
			NotificationChain msgs = null;
			if (additionalProperties != null)
				msgs = ((InternalEObject)additionalProperties).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES, null, msgs);
			if (newAdditionalProperties != null)
				msgs = ((InternalEObject)newAdditionalProperties).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES, null, msgs);
			msgs = basicSetAdditionalProperties(newAdditionalProperties, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES, newAdditionalProperties, newAdditionalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String validateKeyOnDefinedPatternProperties() {
		java.util.regex.Pattern  p0 = java.util.regex.Pattern.compile("^(in|ex)clude$");
		java.util.regex.Matcher m0 = p0.matcher(this.key);
		if (m0.find()){return "^(in|ex)clude$";}
		
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES__KEY:
				return getKey();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES__KEY:
				setKey((String)newValue);
				return;
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract)newValue);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES__KEY:
				setKey(KEY_EDEFAULT);
				return;
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract)null);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES__KEY:
				return KEY_EDEFAULT == null ? key != null : !KEY_EDEFAULT.equals(key);
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES__ADDITIONAL_PROPERTIES:
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES___VALIDATE_KEY_ON_DEFINED_PATTERN_PROPERTIES:
				return validateKeyOnDefinedPatternProperties();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES___VALIDATE_KEY_ON_DEFINED_PROPERTIES:
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

} //ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesImpl
