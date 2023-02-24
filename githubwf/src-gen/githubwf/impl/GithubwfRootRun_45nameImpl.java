/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootRun_45name;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Run 45name</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootRun_45nameImpl#getRun_45name <em>Run 45name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootRun_45nameImpl extends GithubwfRootPropertiesAbstractImpl implements GithubwfRootRun_45name {
	/**
	 * The default value of the '{@link #getRun_45name() <em>Run 45name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun_45name()
	 * @generated
	 * @ordered
	 */
	protected static final String RUN_45NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRun_45name() <em>Run 45name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRun_45name()
	 * @generated
	 * @ordered
	 */
	protected String run_45name = RUN_45NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootRun_45nameImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootRun_45name();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRun_45name() {
		return run_45name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRun_45name(String newRun_45name) {
		String oldRun_45name = run_45name;
		run_45name = newRun_45name;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_RUN_45NAME__RUN_45NAME, oldRun_45name, run_45name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_RUN_45NAME__RUN_45NAME:
				return getRun_45name();
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
			case GithubwfPackage.GITHUBWF_ROOT_RUN_45NAME__RUN_45NAME:
				setRun_45name((String)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_RUN_45NAME__RUN_45NAME:
				setRun_45name(RUN_45NAME_EDEFAULT);
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
			case GithubwfPackage.GITHUBWF_ROOT_RUN_45NAME__RUN_45NAME:
				return RUN_45NAME_EDEFAULT == null ? run_45name != null : !RUN_45NAME_EDEFAULT.equals(run_45name);
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
		result.append(" (run_45name: ");
		result.append(run_45name);
		result.append(')');
		return result.toString();
	}

} //GithubwfRootRun_45nameImpl
