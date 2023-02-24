/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.Machine;
import githubwf.NormalJobRuns_45onOneOf1AnyOf1Items1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Runs 45on One Of1 Any Of1 Items1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobRuns_45onOneOf1AnyOf1Items1Impl#getItems1 <em>Items1</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobRuns_45onOneOf1AnyOf1Items1Impl extends MinimalEObjectImpl.Container implements NormalJobRuns_45onOneOf1AnyOf1Items1 {
	/**
	 * The cached value of the '{@link #getItems1() <em>Items1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems1()
	 * @generated
	 * @ordered
	 */
	protected Machine items1;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobRuns_45onOneOf1AnyOf1Items1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf1Items1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Machine getItems1() {
		return items1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems1(Machine newItems1, NotificationChain msgs) {
		Machine oldItems1 = items1;
		items1 = newItems1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ITEMS1__ITEMS1, oldItems1, newItems1);
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
	public void setItems1(Machine newItems1) {
		if (newItems1 != items1) {
			NotificationChain msgs = null;
			if (items1 != null)
				msgs = ((InternalEObject)items1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ITEMS1__ITEMS1, null, msgs);
			if (newItems1 != null)
				msgs = ((InternalEObject)newItems1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ITEMS1__ITEMS1, null, msgs);
			msgs = basicSetItems1(newItems1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ITEMS1__ITEMS1, newItems1, newItems1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ITEMS1__ITEMS1:
				return basicSetItems1(null, msgs);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ITEMS1__ITEMS1:
				return getItems1();
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ITEMS1__ITEMS1:
				setItems1((Machine)newValue);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ITEMS1__ITEMS1:
				setItems1((Machine)null);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ITEMS1__ITEMS1:
				return items1 != null;
		}
		return super.eIsSet(featureID);
	}

} //NormalJobRuns_45onOneOf1AnyOf1Items1Impl
