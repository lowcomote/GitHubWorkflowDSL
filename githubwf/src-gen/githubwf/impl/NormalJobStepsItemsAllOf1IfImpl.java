/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobStepsItemsAllOf1If;
import githubwf.NormalJobStepsItemsAllOf1IfAbstract;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Normal Job Steps Items All Of1 If</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobStepsItemsAllOf1IfImpl#getIf_ <em>If </em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobStepsItemsAllOf1IfImpl extends NormalJobStepsItemsAllOf1PropertiesAbstractImpl implements NormalJobStepsItemsAllOf1If {
	/**
	 * The cached value of the '{@link #getIf_() <em>If </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIf_()
	 * @generated
	 * @ordered
	 */
	protected NormalJobStepsItemsAllOf1IfAbstract if_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobStepsItemsAllOf1IfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1If();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1IfAbstract getIf_() {
		return if_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIf_(NormalJobStepsItemsAllOf1IfAbstract newIf_, NotificationChain msgs) {
		NormalJobStepsItemsAllOf1IfAbstract oldIf_ = if_;
		if_ = newIf_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_IF__IF_, oldIf_, newIf_);
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
	public void setIf_(NormalJobStepsItemsAllOf1IfAbstract newIf_) {
		if (newIf_ != if_) {
			NotificationChain msgs = null;
			if (if_ != null)
				msgs = ((InternalEObject)if_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_IF__IF_, null, msgs);
			if (newIf_ != null)
				msgs = ((InternalEObject)newIf_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_IF__IF_, null, msgs);
			msgs = basicSetIf_(newIf_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_IF__IF_, newIf_, newIf_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_IF__IF_:
				return basicSetIf_(null, msgs);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_IF__IF_:
				return getIf_();
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_IF__IF_:
				setIf_((NormalJobStepsItemsAllOf1IfAbstract)newValue);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_IF__IF_:
				setIf_((NormalJobStepsItemsAllOf1IfAbstract)null);
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
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_IF__IF_:
				return if_ != null;
		}
		return super.eIsSet(featureID);
	}

} //NormalJobStepsItemsAllOf1IfImpl
