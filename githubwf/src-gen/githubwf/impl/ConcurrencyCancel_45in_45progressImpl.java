/**
 */
package githubwf.impl;

import githubwf.ConcurrencyCancel_45in_45progress;
import githubwf.ConcurrencyCancel_45in_45progressAbstract;
import githubwf.GithubwfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concurrency Cancel 45in 45progress</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ConcurrencyCancel_45in_45progressImpl#getCancel_45in_45progress <em>Cancel 45in 45progress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcurrencyCancel_45in_45progressImpl extends ConcurrencyPropertiesAbstractImpl implements ConcurrencyCancel_45in_45progress {
	/**
	 * The cached value of the '{@link #getCancel_45in_45progress() <em>Cancel 45in 45progress</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancel_45in_45progress()
	 * @generated
	 * @ordered
	 */
	protected ConcurrencyCancel_45in_45progressAbstract cancel_45in_45progress;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyCancel_45in_45progressImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getConcurrencyCancel_45in_45progress();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyCancel_45in_45progressAbstract getCancel_45in_45progress() {
		return cancel_45in_45progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCancel_45in_45progress(ConcurrencyCancel_45in_45progressAbstract newCancel_45in_45progress, NotificationChain msgs) {
		ConcurrencyCancel_45in_45progressAbstract oldCancel_45in_45progress = cancel_45in_45progress;
		cancel_45in_45progress = newCancel_45in_45progress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS__CANCEL_45IN_45PROGRESS, oldCancel_45in_45progress, newCancel_45in_45progress);
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
	public void setCancel_45in_45progress(ConcurrencyCancel_45in_45progressAbstract newCancel_45in_45progress) {
		if (newCancel_45in_45progress != cancel_45in_45progress) {
			NotificationChain msgs = null;
			if (cancel_45in_45progress != null)
				msgs = ((InternalEObject)cancel_45in_45progress).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS__CANCEL_45IN_45PROGRESS, null, msgs);
			if (newCancel_45in_45progress != null)
				msgs = ((InternalEObject)newCancel_45in_45progress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS__CANCEL_45IN_45PROGRESS, null, msgs);
			msgs = basicSetCancel_45in_45progress(newCancel_45in_45progress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS__CANCEL_45IN_45PROGRESS, newCancel_45in_45progress, newCancel_45in_45progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS__CANCEL_45IN_45PROGRESS:
				return basicSetCancel_45in_45progress(null, msgs);
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS__CANCEL_45IN_45PROGRESS:
				return getCancel_45in_45progress();
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS__CANCEL_45IN_45PROGRESS:
				setCancel_45in_45progress((ConcurrencyCancel_45in_45progressAbstract)newValue);
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS__CANCEL_45IN_45PROGRESS:
				setCancel_45in_45progress((ConcurrencyCancel_45in_45progressAbstract)null);
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS__CANCEL_45IN_45PROGRESS:
				return cancel_45in_45progress != null;
		}
		return super.eIsSet(featureID);
	}

} //ConcurrencyCancel_45in_45progressImpl
