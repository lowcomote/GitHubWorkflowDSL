/**
 */
package githubwf.provider;


import githubwf.GithubwfFactory;
import githubwf.GithubwfPackage;
import githubwf.NormalJobStepsItemsAllOf1;

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
 * This is the item provider adapter for a {@link githubwf.NormalJobStepsItemsAllOf1} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NormalJobStepsItemsAllOf1ItemProvider 
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
	public NormalJobStepsItemsAllOf1ItemProvider(AdapterFactory adapterFactory) {
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

			addIdPropertyDescriptor(object);
			addIf_PropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addUsesPropertyDescriptor(object);
			addRunPropertyDescriptor(object);
			addWorking_45directoryPropertyDescriptor(object);
			addShellPropertyDescriptor(object);
			addWithPropertyDescriptor(object);
			addEnvPropertyDescriptor(object);
			addContinue_45on_45errorPropertyDescriptor(object);
			addTimeout_45minutesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NormalJobStepsItemsAllOf1_id_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJobStepsItemsAllOf1_id_feature", "_UI_NormalJobStepsItemsAllOf1_type"),
				 GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Id(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_NormalJobStepsItemsAllOf1_if__feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJobStepsItemsAllOf1_if__feature", "_UI_NormalJobStepsItemsAllOf1_type"),
				 GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_If_(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
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
				 getString("_UI_NormalJobStepsItemsAllOf1_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJobStepsItemsAllOf1_name_feature", "_UI_NormalJobStepsItemsAllOf1_type"),
				 GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Name(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
				 getString("_UI_NormalJobStepsItemsAllOf1_uses_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJobStepsItemsAllOf1_uses_feature", "_UI_NormalJobStepsItemsAllOf1_type"),
				 GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Uses(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Run feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRunPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NormalJobStepsItemsAllOf1_run_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJobStepsItemsAllOf1_run_feature", "_UI_NormalJobStepsItemsAllOf1_type"),
				 GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Run(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Working 45directory feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorking_45directoryPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NormalJobStepsItemsAllOf1_working_45directory_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJobStepsItemsAllOf1_working_45directory_feature", "_UI_NormalJobStepsItemsAllOf1_type"),
				 GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Working_45directory(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Shell feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShellPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_NormalJobStepsItemsAllOf1_shell_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJobStepsItemsAllOf1_shell_feature", "_UI_NormalJobStepsItemsAllOf1_type"),
				 GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Shell(),
				 false,
				 false,
				 false,
				 null,
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
				 getString("_UI_NormalJobStepsItemsAllOf1_with_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJobStepsItemsAllOf1_with_feature", "_UI_NormalJobStepsItemsAllOf1_type"),
				 GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_With(),
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
				 getString("_UI_NormalJobStepsItemsAllOf1_env_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJobStepsItemsAllOf1_env_feature", "_UI_NormalJobStepsItemsAllOf1_type"),
				 GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Env(),
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
				 getString("_UI_NormalJobStepsItemsAllOf1_continue_45on_45error_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJobStepsItemsAllOf1_continue_45on_45error_feature", "_UI_NormalJobStepsItemsAllOf1_type"),
				 GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Continue_45on_45error(),
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
				 getString("_UI_NormalJobStepsItemsAllOf1_timeout_45minutes_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_NormalJobStepsItemsAllOf1_timeout_45minutes_feature", "_UI_NormalJobStepsItemsAllOf1_type"),
				 GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Timeout_45minutes(),
				 false,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
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
			childrenFeatures.add(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Items());
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
	 * This returns NormalJobStepsItemsAllOf1.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NormalJobStepsItemsAllOf1"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((NormalJobStepsItemsAllOf1)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_NormalJobStepsItemsAllOf1_type") :
			getString("_UI_NormalJobStepsItemsAllOf1_type") + " " + label;
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

		switch (notification.getFeatureID(NormalJobStepsItemsAllOf1.class)) {
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__ID:
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__NAME:
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__USES:
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__RUN:
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__TIMEOUT_45MINUTES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1__ITEMS:
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
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf1Id()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf1If()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf1Name()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf1Uses()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf1Run()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf1Working_45directory()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf1Shell()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf1With()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf1Env()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf1Continue_45on_45error()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf1_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf1Timeout_45minutes()));
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
