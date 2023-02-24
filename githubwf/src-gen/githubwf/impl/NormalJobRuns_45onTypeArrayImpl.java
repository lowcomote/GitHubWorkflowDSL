/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobRuns_45onItems;
import githubwf.NormalJobRuns_45onTypeArray;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Runs 45on Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobRuns_45onTypeArrayImpl#getRuns_45on <em>Runs 45on</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobRuns_45onTypeArrayImpl extends NormalJobRuns_45onAbstractImpl implements NormalJobRuns_45onTypeArray {
	/**
	 * The cached value of the '{@link #getRuns_45on() <em>Runs 45on</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRuns_45on()
	 * @generated
	 * @ordered
	 */
	protected EList<NormalJobRuns_45onItems> runs_45on;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobRuns_45onTypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobRuns_45onTypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NormalJobRuns_45onItems> getRuns_45on() {
		if (runs_45on == null) {
			runs_45on = new EObjectContainmentEList<NormalJobRuns_45onItems>(NormalJobRuns_45onItems.class, this, GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_ARRAY__RUNS_45ON);
		}
		return runs_45on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_ARRAY__RUNS_45ON:
				return ((InternalEList<?>)getRuns_45on()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_ARRAY__RUNS_45ON:
				return getRuns_45on();
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_ARRAY__RUNS_45ON:
				getRuns_45on().clear();
				getRuns_45on().addAll((Collection<? extends NormalJobRuns_45onItems>)newValue);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_ARRAY__RUNS_45ON:
				getRuns_45on().clear();
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_ARRAY__RUNS_45ON:
				return runs_45on != null && !runs_45on.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NormalJobRuns_45onTypeArrayImpl
