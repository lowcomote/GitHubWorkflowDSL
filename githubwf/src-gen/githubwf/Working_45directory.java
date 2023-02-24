/**
 */
package githubwf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Working 45directory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Working_45directory#getWorking_45directory <em>Working 45directory</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getWorking_45directory()
 * @model annotation="Type Type='string'"
 *        annotation="Description Description='Using the working-directory keyword, you can specify the working directory of where to run the command.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjob_idstepsrun'"
 * @generated
 */
public interface Working_45directory extends EObject {
	/**
	 * Returns the value of the '<em><b>Working 45directory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working 45directory</em>' attribute.
	 * @see #setWorking_45directory(String)
	 * @see githubwf.GithubwfPackage#getWorking_45directory_Working_45directory()
	 * @model required="true"
	 * @generated
	 */
	String getWorking_45directory();

	/**
	 * Sets the value of the '{@link githubwf.Working_45directory#getWorking_45directory <em>Working 45directory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Working 45directory</em>' attribute.
	 * @see #getWorking_45directory()
	 * @generated
	 */
	void setWorking_45directory(String value);

} // Working_45directory
