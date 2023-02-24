/**
 */
package githubwf.impl;

import githubwf.EnvOneOf0AdditionalPropertiesPropertiesAbstract;
import githubwf.EnvOneOf0AdditionalPropertiesTypeObject;
import githubwf.GithubwfPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Env One Of0 Additional Properties Type Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.EnvOneOf0AdditionalPropertiesTypeObjectImpl#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvOneOf0AdditionalPropertiesTypeObjectImpl extends EnvOneOf0AdditionalPropertiesAbstractImpl implements EnvOneOf0AdditionalPropertiesTypeObject {
	/**
	 * The cached value of the '{@link #getAdditionalProperties() <em>Additional Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvOneOf0AdditionalPropertiesPropertiesAbstract> additionalProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvOneOf0AdditionalPropertiesTypeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getEnvOneOf0AdditionalPropertiesTypeObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EnvOneOf0AdditionalPropertiesPropertiesAbstract> getAdditionalProperties() {
		if (additionalProperties == null) {
			additionalProperties = new EObjectContainmentEList<EnvOneOf0AdditionalPropertiesPropertiesAbstract>(EnvOneOf0AdditionalPropertiesPropertiesAbstract.class, this, GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_OBJECT__ADDITIONAL_PROPERTIES);
		}
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		additionalOrPatternPropertyClasses.add(githubwf.EnvOneOf0AdditionalPropertiesAdditionalProperties.class); 
		
		for (EnvOneOf0AdditionalPropertiesPropertiesAbstract child : this.getAdditionalProperties()){
			if (!java.util.Collections.disjoint(additionalOrPatternPropertyClasses, java.util.Arrays.asList(child.getClass().getInterfaces()))){
				try{
					java.lang.reflect.Field keyField = child.getClass().getDeclaredField("key");
					if (jku.se.atl.transformation.utils.Utils.getIdentifier(keyField.get(child).toString()).equals(key)) {
						java.lang.reflect.Field valueField = java.util.Arrays.asList(child.getClass().getDeclaredFields()).stream().filter(field -> field.getName().equals("additionalProperties") || field.getName().startsWith("patternProperties") ).findAny().get();
						return valueField.get(child);
					}
				} catch (Exception e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			}
		}
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
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_OBJECT__ADDITIONAL_PROPERTIES:
				return ((InternalEList<?>)getAdditionalProperties()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_OBJECT__ADDITIONAL_PROPERTIES:
				return getAdditionalProperties();
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
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_OBJECT__ADDITIONAL_PROPERTIES:
				getAdditionalProperties().clear();
				getAdditionalProperties().addAll((Collection<? extends EnvOneOf0AdditionalPropertiesPropertiesAbstract>)newValue);
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
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_OBJECT__ADDITIONAL_PROPERTIES:
				getAdditionalProperties().clear();
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
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_OBJECT__ADDITIONAL_PROPERTIES:
				return additionalProperties != null && !additionalProperties.isEmpty();
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
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_OBJECT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //EnvOneOf0AdditionalPropertiesTypeObjectImpl
