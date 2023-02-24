/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Branches</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.RefBranches#getBranches <em>Branches</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getRefBranches()
 * @model
 * @generated
 */
public interface RefBranches extends RefPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Branches</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branches</em>' containment reference.
	 * @see #setBranches(Branch)
	 * @see githubwf.GithubwfPackage#getRefBranches_Branches()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='branches'"
	 * @generated
	 */
	Branch getBranches();

	/**
	 * Sets the value of the '{@link githubwf.RefBranches#getBranches <em>Branches</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Branches</em>' containment reference.
	 * @see #getBranches()
	 * @generated
	 */
	void setBranches(Branch value);

} // RefBranches
