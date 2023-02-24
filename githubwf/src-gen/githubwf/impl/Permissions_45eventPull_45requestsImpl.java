/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.Permissions_45eventPull_45requests;
import githubwf.Permissions_45level;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permissions 45event Pull 45requests</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.Permissions_45eventPull_45requestsImpl#getPull_45requests <em>Pull 45requests</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Permissions_45eventPull_45requestsImpl extends Permissions_45eventPropertiesAbstractImpl implements Permissions_45eventPull_45requests {
	/**
	 * The cached value of the '{@link #getPull_45requests() <em>Pull 45requests</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPull_45requests()
	 * @generated
	 * @ordered
	 */
	protected Permissions_45level pull_45requests;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Permissions_45eventPull_45requestsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getPermissions_45eventPull_45requests();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getPull_45requests() {
		return pull_45requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPull_45requests(Permissions_45level newPull_45requests, NotificationChain msgs) {
		Permissions_45level oldPull_45requests = pull_45requests;
		pull_45requests = newPull_45requests;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.PERMISSIONS_45EVENT_PULL_45REQUESTS__PULL_45REQUESTS, oldPull_45requests, newPull_45requests);
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
	public void setPull_45requests(Permissions_45level newPull_45requests) {
		if (newPull_45requests != pull_45requests) {
			NotificationChain msgs = null;
			if (pull_45requests != null)
				msgs = ((InternalEObject)pull_45requests).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.PERMISSIONS_45EVENT_PULL_45REQUESTS__PULL_45REQUESTS, null, msgs);
			if (newPull_45requests != null)
				msgs = ((InternalEObject)newPull_45requests).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.PERMISSIONS_45EVENT_PULL_45REQUESTS__PULL_45REQUESTS, null, msgs);
			msgs = basicSetPull_45requests(newPull_45requests, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.PERMISSIONS_45EVENT_PULL_45REQUESTS__PULL_45REQUESTS, newPull_45requests, newPull_45requests));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.PERMISSIONS_45EVENT_PULL_45REQUESTS__PULL_45REQUESTS:
				return basicSetPull_45requests(null, msgs);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_PULL_45REQUESTS__PULL_45REQUESTS:
				return getPull_45requests();
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
			case GithubwfPackage.PERMISSIONS_45EVENT_PULL_45REQUESTS__PULL_45REQUESTS:
				setPull_45requests((Permissions_45level)newValue);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_PULL_45REQUESTS__PULL_45REQUESTS:
				setPull_45requests((Permissions_45level)null);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_PULL_45REQUESTS__PULL_45REQUESTS:
				return pull_45requests != null;
		}
		return super.eIsSet(featureID);
	}

} //Permissions_45eventPull_45requestsImpl
