/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Branches 45ignore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefBranches_45ignore#getBranches_45ignore <em>Branches 45ignore</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefBranches_45ignore()
 * @model
 * @generated
 */
public interface RefBranches_45ignore extends RefPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Branches 45ignore</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches 45ignore</em>' containment reference.
	 * @see #setBranches_45ignore(Branch)
	 * @see githubwf.GithubwfPackage#getRefBranches_45ignore_Branches_45ignore()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='branches-ignore'"
	 * @generated
	 */
	Branch getBranches_45ignore();

	/**
	 * Sets the value of the '{@link githubwf.RefBranches_45ignore#getBranches_45ignore <em>Branches 45ignore</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branches 45ignore</em>' containment reference.
	 * @see #getBranches_45ignore()
	 * @generated
	 */
	void setBranches_45ignore(Branch value);

} // RefBranches_45ignore
