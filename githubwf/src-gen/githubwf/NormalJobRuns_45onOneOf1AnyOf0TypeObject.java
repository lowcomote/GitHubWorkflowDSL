/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Runs 45on One Of1 Any Of0 Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeObject#getRuns_45on <em>Runs 45on</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1AnyOf0TypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface NormalJobRuns_45onOneOf1AnyOf0TypeObject extends NormalJobRuns_45onOneOf1AnyOf0Abstract {
	/**
	 * Returns the value of the '<em><b>Runs 45on</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobRuns_45onOneOf1AnyOf0PropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Runs 45on</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobRuns_45onOneOf1AnyOf0TypeObject_Runs_45on()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='runs-on'"
	 * @generated
	 */
	EList<NormalJobRuns_45onOneOf1AnyOf0PropertiesAbstract> getRuns_45on();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // NormalJobRuns_45onOneOf1AnyOf0TypeObject
