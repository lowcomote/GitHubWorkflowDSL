/**
 */
package githubwf.impl;

import githubwf.EventObject;
import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Discussion_comment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Discussion comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Discussion_commentImpl#getDiscussion_comment <em>Discussion comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Discussion_commentImpl extends GithubwfRootOnOneOf2PropertiesAbstractImpl implements GithubwfRootOnOneOf2Discussion_comment {
	/**
	 * The cached value of the '{@link #getDiscussion_comment() <em>Discussion comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscussion_comment()
	 * @generated
	 * @ordered
	 */
	protected EventObject discussion_comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Discussion_commentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Discussion_comment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getDiscussion_comment() {
		return discussion_comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscussion_comment(EventObject newDiscussion_comment, NotificationChain msgs) {
		EventObject oldDiscussion_comment = discussion_comment;
		discussion_comment = newDiscussion_comment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION_COMMENT__DISCUSSION_COMMENT, oldDiscussion_comment, newDiscussion_comment);
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
	public void setDiscussion_comment(EventObject newDiscussion_comment) {
		if (newDiscussion_comment != discussion_comment) {
			NotificationChain msgs = null;
			if (discussion_comment != null)
				msgs = ((InternalEObject)discussion_comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION_COMMENT__DISCUSSION_COMMENT, null, msgs);
			if (newDiscussion_comment != null)
				msgs = ((InternalEObject)newDiscussion_comment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION_COMMENT__DISCUSSION_COMMENT, null, msgs);
			msgs = basicSetDiscussion_comment(newDiscussion_comment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION_COMMENT__DISCUSSION_COMMENT, newDiscussion_comment, newDiscussion_comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION_COMMENT__DISCUSSION_COMMENT:
				return basicSetDiscussion_comment(null, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION_COMMENT__DISCUSSION_COMMENT:
				return getDiscussion_comment();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION_COMMENT__DISCUSSION_COMMENT:
				setDiscussion_comment((EventObject)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION_COMMENT__DISCUSSION_COMMENT:
				setDiscussion_comment((EventObject)null);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION_COMMENT__DISCUSSION_COMMENT:
				return discussion_comment != null;
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootOnOneOf2Discussion_commentImpl
