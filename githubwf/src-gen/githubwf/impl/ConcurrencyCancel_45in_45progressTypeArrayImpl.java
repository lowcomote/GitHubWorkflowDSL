/**
 */
package githubwf.impl;

import githubwf.ConcurrencyCancel_45in_45progressItems;
import githubwf.ConcurrencyCancel_45in_45progressTypeArray;
import githubwf.GithubwfPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concurrency Cancel 45in 45progress Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ConcurrencyCancel_45in_45progressTypeArrayImpl#getCancel_45in_45progress <em>Cancel 45in 45progress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcurrencyCancel_45in_45progressTypeArrayImpl extends ConcurrencyCancel_45in_45progressAbstractImpl implements ConcurrencyCancel_45in_45progressTypeArray {
	/**
	 * The cached value of the '{@link #getCancel_45in_45progress() <em>Cancel 45in 45progress</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancel_45in_45progress()
	 * @generated
	 * @ordered
	 */
	protected EList<ConcurrencyCancel_45in_45progressItems> cancel_45in_45progress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyCancel_45in_45progressTypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getConcurrencyCancel_45in_45progressTypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ConcurrencyCancel_45in_45progressItems> getCancel_45in_45progress() {
		if (cancel_45in_45progress == null) {
			cancel_45in_45progress = new EObjectContainmentEList<ConcurrencyCancel_45in_45progressItems>(ConcurrencyCancel_45in_45progressItems.class, this, GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_ARRAY__CANCEL_45IN_45PROGRESS);
		}
		return cancel_45in_45progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_ARRAY__CANCEL_45IN_45PROGRESS:
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_ARRAY__CANCEL_45IN_45PROGRESS:
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_ARRAY__CANCEL_45IN_45PROGRESS:
				getCancel_45in_45progress().clear();
				getCancel_45in_45progress().addAll((Collection<? extends ConcurrencyCancel_45in_45progressItems>)newValue);
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_ARRAY__CANCEL_45IN_45PROGRESS:
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_ARRAY__CANCEL_45IN_45PROGRESS:
				return cancel_45in_45progress != null && !cancel_45in_45progress.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConcurrencyCancel_45in_45progressTypeArrayImpl
