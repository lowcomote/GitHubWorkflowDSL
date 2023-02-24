/**
 */
package githubwf.provider;


import githubwf.GithubwfFactory;
import githubwf.GithubwfPackage;
import githubwf.GithubwfRoot;

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
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link githubwf.GithubwfRoot} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GithubwfRootItemProvider 
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
	public GithubwfRootItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addOnPropertyDescriptor(object);
			addEnvPropertyDescriptor(object);
			addDefaultsPropertyDescriptor(object);
			addConcurrencyPropertyDescriptor(object);
			addJobsPropertyDescriptor(object);
			addRun_45namePropertyDescriptor(object);
			addPermissionsPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRoot_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRoot_name_feature", "_UI_GithubwfRoot_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRoot_Name(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the On feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRoot_on_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRoot_on_feature", "_UI_GithubwfRoot_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRoot_On(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Env feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnvPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRoot_env_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRoot_env_feature", "_UI_GithubwfRoot_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRoot_Env(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Defaults feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefaultsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRoot_defaults_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRoot_defaults_feature", "_UI_GithubwfRoot_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRoot_Defaults(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Concurrency feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConcurrencyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRoot_concurrency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRoot_concurrency_feature", "_UI_GithubwfRoot_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRoot_Concurrency(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Jobs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addJobsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRoot_jobs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRoot_jobs_feature", "_UI_GithubwfRoot_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRoot_Jobs(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Run 45name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRun_45namePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRoot_run_45name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRoot_run_45name_feature", "_UI_GithubwfRoot_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRoot_Run_45name(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Permissions feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPermissionsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRoot_permissions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRoot_permissions_feature", "_UI_GithubwfRoot_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRoot_Permissions(),
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
			childrenFeatures.add(GithubwfPackage.eINSTANCE.getGithubwfRoot_GithubwfRoot());
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
	 * This returns GithubwfRoot.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GithubwfRoot"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GithubwfRoot)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_GithubwfRoot_type") :
			getString("_UI_GithubwfRoot_type") + " " + label;
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

		switch (notification.getFeatureID(GithubwfRoot.class)) {
			case GithubwfPackage.GITHUBWF_ROOT__NAME:
			case GithubwfPackage.GITHUBWF_ROOT__RUN_45NAME:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GithubwfPackage.GITHUBWF_ROOT__GITHUBWF_ROOT:
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
				(GithubwfPackage.eINSTANCE.getGithubwfRoot_GithubwfRoot(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootName()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRoot_GithubwfRoot(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOn()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRoot_GithubwfRoot(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootEnv()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRoot_GithubwfRoot(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootDefaults()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRoot_GithubwfRoot(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootConcurrency()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRoot_GithubwfRoot(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootJobs()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRoot_GithubwfRoot(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootRun_45name()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRoot_GithubwfRoot(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootPermissions()));
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
