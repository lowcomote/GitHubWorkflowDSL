/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Outputs</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobOutputs#getOutputs <em>Outputs</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobOutputs()
 * @model annotation="Type Type='object'"
 *        annotation="Description Description='A map of outputs for a job. Job outputs are available to all downstream jobs that depend on this job.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/reference/workflow-syntax-for-github-actions#jobsjobs_idoutputs'"
 * @generated
 */
public interface NormalJobOutputs extends NormalJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Outputs</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobOutputsPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outputs</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobOutputs_Outputs()
	 * @model containment="true" required="true"
	 *        annotation="Keyword Keyword='outputs'"
	 * @generated
	 */
	EList<NormalJobOutputsPropertiesAbstract> getOutputs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // NormalJobOutputs
