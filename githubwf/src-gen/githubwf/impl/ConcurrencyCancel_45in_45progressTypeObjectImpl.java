/**
 */
package githubwf.impl;

import githubwf.ConcurrencyCancel_45in_45progressPropertiesAbstract;
import githubwf.ConcurrencyCancel_45in_45progressTypeObject;
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
 * An implementation of the model object '<em><b>Concurrency Cancel 45in 45progress Type Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ConcurrencyCancel_45in_45progressTypeObjectImpl#getCancel_45in_45progress <em>Cancel 45in 45progress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcurrencyCancel_45in_45progressTypeObjectImpl extends ConcurrencyCancel_45in_45progressAbstractImpl implements ConcurrencyCancel_45in_45progressTypeObject {
	/**
	 * The cached value of the '{@link #getCancel_45in_45progress() <em>Cancel 45in 45progress</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancel_45in_45progress()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcurrencyCancel_45in_45progressPropertiesAbstract> cancel_45in_45progress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyCancel_45in_45progressTypeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getConcurrencyCancel_45in_45progressTypeObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConcurrencyCancel_45in_45progressPropertiesAbstract> getCancel_45in_45progress() {
		if (cancel_45in_45progress == null) {
			cancel_45in_45progress = new EObjectContainmentEList<ConcurrencyCancel_45in_45progressPropertiesAbstract>(ConcurrencyCancel_45in_45progressPropertiesAbstract.class, this, GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_OBJECT__CANCEL_45IN_45PROGRESS);
		}
		return cancel_45in_45progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		additionalOrPatternPropertyClasses.add(githubwf.ConcurrencyCancel_45in_45progressAdditionalProperties.class); 
		
		for (ConcurrencyCancel_45in_45progressPropertiesAbstract child : this.getCancel_45in_45progress()){
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_OBJECT__CANCEL_45IN_45PROGRESS:
				return ((InternalEList<?>)getCancel_45in_45progress()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_OBJECT__CANCEL_45IN_45PROGRESS:
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_OBJECT__CANCEL_45IN_45PROGRESS:
				getCancel_45in_45progress().clear();
				getCancel_45in_45progress().addAll((Collection<? extends ConcurrencyCancel_45in_45progressPropertiesAbstract>)newValue);
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_OBJECT__CANCEL_45IN_45PROGRESS:
				getCancel_45in_45progress().clear();
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_OBJECT__CANCEL_45IN_45PROGRESS:
				return cancel_45in_45progress != null && !cancel_45in_45progress.isEmpty();
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_OBJECT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ConcurrencyCancel_45in_45progressTypeObjectImpl
