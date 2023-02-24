/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.Path;
import githubwf.RefPaths_45ignore;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Paths 45ignore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.RefPaths_45ignoreImpl#getPaths_45ignore <em>Paths 45ignore</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefPaths_45ignoreImpl extends RefPropertiesAbstractImpl implements RefPaths_45ignore {
	/**
	 * The cached value of the '{@link #getPaths_45ignore() <em>Paths 45ignore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPaths_45ignore()
	 * @generated
	 * @ordered
	 */
	protected Path paths_45ignore;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefPaths_45ignoreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getRefPaths_45ignore();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getPaths_45ignore() {
		return paths_45ignore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPaths_45ignore(Path newPaths_45ignore, NotificationChain msgs) {
		Path oldPaths_45ignore = paths_45ignore;
		paths_45ignore = newPaths_45ignore;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.REF_PATHS_45IGNORE__PATHS_45IGNORE, oldPaths_45ignore, newPaths_45ignore);
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
	public void setPaths_45ignore(Path newPaths_45ignore) {
		if (newPaths_45ignore != paths_45ignore) {
			NotificationChain msgs = null;
			if (paths_45ignore != null)
				msgs = ((InternalEObject)paths_45ignore).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.REF_PATHS_45IGNORE__PATHS_45IGNORE, null, msgs);
			if (newPaths_45ignore != null)
				msgs = ((InternalEObject)newPaths_45ignore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.REF_PATHS_45IGNORE__PATHS_45IGNORE, null, msgs);
			msgs = basicSetPaths_45ignore(newPaths_45ignore, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.REF_PATHS_45IGNORE__PATHS_45IGNORE, newPaths_45ignore, newPaths_45ignore));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.REF_PATHS_45IGNORE__PATHS_45IGNORE:
				return basicSetPaths_45ignore(null, msgs);
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
			case GithubwfPackage.REF_PATHS_45IGNORE__PATHS_45IGNORE:
				return getPaths_45ignore();
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
			case GithubwfPackage.REF_PATHS_45IGNORE__PATHS_45IGNORE:
				setPaths_45ignore((Path)newValue);
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
			case GithubwfPackage.REF_PATHS_45IGNORE__PATHS_45IGNORE:
				setPaths_45ignore((Path)null);
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
			case GithubwfPackage.REF_PATHS_45IGNORE__PATHS_45IGNORE:
				return paths_45ignore != null;
		}
		return super.eIsSet(featureID);
	}

} //RefPaths_45ignoreImpl
