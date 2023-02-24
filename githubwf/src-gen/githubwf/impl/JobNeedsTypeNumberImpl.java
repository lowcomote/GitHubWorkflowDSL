/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.JobNeedsTypeNumber;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Job Needs Type Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.JobNeedsTypeNumberImpl#getJobNeeds <em>Job Needs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JobNeedsTypeNumberImpl extends JobNeedsAbstractImpl implements JobNeedsTypeNumber {
	/**
	 * The default value of the '{@link #getJobNeeds() <em>Job Needs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNeeds()
	 * @generated
	 * @ordered
	 */
	protected static final Double JOB_NEEDS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getJobNeeds() <em>Job Needs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobNeeds()
	 * @generated
	 * @ordered
	 */
	protected Double jobNeeds = JOB_NEEDS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JobNeedsTypeNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getJobNeedsTypeNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getJobNeeds() {
		return jobNeeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setJobNeeds(Double newJobNeeds) {
		Double oldJobNeeds = jobNeeds;
		jobNeeds = newJobNeeds;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.JOB_NEEDS_TYPE_NUMBER__JOB_NEEDS, oldJobNeeds, jobNeeds));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.JOB_NEEDS_TYPE_NUMBER__JOB_NEEDS:
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
			case GithubwfPackage.JOB_NEEDS_TYPE_NUMBER__JOB_NEEDS:
				setJobNeeds((Double)newValue);
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
			case GithubwfPackage.JOB_NEEDS_TYPE_NUMBER__JOB_NEEDS:
				setJobNeeds(JOB_NEEDS_EDEFAULT);
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
			case GithubwfPackage.JOB_NEEDS_TYPE_NUMBER__JOB_NEEDS:
				return JOB_NEEDS_EDEFAULT == null ? jobNeeds != null : !JOB_NEEDS_EDEFAULT.equals(jobNeeds);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (jobNeeds: ");
		result.append(jobNeeds);
		result.append(')');
		return result.toString();
	}

} //JobNeedsTypeNumberImpl
