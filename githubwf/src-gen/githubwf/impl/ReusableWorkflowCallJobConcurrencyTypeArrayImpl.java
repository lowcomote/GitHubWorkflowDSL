/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.ReusableWorkflowCallJobConcurrencyItems;
import githubwf.ReusableWorkflowCallJobConcurrencyTypeArray;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reusable Workflow Call Job Concurrency Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobConcurrencyTypeArrayImpl#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReusableWorkflowCallJobConcurrencyTypeArrayImpl extends ReusableWorkflowCallJobConcurrencyAbstractImpl implements ReusableWorkflowCallJobConcurrencyTypeArray {
	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected EList<ReusableWorkflowCallJobConcurrencyItems> concurrency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReusableWorkflowCallJobConcurrencyTypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getReusableWorkflowCallJobConcurrencyTypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ReusableWorkflowCallJobConcurrencyItems> getConcurrency() {
		if (concurrency == null) {
			concurrency = new EObjectContainmentEList<ReusableWorkflowCallJobConcurrencyItems>(ReusableWorkflowCallJobConcurrencyItems.class, this, GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_TYPE_ARRAY__CONCURRENCY);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_TYPE_ARRAY__CONCURRENCY:
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_TYPE_ARRAY__CONCURRENCY:
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_TYPE_ARRAY__CONCURRENCY:
				getConcurrency().clear();
				getConcurrency().addAll((Collection<? extends ReusableWorkflowCallJobConcurrencyItems>)newValue);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_TYPE_ARRAY__CONCURRENCY:
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_TYPE_ARRAY__CONCURRENCY:
				return concurrency != null && !concurrency.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ReusableWorkflowCallJobConcurrencyTypeArrayImpl
