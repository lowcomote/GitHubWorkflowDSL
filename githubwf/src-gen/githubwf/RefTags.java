/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Tags</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefTags#getTags <em>Tags</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefTags()
 * @model
 * @generated
 */
public interface RefTags extends RefPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Tags</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tags</em>' containment reference.
	 * @see #setTags(Branch)
	 * @see githubwf.GithubwfPackage#getRefTags_Tags()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='tags'"
	 * @generated
	 */
	Branch getTags();

	/**
	 * Sets the value of the '{@link githubwf.RefTags#getTags <em>Tags</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tags</em>' containment reference.
	 * @see #getTags()
	 * @generated
	 */
	void setTags(Branch value);

} // RefTags
