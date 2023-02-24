/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2 Schedule Items Type Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeObject#getItems <em>Items</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeObject#getCron <em>Cron</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2ScheduleItemsTypeObject()
 * @model annotation="ArrayOfTypes ArrayOfTypes='object'"
 * @generated
 */
public interface GithubwfRootOnOneOf2ScheduleItemsTypeObject extends GithubwfRootOnOneOf2ScheduleItemsAbstract {
	/**
	 * Returns the value of the '<em><b>Items</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Items</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2ScheduleItemsTypeObject_Items()
	 * @model containment="true"
	 * @generated
	 */
	EList<GithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract> getItems();

	/**
	 * Returns the value of the '<em><b>Cron</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cron</em>' attribute.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2ScheduleItemsTypeObject_Cron()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	String getCron();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GithubwfRootOnOneOf2ScheduleItemsTypeObject
