/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.JobNeedsOneOf1;
import githubwf.Name;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Needs One Of1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.JobNeedsOneOf1Impl#getJobNeeds <em>Job Needs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobNeedsOneOf1Impl extends MinimalEObjectImpl.Container implements JobNeedsOneOf1 {
	/**
	 * The cached value of the '{@link #getJobNeeds() <em>Job Needs</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNeeds()
	 * @generated
	 * @ordered
	 */
	protected Name jobNeeds;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobNeedsOneOf1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getJobNeedsOneOf1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Name getJobNeeds() {
		return jobNeeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobNeeds(Name newJobNeeds, NotificationChain msgs) {
		Name oldJobNeeds = jobNeeds;
		jobNeeds = newJobNeeds;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.JOB_NEEDS_ONE_OF1__JOB_NEEDS, oldJobNeeds, newJobNeeds);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobNeeds(Name newJobNeeds) {
		if (newJobNeeds != jobNeeds) {
			NotificationChain msgs = null;
			if (jobNeeds != null)
				msgs = ((InternalEObject)jobNeeds).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.JOB_NEEDS_ONE_OF1__JOB_NEEDS, null, msgs);
			if (newJobNeeds != null)
				msgs = ((InternalEObject)newJobNeeds).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.JOB_NEEDS_ONE_OF1__JOB_NEEDS, null, msgs);
			msgs = basicSetJobNeeds(newJobNeeds, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.JOB_NEEDS_ONE_OF1__JOB_NEEDS, newJobNeeds, newJobNeeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.JOB_NEEDS_ONE_OF1__JOB_NEEDS:
				return basicSetJobNeeds(null, msgs);
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
			case GithubwfPackage.JOB_NEEDS_ONE_OF1__JOB_NEEDS:
				return getJobNeeds();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubwfPackage.JOB_NEEDS_ONE_OF1__JOB_NEEDS:
				setJobNeeds((Name)newValue);
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
			case GithubwfPackage.JOB_NEEDS_ONE_OF1__JOB_NEEDS:
				setJobNeeds((Name)null);
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
			case GithubwfPackage.JOB_NEEDS_ONE_OF1__JOB_NEEDS:
				return jobNeeds != null;
		}
		return super.eIsSet(featureID);
	}

} //JobNeedsOneOf1Impl
