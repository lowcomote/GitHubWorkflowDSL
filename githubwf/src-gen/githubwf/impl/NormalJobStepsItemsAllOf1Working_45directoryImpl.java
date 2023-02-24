/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobStepsItemsAllOf1Working_45directory;
import githubwf.Working_45directory;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Steps Items All Of1 Working 45directory</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1Working_45directoryImpl#getWorking_45directory <em>Working 45directory</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobStepsItemsAllOf1Working_45directoryImpl extends NormalJobStepsItemsAllOf1PropertiesAbstractImpl implements NormalJobStepsItemsAllOf1Working_45directory {
	/**
	 * The cached value of the '{@link #getWorking_45directory() <em>Working 45directory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorking_45directory()
	 * @generated
	 * @ordered
	 */
	protected Working_45directory working_45directory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobStepsItemsAllOf1Working_45directoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1Working_45directory();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Working_45directory getWorking_45directory() {
		return working_45directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetWorking_45directory(Working_45directory newWorking_45directory, NotificationChain msgs) {
		Working_45directory oldWorking_45directory = working_45directory;
		working_45directory = newWorking_45directory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_WORKING_45DIRECTORY__WORKING_45DIRECTORY, oldWorking_45directory, newWorking_45directory);
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
	public void setWorking_45directory(Working_45directory newWorking_45directory) {
		if (newWorking_45directory != working_45directory) {
			NotificationChain msgs = null;
			if (working_45directory != null)
				msgs = ((InternalEObject)working_45directory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_WORKING_45DIRECTORY__WORKING_45DIRECTORY, null, msgs);
			if (newWorking_45directory != null)
				msgs = ((InternalEObject)newWorking_45directory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_WORKING_45DIRECTORY__WORKING_45DIRECTORY, null, msgs);
			msgs = basicSetWorking_45directory(newWorking_45directory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_WORKING_45DIRECTORY__WORKING_45DIRECTORY, newWorking_45directory, newWorking_45directory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_WORKING_45DIRECTORY__WORKING_45DIRECTORY:
				return basicSetWorking_45directory(null, msgs);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_WORKING_45DIRECTORY__WORKING_45DIRECTORY:
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_WORKING_45DIRECTORY__WORKING_45DIRECTORY:
				setWorking_45directory((Working_45directory)newValue);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_WORKING_45DIRECTORY__WORKING_45DIRECTORY:
				setWorking_45directory((Working_45directory)null);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_WORKING_45DIRECTORY__WORKING_45DIRECTORY:
				return working_45directory != null;
		}
		return super.eIsSet(featureID);
	}

} //NormalJobStepsItemsAllOf1Working_45directoryImpl
