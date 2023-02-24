/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Steps Items All Of0 One Of1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf0OneOf1#getItems <em>Items</em>}</li>
 *   <li>{@link githubwf.NormalJobStepsItemsAllOf0OneOf1#getRun <em>Run</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf0OneOf1()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface NormalJobStepsItemsAllOf0OneOf1 extends EObject {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobStepsItemsAllOf0OneOf1PropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf0OneOf1_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<NormalJobStepsItemsAllOf0OneOf1PropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Run</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Run</em>' attribute.
	 * @see githubwf.GithubwfPackage#getNormalJobStepsItemsAllOf0OneOf1_Run()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getRun();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // NormalJobStepsItemsAllOf0OneOf1
