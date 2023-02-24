/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.Permissions_45eventId_45token;
import githubwf.Permissions_45level;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permissions 45event Id 45token</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.Permissions_45eventId_45tokenImpl#getId_45token <em>Id 45token</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Permissions_45eventId_45tokenImpl extends Permissions_45eventPropertiesAbstractImpl implements Permissions_45eventId_45token {
	/**
	 * The cached value of the '{@link #getId_45token() <em>Id 45token</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId_45token()
	 * @generated
	 * @ordered
	 */
	protected Permissions_45level id_45token;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Permissions_45eventId_45tokenImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getPermissions_45eventId_45token();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getId_45token() {
		return id_45token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetId_45token(Permissions_45level newId_45token, NotificationChain msgs) {
		Permissions_45level oldId_45token = id_45token;
		id_45token = newId_45token;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.PERMISSIONS_45EVENT_ID_45TOKEN__ID_45TOKEN, oldId_45token, newId_45token);
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
	public void setId_45token(Permissions_45level newId_45token) {
		if (newId_45token != id_45token) {
			NotificationChain msgs = null;
			if (id_45token != null)
				msgs = ((InternalEObject)id_45token).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.PERMISSIONS_45EVENT_ID_45TOKEN__ID_45TOKEN, null, msgs);
			if (newId_45token != null)
				msgs = ((InternalEObject)newId_45token).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.PERMISSIONS_45EVENT_ID_45TOKEN__ID_45TOKEN, null, msgs);
			msgs = basicSetId_45token(newId_45token, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.PERMISSIONS_45EVENT_ID_45TOKEN__ID_45TOKEN, newId_45token, newId_45token));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.PERMISSIONS_45EVENT_ID_45TOKEN__ID_45TOKEN:
				return basicSetId_45token(null, msgs);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_ID_45TOKEN__ID_45TOKEN:
				return getId_45token();
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
			case GithubwfPackage.PERMISSIONS_45EVENT_ID_45TOKEN__ID_45TOKEN:
				setId_45token((Permissions_45level)newValue);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_ID_45TOKEN__ID_45TOKEN:
				setId_45token((Permissions_45level)null);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_ID_45TOKEN__ID_45TOKEN:
				return id_45token != null;
		}
		return super.eIsSet(featureID);
	}

} //Permissions_45eventId_45tokenImpl
