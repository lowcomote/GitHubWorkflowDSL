/**
 */
package githubwf.impl;

import githubwf.EventObjectItems;
import githubwf.EventObjectTypeArray;
import githubwf.GithubwfPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Object Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.EventObjectTypeArrayImpl#getEventObject <em>Event Object</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EventObjectTypeArrayImpl extends EventObjectAbstractImpl implements EventObjectTypeArray {
	/**
	 * The cached value of the '{@link #getEventObject() <em>Event Object</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventObject()
	 * @generated
	 * @ordered
	 */
	protected EList<EventObjectItems> eventObject;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventObjectTypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getEventObjectTypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<EventObjectItems> getEventObject() {
		if (eventObject == null) {
			eventObject = new EObjectContainmentEList<EventObjectItems>(EventObjectItems.class, this, GithubwfPackage.EVENT_OBJECT_TYPE_ARRAY__EVENT_OBJECT);
		}
		return eventObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.EVENT_OBJECT_TYPE_ARRAY__EVENT_OBJECT:
				return ((InternalEList<?>)getEventObject()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.EVENT_OBJECT_TYPE_ARRAY__EVENT_OBJECT:
				return getEventObject();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubwfPackage.EVENT_OBJECT_TYPE_ARRAY__EVENT_OBJECT:
				getEventObject().clear();
				getEventObject().addAll((Collection<? extends EventObjectItems>)newValue);
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
			case GithubwfPackage.EVENT_OBJECT_TYPE_ARRAY__EVENT_OBJECT:
				getEventObject().clear();
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
			case GithubwfPackage.EVENT_OBJECT_TYPE_ARRAY__EVENT_OBJECT:
				return eventObject != null && !eventObject.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //EventObjectTypeArrayImpl
