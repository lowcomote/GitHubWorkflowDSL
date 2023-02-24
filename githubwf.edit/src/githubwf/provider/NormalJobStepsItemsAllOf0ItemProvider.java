/**
 */
package githubwf.provider;


import githubwf.GithubwfFactory;
import githubwf.GithubwfPackage;
import githubwf.NormalJobStepsItemsAllOf0;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link githubwf.NormalJobStepsItemsAllOf0} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NormalJobStepsItemsAllOf0ItemProvider 
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
	public NormalJobStepsItemsAllOf0ItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0_Items());
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
	 * This returns NormalJobStepsItemsAllOf0.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/NormalJobStepsItemsAllOf0"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_NormalJobStepsItemsAllOf0_type");
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

		switch (notification.getFeatureID(NormalJobStepsItemsAllOf0.class)) {
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0__ITEMS:
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
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf0TypeString()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf0TypeInteger()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf0TypeNumber()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf0TypeBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf0TypeObject()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf0TypeArray()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getNormalJobStepsItemsAllOf0_Items(),
				 GithubwfFactory.eINSTANCE.createNormalJobStepsItemsAllOf0TypeNull()));
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
