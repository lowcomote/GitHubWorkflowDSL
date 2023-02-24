/**
 */
package githubwf.provider;


import githubwf.GithubwfFactory;
import githubwf.GithubwfPackage;
import githubwf.RefTypeObject;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link githubwf.RefTypeObject} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RefTypeObjectItemProvider extends RefAbstractItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefTypeObjectItemProvider(AdapterFactory adapterFactory) {
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

			addBranchesPropertyDescriptor(object);
			addBranches_45ignorePropertyDescriptor(object);
			addTagsPropertyDescriptor(object);
			addTags_45ignorePropertyDescriptor(object);
			addPathsPropertyDescriptor(object);
			addPaths_45ignorePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Branches feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBranchesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RefTypeObject_branches_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RefTypeObject_branches_feature", "_UI_RefTypeObject_type"),
				 GithubwfPackage.eINSTANCE.getRefTypeObject_Branches(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Branches 45ignore feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBranches_45ignorePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RefTypeObject_branches_45ignore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RefTypeObject_branches_45ignore_feature", "_UI_RefTypeObject_type"),
				 GithubwfPackage.eINSTANCE.getRefTypeObject_Branches_45ignore(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tags feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTagsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RefTypeObject_tags_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RefTypeObject_tags_feature", "_UI_RefTypeObject_type"),
				 GithubwfPackage.eINSTANCE.getRefTypeObject_Tags(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Tags 45ignore feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTags_45ignorePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RefTypeObject_tags_45ignore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RefTypeObject_tags_45ignore_feature", "_UI_RefTypeObject_type"),
				 GithubwfPackage.eINSTANCE.getRefTypeObject_Tags_45ignore(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Paths feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPathsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RefTypeObject_paths_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RefTypeObject_paths_feature", "_UI_RefTypeObject_type"),
				 GithubwfPackage.eINSTANCE.getRefTypeObject_Paths(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Paths 45ignore feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPaths_45ignorePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_RefTypeObject_paths_45ignore_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_RefTypeObject_paths_45ignore_feature", "_UI_RefTypeObject_type"),
				 GithubwfPackage.eINSTANCE.getRefTypeObject_Paths_45ignore(),
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
			childrenFeatures.add(GithubwfPackage.eINSTANCE.getRefTypeObject_Ref());
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
	 * This returns RefTypeObject.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RefTypeObject"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_RefTypeObject_type");
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

		switch (notification.getFeatureID(RefTypeObject.class)) {
			case GithubwfPackage.REF_TYPE_OBJECT__REF:
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
				(GithubwfPackage.eINSTANCE.getRefTypeObject_Ref(),
				 GithubwfFactory.eINSTANCE.createRefBranches()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getRefTypeObject_Ref(),
				 GithubwfFactory.eINSTANCE.createRefBranches_45ignore()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getRefTypeObject_Ref(),
				 GithubwfFactory.eINSTANCE.createRefTags()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getRefTypeObject_Ref(),
				 GithubwfFactory.eINSTANCE.createRefTags_45ignore()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getRefTypeObject_Ref(),
				 GithubwfFactory.eINSTANCE.createRefPaths()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getRefTypeObject_Ref(),
				 GithubwfFactory.eINSTANCE.createRefPaths_45ignore()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getRefTypeObject_Ref(),
				 GithubwfFactory.eINSTANCE.createRefAdditionalProperties()));
	}

}
