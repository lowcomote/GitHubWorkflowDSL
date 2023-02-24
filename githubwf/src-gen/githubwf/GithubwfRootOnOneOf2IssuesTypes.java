/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Issues Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2IssuesTypes#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2IssuesTypes()
 * @model annotation="Default Default='[opened,edited,deleted,transferred,pinned,unpinned,closed,reopened,assigned,unassigned,labeled,unlabeled,locked,unlocked,milestoned,demilestoned]'"
 * @generated
 */
public interface GithubwfRootOnOneOf2IssuesTypes extends GithubwfRootOnOneOf2IssuesPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(Types)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2IssuesTypes_Types()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='types'"
	 * @generated
	 */
	Types getTypes();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2IssuesTypes#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(Types value);

} // GithubwfRootOnOneOf2IssuesTypes
