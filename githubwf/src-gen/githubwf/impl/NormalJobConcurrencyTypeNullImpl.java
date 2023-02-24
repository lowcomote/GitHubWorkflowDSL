/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobConcurrencyTypeNull;

import jsonMM.NullValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Concurrency Type Null</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobConcurrencyTypeNullImpl#getConcurrency <em>Concurrency</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobConcurrencyTypeNullImpl extends NormalJobConcurrencyAbstractImpl implements NormalJobConcurrencyTypeNull {
	/**
	 * The cached value of the '{@link #getConcurrency() <em>Concurrency</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConcurrency()
	 * @generated
	 * @ordered
	 */
	protected NullValue concurrency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobConcurrencyTypeNullImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobConcurrencyTypeNull();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullValue getConcurrency() {
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConcurrency(NullValue newConcurrency, NotificationChain msgs) {
		NullValue oldConcurrency = concurrency;
		concurrency = newConcurrency;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_NULL__CONCURRENCY, oldConcurrency, newConcurrency);
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
	public void setConcurrency(NullValue newConcurrency) {
		if (newConcurrency != concurrency) {
			NotificationChain msgs = null;
			if (concurrency != null)
				msgs = ((InternalEObject)concurrency).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_NULL__CONCURRENCY, null, msgs);
			if (newConcurrency != null)
				msgs = ((InternalEObject)newConcurrency).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_NULL__CONCURRENCY, null, msgs);
			msgs = basicSetConcurrency(newConcurrency, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_NULL__CONCURRENCY, newConcurrency, newConcurrency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_NULL__CONCURRENCY:
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
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_NULL__CONCURRENCY:
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
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_NULL__CONCURRENCY:
				setConcurrency((NullValue)newValue);
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
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_NULL__CONCURRENCY:
				setConcurrency((NullValue)null);
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
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_NULL__CONCURRENCY:
				return concurrency != null;
		}
		return super.eIsSet(featureID);
	}

} //NormalJobConcurrencyTypeNullImpl
