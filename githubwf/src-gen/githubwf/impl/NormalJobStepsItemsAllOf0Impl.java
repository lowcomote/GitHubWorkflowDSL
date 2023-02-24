/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobStepsItemsAllOf0;
import githubwf.NormalJobStepsItemsAllOf0Abstract;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Steps Items All Of0</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf0Impl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobStepsItemsAllOf0Impl extends MinimalEObjectImpl.Container implements NormalJobStepsItemsAllOf0 {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected NormalJobStepsItemsAllOf0Abstract items;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobStepsItemsAllOf0Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0Abstract getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems(NormalJobStepsItemsAllOf0Abstract newItems, NotificationChain msgs) {
		NormalJobStepsItemsAllOf0Abstract oldItems = items;
		items = newItems;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0__ITEMS, oldItems, newItems);
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
	public void setItems(NormalJobStepsItemsAllOf0Abstract newItems) {
		if (newItems != items) {
			NotificationChain msgs = null;
			if (items != null)
				msgs = ((InternalEObject)items).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0__ITEMS, null, msgs);
			if (newItems != null)
				msgs = ((InternalEObject)newItems).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0__ITEMS, null, msgs);
			msgs = basicSetItems(newItems, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0__ITEMS, newItems, newItems));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0__ITEMS:
				return basicSetItems(null, msgs);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0__ITEMS:
				return getItems();
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0__ITEMS:
				setItems((NormalJobStepsItemsAllOf0Abstract)newValue);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0__ITEMS:
				setItems((NormalJobStepsItemsAllOf0Abstract)null);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0__ITEMS:
				return items != null;
		}
		return super.eIsSet(featureID);
	}

} //NormalJobStepsItemsAllOf0Impl
