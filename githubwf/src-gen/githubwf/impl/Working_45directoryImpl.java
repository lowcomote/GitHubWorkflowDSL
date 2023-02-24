/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.Working_45directory;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Working 45directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.Working_45directoryImpl#getWorking_45directory <em>Working 45directory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Working_45directoryImpl extends MinimalEObjectImpl.Container implements Working_45directory {
	/**
	 * The default value of the '{@link #getWorking_45directory() <em>Working 45directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorking_45directory()
	 * @generated
	 * @ordered
	 */
	protected static final String WORKING_45DIRECTORY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWorking_45directory() <em>Working 45directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorking_45directory()
	 * @generated
	 * @ordered
	 */
	protected String working_45directory = WORKING_45DIRECTORY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Working_45directoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getWorking_45directory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getWorking_45directory() {
		return working_45directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setWorking_45directory(String newWorking_45directory) {
		String oldWorking_45directory = working_45directory;
		working_45directory = newWorking_45directory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.WORKING_45DIRECTORY__WORKING_45DIRECTORY, oldWorking_45directory, working_45directory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.WORKING_45DIRECTORY__WORKING_45DIRECTORY:
				return getWorking_45directory();
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
			case GithubwfPackage.WORKING_45DIRECTORY__WORKING_45DIRECTORY:
				setWorking_45directory((String)newValue);
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
			case GithubwfPackage.WORKING_45DIRECTORY__WORKING_45DIRECTORY:
				setWorking_45directory(WORKING_45DIRECTORY_EDEFAULT);
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
			case GithubwfPackage.WORKING_45DIRECTORY__WORKING_45DIRECTORY:
				return WORKING_45DIRECTORY_EDEFAULT == null ? working_45directory != null : !WORKING_45DIRECTORY_EDEFAULT.equals(working_45directory);
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
		result.append(" (working_45directory: ");
		result.append(working_45directory);
		result.append(')');
		return result.toString();
	}

} //Working_45directoryImpl
