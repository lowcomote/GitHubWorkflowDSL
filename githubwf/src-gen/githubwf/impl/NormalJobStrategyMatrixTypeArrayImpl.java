/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobStrategyMatrixItems;
import githubwf.NormalJobStrategyMatrixTypeArray;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Strategy Matrix Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobStrategyMatrixTypeArrayImpl#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobStrategyMatrixTypeArrayImpl extends NormalJobStrategyMatrixAbstractImpl implements NormalJobStrategyMatrixTypeArray {
	/**
	 * The cached value of the '{@link #getMatrix() <em>Matrix</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrix()
	 * @generated
	 * @ordered
	 */
	protected EList<NormalJobStrategyMatrixItems> matrix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobStrategyMatrixTypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobStrategyMatrixTypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NormalJobStrategyMatrixItems> getMatrix() {
		if (matrix == null) {
			matrix = new EObjectContainmentEList<NormalJobStrategyMatrixItems>(NormalJobStrategyMatrixItems.class, this, GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_TYPE_ARRAY__MATRIX);
		}
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_TYPE_ARRAY__MATRIX:
				return ((InternalEList<?>)getMatrix()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_TYPE_ARRAY__MATRIX:
				return getMatrix();
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
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_TYPE_ARRAY__MATRIX:
				getMatrix().clear();
				getMatrix().addAll((Collection<? extends NormalJobStrategyMatrixItems>)newValue);
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
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_TYPE_ARRAY__MATRIX:
				getMatrix().clear();
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
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_TYPE_ARRAY__MATRIX:
				return matrix != null && !matrix.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //NormalJobStrategyMatrixTypeArrayImpl
