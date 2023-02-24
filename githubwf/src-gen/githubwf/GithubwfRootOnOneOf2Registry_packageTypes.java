/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Registry package Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2Registry_packageTypes#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Registry_packageTypes()
 * @model annotation="Default Default='[published,updated]'"
 * @generated
 */
public interface GithubwfRootOnOneOf2Registry_packageTypes extends GithubwfRootOnOneOf2Registry_packagePropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(Types)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2Registry_packageTypes_Types()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='types'"
	 * @generated
	 */
	Types getTypes();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2Registry_packageTypes#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(Types value);

} // GithubwfRootOnOneOf2Registry_packageTypes
