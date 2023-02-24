/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobContinue_45on_45errorItems;
import githubwf.NormalJobContinue_45on_45errorTypeArray;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Continue 45on 45error Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobContinue_45on_45errorTypeArrayImpl#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobContinue_45on_45errorTypeArrayImpl extends NormalJobContinue_45on_45errorAbstractImpl implements NormalJobContinue_45on_45errorTypeArray {
	/**
	 * The cached value of the '{@link #getContinue_45on_45error() <em>Continue 45on 45error</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinue_45on_45error()
	 * @generated
	 * @ordered
	 */
	protected EList<NormalJobContinue_45on_45errorItems> continue_45on_45error;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobContinue_45on_45errorTypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobContinue_45on_45errorTypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NormalJobContinue_45on_45errorItems> getContinue_45on_45error() {
		if (continue_45on_45error == null) {
			continue_45on_45error = new EObjectContainmentEList<NormalJobContinue_45on_45errorItems>(NormalJobContinue_45on_45errorItems.class, this, GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_ARRAY__CONTINUE_45ON_45ERROR);
		}
		return continue_45on_45error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_ARRAY__CONTINUE_45ON_45ERROR:
				return ((InternalEList<?>)getContinue_45on_45error()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_ARRAY__CONTINUE_45ON_45ERROR:
				return getContinue_45on_45error();
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
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_ARRAY__CONTINUE_45ON_45ERROR:
				getContinue_45on_45error().clear();
				getContinue_45on_45error().addAll((Collection<? extends NormalJobContinue_45on_45errorItems>)newValue);
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
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_ARRAY__CONTINUE_45ON_45ERROR:
				getContinue_45on_45error().clear();
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
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_ARRAY__CONTINUE_45ON_45ERROR:
				return continue_45on_45error != null && !continue_45on_45error.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NormalJobContinue_45on_45errorTypeArrayImpl
