/**
 */
package githubwf.provider;


import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultItemProvider extends GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstractItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultItemProvider(AdapterFactory adapterFactory) {
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

			addDefault_PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Default  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDefault_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_default__feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_default__feature", "_UI_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_Default_(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Boolean labelValue = ((GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault)object).getDefault_();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_type") :
			getString("_UI_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_type") + " " + label;
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

		switch (notification.getFeatureID(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault.class)) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_DEFAULT__DEFAULT_:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

}
