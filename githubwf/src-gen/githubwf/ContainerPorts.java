/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container Ports</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ContainerPorts#getPorts <em>Ports</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getContainerPorts()
 * @model annotation="Type Type='array'"
 *        annotation="Description Description='Sets an array of ports to expose on the container.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idcontainerports'"
 * @generated
 */
public interface ContainerPorts extends ContainerPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ContainerPortsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getContainerPorts_Ports()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='ports'"
	 * @generated
	 */
	EList<ContainerPortsItems> getPorts();

} // ContainerPorts
