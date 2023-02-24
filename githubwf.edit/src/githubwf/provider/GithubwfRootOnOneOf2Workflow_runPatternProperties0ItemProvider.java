/**
 */
package githubwf.provider;


import githubwf.GithubwfFactory;
import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_runPatternProperties0ItemProvider extends GithubwfRootOnOneOf2Workflow_runPropertiesAbstractItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubwfRootOnOneOf2Workflow_runPatternProperties0ItemProvider(AdapterFactory adapterFactory) {
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

			addKeyPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Key feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addKeyPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2Workflow_runPatternProperties0_key_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2Workflow_runPatternProperties0_key_feature", "_UI_GithubwfRootOnOneOf2Workflow_runPatternProperties0_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_runPatternProperties0_Key(),
				 true,
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
			childrenFeatures.add(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_runPatternProperties0_PatternProperties0());
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
	 * This returns GithubwfRootOnOneOf2Workflow_runPatternProperties0.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GithubwfRootOnOneOf2Workflow_runPatternProperties0"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((GithubwfRootOnOneOf2Workflow_runPatternProperties0)object).getKey();
		return label == null || label.length() == 0 ?
			getString("_UI_GithubwfRootOnOneOf2Workflow_runPatternProperties0_type") :
			getString("_UI_GithubwfRootOnOneOf2Workflow_runPatternProperties0_type") + " " + label;
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

		switch (notification.getFeatureID(GithubwfRootOnOneOf2Workflow_runPatternProperties0.class)) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_PATTERN_PROPERTIES0__KEY:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_PATTERN_PROPERTIES0__PATTERN_PROPERTIES0:
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
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_runPatternProperties0_PatternProperties0(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeString()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_runPatternProperties0_PatternProperties0(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeInteger()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_runPatternProperties0_PatternProperties0(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumber()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_runPatternProperties0_PatternProperties0(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_runPatternProperties0_PatternProperties0(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_runPatternProperties0_PatternProperties0(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArray()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_runPatternProperties0_PatternProperties0(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNull()));
	}

}
