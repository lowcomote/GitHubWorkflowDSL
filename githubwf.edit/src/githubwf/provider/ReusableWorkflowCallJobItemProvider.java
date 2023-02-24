/**
 */
package githubwf.provider;


import githubwf.GithubwfFactory;
import githubwf.GithubwfPackage;
import githubwf.ReusableWorkflowCallJob;

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
 * This is the item provider adapter for a {@link githubwf.ReusableWorkflowCallJob} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReusableWorkflowCallJobItemProvider 
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
	public ReusableWorkflowCallJobItemProvider(AdapterFactory adapterFactory) {
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
			addNeedsPropertyDescriptor(object);
			addPermissionsPropertyDescriptor(object);
			addIf_PropertyDescriptor(object);
			addUsesPropertyDescriptor(object);
			addWithPropertyDescriptor(object);
			addSecretsPropertyDescriptor(object);
			addStrategyPropertyDescriptor(object);
			addConcurrencyPropertyDescriptor(object);
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
				 getString("_UI_ReusableWorkflowCallJob_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReusableWorkflowCallJob_name_feature", "_UI_ReusableWorkflowCallJob_type"),
				 GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_Name(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Needs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNeedsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReusableWorkflowCallJob_needs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReusableWorkflowCallJob_needs_feature", "_UI_ReusableWorkflowCallJob_type"),
				 GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_Needs(),
				 false,
				 false,
				 false,
				 null,
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
				 getString("_UI_ReusableWorkflowCallJob_permissions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReusableWorkflowCallJob_permissions_feature", "_UI_ReusableWorkflowCallJob_type"),
				 GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_Permissions(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the If  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIf_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReusableWorkflowCallJob_if__feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReusableWorkflowCallJob_if__feature", "_UI_ReusableWorkflowCallJob_type"),
				 GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_If_(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Uses feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUsesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReusableWorkflowCallJob_uses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReusableWorkflowCallJob_uses_feature", "_UI_ReusableWorkflowCallJob_type"),
				 GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_Uses(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the With feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWithPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReusableWorkflowCallJob_with_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReusableWorkflowCallJob_with_feature", "_UI_ReusableWorkflowCallJob_type"),
				 GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_With(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Secrets feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSecretsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReusableWorkflowCallJob_secrets_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReusableWorkflowCallJob_secrets_feature", "_UI_ReusableWorkflowCallJob_type"),
				 GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_Secrets(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Strategy feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStrategyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReusableWorkflowCallJob_strategy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReusableWorkflowCallJob_strategy_feature", "_UI_ReusableWorkflowCallJob_type"),
				 GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_Strategy(),
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
				 getString("_UI_ReusableWorkflowCallJob_concurrency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReusableWorkflowCallJob_concurrency_feature", "_UI_ReusableWorkflowCallJob_type"),
				 GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_Concurrency(),
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
			childrenFeatures.add(GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_ReusableWorkflowCallJob());
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
	 * This returns ReusableWorkflowCallJob.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReusableWorkflowCallJob"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ReusableWorkflowCallJob)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_ReusableWorkflowCallJob_type") :
			getString("_UI_ReusableWorkflowCallJob_type") + " " + label;
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

		switch (notification.getFeatureID(ReusableWorkflowCallJob.class)) {
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__NAME:
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__USES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB__REUSABLE_WORKFLOW_CALL_JOB:
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
				(GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_ReusableWorkflowCallJob(),
				 GithubwfFactory.eINSTANCE.createReusableWorkflowCallJobName()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_ReusableWorkflowCallJob(),
				 GithubwfFactory.eINSTANCE.createReusableWorkflowCallJobNeeds()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_ReusableWorkflowCallJob(),
				 GithubwfFactory.eINSTANCE.createReusableWorkflowCallJobPermissions()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_ReusableWorkflowCallJob(),
				 GithubwfFactory.eINSTANCE.createReusableWorkflowCallJobIf()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_ReusableWorkflowCallJob(),
				 GithubwfFactory.eINSTANCE.createReusableWorkflowCallJobUses()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_ReusableWorkflowCallJob(),
				 GithubwfFactory.eINSTANCE.createReusableWorkflowCallJobWith()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_ReusableWorkflowCallJob(),
				 GithubwfFactory.eINSTANCE.createReusableWorkflowCallJobSecrets()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_ReusableWorkflowCallJob(),
				 GithubwfFactory.eINSTANCE.createReusableWorkflowCallJobStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getReusableWorkflowCallJob_ReusableWorkflowCallJob(),
				 GithubwfFactory.eINSTANCE.createReusableWorkflowCallJobConcurrency()));
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
