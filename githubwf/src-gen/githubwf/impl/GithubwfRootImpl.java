/**
 */
package githubwf.impl;

import githubwf.Defaults;
import githubwf.Env;
import githubwf.GithubwfPackage;
import githubwf.GithubwfRoot;
import githubwf.GithubwfRootConcurrencyAbstract;
import githubwf.GithubwfRootJobs;
import githubwf.GithubwfRootOnAbstract;
import githubwf.GithubwfRootPropertiesAbstract;
import githubwf.Permissions;

import java.lang.reflect.InvocationTargetException;

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
 * An implementation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootImpl#getGithubwfRoot <em>Githubwf Root</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootImpl#getName <em>Name</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootImpl#getOn <em>On</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootImpl#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootImpl#getJobs <em>Jobs</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootImpl#getRun_45name <em>Run 45name</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootImpl#getPermissions <em>Permissions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootImpl extends MinimalEObjectImpl.Container implements GithubwfRoot {
	/**
	 * The cached value of the '{@link #getGithubwfRoot() <em>Githubwf Root</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGithubwfRoot()
	 * @generated
	 * @ordered
	 */
	protected EList<GithubwfRootPropertiesAbstract> githubwfRoot;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getRun_45name() <em>Run 45name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun_45name()
	 * @generated
	 * @ordered
	 */
	protected static final String RUN_45NAME_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRoot();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GithubwfRootPropertiesAbstract> getGithubwfRoot() {
		if (githubwfRoot == null) {
			githubwfRoot = new EObjectContainmentEList<GithubwfRootPropertiesAbstract>(GithubwfRootPropertiesAbstract.class, this, GithubwfPackage.GITHUBWF_ROOT__GITHUBWF_ROOT);
		}
		return githubwfRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return this.getGithubwfRoot().stream().filter(githubwf.GithubwfRootName.class::isInstance).findAny().map(githubwf.GithubwfRootName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnAbstract getOn() {
		return this.getGithubwfRoot().stream().filter(githubwf.GithubwfRootOn.class::isInstance).findAny().map(githubwf.GithubwfRootOn.class::cast).map(instance->instance.getOn()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Env getEnv() {
		return this.getGithubwfRoot().stream().filter(githubwf.GithubwfRootEnv.class::isInstance).findAny().map(githubwf.GithubwfRootEnv.class::cast).map(instance->instance.getEnv()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Defaults getDefaults() {
		return this.getGithubwfRoot().stream().filter(githubwf.GithubwfRootDefaults.class::isInstance).findAny().map(githubwf.GithubwfRootDefaults.class::cast).map(instance->instance.getDefaults()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootConcurrencyAbstract getConcurrency() {
		return this.getGithubwfRoot().stream().filter(githubwf.GithubwfRootConcurrency.class::isInstance).findAny().map(githubwf.GithubwfRootConcurrency.class::cast).map(instance->instance.getConcurrency()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootJobs getJobs() {
		return this.getGithubwfRoot().stream().filter(githubwf.GithubwfRootJobs.class::isInstance).findAny().map(githubwf.GithubwfRootJobs.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRun_45name() {
		return this.getGithubwfRoot().stream().filter(githubwf.GithubwfRootRun_45name.class::isInstance).findAny().map(githubwf.GithubwfRootRun_45name.class::cast).map(instance->instance.getRun_45name()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions getPermissions() {
		return this.getGithubwfRoot().stream().filter(githubwf.GithubwfRootPermissions.class::isInstance).findAny().map(githubwf.GithubwfRootPermissions.class::cast).map(instance->instance.getPermissions()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("name".equals(key) ){return this.getName();}
		
		if ("on".equals(key) ){return this.getOn();}
		
		if ("env".equals(key) ){return this.getEnv();}
		
		if ("defaults".equals(key) ){return this.getDefaults();}
		
		if ("concurrency".equals(key) ){return this.getConcurrency();}
		
		if ("jobs".equals(key) ){return this.getJobs();}
		
		if ("run_45name".equals(key) ){return this.getRun_45name();}
		
		if ("permissions".equals(key) ){return this.getPermissions();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (GithubwfRootPropertiesAbstract child : this.getGithubwfRoot()){
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
			case GithubwfPackage.GITHUBWF_ROOT__GITHUBWF_ROOT:
				return ((InternalEList<?>)getGithubwfRoot()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT__GITHUBWF_ROOT:
				return getGithubwfRoot();
			case GithubwfPackage.GITHUBWF_ROOT__NAME:
				return getName();
			case GithubwfPackage.GITHUBWF_ROOT__ON:
				return getOn();
			case GithubwfPackage.GITHUBWF_ROOT__ENV:
				return getEnv();
			case GithubwfPackage.GITHUBWF_ROOT__DEFAULTS:
				return getDefaults();
			case GithubwfPackage.GITHUBWF_ROOT__CONCURRENCY:
				return getConcurrency();
			case GithubwfPackage.GITHUBWF_ROOT__JOBS:
				return getJobs();
			case GithubwfPackage.GITHUBWF_ROOT__RUN_45NAME:
				return getRun_45name();
			case GithubwfPackage.GITHUBWF_ROOT__PERMISSIONS:
				return getPermissions();
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
			case GithubwfPackage.GITHUBWF_ROOT__GITHUBWF_ROOT:
				getGithubwfRoot().clear();
				getGithubwfRoot().addAll((Collection<? extends GithubwfRootPropertiesAbstract>)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT__GITHUBWF_ROOT:
				getGithubwfRoot().clear();
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
			case GithubwfPackage.GITHUBWF_ROOT__GITHUBWF_ROOT:
				return githubwfRoot != null && !githubwfRoot.isEmpty();
			case GithubwfPackage.GITHUBWF_ROOT__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GithubwfPackage.GITHUBWF_ROOT__ON:
				return getOn() != null;
			case GithubwfPackage.GITHUBWF_ROOT__ENV:
				return getEnv() != null;
			case GithubwfPackage.GITHUBWF_ROOT__DEFAULTS:
				return getDefaults() != null;
			case GithubwfPackage.GITHUBWF_ROOT__CONCURRENCY:
				return getConcurrency() != null;
			case GithubwfPackage.GITHUBWF_ROOT__JOBS:
				return getJobs() != null;
			case GithubwfPackage.GITHUBWF_ROOT__RUN_45NAME:
				return RUN_45NAME_EDEFAULT == null ? getRun_45name() != null : !RUN_45NAME_EDEFAULT.equals(getRun_45name());
			case GithubwfPackage.GITHUBWF_ROOT__PERMISSIONS:
				return getPermissions() != null;
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
			case GithubwfPackage.GITHUBWF_ROOT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GithubwfRootImpl
