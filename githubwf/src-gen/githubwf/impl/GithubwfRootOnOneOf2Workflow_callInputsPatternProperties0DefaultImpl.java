/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default;
import githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstract;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Workflow call Inputs Pattern Properties0 Default</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultImpl#getDefault_ <em>Default </em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultImpl extends GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstractImpl implements GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default {
	/**
	 * The cached value of the '{@link #getDefault_() <em>Default </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefault_()
	 * @generated
	 * @ordered
	 */
	protected GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstract default_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstract getDefault_() {
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefault_(GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstract newDefault_, NotificationChain msgs) {
		GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstract oldDefault_ = default_;
		default_ = newDefault_;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT__DEFAULT_, oldDefault_, newDefault_);
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
	public void setDefault_(GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstract newDefault_) {
		if (newDefault_ != default_) {
			NotificationChain msgs = null;
			if (default_ != null)
				msgs = ((InternalEObject)default_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT__DEFAULT_, null, msgs);
			if (newDefault_ != null)
				msgs = ((InternalEObject)newDefault_).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT__DEFAULT_, null, msgs);
			msgs = basicSetDefault_(newDefault_, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT__DEFAULT_, newDefault_, newDefault_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT__DEFAULT_:
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT__DEFAULT_:
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT__DEFAULT_:
				setDefault_((GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstract)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT__DEFAULT_:
				setDefault_((GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstract)null);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT__DEFAULT_:
				return default_ != null;
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultImpl
