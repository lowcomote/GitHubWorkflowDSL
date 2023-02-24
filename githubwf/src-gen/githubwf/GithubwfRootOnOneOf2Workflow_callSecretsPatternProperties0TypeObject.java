/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call Secrets Pattern Properties0 Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject#getDescription <em>Description</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject extends GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Abstract {
	/**
	 * Returns the value of the '<em><b>Pattern Properties0</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Properties0</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject_PatternProperties0()
	 * @model containment="true"
	 * @generated
	 */
	EList<GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract> getPatternProperties0();

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject_Description()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getDescription();

	/**
	 * Returns the value of the '<em><b>Required</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject_Required()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstract getRequired();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject
