/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract;
import githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstract;
import githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject;

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
 * An implementation of the model object '<em><b>Root On One Of2 Workflow call Secrets Pattern Properties0 Type Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObjectImpl#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObjectImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObjectImpl#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObjectImpl extends GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0AbstractImpl implements GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject {
	/**
	 * The cached value of the '{@link #getPatternProperties0() <em>Pattern Properties0</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperties0()
	 * @generated
	 * @ordered
	 */
	protected EList<GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract> patternProperties0;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract> getPatternProperties0() {
		if (patternProperties0 == null) {
			patternProperties0 = new EObjectContainmentEList<GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract>(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract.class, this, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_OBJECT__PATTERN_PROPERTIES0);
		}
		return patternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getDescription() {
		return this.getPatternProperties0().stream().filter(githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Description.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Description.class::cast).map(instance->instance.getDescription()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstract getRequired() {
		return this.getPatternProperties0().stream().filter(githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required.class::cast).map(instance->instance.getRequired()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("description".equals(key) ){return this.getDescription();}
		
		if ("required".equals(key) ){return this.getRequired();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract child : this.getPatternProperties0()){
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_OBJECT__PATTERN_PROPERTIES0:
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_OBJECT__PATTERN_PROPERTIES0:
				return getPatternProperties0();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_OBJECT__DESCRIPTION:
				return getDescription();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_OBJECT__REQUIRED:
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_OBJECT__PATTERN_PROPERTIES0:
				getPatternProperties0().clear();
				getPatternProperties0().addAll((Collection<? extends GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract>)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_OBJECT__PATTERN_PROPERTIES0:
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_OBJECT__PATTERN_PROPERTIES0:
				return patternProperties0 != null && !patternProperties0.isEmpty();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_OBJECT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? getDescription() != null : !DESCRIPTION_EDEFAULT.equals(getDescription());
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_OBJECT__REQUIRED:
				return getRequired() != null;
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_OBJECT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObjectImpl
