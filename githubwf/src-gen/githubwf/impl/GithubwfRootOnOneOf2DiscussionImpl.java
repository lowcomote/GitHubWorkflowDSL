/**
 */
package githubwf.impl;

import githubwf.EventObject;
import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Discussion;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Discussion</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2DiscussionImpl#getDiscussion <em>Discussion</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2DiscussionImpl extends GithubwfRootOnOneOf2PropertiesAbstractImpl implements GithubwfRootOnOneOf2Discussion {
	/**
	 * The cached value of the '{@link #getDiscussion() <em>Discussion</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscussion()
	 * @generated
	 * @ordered
	 */
	protected EventObject discussion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2DiscussionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Discussion();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getDiscussion() {
		return discussion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscussion(EventObject newDiscussion, NotificationChain msgs) {
		EventObject oldDiscussion = discussion;
		discussion = newDiscussion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION__DISCUSSION, oldDiscussion, newDiscussion);
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
	public void setDiscussion(EventObject newDiscussion) {
		if (newDiscussion != discussion) {
			NotificationChain msgs = null;
			if (discussion != null)
				msgs = ((InternalEObject)discussion).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION__DISCUSSION, null, msgs);
			if (newDiscussion != null)
				msgs = ((InternalEObject)newDiscussion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION__DISCUSSION, null, msgs);
			msgs = basicSetDiscussion(newDiscussion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION__DISCUSSION, newDiscussion, newDiscussion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION__DISCUSSION:
				return basicSetDiscussion(null, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION__DISCUSSION:
				return getDiscussion();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION__DISCUSSION:
				setDiscussion((EventObject)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION__DISCUSSION:
				setDiscussion((EventObject)null);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION__DISCUSSION:
				return discussion != null;
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootOnOneOf2DiscussionImpl
