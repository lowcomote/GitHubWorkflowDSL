/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Jobs Pattern Properties0 Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootJobsPatternProperties0TypeArray#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootJobsPatternProperties0TypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface GithubwfRootJobsPatternProperties0TypeArray extends GithubwfRootJobsPatternProperties0Abstract {
	/**
	 * Returns the value of the '<em><b>Pattern Properties0</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootJobsPatternProperties0Items}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Properties0</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootJobsPatternProperties0TypeArray_PatternProperties0()
	 * @model containment="true"
	 * @generated
	 */
	EList<GithubwfRootJobsPatternProperties0Items> getPatternProperties0();

} // GithubwfRootJobsPatternProperties0TypeArray
