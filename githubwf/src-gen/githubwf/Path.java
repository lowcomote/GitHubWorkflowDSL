/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Path#getPath <em>Path</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getPath()
 * @model annotation="Description Description='When using the push and pull_request events, you can configure a workflow to run when at least one file does not match paths-ignore or at least one modified file matches the configured paths. Path filters are not evaluated for pushes to tags.\nThe paths-ignore and paths keywords accept glob patterns that use the * and ** wildcard characters to match more than one path name. For more information, see https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#filter-pattern-cheat-sheet.\nYou can exclude paths using two types of filters. You cannot use both of these filters for the same event in a workflow.\n- paths-ignore - Use the paths-ignore filter when you only need to exclude path names.\n- paths - Use the paths filter when you need to filter paths for positive matches and exclude paths.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#onpushpull_requestpaths'"
 * @generated
 */
public interface Path extends EObject {
	/**
	 * Returns the value of the '<em><b>Path</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' containment reference.
	 * @see #setPath(Globs)
	 * @see githubwf.GithubwfPackage#getPath_Path()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Globs getPath();

	/**
	 * Sets the value of the '{@link githubwf.Path#getPath <em>Path</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' containment reference.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(Globs value);

} // Path
