/**
 */
package githubwf.impl;

import githubwf.EventObject;
import githubwf.GithubwfPackage;
import githubwf.GithubwfRootOnOneOf2;
import githubwf.GithubwfRootOnOneOf2PropertiesAbstract;
import githubwf.GithubwfRootOnOneOf2Schedule;
import githubwf.GithubwfRootOnOneOf2Workflow_callAbstract;
import githubwf.GithubwfRootOnOneOf2Workflow_dispatchAbstract;
import githubwf.Ref;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root On One Of2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getOn <em>On</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getBranch_protection_rule <em>Branch protection rule</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getCheck_run <em>Check run</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getCheck_suite <em>Check suite</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getCreate <em>Create</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getDelete <em>Delete</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getDeployment <em>Deployment</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getDeployment_status <em>Deployment status</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getDiscussion <em>Discussion</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getDiscussion_comment <em>Discussion comment</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getFork <em>Fork</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getGollum <em>Gollum</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getIssue_comment <em>Issue comment</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getIssues <em>Issues</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getLabel <em>Label</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getMember <em>Member</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getMerge_group <em>Merge group</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getMilestone <em>Milestone</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getPage_build <em>Page build</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getProject <em>Project</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getProject_card <em>Project card</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getProject_column <em>Project column</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getPublic_ <em>Public </em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getPull_request <em>Pull request</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getPull_request_review <em>Pull request review</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getPull_request_review_comment <em>Pull request review comment</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getPull_request_target <em>Pull request target</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getPush <em>Push</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getRegistry_package <em>Registry package</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getRelease <em>Release</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getStatus <em>Status</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getWatch <em>Watch</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getWorkflow_call <em>Workflow call</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getWorkflow_dispatch <em>Workflow dispatch</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getWorkflow_run <em>Workflow run</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getRepository_dispatch <em>Repository dispatch</em>}</li>
 *   <li>{@link githubwf.impl.GithubwfRootOnOneOf2Impl#getSchedule <em>Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GithubwfRootOnOneOf2Impl extends MinimalEObjectImpl.Container implements GithubwfRootOnOneOf2 {
	/**
	 * The cached value of the '{@link #getOn() <em>On</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOn()
	 * @generated
	 * @ordered
	 */
	protected EList<GithubwfRootOnOneOf2PropertiesAbstract> on;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfRootOnOneOf2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return GithubwfPackage.eINSTANCE.getGithubwfRootOnOneOf2();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<GithubwfRootOnOneOf2PropertiesAbstract> getOn() {
		if (on == null) {
			on = new EObjectContainmentEList<GithubwfRootOnOneOf2PropertiesAbstract>(GithubwfRootOnOneOf2PropertiesAbstract.class, this, GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__ON);
		}
		return on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getBranch_protection_rule() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Branch_protection_rule.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Branch_protection_rule.class::cast).map(instance->instance.getBranch_protection_rule()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getCheck_run() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Check_run.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Check_run.class::cast).map(instance->instance.getCheck_run()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getCheck_suite() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Check_suite.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Check_suite.class::cast).map(instance->instance.getCheck_suite()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getCreate() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Create.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Create.class::cast).map(instance->instance.getCreate()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getDelete() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Delete.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Delete.class::cast).map(instance->instance.getDelete()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getDeployment() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Deployment.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Deployment.class::cast).map(instance->instance.getDeployment()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getDeployment_status() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Deployment_status.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Deployment_status.class::cast).map(instance->instance.getDeployment_status()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getDiscussion() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Discussion.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Discussion.class::cast).map(instance->instance.getDiscussion()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getDiscussion_comment() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Discussion_comment.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Discussion_comment.class::cast).map(instance->instance.getDiscussion_comment()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getFork() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Fork.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Fork.class::cast).map(instance->instance.getFork()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getGollum() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Gollum.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Gollum.class::cast).map(instance->instance.getGollum()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getIssue_comment() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Issue_comment.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Issue_comment.class::cast).map(instance->instance.getIssue_comment()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getIssues() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Issues.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Issues.class::cast).map(instance->instance.getIssues()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getLabel() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Label.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Label.class::cast).map(instance->instance.getLabel()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getMember() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Member.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Member.class::cast).map(instance->instance.getMember()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getMerge_group() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Merge_group.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Merge_group.class::cast).map(instance->instance.getMerge_group()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getMilestone() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Milestone.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Milestone.class::cast).map(instance->instance.getMilestone()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getPage_build() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Page_build.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Page_build.class::cast).map(instance->instance.getPage_build()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getProject() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Project.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Project.class::cast).map(instance->instance.getProject()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getProject_card() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Project_card.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Project_card.class::cast).map(instance->instance.getProject_card()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getProject_column() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Project_column.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Project_column.class::cast).map(instance->instance.getProject_column()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getPublic_() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Public.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Public.class::cast).map(instance->instance.getPublic_()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ref getPull_request() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Pull_request.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Pull_request.class::cast).map(instance->instance.getPull_request()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getPull_request_review() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Pull_request_review.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Pull_request_review.class::cast).map(instance->instance.getPull_request_review()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getPull_request_review_comment() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Pull_request_review_comment.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Pull_request_review_comment.class::cast).map(instance->instance.getPull_request_review_comment()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ref getPull_request_target() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Pull_request_target.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Pull_request_target.class::cast).map(instance->instance.getPull_request_target()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ref getPush() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Push.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Push.class::cast).map(instance->instance.getPush()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getRegistry_package() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Registry_package.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Registry_package.class::cast).map(instance->instance.getRegistry_package()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getRelease() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Release.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Release.class::cast).map(instance->instance.getRelease()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getStatus() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Status.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Status.class::cast).map(instance->instance.getStatus()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getWatch() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Watch.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Watch.class::cast).map(instance->instance.getWatch()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callAbstract getWorkflow_call() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Workflow_call.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Workflow_call.class::cast).map(instance->instance.getWorkflow_call()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchAbstract getWorkflow_dispatch() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Workflow_dispatch.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Workflow_dispatch.class::cast).map(instance->instance.getWorkflow_dispatch()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getWorkflow_run() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Workflow_run.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Workflow_run.class::cast).map(instance->instance.getWorkflow_run()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject getRepository_dispatch() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Repository_dispatch.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Repository_dispatch.class::cast).map(instance->instance.getRepository_dispatch()).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Schedule getSchedule() {
		return this.getOn().stream().filter(githubwf.GithubwfRootOnOneOf2Schedule.class::isInstance).findAny().map(githubwf.GithubwfRootOnOneOf2Schedule.class::cast).orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object get(final String key) {
		if ("branch_protection_rule".equals(key) ){return this.getBranch_protection_rule();}
		
		if ("check_run".equals(key) ){return this.getCheck_run();}
		
		if ("check_suite".equals(key) ){return this.getCheck_suite();}
		
		if ("create".equals(key) ){return this.getCreate();}
		
		if ("delete".equals(key) ){return this.getDelete();}
		
		if ("deployment".equals(key) ){return this.getDeployment();}
		
		if ("deployment_status".equals(key) ){return this.getDeployment_status();}
		
		if ("discussion".equals(key) ){return this.getDiscussion();}
		
		if ("discussion_comment".equals(key) ){return this.getDiscussion_comment();}
		
		if ("fork".equals(key) ){return this.getFork();}
		
		if ("gollum".equals(key) ){return this.getGollum();}
		
		if ("issue_comment".equals(key) ){return this.getIssue_comment();}
		
		if ("issues".equals(key) ){return this.getIssues();}
		
		if ("label".equals(key) ){return this.getLabel();}
		
		if ("member".equals(key) ){return this.getMember();}
		
		if ("merge_group".equals(key) ){return this.getMerge_group();}
		
		if ("milestone".equals(key) ){return this.getMilestone();}
		
		if ("page_build".equals(key) ){return this.getPage_build();}
		
		if ("project".equals(key) ){return this.getProject();}
		
		if ("project_card".equals(key) ){return this.getProject_card();}
		
		if ("project_column".equals(key) ){return this.getProject_column();}
		
		if ("public_".equals(key) ){return this.getPublic_();}
		
		if ("pull_request".equals(key) ){return this.getPull_request();}
		
		if ("pull_request_review".equals(key) ){return this.getPull_request_review();}
		
		if ("pull_request_review_comment".equals(key) ){return this.getPull_request_review_comment();}
		
		if ("pull_request_target".equals(key) ){return this.getPull_request_target();}
		
		if ("push".equals(key) ){return this.getPush();}
		
		if ("registry_package".equals(key) ){return this.getRegistry_package();}
		
		if ("release".equals(key) ){return this.getRelease();}
		
		if ("status".equals(key) ){return this.getStatus();}
		
		if ("watch".equals(key) ){return this.getWatch();}
		
		if ("workflow_call".equals(key) ){return this.getWorkflow_call();}
		
		if ("workflow_dispatch".equals(key) ){return this.getWorkflow_dispatch();}
		
		if ("workflow_run".equals(key) ){return this.getWorkflow_run();}
		
		if ("repository_dispatch".equals(key) ){return this.getRepository_dispatch();}
		
		if ("schedule".equals(key) ){return this.getSchedule();}
		
		java.util.List<java.lang.Class> additionalOrPatternPropertyClasses = new java.util.ArrayList<java.lang.Class>();
		
		for (GithubwfRootOnOneOf2PropertiesAbstract child : this.getOn()){
			if (!java.util.Collections.disjoint(additionalOrPatternPropertyClasses, java.util.Arrays.asList(child.getClass().getInterfaces()))){
				try{
					java.lang.reflect.Field keyField = child.getClass().getDeclaredField("key");
					if (jku.se.atl.transformation.utils.Utils.getIdentifier(keyField.get(child).toString()).equals(key)) {
						java.lang.reflect.Field valueField = java.util.Arrays.asList(child.getClass().getDeclaredFields()).stream().filter(field -> field.getName().equals("additionalProperties") || field.getName().startsWith("patternProperties") ).findAny().get();
						return valueField.get(child);
					}
				} catch (Exception e) {
					e.printStackTrace();
					throw new RuntimeException(e);
				}
			}
		}
		return null;
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__ON:
				return ((InternalEList<?>)getOn()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__ON:
				return getOn();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__BRANCH_PROTECTION_RULE:
				return getBranch_protection_rule();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__CHECK_RUN:
				return getCheck_run();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__CHECK_SUITE:
				return getCheck_suite();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__CREATE:
				return getCreate();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__DELETE:
				return getDelete();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__DEPLOYMENT:
				return getDeployment();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__DEPLOYMENT_STATUS:
				return getDeployment_status();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__DISCUSSION:
				return getDiscussion();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__DISCUSSION_COMMENT:
				return getDiscussion_comment();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__FORK:
				return getFork();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__GOLLUM:
				return getGollum();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__ISSUE_COMMENT:
				return getIssue_comment();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__ISSUES:
				return getIssues();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__LABEL:
				return getLabel();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__MEMBER:
				return getMember();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__MERGE_GROUP:
				return getMerge_group();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__MILESTONE:
				return getMilestone();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PAGE_BUILD:
				return getPage_build();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PROJECT:
				return getProject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PROJECT_CARD:
				return getProject_card();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PROJECT_COLUMN:
				return getProject_column();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PUBLIC_:
				return getPublic_();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PULL_REQUEST:
				return getPull_request();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PULL_REQUEST_REVIEW:
				return getPull_request_review();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PULL_REQUEST_REVIEW_COMMENT:
				return getPull_request_review_comment();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PULL_REQUEST_TARGET:
				return getPull_request_target();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PUSH:
				return getPush();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__REGISTRY_PACKAGE:
				return getRegistry_package();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__RELEASE:
				return getRelease();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__STATUS:
				return getStatus();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__WATCH:
				return getWatch();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__WORKFLOW_CALL:
				return getWorkflow_call();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__WORKFLOW_DISPATCH:
				return getWorkflow_dispatch();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__WORKFLOW_RUN:
				return getWorkflow_run();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__REPOSITORY_DISPATCH:
				return getRepository_dispatch();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__SCHEDULE:
				return getSchedule();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__ON:
				getOn().clear();
				getOn().addAll((Collection<? extends GithubwfRootOnOneOf2PropertiesAbstract>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__ON:
				getOn().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__ON:
				return on != null && !on.isEmpty();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__BRANCH_PROTECTION_RULE:
				return getBranch_protection_rule() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__CHECK_RUN:
				return getCheck_run() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__CHECK_SUITE:
				return getCheck_suite() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__CREATE:
				return getCreate() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__DELETE:
				return getDelete() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__DEPLOYMENT:
				return getDeployment() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__DEPLOYMENT_STATUS:
				return getDeployment_status() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__DISCUSSION:
				return getDiscussion() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__DISCUSSION_COMMENT:
				return getDiscussion_comment() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__FORK:
				return getFork() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__GOLLUM:
				return getGollum() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__ISSUE_COMMENT:
				return getIssue_comment() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__ISSUES:
				return getIssues() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__LABEL:
				return getLabel() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__MEMBER:
				return getMember() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__MERGE_GROUP:
				return getMerge_group() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__MILESTONE:
				return getMilestone() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PAGE_BUILD:
				return getPage_build() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PROJECT:
				return getProject() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PROJECT_CARD:
				return getProject_card() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PROJECT_COLUMN:
				return getProject_column() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PUBLIC_:
				return getPublic_() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PULL_REQUEST:
				return getPull_request() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PULL_REQUEST_REVIEW:
				return getPull_request_review() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PULL_REQUEST_REVIEW_COMMENT:
				return getPull_request_review_comment() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PULL_REQUEST_TARGET:
				return getPull_request_target() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__PUSH:
				return getPush() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__REGISTRY_PACKAGE:
				return getRegistry_package() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__RELEASE:
				return getRelease() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__STATUS:
				return getStatus() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__WATCH:
				return getWatch() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__WORKFLOW_CALL:
				return getWorkflow_call() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__WORKFLOW_DISPATCH:
				return getWorkflow_dispatch() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__WORKFLOW_RUN:
				return getWorkflow_run() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__REPOSITORY_DISPATCH:
				return getRepository_dispatch() != null;
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2__SCHEDULE:
				return getSchedule() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2___GET__STRING:
				return get((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GithubwfRootOnOneOf2Impl
