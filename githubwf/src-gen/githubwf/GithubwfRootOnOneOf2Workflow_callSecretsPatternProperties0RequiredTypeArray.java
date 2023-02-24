/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow call Secrets Pattern Properties0 Required Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray#getRequired <em>Required</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray extends GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstract {
	/**
	 * Returns the value of the '<em><b>Required</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Required</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray_Required()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='required'"
	 * @generated
	 */
	EList<GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems> getRequired();

} // GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray
