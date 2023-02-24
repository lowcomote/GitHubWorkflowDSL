/**
 */
package githubwf.impl;

import githubwf.EnvOneOf1;
import githubwf.GithubwfPackage;
import githubwf.StringContainingExpressionSyntax;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Env One Of1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.EnvOneOf1Impl#getEnv <em>Env</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EnvOneOf1Impl extends MinimalEObjectImpl.Container implements EnvOneOf1 {
	/**
	 * The cached value of the '{@link #getEnv() <em>Env</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnv()
	 * @generated
	 * @ordered
	 */
	protected StringContainingExpressionSyntax env;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EnvOneOf1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getEnvOneOf1();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringContainingExpressionSyntax getEnv() {
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnv(StringContainingExpressionSyntax newEnv, NotificationChain msgs) {
		StringContainingExpressionSyntax oldEnv = env;
		env = newEnv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.ENV_ONE_OF1__ENV, oldEnv, newEnv);
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
	public void setEnv(StringContainingExpressionSyntax newEnv) {
		if (newEnv != env) {
			NotificationChain msgs = null;
			if (env != null)
				msgs = ((InternalEObject)env).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.ENV_ONE_OF1__ENV, null, msgs);
			if (newEnv != null)
				msgs = ((InternalEObject)newEnv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.ENV_ONE_OF1__ENV, null, msgs);
			msgs = basicSetEnv(newEnv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.ENV_ONE_OF1__ENV, newEnv, newEnv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.ENV_ONE_OF1__ENV:
				return basicSetEnv(null, msgs);
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
			case GithubwfPackage.ENV_ONE_OF1__ENV:
				return getEnv();
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
			case GithubwfPackage.ENV_ONE_OF1__ENV:
				setEnv((StringContainingExpressionSyntax)newValue);
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
			case GithubwfPackage.ENV_ONE_OF1__ENV:
				setEnv((StringContainingExpressionSyntax)null);
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
			case GithubwfPackage.ENV_ONE_OF1__ENV:
				return env != null;
		}
		return super.eIsSet(featureID);
	}

} //EnvOneOf1Impl
