/**
 */
package githubwf.impl;

import githubwf.ExpressionSyntax;
import githubwf.GithubwfPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression Syntax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ExpressionSyntaxImpl#getExpressionSyntax <em>Expression Syntax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionSyntaxImpl extends MinimalEObjectImpl.Container implements ExpressionSyntax {
	/**
	 * The default value of the '{@link #getExpressionSyntax() <em>Expression Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionSyntax()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION_SYNTAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpressionSyntax() <em>Expression Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpressionSyntax()
	 * @generated
	 * @ordered
	 */
	protected String expressionSyntax = EXPRESSION_SYNTAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionSyntaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getExpressionSyntax();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getExpressionSyntax() {
		return expressionSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExpressionSyntax(String newExpressionSyntax) {
		String oldExpressionSyntax = expressionSyntax;
		expressionSyntax = newExpressionSyntax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.EXPRESSION_SYNTAX__EXPRESSION_SYNTAX, oldExpressionSyntax, expressionSyntax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean regexMatch() {
		java.util.regex.Pattern  p = java.util.regex.Pattern.compile("^\\$\\{\\{(.|[\r\n])*\\}\\}$");
		java.util.regex.Matcher m = p.matcher(this.expressionSyntax);
		return m.find();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.EXPRESSION_SYNTAX__EXPRESSION_SYNTAX:
				return getExpressionSyntax();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubwfPackage.EXPRESSION_SYNTAX__EXPRESSION_SYNTAX:
				setExpressionSyntax((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GithubwfPackage.EXPRESSION_SYNTAX__EXPRESSION_SYNTAX:
				setExpressionSyntax(EXPRESSION_SYNTAX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GithubwfPackage.EXPRESSION_SYNTAX__EXPRESSION_SYNTAX:
				return EXPRESSION_SYNTAX_EDEFAULT == null ? expressionSyntax != null : !EXPRESSION_SYNTAX_EDEFAULT.equals(expressionSyntax);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GithubwfPackage.EXPRESSION_SYNTAX___REGEX_MATCH:
				return regexMatch();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (expressionSyntax: ");
		result.append(expressionSyntax);
		result.append(')');
		return result.toString();
	}

} //ExpressionSyntaxImpl
