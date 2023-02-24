/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defaults Run</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.DefaultsRun#getRun <em>Run</em>}</li>
 *   <li>{@link githubwf.DefaultsRun#getShell <em>Shell</em>}</li>
 *   <li>{@link githubwf.DefaultsRun#getWorking_45directory <em>Working 45directory</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getDefaultsRun()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface DefaultsRun extends DefaultsPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Run</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.DefaultsRunPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getDefaultsRun_Run()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='run'"
	 * @generated
	 */
	EList<DefaultsRunPropertiesAbstract> getRun();

	/**
	 * Returns the value of the '<em><b>Shell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' reference.
	 * @see githubwf.GithubwfPackage#getDefaultsRun_Shell()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Shell getShell();

	/**
	 * Returns the value of the '<em><b>Working 45directory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working 45directory</em>' reference.
	 * @see githubwf.GithubwfPackage#getDefaultsRun_Working_45directory()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Working_45directory getWorking_45directory();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // DefaultsRun
