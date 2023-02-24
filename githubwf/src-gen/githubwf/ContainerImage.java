/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Image</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ContainerImage#getImage <em>Image</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getContainerImage()
 * @model annotation="Type Type='string'"
 *        annotation="Description Description='The Docker image to use as the container to run the action. The value can be the Docker Hub image name or a registry name.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idcontainerimage'"
 * @generated
 */
public interface ContainerImage extends ContainerPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see #setImage(String)
	 * @see githubwf.GithubwfPackage#getContainerImage_Image()
	 * @model required="true"
	 *        annotation="Keyword Keyword='image'"
	 * @generated
	 */
	String getImage();

	/**
	 * Sets the value of the '{@link githubwf.ContainerImage#getImage <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Image</em>' attribute.
	 * @see #getImage()
	 * @generated
	 */
	void setImage(String value);

} // ContainerImage
