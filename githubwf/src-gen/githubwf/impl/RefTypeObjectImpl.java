/**
 */
package githubwf.impl;

import githubwf.Branch;
import githubwf.GithubwfPackage;
import githubwf.Path;
import githubwf.RefPropertiesAbstract;
import githubwf.RefTypeObject;

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
 * An implementation of the model object '<em><b>Ref Type Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.RefTypeObjectImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link githubwf.impl.RefTypeObjectImpl#getBranches <em>Branches</em>}</li>
 *   <li>{@link githubwf.impl.RefTypeObjectImpl#getBranches_45ignore <em>Branches 45ignore</em>}</li>
 *   <li>{@link githubwf.impl.RefTypeObjectImpl#getTags <em>Tags</em>}</li>
 *   <li>{@link githubwf.impl.RefTypeObjectImpl#getTags_45ignore <em>Tags 45ignore</em>}</li>
 *   <li>{@link githubwf.impl.RefTypeObjectImpl#getPaths <em>Paths</em>}</li>
 *   <li>{@link githubwf.impl.RefTypeObjectImpl#getPaths_45ignore <em>Paths 45ignore</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefTypeObjectImpl extends RefAbstractImpl implements RefTypeObject {
	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected EList<RefPropertiesAbstract> ref;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefTypeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getRefTypeObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<RefPropertiesAbstract> getRef() {
		if (ref == null) {
			ref = new EObjectContainmentEList<RefPropertiesAbstract>(RefPropertiesAbstract.class, this, GithubwfPackage.REF_TYPE_OBJECT__REF);
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch getBranches() {
		return this.getRef().stream().filter(githubwf.RefBranches.class::isInstance).findAny().map(githubwf.RefBranches.class::cast).map(instance->instance.getBranches()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch getBranches_45ignore() {
		return this.getRef().stream().filter(githubwf.RefBranches_45ignore.class::isInstance).findAny().map(githubwf.RefBranches_45ignore.class::cast).map(instance->instance.getBranches_45ignore()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch getTags() {
		return this.getRef().stream().filter(githubwf.RefTags.class::isInstance).findAny().map(githubwf.RefTags.class::cast).map(instance->instance.getTags()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch getTags_45ignore() {
		return this.getRef().stream().filter(githubwf.RefTags_45ignore.class::isInstance).findAny().map(githubwf.RefTags_45ignore.class::cast).map(instance->instance.getTags_45ignore()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getPaths() {
		return this.getRef().stream().filter(githubwf.RefPaths.class::isInstance).findAny().map(githubwf.RefPaths.class::cast).map(instance->instance.getPaths()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path getPaths_45ignore() {
		return this.getRef().stream().filter(githubwf.RefPaths_45ignore.class::isInstance).findAny().map(githubwf.RefPaths_45ignore.class::cast).map(instance->instance.getPaths_45ignore()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("branches".equals(key) ){return this.getBranches();}
		
		if ("branches_45ignore".equals(key) ){return this.getBranches_45ignore();}
		
		if ("tags".equals(key) ){return this.getTags();}
		
		if ("tags_45ignore".equals(key) ){return this.getTags_45ignore();}
		
		if ("paths".equals(key) ){return this.getPaths();}
		
		if ("paths_45ignore".equals(key) ){return this.getPaths_45ignore();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		additionalOrPatternPropertyClasses.add(githubwf.RefAdditionalProperties.class); 
		
		for (RefPropertiesAbstract child : this.getRef()){
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
			case GithubwfPackage.REF_TYPE_OBJECT__REF:
				return ((InternalEList<?>)getRef()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.REF_TYPE_OBJECT__REF:
				return getRef();
			case GithubwfPackage.REF_TYPE_OBJECT__BRANCHES:
				return getBranches();
			case GithubwfPackage.REF_TYPE_OBJECT__BRANCHES_45IGNORE:
				return getBranches_45ignore();
			case GithubwfPackage.REF_TYPE_OBJECT__TAGS:
				return getTags();
			case GithubwfPackage.REF_TYPE_OBJECT__TAGS_45IGNORE:
				return getTags_45ignore();
			case GithubwfPackage.REF_TYPE_OBJECT__PATHS:
				return getPaths();
			case GithubwfPackage.REF_TYPE_OBJECT__PATHS_45IGNORE:
				return getPaths_45ignore();
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
			case GithubwfPackage.REF_TYPE_OBJECT__REF:
				getRef().clear();
				getRef().addAll((Collection<? extends RefPropertiesAbstract>)newValue);
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
			case GithubwfPackage.REF_TYPE_OBJECT__REF:
				getRef().clear();
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
			case GithubwfPackage.REF_TYPE_OBJECT__REF:
				return ref != null && !ref.isEmpty();
			case GithubwfPackage.REF_TYPE_OBJECT__BRANCHES:
				return getBranches() != null;
			case GithubwfPackage.REF_TYPE_OBJECT__BRANCHES_45IGNORE:
				return getBranches_45ignore() != null;
			case GithubwfPackage.REF_TYPE_OBJECT__TAGS:
				return getTags() != null;
			case GithubwfPackage.REF_TYPE_OBJECT__TAGS_45IGNORE:
				return getTags_45ignore() != null;
			case GithubwfPackage.REF_TYPE_OBJECT__PATHS:
				return getPaths() != null;
			case GithubwfPackage.REF_TYPE_OBJECT__PATHS_45IGNORE:
				return getPaths_45ignore() != null;
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
			case GithubwfPackage.REF_TYPE_OBJECT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //RefTypeObjectImpl
