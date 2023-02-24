/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Options</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options()
 * @model annotation="Type Type='array'"
 *        annotation="Description Description='The options of the dropdown list, if the type is a choice.'"
 *        annotation="Comment Comment='https://github.blog/changelog/2021-11-10-github-actions-input-types-for-manual-workflows'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options extends GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0PropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Options</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Options</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options_Options()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='options'"
	 * @generated
	 */
	EList<GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItems> getOptions();

} // GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options
