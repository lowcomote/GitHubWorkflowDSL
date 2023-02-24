/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.RefOneOf0AllOf1Items;
import githubwf.RefOneOf0AllOf1TypeArray;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref One Of0 All Of1 Type Array</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.RefOneOf0AllOf1TypeArrayImpl#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefOneOf0AllOf1TypeArrayImpl extends RefOneOf0AllOf1AbstractImpl implements RefOneOf0AllOf1TypeArray {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected EList<RefOneOf0AllOf1Items> ref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefOneOf0AllOf1TypeArrayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getRefOneOf0AllOf1TypeArray();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RefOneOf0AllOf1Items> getRef() {
		if (ref == null) {
			ref = new EObjectContainmentEList<RefOneOf0AllOf1Items>(RefOneOf0AllOf1Items.class, this, GithubwfPackage.REF_ONE_OF0_ALL_OF1_TYPE_ARRAY__REF);
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_TYPE_ARRAY__REF:
				return ((InternalEList<?>)getRef()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_TYPE_ARRAY__REF:
				return getRef();
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
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_TYPE_ARRAY__REF:
				getRef().clear();
				getRef().addAll((Collection<? extends RefOneOf0AllOf1Items>)newValue);
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
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_TYPE_ARRAY__REF:
				getRef().clear();
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
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_TYPE_ARRAY__REF:
				return ref != null && !ref.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RefOneOf0AllOf1TypeArrayImpl
