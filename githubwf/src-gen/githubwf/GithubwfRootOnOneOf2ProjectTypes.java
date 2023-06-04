/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Project Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2ProjectTypes#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2ProjectTypes()
 * @model annotation="Default Default='[created,updated,closed,reopened,edited,deleted]'"
 * @generated
 */
public interface GithubwfRootOnOneOf2ProjectTypes extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference.
	 * @see #setTypes(Types)
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2ProjectTypes_Types()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='types'"
	 * @generated
	 */
	Types getTypes();

	/**
	 * Sets the value of the '{@link githubwf.GithubwfRootOnOneOf2ProjectTypes#getTypes <em>Types</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Types</em>' containment reference.
	 * @see #getTypes()
	 * @generated
	 */
	void setTypes(Types value);

} // GithubwfRootOnOneOf2ProjectTypes
