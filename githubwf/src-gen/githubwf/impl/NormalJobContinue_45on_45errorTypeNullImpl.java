/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobContinue_45on_45errorTypeNull;

import jsonMM.NullValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Continue 45on 45error Type Null</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobContinue_45on_45errorTypeNullImpl#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobContinue_45on_45errorTypeNullImpl extends NormalJobContinue_45on_45errorAbstractImpl implements NormalJobContinue_45on_45errorTypeNull {
	/**
	 * The cached value of the '{@link #getContinue_45on_45error() <em>Continue 45on 45error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinue_45on_45error()
	 * @generated
	 * @ordered
	 */
	protected NullValue continue_45on_45error;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobContinue_45on_45errorTypeNullImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobContinue_45on_45errorTypeNull();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullValue getContinue_45on_45error() {
		return continue_45on_45error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinue_45on_45error(NullValue newContinue_45on_45error, NotificationChain msgs) {
		NullValue oldContinue_45on_45error = continue_45on_45error;
		continue_45on_45error = newContinue_45on_45error;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_NULL__CONTINUE_45ON_45ERROR, oldContinue_45on_45error, newContinue_45on_45error);
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
	public void setContinue_45on_45error(NullValue newContinue_45on_45error) {
		if (newContinue_45on_45error != continue_45on_45error) {
			NotificationChain msgs = null;
			if (continue_45on_45error != null)
				msgs = ((InternalEObject)continue_45on_45error).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_NULL__CONTINUE_45ON_45ERROR, null, msgs);
			if (newContinue_45on_45error != null)
				msgs = ((InternalEObject)newContinue_45on_45error).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_NULL__CONTINUE_45ON_45ERROR, null, msgs);
			msgs = basicSetContinue_45on_45error(newContinue_45on_45error, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_NULL__CONTINUE_45ON_45ERROR, newContinue_45on_45error, newContinue_45on_45error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_NULL__CONTINUE_45ON_45ERROR:
				return basicSetContinue_45on_45error(null, msgs);
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
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_NULL__CONTINUE_45ON_45ERROR:
				return getContinue_45on_45error();
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
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_NULL__CONTINUE_45ON_45ERROR:
				setContinue_45on_45error((NullValue)newValue);
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
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_NULL__CONTINUE_45ON_45ERROR:
				setContinue_45on_45error((NullValue)null);
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
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_NULL__CONTINUE_45ON_45ERROR:
				return continue_45on_45error != null;
		}
		return super.eIsSet(featureID);
	}

} //NormalJobContinue_45on_45errorTypeNullImpl
