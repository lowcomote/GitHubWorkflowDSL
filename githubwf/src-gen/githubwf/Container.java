/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Container#getContainer <em>Container</em>}</li>
 *   <li>{@link githubwf.Container#getImage <em>Image</em>}</li>
 *   <li>{@link githubwf.Container#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link githubwf.Container#getEnv <em>Env</em>}</li>
 *   <li>{@link githubwf.Container#getPorts <em>Ports</em>}</li>
 *   <li>{@link githubwf.Container#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link githubwf.Container#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getContainer()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface Container extends EObject {
	/**
	 * Returns the value of the '<em><b>Container</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ContainerPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Container</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getContainer_Container()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainerPropertiesAbstract> getContainer();

	/**
	 * Returns the value of the '<em><b>Image</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Image</em>' attribute.
	 * @see githubwf.GithubwfPackage#getContainer_Image()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getImage();

	/**
	 * Returns the value of the '<em><b>Credentials</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credentials</em>' reference.
	 * @see githubwf.GithubwfPackage#getContainer_Credentials()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	ContainerCredentials getCredentials();

	/**
	 * Returns the value of the '<em><b>Env</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' reference.
	 * @see githubwf.GithubwfPackage#getContainer_Env()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Env getEnv();

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' reference.
	 * @see githubwf.GithubwfPackage#getContainer_Ports()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	ContainerPorts getPorts();

	/**
	 * Returns the value of the '<em><b>Volumes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Volumes</em>' reference.
	 * @see githubwf.GithubwfPackage#getContainer_Volumes()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	ContainerVolumes getVolumes();

	/**
	 * Returns the value of the '<em><b>Options</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' attribute.
	 * @see githubwf.GithubwfPackage#getContainer_Options()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getOptions();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // Container
