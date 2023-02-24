/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Deployment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Deployment#getDeployment <em>Deployment</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Deployment()
 * @model annotation="Description Description='Runs your workflow anytime someone creates a deployment, which triggers the deployment event. Deployments created with a commit SHA may not have a Git ref. For information about the REST API, see https://developer.github.com/v3/repos/deployments/.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#deployment-event-deployment'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Deployment extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' containment reference.
	 * @see #setDeployment(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Deployment_Deployment()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='deployment'"
	 * @generated
	 */
	EventObject getDeployment();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Deployment#getDeployment <em>Deployment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment</em>' containment reference.
	 * @see #getDeployment()
	 * @generated
	 */
	void setDeployment(EventObject value);

} // GithubwfRootOnOneOf2Deployment
