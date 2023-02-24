/**
 */
package githubwf.impl;

import githubwf.ContainerCredentials;
import githubwf.ContainerCredentialsPropertiesAbstract;
import githubwf.GithubwfPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container Credentials</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ContainerCredentialsImpl#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link githubwf.impl.ContainerCredentialsImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link githubwf.impl.ContainerCredentialsImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerCredentialsImpl extends ContainerPropertiesAbstractImpl implements ContainerCredentials {
	/**
	 * The cached value of the '{@link #getCredentials() <em>Credentials</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredentials()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerCredentialsPropertiesAbstract> credentials;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerCredentialsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getContainerCredentials();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainerCredentialsPropertiesAbstract> getCredentials() {
		if (credentials == null) {
			credentials = new EObjectContainmentEList<ContainerCredentialsPropertiesAbstract>(ContainerCredentialsPropertiesAbstract.class, this, GithubwfPackage.CONTAINER_CREDENTIALS__CREDENTIALS);
		}
		return credentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return this.getCredentials().stream().filter(githubwf.ContainerCredentialsUsername.class::isInstance).findAny().map(githubwf.ContainerCredentialsUsername.class::cast).map(instance->instance.getUsername()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return this.getCredentials().stream().filter(githubwf.ContainerCredentialsPassword.class::isInstance).findAny().map(githubwf.ContainerCredentialsPassword.class::cast).map(instance->instance.getPassword()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("username".equals(key) ){return this.getUsername();}
		
		if ("password".equals(key) ){return this.getPassword();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		additionalOrPatternPropertyClasses.add(githubwf.ContainerCredentialsAdditionalProperties.class); 
		
		for (ContainerCredentialsPropertiesAbstract child : this.getCredentials()){
			if (!java.util.Collections.disjoint(additionalOrPatternPropertyClasses, java.util.Arrays.asList(child.getClass().getInterfaces()))){
				try{
					java.lang.reflect.Field keyField = child.getClass().getDeclaredField("key");
					if (jku.se.atl.transformation.utils.Utils.getIdentifier(keyField.get(child).toString()).equals(key)) {
						java.lang.reflect.Field valueField = java.util.Arrays.asList(child.getClass().getDeclaredFields()).stream().filter(field -> field.getName().equals("additionalProperties") || field.getName().startsWith("patternProperties") ).findAny().get();
						return valueField.get(child);
					}
				} catch (Exception e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			}
		}
		return null;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.CONTAINER_CREDENTIALS__CREDENTIALS:
				return ((InternalEList<?>)getCredentials()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.CONTAINER_CREDENTIALS__CREDENTIALS:
				return getCredentials();
			case GithubwfPackage.CONTAINER_CREDENTIALS__USERNAME:
				return getUsername();
			case GithubwfPackage.CONTAINER_CREDENTIALS__PASSWORD:
				return getPassword();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubwfPackage.CONTAINER_CREDENTIALS__CREDENTIALS:
				getCredentials().clear();
				getCredentials().addAll((Collection<? extends ContainerCredentialsPropertiesAbstract>)newValue);
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
			case GithubwfPackage.CONTAINER_CREDENTIALS__CREDENTIALS:
				getCredentials().clear();
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
			case GithubwfPackage.CONTAINER_CREDENTIALS__CREDENTIALS:
				return credentials != null && !credentials.isEmpty();
			case GithubwfPackage.CONTAINER_CREDENTIALS__USERNAME:
				return USERNAME_EDEFAULT == null ? getUsername() != null : !USERNAME_EDEFAULT.equals(getUsername());
			case GithubwfPackage.CONTAINER_CREDENTIALS__PASSWORD:
				return PASSWORD_EDEFAULT == null ? getPassword() != null : !PASSWORD_EDEFAULT.equals(getPassword());
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
			case GithubwfPackage.CONTAINER_CREDENTIALS___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContainerCredentialsImpl
