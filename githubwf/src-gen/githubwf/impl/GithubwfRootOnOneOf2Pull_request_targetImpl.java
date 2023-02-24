/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Pull_request_target;
import githubwf.Ref;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Pull request target</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Pull_request_targetImpl#getPull_request_target <em>Pull request target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Pull_request_targetImpl extends GithubwfRootOnOneOf2PropertiesAbstractImpl implements GithubwfRootOnOneOf2Pull_request_target {
	/**
	 * The cached value of the '{@link #getPull_request_target() <em>Pull request target</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPull_request_target()
	 * @generated
	 * @ordered
	 */
	protected Ref pull_request_target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Pull_request_targetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Pull_request_target();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ref getPull_request_target() {
		return pull_request_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPull_request_target(Ref newPull_request_target, NotificationChain msgs) {
		Ref oldPull_request_target = pull_request_target;
		pull_request_target = newPull_request_target;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET__PULL_REQUEST_TARGET, oldPull_request_target, newPull_request_target);
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
	public void setPull_request_target(Ref newPull_request_target) {
		if (newPull_request_target != pull_request_target) {
			NotificationChain msgs = null;
			if (pull_request_target != null)
				msgs = ((InternalEObject)pull_request_target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET__PULL_REQUEST_TARGET, null, msgs);
			if (newPull_request_target != null)
				msgs = ((InternalEObject)newPull_request_target).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET__PULL_REQUEST_TARGET, null, msgs);
			msgs = basicSetPull_request_target(newPull_request_target, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET__PULL_REQUEST_TARGET, newPull_request_target, newPull_request_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET__PULL_REQUEST_TARGET:
				return basicSetPull_request_target(null, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET__PULL_REQUEST_TARGET:
				return getPull_request_target();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET__PULL_REQUEST_TARGET:
				setPull_request_target((Ref)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET__PULL_REQUEST_TARGET:
				setPull_request_target((Ref)null);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET__PULL_REQUEST_TARGET:
				return pull_request_target != null;
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootOnOneOf2Pull_request_targetImpl
