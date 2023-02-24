/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Deployment status</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Deployment_status#getDeployment_status <em>Deployment status</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Deployment_status()
 * @model annotation="Description Description='Runs your workflow anytime a third party provides a deployment status, which triggers the deployment_status event. Deployments created with a commit SHA may not have a Git ref. For information about the REST API, see https://developer.github.com/v3/repos/deployments/#create-a-deployment-status.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/events-that-trigger-workflows#deployment-status-event-deployment_status'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Deployment_status extends GithubwfRootOnOneOf2PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Deployment status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment status</em>' containment reference.
	 * @see #setDeployment_status(EventObject)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Deployment_status_Deployment_status()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='deployment_status'"
	 * @generated
	 */
	EventObject getDeployment_status();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Deployment_status#getDeployment_status <em>Deployment status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deployment status</em>' containment reference.
	 * @see #getDeployment_status()
	 * @generated
	 */
	void setDeployment_status(EventObject value);

} // GithubwfRootOnOneOf2Deployment_status
