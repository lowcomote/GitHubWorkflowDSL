/**
 */
package githubwf.impl;

import githubwf.ExpressionSyntax;
import githubwf.GithubwfPackage;
import githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Steps Items All Of1 Continue 45on 45error One Of1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Impl#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Impl extends MinimalEObjectImpl.Container implements NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 {
	/**
	 * The cached value of the '{@link #getContinue_45on_45error() <em>Continue 45on 45error</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinue_45on_45error()
	 * @generated
	 * @ordered
	 */
	protected ExpressionSyntax continue_45on_45error;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionSyntax getContinue_45on_45error() {
		return continue_45on_45error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetContinue_45on_45error(ExpressionSyntax newContinue_45on_45error, NotificationChain msgs) {
		ExpressionSyntax oldContinue_45on_45error = continue_45on_45error;
		continue_45on_45error = newContinue_45on_45error;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_ONE_OF1__CONTINUE_45ON_45ERROR, oldContinue_45on_45error, newContinue_45on_45error);
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
	public void setContinue_45on_45error(ExpressionSyntax newContinue_45on_45error) {
		if (newContinue_45on_45error != continue_45on_45error) {
			NotificationChain msgs = null;
			if (continue_45on_45error != null)
				msgs = ((InternalEObject)continue_45on_45error).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_ONE_OF1__CONTINUE_45ON_45ERROR, null, msgs);
			if (newContinue_45on_45error != null)
				msgs = ((InternalEObject)newContinue_45on_45error).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_ONE_OF1__CONTINUE_45ON_45ERROR, null, msgs);
			msgs = basicSetContinue_45on_45error(newContinue_45on_45error, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_ONE_OF1__CONTINUE_45ON_45ERROR, newContinue_45on_45error, newContinue_45on_45error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_ONE_OF1__CONTINUE_45ON_45ERROR:
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_ONE_OF1__CONTINUE_45ON_45ERROR:
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_ONE_OF1__CONTINUE_45ON_45ERROR:
				setContinue_45on_45error((ExpressionSyntax)newValue);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_ONE_OF1__CONTINUE_45ON_45ERROR:
				setContinue_45on_45error((ExpressionSyntax)null);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_ONE_OF1__CONTINUE_45ON_45ERROR:
				return continue_45on_45error != null;
		}
		return super.eIsSet(featureID);
	}

} //NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Impl
