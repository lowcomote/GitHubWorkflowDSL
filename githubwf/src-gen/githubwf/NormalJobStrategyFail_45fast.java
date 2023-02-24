/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Strategy Fail 45fast</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStrategyFail_45fast#getFail_45fast <em>Fail 45fast</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStrategyFail_45fast()
 * @model annotation="Type Type='boolean'"
 *        annotation="Description Description='When set to true, GitHub cancels all in-progress jobs if any matrix job fails. Default: true'"
 *        annotation="Comment Comment='https://help.github.com/en/actions/automating-your-workflow-with-github-actions/workflow-syntax-for-github-actions#jobsjob_idstrategyfail-fast'"
 *        annotation="Default Default='true'"
 * @generated
 */
public interface NormalJobStrategyFail_45fast extends NormalJobStrategyPropertiesAbstract {
	/**
	 * Returns the value of the '<em><b>Fail 45fast</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fail 45fast</em>' attribute.
	 * @see #setFail_45fast(Boolean)
	 * @see githubwf.GithubwfPackage#getNormalJobStrategyFail_45fast_Fail_45fast()
	 * @model required="true"
	 *        annotation="Keyword Keyword='fail-fast'"
	 * @generated
	 */
	Boolean getFail_45fast();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStrategyFail_45fast#getFail_45fast <em>Fail 45fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fail 45fast</em>' attribute.
	 * @see #getFail_45fast()
	 * @generated
	 */
	void setFail_45fast(Boolean value);

} // NormalJobStrategyFail_45fast
