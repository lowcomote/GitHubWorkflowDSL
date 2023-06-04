/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1 With Args</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1WithArgs#getArgs <em>Args</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1WithArgs()
 * @model annotation="Type Type='string'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idstepswithargs'"
 * @generated
 */
public interface NormalJobStepsItemsAllOf1WithArgs extends EObject {
	/**
	 * Returns the value of the '<em><b>Args</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Args</em>' attribute.
	 * @see #setArgs(String)
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1WithArgs_Args()
	 * @model required="true"
	 *        annotation="Keyword Keyword='args'"
	 * @generated
	 */
	String getArgs();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStepsItemsAllOf1WithArgs#getArgs <em>Args</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Args</em>' attribute.
	 * @see #getArgs()
	 * @generated
	 */
	void setArgs(String value);

} // NormalJobStepsItemsAllOf1WithArgs
