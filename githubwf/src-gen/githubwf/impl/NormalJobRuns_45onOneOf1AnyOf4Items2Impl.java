/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.Machine;
import githubwf.NormalJobRuns_45onOneOf1AnyOf4Items2;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Runs 45on One Of1 Any Of4 Items2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobRuns_45onOneOf1AnyOf4Items2Impl#getItems2 <em>Items2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobRuns_45onOneOf1AnyOf4Items2Impl extends MinimalEObjectImpl.Container implements NormalJobRuns_45onOneOf1AnyOf4Items2 {
	/**
	 * The cached value of the '{@link #getItems2() <em>Items2</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems2()
	 * @generated
	 * @ordered
	 */
	protected Machine items2;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobRuns_45onOneOf1AnyOf4Items2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf4Items2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Machine getItems2() {
		return items2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems2(Machine newItems2, NotificationChain msgs) {
		Machine oldItems2 = items2;
		items2 = newItems2;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_ITEMS2__ITEMS2, oldItems2, newItems2);
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
	public void setItems2(Machine newItems2) {
		if (newItems2 != items2) {
			NotificationChain msgs = null;
			if (items2 != null)
				msgs = ((InternalEObject)items2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_ITEMS2__ITEMS2, null, msgs);
			if (newItems2 != null)
				msgs = ((InternalEObject)newItems2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_ITEMS2__ITEMS2, null, msgs);
			msgs = basicSetItems2(newItems2, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_ITEMS2__ITEMS2, newItems2, newItems2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_ITEMS2__ITEMS2:
				return basicSetItems2(null, msgs);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_ITEMS2__ITEMS2:
				return getItems2();
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_ITEMS2__ITEMS2:
				setItems2((Machine)newValue);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_ITEMS2__ITEMS2:
				setItems2((Machine)null);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_ITEMS2__ITEMS2:
				return items2 != null;
		}
		return super.eIsSet(featureID);
	}

} //NormalJobRuns_45onOneOf1AnyOf4Items2Impl
