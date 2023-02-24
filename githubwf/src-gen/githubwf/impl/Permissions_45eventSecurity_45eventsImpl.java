/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.Permissions_45eventSecurity_45events;
import githubwf.Permissions_45level;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permissions 45event Security 45events</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.Permissions_45eventSecurity_45eventsImpl#getSecurity_45events <em>Security 45events</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Permissions_45eventSecurity_45eventsImpl extends Permissions_45eventPropertiesAbstractImpl implements Permissions_45eventSecurity_45events {
	/**
	 * The cached value of the '{@link #getSecurity_45events() <em>Security 45events</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSecurity_45events()
	 * @generated
	 * @ordered
	 */
	protected Permissions_45level security_45events;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Permissions_45eventSecurity_45eventsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getPermissions_45eventSecurity_45events();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getSecurity_45events() {
		return security_45events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSecurity_45events(Permissions_45level newSecurity_45events, NotificationChain msgs) {
		Permissions_45level oldSecurity_45events = security_45events;
		security_45events = newSecurity_45events;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.PERMISSIONS_45EVENT_SECURITY_45EVENTS__SECURITY_45EVENTS, oldSecurity_45events, newSecurity_45events);
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
	public void setSecurity_45events(Permissions_45level newSecurity_45events) {
		if (newSecurity_45events != security_45events) {
			NotificationChain msgs = null;
			if (security_45events != null)
				msgs = ((InternalEObject)security_45events).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.PERMISSIONS_45EVENT_SECURITY_45EVENTS__SECURITY_45EVENTS, null, msgs);
			if (newSecurity_45events != null)
				msgs = ((InternalEObject)newSecurity_45events).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.PERMISSIONS_45EVENT_SECURITY_45EVENTS__SECURITY_45EVENTS, null, msgs);
			msgs = basicSetSecurity_45events(newSecurity_45events, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.PERMISSIONS_45EVENT_SECURITY_45EVENTS__SECURITY_45EVENTS, newSecurity_45events, newSecurity_45events));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.PERMISSIONS_45EVENT_SECURITY_45EVENTS__SECURITY_45EVENTS:
				return basicSetSecurity_45events(null, msgs);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_SECURITY_45EVENTS__SECURITY_45EVENTS:
				return getSecurity_45events();
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
			case GithubwfPackage.PERMISSIONS_45EVENT_SECURITY_45EVENTS__SECURITY_45EVENTS:
				setSecurity_45events((Permissions_45level)newValue);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_SECURITY_45EVENTS__SECURITY_45EVENTS:
				setSecurity_45events((Permissions_45level)null);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_SECURITY_45EVENTS__SECURITY_45EVENTS:
				return security_45events != null;
		}
		return super.eIsSet(featureID);
	}

} //Permissions_45eventSecurity_45eventsImpl
