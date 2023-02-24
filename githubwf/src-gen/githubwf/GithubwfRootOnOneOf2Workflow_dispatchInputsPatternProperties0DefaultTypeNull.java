/**
 */
package githubwf;

import jsonMM.NullValue;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default Type Null</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull#getDefault_ <em>Default </em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull()
 * @model annotation="ArrayOfTypes ArrayOfTypes='null'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull extends GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstract {
	/**
	 * Returns the value of the '<em><b>Default </b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default </em>' containment reference.
	 * @see #setDefault_(NullValue)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull_Default_()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='default'"
	 * @generated
	 */
	NullValue getDefault_();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull#getDefault_ <em>Default </em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default </em>' containment reference.
	 * @see #getDefault_()
	 * @generated
	 */
	void setDefault_(NullValue value);

} // GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull
