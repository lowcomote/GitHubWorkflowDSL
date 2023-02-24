/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Tags 45ignore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefTags_45ignore#getTags_45ignore <em>Tags 45ignore</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefTags_45ignore()
 * @model
 * @generated
 */
public interface RefTags_45ignore extends RefPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Tags 45ignore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags 45ignore</em>' containment reference.
	 * @see #setTags_45ignore(Branch)
	 * @see githubwf.GithubwfPackage#getRefTags_45ignore_Tags_45ignore()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='tags-ignore'"
	 * @generated
	 */
	Branch getTags_45ignore();

	/**
	 * Sets the value of the '{@link githubwf.RefTags_45ignore#getTags_45ignore <em>Tags 45ignore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags 45ignore</em>' containment reference.
	 * @see #getTags_45ignore()
	 * @generated
	 */
	void setTags_45ignore(Branch value);

} // RefTags_45ignore
