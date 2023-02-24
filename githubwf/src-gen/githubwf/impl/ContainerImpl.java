/**
 */
package githubwf.impl;

import githubwf.ContainerCredentials;
import githubwf.ContainerPorts;
import githubwf.ContainerPropertiesAbstract;
import githubwf.ContainerVolumes;
import githubwf.Env;
import githubwf.GithubwfPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.ContainerImpl#getContainer <em>Container</em>}</li>
 *   <li>{@link githubwf.impl.ContainerImpl#getImage <em>Image</em>}</li>
 *   <li>{@link githubwf.impl.ContainerImpl#getCredentials <em>Credentials</em>}</li>
 *   <li>{@link githubwf.impl.ContainerImpl#getEnv <em>Env</em>}</li>
 *   <li>{@link githubwf.impl.ContainerImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link githubwf.impl.ContainerImpl#getVolumes <em>Volumes</em>}</li>
 *   <li>{@link githubwf.impl.ContainerImpl#getOptions <em>Options</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ContainerImpl extends MinimalEObjectImpl.Container implements githubwf.Container {
	/**
	 * The cached value of the '{@link #getContainer() <em>Container</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContainer()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainerPropertiesAbstract> container;

	/**
	 * The default value of the '{@link #getImage() <em>Image</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImage()
	 * @generated
	 * @ordered
	 */
	protected static final String IMAGE_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getOptions() <em>Options</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOptions()
	 * @generated
	 * @ordered
	 */
	protected static final String OPTIONS_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ContainerPropertiesAbstract> getContainer() {
		if (container == null) {
			container = new EObjectContainmentEList<ContainerPropertiesAbstract>(ContainerPropertiesAbstract.class, this, GithubwfPackage.CONTAINER__CONTAINER);
		}
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getImage() {
		return this.getContainer().stream().filter(githubwf.ContainerImage.class::isInstance).findAny().map(githubwf.ContainerImage.class::cast).map(instance->instance.getImage()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerCredentials getCredentials() {
		return this.getContainer().stream().filter(githubwf.ContainerCredentials.class::isInstance).findAny().map(githubwf.ContainerCredentials.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Env getEnv() {
		return this.getContainer().stream().filter(githubwf.ContainerEnv.class::isInstance).findAny().map(githubwf.ContainerEnv.class::cast).map(instance->instance.getEnv()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPorts getPorts() {
		return this.getContainer().stream().filter(githubwf.ContainerPorts.class::isInstance).findAny().map(githubwf.ContainerPorts.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerVolumes getVolumes() {
		return this.getContainer().stream().filter(githubwf.ContainerVolumes.class::isInstance).findAny().map(githubwf.ContainerVolumes.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOptions() {
		return this.getContainer().stream().filter(githubwf.ContainerOptions.class::isInstance).findAny().map(githubwf.ContainerOptions.class::cast).map(instance->instance.getOptions()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("image".equals(key) ){return this.getImage();}
		
		if ("credentials".equals(key) ){return this.getCredentials();}
		
		if ("env".equals(key) ){return this.getEnv();}
		
		if ("ports".equals(key) ){return this.getPorts();}
		
		if ("volumes".equals(key) ){return this.getVolumes();}
		
		if ("options".equals(key) ){return this.getOptions();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (ContainerPropertiesAbstract child : this.getContainer()){
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
			case GithubwfPackage.CONTAINER__CONTAINER:
				return ((InternalEList<?>)getContainer()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.CONTAINER__CONTAINER:
				return getContainer();
			case GithubwfPackage.CONTAINER__IMAGE:
				return getImage();
			case GithubwfPackage.CONTAINER__CREDENTIALS:
				return getCredentials();
			case GithubwfPackage.CONTAINER__ENV:
				return getEnv();
			case GithubwfPackage.CONTAINER__PORTS:
				return getPorts();
			case GithubwfPackage.CONTAINER__VOLUMES:
				return getVolumes();
			case GithubwfPackage.CONTAINER__OPTIONS:
				return getOptions();
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
			case GithubwfPackage.CONTAINER__CONTAINER:
				getContainer().clear();
				getContainer().addAll((Collection<? extends ContainerPropertiesAbstract>)newValue);
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
			case GithubwfPackage.CONTAINER__CONTAINER:
				getContainer().clear();
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
			case GithubwfPackage.CONTAINER__CONTAINER:
				return container != null && !container.isEmpty();
			case GithubwfPackage.CONTAINER__IMAGE:
				return IMAGE_EDEFAULT == null ? getImage() != null : !IMAGE_EDEFAULT.equals(getImage());
			case GithubwfPackage.CONTAINER__CREDENTIALS:
				return getCredentials() != null;
			case GithubwfPackage.CONTAINER__ENV:
				return getEnv() != null;
			case GithubwfPackage.CONTAINER__PORTS:
				return getPorts() != null;
			case GithubwfPackage.CONTAINER__VOLUMES:
				return getVolumes() != null;
			case GithubwfPackage.CONTAINER__OPTIONS:
				return OPTIONS_EDEFAULT == null ? getOptions() != null : !OPTIONS_EDEFAULT.equals(getOptions());
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
			case GithubwfPackage.CONTAINER___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ContainerImpl
