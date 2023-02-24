/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Strategy Matrix Type Array</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStrategyMatrixTypeArray#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixTypeArray()
 * @model annotation="ArrayOfTypes ArrayOfTypes='array'"
 * @generated
 */
public interface NormalJobStrategyMatrixTypeArray extends NormalJobStrategyMatrixAbstract {
	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobStrategyMatrixItems}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixTypeArray_Matrix()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='matrix'"
	 * @generated
	 */
	EList<NormalJobStrategyMatrixItems> getMatrix();

} // NormalJobStrategyMatrixTypeArray
