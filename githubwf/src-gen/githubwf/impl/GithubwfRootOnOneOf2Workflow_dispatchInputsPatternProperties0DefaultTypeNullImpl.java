/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull;

import jsonMM.NullValue;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default Type Null</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNullImpl#getDefault_ <em>Default </em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNullImpl extends GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstractImpl implements GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull {
	/**
	 * The cached value of the '{@link #getDefault_() <em>Default </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_()
	 * @generated
	 * @ordered
	 */
	protected NullValue default_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNullImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NullValue getDefault_() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault_(NullValue newDefault_, NotificationChain msgs) {
		NullValue oldDefault_ = default_;
		default_ = newDefault_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_NULL__DEFAULT_, oldDefault_, newDefault_);
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
	public void setDefault_(NullValue newDefault_) {
		if (newDefault_ != default_) {
			NotificationChain msgs = null;
			if (default_ != null)
				msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_NULL__DEFAULT_, null, msgs);
			if (newDefault_ != null)
				msgs = ((InternalEObject)newDefault_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_NULL__DEFAULT_, null, msgs);
			msgs = basicSetDefault_(newDefault_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_NULL__DEFAULT_, newDefault_, newDefault_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_NULL__DEFAULT_:
				return basicSetDefault_(null, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_NULL__DEFAULT_:
				return getDefault_();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_NULL__DEFAULT_:
				setDefault_((NullValue)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_NULL__DEFAULT_:
				setDefault_((NullValue)null);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_NULL__DEFAULT_:
				return default_ != null;
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNullImpl
