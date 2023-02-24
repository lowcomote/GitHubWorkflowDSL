/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Jobs Pattern Properties0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootJobsPatternProperties0#getKey <em>Key</em>}</li>
 *   <li>{@link githubwf.GithubwfRootJobsPatternProperties0#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootJobsPatternProperties0()
 * @model annotation="PatternProperties PatternProperties='true' pattern='^[_a-zA-Z][a-zA-Z0-9_-]*$'"
 * @generated
 */
public interface GithubwfRootJobsPatternProperties0 extends GithubwfRootJobsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see githubwf.GithubwfPackage#getGithubwfRootJobsPatternProperties0_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootJobsPatternProperties0#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Pattern Properties0</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Properties0</em>' containment reference.
	 * @see #setPatternProperties0(GithubwfRootJobsPatternProperties0Abstract)
	 * @see githubwf.GithubwfPackage#getGithubwfRootJobsPatternProperties0_PatternProperties0()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GithubwfRootJobsPatternProperties0Abstract getPatternProperties0();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootJobsPatternProperties0#getPatternProperties0 <em>Pattern Properties0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Properties0</em>' containment reference.
	 * @see #getPatternProperties0()
	 * @generated
	 */
	void setPatternProperties0(GithubwfRootJobsPatternProperties0Abstract value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" toBeEvaluatedRequired="true"
	 * @generated
	 */
	boolean find(String toBeEvaluated);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean find();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String validateKeyOnDefinedPatternProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String validateKeyOnDefinedProperties();

} // GithubwfRootJobsPatternProperties0
