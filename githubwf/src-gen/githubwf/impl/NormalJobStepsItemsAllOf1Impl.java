/**
 */
package githubwf.impl;

import githubwf.Env;
import githubwf.GithubwfPackage;
import githubwf.NormalJobStepsItemsAllOf1;
import githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorAbstract;
import githubwf.NormalJobStepsItemsAllOf1IfAbstract;
import githubwf.NormalJobStepsItemsAllOf1PropertiesAbstract;
import githubwf.Shell;
import githubwf.Working_45directory;

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
 * An implementation of the model object '<em><b>Normal Job Steps Items All Of1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Impl#getItems <em>Items</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Impl#getId <em>Id</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Impl#getIf_ <em>If </em>}</li>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Impl#getName <em>Name</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Impl#getUses <em>Uses</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Impl#getRun <em>Run</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Impl#getWorking_45directory <em>Working 45directory</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Impl#getShell <em>Shell</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Impl#getWith <em>With</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Impl#getEnv <em>Env</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Impl#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Impl#getTimeout_45minutes <em>Timeout 45minutes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobStepsItemsAllOf1Impl extends MinimalEObjectImpl.Container implements NormalJobStepsItemsAllOf1 {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<NormalJobStepsItemsAllOf1PropertiesAbstract> items;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

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
	 * The default value of the '{@link #getRun() <em>Run</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun()
	 * @generated
	 * @ordered
	 */
	protected static final String RUN_EDEFAULT = null;

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
	protected NormalJobStepsItemsAllOf1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NormalJobStepsItemsAllOf1PropertiesAbstract> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<NormalJobStepsItemsAllOf1PropertiesAbstract>(NormalJobStepsItemsAllOf1PropertiesAbstract.class, this, GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getId() {
		return this.getItems().stream().filter(githubwf.NormalJobStepsItemsAllOf1Id.class::isInstance).findAny().map(githubwf.NormalJobStepsItemsAllOf1Id.class::cast).map(instance->instance.getId()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1IfAbstract getIf_() {
		return this.getItems().stream().filter(githubwf.NormalJobStepsItemsAllOf1If.class::isInstance).findAny().map(githubwf.NormalJobStepsItemsAllOf1If.class::cast).map(instance->instance.getIf_()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return this.getItems().stream().filter(githubwf.NormalJobStepsItemsAllOf1Name.class::isInstance).findAny().map(githubwf.NormalJobStepsItemsAllOf1Name.class::cast).map(instance->instance.getName()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUses() {
		return this.getItems().stream().filter(githubwf.NormalJobStepsItemsAllOf1Uses.class::isInstance).findAny().map(githubwf.NormalJobStepsItemsAllOf1Uses.class::cast).map(instance->instance.getUses()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRun() {
		return this.getItems().stream().filter(githubwf.NormalJobStepsItemsAllOf1Run.class::isInstance).findAny().map(githubwf.NormalJobStepsItemsAllOf1Run.class::cast).map(instance->instance.getRun()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Working_45directory getWorking_45directory() {
		return this.getItems().stream().filter(githubwf.NormalJobStepsItemsAllOf1Working_45directory.class::isInstance).findAny().map(githubwf.NormalJobStepsItemsAllOf1Working_45directory.class::cast).map(instance->instance.getWorking_45directory()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shell getShell() {
		return this.getItems().stream().filter(githubwf.NormalJobStepsItemsAllOf1Shell.class::isInstance).findAny().map(githubwf.NormalJobStepsItemsAllOf1Shell.class::cast).map(instance->instance.getShell()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Env getWith() {
		return this.getItems().stream().filter(githubwf.NormalJobStepsItemsAllOf1With.class::isInstance).findAny().map(githubwf.NormalJobStepsItemsAllOf1With.class::cast).map(instance->instance.getWith()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Env getEnv() {
		return this.getItems().stream().filter(githubwf.NormalJobStepsItemsAllOf1Env.class::isInstance).findAny().map(githubwf.NormalJobStepsItemsAllOf1Env.class::cast).map(instance->instance.getEnv()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Continue_45on_45errorAbstract getContinue_45on_45error() {
		return this.getItems().stream().filter(githubwf.NormalJobStepsItemsAllOf1Continue_45on_45error.class::isInstance).findAny().map(githubwf.NormalJobStepsItemsAllOf1Continue_45on_45error.class::cast).map(instance->instance.getContinue_45on_45error()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getTimeout_45minutes() {
		return this.getItems().stream().filter(githubwf.NormalJobStepsItemsAllOf1Timeout_45minutes.class::isInstance).findAny().map(githubwf.NormalJobStepsItemsAllOf1Timeout_45minutes.class::cast).map(instance->instance.getTimeout_45minutes()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("id".equals(key) ){return this.getId();}
		
		if ("if_".equals(key) ){return this.getIf_();}
		
		if ("name".equals(key) ){return this.getName();}
		
		if ("uses".equals(key) ){return this.getUses();}
		
		if ("run".equals(key) ){return this.getRun();}
		
		if ("working_45directory".equals(key) ){return this.getWorking_45directory();}
		
		if ("shell".equals(key) ){return this.getShell();}
		
		if ("with".equals(key) ){return this.getWith();}
		
		if ("env".equals(key) ){return this.getEnv();}
		
		if ("continue_45on_45error".equals(key) ){return this.getContinue_45on_45error();}
		
		if ("timeout_45minutes".equals(key) ){return this.getTimeout_45minutes();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (NormalJobStepsItemsAllOf1PropertiesAbstract child : this.getItems()){
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__ITEMS:
				return getItems();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__ID:
				return getId();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__IF_:
				return getIf_();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__NAME:
				return getName();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__USES:
				return getUses();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__RUN:
				return getRun();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__WORKING_45DIRECTORY:
				return getWorking_45directory();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__SHELL:
				return getShell();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__WITH:
				return getWith();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__ENV:
				return getEnv();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__CONTINUE_45ON_45ERROR:
				return getContinue_45on_45error();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__TIMEOUT_45MINUTES:
				return getTimeout_45minutes();
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends NormalJobStepsItemsAllOf1PropertiesAbstract>)newValue);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__ITEMS:
				getItems().clear();
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__ITEMS:
				return items != null && !items.isEmpty();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__ID:
				return ID_EDEFAULT == null ? getId() != null : !ID_EDEFAULT.equals(getId());
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__IF_:
				return getIf_() != null;
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__NAME:
				return NAME_EDEFAULT == null ? getName() != null : !NAME_EDEFAULT.equals(getName());
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__USES:
				return USES_EDEFAULT == null ? getUses() != null : !USES_EDEFAULT.equals(getUses());
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__RUN:
				return RUN_EDEFAULT == null ? getRun() != null : !RUN_EDEFAULT.equals(getRun());
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__WORKING_45DIRECTORY:
				return getWorking_45directory() != null;
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__SHELL:
				return getShell() != null;
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__WITH:
				return getWith() != null;
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__ENV:
				return getEnv() != null;
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__CONTINUE_45ON_45ERROR:
				return getContinue_45on_45error() != null;
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__TIMEOUT_45MINUTES:
				return TIMEOUT_45MINUTES_EDEFAULT == null ? getTimeout_45minutes() != null : !TIMEOUT_45MINUTES_EDEFAULT.equals(getTimeout_45minutes());
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NormalJobStepsItemsAllOf1Impl
