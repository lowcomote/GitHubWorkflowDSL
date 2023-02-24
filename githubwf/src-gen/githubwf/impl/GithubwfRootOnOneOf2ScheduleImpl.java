/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Schedule;
import githubwf.GithubwfRootOnOneOf2ScheduleItems;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2ScheduleImpl#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2ScheduleImpl extends GithubwfRootOnOneOf2PropertiesAbstractImpl implements GithubwfRootOnOneOf2Schedule {
	/**
	 * The cached value of the '{@link #getSchedule() <em>Schedule</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSchedule()
	 * @generated
	 * @ordered
	 */
	protected EList<GithubwfRootOnOneOf2ScheduleItems> schedule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2ScheduleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Schedule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GithubwfRootOnOneOf2ScheduleItems> getSchedule() {
		if (schedule == null) {
			schedule = new EObjectContainmentEList<GithubwfRootOnOneOf2ScheduleItems>(GithubwfRootOnOneOf2ScheduleItems.class, this, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE__SCHEDULE);
		}
		return schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE__SCHEDULE:
				return ((InternalEList<?>)getSchedule()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE__SCHEDULE:
				return getSchedule();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE__SCHEDULE:
				getSchedule().clear();
				getSchedule().addAll((Collection<? extends GithubwfRootOnOneOf2ScheduleItems>)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE__SCHEDULE:
				getSchedule().clear();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE__SCHEDULE:
				return schedule != null && !schedule.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootOnOneOf2ScheduleImpl
