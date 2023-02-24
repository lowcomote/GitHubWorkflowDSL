/**
 */
package githubwf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root On One Of2</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getOn <em>On</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getBranch_protection_rule <em>Branch protection rule</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getCheck_run <em>Check run</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getCheck_suite <em>Check suite</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getCreate <em>Create</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getDelete <em>Delete</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getDeployment_status <em>Deployment status</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getDiscussion <em>Discussion</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getDiscussion_comment <em>Discussion comment</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getFork <em>Fork</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getGollum <em>Gollum</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getIssue_comment <em>Issue comment</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getIssues <em>Issues</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getLabel <em>Label</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getMember <em>Member</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getMerge_group <em>Merge group</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getPage_build <em>Page build</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getProject <em>Project</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getProject_card <em>Project card</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getProject_column <em>Project column</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getPublic_ <em>Public </em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getPull_request <em>Pull request</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getPull_request_review <em>Pull request review</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getPull_request_review_comment <em>Pull request review comment</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getPull_request_target <em>Pull request target</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getPush <em>Push</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getRegistry_package <em>Registry package</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getRelease <em>Release</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getStatus <em>Status</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getWatch <em>Watch</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getWorkflow_call <em>Workflow call</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getWorkflow_dispatch <em>Workflow dispatch</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getWorkflow_run <em>Workflow run</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getRepository_dispatch <em>Repository dispatch</em>}</li>
 *   <li>{@link githubwf.GithubwfRootOnOneOf2#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2()
 * @model annotation="Type Type='object'"
 * @generated
 */
public interface GithubwfRootOnOneOf2 extends EObject {
	/**
	 * Returns the value of the '<em><b>On</b></em>' containment reference list.
	 * The list contents are of type {@link githubwf.GithubwfRootOnOneOf2PropertiesAbstract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>On</em>' containment reference list.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_On()
	 * @model containment="true"
	 *        annotation="Keyword Keyword='on'"
	 * @generated
	 */
	EList<GithubwfRootOnOneOf2PropertiesAbstract> getOn();

	/**
	 * Returns the value of the '<em><b>Branch protection rule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Branch protection rule</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Branch_protection_rule()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getBranch_protection_rule();

	/**
	 * Returns the value of the '<em><b>Check run</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check run</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Check_run()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getCheck_run();

	/**
	 * Returns the value of the '<em><b>Check suite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Check suite</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Check_suite()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getCheck_suite();

	/**
	 * Returns the value of the '<em><b>Create</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Create</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Create()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getCreate();

	/**
	 * Returns the value of the '<em><b>Delete</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delete</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Delete()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getDelete();

	/**
	 * Returns the value of the '<em><b>Deployment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Deployment()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getDeployment();

	/**
	 * Returns the value of the '<em><b>Deployment status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deployment status</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Deployment_status()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getDeployment_status();

	/**
	 * Returns the value of the '<em><b>Discussion</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussion</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Discussion()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getDiscussion();

	/**
	 * Returns the value of the '<em><b>Discussion comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussion comment</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Discussion_comment()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getDiscussion_comment();

	/**
	 * Returns the value of the '<em><b>Fork</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fork</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Fork()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getFork();

	/**
	 * Returns the value of the '<em><b>Gollum</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gollum</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Gollum()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getGollum();

	/**
	 * Returns the value of the '<em><b>Issue comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issue comment</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Issue_comment()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getIssue_comment();

	/**
	 * Returns the value of the '<em><b>Issues</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Issues</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Issues()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getIssues();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Label()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getLabel();

	/**
	 * Returns the value of the '<em><b>Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Member</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Member()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getMember();

	/**
	 * Returns the value of the '<em><b>Merge group</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Merge group</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Merge_group()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getMerge_group();

	/**
	 * Returns the value of the '<em><b>Milestone</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Milestone</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Milestone()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getMilestone();

	/**
	 * Returns the value of the '<em><b>Page build</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Page build</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Page_build()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getPage_build();

	/**
	 * Returns the value of the '<em><b>Project</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Project()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getProject();

	/**
	 * Returns the value of the '<em><b>Project card</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project card</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Project_card()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getProject_card();

	/**
	 * Returns the value of the '<em><b>Project column</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Project column</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Project_column()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getProject_column();

	/**
	 * Returns the value of the '<em><b>Public </b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public </em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Public_()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getPublic_();

	/**
	 * Returns the value of the '<em><b>Pull request</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pull request</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Pull_request()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Ref getPull_request();

	/**
	 * Returns the value of the '<em><b>Pull request review</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pull request review</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Pull_request_review()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getPull_request_review();

	/**
	 * Returns the value of the '<em><b>Pull request review comment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pull request review comment</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Pull_request_review_comment()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getPull_request_review_comment();

	/**
	 * Returns the value of the '<em><b>Pull request target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pull request target</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Pull_request_target()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Ref getPull_request_target();

	/**
	 * Returns the value of the '<em><b>Push</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Push</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Push()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	Ref getPush();

	/**
	 * Returns the value of the '<em><b>Registry package</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registry package</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Registry_package()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getRegistry_package();

	/**
	 * Returns the value of the '<em><b>Release</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Release</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Release()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getRelease();

	/**
	 * Returns the value of the '<em><b>Status</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Status()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getStatus();

	/**
	 * Returns the value of the '<em><b>Watch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Watch</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Watch()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getWatch();

	/**
	 * Returns the value of the '<em><b>Workflow call</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow call</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Workflow_call()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2Workflow_callAbstract getWorkflow_call();

	/**
	 * Returns the value of the '<em><b>Workflow dispatch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow dispatch</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Workflow_dispatch()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2Workflow_dispatchAbstract getWorkflow_dispatch();

	/**
	 * Returns the value of the '<em><b>Workflow run</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow run</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Workflow_run()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getWorkflow_run();

	/**
	 * Returns the value of the '<em><b>Repository dispatch</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repository dispatch</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Repository_dispatch()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	EventObject getRepository_dispatch();

	/**
	 * Returns the value of the '<em><b>Schedule</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Schedule</em>' reference.
	 * @see githubwf.GithubwfPackage#getGithubwfRootOnOneOf2_Schedule()
	 * @model resolveProxies="false" transient="true" changeable="false" volatile="true" derived="true" ordered="false" suppressedSetVisibility="true" suppressedIsSetVisibility="true" suppressedUnsetVisibility="true"
	 * @generated
	 */
	GithubwfRootOnOneOf2Schedule getSchedule();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" required="true" ordered="false" keyRequired="true"
	 * @generated
	 */
	Object get(String key);

} // GithubwfRootOnOneOf2
