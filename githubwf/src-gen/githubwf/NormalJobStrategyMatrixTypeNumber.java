/**
 */
package githubwf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Strategy Matrix Type Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStrategyMatrixTypeNumber#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixTypeNumber()
 * @model annotation="ArrayOfTypes ArrayOfTypes='number'"
 * @generated
 */
public interface NormalJobStrategyMatrixTypeNumber extends NormalJobStrategyMatrixAbstract {
	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' attribute.
	 * @see #setMatrix(Double)
	 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixTypeNumber_Matrix()
	 * @model required="true"
	 *        annotation="Keyword Keyword='matrix'"
	 * @generated
	 */
	Double getMatrix();

	/**
	 * Sets the value of the '{@link githubwf.NormalJobStrategyMatrixTypeNumber#getMatrix <em>Matrix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Matrix</em>' attribute.
	 * @see #getMatrix()
	 * @generated
	 */
	void setMatrix(Double value);

} // NormalJobStrategyMatrixTypeNumber
