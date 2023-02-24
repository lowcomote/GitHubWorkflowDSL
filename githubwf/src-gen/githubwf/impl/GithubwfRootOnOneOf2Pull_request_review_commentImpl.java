/**
 */
package githubwf.impl;

import githubwf.EventObject;
import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Pull_request_review_comment;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Pull request review comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Pull_request_review_commentImpl#getPull_request_review_comment <em>Pull request review comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Pull_request_review_commentImpl extends GithubwfRootOnOneOf2PropertiesAbstractImpl implements GithubwfRootOnOneOf2Pull_request_review_comment {
	/**
	 * The cached value of the '{@link #getPull_request_review_comment() <em>Pull request review comment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPull_request_review_comment()
	 * @generated
	 * @ordered
	 */
	protected EventObject pull_request_review_comment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Pull_request_review_commentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Pull_request_review_comment();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getPull_request_review_comment() {
		return pull_request_review_comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPull_request_review_comment(EventObject newPull_request_review_comment, NotificationChain msgs) {
		EventObject oldPull_request_review_comment = pull_request_review_comment;
		pull_request_review_comment = newPull_request_review_comment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW_COMMENT__PULL_REQUEST_REVIEW_COMMENT, oldPull_request_review_comment, newPull_request_review_comment);
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
	public void setPull_request_review_comment(EventObject newPull_request_review_comment) {
		if (newPull_request_review_comment != pull_request_review_comment) {
			NotificationChain msgs = null;
			if (pull_request_review_comment != null)
				msgs = ((InternalEObject)pull_request_review_comment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW_COMMENT__PULL_REQUEST_REVIEW_COMMENT, null, msgs);
			if (newPull_request_review_comment != null)
				msgs = ((InternalEObject)newPull_request_review_comment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW_COMMENT__PULL_REQUEST_REVIEW_COMMENT, null, msgs);
			msgs = basicSetPull_request_review_comment(newPull_request_review_comment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW_COMMENT__PULL_REQUEST_REVIEW_COMMENT, newPull_request_review_comment, newPull_request_review_comment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW_COMMENT__PULL_REQUEST_REVIEW_COMMENT:
				return basicSetPull_request_review_comment(null, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW_COMMENT__PULL_REQUEST_REVIEW_COMMENT:
				return getPull_request_review_comment();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW_COMMENT__PULL_REQUEST_REVIEW_COMMENT:
				setPull_request_review_comment((EventObject)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW_COMMENT__PULL_REQUEST_REVIEW_COMMENT:
				setPull_request_review_comment((EventObject)null);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW_COMMENT__PULL_REQUEST_REVIEW_COMMENT:
				return pull_request_review_comment != null;
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootOnOneOf2Pull_request_review_commentImpl
