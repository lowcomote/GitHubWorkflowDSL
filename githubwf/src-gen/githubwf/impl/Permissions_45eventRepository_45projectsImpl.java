/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.Permissions_45eventRepository_45projects;
import githubwf.Permissions_45level;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Permissions 45event Repository 45projects</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.Permissions_45eventRepository_45projectsImpl#getRepository_45projects <em>Repository 45projects</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Permissions_45eventRepository_45projectsImpl extends Permissions_45eventPropertiesAbstractImpl implements Permissions_45eventRepository_45projects {
	/**
	 * The cached value of the '{@link #getRepository_45projects() <em>Repository 45projects</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRepository_45projects()
	 * @generated
	 * @ordered
	 */
	protected Permissions_45level repository_45projects;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Permissions_45eventRepository_45projectsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getPermissions_45eventRepository_45projects();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getRepository_45projects() {
		return repository_45projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRepository_45projects(Permissions_45level newRepository_45projects, NotificationChain msgs) {
		Permissions_45level oldRepository_45projects = repository_45projects;
		repository_45projects = newRepository_45projects;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.PERMISSIONS_45EVENT_REPOSITORY_45PROJECTS__REPOSITORY_45PROJECTS, oldRepository_45projects, newRepository_45projects);
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
	public void setRepository_45projects(Permissions_45level newRepository_45projects) {
		if (newRepository_45projects != repository_45projects) {
			NotificationChain msgs = null;
			if (repository_45projects != null)
				msgs = ((InternalEObject)repository_45projects).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.PERMISSIONS_45EVENT_REPOSITORY_45PROJECTS__REPOSITORY_45PROJECTS, null, msgs);
			if (newRepository_45projects != null)
				msgs = ((InternalEObject)newRepository_45projects).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.PERMISSIONS_45EVENT_REPOSITORY_45PROJECTS__REPOSITORY_45PROJECTS, null, msgs);
			msgs = basicSetRepository_45projects(newRepository_45projects, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.PERMISSIONS_45EVENT_REPOSITORY_45PROJECTS__REPOSITORY_45PROJECTS, newRepository_45projects, newRepository_45projects));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.PERMISSIONS_45EVENT_REPOSITORY_45PROJECTS__REPOSITORY_45PROJECTS:
				return basicSetRepository_45projects(null, msgs);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_REPOSITORY_45PROJECTS__REPOSITORY_45PROJECTS:
				return getRepository_45projects();
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
			case GithubwfPackage.PERMISSIONS_45EVENT_REPOSITORY_45PROJECTS__REPOSITORY_45PROJECTS:
				setRepository_45projects((Permissions_45level)newValue);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_REPOSITORY_45PROJECTS__REPOSITORY_45PROJECTS:
				setRepository_45projects((Permissions_45level)null);
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
			case GithubwfPackage.PERMISSIONS_45EVENT_REPOSITORY_45PROJECTS__REPOSITORY_45PROJECTS:
				return repository_45projects != null;
		}
		return super.eIsSet(featureID);
	}

} //Permissions_45eventRepository_45projectsImpl
