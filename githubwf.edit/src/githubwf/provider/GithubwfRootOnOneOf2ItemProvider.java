/**
 */
package githubwf.provider;


import githubwf.GithubwfFactory;
import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2;

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
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link githubwf.GithubwfRootOnOneOf2} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class GithubwfRootOnOneOf2ItemProvider 
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
	public GithubwfRootOnOneOf2ItemProvider(AdapterFactory adapterFactory) {
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

			addBranch_protection_rulePropertyDescriptor(object);
			addCheck_runPropertyDescriptor(object);
			addCheck_suitePropertyDescriptor(object);
			addCreatePropertyDescriptor(object);
			addDeletePropertyDescriptor(object);
			addDeploymentPropertyDescriptor(object);
			addDeployment_statusPropertyDescriptor(object);
			addDiscussionPropertyDescriptor(object);
			addDiscussion_commentPropertyDescriptor(object);
			addForkPropertyDescriptor(object);
			addGollumPropertyDescriptor(object);
			addIssue_commentPropertyDescriptor(object);
			addIssuesPropertyDescriptor(object);
			addLabelPropertyDescriptor(object);
			addMemberPropertyDescriptor(object);
			addMerge_groupPropertyDescriptor(object);
			addMilestonePropertyDescriptor(object);
			addPage_buildPropertyDescriptor(object);
			addProjectPropertyDescriptor(object);
			addProject_cardPropertyDescriptor(object);
			addProject_columnPropertyDescriptor(object);
			addPublic_PropertyDescriptor(object);
			addPull_requestPropertyDescriptor(object);
			addPull_request_reviewPropertyDescriptor(object);
			addPull_request_review_commentPropertyDescriptor(object);
			addPull_request_targetPropertyDescriptor(object);
			addPushPropertyDescriptor(object);
			addRegistry_packagePropertyDescriptor(object);
			addReleasePropertyDescriptor(object);
			addStatusPropertyDescriptor(object);
			addWatchPropertyDescriptor(object);
			addWorkflow_callPropertyDescriptor(object);
			addWorkflow_dispatchPropertyDescriptor(object);
			addWorkflow_runPropertyDescriptor(object);
			addRepository_dispatchPropertyDescriptor(object);
			addSchedulePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Branch protection rule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addBranch_protection_rulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_branch_protection_rule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_branch_protection_rule_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Branch_protection_rule(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Check run feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheck_runPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_check_run_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_check_run_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Check_run(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Check suite feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCheck_suitePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_check_suite_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_check_suite_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Check_suite(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Create feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addCreatePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_create_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_create_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Create(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Delete feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeletePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_delete_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_delete_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Delete(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deployment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeploymentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_deployment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_deployment_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Deployment(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Deployment status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeployment_statusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_deployment_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_deployment_status_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Deployment_status(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Discussion feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiscussionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_discussion_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_discussion_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Discussion(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Discussion comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDiscussion_commentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_discussion_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_discussion_comment_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Discussion_comment(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Fork feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addForkPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_fork_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_fork_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Fork(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Gollum feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addGollumPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_gollum_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_gollum_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Gollum(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Issue comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIssue_commentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_issue_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_issue_comment_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Issue_comment(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Issues feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIssuesPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_issues_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_issues_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Issues(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Label feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addLabelPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_label_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_label_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Label(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_member_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_member_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Member(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Merge group feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMerge_groupPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_merge_group_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_merge_group_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Merge_group(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Milestone feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMilestonePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_milestone_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_milestone_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Milestone(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Page build feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPage_buildPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_page_build_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_page_build_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Page_build(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_project_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_project_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Project(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project card feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProject_cardPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_project_card_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_project_card_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Project_card(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Project column feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addProject_columnPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_project_column_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_project_column_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Project_column(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Public  feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPublic_PropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_public__feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_public__feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Public_(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pull request feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPull_requestPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_pull_request_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_pull_request_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Pull_request(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pull request review feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPull_request_reviewPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_pull_request_review_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_pull_request_review_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Pull_request_review(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pull request review comment feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPull_request_review_commentPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_pull_request_review_comment_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_pull_request_review_comment_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Pull_request_review_comment(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Pull request target feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPull_request_targetPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_pull_request_target_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_pull_request_target_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Pull_request_target(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Push feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPushPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_push_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_push_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Push(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Registry package feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRegistry_packagePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_registry_package_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_registry_package_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Registry_package(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Release feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addReleasePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_release_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_release_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Release(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Status feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addStatusPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_status_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_status_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Status(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Watch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWatchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_watch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_watch_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Watch(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Workflow call feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkflow_callPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_workflow_call_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_workflow_call_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Workflow_call(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Workflow dispatch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkflow_dispatchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_workflow_dispatch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_workflow_dispatch_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Workflow_dispatch(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Workflow run feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addWorkflow_runPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_workflow_run_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_workflow_run_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Workflow_run(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Repository dispatch feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addRepository_dispatchPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_repository_dispatch_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_repository_dispatch_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Repository_dispatch(),
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Schedule feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSchedulePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_GithubwfRootOnOneOf2_schedule_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_GithubwfRootOnOneOf2_schedule_feature", "_UI_GithubwfRootOnOneOf2_type"),
				 GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_Schedule(),
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
			childrenFeatures.add(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On());
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
	 * This returns GithubwfRootOnOneOf2.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/GithubwfRootOnOneOf2"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_GithubwfRootOnOneOf2_type");
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

		switch (notification.getFeatureID(GithubwfRootOnOneOf2.class)) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__ON:
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
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Branch_protection_rule()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Check_run()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Check_suite()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Create()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Delete()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Deployment()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Deployment_status()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Discussion()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Discussion_comment()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Fork()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Gollum()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Issue_comment()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Issues()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Label()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Member()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Merge_group()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Milestone()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Page_build()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Project()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Project_card()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Project_column()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Public()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Pull_request()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Pull_request_review()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Pull_request_review_comment()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Pull_request_target()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Push()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Registry_package()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Release()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Status()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Watch()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Workflow_call()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Workflow_dispatch()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Workflow_run()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Repository_dispatch()));

		newChildDescriptors.add
			(createChildParameter
				(GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2_On(),
				 GithubwfFactory.eINSTANCE.createGithubwfRootOnOneOf2Schedule()));
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
