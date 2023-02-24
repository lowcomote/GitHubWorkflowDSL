/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Pull request target Pattern Properties0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0#getKey <em>Key</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0()
 * @model annotation="PatternProperties PatternProperties='true' pattern='^(branche|tag|path)s(-ignore)?$'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Pull_request_targetPatternProperties0 extends GithubwfRootOnOneOf2Pull_request_targetPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0#getKey <em>Key</em>}' attribute.
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
	 * @see #setPatternProperties0(GithubwfRootOnOneOf2Pull_request_targetPatternProperties0Abstract)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0_PatternProperties0()
	 * @model containment="true" required="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2Pull_request_targetPatternProperties0Abstract getPatternProperties0();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0#getPatternProperties0 <em>Pattern Properties0</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pattern Properties0</em>' containment reference.
	 * @see #getPatternProperties0()
	 * @generated
	 */
	void setPatternProperties0(GithubwfRootOnOneOf2Pull_request_targetPatternProperties0Abstract value);

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

} // GithubwfRootOnOneOf2Pull_request_targetPatternProperties0
