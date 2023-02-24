/**
 */
package githubwf.impl;

import githubwf.DefaultsRun;
import githubwf.DefaultsRunPropertiesAbstract;
import githubwf.GithubwfPackage;
import githubwf.Shell;
import githubwf.Working_45directory;

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
 * An implementation of the model object '<em><b>Defaults Run</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.DefaultsRunImpl#getRun <em>Run</em>}</li>
 *   <li>{@link githubwf.impl.DefaultsRunImpl#getShell <em>Shell</em>}</li>
 *   <li>{@link githubwf.impl.DefaultsRunImpl#getWorking_45directory <em>Working 45directory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DefaultsRunImpl extends DefaultsPropertiesAbstractImpl implements DefaultsRun {
	/**
	 * The cached value of the '{@link #getRun() <em>Run</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun()
	 * @generated
	 * @ordered
	 */
	protected EList<DefaultsRunPropertiesAbstract> run;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefaultsRunImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getDefaultsRun();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<DefaultsRunPropertiesAbstract> getRun() {
		if (run == null) {
			run = new EObjectContainmentEList<DefaultsRunPropertiesAbstract>(DefaultsRunPropertiesAbstract.class, this, GithubwfPackage.DEFAULTS_RUN__RUN);
		}
		return run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shell getShell() {
		return this.getRun().stream().filter(githubwf.DefaultsRunShell.class::isInstance).findAny().map(githubwf.DefaultsRunShell.class::cast).map(instance->instance.getShell()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Working_45directory getWorking_45directory() {
		return this.getRun().stream().filter(githubwf.DefaultsRunWorking_45directory.class::isInstance).findAny().map(githubwf.DefaultsRunWorking_45directory.class::cast).map(instance->instance.getWorking_45directory()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("shell".equals(key) ){return this.getShell();}
		
		if ("working_45directory".equals(key) ){return this.getWorking_45directory();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (DefaultsRunPropertiesAbstract child : this.getRun()){
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
			case GithubwfPackage.DEFAULTS_RUN__RUN:
				return ((InternalEList<?>)getRun()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.DEFAULTS_RUN__RUN:
				return getRun();
			case GithubwfPackage.DEFAULTS_RUN__SHELL:
				return getShell();
			case GithubwfPackage.DEFAULTS_RUN__WORKING_45DIRECTORY:
				return getWorking_45directory();
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
			case GithubwfPackage.DEFAULTS_RUN__RUN:
				getRun().clear();
				getRun().addAll((Collection<? extends DefaultsRunPropertiesAbstract>)newValue);
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
			case GithubwfPackage.DEFAULTS_RUN__RUN:
				getRun().clear();
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
			case GithubwfPackage.DEFAULTS_RUN__RUN:
				return run != null && !run.isEmpty();
			case GithubwfPackage.DEFAULTS_RUN__SHELL:
				return getShell() != null;
			case GithubwfPackage.DEFAULTS_RUN__WORKING_45DIRECTORY:
				return getWorking_45directory() != null;
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
			case GithubwfPackage.DEFAULTS_RUN___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //DefaultsRunImpl
