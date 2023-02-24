/**
 */
package githubwf.provider;


import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberItemProvider extends GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberItemProvider(AdapterFactory adapterFactory) {
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

			addPatternProperties0PropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Pattern Properties0 feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPatternProperties0PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber_patternProperties0_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber_patternProperties0_feature", "_UI_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber_PatternProperties0(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		Double labelValue = ((GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber)object).getPatternProperties0();
		String label = labelValue == null ? null : labelValue.toString();
		return label == null || label.length() == 0 ?
			getString("_UI_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber_type") :
			getString("_UI_GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber_type") + " " + label;
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

		switch (notification.getFeatureID(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber.class)) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_TYPE_NUMBER__PATTERN_PROPERTIES0:
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
