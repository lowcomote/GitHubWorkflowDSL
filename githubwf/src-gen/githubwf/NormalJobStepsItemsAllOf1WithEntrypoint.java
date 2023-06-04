/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1 With Entrypoint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1WithEntrypoint#getEntrypoint <em>Entrypoint</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1WithEntrypoint()
 * @model annotation="Type Type='string'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idstepswithentrypoint'"
 * @generated
 */
public interface NormalJobStepsItemsAllOf1WithEntrypoint extends EObject {
	/**
	 * Returns the value of the '<em><b>Entrypoint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entrypoint</em>' attribute.
	 * @see #setEntrypoint(String)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1WithEntrypoint_Entrypoint()
	 * @model required="true"
	 *        annotation="Keyword Keyword='entrypoint'"
	 * @generated
	 */
	String getEntrypoint();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsAllOf1WithEntrypoint#getEntrypoint <em>Entrypoint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entrypoint</em>' attribute.
	 * @see #getEntrypoint()
	 * @generated
	 */
	void setEntrypoint(String value);

} // NormalJobStepsItemsAllOf1WithEntrypoint
