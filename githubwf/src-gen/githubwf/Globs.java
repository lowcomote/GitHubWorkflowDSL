/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Globs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Globs#getGlobs <em>Globs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGlobs()
 * @model annotation="Type Type='array'"
 * @generated
 */
public interface Globs extends EObject {
	/**
	 * Returns the value of the '<em><b>Globs</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GlobsItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Globs</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGlobs_Globs()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<GlobsItems> getGlobs();

} // Globs
