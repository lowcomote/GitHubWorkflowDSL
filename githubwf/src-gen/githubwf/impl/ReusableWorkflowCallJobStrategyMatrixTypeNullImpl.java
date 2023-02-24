/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.ReusableWorkflowCallJobStrategyMatrixTypeNull;

import jsonMM.NullValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Reusable Workflow Call Job Strategy Matrix Type Null</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ReusableWorkflowCallJobStrategyMatrixTypeNullImpl#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReusableWorkflowCallJobStrategyMatrixTypeNullImpl extends ReusableWorkflowCallJobStrategyMatrixAbstractImpl implements ReusableWorkflowCallJobStrategyMatrixTypeNull {
	/**
	 * The cached value of the '{@link #getMatrix() <em>Matrix</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatrix()
	 * @generated
	 * @ordered
	 */
	protected NullValue matrix;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReusableWorkflowCallJobStrategyMatrixTypeNullImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getReusableWorkflowCallJobStrategyMatrixTypeNull();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullValue getMatrix() {
		return matrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMatrix(NullValue newMatrix, NotificationChain msgs) {
		NullValue oldMatrix = matrix;
		matrix = newMatrix;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_NULL__MATRIX, oldMatrix, newMatrix);
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
	public void setMatrix(NullValue newMatrix) {
		if (newMatrix != matrix) {
			NotificationChain msgs = null;
			if (matrix != null)
				msgs = ((InternalEObject)matrix).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_NULL__MATRIX, null, msgs);
			if (newMatrix != null)
				msgs = ((InternalEObject)newMatrix).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_NULL__MATRIX, null, msgs);
			msgs = basicSetMatrix(newMatrix, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_NULL__MATRIX, newMatrix, newMatrix));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_NULL__MATRIX:
				return basicSetMatrix(null, msgs);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_NULL__MATRIX:
				return getMatrix();
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_NULL__MATRIX:
				setMatrix((NullValue)newValue);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_NULL__MATRIX:
				setMatrix((NullValue)null);
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
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_NULL__MATRIX:
				return matrix != null;
		}
		return super.eIsSet(featureID);
	}

} //ReusableWorkflowCallJobStrategyMatrixTypeNullImpl
