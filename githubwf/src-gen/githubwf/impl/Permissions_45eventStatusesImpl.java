/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.Permissions_45eventStatuses;
import githubwf.Permissions_45level;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permissions 45event Statuses</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.Permissions_45eventStatusesImpl#getStatuses <em>Statuses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Permissions_45eventStatusesImpl extends Permissions_45eventPropertiesAbstractImpl implements Permissions_45eventStatuses {
	/**
	 * The cached value of the '{@link #getStatuses() <em>Statuses</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatuses()
	 * @generated
	 * @ordered
	 */
	protected Permissions_45level statuses;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Permissions_45eventStatusesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getPermissions_45eventStatuses();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getStatuses() {
		return statuses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStatuses(Permissions_45level newStatuses, NotificationChain msgs) {
		Permissions_45level oldStatuses = statuses;
		statuses = newStatuses;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.PERMISSIONS_45EVENT_STATUSES__STATUSES, oldStatuses, newStatuses);
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
	public void setStatuses(Permissions_45level newStatuses) {
		if (newStatuses != statuses) {
			NotificationChain msgs = null;
			if (statuses != null)
				msgs = ((InternalEObject)statuses).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.PERMISSIONS_45EVENT_STATUSES__STATUSES, null, msgs);
			if (newStatuses != null)
				msgs = ((InternalEObject)newStatuses).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.PERMISSIONS_45EVENT_STATUSES__STATUSES, null, msgs);
			msgs = basicSetStatuses(newStatuses, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.PERMISSIONS_45EVENT_STATUSES__STATUSES, newStatuses, newStatuses));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.PERMISSIONS_45EVENT_STATUSES__STATUSES:
				return basicSetStatuses(null, msgs);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_STATUSES__STATUSES:
				return getStatuses();
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
			case GithubwfPackage.PERMISSIONS_45EVENT_STATUSES__STATUSES:
				setStatuses((Permissions_45level)newValue);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_STATUSES__STATUSES:
				setStatuses((Permissions_45level)null);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_STATUSES__STATUSES:
				return statuses != null;
		}
		return super.eIsSet(featureID);
	}

} //Permissions_45eventStatusesImpl
