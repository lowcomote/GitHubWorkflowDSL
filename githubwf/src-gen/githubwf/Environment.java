/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Environment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Environment#getEnvironment <em>Environment</em>}</li>
 *   <li>{@link githubwf.Environment#getName <em>Name</em>}</li>
 *   <li>{@link githubwf.Environment#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getEnvironment()
 * @model annotation="Type Type='object'"
 *        annotation="Description Description='The environment that the job references'"
 *        annotation="Comment Comment='https://docs.github.com/en/free-pro-team@latest/actions/reference/workflow-syntax-for-github-actions#jobsjob_idenvironment'"
 * @generated
 */
public interface Environment extends EObject {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.EnvironmentPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getEnvironment_Environment()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvironmentPropertiesAbstract> getEnvironment();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see githubwf.GithubwfPackage#getEnvironment_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' attribute.
	 * @see githubwf.GithubwfPackage#getEnvironment_Url()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getUrl();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // Environment
