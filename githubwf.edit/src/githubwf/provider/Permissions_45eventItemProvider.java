/**
 */
package githubwf.provider;


import githubwf.GithubwfFactory;
import githubwf.GithubwfPackage;
import githubwf.Permissions_45event;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link githubwf.Permissions_45event} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class Permissions_45eventItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Permissions_45eventItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addActionsPropertyDescriptor(object);
			addChecksPropertyDescriptor(object);
			addContentsPropertyDescriptor(object);
			addDeploymentsPropertyDescriptor(object);
			addDiscussionsPropertyDescriptor(object);
			addId_45tokenPropertyDescriptor(object);
			addIssuesPropertyDescriptor(object);
			addPackagesPropertyDescriptor(object);
			addPagesPropertyDescriptor(object);
			addPull_45requestsPropertyDescriptor(object);
			addRepository_45projectsPropertyDescriptor(object);
			addSecurity_45eventsPropertyDescriptor(object);
			addStatusesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Actions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addActionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Permissions_45event_actions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Permissions_45event_actions_feature", "_UI_Permissions_45event_type"),
				 GithubwfPackage.eINSTANCE.getPermissions_45event_Actions(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Checks feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addChecksPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Permissions_45event_checks_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Permissions_45event_checks_feature", "_UI_Permissions_45event_type"),
				 GithubwfPackage.eINSTANCE.getPermissions_45event_Checks(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Contents feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Permissions_45event_contents_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Permissions_45event_contents_feature", "_UI_Permissions_45event_type"),
				 GithubwfPackage.eINSTANCE.getPermissions_45event_Contents(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deployments feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeploymentsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Permissions_45event_deployments_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Permissions_45event_deployments_feature", "_UI_Permissions_45event_type"),
				 GithubwfPackage.eINSTANCE.getPermissions_45event_Deployments(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Discussions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiscussionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Permissions_45event_discussions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Permissions_45event_discussions_feature", "_UI_Permissions_45event_type"),
				 GithubwfPackage.eINSTANCE.getPermissions_45event_Discussions(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Id 45token feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addId_45tokenPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Permissions_45event_id_45token_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Permissions_45event_id_45token_feature", "_UI_Permissions_45event_type"),
				 GithubwfPackage.eINSTANCE.getPermissions_45event_Id_45token(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Issues feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIssuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Permissions_45event_issues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Permissions_45event_issues_feature", "_UI_Permissions_45event_type"),
				 GithubwfPackage.eINSTANCE.getPermissions_45event_Issues(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Packages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Permissions_45event_packages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Permissions_45event_packages_feature", "_UI_Permissions_45event_type"),
				 GithubwfPackage.eINSTANCE.getPermissions_45event_Packages(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pages feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPagesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Permissions_45event_pages_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Permissions_45event_pages_feature", "_UI_Permissions_45event_type"),
				 GithubwfPackage.eINSTANCE.getPermissions_45event_Pages(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pull 45requests feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPull_45requestsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Permissions_45event_pull_45requests_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Permissions_45event_pull_45requests_feature", "_UI_Permissions_45event_type"),
				 GithubwfPackage.eINSTANCE.getPermissions_45event_Pull_45requests(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Repository 45projects feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepository_45projectsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Permissions_45event_repository_45projects_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Permissions_45event_repository_45projects_feature", "_UI_Permissions_45event_type"),
				 GithubwfPackage.eINSTANCE.getPermissions_45event_Repository_45projects(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Security 45events feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecurity_45eventsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Permissions_45event_security_45events_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Permissions_45event_security_45events_feature", "_UI_Permissions_45event_type"),
				 GithubwfPackage.eINSTANCE.getPermissions_45event_Security_45events(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Statuses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Permissions_45event_statuses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Permissions_45event_statuses_feature", "_UI_Permissions_45event_type"),
				 GithubwfPackage.eINSTANCE.getPermissions_45event_Statuses(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(GithubwfPackage.eINSTANCE.getPermissions_45event_Permissions_45event());
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Permissions_45event.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Permissions_45event"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_Permissions_45event_type");
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Permissions_45event.class)) {
			case GithubwfPackage.PERMISSIONS_45EVENT__PERMISSIONS_45EVENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getPermissions_45event_Permissions_45event(),
				 GithubwfFactory.eINSTANCE.createPermissions_45eventActions()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getPermissions_45event_Permissions_45event(),
				 GithubwfFactory.eINSTANCE.createPermissions_45eventChecks()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getPermissions_45event_Permissions_45event(),
				 GithubwfFactory.eINSTANCE.createPermissions_45eventContents()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getPermissions_45event_Permissions_45event(),
				 GithubwfFactory.eINSTANCE.createPermissions_45eventDeployments()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getPermissions_45event_Permissions_45event(),
				 GithubwfFactory.eINSTANCE.createPermissions_45eventDiscussions()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getPermissions_45event_Permissions_45event(),
				 GithubwfFactory.eINSTANCE.createPermissions_45eventId_45token()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getPermissions_45event_Permissions_45event(),
				 GithubwfFactory.eINSTANCE.createPermissions_45eventIssues()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getPermissions_45event_Permissions_45event(),
				 GithubwfFactory.eINSTANCE.createPermissions_45eventPackages()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getPermissions_45event_Permissions_45event(),
				 GithubwfFactory.eINSTANCE.createPermissions_45eventPages()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getPermissions_45event_Permissions_45event(),
				 GithubwfFactory.eINSTANCE.createPermissions_45eventPull_45requests()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getPermissions_45event_Permissions_45event(),
				 GithubwfFactory.eINSTANCE.createPermissions_45eventRepository_45projects()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getPermissions_45event_Permissions_45event(),
				 GithubwfFactory.eINSTANCE.createPermissions_45eventSecurity_45events()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getPermissions_45event_Permissions_45event(),
				 GithubwfFactory.eINSTANCE.createPermissions_45eventStatuses()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return GithubwfOptEditPlugin.INSTANCE;
	}

}
