/**
 */
package githubwf.impl;

import githubwf.Env;
import githubwf.GithubwfPackage;
import githubwf.JobNeeds;
import githubwf.Permissions_45event;
import githubwf.ReusableWorkflowCallJob;
import githubwf.ReusableWorkflowCallJobConcurrencyAbstract;
import githubwf.ReusableWorkflowCallJobIfAbstract;
import githubwf.ReusableWorkflowCallJobPropertiesAbstract;
import githubwf.ReusableWorkflowCallJobSecretsAbstract;
import githubwf.ReusableWorkflowCallJobStrategy;

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
 * An implementation of the model object '<em><b>Reusable Workflow Call Job</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobImpl#getReusableWorkflowCallJob <em>Reusable Workflow Call Job</em>}</li>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobImpl#getName <em>Name</em>}</li>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobImpl#getNeeds <em>Needs</em>}</li>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobImpl#getPermissions <em>Permissions</em>}</li>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobImpl#getIf_ <em>If </em>}</li>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobImpl#getUses <em>Uses</em>}</li>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobImpl#getWith <em>With</em>}</li>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobImpl#getSecrets <em>Secrets</em>}</li>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobImpl#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReusableWorkflowCallJobImpl extends MinimalEObjectImpl.Container implements ReusableWorkflowCallJob {
	/**
	 * The cached value of the '{@link #getReusableWorkflowCallJob() <em>Reusable Workflow Call Job</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReusableWorkflowCallJob()
	 * @generated
	 * @ordered
	 */
	protected EList<ReusableWorkflowCallJobPropertiesAbstract> reusableWorkflowCallJob;

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
	 * The default value of the '{@link #getUses() <em>Uses</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUses()
	 * @generated
	 * @ordered
	 */
	protected static final String USES_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReusableWorkflowCallJobImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReusableWorkflowCallJobPropertiesAbstract> getReusableWorkflowCallJob() {
		if (reusableWorkflowCallJob == null) {
			reusableWorkflowCallJob = new EObjectContainmentEList<ReusableWorkflowCallJobPropertiesAbstract>(ReusableWorkflowCallJobPropertiesAbstract.class, this, GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__REUSABLE_WORKFLOW_CALL_JOB);
		}
		return reusableWorkflowCallJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return this.getReusableWorkflowCallJob().stream().filter(githubwf.ReusableWorkflowCallJobName.class::isInstance).findAny().map(githubwf.ReusableWorkflowCallJobName.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeeds getNeeds() {
		return this.getReusableWorkflowCallJob().stream().filter(githubwf.ReusableWorkflowCallJobNeeds.class::isInstance).findAny().map(githubwf.ReusableWorkflowCallJobNeeds.class::cast).map(instance->instance.getNeeds()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45event getPermissions() {
		return this.getReusableWorkflowCallJob().stream().filter(githubwf.ReusableWorkflowCallJobPermissions.class::isInstance).findAny().map(githubwf.ReusableWorkflowCallJobPermissions.class::cast).map(instance->instance.getPermissions()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobIfAbstract getIf_() {
		return this.getReusableWorkflowCallJob().stream().filter(githubwf.ReusableWorkflowCallJobIf.class::isInstance).findAny().map(githubwf.ReusableWorkflowCallJobIf.class::cast).map(instance->instance.getIf_()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUses() {
		return this.getReusableWorkflowCallJob().stream().filter(githubwf.ReusableWorkflowCallJobUses.class::isInstance).findAny().map(githubwf.ReusableWorkflowCallJobUses.class::cast).map(instance->instance.getUses()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Env getWith() {
		return this.getReusableWorkflowCallJob().stream().filter(githubwf.ReusableWorkflowCallJobWith.class::isInstance).findAny().map(githubwf.ReusableWorkflowCallJobWith.class::cast).map(instance->instance.getWith()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobSecretsAbstract getSecrets() {
		return this.getReusableWorkflowCallJob().stream().filter(githubwf.ReusableWorkflowCallJobSecrets.class::isInstance).findAny().map(githubwf.ReusableWorkflowCallJobSecrets.class::cast).map(instance->instance.getSecrets()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategy getStrategy() {
		return this.getReusableWorkflowCallJob().stream().filter(githubwf.ReusableWorkflowCallJobStrategy.class::isInstance).findAny().map(githubwf.ReusableWorkflowCallJobStrategy.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobConcurrencyAbstract getConcurrency() {
		return this.getReusableWorkflowCallJob().stream().filter(githubwf.ReusableWorkflowCallJobConcurrency.class::isInstance).findAny().map(githubwf.ReusableWorkflowCallJobConcurrency.class::cast).map(instance->instance.getConcurrency()).orElse(null);
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
		
		if ("if_".equals(key) ){return this.getIf_();}
		
		if ("uses".equals(key) ){return this.getUses();}
		
		if ("with".equals(key) ){return this.getWith();}
		
		if ("secrets".equals(key) ){return this.getSecrets();}
		
		if ("strategy".equals(key) ){return this.getStrategy();}
		
		if ("concurrency".equals(key) ){return this.getConcurrency();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (ReusableWorkflowCallJobPropertiesAbstract child : this.getReusableWorkflowCallJob()){
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__REUSABLE_WORKFLOW_CALL_JOB:
				return ((InternalEList<?>)getReusableWorkflowCallJob()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__REUSABLE_WORKFLOW_CALL_JOB:
				return getReusableWorkflowCallJob();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__NAME:
				return getName();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__NEEDS:
				return getNeeds();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__PERMISSIONS:
				return getPermissions();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__IF_:
				return getIf_();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__USES:
				return getUses();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__WITH:
				return getWith();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__SECRETS:
				return getSecrets();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__STRATEGY:
				return getStrategy();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__CONCURRENCY:
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__REUSABLE_WORKFLOW_CALL_JOB:
				getReusableWorkflowCallJob().clear();
				getReusableWorkflowCallJob().addAll((Collection<? extends ReusableWorkflowCallJobPropertiesAbstract>)newValue);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__REUSABLE_WORKFLOW_CALL_JOB:
				getReusableWorkflowCallJob().clear();
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__REUSABLE_WORKFLOW_CALL_JOB:
				return reusableWorkflowCallJob != null && !reusableWorkflowCallJob.isEmpty();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__NEEDS:
				return getNeeds() != null;
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__PERMISSIONS:
				return getPermissions() != null;
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__IF_:
				return getIf_() != null;
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__USES:
				return USES_EDEFAULT == null ? getUses() != null : !USES_EDEFAULT.equals(getUses());
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__WITH:
				return getWith() != null;
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__SECRETS:
				return getSecrets() != null;
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__STRATEGY:
				return getStrategy() != null;
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__CONCURRENCY:
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ReusableWorkflowCallJobImpl
