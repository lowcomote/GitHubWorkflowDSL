/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobContinue_45on_45errorTypeString;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Continue 45on 45error Type String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobContinue_45on_45errorTypeStringImpl#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobContinue_45on_45errorTypeStringImpl extends NormalJobContinue_45on_45errorAbstractImpl implements NormalJobContinue_45on_45errorTypeString {
	/**
	 * The default value of the '{@link #getContinue_45on_45error() <em>Continue 45on 45error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinue_45on_45error()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTINUE_45ON_45ERROR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getContinue_45on_45error() <em>Continue 45on 45error</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContinue_45on_45error()
	 * @generated
	 * @ordered
	 */
	protected String continue_45on_45error = CONTINUE_45ON_45ERROR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobContinue_45on_45errorTypeStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobContinue_45on_45errorTypeString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getContinue_45on_45error() {
		return continue_45on_45error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setContinue_45on_45error(String newContinue_45on_45error) {
		String oldContinue_45on_45error = continue_45on_45error;
		continue_45on_45error = newContinue_45on_45error;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_STRING__CONTINUE_45ON_45ERROR, oldContinue_45on_45error, continue_45on_45error));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_STRING__CONTINUE_45ON_45ERROR:
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
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_STRING__CONTINUE_45ON_45ERROR:
				setContinue_45on_45error((String)newValue);
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
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_STRING__CONTINUE_45ON_45ERROR:
				setContinue_45on_45error(CONTINUE_45ON_45ERROR_EDEFAULT);
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
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_STRING__CONTINUE_45ON_45ERROR:
				return CONTINUE_45ON_45ERROR_EDEFAULT == null ? continue_45on_45error != null : !CONTINUE_45ON_45ERROR_EDEFAULT.equals(continue_45on_45error);
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
		result.append(" (continue_45on_45error: ");
		result.append(continue_45on_45error);
		result.append(')');
		return result.toString();
	}

} //NormalJobContinue_45on_45errorTypeStringImpl
