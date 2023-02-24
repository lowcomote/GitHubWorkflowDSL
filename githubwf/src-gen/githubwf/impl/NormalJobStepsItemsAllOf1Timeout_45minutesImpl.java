/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobStepsItemsAllOf1Timeout_45minutes;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Steps Items All Of1 Timeout 45minutes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Timeout_45minutesImpl#getTimeout_45minutes <em>Timeout 45minutes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobStepsItemsAllOf1Timeout_45minutesImpl extends NormalJobStepsItemsAllOf1PropertiesAbstractImpl implements NormalJobStepsItemsAllOf1Timeout_45minutes {
	/**
	 * The default value of the '{@link #getTimeout_45minutes() <em>Timeout 45minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout_45minutes()
	 * @generated
	 * @ordered
	 */
	protected static final Double TIMEOUT_45MINUTES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTimeout_45minutes() <em>Timeout 45minutes</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeout_45minutes()
	 * @generated
	 * @ordered
	 */
	protected Double timeout_45minutes = TIMEOUT_45MINUTES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobStepsItemsAllOf1Timeout_45minutesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1Timeout_45minutes();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getTimeout_45minutes() {
		return timeout_45minutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeout_45minutes(Double newTimeout_45minutes) {
		Double oldTimeout_45minutes = timeout_45minutes;
		timeout_45minutes = newTimeout_45minutes;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_TIMEOUT_45MINUTES__TIMEOUT_45MINUTES, oldTimeout_45minutes, timeout_45minutes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_TIMEOUT_45MINUTES__TIMEOUT_45MINUTES:
				return getTimeout_45minutes();
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_TIMEOUT_45MINUTES__TIMEOUT_45MINUTES:
				setTimeout_45minutes((Double)newValue);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_TIMEOUT_45MINUTES__TIMEOUT_45MINUTES:
				setTimeout_45minutes(TIMEOUT_45MINUTES_EDEFAULT);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_TIMEOUT_45MINUTES__TIMEOUT_45MINUTES:
				return TIMEOUT_45MINUTES_EDEFAULT == null ? timeout_45minutes != null : !TIMEOUT_45MINUTES_EDEFAULT.equals(timeout_45minutes);
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
		result.append(" (timeout_45minutes: ");
		result.append(timeout_45minutes);
		result.append(')');
		return result.toString();
	}

} //NormalJobStepsItemsAllOf1Timeout_45minutesImpl
