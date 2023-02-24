/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.JobNeedsItems;
import githubwf.JobNeedsTypeArray;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Needs Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.JobNeedsTypeArrayImpl#getJobNeeds <em>Job Needs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobNeedsTypeArrayImpl extends JobNeedsAbstractImpl implements JobNeedsTypeArray {
	/**
	 * The cached value of the '{@link #getJobNeeds() <em>Job Needs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNeeds()
	 * @generated
	 * @ordered
	 */
	protected EList<JobNeedsItems> jobNeeds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobNeedsTypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getJobNeedsTypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JobNeedsItems> getJobNeeds() {
		if (jobNeeds == null) {
			jobNeeds = new EObjectContainmentEList<JobNeedsItems>(JobNeedsItems.class, this, GithubwfPackage.JOB_NEEDS_TYPE_ARRAY__JOB_NEEDS);
		}
		return jobNeeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.JOB_NEEDS_TYPE_ARRAY__JOB_NEEDS:
				return ((InternalEList<?>)getJobNeeds()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.JOB_NEEDS_TYPE_ARRAY__JOB_NEEDS:
				return getJobNeeds();
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
			case GithubwfPackage.JOB_NEEDS_TYPE_ARRAY__JOB_NEEDS:
				getJobNeeds().clear();
				getJobNeeds().addAll((Collection<? extends JobNeedsItems>)newValue);
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
			case GithubwfPackage.JOB_NEEDS_TYPE_ARRAY__JOB_NEEDS:
				getJobNeeds().clear();
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
			case GithubwfPackage.JOB_NEEDS_TYPE_ARRAY__JOB_NEEDS:
				return jobNeeds != null && !jobNeeds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JobNeedsTypeArrayImpl
