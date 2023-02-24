/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Volumes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ContainerVolumes#getVolumes <em>Volumes</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getContainerVolumes()
 * @model annotation="Type Type='array'"
 *        annotation="Description Description='Sets an array of volumes for the container to use. You can use volumes to share data between services or other steps in a job. You can specify named Docker volumes, anonymous Docker volumes, or bind mounts on the host.\nTo specify a volume, you specify the source and destination path: &lt;source&gt;:&lt;destinationPath&gt;\nThe &lt;source&gt; is a volume name or an absolute path on the host machine, and &lt;destinationPath&gt; is an absolute path in the container.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idcontainervolumes'"
 * @generated
 */
public interface ContainerVolumes extends ContainerPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ContainerVolumesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getContainerVolumes_Volumes()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='volumes'"
	 * @generated
	 */
	EList<ContainerVolumesItems> getVolumes();

} // ContainerVolumes
