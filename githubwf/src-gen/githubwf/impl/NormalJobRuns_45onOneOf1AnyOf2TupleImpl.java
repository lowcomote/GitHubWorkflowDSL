/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobRuns_45onOneOf1AnyOf2AdditionalItems;
import githubwf.NormalJobRuns_45onOneOf1AnyOf2Items0;
import githubwf.NormalJobRuns_45onOneOf1AnyOf2Items1;
import githubwf.NormalJobRuns_45onOneOf1AnyOf2Tuple;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Runs 45on One Of1 Any Of2 Tuple</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobRuns_45onOneOf1AnyOf2TupleImpl#getItems0 <em>Items0</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobRuns_45onOneOf1AnyOf2TupleImpl#getItems1 <em>Items1</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobRuns_45onOneOf1AnyOf2TupleImpl#getAdditionalItems <em>Additional Items</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobRuns_45onOneOf1AnyOf2TupleImpl extends MinimalEObjectImpl.Container implements NormalJobRuns_45onOneOf1AnyOf2Tuple {
	/**
	 * The cached value of the '{@link #getItems0() <em>Items0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems0()
	 * @generated
	 * @ordered
	 */
	protected NormalJobRuns_45onOneOf1AnyOf2Items0 items0;

	/**
	 * The cached value of the '{@link #getItems1() <em>Items1</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems1()
	 * @generated
	 * @ordered
	 */
	protected NormalJobRuns_45onOneOf1AnyOf2Items1 items1;

	/**
	 * The cached value of the '{@link #getAdditionalItems() <em>Additional Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalItems()
	 * @generated
	 * @ordered
	 */
	protected EList<NormalJobRuns_45onOneOf1AnyOf2AdditionalItems> additionalItems;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobRuns_45onOneOf1AnyOf2TupleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobRuns_45onOneOf1AnyOf2Tuple();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2Items0 getItems0() {
		return items0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems0(NormalJobRuns_45onOneOf1AnyOf2Items0 newItems0, NotificationChain msgs) {
		NormalJobRuns_45onOneOf1AnyOf2Items0 oldItems0 = items0;
		items0 = newItems0;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS0, oldItems0, newItems0);
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
	public void setItems0(NormalJobRuns_45onOneOf1AnyOf2Items0 newItems0) {
		if (newItems0 != items0) {
			NotificationChain msgs = null;
			if (items0 != null)
				msgs = ((InternalEObject)items0).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS0, null, msgs);
			if (newItems0 != null)
				msgs = ((InternalEObject)newItems0).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS0, null, msgs);
			msgs = basicSetItems0(newItems0, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS0, newItems0, newItems0));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2Items1 getItems1() {
		return items1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetItems1(NormalJobRuns_45onOneOf1AnyOf2Items1 newItems1, NotificationChain msgs) {
		NormalJobRuns_45onOneOf1AnyOf2Items1 oldItems1 = items1;
		items1 = newItems1;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS1, oldItems1, newItems1);
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
	public void setItems1(NormalJobRuns_45onOneOf1AnyOf2Items1 newItems1) {
		if (newItems1 != items1) {
			NotificationChain msgs = null;
			if (items1 != null)
				msgs = ((InternalEObject)items1).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS1, null, msgs);
			if (newItems1 != null)
				msgs = ((InternalEObject)newItems1).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS1, null, msgs);
			msgs = basicSetItems1(newItems1, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS1, newItems1, newItems1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NormalJobRuns_45onOneOf1AnyOf2AdditionalItems> getAdditionalItems() {
		if (additionalItems == null) {
			additionalItems = new EObjectContainmentEList<NormalJobRuns_45onOneOf1AnyOf2AdditionalItems>(NormalJobRuns_45onOneOf1AnyOf2AdditionalItems.class, this, GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ADDITIONAL_ITEMS);
		}
		return additionalItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Integer getItemsNumber() {
		int itemsNumber = 0;
		if(this.items0!=null) itemsNumber++;
		if(this.items1!=null) itemsNumber++;
		if(this.additionalItems!=null) itemsNumber=itemsNumber+this.additionalItems.size();
		return itemsNumber;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS0:
				return basicSetItems0(null, msgs);
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS1:
				return basicSetItems1(null, msgs);
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ADDITIONAL_ITEMS:
				return ((InternalEList<?>)getAdditionalItems()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS0:
				return getItems0();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS1:
				return getItems1();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ADDITIONAL_ITEMS:
				return getAdditionalItems();
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS0:
				setItems0((NormalJobRuns_45onOneOf1AnyOf2Items0)newValue);
				return;
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS1:
				setItems1((NormalJobRuns_45onOneOf1AnyOf2Items1)newValue);
				return;
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ADDITIONAL_ITEMS:
				getAdditionalItems().clear();
				getAdditionalItems().addAll((Collection<? extends NormalJobRuns_45onOneOf1AnyOf2AdditionalItems>)newValue);
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS0:
				setItems0((NormalJobRuns_45onOneOf1AnyOf2Items0)null);
				return;
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS1:
				setItems1((NormalJobRuns_45onOneOf1AnyOf2Items1)null);
				return;
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ADDITIONAL_ITEMS:
				getAdditionalItems().clear();
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
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS0:
				return items0 != null;
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ITEMS1:
				return items1 != null;
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE__ADDITIONAL_ITEMS:
				return additionalItems != null && !additionalItems.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE___GET_ITEMS_NUMBER:
				return getItemsNumber();
		}
		return super.eInvoke(operationID, arguments);
	}

} //NormalJobRuns_45onOneOf1AnyOf2TupleImpl
