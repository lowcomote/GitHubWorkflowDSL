/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1#getItems <em>Items</em>}</li>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1#getId <em>Id</em>}</li>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1#getIf_ <em>If </em>}</li>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1#getName <em>Name</em>}</li>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1#getUses <em>Uses</em>}</li>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1#getRun <em>Run</em>}</li>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1#getWorking_45directory <em>Working 45directory</em>}</li>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1#getShell <em>Shell</em>}</li>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1#getWith <em>With</em>}</li>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1#getEnv <em>Env</em>}</li>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1#getContinue_45on_45error <em>Continue 45on 45error</em>}</li>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf1#getTimeout_45minutes <em>Timeout 45minutes</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface NormalJobStepsItemsAllOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobStepsItemsAllOf1PropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<NormalJobStepsItemsAllOf1PropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1_Id()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getId();

	/**
	 * Returns the value of the '<em><b>If </b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>If </em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1_If_()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	NormalJobStepsItemsAllOf1IfAbstract getIf_();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1_Name()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Uses</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uses</em>' attribute.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1_Uses()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getUses();

	/**
	 * Returns the value of the '<em><b>Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run</em>' attribute.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1_Run()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getRun();

	/**
	 * Returns the value of the '<em><b>Working 45directory</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Working 45directory</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1_Working_45directory()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Working_45directory getWorking_45directory();

	/**
	 * Returns the value of the '<em><b>Shell</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Shell</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1_Shell()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Shell getShell();

	/**
	 * Returns the value of the '<em><b>With</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>With</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1_With()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Env getWith();

	/**
	 * Returns the value of the '<em><b>Env</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1_Env()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Env getEnv();

	/**
	 * Returns the value of the '<em><b>Continue 45on 45error</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Continue 45on 45error</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1_Continue_45on_45error()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	NormalJobStepsItemsAllOf1Continue_45on_45errorAbstract getContinue_45on_45error();

	/**
	 * Returns the value of the '<em><b>Timeout 45minutes</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Timeout 45minutes</em>' attribute.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf1_Timeout_45minutes()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Double getTimeout_45minutes();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // NormalJobStepsItemsAllOf1
