/**
 */
package githubwf.impl;

import githubwf.Branch;
import githubwf.GithubwfPackage;
import githubwf.RefTags_45ignore;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Tags 45ignore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.RefTags_45ignoreImpl#getTags_45ignore <em>Tags 45ignore</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefTags_45ignoreImpl extends RefPropertiesAbstractImpl implements RefTags_45ignore {
	/**
	 * The cached value of the '{@link #getTags_45ignore() <em>Tags 45ignore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTags_45ignore()
	 * @generated
	 * @ordered
	 */
	protected Branch tags_45ignore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefTags_45ignoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getRefTags_45ignore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch getTags_45ignore() {
		return tags_45ignore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTags_45ignore(Branch newTags_45ignore, NotificationChain msgs) {
		Branch oldTags_45ignore = tags_45ignore;
		tags_45ignore = newTags_45ignore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.REF_TAGS_45IGNORE__TAGS_45IGNORE, oldTags_45ignore, newTags_45ignore);
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
	public void setTags_45ignore(Branch newTags_45ignore) {
		if (newTags_45ignore != tags_45ignore) {
			NotificationChain msgs = null;
			if (tags_45ignore != null)
				msgs = ((InternalEObject)tags_45ignore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.REF_TAGS_45IGNORE__TAGS_45IGNORE, null, msgs);
			if (newTags_45ignore != null)
				msgs = ((InternalEObject)newTags_45ignore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.REF_TAGS_45IGNORE__TAGS_45IGNORE, null, msgs);
			msgs = basicSetTags_45ignore(newTags_45ignore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.REF_TAGS_45IGNORE__TAGS_45IGNORE, newTags_45ignore, newTags_45ignore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.REF_TAGS_45IGNORE__TAGS_45IGNORE:
				return basicSetTags_45ignore(null, msgs);
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
			case GithubwfPackage.REF_TAGS_45IGNORE__TAGS_45IGNORE:
				return getTags_45ignore();
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
			case GithubwfPackage.REF_TAGS_45IGNORE__TAGS_45IGNORE:
				setTags_45ignore((Branch)newValue);
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
			case GithubwfPackage.REF_TAGS_45IGNORE__TAGS_45IGNORE:
				setTags_45ignore((Branch)null);
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
			case GithubwfPackage.REF_TAGS_45IGNORE__TAGS_45IGNORE:
				return tags_45ignore != null;
		}
		return super.eIsSet(featureID);
	}

} //RefTags_45ignoreImpl
