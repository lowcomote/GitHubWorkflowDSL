/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.Permissions_45level;

import jsonMM.JsonDocument;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permissions 45level</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.Permissions_45levelImpl#getPermissions_45level <em>Permissions 45level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Permissions_45levelImpl extends MinimalEObjectImpl.Container implements Permissions_45level {
	/**
	 * The cached value of the '{@link #getPermissions_45level() <em>Permissions 45level</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions_45level()
	 * @generated
	 * @ordered
	 */
	protected JsonDocument permissions_45level;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Permissions_45levelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getPermissions_45level();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JsonDocument getPermissions_45level() {
		return permissions_45level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPermissions_45level(JsonDocument newPermissions_45level, NotificationChain msgs) {
		JsonDocument oldPermissions_45level = permissions_45level;
		permissions_45level = newPermissions_45level;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.PERMISSIONS_45LEVEL__PERMISSIONS_45LEVEL, oldPermissions_45level, newPermissions_45level);
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
	public void setPermissions_45level(JsonDocument newPermissions_45level) {
		if (newPermissions_45level != permissions_45level) {
			NotificationChain msgs = null;
			if (permissions_45level != null)
				msgs = ((InternalEObject)permissions_45level).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.PERMISSIONS_45LEVEL__PERMISSIONS_45LEVEL, null, msgs);
			if (newPermissions_45level != null)
				msgs = ((InternalEObject)newPermissions_45level).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.PERMISSIONS_45LEVEL__PERMISSIONS_45LEVEL, null, msgs);
			msgs = basicSetPermissions_45level(newPermissions_45level, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.PERMISSIONS_45LEVEL__PERMISSIONS_45LEVEL, newPermissions_45level, newPermissions_45level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.PERMISSIONS_45LEVEL__PERMISSIONS_45LEVEL:
				return basicSetPermissions_45level(null, msgs);
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
			case GithubwfPackage.PERMISSIONS_45LEVEL__PERMISSIONS_45LEVEL:
				return getPermissions_45level();
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
			case GithubwfPackage.PERMISSIONS_45LEVEL__PERMISSIONS_45LEVEL:
				setPermissions_45level((JsonDocument)newValue);
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
			case GithubwfPackage.PERMISSIONS_45LEVEL__PERMISSIONS_45LEVEL:
				setPermissions_45level((JsonDocument)null);
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
			case GithubwfPackage.PERMISSIONS_45LEVEL__PERMISSIONS_45LEVEL:
				return permissions_45level != null;
		}
		return super.eIsSet(featureID);
	}

} //Permissions_45levelImpl
