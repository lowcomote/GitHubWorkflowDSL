/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Runs 45on Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobRuns_45onTypeObject#getRuns_45on <em>Runs 45on</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface NormalJobRuns_45onTypeObject extends NormalJobRuns_45onAbstract {
	/**
	 * Returns the value of the '<em><b>Runs 45on</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobRuns_45onPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs 45on</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onTypeObject_Runs_45on()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='runs-on'"
	 * @generated
	 */
	EList<NormalJobRuns_45onPropertiesAbstract> getRuns_45on();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // NormalJobRuns_45onTypeObject
