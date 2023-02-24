/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems;
import githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Workflow call Secrets Pattern Properties0 Required Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArrayImpl#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArrayImpl extends GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstractImpl implements GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray {
	/**
	 * The cached value of the '{@link #getRequired() <em>Required</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequired()
	 * @generated
	 * @ordered
	 */
	protected EList<GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems> required;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems> getRequired() {
		if (required == null) {
			required = new EObjectContainmentEList<GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems>(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems.class, this, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_TYPE_ARRAY__REQUIRED);
		}
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_TYPE_ARRAY__REQUIRED:
				return ((InternalEList<?>)getRequired()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_TYPE_ARRAY__REQUIRED:
				return getRequired();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_TYPE_ARRAY__REQUIRED:
				getRequired().clear();
				getRequired().addAll((Collection<? extends GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems>)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_TYPE_ARRAY__REQUIRED:
				getRequired().clear();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_TYPE_ARRAY__REQUIRED:
				return required != null && !required.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArrayImpl
