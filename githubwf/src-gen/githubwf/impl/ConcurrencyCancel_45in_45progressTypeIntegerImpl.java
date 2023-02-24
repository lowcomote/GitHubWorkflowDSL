/**
 */
package githubwf.impl;

import githubwf.ConcurrencyCancel_45in_45progressTypeInteger;
import githubwf.GithubwfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concurrency Cancel 45in 45progress Type Integer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ConcurrencyCancel_45in_45progressTypeIntegerImpl#getCancel_45in_45progress <em>Cancel 45in 45progress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcurrencyCancel_45in_45progressTypeIntegerImpl extends ConcurrencyCancel_45in_45progressAbstractImpl implements ConcurrencyCancel_45in_45progressTypeInteger {
	/**
	 * The default value of the '{@link #getCancel_45in_45progress() <em>Cancel 45in 45progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancel_45in_45progress()
	 * @generated
	 * @ordered
	 */
	protected static final Double CANCEL_45IN_45PROGRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancel_45in_45progress() <em>Cancel 45in 45progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancel_45in_45progress()
	 * @generated
	 * @ordered
	 */
	protected Double cancel_45in_45progress = CANCEL_45IN_45PROGRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyCancel_45in_45progressTypeIntegerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getConcurrencyCancel_45in_45progressTypeInteger();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getCancel_45in_45progress() {
		return cancel_45in_45progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancel_45in_45progress(Double newCancel_45in_45progress) {
		Double oldCancel_45in_45progress = cancel_45in_45progress;
		cancel_45in_45progress = newCancel_45in_45progress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_INTEGER__CANCEL_45IN_45PROGRESS, oldCancel_45in_45progress, cancel_45in_45progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_INTEGER__CANCEL_45IN_45PROGRESS:
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_INTEGER__CANCEL_45IN_45PROGRESS:
				setCancel_45in_45progress((Double)newValue);
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_INTEGER__CANCEL_45IN_45PROGRESS:
				setCancel_45in_45progress(CANCEL_45IN_45PROGRESS_EDEFAULT);
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_INTEGER__CANCEL_45IN_45PROGRESS:
				return CANCEL_45IN_45PROGRESS_EDEFAULT == null ? cancel_45in_45progress != null : !CANCEL_45IN_45PROGRESS_EDEFAULT.equals(cancel_45in_45progress);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (cancel_45in_45progress: ");
		result.append(cancel_45in_45progress);
		result.append(')');
		return result.toString();
	}

} //ConcurrencyCancel_45in_45progressTypeIntegerImpl
