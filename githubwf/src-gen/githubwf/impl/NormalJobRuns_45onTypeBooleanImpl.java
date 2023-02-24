/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobRuns_45onTypeBoolean;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Runs 45on Type Boolean</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobRuns_45onTypeBooleanImpl#getRuns_45on <em>Runs 45on</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobRuns_45onTypeBooleanImpl extends NormalJobRuns_45onAbstractImpl implements NormalJobRuns_45onTypeBoolean {
	/**
	 * The default value of the '{@link #getRuns_45on() <em>Runs 45on</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns_45on()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean RUNS_45ON_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRuns_45on() <em>Runs 45on</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns_45on()
	 * @generated
	 * @ordered
	 */
	protected Boolean runs_45on = RUNS_45ON_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobRuns_45onTypeBooleanImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobRuns_45onTypeBoolean();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getRuns_45on() {
		return runs_45on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRuns_45on(Boolean newRuns_45on) {
		Boolean oldRuns_45on = runs_45on;
		runs_45on = newRuns_45on;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_BOOLEAN__RUNS_45ON, oldRuns_45on, runs_45on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_BOOLEAN__RUNS_45ON:
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_BOOLEAN__RUNS_45ON:
				setRuns_45on((Boolean)newValue);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_BOOLEAN__RUNS_45ON:
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_BOOLEAN__RUNS_45ON:
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

} //NormalJobRuns_45onTypeBooleanImpl
