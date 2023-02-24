/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobContainer#getContainer <em>Container</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobContainer()
 * @model annotation="Description Description='A container to run any steps in a job that don\'t already specify a container. If you have steps that use both script and container actions, the container actions will run as sibling containers on the same network with the same volume mounts.\nIf you do not set a container, all steps will run directly on the host specified by runs-on unless a step refers to an action configured to run in a container.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idcontainer'"
 * @generated
 */
public interface NormalJobContainer extends NormalJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference.
	 * @see #setContainer(NormalJobContainerAbstract)
	 * @see githubwf.GithubwfPackage#getNormalJobContainer_Container()
	 * @model containment="true" required="true"
	 * @generated
	 */
	NormalJobContainerAbstract getContainer();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobContainer#getContainer <em>Container</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Container</em>' containment reference.
	 * @see #getContainer()
	 * @generated
	 */
	void setContainer(NormalJobContainerAbstract value);

} // NormalJobContainer
