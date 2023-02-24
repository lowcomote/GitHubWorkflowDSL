/**
 */
package githubwf.impl;

import githubwf.EventObjectTypeNumber;
import githubwf.GithubwfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Object Type Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.EventObjectTypeNumberImpl#getEventObject <em>Event Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventObjectTypeNumberImpl extends EventObjectAbstractImpl implements EventObjectTypeNumber {
	/**
	 * The default value of the '{@link #getEventObject() <em>Event Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventObject()
	 * @generated
	 * @ordered
	 */
	protected static final Double EVENT_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEventObject() <em>Event Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventObject()
	 * @generated
	 * @ordered
	 */
	protected Double eventObject = EVENT_OBJECT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventObjectTypeNumberImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getEventObjectTypeNumber();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getEventObject() {
		return eventObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventObject(Double newEventObject) {
		Double oldEventObject = eventObject;
		eventObject = newEventObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.EVENT_OBJECT_TYPE_NUMBER__EVENT_OBJECT, oldEventObject, eventObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.EVENT_OBJECT_TYPE_NUMBER__EVENT_OBJECT:
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
			case GithubwfPackage.EVENT_OBJECT_TYPE_NUMBER__EVENT_OBJECT:
				setEventObject((Double)newValue);
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
			case GithubwfPackage.EVENT_OBJECT_TYPE_NUMBER__EVENT_OBJECT:
				setEventObject(EVENT_OBJECT_EDEFAULT);
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
			case GithubwfPackage.EVENT_OBJECT_TYPE_NUMBER__EVENT_OBJECT:
				return EVENT_OBJECT_EDEFAULT == null ? eventObject != null : !EVENT_OBJECT_EDEFAULT.equals(eventObject);
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
		result.append(" (eventObject: ");
		result.append(eventObject);
		result.append(')');
		return result.toString();
	}

} //EventObjectTypeNumberImpl
