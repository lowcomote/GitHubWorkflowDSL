/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Normal Job Strategy Matrix One Of0</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.NormalJobStrategyMatrixOneOf0#getMatrix <em>Matrix</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixOneOf0()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface NormalJobStrategyMatrixOneOf0 extends EObject {
	/**
	 * Returns the value of the '<em><b>Matrix</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.NormalJobStrategyMatrixOneOf0PropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Matrix</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getNormalJobStrategyMatrixOneOf0_Matrix()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='matrix'"
	 * @generated
	 */
	EList<NormalJobStrategyMatrixOneOf0PropertiesAbstract> getMatrix();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // NormalJobStrategyMatrixOneOf0
