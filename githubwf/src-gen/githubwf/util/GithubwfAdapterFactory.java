/**
 */
package githubwf.util;

import githubwf.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see githubwf.GithubwfPackage
 * @generated
 */
public class GithubwfAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static GithubwfPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubwfAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = GithubwfPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GithubwfSwitch<Adapter> modelSwitch =
		new GithubwfSwitch<Adapter>() {
			@Override
			public Adapter caseEventObjectAdditionalProperties(EventObjectAdditionalProperties object) {
				return createEventObjectAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRoot(GithubwfRoot object) {
				return createGithubwfRootAdapter();
			}
			@Override
			public Adapter caseArchitecture(Architecture object) {
				return createArchitectureAdapter();
			}
			@Override
			public Adapter caseBranch(Branch object) {
				return createBranchAdapter();
			}
			@Override
			public Adapter caseConcurrency(Concurrency object) {
				return createConcurrencyAdapter();
			}
			@Override
			public Adapter caseConcurrencyGroup(ConcurrencyGroup object) {
				return createConcurrencyGroupAdapter();
			}
			@Override
			public Adapter caseConcurrencyCancel_45in_45progress(ConcurrencyCancel_45in_45progress object) {
				return createConcurrencyCancel_45in_45progressAdapter();
			}
			@Override
			public Adapter caseConcurrencyCancel_45in_45progressOneOf0(ConcurrencyCancel_45in_45progressOneOf0 object) {
				return createConcurrencyCancel_45in_45progressOneOf0Adapter();
			}
			@Override
			public Adapter caseConcurrencyCancel_45in_45progressOneOf1(ConcurrencyCancel_45in_45progressOneOf1 object) {
				return createConcurrencyCancel_45in_45progressOneOf1Adapter();
			}
			@Override
			public Adapter caseConfiguration(Configuration object) {
				return createConfigurationAdapter();
			}
			@Override
			public Adapter caseConfigurationOneOf0(ConfigurationOneOf0 object) {
				return createConfigurationOneOf0Adapter();
			}
			@Override
			public Adapter caseConfigurationOneOf1(ConfigurationOneOf1 object) {
				return createConfigurationOneOf1Adapter();
			}
			@Override
			public Adapter caseConfigurationOneOf2(ConfigurationOneOf2 object) {
				return createConfigurationOneOf2Adapter();
			}
			@Override
			public Adapter caseConfigurationOneOf3(ConfigurationOneOf3 object) {
				return createConfigurationOneOf3Adapter();
			}
			@Override
			public Adapter caseConfigurationOneOf3AdditionalProperties(ConfigurationOneOf3AdditionalProperties object) {
				return createConfigurationOneOf3AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseConfigurationOneOf4(ConfigurationOneOf4 object) {
				return createConfigurationOneOf4Adapter();
			}
			@Override
			public Adapter caseConfigurationOneOf4Items(ConfigurationOneOf4Items object) {
				return createConfigurationOneOf4ItemsAdapter();
			}
			@Override
			public Adapter caseContainer(Container object) {
				return createContainerAdapter();
			}
			@Override
			public Adapter caseContainerImage(ContainerImage object) {
				return createContainerImageAdapter();
			}
			@Override
			public Adapter caseContainerCredentials(ContainerCredentials object) {
				return createContainerCredentialsAdapter();
			}
			@Override
			public Adapter caseContainerCredentialsUsername(ContainerCredentialsUsername object) {
				return createContainerCredentialsUsernameAdapter();
			}
			@Override
			public Adapter caseContainerCredentialsPassword(ContainerCredentialsPassword object) {
				return createContainerCredentialsPasswordAdapter();
			}
			@Override
			public Adapter caseContainerEnv(ContainerEnv object) {
				return createContainerEnvAdapter();
			}
			@Override
			public Adapter caseContainerPorts(ContainerPorts object) {
				return createContainerPortsAdapter();
			}
			@Override
			public Adapter caseContainerPortsItems(ContainerPortsItems object) {
				return createContainerPortsItemsAdapter();
			}
			@Override
			public Adapter caseContainerPortsItemsOneOf0(ContainerPortsItemsOneOf0 object) {
				return createContainerPortsItemsOneOf0Adapter();
			}
			@Override
			public Adapter caseContainerPortsItemsOneOf1(ContainerPortsItemsOneOf1 object) {
				return createContainerPortsItemsOneOf1Adapter();
			}
			@Override
			public Adapter caseContainerVolumes(ContainerVolumes object) {
				return createContainerVolumesAdapter();
			}
			@Override
			public Adapter caseContainerVolumesItems(ContainerVolumesItems object) {
				return createContainerVolumesItemsAdapter();
			}
			@Override
			public Adapter caseContainerOptions(ContainerOptions object) {
				return createContainerOptionsAdapter();
			}
			@Override
			public Adapter caseDefaults(Defaults object) {
				return createDefaultsAdapter();
			}
			@Override
			public Adapter caseDefaultsRun(DefaultsRun object) {
				return createDefaultsRunAdapter();
			}
			@Override
			public Adapter caseDefaultsRunShell(DefaultsRunShell object) {
				return createDefaultsRunShellAdapter();
			}
			@Override
			public Adapter caseDefaultsRunWorking_45directory(DefaultsRunWorking_45directory object) {
				return createDefaultsRunWorking_45directoryAdapter();
			}
			@Override
			public Adapter casePermissions(Permissions object) {
				return createPermissionsAdapter();
			}
			@Override
			public Adapter casePermissionsOneOf0(PermissionsOneOf0 object) {
				return createPermissionsOneOf0Adapter();
			}
			@Override
			public Adapter casePermissionsOneOf1(PermissionsOneOf1 object) {
				return createPermissionsOneOf1Adapter();
			}
			@Override
			public Adapter casePermissions_45event(Permissions_45event object) {
				return createPermissions_45eventAdapter();
			}
			@Override
			public Adapter casePermissions_45eventActions(Permissions_45eventActions object) {
				return createPermissions_45eventActionsAdapter();
			}
			@Override
			public Adapter casePermissions_45eventChecks(Permissions_45eventChecks object) {
				return createPermissions_45eventChecksAdapter();
			}
			@Override
			public Adapter casePermissions_45eventContents(Permissions_45eventContents object) {
				return createPermissions_45eventContentsAdapter();
			}
			@Override
			public Adapter casePermissions_45eventDeployments(Permissions_45eventDeployments object) {
				return createPermissions_45eventDeploymentsAdapter();
			}
			@Override
			public Adapter casePermissions_45eventDiscussions(Permissions_45eventDiscussions object) {
				return createPermissions_45eventDiscussionsAdapter();
			}
			@Override
			public Adapter casePermissions_45eventId_45token(Permissions_45eventId_45token object) {
				return createPermissions_45eventId_45tokenAdapter();
			}
			@Override
			public Adapter casePermissions_45eventIssues(Permissions_45eventIssues object) {
				return createPermissions_45eventIssuesAdapter();
			}
			@Override
			public Adapter casePermissions_45eventPackages(Permissions_45eventPackages object) {
				return createPermissions_45eventPackagesAdapter();
			}
			@Override
			public Adapter casePermissions_45eventPages(Permissions_45eventPages object) {
				return createPermissions_45eventPagesAdapter();
			}
			@Override
			public Adapter casePermissions_45eventPull_45requests(Permissions_45eventPull_45requests object) {
				return createPermissions_45eventPull_45requestsAdapter();
			}
			@Override
			public Adapter casePermissions_45eventRepository_45projects(Permissions_45eventRepository_45projects object) {
				return createPermissions_45eventRepository_45projectsAdapter();
			}
			@Override
			public Adapter casePermissions_45eventSecurity_45events(Permissions_45eventSecurity_45events object) {
				return createPermissions_45eventSecurity_45eventsAdapter();
			}
			@Override
			public Adapter casePermissions_45eventStatuses(Permissions_45eventStatuses object) {
				return createPermissions_45eventStatusesAdapter();
			}
			@Override
			public Adapter casePermissions_45level(Permissions_45level object) {
				return createPermissions_45levelAdapter();
			}
			@Override
			public Adapter caseEnv(Env object) {
				return createEnvAdapter();
			}
			@Override
			public Adapter caseEnvOneOf0(EnvOneOf0 object) {
				return createEnvOneOf0Adapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalProperties(EnvOneOf0AdditionalProperties object) {
				return createEnvOneOf0AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalPropertiesOneOf0(EnvOneOf0AdditionalPropertiesOneOf0 object) {
				return createEnvOneOf0AdditionalPropertiesOneOf0Adapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalPropertiesOneOf1(EnvOneOf0AdditionalPropertiesOneOf1 object) {
				return createEnvOneOf0AdditionalPropertiesOneOf1Adapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalPropertiesOneOf2(EnvOneOf0AdditionalPropertiesOneOf2 object) {
				return createEnvOneOf0AdditionalPropertiesOneOf2Adapter();
			}
			@Override
			public Adapter caseEnvOneOf1(EnvOneOf1 object) {
				return createEnvOneOf1Adapter();
			}
			@Override
			public Adapter caseEnvironment(Environment object) {
				return createEnvironmentAdapter();
			}
			@Override
			public Adapter caseEnvironmentName(EnvironmentName object) {
				return createEnvironmentNameAdapter();
			}
			@Override
			public Adapter caseEnvironmentUrl(EnvironmentUrl object) {
				return createEnvironmentUrlAdapter();
			}
			@Override
			public Adapter caseEvent(Event object) {
				return createEventAdapter();
			}
			@Override
			public Adapter caseEventObject(EventObject object) {
				return createEventObjectAdapter();
			}
			@Override
			public Adapter caseEventObjectOneOf0(EventObjectOneOf0 object) {
				return createEventObjectOneOf0Adapter();
			}
			@Override
			public Adapter caseEventObjectOneOf1(EventObjectOneOf1 object) {
				return createEventObjectOneOf1Adapter();
			}
			@Override
			public Adapter caseExpressionSyntax(ExpressionSyntax object) {
				return createExpressionSyntaxAdapter();
			}
			@Override
			public Adapter caseStringContainingExpressionSyntax(StringContainingExpressionSyntax object) {
				return createStringContainingExpressionSyntaxAdapter();
			}
			@Override
			public Adapter caseGlobs(Globs object) {
				return createGlobsAdapter();
			}
			@Override
			public Adapter caseGlobsItems(GlobsItems object) {
				return createGlobsItemsAdapter();
			}
			@Override
			public Adapter caseMachine(Machine object) {
				return createMachineAdapter();
			}
			@Override
			public Adapter caseName(Name object) {
				return createNameAdapter();
			}
			@Override
			public Adapter casePath(Path object) {
				return createPathAdapter();
			}
			@Override
			public Adapter caseRef(Ref object) {
				return createRefAdapter();
			}
			@Override
			public Adapter caseRefBranches(RefBranches object) {
				return createRefBranchesAdapter();
			}
			@Override
			public Adapter caseRefBranches_45ignore(RefBranches_45ignore object) {
				return createRefBranches_45ignoreAdapter();
			}
			@Override
			public Adapter caseRefTags(RefTags object) {
				return createRefTagsAdapter();
			}
			@Override
			public Adapter caseRefTags_45ignore(RefTags_45ignore object) {
				return createRefTags_45ignoreAdapter();
			}
			@Override
			public Adapter caseRefPaths(RefPaths object) {
				return createRefPathsAdapter();
			}
			@Override
			public Adapter caseRefPaths_45ignore(RefPaths_45ignore object) {
				return createRefPaths_45ignoreAdapter();
			}
			@Override
			public Adapter caseRefOneOf0(RefOneOf0 object) {
				return createRefOneOf0Adapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0(RefOneOf0AllOf0 object) {
				return createRefOneOf0AllOf0Adapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0Not(RefOneOf0AllOf0Not object) {
				return createRefOneOf0AllOf0NotAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1(RefOneOf0AllOf1 object) {
				return createRefOneOf0AllOf1Adapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1Not(RefOneOf0AllOf1Not object) {
				return createRefOneOf0AllOf1NotAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2(RefOneOf0AllOf2 object) {
				return createRefOneOf0AllOf2Adapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2Not(RefOneOf0AllOf2Not object) {
				return createRefOneOf0AllOf2NotAdapter();
			}
			@Override
			public Adapter caseRefOneOf1(RefOneOf1 object) {
				return createRefOneOf1Adapter();
			}
			@Override
			public Adapter caseShell(Shell object) {
				return createShellAdapter();
			}
			@Override
			public Adapter caseShellAnyOf0(ShellAnyOf0 object) {
				return createShellAnyOf0Adapter();
			}
			@Override
			public Adapter caseShellAnyOf1(ShellAnyOf1 object) {
				return createShellAnyOf1Adapter();
			}
			@Override
			public Adapter caseTypes(Types object) {
				return createTypesAdapter();
			}
			@Override
			public Adapter caseWorking_45directory(Working_45directory object) {
				return createWorking_45directoryAdapter();
			}
			@Override
			public Adapter caseJobNeeds(JobNeeds object) {
				return createJobNeedsAdapter();
			}
			@Override
			public Adapter caseJobNeedsOneOf0(JobNeedsOneOf0 object) {
				return createJobNeedsOneOf0Adapter();
			}
			@Override
			public Adapter caseJobNeedsOneOf0Items(JobNeedsOneOf0Items object) {
				return createJobNeedsOneOf0ItemsAdapter();
			}
			@Override
			public Adapter caseJobNeedsOneOf1(JobNeedsOneOf1 object) {
				return createJobNeedsOneOf1Adapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJob(ReusableWorkflowCallJob object) {
				return createReusableWorkflowCallJobAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobName(ReusableWorkflowCallJobName object) {
				return createReusableWorkflowCallJobNameAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobNeeds(ReusableWorkflowCallJobNeeds object) {
				return createReusableWorkflowCallJobNeedsAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobPermissions(ReusableWorkflowCallJobPermissions object) {
				return createReusableWorkflowCallJobPermissionsAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobIf(ReusableWorkflowCallJobIf object) {
				return createReusableWorkflowCallJobIfAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobUses(ReusableWorkflowCallJobUses object) {
				return createReusableWorkflowCallJobUsesAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobWith(ReusableWorkflowCallJobWith object) {
				return createReusableWorkflowCallJobWithAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobSecrets(ReusableWorkflowCallJobSecrets object) {
				return createReusableWorkflowCallJobSecretsAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobSecretsOneOf0(ReusableWorkflowCallJobSecretsOneOf0 object) {
				return createReusableWorkflowCallJobSecretsOneOf0Adapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobSecretsOneOf1(ReusableWorkflowCallJobSecretsOneOf1 object) {
				return createReusableWorkflowCallJobSecretsOneOf1Adapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategy(ReusableWorkflowCallJobStrategy object) {
				return createReusableWorkflowCallJobStrategyAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrix(ReusableWorkflowCallJobStrategyMatrix object) {
				return createReusableWorkflowCallJobStrategyMatrixAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixOneOf0(ReusableWorkflowCallJobStrategyMatrixOneOf0 object) {
				return createReusableWorkflowCallJobStrategyMatrixOneOf0Adapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixOneOf1(ReusableWorkflowCallJobStrategyMatrixOneOf1 object) {
				return createReusableWorkflowCallJobStrategyMatrixOneOf1Adapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixPatternProperties0(ReusableWorkflowCallJobStrategyMatrixPatternProperties0 object) {
				return createReusableWorkflowCallJobStrategyMatrixPatternProperties0Adapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixPatternProperties0Items(ReusableWorkflowCallJobStrategyMatrixPatternProperties0Items object) {
				return createReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties(ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties object) {
				return createReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalProperties(ReusableWorkflowCallJobStrategyMatrixAdditionalProperties object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0 object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Adapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0ItemsAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1 object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Adapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyFail_45fast(ReusableWorkflowCallJobStrategyFail_45fast object) {
				return createReusableWorkflowCallJobStrategyFail_45fastAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMax_45parallel(ReusableWorkflowCallJobStrategyMax_45parallel object) {
				return createReusableWorkflowCallJobStrategyMax_45parallelAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobConcurrency(ReusableWorkflowCallJobConcurrency object) {
				return createReusableWorkflowCallJobConcurrencyAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobConcurrencyOneOf0(ReusableWorkflowCallJobConcurrencyOneOf0 object) {
				return createReusableWorkflowCallJobConcurrencyOneOf0Adapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobConcurrencyOneOf1(ReusableWorkflowCallJobConcurrencyOneOf1 object) {
				return createReusableWorkflowCallJobConcurrencyOneOf1Adapter();
			}
			@Override
			public Adapter caseNormalJob(NormalJob object) {
				return createNormalJobAdapter();
			}
			@Override
			public Adapter caseNormalJobName(NormalJobName object) {
				return createNormalJobNameAdapter();
			}
			@Override
			public Adapter caseNormalJobNeeds(NormalJobNeeds object) {
				return createNormalJobNeedsAdapter();
			}
			@Override
			public Adapter caseNormalJobPermissions(NormalJobPermissions object) {
				return createNormalJobPermissionsAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45on(NormalJobRuns_45on object) {
				return createNormalJobRuns_45onAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf0(NormalJobRuns_45onOneOf0 object) {
				return createNormalJobRuns_45onOneOf0Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1(NormalJobRuns_45onOneOf1 object) {
				return createNormalJobRuns_45onOneOf1Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf0(NormalJobRuns_45onOneOf1AnyOf0 object) {
				return createNormalJobRuns_45onOneOf1AnyOf0Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf0Items0(NormalJobRuns_45onOneOf1AnyOf0Items0 object) {
				return createNormalJobRuns_45onOneOf1AnyOf0Items0Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf0AdditionalItems(NormalJobRuns_45onOneOf1AnyOf0AdditionalItems object) {
				return createNormalJobRuns_45onOneOf1AnyOf0AdditionalItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1(NormalJobRuns_45onOneOf1AnyOf1 object) {
				return createNormalJobRuns_45onOneOf1AnyOf1Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1Items0(NormalJobRuns_45onOneOf1AnyOf1Items0 object) {
				return createNormalJobRuns_45onOneOf1AnyOf1Items0Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1Items1(NormalJobRuns_45onOneOf1AnyOf1Items1 object) {
				return createNormalJobRuns_45onOneOf1AnyOf1Items1Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1AdditionalItems(NormalJobRuns_45onOneOf1AnyOf1AdditionalItems object) {
				return createNormalJobRuns_45onOneOf1AnyOf1AdditionalItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2(NormalJobRuns_45onOneOf1AnyOf2 object) {
				return createNormalJobRuns_45onOneOf1AnyOf2Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2Items0(NormalJobRuns_45onOneOf1AnyOf2Items0 object) {
				return createNormalJobRuns_45onOneOf1AnyOf2Items0Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2Items1(NormalJobRuns_45onOneOf1AnyOf2Items1 object) {
				return createNormalJobRuns_45onOneOf1AnyOf2Items1Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2AdditionalItems(NormalJobRuns_45onOneOf1AnyOf2AdditionalItems object) {
				return createNormalJobRuns_45onOneOf1AnyOf2AdditionalItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3(NormalJobRuns_45onOneOf1AnyOf3 object) {
				return createNormalJobRuns_45onOneOf1AnyOf3Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3Items0(NormalJobRuns_45onOneOf1AnyOf3Items0 object) {
				return createNormalJobRuns_45onOneOf1AnyOf3Items0Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3Items1(NormalJobRuns_45onOneOf1AnyOf3Items1 object) {
				return createNormalJobRuns_45onOneOf1AnyOf3Items1Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3Items2(NormalJobRuns_45onOneOf1AnyOf3Items2 object) {
				return createNormalJobRuns_45onOneOf1AnyOf3Items2Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3AdditionalItems(NormalJobRuns_45onOneOf1AnyOf3AdditionalItems object) {
				return createNormalJobRuns_45onOneOf1AnyOf3AdditionalItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4(NormalJobRuns_45onOneOf1AnyOf4 object) {
				return createNormalJobRuns_45onOneOf1AnyOf4Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4Items0(NormalJobRuns_45onOneOf1AnyOf4Items0 object) {
				return createNormalJobRuns_45onOneOf1AnyOf4Items0Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4Items1(NormalJobRuns_45onOneOf1AnyOf4Items1 object) {
				return createNormalJobRuns_45onOneOf1AnyOf4Items1Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4Items2(NormalJobRuns_45onOneOf1AnyOf4Items2 object) {
				return createNormalJobRuns_45onOneOf1AnyOf4Items2Adapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4AdditionalItems(NormalJobRuns_45onOneOf1AnyOf4AdditionalItems object) {
				return createNormalJobRuns_45onOneOf1AnyOf4AdditionalItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf2(NormalJobRuns_45onOneOf2 object) {
				return createNormalJobRuns_45onOneOf2Adapter();
			}
			@Override
			public Adapter caseNormalJobEnvironment(NormalJobEnvironment object) {
				return createNormalJobEnvironmentAdapter();
			}
			@Override
			public Adapter caseNormalJobEnvironmentOneOf0(NormalJobEnvironmentOneOf0 object) {
				return createNormalJobEnvironmentOneOf0Adapter();
			}
			@Override
			public Adapter caseNormalJobEnvironmentOneOf1(NormalJobEnvironmentOneOf1 object) {
				return createNormalJobEnvironmentOneOf1Adapter();
			}
			@Override
			public Adapter caseNormalJobOutputs(NormalJobOutputs object) {
				return createNormalJobOutputsAdapter();
			}
			@Override
			public Adapter caseNormalJobOutputsAdditionalProperties(NormalJobOutputsAdditionalProperties object) {
				return createNormalJobOutputsAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobEnv(NormalJobEnv object) {
				return createNormalJobEnvAdapter();
			}
			@Override
			public Adapter caseNormalJobDefaults(NormalJobDefaults object) {
				return createNormalJobDefaultsAdapter();
			}
			@Override
			public Adapter caseNormalJobIf(NormalJobIf object) {
				return createNormalJobIfAdapter();
			}
			@Override
			public Adapter caseNormalJobSteps(NormalJobSteps object) {
				return createNormalJobStepsAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItems(NormalJobStepsItems object) {
				return createNormalJobStepsItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0(NormalJobStepsItemsAllOf0 object) {
				return createNormalJobStepsItemsAllOf0Adapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0OneOf0(NormalJobStepsItemsAllOf0OneOf0 object) {
				return createNormalJobStepsItemsAllOf0OneOf0Adapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0OneOf0Uses(NormalJobStepsItemsAllOf0OneOf0Uses object) {
				return createNormalJobStepsItemsAllOf0OneOf0UsesAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0OneOf1(NormalJobStepsItemsAllOf0OneOf1 object) {
				return createNormalJobStepsItemsAllOf0OneOf1Adapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0OneOf1Run(NormalJobStepsItemsAllOf0OneOf1Run object) {
				return createNormalJobStepsItemsAllOf0OneOf1RunAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1(NormalJobStepsItemsAllOf1 object) {
				return createNormalJobStepsItemsAllOf1Adapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Id(NormalJobStepsItemsAllOf1Id object) {
				return createNormalJobStepsItemsAllOf1IdAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1If(NormalJobStepsItemsAllOf1If object) {
				return createNormalJobStepsItemsAllOf1IfAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Name(NormalJobStepsItemsAllOf1Name object) {
				return createNormalJobStepsItemsAllOf1NameAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Uses(NormalJobStepsItemsAllOf1Uses object) {
				return createNormalJobStepsItemsAllOf1UsesAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Run(NormalJobStepsItemsAllOf1Run object) {
				return createNormalJobStepsItemsAllOf1RunAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Working_45directory(NormalJobStepsItemsAllOf1Working_45directory object) {
				return createNormalJobStepsItemsAllOf1Working_45directoryAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Shell(NormalJobStepsItemsAllOf1Shell object) {
				return createNormalJobStepsItemsAllOf1ShellAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1With(NormalJobStepsItemsAllOf1With object) {
				return createNormalJobStepsItemsAllOf1WithAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1WithArgs(NormalJobStepsItemsAllOf1WithArgs object) {
				return createNormalJobStepsItemsAllOf1WithArgsAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1WithEntrypoint(NormalJobStepsItemsAllOf1WithEntrypoint object) {
				return createNormalJobStepsItemsAllOf1WithEntrypointAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Env(NormalJobStepsItemsAllOf1Env object) {
				return createNormalJobStepsItemsAllOf1EnvAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Continue_45on_45error(NormalJobStepsItemsAllOf1Continue_45on_45error object) {
				return createNormalJobStepsItemsAllOf1Continue_45on_45errorAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0(NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0 object) {
				return createNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Adapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1(NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 object) {
				return createNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Adapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Timeout_45minutes(NormalJobStepsItemsAllOf1Timeout_45minutes object) {
				return createNormalJobStepsItemsAllOf1Timeout_45minutesAdapter();
			}
			@Override
			public Adapter caseNormalJobTimeout_45minutes(NormalJobTimeout_45minutes object) {
				return createNormalJobTimeout_45minutesAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategy(NormalJobStrategy object) {
				return createNormalJobStrategyAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrix(NormalJobStrategyMatrix object) {
				return createNormalJobStrategyMatrixAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixOneOf0(NormalJobStrategyMatrixOneOf0 object) {
				return createNormalJobStrategyMatrixOneOf0Adapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixOneOf1(NormalJobStrategyMatrixOneOf1 object) {
				return createNormalJobStrategyMatrixOneOf1Adapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixPatternProperties0(NormalJobStrategyMatrixPatternProperties0 object) {
				return createNormalJobStrategyMatrixPatternProperties0Adapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixPatternProperties0Items(NormalJobStrategyMatrixPatternProperties0Items object) {
				return createNormalJobStrategyMatrixPatternProperties0ItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties(NormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties object) {
				return createNormalJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalProperties(NormalJobStrategyMatrixAdditionalProperties object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalPropertiesOneOf0(NormalJobStrategyMatrixAdditionalPropertiesOneOf0 object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesOneOf0Adapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalPropertiesOneOf0Items(NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesOneOf0ItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalPropertiesOneOf1(NormalJobStrategyMatrixAdditionalPropertiesOneOf1 object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesOneOf1Adapter();
			}
			@Override
			public Adapter caseNormalJobStrategyFail_45fast(NormalJobStrategyFail_45fast object) {
				return createNormalJobStrategyFail_45fastAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMax_45parallel(NormalJobStrategyMax_45parallel object) {
				return createNormalJobStrategyMax_45parallelAdapter();
			}
			@Override
			public Adapter caseNormalJobContinue_45on_45error(NormalJobContinue_45on_45error object) {
				return createNormalJobContinue_45on_45errorAdapter();
			}
			@Override
			public Adapter caseNormalJobContinue_45on_45errorOneOf0(NormalJobContinue_45on_45errorOneOf0 object) {
				return createNormalJobContinue_45on_45errorOneOf0Adapter();
			}
			@Override
			public Adapter caseNormalJobContinue_45on_45errorOneOf1(NormalJobContinue_45on_45errorOneOf1 object) {
				return createNormalJobContinue_45on_45errorOneOf1Adapter();
			}
			@Override
			public Adapter caseNormalJobContainer(NormalJobContainer object) {
				return createNormalJobContainerAdapter();
			}
			@Override
			public Adapter caseNormalJobContainerOneOf0(NormalJobContainerOneOf0 object) {
				return createNormalJobContainerOneOf0Adapter();
			}
			@Override
			public Adapter caseNormalJobContainerOneOf1(NormalJobContainerOneOf1 object) {
				return createNormalJobContainerOneOf1Adapter();
			}
			@Override
			public Adapter caseNormalJobServices(NormalJobServices object) {
				return createNormalJobServicesAdapter();
			}
			@Override
			public Adapter caseNormalJobServicesAdditionalProperties(NormalJobServicesAdditionalProperties object) {
				return createNormalJobServicesAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobConcurrency(NormalJobConcurrency object) {
				return createNormalJobConcurrencyAdapter();
			}
			@Override
			public Adapter caseNormalJobConcurrencyOneOf0(NormalJobConcurrencyOneOf0 object) {
				return createNormalJobConcurrencyOneOf0Adapter();
			}
			@Override
			public Adapter caseNormalJobConcurrencyOneOf1(NormalJobConcurrencyOneOf1 object) {
				return createNormalJobConcurrencyOneOf1Adapter();
			}
			@Override
			public Adapter caseGithubwfRootName(GithubwfRootName object) {
				return createGithubwfRootNameAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOn(GithubwfRootOn object) {
				return createGithubwfRootOnAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf0(GithubwfRootOnOneOf0 object) {
				return createGithubwfRootOnOneOf0Adapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf1(GithubwfRootOnOneOf1 object) {
				return createGithubwfRootOnOneOf1Adapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf1Items(GithubwfRootOnOneOf1Items object) {
				return createGithubwfRootOnOneOf1ItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2(GithubwfRootOnOneOf2 object) {
				return createGithubwfRootOnOneOf2Adapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Branch_protection_rule(GithubwfRootOnOneOf2Branch_protection_rule object) {
				return createGithubwfRootOnOneOf2Branch_protection_ruleAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Branch_protection_ruleTypes(GithubwfRootOnOneOf2Branch_protection_ruleTypes object) {
				return createGithubwfRootOnOneOf2Branch_protection_ruleTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Branch_protection_ruleTypesItems(GithubwfRootOnOneOf2Branch_protection_ruleTypesItems object) {
				return createGithubwfRootOnOneOf2Branch_protection_ruleTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Check_run(GithubwfRootOnOneOf2Check_run object) {
				return createGithubwfRootOnOneOf2Check_runAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Check_runTypes(GithubwfRootOnOneOf2Check_runTypes object) {
				return createGithubwfRootOnOneOf2Check_runTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Check_runTypesItems(GithubwfRootOnOneOf2Check_runTypesItems object) {
				return createGithubwfRootOnOneOf2Check_runTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Check_suite(GithubwfRootOnOneOf2Check_suite object) {
				return createGithubwfRootOnOneOf2Check_suiteAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Check_suiteTypes(GithubwfRootOnOneOf2Check_suiteTypes object) {
				return createGithubwfRootOnOneOf2Check_suiteTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Check_suiteTypesItems(GithubwfRootOnOneOf2Check_suiteTypesItems object) {
				return createGithubwfRootOnOneOf2Check_suiteTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Create(GithubwfRootOnOneOf2Create object) {
				return createGithubwfRootOnOneOf2CreateAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Delete(GithubwfRootOnOneOf2Delete object) {
				return createGithubwfRootOnOneOf2DeleteAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Deployment(GithubwfRootOnOneOf2Deployment object) {
				return createGithubwfRootOnOneOf2DeploymentAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Deployment_status(GithubwfRootOnOneOf2Deployment_status object) {
				return createGithubwfRootOnOneOf2Deployment_statusAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Discussion(GithubwfRootOnOneOf2Discussion object) {
				return createGithubwfRootOnOneOf2DiscussionAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2DiscussionTypes(GithubwfRootOnOneOf2DiscussionTypes object) {
				return createGithubwfRootOnOneOf2DiscussionTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2DiscussionTypesItems(GithubwfRootOnOneOf2DiscussionTypesItems object) {
				return createGithubwfRootOnOneOf2DiscussionTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Discussion_comment(GithubwfRootOnOneOf2Discussion_comment object) {
				return createGithubwfRootOnOneOf2Discussion_commentAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Discussion_commentTypes(GithubwfRootOnOneOf2Discussion_commentTypes object) {
				return createGithubwfRootOnOneOf2Discussion_commentTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Discussion_commentTypesItems(GithubwfRootOnOneOf2Discussion_commentTypesItems object) {
				return createGithubwfRootOnOneOf2Discussion_commentTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Fork(GithubwfRootOnOneOf2Fork object) {
				return createGithubwfRootOnOneOf2ForkAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Gollum(GithubwfRootOnOneOf2Gollum object) {
				return createGithubwfRootOnOneOf2GollumAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Issue_comment(GithubwfRootOnOneOf2Issue_comment object) {
				return createGithubwfRootOnOneOf2Issue_commentAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Issue_commentTypes(GithubwfRootOnOneOf2Issue_commentTypes object) {
				return createGithubwfRootOnOneOf2Issue_commentTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Issue_commentTypesItems(GithubwfRootOnOneOf2Issue_commentTypesItems object) {
				return createGithubwfRootOnOneOf2Issue_commentTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Issues(GithubwfRootOnOneOf2Issues object) {
				return createGithubwfRootOnOneOf2IssuesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2IssuesTypes(GithubwfRootOnOneOf2IssuesTypes object) {
				return createGithubwfRootOnOneOf2IssuesTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2IssuesTypesItems(GithubwfRootOnOneOf2IssuesTypesItems object) {
				return createGithubwfRootOnOneOf2IssuesTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Label(GithubwfRootOnOneOf2Label object) {
				return createGithubwfRootOnOneOf2LabelAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2LabelTypes(GithubwfRootOnOneOf2LabelTypes object) {
				return createGithubwfRootOnOneOf2LabelTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2LabelTypesItems(GithubwfRootOnOneOf2LabelTypesItems object) {
				return createGithubwfRootOnOneOf2LabelTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Member(GithubwfRootOnOneOf2Member object) {
				return createGithubwfRootOnOneOf2MemberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2MemberTypes(GithubwfRootOnOneOf2MemberTypes object) {
				return createGithubwfRootOnOneOf2MemberTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2MemberTypesItems(GithubwfRootOnOneOf2MemberTypesItems object) {
				return createGithubwfRootOnOneOf2MemberTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Merge_group(GithubwfRootOnOneOf2Merge_group object) {
				return createGithubwfRootOnOneOf2Merge_groupAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Merge_groupTypes(GithubwfRootOnOneOf2Merge_groupTypes object) {
				return createGithubwfRootOnOneOf2Merge_groupTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Merge_groupTypesItems(GithubwfRootOnOneOf2Merge_groupTypesItems object) {
				return createGithubwfRootOnOneOf2Merge_groupTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Milestone(GithubwfRootOnOneOf2Milestone object) {
				return createGithubwfRootOnOneOf2MilestoneAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2MilestoneTypes(GithubwfRootOnOneOf2MilestoneTypes object) {
				return createGithubwfRootOnOneOf2MilestoneTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2MilestoneTypesItems(GithubwfRootOnOneOf2MilestoneTypesItems object) {
				return createGithubwfRootOnOneOf2MilestoneTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Page_build(GithubwfRootOnOneOf2Page_build object) {
				return createGithubwfRootOnOneOf2Page_buildAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Project(GithubwfRootOnOneOf2Project object) {
				return createGithubwfRootOnOneOf2ProjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ProjectTypes(GithubwfRootOnOneOf2ProjectTypes object) {
				return createGithubwfRootOnOneOf2ProjectTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ProjectTypesItems(GithubwfRootOnOneOf2ProjectTypesItems object) {
				return createGithubwfRootOnOneOf2ProjectTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Project_card(GithubwfRootOnOneOf2Project_card object) {
				return createGithubwfRootOnOneOf2Project_cardAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Project_cardTypes(GithubwfRootOnOneOf2Project_cardTypes object) {
				return createGithubwfRootOnOneOf2Project_cardTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Project_cardTypesItems(GithubwfRootOnOneOf2Project_cardTypesItems object) {
				return createGithubwfRootOnOneOf2Project_cardTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Project_column(GithubwfRootOnOneOf2Project_column object) {
				return createGithubwfRootOnOneOf2Project_columnAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Project_columnTypes(GithubwfRootOnOneOf2Project_columnTypes object) {
				return createGithubwfRootOnOneOf2Project_columnTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Project_columnTypesItems(GithubwfRootOnOneOf2Project_columnTypesItems object) {
				return createGithubwfRootOnOneOf2Project_columnTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Public(GithubwfRootOnOneOf2Public object) {
				return createGithubwfRootOnOneOf2PublicAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request(GithubwfRootOnOneOf2Pull_request object) {
				return createGithubwfRootOnOneOf2Pull_requestAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_requestTypes(GithubwfRootOnOneOf2Pull_requestTypes object) {
				return createGithubwfRootOnOneOf2Pull_requestTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_requestTypesItems(GithubwfRootOnOneOf2Pull_requestTypesItems object) {
				return createGithubwfRootOnOneOf2Pull_requestTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_requestPatternProperties0(GithubwfRootOnOneOf2Pull_requestPatternProperties0 object) {
				return createGithubwfRootOnOneOf2Pull_requestPatternProperties0Adapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_review(GithubwfRootOnOneOf2Pull_request_review object) {
				return createGithubwfRootOnOneOf2Pull_request_reviewAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_reviewTypes(GithubwfRootOnOneOf2Pull_request_reviewTypes object) {
				return createGithubwfRootOnOneOf2Pull_request_reviewTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_reviewTypesItems(GithubwfRootOnOneOf2Pull_request_reviewTypesItems object) {
				return createGithubwfRootOnOneOf2Pull_request_reviewTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_review_comment(GithubwfRootOnOneOf2Pull_request_review_comment object) {
				return createGithubwfRootOnOneOf2Pull_request_review_commentAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_review_commentTypes(GithubwfRootOnOneOf2Pull_request_review_commentTypes object) {
				return createGithubwfRootOnOneOf2Pull_request_review_commentTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_review_commentTypesItems(GithubwfRootOnOneOf2Pull_request_review_commentTypesItems object) {
				return createGithubwfRootOnOneOf2Pull_request_review_commentTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_target(GithubwfRootOnOneOf2Pull_request_target object) {
				return createGithubwfRootOnOneOf2Pull_request_targetAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_targetTypes(GithubwfRootOnOneOf2Pull_request_targetTypes object) {
				return createGithubwfRootOnOneOf2Pull_request_targetTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_targetTypesItems(GithubwfRootOnOneOf2Pull_request_targetTypesItems object) {
				return createGithubwfRootOnOneOf2Pull_request_targetTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_targetPatternProperties0(GithubwfRootOnOneOf2Pull_request_targetPatternProperties0 object) {
				return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0Adapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Push(GithubwfRootOnOneOf2Push object) {
				return createGithubwfRootOnOneOf2PushAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2PushPatternProperties0(GithubwfRootOnOneOf2PushPatternProperties0 object) {
				return createGithubwfRootOnOneOf2PushPatternProperties0Adapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2PushPatternProperties0Items(GithubwfRootOnOneOf2PushPatternProperties0Items object) {
				return createGithubwfRootOnOneOf2PushPatternProperties0ItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Registry_package(GithubwfRootOnOneOf2Registry_package object) {
				return createGithubwfRootOnOneOf2Registry_packageAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Registry_packageTypes(GithubwfRootOnOneOf2Registry_packageTypes object) {
				return createGithubwfRootOnOneOf2Registry_packageTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Registry_packageTypesItems(GithubwfRootOnOneOf2Registry_packageTypesItems object) {
				return createGithubwfRootOnOneOf2Registry_packageTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Release(GithubwfRootOnOneOf2Release object) {
				return createGithubwfRootOnOneOf2ReleaseAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ReleaseTypes(GithubwfRootOnOneOf2ReleaseTypes object) {
				return createGithubwfRootOnOneOf2ReleaseTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ReleaseTypesItems(GithubwfRootOnOneOf2ReleaseTypesItems object) {
				return createGithubwfRootOnOneOf2ReleaseTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Status(GithubwfRootOnOneOf2Status object) {
				return createGithubwfRootOnOneOf2StatusAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Watch(GithubwfRootOnOneOf2Watch object) {
				return createGithubwfRootOnOneOf2WatchAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_call(GithubwfRootOnOneOf2Workflow_call object) {
				return createGithubwfRootOnOneOf2Workflow_callAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callInputs(GithubwfRootOnOneOf2Workflow_callInputs object) {
				return createGithubwfRootOnOneOf2Workflow_callInputsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0(GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0 object) {
				return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Adapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Description(GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Description object) {
				return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DescriptionAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage(GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage object) {
				return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessageAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required(GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required object) {
				return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0RequiredAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type(GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type object) {
				return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0TypeAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default(GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default object) {
				return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecrets(GithubwfRootOnOneOf2Workflow_callSecrets object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0 object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Adapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Description(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Description object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0DescriptionAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatch(GithubwfRootOnOneOf2Workflow_dispatch object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputs(GithubwfRootOnOneOf2Workflow_dispatchInputs object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0 object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Adapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Description(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Description object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DescriptionAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessage(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessage object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessageAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Required(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Required object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0RequiredAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0TypeAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItems(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItems object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0 object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Adapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1 object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Adapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_run(GithubwfRootOnOneOf2Workflow_run object) {
				return createGithubwfRootOnOneOf2Workflow_runAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runTypes(GithubwfRootOnOneOf2Workflow_runTypes object) {
				return createGithubwfRootOnOneOf2Workflow_runTypesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runTypesItems(GithubwfRootOnOneOf2Workflow_runTypesItems object) {
				return createGithubwfRootOnOneOf2Workflow_runTypesItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runWorkflows(GithubwfRootOnOneOf2Workflow_runWorkflows object) {
				return createGithubwfRootOnOneOf2Workflow_runWorkflowsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runWorkflowsItems(GithubwfRootOnOneOf2Workflow_runWorkflowsItems object) {
				return createGithubwfRootOnOneOf2Workflow_runWorkflowsItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runPatternProperties0(GithubwfRootOnOneOf2Workflow_runPatternProperties0 object) {
				return createGithubwfRootOnOneOf2Workflow_runPatternProperties0Adapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Repository_dispatch(GithubwfRootOnOneOf2Repository_dispatch object) {
				return createGithubwfRootOnOneOf2Repository_dispatchAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Schedule(GithubwfRootOnOneOf2Schedule object) {
				return createGithubwfRootOnOneOf2ScheduleAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ScheduleItems(GithubwfRootOnOneOf2ScheduleItems object) {
				return createGithubwfRootOnOneOf2ScheduleItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ScheduleItemsCron(GithubwfRootOnOneOf2ScheduleItemsCron object) {
				return createGithubwfRootOnOneOf2ScheduleItemsCronAdapter();
			}
			@Override
			public Adapter caseGithubwfRootEnv(GithubwfRootEnv object) {
				return createGithubwfRootEnvAdapter();
			}
			@Override
			public Adapter caseGithubwfRootDefaults(GithubwfRootDefaults object) {
				return createGithubwfRootDefaultsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootConcurrency(GithubwfRootConcurrency object) {
				return createGithubwfRootConcurrencyAdapter();
			}
			@Override
			public Adapter caseGithubwfRootConcurrencyOneOf0(GithubwfRootConcurrencyOneOf0 object) {
				return createGithubwfRootConcurrencyOneOf0Adapter();
			}
			@Override
			public Adapter caseGithubwfRootConcurrencyOneOf1(GithubwfRootConcurrencyOneOf1 object) {
				return createGithubwfRootConcurrencyOneOf1Adapter();
			}
			@Override
			public Adapter caseGithubwfRootJobs(GithubwfRootJobs object) {
				return createGithubwfRootJobsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPatternProperties0(GithubwfRootJobsPatternProperties0 object) {
				return createGithubwfRootJobsPatternProperties0Adapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPatternProperties0OneOf0(GithubwfRootJobsPatternProperties0OneOf0 object) {
				return createGithubwfRootJobsPatternProperties0OneOf0Adapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPatternProperties0OneOf1(GithubwfRootJobsPatternProperties0OneOf1 object) {
				return createGithubwfRootJobsPatternProperties0OneOf1Adapter();
			}
			@Override
			public Adapter caseGithubwfRootRun_45name(GithubwfRootRun_45name object) {
				return createGithubwfRootRun_45nameAdapter();
			}
			@Override
			public Adapter caseGithubwfRootPermissions(GithubwfRootPermissions object) {
				return createGithubwfRootPermissionsAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf0Tuple(NormalJobRuns_45onOneOf1AnyOf0Tuple object) {
				return createNormalJobRuns_45onOneOf1AnyOf0TupleAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1Tuple(NormalJobRuns_45onOneOf1AnyOf1Tuple object) {
				return createNormalJobRuns_45onOneOf1AnyOf1TupleAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2Tuple(NormalJobRuns_45onOneOf1AnyOf2Tuple object) {
				return createNormalJobRuns_45onOneOf1AnyOf2TupleAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3Tuple(NormalJobRuns_45onOneOf1AnyOf3Tuple object) {
				return createNormalJobRuns_45onOneOf1AnyOf3TupleAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4Tuple(NormalJobRuns_45onOneOf1AnyOf4Tuple object) {
				return createNormalJobRuns_45onOneOf1AnyOf4TupleAdapter();
			}
			@Override
			public Adapter caseEventObjectPropertiesAbstract(EventObjectPropertiesAbstract object) {
				return createEventObjectPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootPropertiesAbstract(GithubwfRootPropertiesAbstract object) {
				return createGithubwfRootPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseConcurrencyPropertiesAbstract(ConcurrencyPropertiesAbstract object) {
				return createConcurrencyPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseConcurrencyCancel_45in_45progressAbstract(ConcurrencyCancel_45in_45progressAbstract object) {
				return createConcurrencyCancel_45in_45progressAbstractAdapter();
			}
			@Override
			public Adapter caseConcurrencyCancel_45in_45progressTypeString(ConcurrencyCancel_45in_45progressTypeString object) {
				return createConcurrencyCancel_45in_45progressTypeStringAdapter();
			}
			@Override
			public Adapter caseConcurrencyCancel_45in_45progressTypeInteger(ConcurrencyCancel_45in_45progressTypeInteger object) {
				return createConcurrencyCancel_45in_45progressTypeIntegerAdapter();
			}
			@Override
			public Adapter caseConcurrencyCancel_45in_45progressTypeNumber(ConcurrencyCancel_45in_45progressTypeNumber object) {
				return createConcurrencyCancel_45in_45progressTypeNumberAdapter();
			}
			@Override
			public Adapter caseConcurrencyCancel_45in_45progressTypeBoolean(ConcurrencyCancel_45in_45progressTypeBoolean object) {
				return createConcurrencyCancel_45in_45progressTypeBooleanAdapter();
			}
			@Override
			public Adapter caseConcurrencyCancel_45in_45progressTypeObject(ConcurrencyCancel_45in_45progressTypeObject object) {
				return createConcurrencyCancel_45in_45progressTypeObjectAdapter();
			}
			@Override
			public Adapter caseConcurrencyCancel_45in_45progressPropertiesAbstract(ConcurrencyCancel_45in_45progressPropertiesAbstract object) {
				return createConcurrencyCancel_45in_45progressPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseConcurrencyCancel_45in_45progressAdditionalProperties(ConcurrencyCancel_45in_45progressAdditionalProperties object) {
				return createConcurrencyCancel_45in_45progressAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseConcurrencyCancel_45in_45progressTypeArray(ConcurrencyCancel_45in_45progressTypeArray object) {
				return createConcurrencyCancel_45in_45progressTypeArrayAdapter();
			}
			@Override
			public Adapter caseConcurrencyCancel_45in_45progressItems(ConcurrencyCancel_45in_45progressItems object) {
				return createConcurrencyCancel_45in_45progressItemsAdapter();
			}
			@Override
			public Adapter caseConcurrencyCancel_45in_45progressTypeNull(ConcurrencyCancel_45in_45progressTypeNull object) {
				return createConcurrencyCancel_45in_45progressTypeNullAdapter();
			}
			@Override
			public Adapter caseConfigurationAbstract(ConfigurationAbstract object) {
				return createConfigurationAbstractAdapter();
			}
			@Override
			public Adapter caseConfigurationTypeString(ConfigurationTypeString object) {
				return createConfigurationTypeStringAdapter();
			}
			@Override
			public Adapter caseConfigurationTypeInteger(ConfigurationTypeInteger object) {
				return createConfigurationTypeIntegerAdapter();
			}
			@Override
			public Adapter caseConfigurationTypeNumber(ConfigurationTypeNumber object) {
				return createConfigurationTypeNumberAdapter();
			}
			@Override
			public Adapter caseConfigurationTypeBoolean(ConfigurationTypeBoolean object) {
				return createConfigurationTypeBooleanAdapter();
			}
			@Override
			public Adapter caseConfigurationTypeObject(ConfigurationTypeObject object) {
				return createConfigurationTypeObjectAdapter();
			}
			@Override
			public Adapter caseConfigurationPropertiesAbstract(ConfigurationPropertiesAbstract object) {
				return createConfigurationPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseConfigurationAdditionalProperties(ConfigurationAdditionalProperties object) {
				return createConfigurationAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseConfigurationTypeArray(ConfigurationTypeArray object) {
				return createConfigurationTypeArrayAdapter();
			}
			@Override
			public Adapter caseConfigurationItems(ConfigurationItems object) {
				return createConfigurationItemsAdapter();
			}
			@Override
			public Adapter caseConfigurationTypeNull(ConfigurationTypeNull object) {
				return createConfigurationTypeNullAdapter();
			}
			@Override
			public Adapter caseConfigurationOneOf3PropertiesAbstract(ConfigurationOneOf3PropertiesAbstract object) {
				return createConfigurationOneOf3PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseContainerPropertiesAbstract(ContainerPropertiesAbstract object) {
				return createContainerPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseContainerCredentialsPropertiesAbstract(ContainerCredentialsPropertiesAbstract object) {
				return createContainerCredentialsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseContainerCredentialsAdditionalProperties(ContainerCredentialsAdditionalProperties object) {
				return createContainerCredentialsAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseContainerPortsItemsAbstract(ContainerPortsItemsAbstract object) {
				return createContainerPortsItemsAbstractAdapter();
			}
			@Override
			public Adapter caseContainerPortsItemsTypeString(ContainerPortsItemsTypeString object) {
				return createContainerPortsItemsTypeStringAdapter();
			}
			@Override
			public Adapter caseContainerPortsItemsTypeInteger(ContainerPortsItemsTypeInteger object) {
				return createContainerPortsItemsTypeIntegerAdapter();
			}
			@Override
			public Adapter caseContainerPortsItemsTypeNumber(ContainerPortsItemsTypeNumber object) {
				return createContainerPortsItemsTypeNumberAdapter();
			}
			@Override
			public Adapter caseContainerPortsItemsTypeBoolean(ContainerPortsItemsTypeBoolean object) {
				return createContainerPortsItemsTypeBooleanAdapter();
			}
			@Override
			public Adapter caseContainerPortsItemsTypeObject(ContainerPortsItemsTypeObject object) {
				return createContainerPortsItemsTypeObjectAdapter();
			}
			@Override
			public Adapter caseContainerPortsItemsPropertiesAbstract(ContainerPortsItemsPropertiesAbstract object) {
				return createContainerPortsItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseContainerPortsItemsAdditionalProperties(ContainerPortsItemsAdditionalProperties object) {
				return createContainerPortsItemsAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseContainerPortsItemsTypeArray(ContainerPortsItemsTypeArray object) {
				return createContainerPortsItemsTypeArrayAdapter();
			}
			@Override
			public Adapter caseContainerPortsItemsItems(ContainerPortsItemsItems object) {
				return createContainerPortsItemsItemsAdapter();
			}
			@Override
			public Adapter caseContainerPortsItemsTypeNull(ContainerPortsItemsTypeNull object) {
				return createContainerPortsItemsTypeNullAdapter();
			}
			@Override
			public Adapter caseDefaultsPropertiesAbstract(DefaultsPropertiesAbstract object) {
				return createDefaultsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseDefaultsRunPropertiesAbstract(DefaultsRunPropertiesAbstract object) {
				return createDefaultsRunPropertiesAbstractAdapter();
			}
			@Override
			public Adapter casePermissionsAbstract(PermissionsAbstract object) {
				return createPermissionsAbstractAdapter();
			}
			@Override
			public Adapter casePermissionsTypeString(PermissionsTypeString object) {
				return createPermissionsTypeStringAdapter();
			}
			@Override
			public Adapter casePermissionsTypeInteger(PermissionsTypeInteger object) {
				return createPermissionsTypeIntegerAdapter();
			}
			@Override
			public Adapter casePermissionsTypeNumber(PermissionsTypeNumber object) {
				return createPermissionsTypeNumberAdapter();
			}
			@Override
			public Adapter casePermissionsTypeBoolean(PermissionsTypeBoolean object) {
				return createPermissionsTypeBooleanAdapter();
			}
			@Override
			public Adapter casePermissionsTypeObject(PermissionsTypeObject object) {
				return createPermissionsTypeObjectAdapter();
			}
			@Override
			public Adapter casePermissionsPropertiesAbstract(PermissionsPropertiesAbstract object) {
				return createPermissionsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter casePermissionsAdditionalProperties(PermissionsAdditionalProperties object) {
				return createPermissionsAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter casePermissionsTypeArray(PermissionsTypeArray object) {
				return createPermissionsTypeArrayAdapter();
			}
			@Override
			public Adapter casePermissionsItems(PermissionsItems object) {
				return createPermissionsItemsAdapter();
			}
			@Override
			public Adapter casePermissionsTypeNull(PermissionsTypeNull object) {
				return createPermissionsTypeNullAdapter();
			}
			@Override
			public Adapter casePermissions_45eventPropertiesAbstract(Permissions_45eventPropertiesAbstract object) {
				return createPermissions_45eventPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseEnvAbstract(EnvAbstract object) {
				return createEnvAbstractAdapter();
			}
			@Override
			public Adapter caseEnvTypeString(EnvTypeString object) {
				return createEnvTypeStringAdapter();
			}
			@Override
			public Adapter caseEnvTypeInteger(EnvTypeInteger object) {
				return createEnvTypeIntegerAdapter();
			}
			@Override
			public Adapter caseEnvTypeNumber(EnvTypeNumber object) {
				return createEnvTypeNumberAdapter();
			}
			@Override
			public Adapter caseEnvTypeBoolean(EnvTypeBoolean object) {
				return createEnvTypeBooleanAdapter();
			}
			@Override
			public Adapter caseEnvTypeObject(EnvTypeObject object) {
				return createEnvTypeObjectAdapter();
			}
			@Override
			public Adapter caseEnvPropertiesAbstract(EnvPropertiesAbstract object) {
				return createEnvPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseEnvAdditionalProperties(EnvAdditionalProperties object) {
				return createEnvAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseEnvTypeArray(EnvTypeArray object) {
				return createEnvTypeArrayAdapter();
			}
			@Override
			public Adapter caseEnvItems(EnvItems object) {
				return createEnvItemsAdapter();
			}
			@Override
			public Adapter caseEnvTypeNull(EnvTypeNull object) {
				return createEnvTypeNullAdapter();
			}
			@Override
			public Adapter caseEnvOneOf0PropertiesAbstract(EnvOneOf0PropertiesAbstract object) {
				return createEnvOneOf0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalPropertiesAbstract(EnvOneOf0AdditionalPropertiesAbstract object) {
				return createEnvOneOf0AdditionalPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalPropertiesTypeString(EnvOneOf0AdditionalPropertiesTypeString object) {
				return createEnvOneOf0AdditionalPropertiesTypeStringAdapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalPropertiesTypeInteger(EnvOneOf0AdditionalPropertiesTypeInteger object) {
				return createEnvOneOf0AdditionalPropertiesTypeIntegerAdapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalPropertiesTypeNumber(EnvOneOf0AdditionalPropertiesTypeNumber object) {
				return createEnvOneOf0AdditionalPropertiesTypeNumberAdapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalPropertiesTypeBoolean(EnvOneOf0AdditionalPropertiesTypeBoolean object) {
				return createEnvOneOf0AdditionalPropertiesTypeBooleanAdapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalPropertiesTypeObject(EnvOneOf0AdditionalPropertiesTypeObject object) {
				return createEnvOneOf0AdditionalPropertiesTypeObjectAdapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalPropertiesPropertiesAbstract(EnvOneOf0AdditionalPropertiesPropertiesAbstract object) {
				return createEnvOneOf0AdditionalPropertiesPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalPropertiesAdditionalProperties(EnvOneOf0AdditionalPropertiesAdditionalProperties object) {
				return createEnvOneOf0AdditionalPropertiesAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalPropertiesTypeArray(EnvOneOf0AdditionalPropertiesTypeArray object) {
				return createEnvOneOf0AdditionalPropertiesTypeArrayAdapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalPropertiesItems(EnvOneOf0AdditionalPropertiesItems object) {
				return createEnvOneOf0AdditionalPropertiesItemsAdapter();
			}
			@Override
			public Adapter caseEnvOneOf0AdditionalPropertiesTypeNull(EnvOneOf0AdditionalPropertiesTypeNull object) {
				return createEnvOneOf0AdditionalPropertiesTypeNullAdapter();
			}
			@Override
			public Adapter caseEnvironmentPropertiesAbstract(EnvironmentPropertiesAbstract object) {
				return createEnvironmentPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseEventObjectAbstract(EventObjectAbstract object) {
				return createEventObjectAbstractAdapter();
			}
			@Override
			public Adapter caseEventObjectTypeString(EventObjectTypeString object) {
				return createEventObjectTypeStringAdapter();
			}
			@Override
			public Adapter caseEventObjectTypeInteger(EventObjectTypeInteger object) {
				return createEventObjectTypeIntegerAdapter();
			}
			@Override
			public Adapter caseEventObjectTypeNumber(EventObjectTypeNumber object) {
				return createEventObjectTypeNumberAdapter();
			}
			@Override
			public Adapter caseEventObjectTypeBoolean(EventObjectTypeBoolean object) {
				return createEventObjectTypeBooleanAdapter();
			}
			@Override
			public Adapter caseEventObjectTypeObject(EventObjectTypeObject object) {
				return createEventObjectTypeObjectAdapter();
			}
			@Override
			public Adapter caseEventObjectTypeArray(EventObjectTypeArray object) {
				return createEventObjectTypeArrayAdapter();
			}
			@Override
			public Adapter caseEventObjectItems(EventObjectItems object) {
				return createEventObjectItemsAdapter();
			}
			@Override
			public Adapter caseEventObjectTypeNull(EventObjectTypeNull object) {
				return createEventObjectTypeNullAdapter();
			}
			@Override
			public Adapter caseEventObjectOneOf0PropertiesAbstract(EventObjectOneOf0PropertiesAbstract object) {
				return createEventObjectOneOf0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseEventObjectOneOf0AdditionalProperties(EventObjectOneOf0AdditionalProperties object) {
				return createEventObjectOneOf0AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseRefAbstract(RefAbstract object) {
				return createRefAbstractAdapter();
			}
			@Override
			public Adapter caseRefTypeString(RefTypeString object) {
				return createRefTypeStringAdapter();
			}
			@Override
			public Adapter caseRefTypeInteger(RefTypeInteger object) {
				return createRefTypeIntegerAdapter();
			}
			@Override
			public Adapter caseRefTypeNumber(RefTypeNumber object) {
				return createRefTypeNumberAdapter();
			}
			@Override
			public Adapter caseRefTypeBoolean(RefTypeBoolean object) {
				return createRefTypeBooleanAdapter();
			}
			@Override
			public Adapter caseRefTypeObject(RefTypeObject object) {
				return createRefTypeObjectAdapter();
			}
			@Override
			public Adapter caseRefPropertiesAbstract(RefPropertiesAbstract object) {
				return createRefPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseRefAdditionalProperties(RefAdditionalProperties object) {
				return createRefAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseRefTypeArray(RefTypeArray object) {
				return createRefTypeArrayAdapter();
			}
			@Override
			public Adapter caseRefItems(RefItems object) {
				return createRefItemsAdapter();
			}
			@Override
			public Adapter caseRefTypeNull(RefTypeNull object) {
				return createRefTypeNullAdapter();
			}
			@Override
			public Adapter caseRefOneOf0PropertiesAbstract(RefOneOf0PropertiesAbstract object) {
				return createRefOneOf0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AdditionalProperties(RefOneOf0AdditionalProperties object) {
				return createRefOneOf0AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0Abstract(RefOneOf0AllOf0Abstract object) {
				return createRefOneOf0AllOf0AbstractAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0TypeString(RefOneOf0AllOf0TypeString object) {
				return createRefOneOf0AllOf0TypeStringAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0TypeInteger(RefOneOf0AllOf0TypeInteger object) {
				return createRefOneOf0AllOf0TypeIntegerAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0TypeNumber(RefOneOf0AllOf0TypeNumber object) {
				return createRefOneOf0AllOf0TypeNumberAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0TypeBoolean(RefOneOf0AllOf0TypeBoolean object) {
				return createRefOneOf0AllOf0TypeBooleanAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0TypeObject(RefOneOf0AllOf0TypeObject object) {
				return createRefOneOf0AllOf0TypeObjectAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0PropertiesAbstract(RefOneOf0AllOf0PropertiesAbstract object) {
				return createRefOneOf0AllOf0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0AdditionalProperties(RefOneOf0AllOf0AdditionalProperties object) {
				return createRefOneOf0AllOf0AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0TypeArray(RefOneOf0AllOf0TypeArray object) {
				return createRefOneOf0AllOf0TypeArrayAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0Items(RefOneOf0AllOf0Items object) {
				return createRefOneOf0AllOf0ItemsAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0TypeNull(RefOneOf0AllOf0TypeNull object) {
				return createRefOneOf0AllOf0TypeNullAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0NotAbstract(RefOneOf0AllOf0NotAbstract object) {
				return createRefOneOf0AllOf0NotAbstractAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0NotTypeString(RefOneOf0AllOf0NotTypeString object) {
				return createRefOneOf0AllOf0NotTypeStringAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0NotTypeInteger(RefOneOf0AllOf0NotTypeInteger object) {
				return createRefOneOf0AllOf0NotTypeIntegerAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0NotTypeNumber(RefOneOf0AllOf0NotTypeNumber object) {
				return createRefOneOf0AllOf0NotTypeNumberAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0NotTypeBoolean(RefOneOf0AllOf0NotTypeBoolean object) {
				return createRefOneOf0AllOf0NotTypeBooleanAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0NotTypeObject(RefOneOf0AllOf0NotTypeObject object) {
				return createRefOneOf0AllOf0NotTypeObjectAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0NotPropertiesAbstract(RefOneOf0AllOf0NotPropertiesAbstract object) {
				return createRefOneOf0AllOf0NotPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0NotAdditionalProperties(RefOneOf0AllOf0NotAdditionalProperties object) {
				return createRefOneOf0AllOf0NotAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0NotTypeArray(RefOneOf0AllOf0NotTypeArray object) {
				return createRefOneOf0AllOf0NotTypeArrayAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0NotItems(RefOneOf0AllOf0NotItems object) {
				return createRefOneOf0AllOf0NotItemsAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf0NotTypeNull(RefOneOf0AllOf0NotTypeNull object) {
				return createRefOneOf0AllOf0NotTypeNullAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1Abstract(RefOneOf0AllOf1Abstract object) {
				return createRefOneOf0AllOf1AbstractAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1TypeString(RefOneOf0AllOf1TypeString object) {
				return createRefOneOf0AllOf1TypeStringAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1TypeInteger(RefOneOf0AllOf1TypeInteger object) {
				return createRefOneOf0AllOf1TypeIntegerAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1TypeNumber(RefOneOf0AllOf1TypeNumber object) {
				return createRefOneOf0AllOf1TypeNumberAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1TypeBoolean(RefOneOf0AllOf1TypeBoolean object) {
				return createRefOneOf0AllOf1TypeBooleanAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1TypeObject(RefOneOf0AllOf1TypeObject object) {
				return createRefOneOf0AllOf1TypeObjectAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1PropertiesAbstract(RefOneOf0AllOf1PropertiesAbstract object) {
				return createRefOneOf0AllOf1PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1AdditionalProperties(RefOneOf0AllOf1AdditionalProperties object) {
				return createRefOneOf0AllOf1AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1TypeArray(RefOneOf0AllOf1TypeArray object) {
				return createRefOneOf0AllOf1TypeArrayAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1Items(RefOneOf0AllOf1Items object) {
				return createRefOneOf0AllOf1ItemsAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1TypeNull(RefOneOf0AllOf1TypeNull object) {
				return createRefOneOf0AllOf1TypeNullAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1NotAbstract(RefOneOf0AllOf1NotAbstract object) {
				return createRefOneOf0AllOf1NotAbstractAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1NotTypeString(RefOneOf0AllOf1NotTypeString object) {
				return createRefOneOf0AllOf1NotTypeStringAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1NotTypeInteger(RefOneOf0AllOf1NotTypeInteger object) {
				return createRefOneOf0AllOf1NotTypeIntegerAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1NotTypeNumber(RefOneOf0AllOf1NotTypeNumber object) {
				return createRefOneOf0AllOf1NotTypeNumberAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1NotTypeBoolean(RefOneOf0AllOf1NotTypeBoolean object) {
				return createRefOneOf0AllOf1NotTypeBooleanAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1NotTypeObject(RefOneOf0AllOf1NotTypeObject object) {
				return createRefOneOf0AllOf1NotTypeObjectAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1NotPropertiesAbstract(RefOneOf0AllOf1NotPropertiesAbstract object) {
				return createRefOneOf0AllOf1NotPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1NotAdditionalProperties(RefOneOf0AllOf1NotAdditionalProperties object) {
				return createRefOneOf0AllOf1NotAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1NotTypeArray(RefOneOf0AllOf1NotTypeArray object) {
				return createRefOneOf0AllOf1NotTypeArrayAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1NotItems(RefOneOf0AllOf1NotItems object) {
				return createRefOneOf0AllOf1NotItemsAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf1NotTypeNull(RefOneOf0AllOf1NotTypeNull object) {
				return createRefOneOf0AllOf1NotTypeNullAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2Abstract(RefOneOf0AllOf2Abstract object) {
				return createRefOneOf0AllOf2AbstractAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2TypeString(RefOneOf0AllOf2TypeString object) {
				return createRefOneOf0AllOf2TypeStringAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2TypeInteger(RefOneOf0AllOf2TypeInteger object) {
				return createRefOneOf0AllOf2TypeIntegerAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2TypeNumber(RefOneOf0AllOf2TypeNumber object) {
				return createRefOneOf0AllOf2TypeNumberAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2TypeBoolean(RefOneOf0AllOf2TypeBoolean object) {
				return createRefOneOf0AllOf2TypeBooleanAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2TypeObject(RefOneOf0AllOf2TypeObject object) {
				return createRefOneOf0AllOf2TypeObjectAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2PropertiesAbstract(RefOneOf0AllOf2PropertiesAbstract object) {
				return createRefOneOf0AllOf2PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2AdditionalProperties(RefOneOf0AllOf2AdditionalProperties object) {
				return createRefOneOf0AllOf2AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2TypeArray(RefOneOf0AllOf2TypeArray object) {
				return createRefOneOf0AllOf2TypeArrayAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2Items(RefOneOf0AllOf2Items object) {
				return createRefOneOf0AllOf2ItemsAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2TypeNull(RefOneOf0AllOf2TypeNull object) {
				return createRefOneOf0AllOf2TypeNullAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2NotAbstract(RefOneOf0AllOf2NotAbstract object) {
				return createRefOneOf0AllOf2NotAbstractAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2NotTypeString(RefOneOf0AllOf2NotTypeString object) {
				return createRefOneOf0AllOf2NotTypeStringAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2NotTypeInteger(RefOneOf0AllOf2NotTypeInteger object) {
				return createRefOneOf0AllOf2NotTypeIntegerAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2NotTypeNumber(RefOneOf0AllOf2NotTypeNumber object) {
				return createRefOneOf0AllOf2NotTypeNumberAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2NotTypeBoolean(RefOneOf0AllOf2NotTypeBoolean object) {
				return createRefOneOf0AllOf2NotTypeBooleanAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2NotTypeObject(RefOneOf0AllOf2NotTypeObject object) {
				return createRefOneOf0AllOf2NotTypeObjectAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2NotPropertiesAbstract(RefOneOf0AllOf2NotPropertiesAbstract object) {
				return createRefOneOf0AllOf2NotPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2NotAdditionalProperties(RefOneOf0AllOf2NotAdditionalProperties object) {
				return createRefOneOf0AllOf2NotAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2NotTypeArray(RefOneOf0AllOf2NotTypeArray object) {
				return createRefOneOf0AllOf2NotTypeArrayAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2NotItems(RefOneOf0AllOf2NotItems object) {
				return createRefOneOf0AllOf2NotItemsAdapter();
			}
			@Override
			public Adapter caseRefOneOf0AllOf2NotTypeNull(RefOneOf0AllOf2NotTypeNull object) {
				return createRefOneOf0AllOf2NotTypeNullAdapter();
			}
			@Override
			public Adapter caseShellAbstract(ShellAbstract object) {
				return createShellAbstractAdapter();
			}
			@Override
			public Adapter caseShellTypeString(ShellTypeString object) {
				return createShellTypeStringAdapter();
			}
			@Override
			public Adapter caseShellTypeInteger(ShellTypeInteger object) {
				return createShellTypeIntegerAdapter();
			}
			@Override
			public Adapter caseShellTypeNumber(ShellTypeNumber object) {
				return createShellTypeNumberAdapter();
			}
			@Override
			public Adapter caseShellTypeBoolean(ShellTypeBoolean object) {
				return createShellTypeBooleanAdapter();
			}
			@Override
			public Adapter caseShellTypeObject(ShellTypeObject object) {
				return createShellTypeObjectAdapter();
			}
			@Override
			public Adapter caseShellPropertiesAbstract(ShellPropertiesAbstract object) {
				return createShellPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseShellAdditionalProperties(ShellAdditionalProperties object) {
				return createShellAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseShellTypeArray(ShellTypeArray object) {
				return createShellTypeArrayAdapter();
			}
			@Override
			public Adapter caseShellItems(ShellItems object) {
				return createShellItemsAdapter();
			}
			@Override
			public Adapter caseShellTypeNull(ShellTypeNull object) {
				return createShellTypeNullAdapter();
			}
			@Override
			public Adapter caseTypesItems(TypesItems object) {
				return createTypesItemsAdapter();
			}
			@Override
			public Adapter caseJobNeedsAbstract(JobNeedsAbstract object) {
				return createJobNeedsAbstractAdapter();
			}
			@Override
			public Adapter caseJobNeedsTypeString(JobNeedsTypeString object) {
				return createJobNeedsTypeStringAdapter();
			}
			@Override
			public Adapter caseJobNeedsTypeInteger(JobNeedsTypeInteger object) {
				return createJobNeedsTypeIntegerAdapter();
			}
			@Override
			public Adapter caseJobNeedsTypeNumber(JobNeedsTypeNumber object) {
				return createJobNeedsTypeNumberAdapter();
			}
			@Override
			public Adapter caseJobNeedsTypeBoolean(JobNeedsTypeBoolean object) {
				return createJobNeedsTypeBooleanAdapter();
			}
			@Override
			public Adapter caseJobNeedsTypeObject(JobNeedsTypeObject object) {
				return createJobNeedsTypeObjectAdapter();
			}
			@Override
			public Adapter caseJobNeedsPropertiesAbstract(JobNeedsPropertiesAbstract object) {
				return createJobNeedsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseJobNeedsAdditionalProperties(JobNeedsAdditionalProperties object) {
				return createJobNeedsAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseJobNeedsTypeArray(JobNeedsTypeArray object) {
				return createJobNeedsTypeArrayAdapter();
			}
			@Override
			public Adapter caseJobNeedsItems(JobNeedsItems object) {
				return createJobNeedsItemsAdapter();
			}
			@Override
			public Adapter caseJobNeedsTypeNull(JobNeedsTypeNull object) {
				return createJobNeedsTypeNullAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobPropertiesAbstract(ReusableWorkflowCallJobPropertiesAbstract object) {
				return createReusableWorkflowCallJobPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobIfAbstract(ReusableWorkflowCallJobIfAbstract object) {
				return createReusableWorkflowCallJobIfAbstractAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobIfTypeBoolean(ReusableWorkflowCallJobIfTypeBoolean object) {
				return createReusableWorkflowCallJobIfTypeBooleanAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobIfTypeNumber(ReusableWorkflowCallJobIfTypeNumber object) {
				return createReusableWorkflowCallJobIfTypeNumberAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobIfTypeString(ReusableWorkflowCallJobIfTypeString object) {
				return createReusableWorkflowCallJobIfTypeStringAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobSecretsAbstract(ReusableWorkflowCallJobSecretsAbstract object) {
				return createReusableWorkflowCallJobSecretsAbstractAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobSecretsTypeString(ReusableWorkflowCallJobSecretsTypeString object) {
				return createReusableWorkflowCallJobSecretsTypeStringAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobSecretsTypeInteger(ReusableWorkflowCallJobSecretsTypeInteger object) {
				return createReusableWorkflowCallJobSecretsTypeIntegerAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobSecretsTypeNumber(ReusableWorkflowCallJobSecretsTypeNumber object) {
				return createReusableWorkflowCallJobSecretsTypeNumberAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobSecretsTypeBoolean(ReusableWorkflowCallJobSecretsTypeBoolean object) {
				return createReusableWorkflowCallJobSecretsTypeBooleanAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobSecretsTypeObject(ReusableWorkflowCallJobSecretsTypeObject object) {
				return createReusableWorkflowCallJobSecretsTypeObjectAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobSecretsPropertiesAbstract(ReusableWorkflowCallJobSecretsPropertiesAbstract object) {
				return createReusableWorkflowCallJobSecretsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobSecretsAdditionalProperties(ReusableWorkflowCallJobSecretsAdditionalProperties object) {
				return createReusableWorkflowCallJobSecretsAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobSecretsTypeArray(ReusableWorkflowCallJobSecretsTypeArray object) {
				return createReusableWorkflowCallJobSecretsTypeArrayAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobSecretsItems(ReusableWorkflowCallJobSecretsItems object) {
				return createReusableWorkflowCallJobSecretsItemsAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobSecretsTypeNull(ReusableWorkflowCallJobSecretsTypeNull object) {
				return createReusableWorkflowCallJobSecretsTypeNullAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyPropertiesAbstract(ReusableWorkflowCallJobStrategyPropertiesAbstract object) {
				return createReusableWorkflowCallJobStrategyPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAbstract(ReusableWorkflowCallJobStrategyMatrixAbstract object) {
				return createReusableWorkflowCallJobStrategyMatrixAbstractAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixTypeString(ReusableWorkflowCallJobStrategyMatrixTypeString object) {
				return createReusableWorkflowCallJobStrategyMatrixTypeStringAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixTypeInteger(ReusableWorkflowCallJobStrategyMatrixTypeInteger object) {
				return createReusableWorkflowCallJobStrategyMatrixTypeIntegerAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixTypeNumber(ReusableWorkflowCallJobStrategyMatrixTypeNumber object) {
				return createReusableWorkflowCallJobStrategyMatrixTypeNumberAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixTypeBoolean(ReusableWorkflowCallJobStrategyMatrixTypeBoolean object) {
				return createReusableWorkflowCallJobStrategyMatrixTypeBooleanAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixTypeObject(ReusableWorkflowCallJobStrategyMatrixTypeObject object) {
				return createReusableWorkflowCallJobStrategyMatrixTypeObjectAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixPropertiesAbstract(ReusableWorkflowCallJobStrategyMatrixPropertiesAbstract object) {
				return createReusableWorkflowCallJobStrategyMatrixPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixTypeArray(ReusableWorkflowCallJobStrategyMatrixTypeArray object) {
				return createReusableWorkflowCallJobStrategyMatrixTypeArrayAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixItems(ReusableWorkflowCallJobStrategyMatrixItems object) {
				return createReusableWorkflowCallJobStrategyMatrixItemsAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixTypeNull(ReusableWorkflowCallJobStrategyMatrixTypeNull object) {
				return createReusableWorkflowCallJobStrategyMatrixTypeNullAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract(ReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract object) {
				return createReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties(ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties object) {
				return createReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract(ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract object) {
				return createReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeStringAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeIntegerAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumberAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBooleanAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItemsAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull(ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull object) {
				return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNullAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobConcurrencyAbstract(ReusableWorkflowCallJobConcurrencyAbstract object) {
				return createReusableWorkflowCallJobConcurrencyAbstractAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobConcurrencyTypeString(ReusableWorkflowCallJobConcurrencyTypeString object) {
				return createReusableWorkflowCallJobConcurrencyTypeStringAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobConcurrencyTypeInteger(ReusableWorkflowCallJobConcurrencyTypeInteger object) {
				return createReusableWorkflowCallJobConcurrencyTypeIntegerAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobConcurrencyTypeNumber(ReusableWorkflowCallJobConcurrencyTypeNumber object) {
				return createReusableWorkflowCallJobConcurrencyTypeNumberAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobConcurrencyTypeBoolean(ReusableWorkflowCallJobConcurrencyTypeBoolean object) {
				return createReusableWorkflowCallJobConcurrencyTypeBooleanAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobConcurrencyTypeObject(ReusableWorkflowCallJobConcurrencyTypeObject object) {
				return createReusableWorkflowCallJobConcurrencyTypeObjectAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobConcurrencyPropertiesAbstract(ReusableWorkflowCallJobConcurrencyPropertiesAbstract object) {
				return createReusableWorkflowCallJobConcurrencyPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobConcurrencyAdditionalProperties(ReusableWorkflowCallJobConcurrencyAdditionalProperties object) {
				return createReusableWorkflowCallJobConcurrencyAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobConcurrencyTypeArray(ReusableWorkflowCallJobConcurrencyTypeArray object) {
				return createReusableWorkflowCallJobConcurrencyTypeArrayAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobConcurrencyItems(ReusableWorkflowCallJobConcurrencyItems object) {
				return createReusableWorkflowCallJobConcurrencyItemsAdapter();
			}
			@Override
			public Adapter caseReusableWorkflowCallJobConcurrencyTypeNull(ReusableWorkflowCallJobConcurrencyTypeNull object) {
				return createReusableWorkflowCallJobConcurrencyTypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobPropertiesAbstract(NormalJobPropertiesAbstract object) {
				return createNormalJobPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onAbstract(NormalJobRuns_45onAbstract object) {
				return createNormalJobRuns_45onAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onTypeString(NormalJobRuns_45onTypeString object) {
				return createNormalJobRuns_45onTypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onTypeInteger(NormalJobRuns_45onTypeInteger object) {
				return createNormalJobRuns_45onTypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onTypeNumber(NormalJobRuns_45onTypeNumber object) {
				return createNormalJobRuns_45onTypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onTypeBoolean(NormalJobRuns_45onTypeBoolean object) {
				return createNormalJobRuns_45onTypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onTypeObject(NormalJobRuns_45onTypeObject object) {
				return createNormalJobRuns_45onTypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onPropertiesAbstract(NormalJobRuns_45onPropertiesAbstract object) {
				return createNormalJobRuns_45onPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onAdditionalProperties(NormalJobRuns_45onAdditionalProperties object) {
				return createNormalJobRuns_45onAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onTypeArray(NormalJobRuns_45onTypeArray object) {
				return createNormalJobRuns_45onTypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onItems(NormalJobRuns_45onItems object) {
				return createNormalJobRuns_45onItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onTypeNull(NormalJobRuns_45onTypeNull object) {
				return createNormalJobRuns_45onTypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1Items(NormalJobRuns_45onOneOf1Items object) {
				return createNormalJobRuns_45onOneOf1ItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf0Abstract(NormalJobRuns_45onOneOf1AnyOf0Abstract object) {
				return createNormalJobRuns_45onOneOf1AnyOf0AbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf0TypeString(NormalJobRuns_45onOneOf1AnyOf0TypeString object) {
				return createNormalJobRuns_45onOneOf1AnyOf0TypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf0TypeInteger(NormalJobRuns_45onOneOf1AnyOf0TypeInteger object) {
				return createNormalJobRuns_45onOneOf1AnyOf0TypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf0TypeNumber(NormalJobRuns_45onOneOf1AnyOf0TypeNumber object) {
				return createNormalJobRuns_45onOneOf1AnyOf0TypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf0TypeBoolean(NormalJobRuns_45onOneOf1AnyOf0TypeBoolean object) {
				return createNormalJobRuns_45onOneOf1AnyOf0TypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf0TypeObject(NormalJobRuns_45onOneOf1AnyOf0TypeObject object) {
				return createNormalJobRuns_45onOneOf1AnyOf0TypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf0PropertiesAbstract(NormalJobRuns_45onOneOf1AnyOf0PropertiesAbstract object) {
				return createNormalJobRuns_45onOneOf1AnyOf0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties(NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties object) {
				return createNormalJobRuns_45onOneOf1AnyOf0AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf0TypeArray(NormalJobRuns_45onOneOf1AnyOf0TypeArray object) {
				return createNormalJobRuns_45onOneOf1AnyOf0TypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf0TypeNull(NormalJobRuns_45onOneOf1AnyOf0TypeNull object) {
				return createNormalJobRuns_45onOneOf1AnyOf0TypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1Abstract(NormalJobRuns_45onOneOf1AnyOf1Abstract object) {
				return createNormalJobRuns_45onOneOf1AnyOf1AbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1TypeString(NormalJobRuns_45onOneOf1AnyOf1TypeString object) {
				return createNormalJobRuns_45onOneOf1AnyOf1TypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1TypeInteger(NormalJobRuns_45onOneOf1AnyOf1TypeInteger object) {
				return createNormalJobRuns_45onOneOf1AnyOf1TypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1TypeNumber(NormalJobRuns_45onOneOf1AnyOf1TypeNumber object) {
				return createNormalJobRuns_45onOneOf1AnyOf1TypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1TypeBoolean(NormalJobRuns_45onOneOf1AnyOf1TypeBoolean object) {
				return createNormalJobRuns_45onOneOf1AnyOf1TypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1TypeObject(NormalJobRuns_45onOneOf1AnyOf1TypeObject object) {
				return createNormalJobRuns_45onOneOf1AnyOf1TypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1PropertiesAbstract(NormalJobRuns_45onOneOf1AnyOf1PropertiesAbstract object) {
				return createNormalJobRuns_45onOneOf1AnyOf1PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties(NormalJobRuns_45onOneOf1AnyOf1AdditionalProperties object) {
				return createNormalJobRuns_45onOneOf1AnyOf1AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1TypeArray(NormalJobRuns_45onOneOf1AnyOf1TypeArray object) {
				return createNormalJobRuns_45onOneOf1AnyOf1TypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf1TypeNull(NormalJobRuns_45onOneOf1AnyOf1TypeNull object) {
				return createNormalJobRuns_45onOneOf1AnyOf1TypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2Abstract(NormalJobRuns_45onOneOf1AnyOf2Abstract object) {
				return createNormalJobRuns_45onOneOf1AnyOf2AbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2TypeString(NormalJobRuns_45onOneOf1AnyOf2TypeString object) {
				return createNormalJobRuns_45onOneOf1AnyOf2TypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2TypeInteger(NormalJobRuns_45onOneOf1AnyOf2TypeInteger object) {
				return createNormalJobRuns_45onOneOf1AnyOf2TypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2TypeNumber(NormalJobRuns_45onOneOf1AnyOf2TypeNumber object) {
				return createNormalJobRuns_45onOneOf1AnyOf2TypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2TypeBoolean(NormalJobRuns_45onOneOf1AnyOf2TypeBoolean object) {
				return createNormalJobRuns_45onOneOf1AnyOf2TypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2TypeObject(NormalJobRuns_45onOneOf1AnyOf2TypeObject object) {
				return createNormalJobRuns_45onOneOf1AnyOf2TypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract(NormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract object) {
				return createNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties(NormalJobRuns_45onOneOf1AnyOf2AdditionalProperties object) {
				return createNormalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2TypeArray(NormalJobRuns_45onOneOf1AnyOf2TypeArray object) {
				return createNormalJobRuns_45onOneOf1AnyOf2TypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf2TypeNull(NormalJobRuns_45onOneOf1AnyOf2TypeNull object) {
				return createNormalJobRuns_45onOneOf1AnyOf2TypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3Abstract(NormalJobRuns_45onOneOf1AnyOf3Abstract object) {
				return createNormalJobRuns_45onOneOf1AnyOf3AbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3TypeString(NormalJobRuns_45onOneOf1AnyOf3TypeString object) {
				return createNormalJobRuns_45onOneOf1AnyOf3TypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3TypeInteger(NormalJobRuns_45onOneOf1AnyOf3TypeInteger object) {
				return createNormalJobRuns_45onOneOf1AnyOf3TypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3TypeNumber(NormalJobRuns_45onOneOf1AnyOf3TypeNumber object) {
				return createNormalJobRuns_45onOneOf1AnyOf3TypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3TypeBoolean(NormalJobRuns_45onOneOf1AnyOf3TypeBoolean object) {
				return createNormalJobRuns_45onOneOf1AnyOf3TypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3TypeObject(NormalJobRuns_45onOneOf1AnyOf3TypeObject object) {
				return createNormalJobRuns_45onOneOf1AnyOf3TypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3PropertiesAbstract(NormalJobRuns_45onOneOf1AnyOf3PropertiesAbstract object) {
				return createNormalJobRuns_45onOneOf1AnyOf3PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3AdditionalProperties(NormalJobRuns_45onOneOf1AnyOf3AdditionalProperties object) {
				return createNormalJobRuns_45onOneOf1AnyOf3AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3TypeArray(NormalJobRuns_45onOneOf1AnyOf3TypeArray object) {
				return createNormalJobRuns_45onOneOf1AnyOf3TypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf3TypeNull(NormalJobRuns_45onOneOf1AnyOf3TypeNull object) {
				return createNormalJobRuns_45onOneOf1AnyOf3TypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4Abstract(NormalJobRuns_45onOneOf1AnyOf4Abstract object) {
				return createNormalJobRuns_45onOneOf1AnyOf4AbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4TypeString(NormalJobRuns_45onOneOf1AnyOf4TypeString object) {
				return createNormalJobRuns_45onOneOf1AnyOf4TypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4TypeInteger(NormalJobRuns_45onOneOf1AnyOf4TypeInteger object) {
				return createNormalJobRuns_45onOneOf1AnyOf4TypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4TypeNumber(NormalJobRuns_45onOneOf1AnyOf4TypeNumber object) {
				return createNormalJobRuns_45onOneOf1AnyOf4TypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4TypeBoolean(NormalJobRuns_45onOneOf1AnyOf4TypeBoolean object) {
				return createNormalJobRuns_45onOneOf1AnyOf4TypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4TypeObject(NormalJobRuns_45onOneOf1AnyOf4TypeObject object) {
				return createNormalJobRuns_45onOneOf1AnyOf4TypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4PropertiesAbstract(NormalJobRuns_45onOneOf1AnyOf4PropertiesAbstract object) {
				return createNormalJobRuns_45onOneOf1AnyOf4PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4AdditionalProperties(NormalJobRuns_45onOneOf1AnyOf4AdditionalProperties object) {
				return createNormalJobRuns_45onOneOf1AnyOf4AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4TypeArray(NormalJobRuns_45onOneOf1AnyOf4TypeArray object) {
				return createNormalJobRuns_45onOneOf1AnyOf4TypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobRuns_45onOneOf1AnyOf4TypeNull(NormalJobRuns_45onOneOf1AnyOf4TypeNull object) {
				return createNormalJobRuns_45onOneOf1AnyOf4TypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobEnvironmentAbstract(NormalJobEnvironmentAbstract object) {
				return createNormalJobEnvironmentAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobEnvironmentTypeString(NormalJobEnvironmentTypeString object) {
				return createNormalJobEnvironmentTypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobEnvironmentTypeInteger(NormalJobEnvironmentTypeInteger object) {
				return createNormalJobEnvironmentTypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobEnvironmentTypeNumber(NormalJobEnvironmentTypeNumber object) {
				return createNormalJobEnvironmentTypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobEnvironmentTypeBoolean(NormalJobEnvironmentTypeBoolean object) {
				return createNormalJobEnvironmentTypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobEnvironmentTypeObject(NormalJobEnvironmentTypeObject object) {
				return createNormalJobEnvironmentTypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobEnvironmentPropertiesAbstract(NormalJobEnvironmentPropertiesAbstract object) {
				return createNormalJobEnvironmentPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobEnvironmentAdditionalProperties(NormalJobEnvironmentAdditionalProperties object) {
				return createNormalJobEnvironmentAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobEnvironmentTypeArray(NormalJobEnvironmentTypeArray object) {
				return createNormalJobEnvironmentTypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobEnvironmentItems(NormalJobEnvironmentItems object) {
				return createNormalJobEnvironmentItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobEnvironmentTypeNull(NormalJobEnvironmentTypeNull object) {
				return createNormalJobEnvironmentTypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobOutputsPropertiesAbstract(NormalJobOutputsPropertiesAbstract object) {
				return createNormalJobOutputsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobIfAbstract(NormalJobIfAbstract object) {
				return createNormalJobIfAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobIfTypeBoolean(NormalJobIfTypeBoolean object) {
				return createNormalJobIfTypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobIfTypeNumber(NormalJobIfTypeNumber object) {
				return createNormalJobIfTypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobIfTypeString(NormalJobIfTypeString object) {
				return createNormalJobIfTypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAbstract(NormalJobStepsItemsAbstract object) {
				return createNormalJobStepsItemsAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsTypeString(NormalJobStepsItemsTypeString object) {
				return createNormalJobStepsItemsTypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsTypeInteger(NormalJobStepsItemsTypeInteger object) {
				return createNormalJobStepsItemsTypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsTypeNumber(NormalJobStepsItemsTypeNumber object) {
				return createNormalJobStepsItemsTypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsTypeBoolean(NormalJobStepsItemsTypeBoolean object) {
				return createNormalJobStepsItemsTypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsTypeObject(NormalJobStepsItemsTypeObject object) {
				return createNormalJobStepsItemsTypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsPropertiesAbstract(NormalJobStepsItemsPropertiesAbstract object) {
				return createNormalJobStepsItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAdditionalProperties(NormalJobStepsItemsAdditionalProperties object) {
				return createNormalJobStepsItemsAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsTypeArray(NormalJobStepsItemsTypeArray object) {
				return createNormalJobStepsItemsTypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsItems(NormalJobStepsItemsItems object) {
				return createNormalJobStepsItemsItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsTypeNull(NormalJobStepsItemsTypeNull object) {
				return createNormalJobStepsItemsTypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0Abstract(NormalJobStepsItemsAllOf0Abstract object) {
				return createNormalJobStepsItemsAllOf0AbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0TypeString(NormalJobStepsItemsAllOf0TypeString object) {
				return createNormalJobStepsItemsAllOf0TypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0TypeInteger(NormalJobStepsItemsAllOf0TypeInteger object) {
				return createNormalJobStepsItemsAllOf0TypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0TypeNumber(NormalJobStepsItemsAllOf0TypeNumber object) {
				return createNormalJobStepsItemsAllOf0TypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0TypeBoolean(NormalJobStepsItemsAllOf0TypeBoolean object) {
				return createNormalJobStepsItemsAllOf0TypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0TypeObject(NormalJobStepsItemsAllOf0TypeObject object) {
				return createNormalJobStepsItemsAllOf0TypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0PropertiesAbstract(NormalJobStepsItemsAllOf0PropertiesAbstract object) {
				return createNormalJobStepsItemsAllOf0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0AdditionalProperties(NormalJobStepsItemsAllOf0AdditionalProperties object) {
				return createNormalJobStepsItemsAllOf0AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0TypeArray(NormalJobStepsItemsAllOf0TypeArray object) {
				return createNormalJobStepsItemsAllOf0TypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0Items(NormalJobStepsItemsAllOf0Items object) {
				return createNormalJobStepsItemsAllOf0ItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0TypeNull(NormalJobStepsItemsAllOf0TypeNull object) {
				return createNormalJobStepsItemsAllOf0TypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0OneOf0PropertiesAbstract(NormalJobStepsItemsAllOf0OneOf0PropertiesAbstract object) {
				return createNormalJobStepsItemsAllOf0OneOf0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0OneOf0AdditionalProperties(NormalJobStepsItemsAllOf0OneOf0AdditionalProperties object) {
				return createNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract(NormalJobStepsItemsAllOf0OneOf1PropertiesAbstract object) {
				return createNormalJobStepsItemsAllOf0OneOf1PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf0OneOf1AdditionalProperties(NormalJobStepsItemsAllOf0OneOf1AdditionalProperties object) {
				return createNormalJobStepsItemsAllOf0OneOf1AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1PropertiesAbstract(NormalJobStepsItemsAllOf1PropertiesAbstract object) {
				return createNormalJobStepsItemsAllOf1PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1IfAbstract(NormalJobStepsItemsAllOf1IfAbstract object) {
				return createNormalJobStepsItemsAllOf1IfAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1IfTypeBoolean(NormalJobStepsItemsAllOf1IfTypeBoolean object) {
				return createNormalJobStepsItemsAllOf1IfTypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1IfTypeNumber(NormalJobStepsItemsAllOf1IfTypeNumber object) {
				return createNormalJobStepsItemsAllOf1IfTypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1IfTypeString(NormalJobStepsItemsAllOf1IfTypeString object) {
				return createNormalJobStepsItemsAllOf1IfTypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract(NormalJobStepsItemsAllOf1Continue_45on_45errorAbstract object) {
				return createNormalJobStepsItemsAllOf1Continue_45on_45errorAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString(NormalJobStepsItemsAllOf1Continue_45on_45errorTypeString object) {
				return createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger(NormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger object) {
				return createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber(NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber object) {
				return createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean(NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean object) {
				return createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject(NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject object) {
				return createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract(NormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract object) {
				return createNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties(NormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties object) {
				return createNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray(NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray object) {
				return createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Continue_45on_45errorItems(NormalJobStepsItemsAllOf1Continue_45on_45errorItems object) {
				return createNormalJobStepsItemsAllOf1Continue_45on_45errorItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull(NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull object) {
				return createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyPropertiesAbstract(NormalJobStrategyPropertiesAbstract object) {
				return createNormalJobStrategyPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAbstract(NormalJobStrategyMatrixAbstract object) {
				return createNormalJobStrategyMatrixAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixTypeString(NormalJobStrategyMatrixTypeString object) {
				return createNormalJobStrategyMatrixTypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixTypeInteger(NormalJobStrategyMatrixTypeInteger object) {
				return createNormalJobStrategyMatrixTypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixTypeNumber(NormalJobStrategyMatrixTypeNumber object) {
				return createNormalJobStrategyMatrixTypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixTypeBoolean(NormalJobStrategyMatrixTypeBoolean object) {
				return createNormalJobStrategyMatrixTypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixTypeObject(NormalJobStrategyMatrixTypeObject object) {
				return createNormalJobStrategyMatrixTypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixPropertiesAbstract(NormalJobStrategyMatrixPropertiesAbstract object) {
				return createNormalJobStrategyMatrixPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixTypeArray(NormalJobStrategyMatrixTypeArray object) {
				return createNormalJobStrategyMatrixTypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixItems(NormalJobStrategyMatrixItems object) {
				return createNormalJobStrategyMatrixItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixTypeNull(NormalJobStrategyMatrixTypeNull object) {
				return createNormalJobStrategyMatrixTypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixOneOf0PropertiesAbstract(NormalJobStrategyMatrixOneOf0PropertiesAbstract object) {
				return createNormalJobStrategyMatrixOneOf0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixOneOf0AdditionalProperties(NormalJobStrategyMatrixOneOf0AdditionalProperties object) {
				return createNormalJobStrategyMatrixOneOf0AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract(NormalJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract object) {
				return createNormalJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalPropertiesAbstract(NormalJobStrategyMatrixAdditionalPropertiesAbstract object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalPropertiesTypeString(NormalJobStrategyMatrixAdditionalPropertiesTypeString object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesTypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalPropertiesTypeInteger(NormalJobStrategyMatrixAdditionalPropertiesTypeInteger object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesTypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalPropertiesTypeNumber(NormalJobStrategyMatrixAdditionalPropertiesTypeNumber object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesTypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalPropertiesTypeBoolean(NormalJobStrategyMatrixAdditionalPropertiesTypeBoolean object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesTypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalPropertiesTypeObject(NormalJobStrategyMatrixAdditionalPropertiesTypeObject object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesTypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalPropertiesPropertiesAbstract(NormalJobStrategyMatrixAdditionalPropertiesPropertiesAbstract object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties(NormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalPropertiesTypeArray(NormalJobStrategyMatrixAdditionalPropertiesTypeArray object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesTypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalPropertiesItems(NormalJobStrategyMatrixAdditionalPropertiesItems object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobStrategyMatrixAdditionalPropertiesTypeNull(NormalJobStrategyMatrixAdditionalPropertiesTypeNull object) {
				return createNormalJobStrategyMatrixAdditionalPropertiesTypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobContinue_45on_45errorAbstract(NormalJobContinue_45on_45errorAbstract object) {
				return createNormalJobContinue_45on_45errorAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobContinue_45on_45errorTypeString(NormalJobContinue_45on_45errorTypeString object) {
				return createNormalJobContinue_45on_45errorTypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobContinue_45on_45errorTypeInteger(NormalJobContinue_45on_45errorTypeInteger object) {
				return createNormalJobContinue_45on_45errorTypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobContinue_45on_45errorTypeNumber(NormalJobContinue_45on_45errorTypeNumber object) {
				return createNormalJobContinue_45on_45errorTypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobContinue_45on_45errorTypeBoolean(NormalJobContinue_45on_45errorTypeBoolean object) {
				return createNormalJobContinue_45on_45errorTypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobContinue_45on_45errorTypeObject(NormalJobContinue_45on_45errorTypeObject object) {
				return createNormalJobContinue_45on_45errorTypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobContinue_45on_45errorPropertiesAbstract(NormalJobContinue_45on_45errorPropertiesAbstract object) {
				return createNormalJobContinue_45on_45errorPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobContinue_45on_45errorAdditionalProperties(NormalJobContinue_45on_45errorAdditionalProperties object) {
				return createNormalJobContinue_45on_45errorAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobContinue_45on_45errorTypeArray(NormalJobContinue_45on_45errorTypeArray object) {
				return createNormalJobContinue_45on_45errorTypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobContinue_45on_45errorItems(NormalJobContinue_45on_45errorItems object) {
				return createNormalJobContinue_45on_45errorItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobContinue_45on_45errorTypeNull(NormalJobContinue_45on_45errorTypeNull object) {
				return createNormalJobContinue_45on_45errorTypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobContainerAbstract(NormalJobContainerAbstract object) {
				return createNormalJobContainerAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobContainerTypeString(NormalJobContainerTypeString object) {
				return createNormalJobContainerTypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobContainerTypeInteger(NormalJobContainerTypeInteger object) {
				return createNormalJobContainerTypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobContainerTypeNumber(NormalJobContainerTypeNumber object) {
				return createNormalJobContainerTypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobContainerTypeBoolean(NormalJobContainerTypeBoolean object) {
				return createNormalJobContainerTypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobContainerTypeObject(NormalJobContainerTypeObject object) {
				return createNormalJobContainerTypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobContainerPropertiesAbstract(NormalJobContainerPropertiesAbstract object) {
				return createNormalJobContainerPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobContainerAdditionalProperties(NormalJobContainerAdditionalProperties object) {
				return createNormalJobContainerAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobContainerTypeArray(NormalJobContainerTypeArray object) {
				return createNormalJobContainerTypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobContainerItems(NormalJobContainerItems object) {
				return createNormalJobContainerItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobContainerTypeNull(NormalJobContainerTypeNull object) {
				return createNormalJobContainerTypeNullAdapter();
			}
			@Override
			public Adapter caseNormalJobServicesPropertiesAbstract(NormalJobServicesPropertiesAbstract object) {
				return createNormalJobServicesPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobConcurrencyAbstract(NormalJobConcurrencyAbstract object) {
				return createNormalJobConcurrencyAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobConcurrencyTypeString(NormalJobConcurrencyTypeString object) {
				return createNormalJobConcurrencyTypeStringAdapter();
			}
			@Override
			public Adapter caseNormalJobConcurrencyTypeInteger(NormalJobConcurrencyTypeInteger object) {
				return createNormalJobConcurrencyTypeIntegerAdapter();
			}
			@Override
			public Adapter caseNormalJobConcurrencyTypeNumber(NormalJobConcurrencyTypeNumber object) {
				return createNormalJobConcurrencyTypeNumberAdapter();
			}
			@Override
			public Adapter caseNormalJobConcurrencyTypeBoolean(NormalJobConcurrencyTypeBoolean object) {
				return createNormalJobConcurrencyTypeBooleanAdapter();
			}
			@Override
			public Adapter caseNormalJobConcurrencyTypeObject(NormalJobConcurrencyTypeObject object) {
				return createNormalJobConcurrencyTypeObjectAdapter();
			}
			@Override
			public Adapter caseNormalJobConcurrencyPropertiesAbstract(NormalJobConcurrencyPropertiesAbstract object) {
				return createNormalJobConcurrencyPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseNormalJobConcurrencyAdditionalProperties(NormalJobConcurrencyAdditionalProperties object) {
				return createNormalJobConcurrencyAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseNormalJobConcurrencyTypeArray(NormalJobConcurrencyTypeArray object) {
				return createNormalJobConcurrencyTypeArrayAdapter();
			}
			@Override
			public Adapter caseNormalJobConcurrencyItems(NormalJobConcurrencyItems object) {
				return createNormalJobConcurrencyItemsAdapter();
			}
			@Override
			public Adapter caseNormalJobConcurrencyTypeNull(NormalJobConcurrencyTypeNull object) {
				return createNormalJobConcurrencyTypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnAbstract(GithubwfRootOnAbstract object) {
				return createGithubwfRootOnAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnTypeString(GithubwfRootOnTypeString object) {
				return createGithubwfRootOnTypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnTypeInteger(GithubwfRootOnTypeInteger object) {
				return createGithubwfRootOnTypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnTypeNumber(GithubwfRootOnTypeNumber object) {
				return createGithubwfRootOnTypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnTypeBoolean(GithubwfRootOnTypeBoolean object) {
				return createGithubwfRootOnTypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnTypeObject(GithubwfRootOnTypeObject object) {
				return createGithubwfRootOnTypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnPropertiesAbstract(GithubwfRootOnPropertiesAbstract object) {
				return createGithubwfRootOnPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnAdditionalProperties(GithubwfRootOnAdditionalProperties object) {
				return createGithubwfRootOnAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnTypeArray(GithubwfRootOnTypeArray object) {
				return createGithubwfRootOnTypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnItems(GithubwfRootOnItems object) {
				return createGithubwfRootOnItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnTypeNull(GithubwfRootOnTypeNull object) {
				return createGithubwfRootOnTypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2PropertiesAbstract(GithubwfRootOnOneOf2PropertiesAbstract object) {
				return createGithubwfRootOnOneOf2PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_requestPatternProperties0Items(GithubwfRootOnOneOf2Pull_requestPatternProperties0Items object) {
				return createGithubwfRootOnOneOf2Pull_requestPatternProperties0ItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_targetPatternProperties0Abstract(GithubwfRootOnOneOf2Pull_request_targetPatternProperties0Abstract object) {
				return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeString(GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeString object) {
				return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger(GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger object) {
				return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumber(GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumber object) {
				return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBoolean(GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBoolean object) {
				return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObject(GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObject object) {
				return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_targetPatternProperties0PropertiesAbstract(GithubwfRootOnOneOf2Pull_request_targetPatternProperties0PropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties(GithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties object) {
				return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArray(GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArray object) {
				return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_targetPatternProperties0Items(GithubwfRootOnOneOf2Pull_request_targetPatternProperties0Items object) {
				return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0ItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNull(GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNull object) {
				return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callAbstract(GithubwfRootOnOneOf2Workflow_callAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_callAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callTypeString(GithubwfRootOnOneOf2Workflow_callTypeString object) {
				return createGithubwfRootOnOneOf2Workflow_callTypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callTypeInteger(GithubwfRootOnOneOf2Workflow_callTypeInteger object) {
				return createGithubwfRootOnOneOf2Workflow_callTypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callTypeNumber(GithubwfRootOnOneOf2Workflow_callTypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_callTypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callTypeBoolean(GithubwfRootOnOneOf2Workflow_callTypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_callTypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callTypeObject(GithubwfRootOnOneOf2Workflow_callTypeObject object) {
				return createGithubwfRootOnOneOf2Workflow_callTypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callPropertiesAbstract(GithubwfRootOnOneOf2Workflow_callPropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_callPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callAdditionalProperties(GithubwfRootOnOneOf2Workflow_callAdditionalProperties object) {
				return createGithubwfRootOnOneOf2Workflow_callAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callTypeArray(GithubwfRootOnOneOf2Workflow_callTypeArray object) {
				return createGithubwfRootOnOneOf2Workflow_callTypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callItems(GithubwfRootOnOneOf2Workflow_callItems object) {
				return createGithubwfRootOnOneOf2Workflow_callItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callTypeNull(GithubwfRootOnOneOf2Workflow_callTypeNull object) {
				return createGithubwfRootOnOneOf2Workflow_callTypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callInputsPropertiesAbstract(GithubwfRootOnOneOf2Workflow_callInputsPropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_callInputsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstract(GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstract(GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBoolean(GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumber(GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString(GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString object) {
				return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsAbstract(GithubwfRootOnOneOf2Workflow_callSecretsAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsTypeString(GithubwfRootOnOneOf2Workflow_callSecretsTypeString object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsTypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsTypeInteger(GithubwfRootOnOneOf2Workflow_callSecretsTypeInteger object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsTypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsTypeNumber(GithubwfRootOnOneOf2Workflow_callSecretsTypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsTypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean(GithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsTypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsTypeObject(GithubwfRootOnOneOf2Workflow_callSecretsTypeObject object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsTypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPropertiesAbstract(GithubwfRootOnOneOf2Workflow_callSecretsPropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsTypeArray(GithubwfRootOnOneOf2Workflow_callSecretsTypeArray object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsTypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsItems(GithubwfRootOnOneOf2Workflow_callSecretsItems object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsTypeNull(GithubwfRootOnOneOf2Workflow_callSecretsTypeNull object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsTypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Abstract(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Abstract object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0AbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeString(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeString object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeInteger(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeInteger object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumber(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBoolean(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArray(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArray object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Items(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Items object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0ItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNull(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNull object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstract(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeString(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeString object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeInteger(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeInteger object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumber(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBoolean(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObject(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObject object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredPropertiesAbstract(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredPropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNull(GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNull object) {
				return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchAbstract(GithubwfRootOnOneOf2Workflow_dispatchAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchTypeString(GithubwfRootOnOneOf2Workflow_dispatchTypeString object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchTypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchTypeInteger(GithubwfRootOnOneOf2Workflow_dispatchTypeInteger object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchTypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchTypeNumber(GithubwfRootOnOneOf2Workflow_dispatchTypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchTypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchTypeBoolean(GithubwfRootOnOneOf2Workflow_dispatchTypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchTypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchTypeObject(GithubwfRootOnOneOf2Workflow_dispatchTypeObject object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchTypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstract(GithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties(GithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchTypeArray(GithubwfRootOnOneOf2Workflow_dispatchTypeArray object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchTypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchItems(GithubwfRootOnOneOf2Workflow_dispatchItems object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchTypeNull(GithubwfRootOnOneOf2Workflow_dispatchTypeNull object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchTypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPropertiesAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0PropertiesAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0PropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeString(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeString object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeInteger(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeInteger object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumber(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBoolean(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObject(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObject object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultPropertiesAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultPropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArray(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArray object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItems(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItems object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Abstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Abstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeString(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeString object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeInteger(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeInteger object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumber(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBoolean(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArray(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArray object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Items(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Items object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNull(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNull object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull(GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull object) {
				return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runPatternProperties0Abstract(GithubwfRootOnOneOf2Workflow_runPatternProperties0Abstract object) {
				return createGithubwfRootOnOneOf2Workflow_runPatternProperties0AbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeString(GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeString object) {
				return createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeInteger(GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeInteger object) {
				return createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumber(GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumber object) {
				return createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBoolean(GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBoolean object) {
				return createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject(GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject object) {
				return createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runPatternProperties0PropertiesAbstract(GithubwfRootOnOneOf2Workflow_runPatternProperties0PropertiesAbstract object) {
				return createGithubwfRootOnOneOf2Workflow_runPatternProperties0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties(GithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties object) {
				return createGithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArray(GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArray object) {
				return createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runPatternProperties0Items(GithubwfRootOnOneOf2Workflow_runPatternProperties0Items object) {
				return createGithubwfRootOnOneOf2Workflow_runPatternProperties0ItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNull(GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNull object) {
				return createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ScheduleItemsAbstract(GithubwfRootOnOneOf2ScheduleItemsAbstract object) {
				return createGithubwfRootOnOneOf2ScheduleItemsAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ScheduleItemsTypeString(GithubwfRootOnOneOf2ScheduleItemsTypeString object) {
				return createGithubwfRootOnOneOf2ScheduleItemsTypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ScheduleItemsTypeInteger(GithubwfRootOnOneOf2ScheduleItemsTypeInteger object) {
				return createGithubwfRootOnOneOf2ScheduleItemsTypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ScheduleItemsTypeNumber(GithubwfRootOnOneOf2ScheduleItemsTypeNumber object) {
				return createGithubwfRootOnOneOf2ScheduleItemsTypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ScheduleItemsTypeBoolean(GithubwfRootOnOneOf2ScheduleItemsTypeBoolean object) {
				return createGithubwfRootOnOneOf2ScheduleItemsTypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ScheduleItemsTypeObject(GithubwfRootOnOneOf2ScheduleItemsTypeObject object) {
				return createGithubwfRootOnOneOf2ScheduleItemsTypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract(GithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract object) {
				return createGithubwfRootOnOneOf2ScheduleItemsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ScheduleItemsTypeArray(GithubwfRootOnOneOf2ScheduleItemsTypeArray object) {
				return createGithubwfRootOnOneOf2ScheduleItemsTypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ScheduleItemsItems(GithubwfRootOnOneOf2ScheduleItemsItems object) {
				return createGithubwfRootOnOneOf2ScheduleItemsItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootOnOneOf2ScheduleItemsTypeNull(GithubwfRootOnOneOf2ScheduleItemsTypeNull object) {
				return createGithubwfRootOnOneOf2ScheduleItemsTypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootConcurrencyAbstract(GithubwfRootConcurrencyAbstract object) {
				return createGithubwfRootConcurrencyAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootConcurrencyTypeString(GithubwfRootConcurrencyTypeString object) {
				return createGithubwfRootConcurrencyTypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootConcurrencyTypeInteger(GithubwfRootConcurrencyTypeInteger object) {
				return createGithubwfRootConcurrencyTypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootConcurrencyTypeNumber(GithubwfRootConcurrencyTypeNumber object) {
				return createGithubwfRootConcurrencyTypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootConcurrencyTypeBoolean(GithubwfRootConcurrencyTypeBoolean object) {
				return createGithubwfRootConcurrencyTypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootConcurrencyTypeObject(GithubwfRootConcurrencyTypeObject object) {
				return createGithubwfRootConcurrencyTypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootConcurrencyPropertiesAbstract(GithubwfRootConcurrencyPropertiesAbstract object) {
				return createGithubwfRootConcurrencyPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootConcurrencyAdditionalProperties(GithubwfRootConcurrencyAdditionalProperties object) {
				return createGithubwfRootConcurrencyAdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootConcurrencyTypeArray(GithubwfRootConcurrencyTypeArray object) {
				return createGithubwfRootConcurrencyTypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootConcurrencyItems(GithubwfRootConcurrencyItems object) {
				return createGithubwfRootConcurrencyItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootConcurrencyTypeNull(GithubwfRootConcurrencyTypeNull object) {
				return createGithubwfRootConcurrencyTypeNullAdapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPropertiesAbstract(GithubwfRootJobsPropertiesAbstract object) {
				return createGithubwfRootJobsPropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPatternProperties0Abstract(GithubwfRootJobsPatternProperties0Abstract object) {
				return createGithubwfRootJobsPatternProperties0AbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPatternProperties0TypeString(GithubwfRootJobsPatternProperties0TypeString object) {
				return createGithubwfRootJobsPatternProperties0TypeStringAdapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPatternProperties0TypeInteger(GithubwfRootJobsPatternProperties0TypeInteger object) {
				return createGithubwfRootJobsPatternProperties0TypeIntegerAdapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPatternProperties0TypeNumber(GithubwfRootJobsPatternProperties0TypeNumber object) {
				return createGithubwfRootJobsPatternProperties0TypeNumberAdapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPatternProperties0TypeBoolean(GithubwfRootJobsPatternProperties0TypeBoolean object) {
				return createGithubwfRootJobsPatternProperties0TypeBooleanAdapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPatternProperties0TypeObject(GithubwfRootJobsPatternProperties0TypeObject object) {
				return createGithubwfRootJobsPatternProperties0TypeObjectAdapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPatternProperties0PropertiesAbstract(GithubwfRootJobsPatternProperties0PropertiesAbstract object) {
				return createGithubwfRootJobsPatternProperties0PropertiesAbstractAdapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPatternProperties0AdditionalProperties(GithubwfRootJobsPatternProperties0AdditionalProperties object) {
				return createGithubwfRootJobsPatternProperties0AdditionalPropertiesAdapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPatternProperties0TypeArray(GithubwfRootJobsPatternProperties0TypeArray object) {
				return createGithubwfRootJobsPatternProperties0TypeArrayAdapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPatternProperties0Items(GithubwfRootJobsPatternProperties0Items object) {
				return createGithubwfRootJobsPatternProperties0ItemsAdapter();
			}
			@Override
			public Adapter caseGithubwfRootJobsPatternProperties0TypeNull(GithubwfRootJobsPatternProperties0TypeNull object) {
				return createGithubwfRootJobsPatternProperties0TypeNullAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectAdditionalProperties <em>Event Object Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectAdditionalProperties
	 * @generated
	 */
	public Adapter createEventObjectAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRoot <em>Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRoot
	 * @generated
	 */
	public Adapter createGithubwfRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Architecture <em>Architecture</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Architecture
	 * @generated
	 */
	public Adapter createArchitectureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Branch
	 * @generated
	 */
	public Adapter createBranchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Concurrency <em>Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Concurrency
	 * @generated
	 */
	public Adapter createConcurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyGroup <em>Concurrency Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyGroup
	 * @generated
	 */
	public Adapter createConcurrencyGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyCancel_45in_45progress <em>Concurrency Cancel 45in 45progress</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyCancel_45in_45progress
	 * @generated
	 */
	public Adapter createConcurrencyCancel_45in_45progressAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyCancel_45in_45progressOneOf0 <em>Concurrency Cancel 45in 45progress One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyCancel_45in_45progressOneOf0
	 * @generated
	 */
	public Adapter createConcurrencyCancel_45in_45progressOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyCancel_45in_45progressOneOf1 <em>Concurrency Cancel 45in 45progress One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyCancel_45in_45progressOneOf1
	 * @generated
	 */
	public Adapter createConcurrencyCancel_45in_45progressOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Configuration
	 * @generated
	 */
	public Adapter createConfigurationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationOneOf0 <em>Configuration One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationOneOf0
	 * @generated
	 */
	public Adapter createConfigurationOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationOneOf1 <em>Configuration One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationOneOf1
	 * @generated
	 */
	public Adapter createConfigurationOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationOneOf2 <em>Configuration One Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationOneOf2
	 * @generated
	 */
	public Adapter createConfigurationOneOf2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationOneOf3 <em>Configuration One Of3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationOneOf3
	 * @generated
	 */
	public Adapter createConfigurationOneOf3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationOneOf3AdditionalProperties <em>Configuration One Of3 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationOneOf3AdditionalProperties
	 * @generated
	 */
	public Adapter createConfigurationOneOf3AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationOneOf4 <em>Configuration One Of4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationOneOf4
	 * @generated
	 */
	public Adapter createConfigurationOneOf4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationOneOf4Items <em>Configuration One Of4 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationOneOf4Items
	 * @generated
	 */
	public Adapter createConfigurationOneOf4ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Container <em>Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Container
	 * @generated
	 */
	public Adapter createContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerImage <em>Container Image</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerImage
	 * @generated
	 */
	public Adapter createContainerImageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerCredentials <em>Container Credentials</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerCredentials
	 * @generated
	 */
	public Adapter createContainerCredentialsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerCredentialsUsername <em>Container Credentials Username</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerCredentialsUsername
	 * @generated
	 */
	public Adapter createContainerCredentialsUsernameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerCredentialsPassword <em>Container Credentials Password</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerCredentialsPassword
	 * @generated
	 */
	public Adapter createContainerCredentialsPasswordAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerEnv <em>Container Env</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerEnv
	 * @generated
	 */
	public Adapter createContainerEnvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPorts <em>Container Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPorts
	 * @generated
	 */
	public Adapter createContainerPortsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPortsItems <em>Container Ports Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPortsItems
	 * @generated
	 */
	public Adapter createContainerPortsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPortsItemsOneOf0 <em>Container Ports Items One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPortsItemsOneOf0
	 * @generated
	 */
	public Adapter createContainerPortsItemsOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPortsItemsOneOf1 <em>Container Ports Items One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPortsItemsOneOf1
	 * @generated
	 */
	public Adapter createContainerPortsItemsOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerVolumes <em>Container Volumes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerVolumes
	 * @generated
	 */
	public Adapter createContainerVolumesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerVolumesItems <em>Container Volumes Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerVolumesItems
	 * @generated
	 */
	public Adapter createContainerVolumesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerOptions <em>Container Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerOptions
	 * @generated
	 */
	public Adapter createContainerOptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Defaults <em>Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Defaults
	 * @generated
	 */
	public Adapter createDefaultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.DefaultsRun <em>Defaults Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.DefaultsRun
	 * @generated
	 */
	public Adapter createDefaultsRunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.DefaultsRunShell <em>Defaults Run Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.DefaultsRunShell
	 * @generated
	 */
	public Adapter createDefaultsRunShellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.DefaultsRunWorking_45directory <em>Defaults Run Working 45directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.DefaultsRunWorking_45directory
	 * @generated
	 */
	public Adapter createDefaultsRunWorking_45directoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions <em>Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions
	 * @generated
	 */
	public Adapter createPermissionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.PermissionsOneOf0 <em>Permissions One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.PermissionsOneOf0
	 * @generated
	 */
	public Adapter createPermissionsOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.PermissionsOneOf1 <em>Permissions One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.PermissionsOneOf1
	 * @generated
	 */
	public Adapter createPermissionsOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45event <em>Permissions 45event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45event
	 * @generated
	 */
	public Adapter createPermissions_45eventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45eventActions <em>Permissions 45event Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45eventActions
	 * @generated
	 */
	public Adapter createPermissions_45eventActionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45eventChecks <em>Permissions 45event Checks</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45eventChecks
	 * @generated
	 */
	public Adapter createPermissions_45eventChecksAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45eventContents <em>Permissions 45event Contents</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45eventContents
	 * @generated
	 */
	public Adapter createPermissions_45eventContentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45eventDeployments <em>Permissions 45event Deployments</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45eventDeployments
	 * @generated
	 */
	public Adapter createPermissions_45eventDeploymentsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45eventDiscussions <em>Permissions 45event Discussions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45eventDiscussions
	 * @generated
	 */
	public Adapter createPermissions_45eventDiscussionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45eventId_45token <em>Permissions 45event Id 45token</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45eventId_45token
	 * @generated
	 */
	public Adapter createPermissions_45eventId_45tokenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45eventIssues <em>Permissions 45event Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45eventIssues
	 * @generated
	 */
	public Adapter createPermissions_45eventIssuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45eventPackages <em>Permissions 45event Packages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45eventPackages
	 * @generated
	 */
	public Adapter createPermissions_45eventPackagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45eventPages <em>Permissions 45event Pages</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45eventPages
	 * @generated
	 */
	public Adapter createPermissions_45eventPagesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45eventPull_45requests <em>Permissions 45event Pull 45requests</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45eventPull_45requests
	 * @generated
	 */
	public Adapter createPermissions_45eventPull_45requestsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45eventRepository_45projects <em>Permissions 45event Repository 45projects</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45eventRepository_45projects
	 * @generated
	 */
	public Adapter createPermissions_45eventRepository_45projectsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45eventSecurity_45events <em>Permissions 45event Security 45events</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45eventSecurity_45events
	 * @generated
	 */
	public Adapter createPermissions_45eventSecurity_45eventsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45eventStatuses <em>Permissions 45event Statuses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45eventStatuses
	 * @generated
	 */
	public Adapter createPermissions_45eventStatusesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45level <em>Permissions 45level</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45level
	 * @generated
	 */
	public Adapter createPermissions_45levelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Env <em>Env</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Env
	 * @generated
	 */
	public Adapter createEnvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0 <em>Env One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0
	 * @generated
	 */
	public Adapter createEnvOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalProperties <em>Env One Of0 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalProperties
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalPropertiesOneOf0 <em>Env One Of0 Additional Properties One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalPropertiesOneOf0
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalPropertiesOneOf1 <em>Env One Of0 Additional Properties One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalPropertiesOneOf1
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalPropertiesOneOf2 <em>Env One Of0 Additional Properties One Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalPropertiesOneOf2
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesOneOf2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf1 <em>Env One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf1
	 * @generated
	 */
	public Adapter createEnvOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Environment <em>Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Environment
	 * @generated
	 */
	public Adapter createEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvironmentName <em>Environment Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvironmentName
	 * @generated
	 */
	public Adapter createEnvironmentNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvironmentUrl <em>Environment Url</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvironmentUrl
	 * @generated
	 */
	public Adapter createEnvironmentUrlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Event <em>Event</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Event
	 * @generated
	 */
	public Adapter createEventAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObject <em>Event Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObject
	 * @generated
	 */
	public Adapter createEventObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectOneOf0 <em>Event Object One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectOneOf0
	 * @generated
	 */
	public Adapter createEventObjectOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectOneOf1 <em>Event Object One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectOneOf1
	 * @generated
	 */
	public Adapter createEventObjectOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ExpressionSyntax <em>Expression Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ExpressionSyntax
	 * @generated
	 */
	public Adapter createExpressionSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.StringContainingExpressionSyntax <em>String Containing Expression Syntax</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.StringContainingExpressionSyntax
	 * @generated
	 */
	public Adapter createStringContainingExpressionSyntaxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Globs <em>Globs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Globs
	 * @generated
	 */
	public Adapter createGlobsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GlobsItems <em>Globs Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GlobsItems
	 * @generated
	 */
	public Adapter createGlobsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Machine <em>Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Machine
	 * @generated
	 */
	public Adapter createMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Name <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Name
	 * @generated
	 */
	public Adapter createNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Path <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Path
	 * @generated
	 */
	public Adapter createPathAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Ref <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Ref
	 * @generated
	 */
	public Adapter createRefAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefBranches <em>Ref Branches</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefBranches
	 * @generated
	 */
	public Adapter createRefBranchesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefBranches_45ignore <em>Ref Branches 45ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefBranches_45ignore
	 * @generated
	 */
	public Adapter createRefBranches_45ignoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefTags <em>Ref Tags</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefTags
	 * @generated
	 */
	public Adapter createRefTagsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefTags_45ignore <em>Ref Tags 45ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefTags_45ignore
	 * @generated
	 */
	public Adapter createRefTags_45ignoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefPaths <em>Ref Paths</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefPaths
	 * @generated
	 */
	public Adapter createRefPathsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefPaths_45ignore <em>Ref Paths 45ignore</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefPaths_45ignore
	 * @generated
	 */
	public Adapter createRefPaths_45ignoreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0 <em>Ref One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0
	 * @generated
	 */
	public Adapter createRefOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0 <em>Ref One Of0 All Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0Not <em>Ref One Of0 All Of0 Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0Not
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0NotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1 <em>Ref One Of0 All Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1Not <em>Ref One Of0 All Of1 Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1Not
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1NotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2 <em>Ref One Of0 All Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2Not <em>Ref One Of0 All Of2 Not</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2Not
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2NotAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf1 <em>Ref One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf1
	 * @generated
	 */
	public Adapter createRefOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Shell <em>Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Shell
	 * @generated
	 */
	public Adapter createShellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ShellAnyOf0 <em>Shell Any Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ShellAnyOf0
	 * @generated
	 */
	public Adapter createShellAnyOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ShellAnyOf1 <em>Shell Any Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ShellAnyOf1
	 * @generated
	 */
	public Adapter createShellAnyOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Types <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Types
	 * @generated
	 */
	public Adapter createTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Working_45directory <em>Working 45directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Working_45directory
	 * @generated
	 */
	public Adapter createWorking_45directoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeeds <em>Job Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeeds
	 * @generated
	 */
	public Adapter createJobNeedsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeedsOneOf0 <em>Job Needs One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeedsOneOf0
	 * @generated
	 */
	public Adapter createJobNeedsOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeedsOneOf0Items <em>Job Needs One Of0 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeedsOneOf0Items
	 * @generated
	 */
	public Adapter createJobNeedsOneOf0ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeedsOneOf1 <em>Job Needs One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeedsOneOf1
	 * @generated
	 */
	public Adapter createJobNeedsOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJob <em>Reusable Workflow Call Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJob
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobName <em>Reusable Workflow Call Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobName
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobNeeds <em>Reusable Workflow Call Job Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobNeeds
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobNeedsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobPermissions <em>Reusable Workflow Call Job Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobPermissions
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobPermissionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobIf <em>Reusable Workflow Call Job If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobIf
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobUses <em>Reusable Workflow Call Job Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobUses
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobUsesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobWith <em>Reusable Workflow Call Job With</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobWith
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobWithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobSecrets <em>Reusable Workflow Call Job Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobSecrets
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobSecretsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobSecretsOneOf0 <em>Reusable Workflow Call Job Secrets One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobSecretsOneOf0
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobSecretsOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobSecretsOneOf1 <em>Reusable Workflow Call Job Secrets One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobSecretsOneOf1
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobSecretsOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategy <em>Reusable Workflow Call Job Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategy
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrix <em>Reusable Workflow Call Job Strategy Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrix
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0 <em>Reusable Workflow Call Job Strategy Matrix One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf1 <em>Reusable Workflow Call Job Strategy Matrix One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf1
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixPatternProperties0 <em>Reusable Workflow Call Job Strategy Matrix Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixPatternProperties0
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixPatternProperties0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixPatternProperties0Items <em>Reusable Workflow Call Job Strategy Matrix Pattern Properties0 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixPatternProperties0Items
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties <em>Reusable Workflow Call Job Strategy Matrix Pattern Properties0 Items Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalProperties <em>Reusable Workflow Call Job Strategy Matrix Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalProperties
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0 <em>Reusable Workflow Call Job Strategy Matrix Additional Properties One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items <em>Reusable Workflow Call Job Strategy Matrix Additional Properties One Of0 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1 <em>Reusable Workflow Call Job Strategy Matrix Additional Properties One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyFail_45fast <em>Reusable Workflow Call Job Strategy Fail 45fast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyFail_45fast
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyFail_45fastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMax_45parallel <em>Reusable Workflow Call Job Strategy Max 45parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMax_45parallel
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMax_45parallelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobConcurrency <em>Reusable Workflow Call Job Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobConcurrency
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobConcurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobConcurrencyOneOf0 <em>Reusable Workflow Call Job Concurrency One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobConcurrencyOneOf0
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobConcurrencyOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobConcurrencyOneOf1 <em>Reusable Workflow Call Job Concurrency One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobConcurrencyOneOf1
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobConcurrencyOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJob <em>Normal Job</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJob
	 * @generated
	 */
	public Adapter createNormalJobAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobName <em>Normal Job Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobName
	 * @generated
	 */
	public Adapter createNormalJobNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobNeeds <em>Normal Job Needs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobNeeds
	 * @generated
	 */
	public Adapter createNormalJobNeedsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobPermissions <em>Normal Job Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobPermissions
	 * @generated
	 */
	public Adapter createNormalJobPermissionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45on <em>Normal Job Runs 45on</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45on
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf0 <em>Normal Job Runs 45on One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf0
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1 <em>Normal Job Runs 45on One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0 <em>Normal Job Runs 45on One Of1 Any Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf0
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0Items0 <em>Normal Job Runs 45on One Of1 Any Of0 Items0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf0Items0
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf0Items0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0AdditionalItems <em>Normal Job Runs 45on One Of1 Any Of0 Additional Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf0AdditionalItems
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf0AdditionalItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1 <em>Normal Job Runs 45on One Of1 Any Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1Items0 <em>Normal Job Runs 45on One Of1 Any Of1 Items0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1Items0
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1Items0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1Items1 <em>Normal Job Runs 45on One Of1 Any Of1 Items1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1Items1
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1Items1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1AdditionalItems <em>Normal Job Runs 45on One Of1 Any Of1 Additional Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1AdditionalItems
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1AdditionalItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2 <em>Normal Job Runs 45on One Of1 Any Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2Items0 <em>Normal Job Runs 45on One Of1 Any Of2 Items0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2Items0
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2Items0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2Items1 <em>Normal Job Runs 45on One Of1 Any Of2 Items1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2Items1
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2Items1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2AdditionalItems <em>Normal Job Runs 45on One Of1 Any Of2 Additional Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2AdditionalItems
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2AdditionalItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3 <em>Normal Job Runs 45on One Of1 Any Of3</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3Items0 <em>Normal Job Runs 45on One Of1 Any Of3 Items0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3Items0
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3Items0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3Items1 <em>Normal Job Runs 45on One Of1 Any Of3 Items1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3Items1
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3Items1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3Items2 <em>Normal Job Runs 45on One Of1 Any Of3 Items2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3Items2
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3Items2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3AdditionalItems <em>Normal Job Runs 45on One Of1 Any Of3 Additional Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3AdditionalItems
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3AdditionalItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4 <em>Normal Job Runs 45on One Of1 Any Of4</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4Items0 <em>Normal Job Runs 45on One Of1 Any Of4 Items0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4Items0
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4Items0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4Items1 <em>Normal Job Runs 45on One Of1 Any Of4 Items1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4Items1
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4Items1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4Items2 <em>Normal Job Runs 45on One Of1 Any Of4 Items2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4Items2
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4Items2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4AdditionalItems <em>Normal Job Runs 45on One Of1 Any Of4 Additional Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4AdditionalItems
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4AdditionalItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf2 <em>Normal Job Runs 45on One Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf2
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnvironment <em>Normal Job Environment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnvironment
	 * @generated
	 */
	public Adapter createNormalJobEnvironmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnvironmentOneOf0 <em>Normal Job Environment One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnvironmentOneOf0
	 * @generated
	 */
	public Adapter createNormalJobEnvironmentOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnvironmentOneOf1 <em>Normal Job Environment One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnvironmentOneOf1
	 * @generated
	 */
	public Adapter createNormalJobEnvironmentOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobOutputs <em>Normal Job Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobOutputs
	 * @generated
	 */
	public Adapter createNormalJobOutputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobOutputsAdditionalProperties <em>Normal Job Outputs Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobOutputsAdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobOutputsAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnv <em>Normal Job Env</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnv
	 * @generated
	 */
	public Adapter createNormalJobEnvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobDefaults <em>Normal Job Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobDefaults
	 * @generated
	 */
	public Adapter createNormalJobDefaultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobIf <em>Normal Job If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobIf
	 * @generated
	 */
	public Adapter createNormalJobIfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobSteps <em>Normal Job Steps</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobSteps
	 * @generated
	 */
	public Adapter createNormalJobStepsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItems <em>Normal Job Steps Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItems
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0 <em>Normal Job Steps Items All Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0OneOf0 <em>Normal Job Steps Items All Of0 One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0OneOf0
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0OneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0OneOf0Uses <em>Normal Job Steps Items All Of0 One Of0 Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0OneOf0Uses
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0OneOf0UsesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0OneOf1 <em>Normal Job Steps Items All Of0 One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0OneOf1
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0OneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0OneOf1Run <em>Normal Job Steps Items All Of0 One Of1 Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0OneOf1Run
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0OneOf1RunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1 <em>Normal Job Steps Items All Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Id <em>Normal Job Steps Items All Of1 Id</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Id
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1IdAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1If <em>Normal Job Steps Items All Of1 If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1If
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1IfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Name <em>Normal Job Steps Items All Of1 Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Name
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1NameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Uses <em>Normal Job Steps Items All Of1 Uses</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Uses
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1UsesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Run <em>Normal Job Steps Items All Of1 Run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Run
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1RunAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Working_45directory <em>Normal Job Steps Items All Of1 Working 45directory</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Working_45directory
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Working_45directoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Shell <em>Normal Job Steps Items All Of1 Shell</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Shell
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1ShellAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1With <em>Normal Job Steps Items All Of1 With</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1With
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1WithAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1WithArgs <em>Normal Job Steps Items All Of1 With Args</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1WithArgs
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1WithArgsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1WithEntrypoint <em>Normal Job Steps Items All Of1 With Entrypoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1WithEntrypoint
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1WithEntrypointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Env <em>Normal Job Steps Items All Of1 Env</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Env
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1EnvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45error <em>Normal Job Steps Items All Of1 Continue 45on 45error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Continue_45on_45error
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Continue_45on_45errorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0 <em>Normal Job Steps Items All Of1 Continue 45on 45error One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 <em>Normal Job Steps Items All Of1 Continue 45on 45error One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Timeout_45minutes <em>Normal Job Steps Items All Of1 Timeout 45minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Timeout_45minutes
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Timeout_45minutesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobTimeout_45minutes <em>Normal Job Timeout 45minutes</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobTimeout_45minutes
	 * @generated
	 */
	public Adapter createNormalJobTimeout_45minutesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategy <em>Normal Job Strategy</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategy
	 * @generated
	 */
	public Adapter createNormalJobStrategyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrix <em>Normal Job Strategy Matrix</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrix
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixOneOf0 <em>Normal Job Strategy Matrix One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixOneOf0
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixOneOf1 <em>Normal Job Strategy Matrix One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixOneOf1
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixPatternProperties0 <em>Normal Job Strategy Matrix Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixPatternProperties0
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixPatternProperties0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixPatternProperties0Items <em>Normal Job Strategy Matrix Pattern Properties0 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixPatternProperties0Items
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixPatternProperties0ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties <em>Normal Job Strategy Matrix Pattern Properties0 Items Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalProperties <em>Normal Job Strategy Matrix Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0 <em>Normal Job Strategy Matrix Additional Properties One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items <em>Normal Job Strategy Matrix Additional Properties One Of0 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesOneOf0ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf1 <em>Normal Job Strategy Matrix Additional Properties One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalPropertiesOneOf1
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyFail_45fast <em>Normal Job Strategy Fail 45fast</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyFail_45fast
	 * @generated
	 */
	public Adapter createNormalJobStrategyFail_45fastAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMax_45parallel <em>Normal Job Strategy Max 45parallel</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMax_45parallel
	 * @generated
	 */
	public Adapter createNormalJobStrategyMax_45parallelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContinue_45on_45error <em>Normal Job Continue 45on 45error</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContinue_45on_45error
	 * @generated
	 */
	public Adapter createNormalJobContinue_45on_45errorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContinue_45on_45errorOneOf0 <em>Normal Job Continue 45on 45error One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContinue_45on_45errorOneOf0
	 * @generated
	 */
	public Adapter createNormalJobContinue_45on_45errorOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContinue_45on_45errorOneOf1 <em>Normal Job Continue 45on 45error One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContinue_45on_45errorOneOf1
	 * @generated
	 */
	public Adapter createNormalJobContinue_45on_45errorOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContainer <em>Normal Job Container</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContainer
	 * @generated
	 */
	public Adapter createNormalJobContainerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContainerOneOf0 <em>Normal Job Container One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContainerOneOf0
	 * @generated
	 */
	public Adapter createNormalJobContainerOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContainerOneOf1 <em>Normal Job Container One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContainerOneOf1
	 * @generated
	 */
	public Adapter createNormalJobContainerOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobServices <em>Normal Job Services</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobServices
	 * @generated
	 */
	public Adapter createNormalJobServicesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobServicesAdditionalProperties <em>Normal Job Services Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobServicesAdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobServicesAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobConcurrency <em>Normal Job Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobConcurrency
	 * @generated
	 */
	public Adapter createNormalJobConcurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobConcurrencyOneOf0 <em>Normal Job Concurrency One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobConcurrencyOneOf0
	 * @generated
	 */
	public Adapter createNormalJobConcurrencyOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobConcurrencyOneOf1 <em>Normal Job Concurrency One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobConcurrencyOneOf1
	 * @generated
	 */
	public Adapter createNormalJobConcurrencyOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootName <em>Root Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootName
	 * @generated
	 */
	public Adapter createGithubwfRootNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOn <em>Root On</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOn
	 * @generated
	 */
	public Adapter createGithubwfRootOnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf0 <em>Root On One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf0
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf1 <em>Root On One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf1
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf1Items <em>Root On One Of1 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf1Items
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf1ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2 <em>Root On One Of2</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Branch_protection_rule <em>Root On One Of2 Branch protection rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Branch_protection_rule
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Branch_protection_ruleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Branch_protection_ruleTypes <em>Root On One Of2 Branch protection rule Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Branch_protection_ruleTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Branch_protection_ruleTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Branch_protection_ruleTypesItems <em>Root On One Of2 Branch protection rule Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Branch_protection_ruleTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Branch_protection_ruleTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Check_run <em>Root On One Of2 Check run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Check_run
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Check_runAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Check_runTypes <em>Root On One Of2 Check run Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Check_runTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Check_runTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Check_runTypesItems <em>Root On One Of2 Check run Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Check_runTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Check_runTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Check_suite <em>Root On One Of2 Check suite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Check_suite
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Check_suiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Check_suiteTypes <em>Root On One Of2 Check suite Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Check_suiteTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Check_suiteTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Check_suiteTypesItems <em>Root On One Of2 Check suite Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Check_suiteTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Check_suiteTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Create <em>Root On One Of2 Create</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Create
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2CreateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Delete <em>Root On One Of2 Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Delete
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2DeleteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Deployment <em>Root On One Of2 Deployment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Deployment
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2DeploymentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Deployment_status <em>Root On One Of2 Deployment status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Deployment_status
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Deployment_statusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Discussion <em>Root On One Of2 Discussion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Discussion
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2DiscussionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2DiscussionTypes <em>Root On One Of2 Discussion Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2DiscussionTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2DiscussionTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2DiscussionTypesItems <em>Root On One Of2 Discussion Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2DiscussionTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2DiscussionTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Discussion_comment <em>Root On One Of2 Discussion comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Discussion_comment
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Discussion_commentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Discussion_commentTypes <em>Root On One Of2 Discussion comment Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Discussion_commentTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Discussion_commentTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Discussion_commentTypesItems <em>Root On One Of2 Discussion comment Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Discussion_commentTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Discussion_commentTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Fork <em>Root On One Of2 Fork</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Fork
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ForkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Gollum <em>Root On One Of2 Gollum</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Gollum
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2GollumAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Issue_comment <em>Root On One Of2 Issue comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Issue_comment
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Issue_commentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Issue_commentTypes <em>Root On One Of2 Issue comment Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Issue_commentTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Issue_commentTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Issue_commentTypesItems <em>Root On One Of2 Issue comment Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Issue_commentTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Issue_commentTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Issues <em>Root On One Of2 Issues</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Issues
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2IssuesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2IssuesTypes <em>Root On One Of2 Issues Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2IssuesTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2IssuesTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2IssuesTypesItems <em>Root On One Of2 Issues Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2IssuesTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2IssuesTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Label <em>Root On One Of2 Label</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Label
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2LabelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2LabelTypes <em>Root On One Of2 Label Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2LabelTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2LabelTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2LabelTypesItems <em>Root On One Of2 Label Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2LabelTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2LabelTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Member <em>Root On One Of2 Member</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Member
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2MemberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2MemberTypes <em>Root On One Of2 Member Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2MemberTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2MemberTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2MemberTypesItems <em>Root On One Of2 Member Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2MemberTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2MemberTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Merge_group <em>Root On One Of2 Merge group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Merge_group
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Merge_groupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Merge_groupTypes <em>Root On One Of2 Merge group Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Merge_groupTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Merge_groupTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Merge_groupTypesItems <em>Root On One Of2 Merge group Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Merge_groupTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Merge_groupTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Milestone <em>Root On One Of2 Milestone</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Milestone
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2MilestoneAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2MilestoneTypes <em>Root On One Of2 Milestone Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2MilestoneTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2MilestoneTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2MilestoneTypesItems <em>Root On One Of2 Milestone Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2MilestoneTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2MilestoneTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Page_build <em>Root On One Of2 Page build</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Page_build
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Page_buildAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Project <em>Root On One Of2 Project</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Project
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ProjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ProjectTypes <em>Root On One Of2 Project Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ProjectTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ProjectTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ProjectTypesItems <em>Root On One Of2 Project Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ProjectTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ProjectTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Project_card <em>Root On One Of2 Project card</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Project_card
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Project_cardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Project_cardTypes <em>Root On One Of2 Project card Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Project_cardTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Project_cardTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Project_cardTypesItems <em>Root On One Of2 Project card Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Project_cardTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Project_cardTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Project_column <em>Root On One Of2 Project column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Project_column
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Project_columnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Project_columnTypes <em>Root On One Of2 Project column Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Project_columnTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Project_columnTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Project_columnTypesItems <em>Root On One Of2 Project column Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Project_columnTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Project_columnTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Public <em>Root On One Of2 Public</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Public
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2PublicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request <em>Root On One Of2 Pull request</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_requestAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_requestTypes <em>Root On One Of2 Pull request Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_requestTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_requestTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_requestTypesItems <em>Root On One Of2 Pull request Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_requestTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_requestTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_requestPatternProperties0 <em>Root On One Of2 Pull request Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_requestPatternProperties0
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_requestPatternProperties0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_review <em>Root On One Of2 Pull request review</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_review
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_reviewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_reviewTypes <em>Root On One Of2 Pull request review Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_reviewTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_reviewTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_reviewTypesItems <em>Root On One Of2 Pull request review Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_reviewTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_reviewTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_review_comment <em>Root On One Of2 Pull request review comment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_review_comment
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_review_commentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_review_commentTypes <em>Root On One Of2 Pull request review comment Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_review_commentTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_review_commentTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_review_commentTypesItems <em>Root On One Of2 Pull request review comment Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_review_commentTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_review_commentTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_target <em>Root On One Of2 Pull request target</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_target
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetTypes <em>Root On One Of2 Pull request target Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_targetTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetTypesItems <em>Root On One Of2 Pull request target Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_targetTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0 <em>Root On One Of2 Pull request target Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Push <em>Root On One Of2 Push</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Push
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2PushAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2PushPatternProperties0 <em>Root On One Of2 Push Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2PushPatternProperties0
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2PushPatternProperties0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2PushPatternProperties0Items <em>Root On One Of2 Push Pattern Properties0 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2PushPatternProperties0Items
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2PushPatternProperties0ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Registry_package <em>Root On One Of2 Registry package</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Registry_package
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Registry_packageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Registry_packageTypes <em>Root On One Of2 Registry package Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Registry_packageTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Registry_packageTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Registry_packageTypesItems <em>Root On One Of2 Registry package Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Registry_packageTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Registry_packageTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Release <em>Root On One Of2 Release</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Release
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ReleaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ReleaseTypes <em>Root On One Of2 Release Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ReleaseTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ReleaseTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ReleaseTypesItems <em>Root On One Of2 Release Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ReleaseTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ReleaseTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Status <em>Root On One Of2 Status</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Status
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2StatusAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Watch <em>Root On One Of2 Watch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Watch
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2WatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_call <em>Root On One Of2 Workflow call</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_call
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputs <em>Root On One Of2 Workflow call Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callInputs
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callInputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0 <em>Root On One Of2 Workflow call Inputs Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Description <em>Root On One Of2 Workflow call Inputs Pattern Properties0 Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Description
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage <em>Root On One Of2 Workflow call Inputs Pattern Properties0 Deprecation Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required <em>Root On One Of2 Workflow call Inputs Pattern Properties0 Required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0RequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type <em>Root On One Of2 Workflow call Inputs Pattern Properties0 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default <em>Root On One Of2 Workflow call Inputs Pattern Properties0 Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecrets <em>Root On One Of2 Workflow call Secrets</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecrets
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0 <em>Root On One Of2 Workflow call Secrets Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Description <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Description
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0DescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatch <em>Root On One Of2 Workflow dispatch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatch
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputs <em>Root On One Of2 Workflow dispatch Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputs
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0 <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Description <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Description</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Description
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DescriptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessage <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Deprecation Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessage
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Required <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Required
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0RequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0TypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Options</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItems <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Options Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0 <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 If Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Then</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Then Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Else</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Else Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1 <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 If</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 If Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Then</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_run <em>Root On One Of2 Workflow run</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_run
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runTypes <em>Root On One Of2 Workflow run Types</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runTypes
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runTypesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runTypesItems <em>Root On One Of2 Workflow run Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runTypesItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runWorkflows <em>Root On One Of2 Workflow run Workflows</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runWorkflows
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runWorkflowsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runWorkflowsItems <em>Root On One Of2 Workflow run Workflows Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runWorkflowsItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runWorkflowsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0 <em>Root On One Of2 Workflow run Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runPatternProperties0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Repository_dispatch <em>Root On One Of2 Repository dispatch</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Repository_dispatch
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Repository_dispatchAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Schedule <em>Root On One Of2 Schedule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Schedule
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ScheduleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ScheduleItems <em>Root On One Of2 Schedule Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ScheduleItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ScheduleItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsCron <em>Root On One Of2 Schedule Items Cron</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ScheduleItemsCron
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ScheduleItemsCronAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootEnv <em>Root Env</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootEnv
	 * @generated
	 */
	public Adapter createGithubwfRootEnvAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootDefaults <em>Root Defaults</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootDefaults
	 * @generated
	 */
	public Adapter createGithubwfRootDefaultsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootConcurrency <em>Root Concurrency</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootConcurrency
	 * @generated
	 */
	public Adapter createGithubwfRootConcurrencyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootConcurrencyOneOf0 <em>Root Concurrency One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootConcurrencyOneOf0
	 * @generated
	 */
	public Adapter createGithubwfRootConcurrencyOneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootConcurrencyOneOf1 <em>Root Concurrency One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootConcurrencyOneOf1
	 * @generated
	 */
	public Adapter createGithubwfRootConcurrencyOneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobs <em>Root Jobs</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobs
	 * @generated
	 */
	public Adapter createGithubwfRootJobsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPatternProperties0 <em>Root Jobs Pattern Properties0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPatternProperties0
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPatternProperties0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPatternProperties0OneOf0 <em>Root Jobs Pattern Properties0 One Of0</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPatternProperties0OneOf0
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPatternProperties0OneOf0Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPatternProperties0OneOf1 <em>Root Jobs Pattern Properties0 One Of1</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPatternProperties0OneOf1
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPatternProperties0OneOf1Adapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootRun_45name <em>Root Run 45name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootRun_45name
	 * @generated
	 */
	public Adapter createGithubwfRootRun_45nameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootPermissions <em>Root Permissions</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootPermissions
	 * @generated
	 */
	public Adapter createGithubwfRootPermissionsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0Tuple <em>Normal Job Runs 45on One Of1 Any Of0 Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf0Tuple
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf0TupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1Tuple <em>Normal Job Runs 45on One Of1 Any Of1 Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1Tuple
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1TupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2Tuple <em>Normal Job Runs 45on One Of1 Any Of2 Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2Tuple
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2TupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3Tuple <em>Normal Job Runs 45on One Of1 Any Of3 Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3Tuple
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3TupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4Tuple <em>Normal Job Runs 45on One Of1 Any Of4 Tuple</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4Tuple
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4TupleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectPropertiesAbstract <em>Event Object Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectPropertiesAbstract
	 * @generated
	 */
	public Adapter createEventObjectPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootPropertiesAbstract <em>Root Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyPropertiesAbstract <em>Concurrency Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyPropertiesAbstract
	 * @generated
	 */
	public Adapter createConcurrencyPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyCancel_45in_45progressAbstract <em>Concurrency Cancel 45in 45progress Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyCancel_45in_45progressAbstract
	 * @generated
	 */
	public Adapter createConcurrencyCancel_45in_45progressAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyCancel_45in_45progressTypeString <em>Concurrency Cancel 45in 45progress Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyCancel_45in_45progressTypeString
	 * @generated
	 */
	public Adapter createConcurrencyCancel_45in_45progressTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyCancel_45in_45progressTypeInteger <em>Concurrency Cancel 45in 45progress Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyCancel_45in_45progressTypeInteger
	 * @generated
	 */
	public Adapter createConcurrencyCancel_45in_45progressTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyCancel_45in_45progressTypeNumber <em>Concurrency Cancel 45in 45progress Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyCancel_45in_45progressTypeNumber
	 * @generated
	 */
	public Adapter createConcurrencyCancel_45in_45progressTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyCancel_45in_45progressTypeBoolean <em>Concurrency Cancel 45in 45progress Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyCancel_45in_45progressTypeBoolean
	 * @generated
	 */
	public Adapter createConcurrencyCancel_45in_45progressTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyCancel_45in_45progressTypeObject <em>Concurrency Cancel 45in 45progress Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyCancel_45in_45progressTypeObject
	 * @generated
	 */
	public Adapter createConcurrencyCancel_45in_45progressTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyCancel_45in_45progressPropertiesAbstract <em>Concurrency Cancel 45in 45progress Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyCancel_45in_45progressPropertiesAbstract
	 * @generated
	 */
	public Adapter createConcurrencyCancel_45in_45progressPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyCancel_45in_45progressAdditionalProperties <em>Concurrency Cancel 45in 45progress Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyCancel_45in_45progressAdditionalProperties
	 * @generated
	 */
	public Adapter createConcurrencyCancel_45in_45progressAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyCancel_45in_45progressTypeArray <em>Concurrency Cancel 45in 45progress Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyCancel_45in_45progressTypeArray
	 * @generated
	 */
	public Adapter createConcurrencyCancel_45in_45progressTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyCancel_45in_45progressItems <em>Concurrency Cancel 45in 45progress Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyCancel_45in_45progressItems
	 * @generated
	 */
	public Adapter createConcurrencyCancel_45in_45progressItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConcurrencyCancel_45in_45progressTypeNull <em>Concurrency Cancel 45in 45progress Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConcurrencyCancel_45in_45progressTypeNull
	 * @generated
	 */
	public Adapter createConcurrencyCancel_45in_45progressTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationAbstract <em>Configuration Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationAbstract
	 * @generated
	 */
	public Adapter createConfigurationAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationTypeString <em>Configuration Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationTypeString
	 * @generated
	 */
	public Adapter createConfigurationTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationTypeInteger <em>Configuration Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationTypeInteger
	 * @generated
	 */
	public Adapter createConfigurationTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationTypeNumber <em>Configuration Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationTypeNumber
	 * @generated
	 */
	public Adapter createConfigurationTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationTypeBoolean <em>Configuration Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationTypeBoolean
	 * @generated
	 */
	public Adapter createConfigurationTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationTypeObject <em>Configuration Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationTypeObject
	 * @generated
	 */
	public Adapter createConfigurationTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationPropertiesAbstract <em>Configuration Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationPropertiesAbstract
	 * @generated
	 */
	public Adapter createConfigurationPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationAdditionalProperties <em>Configuration Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationAdditionalProperties
	 * @generated
	 */
	public Adapter createConfigurationAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationTypeArray <em>Configuration Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationTypeArray
	 * @generated
	 */
	public Adapter createConfigurationTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationItems <em>Configuration Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationItems
	 * @generated
	 */
	public Adapter createConfigurationItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationTypeNull <em>Configuration Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationTypeNull
	 * @generated
	 */
	public Adapter createConfigurationTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ConfigurationOneOf3PropertiesAbstract <em>Configuration One Of3 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ConfigurationOneOf3PropertiesAbstract
	 * @generated
	 */
	public Adapter createConfigurationOneOf3PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPropertiesAbstract <em>Container Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPropertiesAbstract
	 * @generated
	 */
	public Adapter createContainerPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerCredentialsPropertiesAbstract <em>Container Credentials Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerCredentialsPropertiesAbstract
	 * @generated
	 */
	public Adapter createContainerCredentialsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerCredentialsAdditionalProperties <em>Container Credentials Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerCredentialsAdditionalProperties
	 * @generated
	 */
	public Adapter createContainerCredentialsAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPortsItemsAbstract <em>Container Ports Items Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPortsItemsAbstract
	 * @generated
	 */
	public Adapter createContainerPortsItemsAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPortsItemsTypeString <em>Container Ports Items Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPortsItemsTypeString
	 * @generated
	 */
	public Adapter createContainerPortsItemsTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPortsItemsTypeInteger <em>Container Ports Items Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPortsItemsTypeInteger
	 * @generated
	 */
	public Adapter createContainerPortsItemsTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPortsItemsTypeNumber <em>Container Ports Items Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPortsItemsTypeNumber
	 * @generated
	 */
	public Adapter createContainerPortsItemsTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPortsItemsTypeBoolean <em>Container Ports Items Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPortsItemsTypeBoolean
	 * @generated
	 */
	public Adapter createContainerPortsItemsTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPortsItemsTypeObject <em>Container Ports Items Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPortsItemsTypeObject
	 * @generated
	 */
	public Adapter createContainerPortsItemsTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPortsItemsPropertiesAbstract <em>Container Ports Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPortsItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createContainerPortsItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPortsItemsAdditionalProperties <em>Container Ports Items Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPortsItemsAdditionalProperties
	 * @generated
	 */
	public Adapter createContainerPortsItemsAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPortsItemsTypeArray <em>Container Ports Items Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPortsItemsTypeArray
	 * @generated
	 */
	public Adapter createContainerPortsItemsTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPortsItemsItems <em>Container Ports Items Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPortsItemsItems
	 * @generated
	 */
	public Adapter createContainerPortsItemsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ContainerPortsItemsTypeNull <em>Container Ports Items Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ContainerPortsItemsTypeNull
	 * @generated
	 */
	public Adapter createContainerPortsItemsTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.DefaultsPropertiesAbstract <em>Defaults Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.DefaultsPropertiesAbstract
	 * @generated
	 */
	public Adapter createDefaultsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.DefaultsRunPropertiesAbstract <em>Defaults Run Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.DefaultsRunPropertiesAbstract
	 * @generated
	 */
	public Adapter createDefaultsRunPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.PermissionsAbstract <em>Permissions Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.PermissionsAbstract
	 * @generated
	 */
	public Adapter createPermissionsAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.PermissionsTypeString <em>Permissions Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.PermissionsTypeString
	 * @generated
	 */
	public Adapter createPermissionsTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.PermissionsTypeInteger <em>Permissions Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.PermissionsTypeInteger
	 * @generated
	 */
	public Adapter createPermissionsTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.PermissionsTypeNumber <em>Permissions Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.PermissionsTypeNumber
	 * @generated
	 */
	public Adapter createPermissionsTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.PermissionsTypeBoolean <em>Permissions Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.PermissionsTypeBoolean
	 * @generated
	 */
	public Adapter createPermissionsTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.PermissionsTypeObject <em>Permissions Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.PermissionsTypeObject
	 * @generated
	 */
	public Adapter createPermissionsTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.PermissionsPropertiesAbstract <em>Permissions Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.PermissionsPropertiesAbstract
	 * @generated
	 */
	public Adapter createPermissionsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.PermissionsAdditionalProperties <em>Permissions Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.PermissionsAdditionalProperties
	 * @generated
	 */
	public Adapter createPermissionsAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.PermissionsTypeArray <em>Permissions Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.PermissionsTypeArray
	 * @generated
	 */
	public Adapter createPermissionsTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.PermissionsItems <em>Permissions Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.PermissionsItems
	 * @generated
	 */
	public Adapter createPermissionsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.PermissionsTypeNull <em>Permissions Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.PermissionsTypeNull
	 * @generated
	 */
	public Adapter createPermissionsTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.Permissions_45eventPropertiesAbstract <em>Permissions 45event Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.Permissions_45eventPropertiesAbstract
	 * @generated
	 */
	public Adapter createPermissions_45eventPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvAbstract <em>Env Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvAbstract
	 * @generated
	 */
	public Adapter createEnvAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvTypeString <em>Env Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvTypeString
	 * @generated
	 */
	public Adapter createEnvTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvTypeInteger <em>Env Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvTypeInteger
	 * @generated
	 */
	public Adapter createEnvTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvTypeNumber <em>Env Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvTypeNumber
	 * @generated
	 */
	public Adapter createEnvTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvTypeBoolean <em>Env Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvTypeBoolean
	 * @generated
	 */
	public Adapter createEnvTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvTypeObject <em>Env Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvTypeObject
	 * @generated
	 */
	public Adapter createEnvTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvPropertiesAbstract <em>Env Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvPropertiesAbstract
	 * @generated
	 */
	public Adapter createEnvPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvAdditionalProperties <em>Env Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvAdditionalProperties
	 * @generated
	 */
	public Adapter createEnvAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvTypeArray <em>Env Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvTypeArray
	 * @generated
	 */
	public Adapter createEnvTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvItems <em>Env Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvItems
	 * @generated
	 */
	public Adapter createEnvItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvTypeNull <em>Env Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvTypeNull
	 * @generated
	 */
	public Adapter createEnvTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0PropertiesAbstract <em>Env One Of0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0PropertiesAbstract
	 * @generated
	 */
	public Adapter createEnvOneOf0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalPropertiesAbstract <em>Env One Of0 Additional Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalPropertiesAbstract
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalPropertiesTypeString <em>Env One Of0 Additional Properties Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalPropertiesTypeString
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalPropertiesTypeInteger <em>Env One Of0 Additional Properties Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalPropertiesTypeInteger
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalPropertiesTypeNumber <em>Env One Of0 Additional Properties Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalPropertiesTypeNumber
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalPropertiesTypeBoolean <em>Env One Of0 Additional Properties Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalPropertiesTypeBoolean
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalPropertiesTypeObject <em>Env One Of0 Additional Properties Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalPropertiesTypeObject
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalPropertiesPropertiesAbstract <em>Env One Of0 Additional Properties Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalPropertiesPropertiesAbstract
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalPropertiesAdditionalProperties <em>Env One Of0 Additional Properties Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalPropertiesAdditionalProperties
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalPropertiesTypeArray <em>Env One Of0 Additional Properties Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalPropertiesTypeArray
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalPropertiesItems <em>Env One Of0 Additional Properties Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalPropertiesItems
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvOneOf0AdditionalPropertiesTypeNull <em>Env One Of0 Additional Properties Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvOneOf0AdditionalPropertiesTypeNull
	 * @generated
	 */
	public Adapter createEnvOneOf0AdditionalPropertiesTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EnvironmentPropertiesAbstract <em>Environment Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EnvironmentPropertiesAbstract
	 * @generated
	 */
	public Adapter createEnvironmentPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectAbstract <em>Event Object Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectAbstract
	 * @generated
	 */
	public Adapter createEventObjectAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectTypeString <em>Event Object Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectTypeString
	 * @generated
	 */
	public Adapter createEventObjectTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectTypeInteger <em>Event Object Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectTypeInteger
	 * @generated
	 */
	public Adapter createEventObjectTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectTypeNumber <em>Event Object Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectTypeNumber
	 * @generated
	 */
	public Adapter createEventObjectTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectTypeBoolean <em>Event Object Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectTypeBoolean
	 * @generated
	 */
	public Adapter createEventObjectTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectTypeObject <em>Event Object Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectTypeObject
	 * @generated
	 */
	public Adapter createEventObjectTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectTypeArray <em>Event Object Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectTypeArray
	 * @generated
	 */
	public Adapter createEventObjectTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectItems <em>Event Object Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectItems
	 * @generated
	 */
	public Adapter createEventObjectItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectTypeNull <em>Event Object Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectTypeNull
	 * @generated
	 */
	public Adapter createEventObjectTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectOneOf0PropertiesAbstract <em>Event Object One Of0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectOneOf0PropertiesAbstract
	 * @generated
	 */
	public Adapter createEventObjectOneOf0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.EventObjectOneOf0AdditionalProperties <em>Event Object One Of0 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.EventObjectOneOf0AdditionalProperties
	 * @generated
	 */
	public Adapter createEventObjectOneOf0AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefAbstract <em>Ref Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefAbstract
	 * @generated
	 */
	public Adapter createRefAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefTypeString <em>Ref Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefTypeString
	 * @generated
	 */
	public Adapter createRefTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefTypeInteger <em>Ref Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefTypeInteger
	 * @generated
	 */
	public Adapter createRefTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefTypeNumber <em>Ref Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefTypeNumber
	 * @generated
	 */
	public Adapter createRefTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefTypeBoolean <em>Ref Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefTypeBoolean
	 * @generated
	 */
	public Adapter createRefTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefTypeObject <em>Ref Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefTypeObject
	 * @generated
	 */
	public Adapter createRefTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefPropertiesAbstract <em>Ref Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefPropertiesAbstract
	 * @generated
	 */
	public Adapter createRefPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefAdditionalProperties <em>Ref Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefAdditionalProperties
	 * @generated
	 */
	public Adapter createRefAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefTypeArray <em>Ref Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefTypeArray
	 * @generated
	 */
	public Adapter createRefTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefItems <em>Ref Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefItems
	 * @generated
	 */
	public Adapter createRefItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefTypeNull <em>Ref Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefTypeNull
	 * @generated
	 */
	public Adapter createRefTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0PropertiesAbstract <em>Ref One Of0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0PropertiesAbstract
	 * @generated
	 */
	public Adapter createRefOneOf0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AdditionalProperties <em>Ref One Of0 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AdditionalProperties
	 * @generated
	 */
	public Adapter createRefOneOf0AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0Abstract <em>Ref One Of0 All Of0 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0Abstract
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0TypeString <em>Ref One Of0 All Of0 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0TypeString
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0TypeInteger <em>Ref One Of0 All Of0 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0TypeInteger
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0TypeNumber <em>Ref One Of0 All Of0 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0TypeNumber
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0TypeBoolean <em>Ref One Of0 All Of0 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0TypeBoolean
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0TypeObject <em>Ref One Of0 All Of0 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0TypeObject
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0PropertiesAbstract <em>Ref One Of0 All Of0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0PropertiesAbstract
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0AdditionalProperties <em>Ref One Of0 All Of0 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0AdditionalProperties
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0TypeArray <em>Ref One Of0 All Of0 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0TypeArray
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0Items <em>Ref One Of0 All Of0 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0Items
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0TypeNull <em>Ref One Of0 All Of0 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0TypeNull
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0NotAbstract <em>Ref One Of0 All Of0 Not Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0NotAbstract
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0NotAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0NotTypeString <em>Ref One Of0 All Of0 Not Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0NotTypeString
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0NotTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0NotTypeInteger <em>Ref One Of0 All Of0 Not Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0NotTypeInteger
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0NotTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0NotTypeNumber <em>Ref One Of0 All Of0 Not Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0NotTypeNumber
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0NotTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0NotTypeBoolean <em>Ref One Of0 All Of0 Not Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0NotTypeBoolean
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0NotTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0NotTypeObject <em>Ref One Of0 All Of0 Not Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0NotTypeObject
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0NotTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0NotPropertiesAbstract <em>Ref One Of0 All Of0 Not Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0NotPropertiesAbstract
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0NotPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0NotAdditionalProperties <em>Ref One Of0 All Of0 Not Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0NotAdditionalProperties
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0NotAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0NotTypeArray <em>Ref One Of0 All Of0 Not Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0NotTypeArray
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0NotTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0NotItems <em>Ref One Of0 All Of0 Not Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0NotItems
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0NotItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf0NotTypeNull <em>Ref One Of0 All Of0 Not Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf0NotTypeNull
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf0NotTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1Abstract <em>Ref One Of0 All Of1 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1Abstract
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1TypeString <em>Ref One Of0 All Of1 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1TypeString
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1TypeInteger <em>Ref One Of0 All Of1 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1TypeInteger
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1TypeNumber <em>Ref One Of0 All Of1 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1TypeNumber
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1TypeBoolean <em>Ref One Of0 All Of1 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1TypeBoolean
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1TypeObject <em>Ref One Of0 All Of1 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1TypeObject
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1PropertiesAbstract <em>Ref One Of0 All Of1 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1PropertiesAbstract
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1AdditionalProperties <em>Ref One Of0 All Of1 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1AdditionalProperties
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1TypeArray <em>Ref One Of0 All Of1 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1TypeArray
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1Items <em>Ref One Of0 All Of1 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1Items
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1TypeNull <em>Ref One Of0 All Of1 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1TypeNull
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1NotAbstract <em>Ref One Of0 All Of1 Not Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1NotAbstract
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1NotAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1NotTypeString <em>Ref One Of0 All Of1 Not Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1NotTypeString
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1NotTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1NotTypeInteger <em>Ref One Of0 All Of1 Not Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1NotTypeInteger
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1NotTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1NotTypeNumber <em>Ref One Of0 All Of1 Not Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1NotTypeNumber
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1NotTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1NotTypeBoolean <em>Ref One Of0 All Of1 Not Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1NotTypeBoolean
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1NotTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1NotTypeObject <em>Ref One Of0 All Of1 Not Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1NotTypeObject
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1NotTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1NotPropertiesAbstract <em>Ref One Of0 All Of1 Not Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1NotPropertiesAbstract
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1NotPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1NotAdditionalProperties <em>Ref One Of0 All Of1 Not Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1NotAdditionalProperties
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1NotAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1NotTypeArray <em>Ref One Of0 All Of1 Not Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1NotTypeArray
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1NotTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1NotItems <em>Ref One Of0 All Of1 Not Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1NotItems
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1NotItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf1NotTypeNull <em>Ref One Of0 All Of1 Not Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf1NotTypeNull
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf1NotTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2Abstract <em>Ref One Of0 All Of2 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2Abstract
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2TypeString <em>Ref One Of0 All Of2 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2TypeString
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2TypeInteger <em>Ref One Of0 All Of2 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2TypeInteger
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2TypeNumber <em>Ref One Of0 All Of2 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2TypeNumber
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2TypeBoolean <em>Ref One Of0 All Of2 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2TypeBoolean
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2TypeObject <em>Ref One Of0 All Of2 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2TypeObject
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2PropertiesAbstract <em>Ref One Of0 All Of2 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2PropertiesAbstract
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2AdditionalProperties <em>Ref One Of0 All Of2 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2AdditionalProperties
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2TypeArray <em>Ref One Of0 All Of2 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2TypeArray
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2Items <em>Ref One Of0 All Of2 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2Items
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2TypeNull <em>Ref One Of0 All Of2 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2TypeNull
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2NotAbstract <em>Ref One Of0 All Of2 Not Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2NotAbstract
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2NotAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2NotTypeString <em>Ref One Of0 All Of2 Not Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2NotTypeString
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2NotTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2NotTypeInteger <em>Ref One Of0 All Of2 Not Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2NotTypeInteger
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2NotTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2NotTypeNumber <em>Ref One Of0 All Of2 Not Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2NotTypeNumber
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2NotTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2NotTypeBoolean <em>Ref One Of0 All Of2 Not Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2NotTypeBoolean
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2NotTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2NotTypeObject <em>Ref One Of0 All Of2 Not Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2NotTypeObject
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2NotTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2NotPropertiesAbstract <em>Ref One Of0 All Of2 Not Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2NotPropertiesAbstract
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2NotPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2NotAdditionalProperties <em>Ref One Of0 All Of2 Not Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2NotAdditionalProperties
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2NotAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2NotTypeArray <em>Ref One Of0 All Of2 Not Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2NotTypeArray
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2NotTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2NotItems <em>Ref One Of0 All Of2 Not Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2NotItems
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2NotItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.RefOneOf0AllOf2NotTypeNull <em>Ref One Of0 All Of2 Not Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.RefOneOf0AllOf2NotTypeNull
	 * @generated
	 */
	public Adapter createRefOneOf0AllOf2NotTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ShellAbstract <em>Shell Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ShellAbstract
	 * @generated
	 */
	public Adapter createShellAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ShellTypeString <em>Shell Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ShellTypeString
	 * @generated
	 */
	public Adapter createShellTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ShellTypeInteger <em>Shell Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ShellTypeInteger
	 * @generated
	 */
	public Adapter createShellTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ShellTypeNumber <em>Shell Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ShellTypeNumber
	 * @generated
	 */
	public Adapter createShellTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ShellTypeBoolean <em>Shell Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ShellTypeBoolean
	 * @generated
	 */
	public Adapter createShellTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ShellTypeObject <em>Shell Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ShellTypeObject
	 * @generated
	 */
	public Adapter createShellTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ShellPropertiesAbstract <em>Shell Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ShellPropertiesAbstract
	 * @generated
	 */
	public Adapter createShellPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ShellAdditionalProperties <em>Shell Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ShellAdditionalProperties
	 * @generated
	 */
	public Adapter createShellAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ShellTypeArray <em>Shell Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ShellTypeArray
	 * @generated
	 */
	public Adapter createShellTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ShellItems <em>Shell Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ShellItems
	 * @generated
	 */
	public Adapter createShellItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ShellTypeNull <em>Shell Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ShellTypeNull
	 * @generated
	 */
	public Adapter createShellTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.TypesItems <em>Types Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.TypesItems
	 * @generated
	 */
	public Adapter createTypesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeedsAbstract <em>Job Needs Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeedsAbstract
	 * @generated
	 */
	public Adapter createJobNeedsAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeedsTypeString <em>Job Needs Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeedsTypeString
	 * @generated
	 */
	public Adapter createJobNeedsTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeedsTypeInteger <em>Job Needs Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeedsTypeInteger
	 * @generated
	 */
	public Adapter createJobNeedsTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeedsTypeNumber <em>Job Needs Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeedsTypeNumber
	 * @generated
	 */
	public Adapter createJobNeedsTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeedsTypeBoolean <em>Job Needs Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeedsTypeBoolean
	 * @generated
	 */
	public Adapter createJobNeedsTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeedsTypeObject <em>Job Needs Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeedsTypeObject
	 * @generated
	 */
	public Adapter createJobNeedsTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeedsPropertiesAbstract <em>Job Needs Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeedsPropertiesAbstract
	 * @generated
	 */
	public Adapter createJobNeedsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeedsAdditionalProperties <em>Job Needs Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeedsAdditionalProperties
	 * @generated
	 */
	public Adapter createJobNeedsAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeedsTypeArray <em>Job Needs Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeedsTypeArray
	 * @generated
	 */
	public Adapter createJobNeedsTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeedsItems <em>Job Needs Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeedsItems
	 * @generated
	 */
	public Adapter createJobNeedsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.JobNeedsTypeNull <em>Job Needs Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.JobNeedsTypeNull
	 * @generated
	 */
	public Adapter createJobNeedsTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobPropertiesAbstract <em>Reusable Workflow Call Job Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobPropertiesAbstract
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobIfAbstract <em>Reusable Workflow Call Job If Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobIfAbstract
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobIfAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobIfTypeBoolean <em>Reusable Workflow Call Job If Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobIfTypeBoolean
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobIfTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobIfTypeNumber <em>Reusable Workflow Call Job If Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobIfTypeNumber
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobIfTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobIfTypeString <em>Reusable Workflow Call Job If Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobIfTypeString
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobIfTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobSecretsAbstract <em>Reusable Workflow Call Job Secrets Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobSecretsAbstract
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobSecretsAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobSecretsTypeString <em>Reusable Workflow Call Job Secrets Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobSecretsTypeString
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobSecretsTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobSecretsTypeInteger <em>Reusable Workflow Call Job Secrets Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobSecretsTypeInteger
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobSecretsTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobSecretsTypeNumber <em>Reusable Workflow Call Job Secrets Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobSecretsTypeNumber
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobSecretsTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobSecretsTypeBoolean <em>Reusable Workflow Call Job Secrets Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobSecretsTypeBoolean
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobSecretsTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobSecretsTypeObject <em>Reusable Workflow Call Job Secrets Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobSecretsTypeObject
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobSecretsTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobSecretsPropertiesAbstract <em>Reusable Workflow Call Job Secrets Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobSecretsPropertiesAbstract
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobSecretsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobSecretsAdditionalProperties <em>Reusable Workflow Call Job Secrets Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobSecretsAdditionalProperties
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobSecretsAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobSecretsTypeArray <em>Reusable Workflow Call Job Secrets Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobSecretsTypeArray
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobSecretsTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobSecretsItems <em>Reusable Workflow Call Job Secrets Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobSecretsItems
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobSecretsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobSecretsTypeNull <em>Reusable Workflow Call Job Secrets Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobSecretsTypeNull
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobSecretsTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyPropertiesAbstract <em>Reusable Workflow Call Job Strategy Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyPropertiesAbstract
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAbstract <em>Reusable Workflow Call Job Strategy Matrix Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAbstract
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeString <em>Reusable Workflow Call Job Strategy Matrix Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixTypeString
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeInteger <em>Reusable Workflow Call Job Strategy Matrix Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixTypeInteger
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeNumber <em>Reusable Workflow Call Job Strategy Matrix Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixTypeNumber
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeBoolean <em>Reusable Workflow Call Job Strategy Matrix Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixTypeBoolean
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeObject <em>Reusable Workflow Call Job Strategy Matrix Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixTypeObject
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixPropertiesAbstract <em>Reusable Workflow Call Job Strategy Matrix Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixPropertiesAbstract
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeArray <em>Reusable Workflow Call Job Strategy Matrix Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixTypeArray
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixItems <em>Reusable Workflow Call Job Strategy Matrix Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixItems
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixTypeNull <em>Reusable Workflow Call Job Strategy Matrix Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixTypeNull
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract <em>Reusable Workflow Call Job Strategy Matrix One Of0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties <em>Reusable Workflow Call Job Strategy Matrix One Of0 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract <em>Reusable Workflow Call Job Strategy Matrix Pattern Properties0 Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract <em>Reusable Workflow Call Job Strategy Matrix Additional Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString <em>Reusable Workflow Call Job Strategy Matrix Additional Properties Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger <em>Reusable Workflow Call Job Strategy Matrix Additional Properties Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber <em>Reusable Workflow Call Job Strategy Matrix Additional Properties Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean <em>Reusable Workflow Call Job Strategy Matrix Additional Properties Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject <em>Reusable Workflow Call Job Strategy Matrix Additional Properties Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract <em>Reusable Workflow Call Job Strategy Matrix Additional Properties Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties <em>Reusable Workflow Call Job Strategy Matrix Additional Properties Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray <em>Reusable Workflow Call Job Strategy Matrix Additional Properties Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems <em>Reusable Workflow Call Job Strategy Matrix Additional Properties Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull <em>Reusable Workflow Call Job Strategy Matrix Additional Properties Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobConcurrencyAbstract <em>Reusable Workflow Call Job Concurrency Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobConcurrencyAbstract
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobConcurrencyAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobConcurrencyTypeString <em>Reusable Workflow Call Job Concurrency Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobConcurrencyTypeString
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobConcurrencyTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobConcurrencyTypeInteger <em>Reusable Workflow Call Job Concurrency Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobConcurrencyTypeInteger
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobConcurrencyTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobConcurrencyTypeNumber <em>Reusable Workflow Call Job Concurrency Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobConcurrencyTypeNumber
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobConcurrencyTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobConcurrencyTypeBoolean <em>Reusable Workflow Call Job Concurrency Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobConcurrencyTypeBoolean
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobConcurrencyTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobConcurrencyTypeObject <em>Reusable Workflow Call Job Concurrency Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobConcurrencyTypeObject
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobConcurrencyTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobConcurrencyPropertiesAbstract <em>Reusable Workflow Call Job Concurrency Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobConcurrencyPropertiesAbstract
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobConcurrencyPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobConcurrencyAdditionalProperties <em>Reusable Workflow Call Job Concurrency Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobConcurrencyAdditionalProperties
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobConcurrencyAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobConcurrencyTypeArray <em>Reusable Workflow Call Job Concurrency Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobConcurrencyTypeArray
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobConcurrencyTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobConcurrencyItems <em>Reusable Workflow Call Job Concurrency Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobConcurrencyItems
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobConcurrencyItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.ReusableWorkflowCallJobConcurrencyTypeNull <em>Reusable Workflow Call Job Concurrency Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.ReusableWorkflowCallJobConcurrencyTypeNull
	 * @generated
	 */
	public Adapter createReusableWorkflowCallJobConcurrencyTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobPropertiesAbstract <em>Normal Job Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onAbstract <em>Normal Job Runs 45on Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onAbstract
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onTypeString <em>Normal Job Runs 45on Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onTypeString
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onTypeInteger <em>Normal Job Runs 45on Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onTypeInteger
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onTypeNumber <em>Normal Job Runs 45on Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onTypeNumber
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onTypeBoolean <em>Normal Job Runs 45on Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onTypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onTypeObject <em>Normal Job Runs 45on Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onTypeObject
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onPropertiesAbstract <em>Normal Job Runs 45on Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onAdditionalProperties <em>Normal Job Runs 45on Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onAdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onTypeArray <em>Normal Job Runs 45on Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onTypeArray
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onItems <em>Normal Job Runs 45on Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onItems
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onTypeNull <em>Normal Job Runs 45on Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onTypeNull
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1Items <em>Normal Job Runs 45on One Of1 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1Items
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0Abstract <em>Normal Job Runs 45on One Of1 Any Of0 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf0Abstract
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf0AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeString <em>Normal Job Runs 45on One Of1 Any Of0 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeString
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf0TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeInteger <em>Normal Job Runs 45on One Of1 Any Of0 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeInteger
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf0TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeNumber <em>Normal Job Runs 45on One Of1 Any Of0 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeNumber
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf0TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeBoolean <em>Normal Job Runs 45on One Of1 Any Of0 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf0TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeObject <em>Normal Job Runs 45on One Of1 Any Of0 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeObject
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf0TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0PropertiesAbstract <em>Normal Job Runs 45on One Of1 Any Of0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf0PropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties <em>Normal Job Runs 45on One Of1 Any Of0 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf0AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeArray <em>Normal Job Runs 45on One Of1 Any Of0 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeArray
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf0TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeNull <em>Normal Job Runs 45on One Of1 Any Of0 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf0TypeNull
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf0TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1Abstract <em>Normal Job Runs 45on One Of1 Any Of1 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1Abstract
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeString <em>Normal Job Runs 45on One Of1 Any Of1 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeString
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeInteger <em>Normal Job Runs 45on One Of1 Any Of1 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeInteger
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeNumber <em>Normal Job Runs 45on One Of1 Any Of1 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeNumber
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeBoolean <em>Normal Job Runs 45on One Of1 Any Of1 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeObject <em>Normal Job Runs 45on One Of1 Any Of1 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeObject
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1PropertiesAbstract <em>Normal Job Runs 45on One Of1 Any Of1 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1PropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1AdditionalProperties <em>Normal Job Runs 45on One Of1 Any Of1 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1AdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeArray <em>Normal Job Runs 45on One Of1 Any Of1 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeArray
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeNull <em>Normal Job Runs 45on One Of1 Any Of1 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf1TypeNull
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf1TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2Abstract <em>Normal Job Runs 45on One Of1 Any Of2 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2Abstract
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeString <em>Normal Job Runs 45on One Of1 Any Of2 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeString
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeInteger <em>Normal Job Runs 45on One Of1 Any Of2 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeInteger
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeNumber <em>Normal Job Runs 45on One Of1 Any Of2 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeNumber
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeBoolean <em>Normal Job Runs 45on One Of1 Any Of2 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeObject <em>Normal Job Runs 45on One Of1 Any Of2 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeObject
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract <em>Normal Job Runs 45on One Of1 Any Of2 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2AdditionalProperties <em>Normal Job Runs 45on One Of1 Any Of2 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2AdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeArray <em>Normal Job Runs 45on One Of1 Any Of2 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeArray
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeNull <em>Normal Job Runs 45on One Of1 Any Of2 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf2TypeNull
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf2TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3Abstract <em>Normal Job Runs 45on One Of1 Any Of3 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3Abstract
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3TypeString <em>Normal Job Runs 45on One Of1 Any Of3 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3TypeString
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3TypeInteger <em>Normal Job Runs 45on One Of1 Any Of3 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3TypeInteger
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3TypeNumber <em>Normal Job Runs 45on One Of1 Any Of3 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3TypeNumber
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3TypeBoolean <em>Normal Job Runs 45on One Of1 Any Of3 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3TypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3TypeObject <em>Normal Job Runs 45on One Of1 Any Of3 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3TypeObject
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3PropertiesAbstract <em>Normal Job Runs 45on One Of1 Any Of3 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3PropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3AdditionalProperties <em>Normal Job Runs 45on One Of1 Any Of3 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3AdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3TypeArray <em>Normal Job Runs 45on One Of1 Any Of3 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3TypeArray
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf3TypeNull <em>Normal Job Runs 45on One Of1 Any Of3 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf3TypeNull
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf3TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4Abstract <em>Normal Job Runs 45on One Of1 Any Of4 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4Abstract
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeString <em>Normal Job Runs 45on One Of1 Any Of4 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeString
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeInteger <em>Normal Job Runs 45on One Of1 Any Of4 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeInteger
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeNumber <em>Normal Job Runs 45on One Of1 Any Of4 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeNumber
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeBoolean <em>Normal Job Runs 45on One Of1 Any Of4 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeObject <em>Normal Job Runs 45on One Of1 Any Of4 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeObject
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4PropertiesAbstract <em>Normal Job Runs 45on One Of1 Any Of4 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4PropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4AdditionalProperties <em>Normal Job Runs 45on One Of1 Any Of4 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4AdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeArray <em>Normal Job Runs 45on One Of1 Any Of4 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeArray
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeNull <em>Normal Job Runs 45on One Of1 Any Of4 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobRuns_45onOneOf1AnyOf4TypeNull
	 * @generated
	 */
	public Adapter createNormalJobRuns_45onOneOf1AnyOf4TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnvironmentAbstract <em>Normal Job Environment Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnvironmentAbstract
	 * @generated
	 */
	public Adapter createNormalJobEnvironmentAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnvironmentTypeString <em>Normal Job Environment Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnvironmentTypeString
	 * @generated
	 */
	public Adapter createNormalJobEnvironmentTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnvironmentTypeInteger <em>Normal Job Environment Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnvironmentTypeInteger
	 * @generated
	 */
	public Adapter createNormalJobEnvironmentTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnvironmentTypeNumber <em>Normal Job Environment Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnvironmentTypeNumber
	 * @generated
	 */
	public Adapter createNormalJobEnvironmentTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnvironmentTypeBoolean <em>Normal Job Environment Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnvironmentTypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobEnvironmentTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnvironmentTypeObject <em>Normal Job Environment Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnvironmentTypeObject
	 * @generated
	 */
	public Adapter createNormalJobEnvironmentTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnvironmentPropertiesAbstract <em>Normal Job Environment Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnvironmentPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobEnvironmentPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnvironmentAdditionalProperties <em>Normal Job Environment Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnvironmentAdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobEnvironmentAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnvironmentTypeArray <em>Normal Job Environment Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnvironmentTypeArray
	 * @generated
	 */
	public Adapter createNormalJobEnvironmentTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnvironmentItems <em>Normal Job Environment Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnvironmentItems
	 * @generated
	 */
	public Adapter createNormalJobEnvironmentItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobEnvironmentTypeNull <em>Normal Job Environment Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobEnvironmentTypeNull
	 * @generated
	 */
	public Adapter createNormalJobEnvironmentTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobOutputsPropertiesAbstract <em>Normal Job Outputs Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobOutputsPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobOutputsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobIfAbstract <em>Normal Job If Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobIfAbstract
	 * @generated
	 */
	public Adapter createNormalJobIfAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobIfTypeBoolean <em>Normal Job If Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobIfTypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobIfTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobIfTypeNumber <em>Normal Job If Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobIfTypeNumber
	 * @generated
	 */
	public Adapter createNormalJobIfTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobIfTypeString <em>Normal Job If Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobIfTypeString
	 * @generated
	 */
	public Adapter createNormalJobIfTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAbstract <em>Normal Job Steps Items Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAbstract
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsTypeString <em>Normal Job Steps Items Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsTypeString
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsTypeInteger <em>Normal Job Steps Items Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsTypeInteger
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsTypeNumber <em>Normal Job Steps Items Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsTypeNumber
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsTypeBoolean <em>Normal Job Steps Items Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsTypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsTypeObject <em>Normal Job Steps Items Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsTypeObject
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsPropertiesAbstract <em>Normal Job Steps Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAdditionalProperties <em>Normal Job Steps Items Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsTypeArray <em>Normal Job Steps Items Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsTypeArray
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsItems <em>Normal Job Steps Items Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsItems
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsTypeNull <em>Normal Job Steps Items Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsTypeNull
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0Abstract <em>Normal Job Steps Items All Of0 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0Abstract
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0TypeString <em>Normal Job Steps Items All Of0 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0TypeString
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0TypeInteger <em>Normal Job Steps Items All Of0 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0TypeInteger
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0TypeNumber <em>Normal Job Steps Items All Of0 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0TypeNumber
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0TypeBoolean <em>Normal Job Steps Items All Of0 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0TypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0TypeObject <em>Normal Job Steps Items All Of0 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0TypeObject
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0PropertiesAbstract <em>Normal Job Steps Items All Of0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0PropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0AdditionalProperties <em>Normal Job Steps Items All Of0 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0AdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0TypeArray <em>Normal Job Steps Items All Of0 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0TypeArray
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0Items <em>Normal Job Steps Items All Of0 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0Items
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0TypeNull <em>Normal Job Steps Items All Of0 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0TypeNull
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0OneOf0PropertiesAbstract <em>Normal Job Steps Items All Of0 One Of0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0OneOf0PropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0OneOf0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0OneOf0AdditionalProperties <em>Normal Job Steps Items All Of0 One Of0 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0OneOf0AdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0OneOf1PropertiesAbstract <em>Normal Job Steps Items All Of0 One Of1 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0OneOf1PropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0OneOf1PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf0OneOf1AdditionalProperties <em>Normal Job Steps Items All Of0 One Of1 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf0OneOf1AdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf0OneOf1AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1PropertiesAbstract <em>Normal Job Steps Items All Of1 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1PropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1IfAbstract <em>Normal Job Steps Items All Of1 If Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1IfAbstract
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1IfAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1IfTypeBoolean <em>Normal Job Steps Items All Of1 If Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1IfTypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1IfTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1IfTypeNumber <em>Normal Job Steps Items All Of1 If Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1IfTypeNumber
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1IfTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1IfTypeString <em>Normal Job Steps Items All Of1 If Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1IfTypeString
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1IfTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorAbstract <em>Normal Job Steps Items All Of1 Continue 45on 45error Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorAbstract
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Continue_45on_45errorAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeString <em>Normal Job Steps Items All Of1 Continue 45on 45error Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeString
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger <em>Normal Job Steps Items All Of1 Continue 45on 45error Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber <em>Normal Job Steps Items All Of1 Continue 45on 45error Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean <em>Normal Job Steps Items All Of1 Continue 45on 45error Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject <em>Normal Job Steps Items All Of1 Continue 45on 45error Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract <em>Normal Job Steps Items All Of1 Continue 45on 45error Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties <em>Normal Job Steps Items All Of1 Continue 45on 45error Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray <em>Normal Job Steps Items All Of1 Continue 45on 45error Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorItems <em>Normal Job Steps Items All Of1 Continue 45on 45error Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorItems
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Continue_45on_45errorItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull <em>Normal Job Steps Items All Of1 Continue 45on 45error Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull
	 * @generated
	 */
	public Adapter createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyPropertiesAbstract <em>Normal Job Strategy Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobStrategyPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAbstract <em>Normal Job Strategy Matrix Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAbstract
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixTypeString <em>Normal Job Strategy Matrix Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixTypeString
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixTypeInteger <em>Normal Job Strategy Matrix Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixTypeInteger
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixTypeNumber <em>Normal Job Strategy Matrix Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixTypeNumber
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixTypeBoolean <em>Normal Job Strategy Matrix Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixTypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixTypeObject <em>Normal Job Strategy Matrix Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixTypeObject
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixPropertiesAbstract <em>Normal Job Strategy Matrix Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixTypeArray <em>Normal Job Strategy Matrix Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixTypeArray
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixItems <em>Normal Job Strategy Matrix Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixItems
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixTypeNull <em>Normal Job Strategy Matrix Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixTypeNull
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixOneOf0PropertiesAbstract <em>Normal Job Strategy Matrix One Of0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixOneOf0PropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixOneOf0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixOneOf0AdditionalProperties <em>Normal Job Strategy Matrix One Of0 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixOneOf0AdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixOneOf0AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract <em>Normal Job Strategy Matrix Pattern Properties0 Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesAbstract <em>Normal Job Strategy Matrix Additional Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeString <em>Normal Job Strategy Matrix Additional Properties Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeString
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeInteger <em>Normal Job Strategy Matrix Additional Properties Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeInteger
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeNumber <em>Normal Job Strategy Matrix Additional Properties Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeNumber
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeBoolean <em>Normal Job Strategy Matrix Additional Properties Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeObject <em>Normal Job Strategy Matrix Additional Properties Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeObject
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesPropertiesAbstract <em>Normal Job Strategy Matrix Additional Properties Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalPropertiesPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties <em>Normal Job Strategy Matrix Additional Properties Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeArray <em>Normal Job Strategy Matrix Additional Properties Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeArray
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesItems <em>Normal Job Strategy Matrix Additional Properties Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalPropertiesItems
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeNull <em>Normal Job Strategy Matrix Additional Properties Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobStrategyMatrixAdditionalPropertiesTypeNull
	 * @generated
	 */
	public Adapter createNormalJobStrategyMatrixAdditionalPropertiesTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContinue_45on_45errorAbstract <em>Normal Job Continue 45on 45error Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContinue_45on_45errorAbstract
	 * @generated
	 */
	public Adapter createNormalJobContinue_45on_45errorAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContinue_45on_45errorTypeString <em>Normal Job Continue 45on 45error Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContinue_45on_45errorTypeString
	 * @generated
	 */
	public Adapter createNormalJobContinue_45on_45errorTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContinue_45on_45errorTypeInteger <em>Normal Job Continue 45on 45error Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContinue_45on_45errorTypeInteger
	 * @generated
	 */
	public Adapter createNormalJobContinue_45on_45errorTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContinue_45on_45errorTypeNumber <em>Normal Job Continue 45on 45error Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContinue_45on_45errorTypeNumber
	 * @generated
	 */
	public Adapter createNormalJobContinue_45on_45errorTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContinue_45on_45errorTypeBoolean <em>Normal Job Continue 45on 45error Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContinue_45on_45errorTypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobContinue_45on_45errorTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContinue_45on_45errorTypeObject <em>Normal Job Continue 45on 45error Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContinue_45on_45errorTypeObject
	 * @generated
	 */
	public Adapter createNormalJobContinue_45on_45errorTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContinue_45on_45errorPropertiesAbstract <em>Normal Job Continue 45on 45error Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContinue_45on_45errorPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobContinue_45on_45errorPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContinue_45on_45errorAdditionalProperties <em>Normal Job Continue 45on 45error Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContinue_45on_45errorAdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobContinue_45on_45errorAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContinue_45on_45errorTypeArray <em>Normal Job Continue 45on 45error Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContinue_45on_45errorTypeArray
	 * @generated
	 */
	public Adapter createNormalJobContinue_45on_45errorTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContinue_45on_45errorItems <em>Normal Job Continue 45on 45error Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContinue_45on_45errorItems
	 * @generated
	 */
	public Adapter createNormalJobContinue_45on_45errorItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContinue_45on_45errorTypeNull <em>Normal Job Continue 45on 45error Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContinue_45on_45errorTypeNull
	 * @generated
	 */
	public Adapter createNormalJobContinue_45on_45errorTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContainerAbstract <em>Normal Job Container Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContainerAbstract
	 * @generated
	 */
	public Adapter createNormalJobContainerAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContainerTypeString <em>Normal Job Container Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContainerTypeString
	 * @generated
	 */
	public Adapter createNormalJobContainerTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContainerTypeInteger <em>Normal Job Container Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContainerTypeInteger
	 * @generated
	 */
	public Adapter createNormalJobContainerTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContainerTypeNumber <em>Normal Job Container Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContainerTypeNumber
	 * @generated
	 */
	public Adapter createNormalJobContainerTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContainerTypeBoolean <em>Normal Job Container Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContainerTypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobContainerTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContainerTypeObject <em>Normal Job Container Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContainerTypeObject
	 * @generated
	 */
	public Adapter createNormalJobContainerTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContainerPropertiesAbstract <em>Normal Job Container Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContainerPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobContainerPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContainerAdditionalProperties <em>Normal Job Container Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContainerAdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobContainerAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContainerTypeArray <em>Normal Job Container Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContainerTypeArray
	 * @generated
	 */
	public Adapter createNormalJobContainerTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContainerItems <em>Normal Job Container Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContainerItems
	 * @generated
	 */
	public Adapter createNormalJobContainerItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobContainerTypeNull <em>Normal Job Container Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobContainerTypeNull
	 * @generated
	 */
	public Adapter createNormalJobContainerTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobServicesPropertiesAbstract <em>Normal Job Services Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobServicesPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobServicesPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobConcurrencyAbstract <em>Normal Job Concurrency Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobConcurrencyAbstract
	 * @generated
	 */
	public Adapter createNormalJobConcurrencyAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobConcurrencyTypeString <em>Normal Job Concurrency Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobConcurrencyTypeString
	 * @generated
	 */
	public Adapter createNormalJobConcurrencyTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobConcurrencyTypeInteger <em>Normal Job Concurrency Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobConcurrencyTypeInteger
	 * @generated
	 */
	public Adapter createNormalJobConcurrencyTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobConcurrencyTypeNumber <em>Normal Job Concurrency Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobConcurrencyTypeNumber
	 * @generated
	 */
	public Adapter createNormalJobConcurrencyTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobConcurrencyTypeBoolean <em>Normal Job Concurrency Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobConcurrencyTypeBoolean
	 * @generated
	 */
	public Adapter createNormalJobConcurrencyTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobConcurrencyTypeObject <em>Normal Job Concurrency Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobConcurrencyTypeObject
	 * @generated
	 */
	public Adapter createNormalJobConcurrencyTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobConcurrencyPropertiesAbstract <em>Normal Job Concurrency Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobConcurrencyPropertiesAbstract
	 * @generated
	 */
	public Adapter createNormalJobConcurrencyPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobConcurrencyAdditionalProperties <em>Normal Job Concurrency Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobConcurrencyAdditionalProperties
	 * @generated
	 */
	public Adapter createNormalJobConcurrencyAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobConcurrencyTypeArray <em>Normal Job Concurrency Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobConcurrencyTypeArray
	 * @generated
	 */
	public Adapter createNormalJobConcurrencyTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobConcurrencyItems <em>Normal Job Concurrency Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobConcurrencyItems
	 * @generated
	 */
	public Adapter createNormalJobConcurrencyItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.NormalJobConcurrencyTypeNull <em>Normal Job Concurrency Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.NormalJobConcurrencyTypeNull
	 * @generated
	 */
	public Adapter createNormalJobConcurrencyTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnAbstract <em>Root On Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnTypeString <em>Root On Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnTypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnTypeInteger <em>Root On Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnTypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnTypeNumber <em>Root On Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnTypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnTypeBoolean <em>Root On Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnTypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnTypeObject <em>Root On Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnTypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnPropertiesAbstract <em>Root On Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnAdditionalProperties <em>Root On Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnAdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootOnAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnTypeArray <em>Root On Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnTypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnItems <em>Root On Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnTypeNull <em>Root On Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnTypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2PropertiesAbstract <em>Root On One Of2 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2PropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_requestPatternProperties0Items <em>Root On One Of2 Pull request Pattern Properties0 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_requestPatternProperties0Items
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_requestPatternProperties0ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0Abstract <em>Root On One Of2 Pull request target Pattern Properties0 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0Abstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeString <em>Root On One Of2 Pull request target Pattern Properties0 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger <em>Root On One Of2 Pull request target Pattern Properties0 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumber <em>Root On One Of2 Pull request target Pattern Properties0 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBoolean <em>Root On One Of2 Pull request target Pattern Properties0 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObject <em>Root On One Of2 Pull request target Pattern Properties0 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0PropertiesAbstract <em>Root On One Of2 Pull request target Pattern Properties0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0PropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties <em>Root On One Of2 Pull request target Pattern Properties0 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArray <em>Root On One Of2 Pull request target Pattern Properties0 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0Items <em>Root On One Of2 Pull request target Pattern Properties0 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0Items
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNull <em>Root On One Of2 Pull request target Pattern Properties0 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callAbstract <em>Root On One Of2 Workflow call Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeString <em>Root On One Of2 Workflow call Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callTypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeInteger <em>Root On One Of2 Workflow call Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callTypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeNumber <em>Root On One Of2 Workflow call Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callTypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeBoolean <em>Root On One Of2 Workflow call Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callTypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeObject <em>Root On One Of2 Workflow call Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callTypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callPropertiesAbstract <em>Root On One Of2 Workflow call Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callAdditionalProperties <em>Root On One Of2 Workflow call Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callAdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeArray <em>Root On One Of2 Workflow call Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callTypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callItems <em>Root On One Of2 Workflow call Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callTypeNull <em>Root On One Of2 Workflow call Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callTypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPropertiesAbstract <em>Root On One Of2 Workflow call Inputs Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callInputsPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callInputsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstract <em>Root On One Of2 Workflow call Inputs Pattern Properties0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstract <em>Root On One Of2 Workflow call Inputs Pattern Properties0 Default Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBoolean <em>Root On One Of2 Workflow call Inputs Pattern Properties0 Default Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumber <em>Root On One Of2 Workflow call Inputs Pattern Properties0 Default Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString <em>Root On One Of2 Workflow call Inputs Pattern Properties0 Default Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsAbstract <em>Root On One Of2 Workflow call Secrets Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeString <em>Root On One Of2 Workflow call Secrets Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeInteger <em>Root On One Of2 Workflow call Secrets Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeNumber <em>Root On One Of2 Workflow call Secrets Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean <em>Root On One Of2 Workflow call Secrets Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeObject <em>Root On One Of2 Workflow call Secrets Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPropertiesAbstract <em>Root On One Of2 Workflow call Secrets Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeArray <em>Root On One Of2 Workflow call Secrets Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsItems <em>Root On One Of2 Workflow call Secrets Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeNull <em>Root On One Of2 Workflow call Secrets Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsTypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Abstract <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Abstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeString <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeInteger <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumber <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBoolean <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArray <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Items <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Items
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNull <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstract <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Required Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeString <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Required Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeInteger <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Required Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumber <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Required Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBoolean <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Required Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObject <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Required Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredPropertiesAbstract <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Required Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Required Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Required Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Required Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNull <em>Root On One Of2 Workflow call Secrets Pattern Properties0 Required Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchAbstract <em>Root On One Of2 Workflow dispatch Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeString <em>Root On One Of2 Workflow dispatch Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeInteger <em>Root On One Of2 Workflow dispatch Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeNumber <em>Root On One Of2 Workflow dispatch Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeBoolean <em>Root On One Of2 Workflow dispatch Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeObject <em>Root On One Of2 Workflow dispatch Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstract <em>Root On One Of2 Workflow dispatch Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties <em>Root On One Of2 Workflow dispatch Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeArray <em>Root On One Of2 Workflow dispatch Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchItems <em>Root On One Of2 Workflow dispatch Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeNull <em>Root On One Of2 Workflow dispatch Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchTypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPropertiesAbstract <em>Root On One Of2 Workflow dispatch Inputs Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0PropertiesAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0PropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeString <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeInteger <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumber <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBoolean <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObject <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultPropertiesAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArray <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItems <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 Default Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Abstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Abstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeString <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeInteger <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumber <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBoolean <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArray <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Items <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Items
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNull <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 If Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 If Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 If Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 If Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 If Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 If Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 If Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 If Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 If Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 If Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 If Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Then Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Then Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Then Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Then Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Then Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Then Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Then Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Then Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Then Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Then Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Then Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Else Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Else Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Else Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Else Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Else Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Else Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Else Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Else Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Else Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Else Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of0 Else Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 If Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 If Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 If Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 If Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 If Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 If Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 If Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 If Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 If Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 If Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 If Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Then Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Then Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Then Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Then Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Then Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Then Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Then Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Then Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Then Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Then Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull <em>Root On One Of2 Workflow dispatch Inputs Pattern Properties0 All Of1 Then Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0Abstract <em>Root On One Of2 Workflow run Pattern Properties0 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0Abstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runPatternProperties0AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeString <em>Root On One Of2 Workflow run Pattern Properties0 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeInteger <em>Root On One Of2 Workflow run Pattern Properties0 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumber <em>Root On One Of2 Workflow run Pattern Properties0 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBoolean <em>Root On One Of2 Workflow run Pattern Properties0 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject <em>Root On One Of2 Workflow run Pattern Properties0 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0PropertiesAbstract <em>Root On One Of2 Workflow run Pattern Properties0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0PropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runPatternProperties0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties <em>Root On One Of2 Workflow run Pattern Properties0 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArray <em>Root On One Of2 Workflow run Pattern Properties0 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0Items <em>Root On One Of2 Workflow run Pattern Properties0 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0Items
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runPatternProperties0ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNull <em>Root On One Of2 Workflow run Pattern Properties0 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsAbstract <em>Root On One Of2 Schedule Items Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ScheduleItemsAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ScheduleItemsAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeString <em>Root On One Of2 Schedule Items Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeString
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ScheduleItemsTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeInteger <em>Root On One Of2 Schedule Items Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ScheduleItemsTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeNumber <em>Root On One Of2 Schedule Items Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ScheduleItemsTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeBoolean <em>Root On One Of2 Schedule Items Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ScheduleItemsTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeObject <em>Root On One Of2 Schedule Items Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ScheduleItemsTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract <em>Root On One Of2 Schedule Items Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ScheduleItemsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeArray <em>Root On One Of2 Schedule Items Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ScheduleItemsTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsItems <em>Root On One Of2 Schedule Items Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ScheduleItemsItems
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ScheduleItemsItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeNull <em>Root On One Of2 Schedule Items Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootOnOneOf2ScheduleItemsTypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootOnOneOf2ScheduleItemsTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootConcurrencyAbstract <em>Root Concurrency Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootConcurrencyAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootConcurrencyAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootConcurrencyTypeString <em>Root Concurrency Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootConcurrencyTypeString
	 * @generated
	 */
	public Adapter createGithubwfRootConcurrencyTypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootConcurrencyTypeInteger <em>Root Concurrency Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootConcurrencyTypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootConcurrencyTypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootConcurrencyTypeNumber <em>Root Concurrency Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootConcurrencyTypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootConcurrencyTypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootConcurrencyTypeBoolean <em>Root Concurrency Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootConcurrencyTypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootConcurrencyTypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootConcurrencyTypeObject <em>Root Concurrency Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootConcurrencyTypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootConcurrencyTypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootConcurrencyPropertiesAbstract <em>Root Concurrency Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootConcurrencyPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootConcurrencyPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootConcurrencyAdditionalProperties <em>Root Concurrency Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootConcurrencyAdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootConcurrencyAdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootConcurrencyTypeArray <em>Root Concurrency Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootConcurrencyTypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootConcurrencyTypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootConcurrencyItems <em>Root Concurrency Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootConcurrencyItems
	 * @generated
	 */
	public Adapter createGithubwfRootConcurrencyItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootConcurrencyTypeNull <em>Root Concurrency Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootConcurrencyTypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootConcurrencyTypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPropertiesAbstract <em>Root Jobs Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPatternProperties0Abstract <em>Root Jobs Pattern Properties0 Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPatternProperties0Abstract
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPatternProperties0AbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPatternProperties0TypeString <em>Root Jobs Pattern Properties0 Type String</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPatternProperties0TypeString
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPatternProperties0TypeStringAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPatternProperties0TypeInteger <em>Root Jobs Pattern Properties0 Type Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPatternProperties0TypeInteger
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPatternProperties0TypeIntegerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPatternProperties0TypeNumber <em>Root Jobs Pattern Properties0 Type Number</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPatternProperties0TypeNumber
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPatternProperties0TypeNumberAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPatternProperties0TypeBoolean <em>Root Jobs Pattern Properties0 Type Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPatternProperties0TypeBoolean
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPatternProperties0TypeBooleanAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPatternProperties0TypeObject <em>Root Jobs Pattern Properties0 Type Object</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPatternProperties0TypeObject
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPatternProperties0TypeObjectAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPatternProperties0PropertiesAbstract <em>Root Jobs Pattern Properties0 Properties Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPatternProperties0PropertiesAbstract
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPatternProperties0PropertiesAbstractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPatternProperties0AdditionalProperties <em>Root Jobs Pattern Properties0 Additional Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPatternProperties0AdditionalProperties
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPatternProperties0AdditionalPropertiesAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPatternProperties0TypeArray <em>Root Jobs Pattern Properties0 Type Array</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPatternProperties0TypeArray
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPatternProperties0TypeArrayAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPatternProperties0Items <em>Root Jobs Pattern Properties0 Items</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPatternProperties0Items
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPatternProperties0ItemsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link githubwf.GithubwfRootJobsPatternProperties0TypeNull <em>Root Jobs Pattern Properties0 Type Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see githubwf.GithubwfRootJobsPatternProperties0TypeNull
	 * @generated
	 */
	public Adapter createGithubwfRootJobsPatternProperties0TypeNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //GithubwfAdapterFactory
