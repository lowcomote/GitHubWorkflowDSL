/**
 */
package githubwf.impl;

import githubwf.GithubwfPackage;
import githubwf.Permissions_45event;
import githubwf.Permissions_45eventPropertiesAbstract;
import githubwf.Permissions_45level;

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
 * An implementation of the model object '<em><b>Permissions 45event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.Permissions_45eventImpl#getPermissions_45event <em>Permissions 45event</em>}</li>
 *   <li>{@link githubwf.impl.Permissions_45eventImpl#getActions <em>Actions</em>}</li>
 *   <li>{@link githubwf.impl.Permissions_45eventImpl#getChecks <em>Checks</em>}</li>
 *   <li>{@link githubwf.impl.Permissions_45eventImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link githubwf.impl.Permissions_45eventImpl#getDeployments <em>Deployments</em>}</li>
 *   <li>{@link githubwf.impl.Permissions_45eventImpl#getDiscussions <em>Discussions</em>}</li>
 *   <li>{@link githubwf.impl.Permissions_45eventImpl#getId_45token <em>Id 45token</em>}</li>
 *   <li>{@link githubwf.impl.Permissions_45eventImpl#getIssues <em>Issues</em>}</li>
 *   <li>{@link githubwf.impl.Permissions_45eventImpl#getPackages <em>Packages</em>}</li>
 *   <li>{@link githubwf.impl.Permissions_45eventImpl#getPages <em>Pages</em>}</li>
 *   <li>{@link githubwf.impl.Permissions_45eventImpl#getPull_45requests <em>Pull 45requests</em>}</li>
 *   <li>{@link githubwf.impl.Permissions_45eventImpl#getRepository_45projects <em>Repository 45projects</em>}</li>
 *   <li>{@link githubwf.impl.Permissions_45eventImpl#getSecurity_45events <em>Security 45events</em>}</li>
 *   <li>{@link githubwf.impl.Permissions_45eventImpl#getStatuses <em>Statuses</em>}</li>
 * </ul>
 *
 * @generated
 */
public class Permissions_45eventImpl extends MinimalEObjectImpl.Container implements Permissions_45event {
	/**
	 * The cached value of the '{@link #getPermissions_45event() <em>Permissions 45event</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPermissions_45event()
	 * @generated
	 * @ordered
	 */
	protected EList<Permissions_45eventPropertiesAbstract> permissions_45event;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Permissions_45eventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getPermissions_45event();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Permissions_45eventPropertiesAbstract> getPermissions_45event() {
		if (permissions_45event == null) {
			permissions_45event = new EObjectContainmentEList<Permissions_45eventPropertiesAbstract>(Permissions_45eventPropertiesAbstract.class, this, GithubwfPackage.PERMISSIONS_45EVENT__PERMISSIONS_45EVENT);
		}
		return permissions_45event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getActions() {
		return this.getPermissions_45event().stream().filter(githubwf.Permissions_45eventActions.class::isInstance).findAny().map(githubwf.Permissions_45eventActions.class::cast).map(instance->instance.getActions()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getChecks() {
		return this.getPermissions_45event().stream().filter(githubwf.Permissions_45eventChecks.class::isInstance).findAny().map(githubwf.Permissions_45eventChecks.class::cast).map(instance->instance.getChecks()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getContents() {
		return this.getPermissions_45event().stream().filter(githubwf.Permissions_45eventContents.class::isInstance).findAny().map(githubwf.Permissions_45eventContents.class::cast).map(instance->instance.getContents()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getDeployments() {
		return this.getPermissions_45event().stream().filter(githubwf.Permissions_45eventDeployments.class::isInstance).findAny().map(githubwf.Permissions_45eventDeployments.class::cast).map(instance->instance.getDeployments()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getDiscussions() {
		return this.getPermissions_45event().stream().filter(githubwf.Permissions_45eventDiscussions.class::isInstance).findAny().map(githubwf.Permissions_45eventDiscussions.class::cast).map(instance->instance.getDiscussions()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getId_45token() {
		return this.getPermissions_45event().stream().filter(githubwf.Permissions_45eventId_45token.class::isInstance).findAny().map(githubwf.Permissions_45eventId_45token.class::cast).map(instance->instance.getId_45token()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getIssues() {
		return this.getPermissions_45event().stream().filter(githubwf.Permissions_45eventIssues.class::isInstance).findAny().map(githubwf.Permissions_45eventIssues.class::cast).map(instance->instance.getIssues()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getPackages() {
		return this.getPermissions_45event().stream().filter(githubwf.Permissions_45eventPackages.class::isInstance).findAny().map(githubwf.Permissions_45eventPackages.class::cast).map(instance->instance.getPackages()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getPages() {
		return this.getPermissions_45event().stream().filter(githubwf.Permissions_45eventPages.class::isInstance).findAny().map(githubwf.Permissions_45eventPages.class::cast).map(instance->instance.getPages()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getPull_45requests() {
		return this.getPermissions_45event().stream().filter(githubwf.Permissions_45eventPull_45requests.class::isInstance).findAny().map(githubwf.Permissions_45eventPull_45requests.class::cast).map(instance->instance.getPull_45requests()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getRepository_45projects() {
		return this.getPermissions_45event().stream().filter(githubwf.Permissions_45eventRepository_45projects.class::isInstance).findAny().map(githubwf.Permissions_45eventRepository_45projects.class::cast).map(instance->instance.getRepository_45projects()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getSecurity_45events() {
		return this.getPermissions_45event().stream().filter(githubwf.Permissions_45eventSecurity_45events.class::isInstance).findAny().map(githubwf.Permissions_45eventSecurity_45events.class::cast).map(instance->instance.getSecurity_45events()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level getStatuses() {
		return this.getPermissions_45event().stream().filter(githubwf.Permissions_45eventStatuses.class::isInstance).findAny().map(githubwf.Permissions_45eventStatuses.class::cast).map(instance->instance.getStatuses()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("actions".equals(key) ){return this.getActions();}
		
		if ("checks".equals(key) ){return this.getChecks();}
		
		if ("contents".equals(key) ){return this.getContents();}
		
		if ("deployments".equals(key) ){return this.getDeployments();}
		
		if ("discussions".equals(key) ){return this.getDiscussions();}
		
		if ("id_45token".equals(key) ){return this.getId_45token();}
		
		if ("issues".equals(key) ){return this.getIssues();}
		
		if ("packages".equals(key) ){return this.getPackages();}
		
		if ("pages".equals(key) ){return this.getPages();}
		
		if ("pull_45requests".equals(key) ){return this.getPull_45requests();}
		
		if ("repository_45projects".equals(key) ){return this.getRepository_45projects();}
		
		if ("security_45events".equals(key) ){return this.getSecurity_45events();}
		
		if ("statuses".equals(key) ){return this.getStatuses();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (Permissions_45eventPropertiesAbstract child : this.getPermissions_45event()){
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
			case GithubwfPackage.PERMISSIONS_45EVENT__PERMISSIONS_45EVENT:
				return ((InternalEList<?>)getPermissions_45event()).basicRemove(otherEnd, msgs);
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
			case GithubwfPackage.PERMISSIONS_45EVENT__PERMISSIONS_45EVENT:
				return getPermissions_45event();
			case GithubwfPackage.PERMISSIONS_45EVENT__ACTIONS:
				return getActions();
			case GithubwfPackage.PERMISSIONS_45EVENT__CHECKS:
				return getChecks();
			case GithubwfPackage.PERMISSIONS_45EVENT__CONTENTS:
				return getContents();
			case GithubwfPackage.PERMISSIONS_45EVENT__DEPLOYMENTS:
				return getDeployments();
			case GithubwfPackage.PERMISSIONS_45EVENT__DISCUSSIONS:
				return getDiscussions();
			case GithubwfPackage.PERMISSIONS_45EVENT__ID_45TOKEN:
				return getId_45token();
			case GithubwfPackage.PERMISSIONS_45EVENT__ISSUES:
				return getIssues();
			case GithubwfPackage.PERMISSIONS_45EVENT__PACKAGES:
				return getPackages();
			case GithubwfPackage.PERMISSIONS_45EVENT__PAGES:
				return getPages();
			case GithubwfPackage.PERMISSIONS_45EVENT__PULL_45REQUESTS:
				return getPull_45requests();
			case GithubwfPackage.PERMISSIONS_45EVENT__REPOSITORY_45PROJECTS:
				return getRepository_45projects();
			case GithubwfPackage.PERMISSIONS_45EVENT__SECURITY_45EVENTS:
				return getSecurity_45events();
			case GithubwfPackage.PERMISSIONS_45EVENT__STATUSES:
				return getStatuses();
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
			case GithubwfPackage.PERMISSIONS_45EVENT__PERMISSIONS_45EVENT:
				getPermissions_45event().clear();
				getPermissions_45event().addAll((Collection<? extends Permissions_45eventPropertiesAbstract>)newValue);
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
			case GithubwfPackage.PERMISSIONS_45EVENT__PERMISSIONS_45EVENT:
				getPermissions_45event().clear();
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
			case GithubwfPackage.PERMISSIONS_45EVENT__PERMISSIONS_45EVENT:
				return permissions_45event != null && !permissions_45event.isEmpty();
			case GithubwfPackage.PERMISSIONS_45EVENT__ACTIONS:
				return getActions() != null;
			case GithubwfPackage.PERMISSIONS_45EVENT__CHECKS:
				return getChecks() != null;
			case GithubwfPackage.PERMISSIONS_45EVENT__CONTENTS:
				return getContents() != null;
			case GithubwfPackage.PERMISSIONS_45EVENT__DEPLOYMENTS:
				return getDeployments() != null;
			case GithubwfPackage.PERMISSIONS_45EVENT__DISCUSSIONS:
				return getDiscussions() != null;
			case GithubwfPackage.PERMISSIONS_45EVENT__ID_45TOKEN:
				return getId_45token() != null;
			case GithubwfPackage.PERMISSIONS_45EVENT__ISSUES:
				return getIssues() != null;
			case GithubwfPackage.PERMISSIONS_45EVENT__PACKAGES:
				return getPackages() != null;
			case GithubwfPackage.PERMISSIONS_45EVENT__PAGES:
				return getPages() != null;
			case GithubwfPackage.PERMISSIONS_45EVENT__PULL_45REQUESTS:
				return getPull_45requests() != null;
			case GithubwfPackage.PERMISSIONS_45EVENT__REPOSITORY_45PROJECTS:
				return getRepository_45projects() != null;
			case GithubwfPackage.PERMISSIONS_45EVENT__SECURITY_45EVENTS:
				return getSecurity_45events() != null;
			case GithubwfPackage.PERMISSIONS_45EVENT__STATUSES:
				return getStatuses() != null;
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
			case GithubwfPackage.PERMISSIONS_45EVENT___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //Permissions_45eventImpl
