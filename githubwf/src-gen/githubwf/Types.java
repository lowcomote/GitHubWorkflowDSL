/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Types</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.Types#getTypes <em>Types</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getTypes()
 * @model annotation="Type Type='array'"
 *        annotation="Description Description='Selects the types of activity that will trigger a workflow run. Most GitHub events are triggered by more than one type of activity. For example, the event for the release resource is triggered when a release is published, unpublished, created, edited, deleted, or prereleased. The types keyword enables you to narrow down activity that causes the workflow to run. When only one activity type triggers a webhook event, the types keyword is unnecessary.\nYou can use an array of event types. For more information about each event and their activity types, see https://help.github.com/en/articles/events-that-trigger-workflows#webhook-events.'"
 *        annotation="Comment Comment='https://help.github.com/en/github/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#onevent_nametypes'"
 * @generated
 */
public interface Types extends EObject {
	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.TypesItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getTypes_Types()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TypesItems> getTypes();

} // Types
