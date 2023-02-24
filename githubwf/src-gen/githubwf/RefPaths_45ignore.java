/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Paths 45ignore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefPaths_45ignore#getPaths_45ignore <em>Paths 45ignore</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefPaths_45ignore()
 * @model
 * @generated
 */
public interface RefPaths_45ignore extends RefPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Paths 45ignore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paths 45ignore</em>' containment reference.
	 * @see #setPaths_45ignore(Path)
	 * @see githubwf.GithubwfPackage#getRefPaths_45ignore_Paths_45ignore()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='paths-ignore'"
	 * @generated
	 */
	Path getPaths_45ignore();

	/**
	 * Sets the value of the '{@link githubwf.RefPaths_45ignore#getPaths_45ignore <em>Paths 45ignore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Paths 45ignore</em>' containment reference.
	 * @see #getPaths_45ignore()
	 * @generated
	 */
	void setPaths_45ignore(Path value);

} // RefPaths_45ignore
