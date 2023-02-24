/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Jobs Pattern Properties0 Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootJobsPatternProperties0TypeObject#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootJobsPatternProperties0TypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface GithubwfRootJobsPatternProperties0TypeObject extends GithubwfRootJobsPatternProperties0Abstract {
	/**
	 * Returns the value of the '<em><b>Pattern Properties0</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootJobsPatternProperties0PropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Properties0</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootJobsPatternProperties0TypeObject_PatternProperties0()
	 * @model containment="true"
	 * @generated
	 */
	EList<GithubwfRootJobsPatternProperties0PropertiesAbstract> getPatternProperties0();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GithubwfRootJobsPatternProperties0TypeObject
