/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.Permissions_45eventPackages;
import githubwf.Permissions_45level;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permissions 45event Packages</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.Permissions_45eventPackagesImpl#getPackages <em>Packages</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Permissions_45eventPackagesImpl extends Permissions_45eventPropertiesAbstractImpl implements Permissions_45eventPackages {
	/**
	 * The cached value of the '{@link #getPackages() <em>Packages</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackages()
	 * @generated
	 * @ordered
	 */
	protected Permissions_45level packages;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Permissions_45eventPackagesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getPermissions_45eventPackages();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getPackages() {
		return packages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPackages(Permissions_45level newPackages, NotificationChain msgs) {
		Permissions_45level oldPackages = packages;
		packages = newPackages;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.PERMISSIONS_45EVENT_PACKAGES__PACKAGES, oldPackages, newPackages);
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
	public void setPackages(Permissions_45level newPackages) {
		if (newPackages != packages) {
			NotificationChain msgs = null;
			if (packages != null)
				msgs = ((InternalEObject)packages).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.PERMISSIONS_45EVENT_PACKAGES__PACKAGES, null, msgs);
			if (newPackages != null)
				msgs = ((InternalEObject)newPackages).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.PERMISSIONS_45EVENT_PACKAGES__PACKAGES, null, msgs);
			msgs = basicSetPackages(newPackages, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.PERMISSIONS_45EVENT_PACKAGES__PACKAGES, newPackages, newPackages));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.PERMISSIONS_45EVENT_PACKAGES__PACKAGES:
				return basicSetPackages(null, msgs);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_PACKAGES__PACKAGES:
				return getPackages();
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
			case GithubwfPackage.PERMISSIONS_45EVENT_PACKAGES__PACKAGES:
				setPackages((Permissions_45level)newValue);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_PACKAGES__PACKAGES:
				setPackages((Permissions_45level)null);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_PACKAGES__PACKAGES:
				return packages != null;
		}
		return super.eIsSet(featureID);
	}

} //Permissions_45eventPackagesImpl
