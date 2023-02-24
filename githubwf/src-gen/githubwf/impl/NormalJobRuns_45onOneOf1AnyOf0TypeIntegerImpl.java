/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeInteger;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Runs 45on One Of1 Any Of0 Type Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobRuns_45onOneOf1AnyOf0TypeIntegerImpl#getRuns_45on <em>Runs 45on</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobRuns_45onOneOf1AnyOf0TypeIntegerImpl extends NormalJobRuns_45onOneOf1AnyOf0AbstractImpl implements NormalJobRuns_45onOneOf1AnyOf0TypeInteger {
	/**
	 * The default value of the '{@link #getRuns_45on() <em>Runs 45on</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns_45on()
	 * @generated
	 * @ordered
	 */
	protected static final Double RUNS_45ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuns_45on() <em>Runs 45on</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns_45on()
	 * @generated
	 * @ordered
	 */
	protected Double runs_45on = RUNS_45ON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobRuns_45onOneOf1AnyOf0TypeIntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf0TypeInteger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getRuns_45on() {
		return runs_45on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuns_45on(Double newRuns_45on) {
		Double oldRuns_45on = runs_45on;
		runs_45on = newRuns_45on;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_INTEGER__RUNS_45ON, oldRuns_45on, runs_45on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_INTEGER__RUNS_45ON:
				return getRuns_45on();
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_INTEGER__RUNS_45ON:
				setRuns_45on((Double)newValue);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_INTEGER__RUNS_45ON:
				setRuns_45on(RUNS_45ON_EDEFAULT);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_INTEGER__RUNS_45ON:
				return RUNS_45ON_EDEFAULT == null ? runs_45on != null : !RUNS_45ON_EDEFAULT.equals(runs_45on);
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
		result.append(" (runs_45on: ");
		result.append(runs_45on);
		result.append(')');
		return result.toString();
	}

} //NormalJobRuns_45onOneOf1AnyOf0TypeIntegerImpl
