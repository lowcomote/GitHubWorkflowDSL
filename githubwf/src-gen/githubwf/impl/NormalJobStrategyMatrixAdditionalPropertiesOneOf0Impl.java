/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0;
import githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Strategy Matrix Additional Properties One Of0</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobStrategyMatrixAdditionalPropertiesOneOf0Impl#getAdditionalProperties <em>Additional Properties</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobStrategyMatrixAdditionalPropertiesOneOf0Impl extends MinimalEObjectImpl.Container implements NormalJobStrategyMatrixAdditionalPropertiesOneOf0 {
	/**
	 * The cached value of the '{@link #getAdditionalProperties() <em>Additional Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items> additionalProperties;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobStrategyMatrixAdditionalPropertiesOneOf0Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobStrategyMatrixAdditionalPropertiesOneOf0();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items> getAdditionalProperties() {
		if (additionalProperties == null) {
			additionalProperties = new EObjectContainmentEList<NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items>(NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items.class, this, GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ONE_OF0__ADDITIONAL_PROPERTIES);
		}
		return additionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ONE_OF0__ADDITIONAL_PROPERTIES:
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
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ONE_OF0__ADDITIONAL_PROPERTIES:
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
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ONE_OF0__ADDITIONAL_PROPERTIES:
				getAdditionalProperties().clear();
				getAdditionalProperties().addAll((Collection<? extends NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items>)newValue);
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
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ONE_OF0__ADDITIONAL_PROPERTIES:
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
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ONE_OF0__ADDITIONAL_PROPERTIES:
				return additionalProperties != null && !additionalProperties.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NormalJobStrategyMatrixAdditionalPropertiesOneOf0Impl
