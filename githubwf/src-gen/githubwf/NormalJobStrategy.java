/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Strategy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStrategy#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link githubwf.NormalJobStrategy#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link githubwf.NormalJobStrategy#getFail_45fast <em>Fail 45fast</em>}</li>
 *   <li>{@link githubwf.NormalJobStrategy#getMax_45parallel <em>Max 45parallel</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStrategy()
 * @model annotation="Type Type='object'"
 *        annotation="Description Description='A strategy creates a build matrix for your jobs. You can define different variations of an environment to run each job in.'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idstrategy'"
 * @generated
 */
public interface NormalJobStrategy extends NormalJobPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Strategy</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobStrategyPropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Strategy</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobStrategy_Strategy()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='strategy'"
	 * @generated
	 */
	EList<NormalJobStrategyPropertiesAbstract> getStrategy();

	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' reference.
	 * @see githubwf.GithubwfPackage#getNormalJobStrategy_Matrix()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	NormalJobStrategyMatrixAbstract getMatrix();

	/**
	 * Returns the value of the '<em><b>Fail 45fast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail 45fast</em>' attribute.
	 * @see githubwf.GithubwfPackage#getNormalJobStrategy_Fail_45fast()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Boolean getFail_45fast();

	/**
	 * Returns the value of the '<em><b>Max 45parallel</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Max 45parallel</em>' attribute.
	 * @see githubwf.GithubwfPackage#getNormalJobStrategy_Max_45parallel()
	 * @model unique="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Double getMax_45parallel();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // NormalJobStrategy
