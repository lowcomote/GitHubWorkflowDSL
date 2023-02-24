/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Runs 45on One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobRuns_45onOneOf1#getRuns_45on <em>Runs 45on</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1()
 * @model annotation="Type Type='array'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#self-hosted-runners'"
 * @generated
 */
public interface NormalJobRuns_45onOneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Runs 45on</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobRuns_45onOneOf1Items}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs 45on</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1_Runs_45on()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='runs-on'"
	 * @generated
	 */
	EList<NormalJobRuns_45onOneOf1Items> getRuns_45on();

} // NormalJobRuns_45onOneOf1
