/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootConcurrency;
import githubwf.GithubwfRootConcurrencyAbstract;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Concurrency</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootConcurrencyImpl#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootConcurrencyImpl extends GithubwfRootPropertiesAbstractImpl implements GithubwfRootConcurrency {
	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected GithubwfRootConcurrencyAbstract concurrency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootConcurrencyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootConcurrency();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootConcurrencyAbstract getConcurrency() {
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcurrency(GithubwfRootConcurrencyAbstract newConcurrency, NotificationChain msgs) {
		GithubwfRootConcurrencyAbstract oldConcurrency = concurrency;
		concurrency = newConcurrency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY__CONCURRENCY, oldConcurrency, newConcurrency);
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
	public void setConcurrency(GithubwfRootConcurrencyAbstract newConcurrency) {
		if (newConcurrency != concurrency) {
			NotificationChain msgs = null;
			if (concurrency != null)
				msgs = ((InternalEObject)concurrency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY__CONCURRENCY, null, msgs);
			if (newConcurrency != null)
				msgs = ((InternalEObject)newConcurrency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY__CONCURRENCY, null, msgs);
			msgs = basicSetConcurrency(newConcurrency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY__CONCURRENCY, newConcurrency, newConcurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY__CONCURRENCY:
				return basicSetConcurrency(null, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY__CONCURRENCY:
				return getConcurrency();
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
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY__CONCURRENCY:
				setConcurrency((GithubwfRootConcurrencyAbstract)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY__CONCURRENCY:
				setConcurrency((GithubwfRootConcurrencyAbstract)null);
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
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY__CONCURRENCY:
				return concurrency != null;
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootConcurrencyImpl
