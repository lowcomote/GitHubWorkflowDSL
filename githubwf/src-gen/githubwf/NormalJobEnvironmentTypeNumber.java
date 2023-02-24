/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Environment Type Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobEnvironmentTypeNumber#getEnvironment <em>Environment</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobEnvironmentTypeNumber()
 * @model annotation="ArrayOfTypes ArrayOfTypes='number'"
 * @generated
 */
public interface NormalJobEnvironmentTypeNumber extends NormalJobEnvironmentAbstract {
	/**
	 * Returns the value of the '<em><b>Environment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Environment</em>' attribute.
	 * @see #setEnvironment(Double)
	 * @see githubwf.GithubwfPackage#getNormalJobEnvironmentTypeNumber_Environment()
	 * @model required="true"
	 *        annotation="Keyword Keyword='environment'"
	 * @generated
	 */
	Double getEnvironment();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobEnvironmentTypeNumber#getEnvironment <em>Environment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Environment</em>' attribute.
	 * @see #getEnvironment()
	 * @generated
	 */
	void setEnvironment(Double value);

} // NormalJobEnvironmentTypeNumber
