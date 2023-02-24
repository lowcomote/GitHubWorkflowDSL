/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.StringContainingExpressionSyntax;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>String Containing Expression Syntax</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.StringContainingExpressionSyntaxImpl#getStringContainingExpressionSyntax <em>String Containing Expression Syntax</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StringContainingExpressionSyntaxImpl extends MinimalEObjectImpl.Container implements StringContainingExpressionSyntax {
	/**
	 * The default value of the '{@link #getStringContainingExpressionSyntax() <em>String Containing Expression Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringContainingExpressionSyntax()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_CONTAINING_EXPRESSION_SYNTAX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringContainingExpressionSyntax() <em>String Containing Expression Syntax</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringContainingExpressionSyntax()
	 * @generated
	 * @ordered
	 */
	protected String stringContainingExpressionSyntax = STRING_CONTAINING_EXPRESSION_SYNTAX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StringContainingExpressionSyntaxImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getStringContainingExpressionSyntax();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getStringContainingExpressionSyntax() {
		return stringContainingExpressionSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setStringContainingExpressionSyntax(String newStringContainingExpressionSyntax) {
		String oldStringContainingExpressionSyntax = stringContainingExpressionSyntax;
		stringContainingExpressionSyntax = newStringContainingExpressionSyntax;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, GithubwfPackage.STRING_CONTAINING_EXPRESSION_SYNTAX__STRING_CONTAINING_EXPRESSION_SYNTAX, oldStringContainingExpressionSyntax, stringContainingExpressionSyntax));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean regexMatch() {
		java.util.regex.Pattern  p = java.util.regex.Pattern.compile("^.*\\$\\{\\{(.|[\r\n])*\\}\\}.*$");
		java.util.regex.Matcher m = p.matcher(this.stringContainingExpressionSyntax);
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
			case GithubwfPackage.STRING_CONTAINING_EXPRESSION_SYNTAX__STRING_CONTAINING_EXPRESSION_SYNTAX:
				return getStringContainingExpressionSyntax();
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
			case GithubwfPackage.STRING_CONTAINING_EXPRESSION_SYNTAX__STRING_CONTAINING_EXPRESSION_SYNTAX:
				setStringContainingExpressionSyntax((String)newValue);
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
			case GithubwfPackage.STRING_CONTAINING_EXPRESSION_SYNTAX__STRING_CONTAINING_EXPRESSION_SYNTAX:
				setStringContainingExpressionSyntax(STRING_CONTAINING_EXPRESSION_SYNTAX_EDEFAULT);
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
			case GithubwfPackage.STRING_CONTAINING_EXPRESSION_SYNTAX__STRING_CONTAINING_EXPRESSION_SYNTAX:
				return STRING_CONTAINING_EXPRESSION_SYNTAX_EDEFAULT == null ? stringContainingExpressionSyntax != null : !STRING_CONTAINING_EXPRESSION_SYNTAX_EDEFAULT.equals(stringContainingExpressionSyntax);
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
			case GithubwfPackage.STRING_CONTAINING_EXPRESSION_SYNTAX___REGEX_MATCH:
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
		result.append(" (stringContainingExpressionSyntax: ");
		result.append(stringContainingExpressionSyntax);
		result.append(')');
		return result.toString();
	}

} //StringContainingExpressionSyntaxImpl
