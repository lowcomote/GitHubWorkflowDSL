/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Concurrency</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Concurrency#getConcurrency <em>Concurrency</em>}</li>
 *   <li>{@link githubwf.Concurrency#getGroup <em>Group</em>}</li>
 *   <li>{@link githubwf.Concurrency#getCancel_45in_45progress <em>Cancel 45in 45progress</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getConcurrency()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface Concurrency extends EObject {
	/**
	 * Returns the value of the '<em><b>Concurrency</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ConcurrencyPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Concurrency</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getConcurrency_Concurrency()
	 * @model containment="true"
	 * @generated
	 */
	EList<ConcurrencyPropertiesAbstract> getConcurrency();

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute.
	 * @see githubwf.GithubwfPackage#getConcurrency_Group()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getGroup();

	/**
	 * Returns the value of the '<em><b>Cancel 45in 45progress</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cancel 45in 45progress</em>' reference.
	 * @see githubwf.GithubwfPackage#getConcurrency_Cancel_45in_45progress()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	ConcurrencyCancel_45in_45progressAbstract getCancel_45in_45progress();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // Concurrency
