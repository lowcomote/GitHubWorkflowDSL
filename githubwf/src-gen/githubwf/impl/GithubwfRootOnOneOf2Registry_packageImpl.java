/**
 */
package githubwf.impl;

import githubwf.EventObject;
import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Registry_package;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Registry package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Registry_packageImpl#getRegistry_package <em>Registry package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Registry_packageImpl extends GithubwfRootOnOneOf2PropertiesAbstractImpl implements GithubwfRootOnOneOf2Registry_package {
	/**
	 * The cached value of the '{@link #getRegistry_package() <em>Registry package</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistry_package()
	 * @generated
	 * @ordered
	 */
	protected EventObject registry_package;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Registry_packageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Registry_package();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getRegistry_package() {
		return registry_package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRegistry_package(EventObject newRegistry_package, NotificationChain msgs) {
		EventObject oldRegistry_package = registry_package;
		registry_package = newRegistry_package;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REGISTRY_PACKAGE__REGISTRY_PACKAGE, oldRegistry_package, newRegistry_package);
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
	public void setRegistry_package(EventObject newRegistry_package) {
		if (newRegistry_package != registry_package) {
			NotificationChain msgs = null;
			if (registry_package != null)
				msgs = ((InternalEObject)registry_package).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REGISTRY_PACKAGE__REGISTRY_PACKAGE, null, msgs);
			if (newRegistry_package != null)
				msgs = ((InternalEObject)newRegistry_package).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REGISTRY_PACKAGE__REGISTRY_PACKAGE, null, msgs);
			msgs = basicSetRegistry_package(newRegistry_package, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REGISTRY_PACKAGE__REGISTRY_PACKAGE, newRegistry_package, newRegistry_package));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REGISTRY_PACKAGE__REGISTRY_PACKAGE:
				return basicSetRegistry_package(null, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REGISTRY_PACKAGE__REGISTRY_PACKAGE:
				return getRegistry_package();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REGISTRY_PACKAGE__REGISTRY_PACKAGE:
				setRegistry_package((EventObject)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REGISTRY_PACKAGE__REGISTRY_PACKAGE:
				setRegistry_package((EventObject)null);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REGISTRY_PACKAGE__REGISTRY_PACKAGE:
				return registry_package != null;
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootOnOneOf2Registry_packageImpl
