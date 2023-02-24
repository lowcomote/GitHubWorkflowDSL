/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.JobNeedsOneOf0;
import githubwf.JobNeedsOneOf0Items;

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
 * An implementation of the model object '<em><b>Job Needs One Of0</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.JobNeedsOneOf0Impl#getJobNeeds <em>Job Needs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobNeedsOneOf0Impl extends MinimalEObjectImpl.Container implements JobNeedsOneOf0 {
	/**
	 * The cached value of the '{@link #getJobNeeds() <em>Job Needs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNeeds()
	 * @generated
	 * @ordered
	 */
	protected EList<JobNeedsOneOf0Items> jobNeeds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobNeedsOneOf0Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getJobNeedsOneOf0();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<JobNeedsOneOf0Items> getJobNeeds() {
		if (jobNeeds == null) {
			jobNeeds = new EObjectContainmentEList<JobNeedsOneOf0Items>(JobNeedsOneOf0Items.class, this, GithubwfPackage.JOB_NEEDS_ONE_OF0__JOB_NEEDS);
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
			case GithubwfPackage.JOB_NEEDS_ONE_OF0__JOB_NEEDS:
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
			case GithubwfPackage.JOB_NEEDS_ONE_OF0__JOB_NEEDS:
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
			case GithubwfPackage.JOB_NEEDS_ONE_OF0__JOB_NEEDS:
				getJobNeeds().clear();
				getJobNeeds().addAll((Collection<? extends JobNeedsOneOf0Items>)newValue);
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
			case GithubwfPackage.JOB_NEEDS_ONE_OF0__JOB_NEEDS:
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
			case GithubwfPackage.JOB_NEEDS_ONE_OF0__JOB_NEEDS:
				return jobNeeds != null && !jobNeeds.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //JobNeedsOneOf0Impl
