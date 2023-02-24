/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootJobsPatternProperties0Items;
import githubwf.GithubwfRootJobsPatternProperties0TypeArray;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Jobs Pattern Properties0 Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootJobsPatternProperties0TypeArrayImpl#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootJobsPatternProperties0TypeArrayImpl extends GithubwfRootJobsPatternProperties0AbstractImpl implements GithubwfRootJobsPatternProperties0TypeArray {
	/**
	 * The cached value of the '{@link #getPatternProperties0() <em>Pattern Properties0</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatternProperties0()
	 * @generated
	 * @ordered
	 */
	protected EList<GithubwfRootJobsPatternProperties0Items> patternProperties0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootJobsPatternProperties0TypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootJobsPatternProperties0TypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GithubwfRootJobsPatternProperties0Items> getPatternProperties0() {
		if (patternProperties0 == null) {
			patternProperties0 = new EObjectContainmentEList<GithubwfRootJobsPatternProperties0Items>(GithubwfRootJobsPatternProperties0Items.class, this, GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_TYPE_ARRAY__PATTERN_PROPERTIES0);
		}
		return patternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_TYPE_ARRAY__PATTERN_PROPERTIES0:
				return ((InternalEList<?>)getPatternProperties0()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_TYPE_ARRAY__PATTERN_PROPERTIES0:
				return getPatternProperties0();
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
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_TYPE_ARRAY__PATTERN_PROPERTIES0:
				getPatternProperties0().clear();
				getPatternProperties0().addAll((Collection<? extends GithubwfRootJobsPatternProperties0Items>)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_TYPE_ARRAY__PATTERN_PROPERTIES0:
				getPatternProperties0().clear();
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
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_TYPE_ARRAY__PATTERN_PROPERTIES0:
				return patternProperties0 != null && !patternProperties0.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootJobsPatternProperties0TypeArrayImpl
