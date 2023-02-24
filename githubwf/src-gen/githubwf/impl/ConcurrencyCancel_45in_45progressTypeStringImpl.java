/**
 */
package githubwf.impl;

import githubwf.ConcurrencyCancel_45in_45progressTypeString;
import githubwf.GithubwfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Concurrency Cancel 45in 45progress Type String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ConcurrencyCancel_45in_45progressTypeStringImpl#getCancel_45in_45progress <em>Cancel 45in 45progress</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConcurrencyCancel_45in_45progressTypeStringImpl extends ConcurrencyCancel_45in_45progressAbstractImpl implements ConcurrencyCancel_45in_45progressTypeString {
	/**
	 * The default value of the '{@link #getCancel_45in_45progress() <em>Cancel 45in 45progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancel_45in_45progress()
	 * @generated
	 * @ordered
	 */
	protected static final String CANCEL_45IN_45PROGRESS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCancel_45in_45progress() <em>Cancel 45in 45progress</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCancel_45in_45progress()
	 * @generated
	 * @ordered
	 */
	protected String cancel_45in_45progress = CANCEL_45IN_45PROGRESS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConcurrencyCancel_45in_45progressTypeStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getConcurrencyCancel_45in_45progressTypeString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCancel_45in_45progress() {
		return cancel_45in_45progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCancel_45in_45progress(String newCancel_45in_45progress) {
		String oldCancel_45in_45progress = cancel_45in_45progress;
		cancel_45in_45progress = newCancel_45in_45progress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_STRING__CANCEL_45IN_45PROGRESS, oldCancel_45in_45progress, cancel_45in_45progress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_STRING__CANCEL_45IN_45PROGRESS:
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_STRING__CANCEL_45IN_45PROGRESS:
				setCancel_45in_45progress((String)newValue);
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_STRING__CANCEL_45IN_45PROGRESS:
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
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_STRING__CANCEL_45IN_45PROGRESS:
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

} //ConcurrencyCancel_45in_45progressTypeStringImpl
