/**
 */
package githubwf.impl;

import githubwf.Concurrency;
import githubwf.ConcurrencyCancel_45in_45progressAbstract;
import githubwf.ConcurrencyPropertiesAbstract;
import githubwf.GithubwfPackage;

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
 * An implementation of the model object '<em><b>Concurrency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ConcurrencyImpl#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link githubwf.impl.ConcurrencyImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link githubwf.impl.ConcurrencyImpl#getCancel_45in_45progress <em>Cancel 45in 45progress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcurrencyImpl extends MinimalEObjectImpl.Container implements Concurrency {
	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcurrencyPropertiesAbstract> concurrency;

	/**
	 * The default value of the '{@link #getGroup() <em>Group</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected static final String GROUP_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getConcurrency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConcurrencyPropertiesAbstract> getConcurrency() {
		if (concurrency == null) {
			concurrency = new EObjectContainmentEList<ConcurrencyPropertiesAbstract>(ConcurrencyPropertiesAbstract.class, this, GithubwfPackage.CONCURRENCY__CONCURRENCY);
		}
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getGroup() {
		return this.getConcurrency().stream().filter(githubwf.ConcurrencyGroup.class::isInstance).findAny().map(githubwf.ConcurrencyGroup.class::cast).map(instance->instance.getGroup()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyCancel_45in_45progressAbstract getCancel_45in_45progress() {
		return this.getConcurrency().stream().filter(githubwf.ConcurrencyCancel_45in_45progress.class::isInstance).findAny().map(githubwf.ConcurrencyCancel_45in_45progress.class::cast).map(instance->instance.getCancel_45in_45progress()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("group".equals(key) ){return this.getGroup();}
		
		if ("cancel_45in_45progress".equals(key) ){return this.getCancel_45in_45progress();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (ConcurrencyPropertiesAbstract child : this.getConcurrency()){
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
			case GithubwfPackage.CONCURRENCY__CONCURRENCY:
				return ((InternalEList<?>)getConcurrency()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.CONCURRENCY__CONCURRENCY:
				return getConcurrency();
			case GithubwfPackage.CONCURRENCY__GROUP:
				return getGroup();
			case GithubwfPackage.CONCURRENCY__CANCEL_45IN_45PROGRESS:
				return getCancel_45in_45progress();
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
			case GithubwfPackage.CONCURRENCY__CONCURRENCY:
				getConcurrency().clear();
				getConcurrency().addAll((Collection<? extends ConcurrencyPropertiesAbstract>)newValue);
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
			case GithubwfPackage.CONCURRENCY__CONCURRENCY:
				getConcurrency().clear();
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
			case GithubwfPackage.CONCURRENCY__CONCURRENCY:
				return concurrency != null && !concurrency.isEmpty();
			case GithubwfPackage.CONCURRENCY__GROUP:
				return GROUP_EDEFAULT == null ? getGroup() != null : !GROUP_EDEFAULT.equals(getGroup());
			case GithubwfPackage.CONCURRENCY__CANCEL_45IN_45PROGRESS:
				return getCancel_45in_45progress() != null;
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
			case GithubwfPackage.CONCURRENCY___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcurrencyImpl
