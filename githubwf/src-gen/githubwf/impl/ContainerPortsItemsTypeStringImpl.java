/**
 */
package githubwf.impl;

import githubwf.ContainerPortsItemsTypeString;
import githubwf.GithubwfPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Ports Items Type String</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ContainerPortsItemsTypeStringImpl#getItems <em>Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerPortsItemsTypeStringImpl extends ContainerPortsItemsAbstractImpl implements ContainerPortsItemsTypeString {
	/**
	 * The default value of the '{@link #getItems() <em>Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected static final String ITEMS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected String items = ITEMS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerPortsItemsTypeStringImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getContainerPortsItemsTypeString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getItems() {
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setItems(String newItems) {
		String oldItems = items;
		items = newItems;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.CONTAINER_PORTS_ITEMS_TYPE_STRING__ITEMS, oldItems, items));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_TYPE_STRING__ITEMS:
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
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_TYPE_STRING__ITEMS:
				setItems((String)newValue);
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
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_TYPE_STRING__ITEMS:
				setItems(ITEMS_EDEFAULT);
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
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_TYPE_STRING__ITEMS:
				return ITEMS_EDEFAULT == null ? items != null : !ITEMS_EDEFAULT.equals(items);
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
		result.append(" (items: ");
		result.append(items);
		result.append(')');
		return result.toString();
	}

} //ContainerPortsItemsTypeStringImpl
