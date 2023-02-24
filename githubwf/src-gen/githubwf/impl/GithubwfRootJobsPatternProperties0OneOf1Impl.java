/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootJobsPatternProperties0OneOf1;
import githubwf.ReusableWorkflowCallJob;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Jobs Pattern Properties0 One Of1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootJobsPatternProperties0OneOf1Impl#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootJobsPatternProperties0OneOf1Impl extends MinimalEObjectImpl.Container implements GithubwfRootJobsPatternProperties0OneOf1 {
	/**
	 * The cached value of the '{@link #getPatternProperties0() <em>Pattern Properties0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperties0()
	 * @generated
	 * @ordered
	 */
	protected ReusableWorkflowCallJob patternProperties0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootJobsPatternProperties0OneOf1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootJobsPatternProperties0OneOf1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJob getPatternProperties0() {
		return patternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatternProperties0(ReusableWorkflowCallJob newPatternProperties0, NotificationChain msgs) {
		ReusableWorkflowCallJob oldPatternProperties0 = patternProperties0;
		patternProperties0 = newPatternProperties0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_ONE_OF1__PATTERN_PROPERTIES0, oldPatternProperties0, newPatternProperties0);
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
	public void setPatternProperties0(ReusableWorkflowCallJob newPatternProperties0) {
		if (newPatternProperties0 != patternProperties0) {
			NotificationChain msgs = null;
			if (patternProperties0 != null)
				msgs = ((InternalEObject)patternProperties0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_ONE_OF1__PATTERN_PROPERTIES0, null, msgs);
			if (newPatternProperties0 != null)
				msgs = ((InternalEObject)newPatternProperties0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_ONE_OF1__PATTERN_PROPERTIES0, null, msgs);
			msgs = basicSetPatternProperties0(newPatternProperties0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_ONE_OF1__PATTERN_PROPERTIES0, newPatternProperties0, newPatternProperties0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_ONE_OF1__PATTERN_PROPERTIES0:
				return basicSetPatternProperties0(null, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_ONE_OF1__PATTERN_PROPERTIES0:
				return getPatternProperties0();
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
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_ONE_OF1__PATTERN_PROPERTIES0:
				setPatternProperties0((ReusableWorkflowCallJob)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_ONE_OF1__PATTERN_PROPERTIES0:
				setPatternProperties0((ReusableWorkflowCallJob)null);
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
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_ONE_OF1__PATTERN_PROPERTIES0:
				return patternProperties0 != null;
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootJobsPatternProperties0OneOf1Impl
