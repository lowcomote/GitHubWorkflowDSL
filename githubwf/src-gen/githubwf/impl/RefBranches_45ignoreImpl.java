/**
 */
package githubwf.impl;

import githubwf.Branch;
import githubwf.GithubwfPackage;
import githubwf.RefBranches_45ignore;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Branches 45ignore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.RefBranches_45ignoreImpl#getBranches_45ignore <em>Branches 45ignore</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefBranches_45ignoreImpl extends RefPropertiesAbstractImpl implements RefBranches_45ignore {
	/**
	 * The cached value of the '{@link #getBranches_45ignore() <em>Branches 45ignore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranches_45ignore()
	 * @generated
	 * @ordered
	 */
	protected Branch branches_45ignore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefBranches_45ignoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getRefBranches_45ignore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch getBranches_45ignore() {
		return branches_45ignore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranches_45ignore(Branch newBranches_45ignore, NotificationChain msgs) {
		Branch oldBranches_45ignore = branches_45ignore;
		branches_45ignore = newBranches_45ignore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.REF_BRANCHES_45IGNORE__BRANCHES_45IGNORE, oldBranches_45ignore, newBranches_45ignore);
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
	public void setBranches_45ignore(Branch newBranches_45ignore) {
		if (newBranches_45ignore != branches_45ignore) {
			NotificationChain msgs = null;
			if (branches_45ignore != null)
				msgs = ((InternalEObject)branches_45ignore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.REF_BRANCHES_45IGNORE__BRANCHES_45IGNORE, null, msgs);
			if (newBranches_45ignore != null)
				msgs = ((InternalEObject)newBranches_45ignore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.REF_BRANCHES_45IGNORE__BRANCHES_45IGNORE, null, msgs);
			msgs = basicSetBranches_45ignore(newBranches_45ignore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.REF_BRANCHES_45IGNORE__BRANCHES_45IGNORE, newBranches_45ignore, newBranches_45ignore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.REF_BRANCHES_45IGNORE__BRANCHES_45IGNORE:
				return basicSetBranches_45ignore(null, msgs);
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
			case GithubwfPackage.REF_BRANCHES_45IGNORE__BRANCHES_45IGNORE:
				return getBranches_45ignore();
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
			case GithubwfPackage.REF_BRANCHES_45IGNORE__BRANCHES_45IGNORE:
				setBranches_45ignore((Branch)newValue);
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
			case GithubwfPackage.REF_BRANCHES_45IGNORE__BRANCHES_45IGNORE:
				setBranches_45ignore((Branch)null);
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
			case GithubwfPackage.REF_BRANCHES_45IGNORE__BRANCHES_45IGNORE:
				return branches_45ignore != null;
		}
		return super.eIsSet(featureID);
	}

} //RefBranches_45ignoreImpl
