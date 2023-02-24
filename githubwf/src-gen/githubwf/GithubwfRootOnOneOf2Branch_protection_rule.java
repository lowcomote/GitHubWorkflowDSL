/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Branch protection rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Branch_protection_rule#getBranch_protection_rule <em>Branch protection rule</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Branch_protection_rule()
 * @model annotation="Description Description='Runs your workflow anytime the branch_protection_rule event occurs. More than one activity type triggers this event.'"
 *        annotation="Comment Comment='https://docs.github.com/en/actions/learn-github-actions/events-that-trigger-workflows#branch_protection_rule'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Branch_protection_rule extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Branch protection rule</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch protection rule</em>' containment reference.
	 * @see #setBranch_protection_rule(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Branch_protection_rule_Branch_protection_rule()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='branch_protection_rule'"
	 * @generated
	 */
	EventObject getBranch_protection_rule();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Branch_protection_rule#getBranch_protection_rule <em>Branch protection rule</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branch protection rule</em>' containment reference.
	 * @see #getBranch_protection_rule()
	 * @generated
	 */
	void setBranch_protection_rule(EventObject value);

} // GithubwfRootOnOneOf2Branch_protection_rule
