/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.NormalJobStrategy;
import githubwf.NormalJobStrategyMatrixAbstract;
import githubwf.NormalJobStrategyPropertiesAbstract;

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
 * An implementation of the model object '<em><b>Normal Job Strategy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.NormalJobStrategyImpl#getStrategy <em>Strategy</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobStrategyImpl#getMatrix <em>Matrix</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobStrategyImpl#getFail_45fast <em>Fail 45fast</em>}</li>
 *   <li>{@link githubwf.impl.NormalJobStrategyImpl#getMax_45parallel <em>Max 45parallel</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NormalJobStrategyImpl extends NormalJobPropertiesAbstractImpl implements NormalJobStrategy {
	/**
	 * The cached value of the '{@link #getStrategy() <em>Strategy</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStrategy()
	 * @generated
	 * @ordered
	 */
	protected EList<NormalJobStrategyPropertiesAbstract> strategy;

	/**
	 * The default value of the '{@link #getFail_45fast() <em>Fail 45fast</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFail_45fast()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean FAIL_45FAST_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getMax_45parallel() <em>Max 45parallel</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMax_45parallel()
	 * @generated
	 * @ordered
	 */
	protected static final Double MAX_45PARALLEL_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NormalJobStrategyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getNormalJobStrategy();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<NormalJobStrategyPropertiesAbstract> getStrategy() {
		if (strategy == null) {
			strategy = new EObjectContainmentEList<NormalJobStrategyPropertiesAbstract>(NormalJobStrategyPropertiesAbstract.class, this, GithubwfPackage.NORMAL_JOB_STRATEGY__STRATEGY);
		}
		return strategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixAbstract getMatrix() {
		return this.getStrategy().stream().filter(githubwf.NormalJobStrategyMatrix.class::isInstance).findAny().map(githubwf.NormalJobStrategyMatrix.class::cast).map(instance->instance.getMatrix()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Boolean getFail_45fast() {
		return this.getStrategy().stream().filter(githubwf.NormalJobStrategyFail_45fast.class::isInstance).findAny().map(githubwf.NormalJobStrategyFail_45fast.class::cast).map(instance->instance.getFail_45fast()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Double getMax_45parallel() {
		return this.getStrategy().stream().filter(githubwf.NormalJobStrategyMax_45parallel.class::isInstance).findAny().map(githubwf.NormalJobStrategyMax_45parallel.class::cast).map(instance->instance.getMax_45parallel()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("matrix".equals(key) ){return this.getMatrix();}
		
		if ("fail_45fast".equals(key) ){return this.getFail_45fast();}
		
		if ("max_45parallel".equals(key) ){return this.getMax_45parallel();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (NormalJobStrategyPropertiesAbstract child : this.getStrategy()){
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
			case GithubwfPackage.NORMAL_JOB_STRATEGY__STRATEGY:
				return ((InternalEList<?>)getStrategy()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.NORMAL_JOB_STRATEGY__STRATEGY:
				return getStrategy();
			case GithubwfPackage.NORMAL_JOB_STRATEGY__MATRIX:
				return getMatrix();
			case GithubwfPackage.NORMAL_JOB_STRATEGY__FAIL_45FAST:
				return getFail_45fast();
			case GithubwfPackage.NORMAL_JOB_STRATEGY__MAX_45PARALLEL:
				return getMax_45parallel();
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
			case GithubwfPackage.NORMAL_JOB_STRATEGY__STRATEGY:
				getStrategy().clear();
				getStrategy().addAll((Collection<? extends NormalJobStrategyPropertiesAbstract>)newValue);
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
			case GithubwfPackage.NORMAL_JOB_STRATEGY__STRATEGY:
				getStrategy().clear();
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
			case GithubwfPackage.NORMAL_JOB_STRATEGY__STRATEGY:
				return strategy != null && !strategy.isEmpty();
			case GithubwfPackage.NORMAL_JOB_STRATEGY__MATRIX:
				return getMatrix() != null;
			case GithubwfPackage.NORMAL_JOB_STRATEGY__FAIL_45FAST:
				return FAIL_45FAST_EDEFAULT == null ? getFail_45fast() != null : !FAIL_45FAST_EDEFAULT.equals(getFail_45fast());
			case GithubwfPackage.NORMAL_JOB_STRATEGY__MAX_45PARALLEL:
				return MAX_45PARALLEL_EDEFAULT == null ? getMax_45parallel() != null : !MAX_45PARALLEL_EDEFAULT.equals(getMax_45parallel());
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
			case GithubwfPackage.NORMAL_JOB_STRATEGY___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //NormalJobStrategyImpl
