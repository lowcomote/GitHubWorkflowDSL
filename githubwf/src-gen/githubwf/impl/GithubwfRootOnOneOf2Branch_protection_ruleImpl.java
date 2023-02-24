/**
 */
package githubwf.impl;

import githubwf.EventObject;
import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Branch_protection_rule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2 Branch protection rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Branch_protection_ruleImpl#getBranch_protection_rule <em>Branch protection rule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Branch_protection_ruleImpl extends GithubwfRootOnOneOf2PropertiesAbstractImpl implements GithubwfRootOnOneOf2Branch_protection_rule {
	/**
	 * The cached value of the '{@link #getBranch_protection_rule() <em>Branch protection rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBranch_protection_rule()
	 * @generated
	 * @ordered
	 */
	protected EventObject branch_protection_rule;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Branch_protection_ruleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Branch_protection_rule();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getBranch_protection_rule() {
		return branch_protection_rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBranch_protection_rule(EventObject newBranch_protection_rule, NotificationChain msgs) {
		EventObject oldBranch_protection_rule = branch_protection_rule;
		branch_protection_rule = newBranch_protection_rule;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_BRANCH_PROTECTION_RULE__BRANCH_PROTECTION_RULE, oldBranch_protection_rule, newBranch_protection_rule);
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
	public void setBranch_protection_rule(EventObject newBranch_protection_rule) {
		if (newBranch_protection_rule != branch_protection_rule) {
			NotificationChain msgs = null;
			if (branch_protection_rule != null)
				msgs = ((InternalEObject)branch_protection_rule).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_BRANCH_PROTECTION_RULE__BRANCH_PROTECTION_RULE, null, msgs);
			if (newBranch_protection_rule != null)
				msgs = ((InternalEObject)newBranch_protection_rule).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_BRANCH_PROTECTION_RULE__BRANCH_PROTECTION_RULE, null, msgs);
			msgs = basicSetBranch_protection_rule(newBranch_protection_rule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_BRANCH_PROTECTION_RULE__BRANCH_PROTECTION_RULE, newBranch_protection_rule, newBranch_protection_rule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_BRANCH_PROTECTION_RULE__BRANCH_PROTECTION_RULE:
				return basicSetBranch_protection_rule(null, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_BRANCH_PROTECTION_RULE__BRANCH_PROTECTION_RULE:
				return getBranch_protection_rule();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_BRANCH_PROTECTION_RULE__BRANCH_PROTECTION_RULE:
				setBranch_protection_rule((EventObject)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_BRANCH_PROTECTION_RULE__BRANCH_PROTECTION_RULE:
				setBranch_protection_rule((EventObject)null);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_BRANCH_PROTECTION_RULE__BRANCH_PROTECTION_RULE:
				return branch_protection_rule != null;
		}
		return super.eIsSet(featureID);
	}

} //GithubwfRootOnOneOf2Branch_protection_ruleImpl
