/**
 */
package githubwf.impl;

import githubwf.EventObject;
import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Repository_dispatch;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Repository dispatch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Repository_dispatchImpl#getRepository_dispatch <em>Repository dispatch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Repository_dispatchImpl extends GithubwfRootOnOneOf2PropertiesAbstractImpl implements GithubwfRootOnOneOf2Repository_dispatch {
	/**
	 * The cached value of the '{@link #getRepository_dispatch() <em>Repository dispatch</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository_dispatch()
	 * @generated
	 * @ordered
	 */
	protected EventObject repository_dispatch;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Repository_dispatchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Repository_dispatch();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getRepository_dispatch() {
		return repository_dispatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository_dispatch(EventObject newRepository_dispatch, NotificationChain msgs) {
		EventObject oldRepository_dispatch = repository_dispatch;
		repository_dispatch = newRepository_dispatch;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REPOSITORY_DISPATCH__REPOSITORY_DISPATCH, oldRepository_dispatch, newRepository_dispatch);
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
	public void setRepository_dispatch(EventObject newRepository_dispatch) {
		if (newRepository_dispatch != repository_dispatch) {
			NotificationChain msgs = null;
			if (repository_dispatch != null)
				msgs = ((InternalEObject)repository_dispatch).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REPOSITORY_DISPATCH__REPOSITORY_DISPATCH, null, msgs);
			if (newRepository_dispatch != null)
				msgs = ((InternalEObject)newRepository_dispatch).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REPOSITORY_DISPATCH__REPOSITORY_DISPATCH, null, msgs);
			msgs = basicSetRepository_dispatch(newRepository_dispatch, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REPOSITORY_DISPATCH__REPOSITORY_DISPATCH, newRepository_dispatch, newRepository_dispatch));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REPOSITORY_DISPATCH__REPOSITORY_DISPATCH:
				return basicSetRepository_dispatch(null, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REPOSITORY_DISPATCH__REPOSITORY_DISPATCH:
				return getRepository_dispatch();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REPOSITORY_DISPATCH__REPOSITORY_DISPATCH:
				setRepository_dispatch((EventObject)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REPOSITORY_DISPATCH__REPOSITORY_DISPATCH:
				setRepository_dispatch((EventObject)null);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REPOSITORY_DISPATCH__REPOSITORY_DISPATCH:
				return repository_dispatch != null;
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootOnOneOf2Repository_dispatchImpl
