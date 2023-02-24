/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reusable Workflow Call Job Strategy Matrix Pattern Properties0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.ReusableWorkflowCallJobStrategyMatrixPatternProperties0#getKey <em>Key</em>}</li>
 *   <li>{@link githubwf.ReusableWorkflowCallJobStrategyMatrixPatternProperties0#getPatternProperties0 <em>Pattern Properties0</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixPatternProperties0()
 * @model annotation="PatternProperties PatternProperties='true' pattern='^(in|ex)clude$'"
 *        annotation="Type Type='array'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#example-including-configurations-in-a-matrix-build'"
 * @generated
 */
public interface ReusableWorkflowCallJobStrategyMatrixPatternProperties0 extends ReusableWorkflowCallJobStrategyMatrixPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Key</em>' attribute.
	 * @see #setKey(String)
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixPatternProperties0_Key()
	 * @model required="true"
	 * @generated
	 */
	String getKey();

	/**
	 * Sets the value of the '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixPatternProperties0#getKey <em>Key</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Key</em>' attribute.
	 * @see #getKey()
	 * @generated
	 */
	void setKey(String value);

	/**
	 * Returns the value of the '<em><b>Pattern Properties0</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.ReusableWorkflowCallJobStrategyMatrixPatternProperties0Items}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pattern Properties0</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getReusableWorkflowCallJobStrategyMatrixPatternProperties0_PatternProperties0()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<ReusableWorkflowCallJobStrategyMatrixPatternProperties0Items> getPatternProperties0();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" toBeEvaluatedRequired="true"
	 * @generated
	 */
	boolean find(String toBeEvaluated);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	boolean find();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String validateKeyOnDefinedPatternProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false"
	 * @generated
	 */
	String validateKeyOnDefinedProperties();

} // ReusableWorkflowCallJobStrategyMatrixPatternProperties0
