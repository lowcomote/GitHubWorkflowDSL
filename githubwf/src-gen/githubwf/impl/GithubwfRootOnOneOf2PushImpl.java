/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Push;
import githubwf.Ref;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Push</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2PushImpl#getPush <em>Push</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2PushImpl extends GithubwfRootOnOneOf2PropertiesAbstractImpl implements GithubwfRootOnOneOf2Push {
	/**
	 * The cached value of the '{@link #getPush() <em>Push</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPush()
	 * @generated
	 * @ordered
	 */
	protected Ref push;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2PushImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Push();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ref getPush() {
		return push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPush(Ref newPush, NotificationChain msgs) {
		Ref oldPush = push;
		push = newPush;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH__PUSH, oldPush, newPush);
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
	public void setPush(Ref newPush) {
		if (newPush != push) {
			NotificationChain msgs = null;
			if (push != null)
				msgs = ((InternalEObject)push).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH__PUSH, null, msgs);
			if (newPush != null)
				msgs = ((InternalEObject)newPush).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH__PUSH, null, msgs);
			msgs = basicSetPush(newPush, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH__PUSH, newPush, newPush));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH__PUSH:
				return basicSetPush(null, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH__PUSH:
				return getPush();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH__PUSH:
				setPush((Ref)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH__PUSH:
				setPush((Ref)null);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH__PUSH:
				return push != null;
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootOnOneOf2PushImpl
