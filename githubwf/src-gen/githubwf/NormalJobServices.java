/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Services</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobServices#getServices <em>Services</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobServices()
 * @model annotation="Type Type='object'"
 *        annotation="Description Description='Additional containers to host services for a job in a workflow. These are useful for creating databases or cache services like redis. The runner on the virtual machine will automatically create a network and manage the life cycle of the service containers.\nWhen you use a service container for a job or your step uses container actions, you don\'t need to set port information to access the service. Docker automatically exposes all ports between containers on the same network.\nWhen both the job and the action run in a container, you can directly reference the container by its hostname. The hostname is automatically mapped to the service name.\nWhen a step does not use a container action, you must access the service using localhost and bind the ports.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idservices'"
 * @generated
 */
public interface NormalJobServices extends NormalJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobServicesPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobServices_Services()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='services'"
	 * @generated
	 */
	EList<NormalJobServicesPropertiesAbstract> getServices();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // NormalJobServices
