/**
 */
package githubwf.impl;

import githubwf.Defaults;
import githubwf.Env;
import githubwf.GithubwfPackage;
import githubwf.JobNeeds;
import githubwf.NormalJob;
import githubwf.NormalJobConcurrencyAbstract;
import githubwf.NormalJobContainerAbstract;
import githubwf.NormalJobContinue_45on_45errorAbstract;
import githubwf.NormalJobEnvironmentAbstract;
import githubwf.NormalJobIfAbstract;
import githubwf.NormalJobOutputs;
import githubwf.NormalJobPropertiesAbstract;
import githubwf.NormalJobRuns_45onAbstract;
import githubwf.NormalJobServices;
import githubwf.NormalJobSteps;
import githubwf.NormalJobStrategy;
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
 * An implementation of the model object '<em><b>Normal Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobImpl#getNormalJob <em>Normal Job</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getName <em>Name</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getNeeds <em>Needs</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getRuns_45on <em>Runs 45on</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getOutputs <em>Outputs</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getIf_ <em>If </em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getSteps <em>Steps</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getTimeout_45minutes <em>Timeout 45minutes</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getServices <em>Services</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobImpl#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobImpl extends MinimalEObjectImpl.Container implements NormalJob {
	/**
	 * The cached value of the '{@link #getNormalJob() <em>Normal Job</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNormalJob()
	 * @generated
	 * @ordered
	 */
	protected EList<NormalJobPropertiesAbstract> normalJob;

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
	 * The default value of the '{@link #getTimeout_45minutes() <em>Timeout 45minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout_45minutes()
	 * @generated
	 * @ordered
	 */
	protected static final Double TIMEOUT_45MINUTES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJob();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NormalJobPropertiesAbstract> getNormalJob() {
		if (normalJob == null) {
			normalJob = new EObjectContainmentEList<NormalJobPropertiesAbstract>(NormalJobPropertiesAbstract.class, this, GithubwfPackage.NORMAL_JOB__NORMAL_JOB);
		}
		return normalJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobName.class::isInstance).findAny().map(githubwf.NormalJobName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeeds getNeeds() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobNeeds.class::isInstance).findAny().map(githubwf.NormalJobNeeds.class::cast).map(instance->instance.getNeeds()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions getPermissions() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobPermissions.class::isInstance).findAny().map(githubwf.NormalJobPermissions.class::cast).map(instance->instance.getPermissions()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onAbstract getRuns_45on() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobRuns_45on.class::isInstance).findAny().map(githubwf.NormalJobRuns_45on.class::cast).map(instance->instance.getRuns_45on()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobEnvironmentAbstract getEnvironment() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobEnvironment.class::isInstance).findAny().map(githubwf.NormalJobEnvironment.class::cast).map(instance->instance.getEnvironment()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobOutputs getOutputs() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobOutputs.class::isInstance).findAny().map(githubwf.NormalJobOutputs.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Env getEnv() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobEnv.class::isInstance).findAny().map(githubwf.NormalJobEnv.class::cast).map(instance->instance.getEnv()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Defaults getDefaults() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobDefaults.class::isInstance).findAny().map(githubwf.NormalJobDefaults.class::cast).map(instance->instance.getDefaults()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobIfAbstract getIf_() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobIf.class::isInstance).findAny().map(githubwf.NormalJobIf.class::cast).map(instance->instance.getIf_()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobSteps getSteps() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobSteps.class::isInstance).findAny().map(githubwf.NormalJobSteps.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getTimeout_45minutes() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobTimeout_45minutes.class::isInstance).findAny().map(githubwf.NormalJobTimeout_45minutes.class::cast).map(instance->instance.getTimeout_45minutes()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategy getStrategy() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobStrategy.class::isInstance).findAny().map(githubwf.NormalJobStrategy.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContinue_45on_45errorAbstract getContinue_45on_45error() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobContinue_45on_45error.class::isInstance).findAny().map(githubwf.NormalJobContinue_45on_45error.class::cast).map(instance->instance.getContinue_45on_45error()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContainerAbstract getContainer() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobContainer.class::isInstance).findAny().map(githubwf.NormalJobContainer.class::cast).map(instance->instance.getContainer()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobServices getServices() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobServices.class::isInstance).findAny().map(githubwf.NormalJobServices.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobConcurrencyAbstract getConcurrency() {
		return this.getNormalJob().stream().filter(githubwf.NormalJobConcurrency.class::isInstance).findAny().map(githubwf.NormalJobConcurrency.class::cast).map(instance->instance.getConcurrency()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("name".equals(key) ){return this.getName();}
		
		if ("needs".equals(key) ){return this.getNeeds();}
		
		if ("permissions".equals(key) ){return this.getPermissions();}
		
		if ("runs_45on".equals(key) ){return this.getRuns_45on();}
		
		if ("environment".equals(key) ){return this.getEnvironment();}
		
		if ("outputs".equals(key) ){return this.getOutputs();}
		
		if ("env".equals(key) ){return this.getEnv();}
		
		if ("defaults".equals(key) ){return this.getDefaults();}
		
		if ("if_".equals(key) ){return this.getIf_();}
		
		if ("steps".equals(key) ){return this.getSteps();}
		
		if ("timeout_45minutes".equals(key) ){return this.getTimeout_45minutes();}
		
		if ("strategy".equals(key) ){return this.getStrategy();}
		
		if ("continue_45on_45error".equals(key) ){return this.getContinue_45on_45error();}
		
		if ("container".equals(key) ){return this.getContainer();}
		
		if ("services".equals(key) ){return this.getServices();}
		
		if ("concurrency".equals(key) ){return this.getConcurrency();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (NormalJobPropertiesAbstract child : this.getNormalJob()){
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
			case GithubwfPackage.NORMAL_JOB__NORMAL_JOB:
				return ((InternalEList<?>)getNormalJob()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.NORMAL_JOB__NORMAL_JOB:
				return getNormalJob();
			case GithubwfPackage.NORMAL_JOB__NAME:
				return getName();
			case GithubwfPackage.NORMAL_JOB__NEEDS:
				return getNeeds();
			case GithubwfPackage.NORMAL_JOB__PERMISSIONS:
				return getPermissions();
			case GithubwfPackage.NORMAL_JOB__RUNS_45ON:
				return getRuns_45on();
			case GithubwfPackage.NORMAL_JOB__ENVIRONMENT:
				return getEnvironment();
			case GithubwfPackage.NORMAL_JOB__OUTPUTS:
				return getOutputs();
			case GithubwfPackage.NORMAL_JOB__ENV:
				return getEnv();
			case GithubwfPackage.NORMAL_JOB__DEFAULTS:
				return getDefaults();
			case GithubwfPackage.NORMAL_JOB__IF_:
				return getIf_();
			case GithubwfPackage.NORMAL_JOB__STEPS:
				return getSteps();
			case GithubwfPackage.NORMAL_JOB__TIMEOUT_45MINUTES:
				return getTimeout_45minutes();
			case GithubwfPackage.NORMAL_JOB__STRATEGY:
				return getStrategy();
			case GithubwfPackage.NORMAL_JOB__CONTINUE_45ON_45ERROR:
				return getContinue_45on_45error();
			case GithubwfPackage.NORMAL_JOB__CONTAINER:
				return getContainer();
			case GithubwfPackage.NORMAL_JOB__SERVICES:
				return getServices();
			case GithubwfPackage.NORMAL_JOB__CONCURRENCY:
				return getConcurrency();
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
			case GithubwfPackage.NORMAL_JOB__NORMAL_JOB:
				getNormalJob().clear();
				getNormalJob().addAll((Collection<? extends NormalJobPropertiesAbstract>)newValue);
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
			case GithubwfPackage.NORMAL_JOB__NORMAL_JOB:
				getNormalJob().clear();
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
			case GithubwfPackage.NORMAL_JOB__NORMAL_JOB:
				return normalJob != null && !normalJob.isEmpty();
			case GithubwfPackage.NORMAL_JOB__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GithubwfPackage.NORMAL_JOB__NEEDS:
				return getNeeds() != null;
			case GithubwfPackage.NORMAL_JOB__PERMISSIONS:
				return getPermissions() != null;
			case GithubwfPackage.NORMAL_JOB__RUNS_45ON:
				return getRuns_45on() != null;
			case GithubwfPackage.NORMAL_JOB__ENVIRONMENT:
				return getEnvironment() != null;
			case GithubwfPackage.NORMAL_JOB__OUTPUTS:
				return getOutputs() != null;
			case GithubwfPackage.NORMAL_JOB__ENV:
				return getEnv() != null;
			case GithubwfPackage.NORMAL_JOB__DEFAULTS:
				return getDefaults() != null;
			case GithubwfPackage.NORMAL_JOB__IF_:
				return getIf_() != null;
			case GithubwfPackage.NORMAL_JOB__STEPS:
				return getSteps() != null;
			case GithubwfPackage.NORMAL_JOB__TIMEOUT_45MINUTES:
				return TIMEOUT_45MINUTES_EDEFAULT == null ? getTimeout_45minutes() != null : !TIMEOUT_45MINUTES_EDEFAULT.equals(getTimeout_45minutes());
			case GithubwfPackage.NORMAL_JOB__STRATEGY:
				return getStrategy() != null;
			case GithubwfPackage.NORMAL_JOB__CONTINUE_45ON_45ERROR:
				return getContinue_45on_45error() != null;
			case GithubwfPackage.NORMAL_JOB__CONTAINER:
				return getContainer() != null;
			case GithubwfPackage.NORMAL_JOB__SERVICES:
				return getServices() != null;
			case GithubwfPackage.NORMAL_JOB__CONCURRENCY:
				return getConcurrency() != null;
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
			case GithubwfPackage.NORMAL_JOB___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NormalJobImpl
