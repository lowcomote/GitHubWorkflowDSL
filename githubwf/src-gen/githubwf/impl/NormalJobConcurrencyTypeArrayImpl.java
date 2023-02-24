/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobConcurrencyItems;
import githubwf.NormalJobConcurrencyTypeArray;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Concurrency Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobConcurrencyTypeArrayImpl#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobConcurrencyTypeArrayImpl extends NormalJobConcurrencyAbstractImpl implements NormalJobConcurrencyTypeArray {
	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected EList<NormalJobConcurrencyItems> concurrency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobConcurrencyTypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobConcurrencyTypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NormalJobConcurrencyItems> getConcurrency() {
		if (concurrency == null) {
			concurrency = new EObjectContainmentEList<NormalJobConcurrencyItems>(NormalJobConcurrencyItems.class, this, GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_ARRAY__CONCURRENCY);
		}
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_ARRAY__CONCURRENCY:
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
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_ARRAY__CONCURRENCY:
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
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_ARRAY__CONCURRENCY:
				getConcurrency().clear();
				getConcurrency().addAll((Collection<? extends NormalJobConcurrencyItems>)newValue);
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
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_ARRAY__CONCURRENCY:
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
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_ARRAY__CONCURRENCY:
				return concurrency != null && !concurrency.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NormalJobConcurrencyTypeArrayImpl
