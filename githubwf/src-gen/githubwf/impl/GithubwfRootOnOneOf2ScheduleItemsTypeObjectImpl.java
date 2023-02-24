/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract;
import githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeObject;

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
 * An implementation of the model object '<em><b>Root On One Of2 Schedule Items Type Object</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2ScheduleItemsTypeObjectImpl#getItems <em>Items</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2ScheduleItemsTypeObjectImpl#getCron <em>Cron</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2ScheduleItemsTypeObjectImpl extends GithubwfRootOnOneOf2ScheduleItemsAbstractImpl implements GithubwfRootOnOneOf2ScheduleItemsTypeObject {
	/**
	 * The cached value of the '{@link #getItems() <em>Items</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItems()
	 * @generated
	 * @ordered
	 */
	protected EList<GithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract> items;

	/**
	 * The default value of the '{@link #getCron() <em>Cron</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCron()
	 * @generated
	 * @ordered
	 */
	protected static final String CRON_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2ScheduleItemsTypeObjectImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2ScheduleItemsTypeObject();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract> getItems() {
		if (items == null) {
			items = new EObjectContainmentEList<GithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract>(GithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract.class, this, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_OBJECT__ITEMS);
		}
		return items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCron() {
		return this.getItems().stream().filter(githubwf.GithubwfRootOnOneOf2ScheduleItemsCron.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2ScheduleItemsCron.class::cast).map(instance->instance.getCron()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("cron".equals(key) ){return this.getCron();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (GithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract child : this.getItems()){
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_OBJECT__ITEMS:
				return ((InternalEList<?>)getItems()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_OBJECT__ITEMS:
				return getItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_OBJECT__CRON:
				return getCron();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_OBJECT__ITEMS:
				getItems().clear();
				getItems().addAll((Collection<? extends GithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract>)newValue);
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_OBJECT__ITEMS:
				getItems().clear();
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_OBJECT__ITEMS:
				return items != null && !items.isEmpty();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_OBJECT__CRON:
				return CRON_EDEFAULT == null ? getCron() != null : !CRON_EDEFAULT.equals(getCron());
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
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_OBJECT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GithubwfRootOnOneOf2ScheduleItemsTypeObjectImpl
