/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Defaults</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Defaults#getDefaults <em>Defaults</em>}</li>
 *   <li>{@link githubwf.Defaults#getRun <em>Run</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getDefaults()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface Defaults extends EObject {
	/**
	 * Returns the value of the '<em><b>Defaults</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.DefaultsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Defaults</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getDefaults_Defaults()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<DefaultsPropertiesAbstract> getDefaults();

	/**
	 * Returns the value of the '<em><b>Run</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run</em>' reference.
	 * @see githubwf.GithubwfPackage#getDefaults_Run()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	DefaultsRun getRun();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // Defaults
