/**
 */
package githubwf.impl;

import githubwf.EnvOneOf0AdditionalPropertiesTypeBoolean;
import githubwf.GithubwfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Env One Of0 Additional Properties Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.EnvOneOf0AdditionalPropertiesTypeBooleanImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvOneOf0AdditionalPropertiesTypeBooleanImpl extends EnvOneOf0AdditionalPropertiesAbstractImpl implements EnvOneOf0AdditionalPropertiesTypeBoolean {
	/**
	 * The default value of the '{@link #getAdditionalProperties() <em>Additional Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean ADDITIONAL_PROPERTIES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAdditionalProperties() <em>Additional Properties</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties()
	 * @generated
	 * @ordered
	 */
	protected Boolean additionalProperties = ADDITIONAL_PROPERTIES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvOneOf0AdditionalPropertiesTypeBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesTypeBoolean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getAdditionalProperties() {
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAdditionalProperties(Boolean newAdditionalProperties) {
		Boolean oldAdditionalProperties = additionalProperties;
		additionalProperties = newAdditionalProperties;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_BOOLEAN__ADDITIONAL_PROPERTIES, oldAdditionalProperties, additionalProperties));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_BOOLEAN__ADDITIONAL_PROPERTIES:
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
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_BOOLEAN__ADDITIONAL_PROPERTIES:
				setAdditionalProperties((Boolean)newValue);
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
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_BOOLEAN__ADDITIONAL_PROPERTIES:
				setAdditionalProperties(ADDITIONAL_PROPERTIES_EDEFAULT);
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
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_BOOLEAN__ADDITIONAL_PROPERTIES:
				return ADDITIONAL_PROPERTIES_EDEFAULT == null ? additionalProperties != null : !ADDITIONAL_PROPERTIES_EDEFAULT.equals(additionalProperties);
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
		result.append(" (additionalProperties: ");
		result.append(additionalProperties);
		result.append(')');
		return result.toString();
	}

} //EnvOneOf0AdditionalPropertiesTypeBooleanImpl
