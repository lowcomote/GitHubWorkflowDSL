/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1Tuple;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeArray;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Runs 45on One Of1 Any Of1 Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobRuns_45onOneOf1AnyOf1TypeArrayImpl#getRuns_45on <em>Runs 45on</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobRuns_45onOneOf1AnyOf1TypeArrayImpl extends NormalJobRuns_45onOneOf1AnyOf1AbstractImpl implements NormalJobRuns_45onOneOf1AnyOf1TypeArray {
	/**
	 * The cached value of the '{@link #getRuns_45on() <em>Runs 45on</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns_45on()
	 * @generated
	 * @ordered
	 */
	protected NormalJobRuns_45onOneOf1AnyOf1Tuple runs_45on;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobRuns_45onOneOf1AnyOf1TypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1TypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf1Tuple getRuns_45on() {
		return runs_45on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRuns_45on(NormalJobRuns_45onOneOf1AnyOf1Tuple newRuns_45on, NotificationChain msgs) {
		NormalJobRuns_45onOneOf1AnyOf1Tuple oldRuns_45on = runs_45on;
		runs_45on = newRuns_45on;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_ARRAY__RUNS_45ON, oldRuns_45on, newRuns_45on);
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
	public void setRuns_45on(NormalJobRuns_45onOneOf1AnyOf1Tuple newRuns_45on) {
		if (newRuns_45on != runs_45on) {
			NotificationChain msgs = null;
			if (runs_45on != null)
				msgs = ((InternalEObject)runs_45on).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_ARRAY__RUNS_45ON, null, msgs);
			if (newRuns_45on != null)
				msgs = ((InternalEObject)newRuns_45on).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_ARRAY__RUNS_45ON, null, msgs);
			msgs = basicSetRuns_45on(newRuns_45on, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_ARRAY__RUNS_45ON, newRuns_45on, newRuns_45on));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_ARRAY__RUNS_45ON:
				return basicSetRuns_45on(null, msgs);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_ARRAY__RUNS_45ON:
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_ARRAY__RUNS_45ON:
				setRuns_45on((NormalJobRuns_45onOneOf1AnyOf1Tuple)newValue);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_ARRAY__RUNS_45ON:
				setRuns_45on((NormalJobRuns_45onOneOf1AnyOf1Tuple)null);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_ARRAY__RUNS_45ON:
				return runs_45on != null;
		}
		return super.eIsSet(featureID);
	}

} //NormalJobRuns_45onOneOf1AnyOf1TypeArrayImpl
