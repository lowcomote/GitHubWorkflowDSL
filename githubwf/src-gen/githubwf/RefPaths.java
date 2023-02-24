/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Paths</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefPaths#getPaths <em>Paths</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefPaths()
 * @model
 * @generated
 */
public interface RefPaths extends RefPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Paths</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths</em>' containment reference.
	 * @see #setPaths(Path)
	 * @see githubwf.GithubwfPackage#getRefPaths_Paths()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='paths'"
	 * @generated
	 */
	Path getPaths();

	/**
	 * Sets the value of the '{@link githubwf.RefPaths#getPaths <em>Paths</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paths</em>' containment reference.
	 * @see #getPaths()
	 * @generated
	 */
	void setPaths(Path value);

} // RefPaths
