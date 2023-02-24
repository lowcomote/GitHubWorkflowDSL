/**
 */
package githubwf.provider;


import githubwf.GithubwfFactory;
import githubwf.GithubwfPackage;
import githubwf.NormalJob;

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
 * This is the item provider adapter for a {@link githubwf.NormalJob} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NormalJobItemProvider 
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
	public NormalJobItemProvider(AdapterFactory adapterFactory) {
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
			addRuns_45onPropertyDescriptor(object);
			addEnvironmentPropertyDescriptor(object);
			addOutputsPropertyDescriptor(object);
			addEnvPropertyDescriptor(object);
			addDefaultsPropertyDescriptor(object);
			addIf_PropertyDescriptor(object);
			addStepsPropertyDescriptor(object);
			addTimeout_45minutesPropertyDescriptor(object);
			addStrategyPropertyDescriptor(object);
			addContinue_45on_45errorPropertyDescriptor(object);
			addContainerPropertyDescriptor(object);
			addServicesPropertyDescriptor(object);
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
				 getString("_UI_NormalJob_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_name_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Name(),
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
				 getString("_UI_NormalJob_needs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_needs_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Needs(),
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
				 getString("_UI_NormalJob_permissions_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_permissions_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Permissions(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Runs 45on feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRuns_45onPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NormalJob_runs_45on_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_runs_45on_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Runs_45on(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Environment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEnvironmentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NormalJob_environment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_environment_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Environment(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Outputs feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NormalJob_outputs_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_outputs_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Outputs(),
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
				 getString("_UI_NormalJob_env_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_env_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Env(),
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
				 getString("_UI_NormalJob_defaults_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_defaults_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Defaults(),
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
				 getString("_UI_NormalJob_if__feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_if__feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_If_(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Steps feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStepsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NormalJob_steps_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_steps_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Steps(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Timeout 45minutes feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTimeout_45minutesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NormalJob_timeout_45minutes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_timeout_45minutes_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Timeout_45minutes(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_NormalJob_strategy_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_strategy_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Strategy(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Continue 45on 45error feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContinue_45on_45errorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NormalJob_continue_45on_45error_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_continue_45on_45error_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Continue_45on_45error(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Container feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addContainerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NormalJob_container_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_container_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Container(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Services feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addServicesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NormalJob_services_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_services_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Services(),
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
				 getString("_UI_NormalJob_concurrency_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJob_concurrency_feature", "_UI_NormalJob_type"),
				 GithubwfPackage.eINSTANCE.getNormalJob_Concurrency(),
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
			childrenFeatures.add(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob());
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
	 * This returns NormalJob.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NormalJob"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NormalJob)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NormalJob_type") :
			getString("_UI_NormalJob_type") + " " + label;
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

		switch (notification.getFeatureID(NormalJob.class)) {
			case GithubwfPackage.NORMAL_JOB__NAME:
			case GithubwfPackage.NORMAL_JOB__TIMEOUT_45MINUTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GithubwfPackage.NORMAL_JOB__NORMAL_JOB:
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
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobName()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobNeeds()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobPermissions()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobRuns_45on()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobEnvironment()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobOutputs()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobEnv()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobDefaults()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobIf()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobSteps()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobTimeout_45minutes()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobStrategy()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobContinue_45on_45error()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobContainer()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobServices()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJob_NormalJob(),
				 GithubwfFactory.eINSTANCE.createNormalJobConcurrency()));
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
