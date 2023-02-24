/**
 */
package githubwf.provider;


import githubwf.GithubwfPackage;
import githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeStringItemProvider extends ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeStringItemProvider(AdapterFactory adapterFactory) {
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

			addAdditionalPropertiesPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Additional Properties feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAdditionalPropertiesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_additionalProperties_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_additionalProperties_feature", "_UI_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_type"),
				 GithubwfPackage.eINSTANCE.getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_AdditionalProperties(),
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This returns ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString)object).getAdditionalProperties();
		return label == null || label.length() == 0 ?
			getString("_UI_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_type") :
			getString("_UI_ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_type") + " " + label;
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

		switch (notification.getFeatureID(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString.class)) {
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_STRING__ADDITIONAL_PROPERTIES:
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
