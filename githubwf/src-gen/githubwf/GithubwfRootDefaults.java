/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Defaults</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootDefaults#getDefaults <em>Defaults</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootDefaults()
 * @model annotation="Description Description='A map of default settings that will apply to all jobs in the workflow.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/reference/workflow-syntax-for-github-actions#defaults'"
 * @generated
 */
public interface GithubwfRootDefaults extends GithubwfRootPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Defaults</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaults</em>' containment reference.
	 * @see #setDefaults(Defaults)
	 * @see githubwf.GithubwfPackage#getGithubwfRootDefaults_Defaults()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='defaults'"
	 * @generated
	 */
	Defaults getDefaults();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootDefaults#getDefaults <em>Defaults</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Defaults</em>' containment reference.
	 * @see #getDefaults()
	 * @generated
	 */
	void setDefaults(Defaults value);

} // GithubwfRootDefaults
