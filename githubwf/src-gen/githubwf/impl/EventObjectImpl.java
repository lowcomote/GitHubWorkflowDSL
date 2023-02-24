/**
 */
package githubwf.impl;

import githubwf.EventObject;
import githubwf.EventObjectAbstract;
import githubwf.GithubwfPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.EventObjectImpl#getEventObject <em>Event Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventObjectImpl extends MinimalEObjectImpl.Container implements EventObject {
	/**
	 * The cached value of the '{@link #getEventObject() <em>Event Object</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventObject()
	 * @generated
	 * @ordered
	 */
	protected EventObjectAbstract eventObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getEventObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObjectAbstract getEventObject() {
		return eventObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEventObject(EventObjectAbstract newEventObject, NotificationChain msgs) {
		EventObjectAbstract oldEventObject = eventObject;
		eventObject = newEventObject;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.EVENT_OBJECT__EVENT_OBJECT, oldEventObject, newEventObject);
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
	public void setEventObject(EventObjectAbstract newEventObject) {
		if (newEventObject != eventObject) {
			NotificationChain msgs = null;
			if (eventObject != null)
				msgs = ((InternalEObject)eventObject).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.EVENT_OBJECT__EVENT_OBJECT, null, msgs);
			if (newEventObject != null)
				msgs = ((InternalEObject)newEventObject).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.EVENT_OBJECT__EVENT_OBJECT, null, msgs);
			msgs = basicSetEventObject(newEventObject, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.EVENT_OBJECT__EVENT_OBJECT, newEventObject, newEventObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.EVENT_OBJECT__EVENT_OBJECT:
				return basicSetEventObject(null, msgs);
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
			case GithubwfPackage.EVENT_OBJECT__EVENT_OBJECT:
				return getEventObject();
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
			case GithubwfPackage.EVENT_OBJECT__EVENT_OBJECT:
				setEventObject((EventObjectAbstract)newValue);
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
			case GithubwfPackage.EVENT_OBJECT__EVENT_OBJECT:
				setEventObject((EventObjectAbstract)null);
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
			case GithubwfPackage.EVENT_OBJECT__EVENT_OBJECT:
				return eventObject != null;
		}
		return super.eIsSet(featureID);
	}

} //EventObjectImpl
