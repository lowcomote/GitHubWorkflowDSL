/**
 */
package githubwf.impl;

import githubwf.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GithubwfFactoryImpl extends EFactoryImpl implements GithubwfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GithubwfFactory init() {
		try {
			GithubwfFactory theGithubwfFactory = (GithubwfFactory)EPackage.Registry.INSTANCE.getEFactory(GithubwfPackage.eNS_URI);
			if (theGithubwfFactory != null) {
				return theGithubwfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GithubwfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GithubwfFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GithubwfPackage.EVENT_OBJECT_ADDITIONAL_PROPERTIES: return createEventObjectAdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT: return createGithubwfRoot();
			case GithubwfPackage.ARCHITECTURE: return createArchitecture();
			case GithubwfPackage.BRANCH: return createBranch();
			case GithubwfPackage.CONCURRENCY: return createConcurrency();
			case GithubwfPackage.CONCURRENCY_GROUP: return createConcurrencyGroup();
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS: return createConcurrencyCancel_45in_45progress();
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_ONE_OF0: return createConcurrencyCancel_45in_45progressOneOf0();
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_ONE_OF1: return createConcurrencyCancel_45in_45progressOneOf1();
			case GithubwfPackage.CONFIGURATION: return createConfiguration();
			case GithubwfPackage.CONFIGURATION_ONE_OF0: return createConfigurationOneOf0();
			case GithubwfPackage.CONFIGURATION_ONE_OF1: return createConfigurationOneOf1();
			case GithubwfPackage.CONFIGURATION_ONE_OF2: return createConfigurationOneOf2();
			case GithubwfPackage.CONFIGURATION_ONE_OF3: return createConfigurationOneOf3();
			case GithubwfPackage.CONFIGURATION_ONE_OF3_ADDITIONAL_PROPERTIES: return createConfigurationOneOf3AdditionalProperties();
			case GithubwfPackage.CONFIGURATION_ONE_OF4: return createConfigurationOneOf4();
			case GithubwfPackage.CONFIGURATION_ONE_OF4_ITEMS: return createConfigurationOneOf4Items();
			case GithubwfPackage.CONTAINER: return createContainer();
			case GithubwfPackage.CONTAINER_IMAGE: return createContainerImage();
			case GithubwfPackage.CONTAINER_CREDENTIALS: return createContainerCredentials();
			case GithubwfPackage.CONTAINER_CREDENTIALS_USERNAME: return createContainerCredentialsUsername();
			case GithubwfPackage.CONTAINER_CREDENTIALS_PASSWORD: return createContainerCredentialsPassword();
			case GithubwfPackage.CONTAINER_ENV: return createContainerEnv();
			case GithubwfPackage.CONTAINER_PORTS: return createContainerPorts();
			case GithubwfPackage.CONTAINER_PORTS_ITEMS: return createContainerPortsItems();
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_ONE_OF0: return createContainerPortsItemsOneOf0();
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_ONE_OF1: return createContainerPortsItemsOneOf1();
			case GithubwfPackage.CONTAINER_VOLUMES: return createContainerVolumes();
			case GithubwfPackage.CONTAINER_VOLUMES_ITEMS: return createContainerVolumesItems();
			case GithubwfPackage.CONTAINER_OPTIONS: return createContainerOptions();
			case GithubwfPackage.DEFAULTS: return createDefaults();
			case GithubwfPackage.DEFAULTS_RUN: return createDefaultsRun();
			case GithubwfPackage.DEFAULTS_RUN_SHELL: return createDefaultsRunShell();
			case GithubwfPackage.DEFAULTS_RUN_WORKING_45DIRECTORY: return createDefaultsRunWorking_45directory();
			case GithubwfPackage.PERMISSIONS: return createPermissions();
			case GithubwfPackage.PERMISSIONS_ONE_OF0: return createPermissionsOneOf0();
			case GithubwfPackage.PERMISSIONS_ONE_OF1: return createPermissionsOneOf1();
			case GithubwfPackage.PERMISSIONS_45EVENT: return createPermissions_45event();
			case GithubwfPackage.PERMISSIONS_45EVENT_ACTIONS: return createPermissions_45eventActions();
			case GithubwfPackage.PERMISSIONS_45EVENT_CHECKS: return createPermissions_45eventChecks();
			case GithubwfPackage.PERMISSIONS_45EVENT_CONTENTS: return createPermissions_45eventContents();
			case GithubwfPackage.PERMISSIONS_45EVENT_DEPLOYMENTS: return createPermissions_45eventDeployments();
			case GithubwfPackage.PERMISSIONS_45EVENT_DISCUSSIONS: return createPermissions_45eventDiscussions();
			case GithubwfPackage.PERMISSIONS_45EVENT_ID_45TOKEN: return createPermissions_45eventId_45token();
			case GithubwfPackage.PERMISSIONS_45EVENT_ISSUES: return createPermissions_45eventIssues();
			case GithubwfPackage.PERMISSIONS_45EVENT_PACKAGES: return createPermissions_45eventPackages();
			case GithubwfPackage.PERMISSIONS_45EVENT_PAGES: return createPermissions_45eventPages();
			case GithubwfPackage.PERMISSIONS_45EVENT_PULL_45REQUESTS: return createPermissions_45eventPull_45requests();
			case GithubwfPackage.PERMISSIONS_45EVENT_REPOSITORY_45PROJECTS: return createPermissions_45eventRepository_45projects();
			case GithubwfPackage.PERMISSIONS_45EVENT_SECURITY_45EVENTS: return createPermissions_45eventSecurity_45events();
			case GithubwfPackage.PERMISSIONS_45EVENT_STATUSES: return createPermissions_45eventStatuses();
			case GithubwfPackage.PERMISSIONS_45LEVEL: return createPermissions_45level();
			case GithubwfPackage.ENV: return createEnv();
			case GithubwfPackage.ENV_ONE_OF0: return createEnvOneOf0();
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES: return createEnvOneOf0AdditionalProperties();
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_ONE_OF0: return createEnvOneOf0AdditionalPropertiesOneOf0();
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_ONE_OF1: return createEnvOneOf0AdditionalPropertiesOneOf1();
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_ONE_OF2: return createEnvOneOf0AdditionalPropertiesOneOf2();
			case GithubwfPackage.ENV_ONE_OF1: return createEnvOneOf1();
			case GithubwfPackage.ENVIRONMENT: return createEnvironment();
			case GithubwfPackage.ENVIRONMENT_NAME: return createEnvironmentName();
			case GithubwfPackage.ENVIRONMENT_URL: return createEnvironmentUrl();
			case GithubwfPackage.EVENT: return createEvent();
			case GithubwfPackage.EVENT_OBJECT: return createEventObject();
			case GithubwfPackage.EVENT_OBJECT_ONE_OF0: return createEventObjectOneOf0();
			case GithubwfPackage.EVENT_OBJECT_ONE_OF1: return createEventObjectOneOf1();
			case GithubwfPackage.EXPRESSION_SYNTAX: return createExpressionSyntax();
			case GithubwfPackage.STRING_CONTAINING_EXPRESSION_SYNTAX: return createStringContainingExpressionSyntax();
			case GithubwfPackage.GLOBS: return createGlobs();
			case GithubwfPackage.GLOBS_ITEMS: return createGlobsItems();
			case GithubwfPackage.MACHINE: return createMachine();
			case GithubwfPackage.NAME: return createName();
			case GithubwfPackage.PATH: return createPath();
			case GithubwfPackage.REF: return createRef();
			case GithubwfPackage.REF_BRANCHES: return createRefBranches();
			case GithubwfPackage.REF_BRANCHES_45IGNORE: return createRefBranches_45ignore();
			case GithubwfPackage.REF_TAGS: return createRefTags();
			case GithubwfPackage.REF_TAGS_45IGNORE: return createRefTags_45ignore();
			case GithubwfPackage.REF_PATHS: return createRefPaths();
			case GithubwfPackage.REF_PATHS_45IGNORE: return createRefPaths_45ignore();
			case GithubwfPackage.REF_ONE_OF0: return createRefOneOf0();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0: return createRefOneOf0AllOf0();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_NOT: return createRefOneOf0AllOf0Not();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1: return createRefOneOf0AllOf1();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_NOT: return createRefOneOf0AllOf1Not();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2: return createRefOneOf0AllOf2();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_NOT: return createRefOneOf0AllOf2Not();
			case GithubwfPackage.REF_ONE_OF1: return createRefOneOf1();
			case GithubwfPackage.SHELL: return createShell();
			case GithubwfPackage.SHELL_ANY_OF0: return createShellAnyOf0();
			case GithubwfPackage.SHELL_ANY_OF1: return createShellAnyOf1();
			case GithubwfPackage.TYPES: return createTypes();
			case GithubwfPackage.WORKING_45DIRECTORY: return createWorking_45directory();
			case GithubwfPackage.JOB_NEEDS: return createJobNeeds();
			case GithubwfPackage.JOB_NEEDS_ONE_OF0: return createJobNeedsOneOf0();
			case GithubwfPackage.JOB_NEEDS_ONE_OF0_ITEMS: return createJobNeedsOneOf0Items();
			case GithubwfPackage.JOB_NEEDS_ONE_OF1: return createJobNeedsOneOf1();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB: return createReusableWorkflowCallJob();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_NAME: return createReusableWorkflowCallJobName();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_NEEDS: return createReusableWorkflowCallJobNeeds();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_PERMISSIONS: return createReusableWorkflowCallJobPermissions();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_IF: return createReusableWorkflowCallJobIf();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_USES: return createReusableWorkflowCallJobUses();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_WITH: return createReusableWorkflowCallJobWith();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS: return createReusableWorkflowCallJobSecrets();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_ONE_OF0: return createReusableWorkflowCallJobSecretsOneOf0();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_ONE_OF1: return createReusableWorkflowCallJobSecretsOneOf1();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY: return createReusableWorkflowCallJobStrategy();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX: return createReusableWorkflowCallJobStrategyMatrix();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ONE_OF0: return createReusableWorkflowCallJobStrategyMatrixOneOf0();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ONE_OF1: return createReusableWorkflowCallJobStrategyMatrixOneOf1();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_PATTERN_PROPERTIES0: return createReusableWorkflowCallJobStrategyMatrixPatternProperties0();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_PATTERN_PROPERTIES0_ITEMS: return createReusableWorkflowCallJobStrategyMatrixPatternProperties0Items();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_PATTERN_PROPERTIES0_ITEMS_ADDITIONAL_PROPERTIES: return createReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES: return createReusableWorkflowCallJobStrategyMatrixAdditionalProperties();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ONE_OF0: return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ONE_OF0_ITEMS: return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ONE_OF1: return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_FAIL_45FAST: return createReusableWorkflowCallJobStrategyFail_45fast();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MAX_45PARALLEL: return createReusableWorkflowCallJobStrategyMax_45parallel();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY: return createReusableWorkflowCallJobConcurrency();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_ONE_OF0: return createReusableWorkflowCallJobConcurrencyOneOf0();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_ONE_OF1: return createReusableWorkflowCallJobConcurrencyOneOf1();
			case GithubwfPackage.NORMAL_JOB: return createNormalJob();
			case GithubwfPackage.NORMAL_JOB_NAME: return createNormalJobName();
			case GithubwfPackage.NORMAL_JOB_NEEDS: return createNormalJobNeeds();
			case GithubwfPackage.NORMAL_JOB_PERMISSIONS: return createNormalJobPermissions();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON: return createNormalJobRuns_45on();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF0: return createNormalJobRuns_45onOneOf0();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1: return createNormalJobRuns_45onOneOf1();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0: return createNormalJobRuns_45onOneOf1AnyOf0();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_ITEMS0: return createNormalJobRuns_45onOneOf1AnyOf0Items0();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_ADDITIONAL_ITEMS: return createNormalJobRuns_45onOneOf1AnyOf0AdditionalItems();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1: return createNormalJobRuns_45onOneOf1AnyOf1();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ITEMS0: return createNormalJobRuns_45onOneOf1AnyOf1Items0();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ITEMS1: return createNormalJobRuns_45onOneOf1AnyOf1Items1();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ADDITIONAL_ITEMS: return createNormalJobRuns_45onOneOf1AnyOf1AdditionalItems();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2: return createNormalJobRuns_45onOneOf1AnyOf2();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_ITEMS0: return createNormalJobRuns_45onOneOf1AnyOf2Items0();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_ITEMS1: return createNormalJobRuns_45onOneOf1AnyOf2Items1();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_ADDITIONAL_ITEMS: return createNormalJobRuns_45onOneOf1AnyOf2AdditionalItems();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF3: return createNormalJobRuns_45onOneOf1AnyOf3();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF3_ITEMS0: return createNormalJobRuns_45onOneOf1AnyOf3Items0();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF3_ITEMS1: return createNormalJobRuns_45onOneOf1AnyOf3Items1();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF3_ITEMS2: return createNormalJobRuns_45onOneOf1AnyOf3Items2();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF3_ADDITIONAL_ITEMS: return createNormalJobRuns_45onOneOf1AnyOf3AdditionalItems();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4: return createNormalJobRuns_45onOneOf1AnyOf4();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_ITEMS0: return createNormalJobRuns_45onOneOf1AnyOf4Items0();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_ITEMS1: return createNormalJobRuns_45onOneOf1AnyOf4Items1();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_ITEMS2: return createNormalJobRuns_45onOneOf1AnyOf4Items2();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_ADDITIONAL_ITEMS: return createNormalJobRuns_45onOneOf1AnyOf4AdditionalItems();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF2: return createNormalJobRuns_45onOneOf2();
			case GithubwfPackage.NORMAL_JOB_ENVIRONMENT: return createNormalJobEnvironment();
			case GithubwfPackage.NORMAL_JOB_ENVIRONMENT_ONE_OF0: return createNormalJobEnvironmentOneOf0();
			case GithubwfPackage.NORMAL_JOB_ENVIRONMENT_ONE_OF1: return createNormalJobEnvironmentOneOf1();
			case GithubwfPackage.NORMAL_JOB_OUTPUTS: return createNormalJobOutputs();
			case GithubwfPackage.NORMAL_JOB_OUTPUTS_ADDITIONAL_PROPERTIES: return createNormalJobOutputsAdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_ENV: return createNormalJobEnv();
			case GithubwfPackage.NORMAL_JOB_DEFAULTS: return createNormalJobDefaults();
			case GithubwfPackage.NORMAL_JOB_IF: return createNormalJobIf();
			case GithubwfPackage.NORMAL_JOB_STEPS: return createNormalJobSteps();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS: return createNormalJobStepsItems();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0: return createNormalJobStepsItemsAllOf0();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_ONE_OF0: return createNormalJobStepsItemsAllOf0OneOf0();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_ONE_OF0_USES: return createNormalJobStepsItemsAllOf0OneOf0Uses();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_ONE_OF1: return createNormalJobStepsItemsAllOf0OneOf1();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_ONE_OF1_RUN: return createNormalJobStepsItemsAllOf0OneOf1Run();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1: return createNormalJobStepsItemsAllOf1();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_ID: return createNormalJobStepsItemsAllOf1Id();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_IF: return createNormalJobStepsItemsAllOf1If();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_NAME: return createNormalJobStepsItemsAllOf1Name();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_USES: return createNormalJobStepsItemsAllOf1Uses();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_RUN: return createNormalJobStepsItemsAllOf1Run();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_WORKING_45DIRECTORY: return createNormalJobStepsItemsAllOf1Working_45directory();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_SHELL: return createNormalJobStepsItemsAllOf1Shell();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_WITH: return createNormalJobStepsItemsAllOf1With();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_WITH_ARGS: return createNormalJobStepsItemsAllOf1WithArgs();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_WITH_ENTRYPOINT: return createNormalJobStepsItemsAllOf1WithEntrypoint();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_ENV: return createNormalJobStepsItemsAllOf1Env();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR: return createNormalJobStepsItemsAllOf1Continue_45on_45error();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_ONE_OF0: return createNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_ONE_OF1: return createNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_TIMEOUT_45MINUTES: return createNormalJobStepsItemsAllOf1Timeout_45minutes();
			case GithubwfPackage.NORMAL_JOB_TIMEOUT_45MINUTES: return createNormalJobTimeout_45minutes();
			case GithubwfPackage.NORMAL_JOB_STRATEGY: return createNormalJobStrategy();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX: return createNormalJobStrategyMatrix();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ONE_OF0: return createNormalJobStrategyMatrixOneOf0();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ONE_OF1: return createNormalJobStrategyMatrixOneOf1();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_PATTERN_PROPERTIES0: return createNormalJobStrategyMatrixPatternProperties0();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_PATTERN_PROPERTIES0_ITEMS: return createNormalJobStrategyMatrixPatternProperties0Items();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_PATTERN_PROPERTIES0_ITEMS_ADDITIONAL_PROPERTIES: return createNormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES: return createNormalJobStrategyMatrixAdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ONE_OF0: return createNormalJobStrategyMatrixAdditionalPropertiesOneOf0();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ONE_OF0_ITEMS: return createNormalJobStrategyMatrixAdditionalPropertiesOneOf0Items();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ONE_OF1: return createNormalJobStrategyMatrixAdditionalPropertiesOneOf1();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_FAIL_45FAST: return createNormalJobStrategyFail_45fast();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MAX_45PARALLEL: return createNormalJobStrategyMax_45parallel();
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR: return createNormalJobContinue_45on_45error();
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_ONE_OF0: return createNormalJobContinue_45on_45errorOneOf0();
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_ONE_OF1: return createNormalJobContinue_45on_45errorOneOf1();
			case GithubwfPackage.NORMAL_JOB_CONTAINER: return createNormalJobContainer();
			case GithubwfPackage.NORMAL_JOB_CONTAINER_ONE_OF0: return createNormalJobContainerOneOf0();
			case GithubwfPackage.NORMAL_JOB_CONTAINER_ONE_OF1: return createNormalJobContainerOneOf1();
			case GithubwfPackage.NORMAL_JOB_SERVICES: return createNormalJobServices();
			case GithubwfPackage.NORMAL_JOB_SERVICES_ADDITIONAL_PROPERTIES: return createNormalJobServicesAdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY: return createNormalJobConcurrency();
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_ONE_OF0: return createNormalJobConcurrencyOneOf0();
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_ONE_OF1: return createNormalJobConcurrencyOneOf1();
			case GithubwfPackage.GITHUBWF_ROOT_NAME: return createGithubwfRootName();
			case GithubwfPackage.GITHUBWF_ROOT_ON: return createGithubwfRootOn();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF0: return createGithubwfRootOnOneOf0();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF1: return createGithubwfRootOnOneOf1();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF1_ITEMS: return createGithubwfRootOnOneOf1Items();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2: return createGithubwfRootOnOneOf2();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_BRANCH_PROTECTION_RULE: return createGithubwfRootOnOneOf2Branch_protection_rule();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_BRANCH_PROTECTION_RULE_TYPES: return createGithubwfRootOnOneOf2Branch_protection_ruleTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_BRANCH_PROTECTION_RULE_TYPES_ITEMS: return createGithubwfRootOnOneOf2Branch_protection_ruleTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_CHECK_RUN: return createGithubwfRootOnOneOf2Check_run();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_CHECK_RUN_TYPES: return createGithubwfRootOnOneOf2Check_runTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_CHECK_RUN_TYPES_ITEMS: return createGithubwfRootOnOneOf2Check_runTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_CHECK_SUITE: return createGithubwfRootOnOneOf2Check_suite();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_CHECK_SUITE_TYPES: return createGithubwfRootOnOneOf2Check_suiteTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_CHECK_SUITE_TYPES_ITEMS: return createGithubwfRootOnOneOf2Check_suiteTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_CREATE: return createGithubwfRootOnOneOf2Create();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DELETE: return createGithubwfRootOnOneOf2Delete();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DEPLOYMENT: return createGithubwfRootOnOneOf2Deployment();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DEPLOYMENT_STATUS: return createGithubwfRootOnOneOf2Deployment_status();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION: return createGithubwfRootOnOneOf2Discussion();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION_TYPES: return createGithubwfRootOnOneOf2DiscussionTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION_TYPES_ITEMS: return createGithubwfRootOnOneOf2DiscussionTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION_COMMENT: return createGithubwfRootOnOneOf2Discussion_comment();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION_COMMENT_TYPES: return createGithubwfRootOnOneOf2Discussion_commentTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_DISCUSSION_COMMENT_TYPES_ITEMS: return createGithubwfRootOnOneOf2Discussion_commentTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_FORK: return createGithubwfRootOnOneOf2Fork();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_GOLLUM: return createGithubwfRootOnOneOf2Gollum();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_ISSUE_COMMENT: return createGithubwfRootOnOneOf2Issue_comment();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_ISSUE_COMMENT_TYPES: return createGithubwfRootOnOneOf2Issue_commentTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_ISSUE_COMMENT_TYPES_ITEMS: return createGithubwfRootOnOneOf2Issue_commentTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_ISSUES: return createGithubwfRootOnOneOf2Issues();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_ISSUES_TYPES: return createGithubwfRootOnOneOf2IssuesTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_ISSUES_TYPES_ITEMS: return createGithubwfRootOnOneOf2IssuesTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_LABEL: return createGithubwfRootOnOneOf2Label();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_LABEL_TYPES: return createGithubwfRootOnOneOf2LabelTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_LABEL_TYPES_ITEMS: return createGithubwfRootOnOneOf2LabelTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_MEMBER: return createGithubwfRootOnOneOf2Member();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_MEMBER_TYPES: return createGithubwfRootOnOneOf2MemberTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_MEMBER_TYPES_ITEMS: return createGithubwfRootOnOneOf2MemberTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_MERGE_GROUP: return createGithubwfRootOnOneOf2Merge_group();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_MERGE_GROUP_TYPES: return createGithubwfRootOnOneOf2Merge_groupTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_MERGE_GROUP_TYPES_ITEMS: return createGithubwfRootOnOneOf2Merge_groupTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_MILESTONE: return createGithubwfRootOnOneOf2Milestone();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_MILESTONE_TYPES: return createGithubwfRootOnOneOf2MilestoneTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_MILESTONE_TYPES_ITEMS: return createGithubwfRootOnOneOf2MilestoneTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PAGE_BUILD: return createGithubwfRootOnOneOf2Page_build();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PROJECT: return createGithubwfRootOnOneOf2Project();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PROJECT_TYPES: return createGithubwfRootOnOneOf2ProjectTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PROJECT_TYPES_ITEMS: return createGithubwfRootOnOneOf2ProjectTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PROJECT_CARD: return createGithubwfRootOnOneOf2Project_card();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PROJECT_CARD_TYPES: return createGithubwfRootOnOneOf2Project_cardTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PROJECT_CARD_TYPES_ITEMS: return createGithubwfRootOnOneOf2Project_cardTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PROJECT_COLUMN: return createGithubwfRootOnOneOf2Project_column();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PROJECT_COLUMN_TYPES: return createGithubwfRootOnOneOf2Project_columnTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PROJECT_COLUMN_TYPES_ITEMS: return createGithubwfRootOnOneOf2Project_columnTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUBLIC: return createGithubwfRootOnOneOf2Public();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST: return createGithubwfRootOnOneOf2Pull_request();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TYPES: return createGithubwfRootOnOneOf2Pull_requestTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TYPES_ITEMS: return createGithubwfRootOnOneOf2Pull_requestTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_PATTERN_PROPERTIES0: return createGithubwfRootOnOneOf2Pull_requestPatternProperties0();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW: return createGithubwfRootOnOneOf2Pull_request_review();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW_TYPES: return createGithubwfRootOnOneOf2Pull_request_reviewTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW_TYPES_ITEMS: return createGithubwfRootOnOneOf2Pull_request_reviewTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW_COMMENT: return createGithubwfRootOnOneOf2Pull_request_review_comment();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW_COMMENT_TYPES: return createGithubwfRootOnOneOf2Pull_request_review_commentTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_REVIEW_COMMENT_TYPES_ITEMS: return createGithubwfRootOnOneOf2Pull_request_review_commentTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET: return createGithubwfRootOnOneOf2Pull_request_target();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_TYPES: return createGithubwfRootOnOneOf2Pull_request_targetTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_TYPES_ITEMS: return createGithubwfRootOnOneOf2Pull_request_targetTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0: return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH: return createGithubwfRootOnOneOf2Push();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0: return createGithubwfRootOnOneOf2PushPatternProperties0();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PUSH_PATTERN_PROPERTIES0_ITEMS: return createGithubwfRootOnOneOf2PushPatternProperties0Items();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REGISTRY_PACKAGE: return createGithubwfRootOnOneOf2Registry_package();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REGISTRY_PACKAGE_TYPES: return createGithubwfRootOnOneOf2Registry_packageTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REGISTRY_PACKAGE_TYPES_ITEMS: return createGithubwfRootOnOneOf2Registry_packageTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_RELEASE: return createGithubwfRootOnOneOf2Release();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_RELEASE_TYPES: return createGithubwfRootOnOneOf2ReleaseTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_RELEASE_TYPES_ITEMS: return createGithubwfRootOnOneOf2ReleaseTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_STATUS: return createGithubwfRootOnOneOf2Status();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WATCH: return createGithubwfRootOnOneOf2Watch();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL: return createGithubwfRootOnOneOf2Workflow_call();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS: return createGithubwfRootOnOneOf2Workflow_callInputs();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0: return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DESCRIPTION: return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Description();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEPRECATION_MESSAGE: return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_REQUIRED: return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_TYPE: return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT: return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS: return createGithubwfRootOnOneOf2Workflow_callSecrets();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_DESCRIPTION: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Description();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH: return createGithubwfRootOnOneOf2Workflow_dispatch();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS: return createGithubwfRootOnOneOf2Workflow_dispatchInputs();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DESCRIPTION: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Description();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEPRECATION_MESSAGE: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessage();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_REQUIRED: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Required();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_TYPE: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_OPTIONS: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_OPTIONS_ITEMS: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_DEFAULT: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_ELSE: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_ELSE_DEFAULT: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_IF: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_IF_TYPE: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_THEN: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN: return createGithubwfRootOnOneOf2Workflow_run();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_TYPES: return createGithubwfRootOnOneOf2Workflow_runTypes();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_TYPES_ITEMS: return createGithubwfRootOnOneOf2Workflow_runTypesItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_WORKFLOWS: return createGithubwfRootOnOneOf2Workflow_runWorkflows();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_WORKFLOWS_ITEMS: return createGithubwfRootOnOneOf2Workflow_runWorkflowsItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_PATTERN_PROPERTIES0: return createGithubwfRootOnOneOf2Workflow_runPatternProperties0();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_REPOSITORY_DISPATCH: return createGithubwfRootOnOneOf2Repository_dispatch();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE: return createGithubwfRootOnOneOf2Schedule();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS: return createGithubwfRootOnOneOf2ScheduleItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_CRON: return createGithubwfRootOnOneOf2ScheduleItemsCron();
			case GithubwfPackage.GITHUBWF_ROOT_ENV: return createGithubwfRootEnv();
			case GithubwfPackage.GITHUBWF_ROOT_DEFAULTS: return createGithubwfRootDefaults();
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY: return createGithubwfRootConcurrency();
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY_ONE_OF0: return createGithubwfRootConcurrencyOneOf0();
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY_ONE_OF1: return createGithubwfRootConcurrencyOneOf1();
			case GithubwfPackage.GITHUBWF_ROOT_JOBS: return createGithubwfRootJobs();
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0: return createGithubwfRootJobsPatternProperties0();
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_ONE_OF0: return createGithubwfRootJobsPatternProperties0OneOf0();
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_ONE_OF1: return createGithubwfRootJobsPatternProperties0OneOf1();
			case GithubwfPackage.GITHUBWF_ROOT_RUN_45NAME: return createGithubwfRootRun_45name();
			case GithubwfPackage.GITHUBWF_ROOT_PERMISSIONS: return createGithubwfRootPermissions();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TUPLE: return createNormalJobRuns_45onOneOf1AnyOf0Tuple();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TUPLE: return createNormalJobRuns_45onOneOf1AnyOf1Tuple();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TUPLE: return createNormalJobRuns_45onOneOf1AnyOf2Tuple();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF3_TUPLE: return createNormalJobRuns_45onOneOf1AnyOf3Tuple();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_TUPLE: return createNormalJobRuns_45onOneOf1AnyOf4Tuple();
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_STRING: return createConcurrencyCancel_45in_45progressTypeString();
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_INTEGER: return createConcurrencyCancel_45in_45progressTypeInteger();
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_NUMBER: return createConcurrencyCancel_45in_45progressTypeNumber();
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_BOOLEAN: return createConcurrencyCancel_45in_45progressTypeBoolean();
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_OBJECT: return createConcurrencyCancel_45in_45progressTypeObject();
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_ADDITIONAL_PROPERTIES: return createConcurrencyCancel_45in_45progressAdditionalProperties();
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_ARRAY: return createConcurrencyCancel_45in_45progressTypeArray();
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_ITEMS: return createConcurrencyCancel_45in_45progressItems();
			case GithubwfPackage.CONCURRENCY_CANCEL_45IN_45PROGRESS_TYPE_NULL: return createConcurrencyCancel_45in_45progressTypeNull();
			case GithubwfPackage.CONFIGURATION_TYPE_STRING: return createConfigurationTypeString();
			case GithubwfPackage.CONFIGURATION_TYPE_INTEGER: return createConfigurationTypeInteger();
			case GithubwfPackage.CONFIGURATION_TYPE_NUMBER: return createConfigurationTypeNumber();
			case GithubwfPackage.CONFIGURATION_TYPE_BOOLEAN: return createConfigurationTypeBoolean();
			case GithubwfPackage.CONFIGURATION_TYPE_OBJECT: return createConfigurationTypeObject();
			case GithubwfPackage.CONFIGURATION_ADDITIONAL_PROPERTIES: return createConfigurationAdditionalProperties();
			case GithubwfPackage.CONFIGURATION_TYPE_ARRAY: return createConfigurationTypeArray();
			case GithubwfPackage.CONFIGURATION_ITEMS: return createConfigurationItems();
			case GithubwfPackage.CONFIGURATION_TYPE_NULL: return createConfigurationTypeNull();
			case GithubwfPackage.CONTAINER_CREDENTIALS_ADDITIONAL_PROPERTIES: return createContainerCredentialsAdditionalProperties();
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_TYPE_STRING: return createContainerPortsItemsTypeString();
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_TYPE_INTEGER: return createContainerPortsItemsTypeInteger();
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_TYPE_NUMBER: return createContainerPortsItemsTypeNumber();
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_TYPE_BOOLEAN: return createContainerPortsItemsTypeBoolean();
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_TYPE_OBJECT: return createContainerPortsItemsTypeObject();
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_ADDITIONAL_PROPERTIES: return createContainerPortsItemsAdditionalProperties();
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_TYPE_ARRAY: return createContainerPortsItemsTypeArray();
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_ITEMS: return createContainerPortsItemsItems();
			case GithubwfPackage.CONTAINER_PORTS_ITEMS_TYPE_NULL: return createContainerPortsItemsTypeNull();
			case GithubwfPackage.PERMISSIONS_TYPE_STRING: return createPermissionsTypeString();
			case GithubwfPackage.PERMISSIONS_TYPE_INTEGER: return createPermissionsTypeInteger();
			case GithubwfPackage.PERMISSIONS_TYPE_NUMBER: return createPermissionsTypeNumber();
			case GithubwfPackage.PERMISSIONS_TYPE_BOOLEAN: return createPermissionsTypeBoolean();
			case GithubwfPackage.PERMISSIONS_TYPE_OBJECT: return createPermissionsTypeObject();
			case GithubwfPackage.PERMISSIONS_ADDITIONAL_PROPERTIES: return createPermissionsAdditionalProperties();
			case GithubwfPackage.PERMISSIONS_TYPE_ARRAY: return createPermissionsTypeArray();
			case GithubwfPackage.PERMISSIONS_ITEMS: return createPermissionsItems();
			case GithubwfPackage.PERMISSIONS_TYPE_NULL: return createPermissionsTypeNull();
			case GithubwfPackage.ENV_TYPE_STRING: return createEnvTypeString();
			case GithubwfPackage.ENV_TYPE_INTEGER: return createEnvTypeInteger();
			case GithubwfPackage.ENV_TYPE_NUMBER: return createEnvTypeNumber();
			case GithubwfPackage.ENV_TYPE_BOOLEAN: return createEnvTypeBoolean();
			case GithubwfPackage.ENV_TYPE_OBJECT: return createEnvTypeObject();
			case GithubwfPackage.ENV_ADDITIONAL_PROPERTIES: return createEnvAdditionalProperties();
			case GithubwfPackage.ENV_TYPE_ARRAY: return createEnvTypeArray();
			case GithubwfPackage.ENV_ITEMS: return createEnvItems();
			case GithubwfPackage.ENV_TYPE_NULL: return createEnvTypeNull();
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_STRING: return createEnvOneOf0AdditionalPropertiesTypeString();
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_INTEGER: return createEnvOneOf0AdditionalPropertiesTypeInteger();
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_NUMBER: return createEnvOneOf0AdditionalPropertiesTypeNumber();
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_BOOLEAN: return createEnvOneOf0AdditionalPropertiesTypeBoolean();
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_OBJECT: return createEnvOneOf0AdditionalPropertiesTypeObject();
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_ADDITIONAL_PROPERTIES: return createEnvOneOf0AdditionalPropertiesAdditionalProperties();
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_ARRAY: return createEnvOneOf0AdditionalPropertiesTypeArray();
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_ITEMS: return createEnvOneOf0AdditionalPropertiesItems();
			case GithubwfPackage.ENV_ONE_OF0_ADDITIONAL_PROPERTIES_TYPE_NULL: return createEnvOneOf0AdditionalPropertiesTypeNull();
			case GithubwfPackage.EVENT_OBJECT_TYPE_STRING: return createEventObjectTypeString();
			case GithubwfPackage.EVENT_OBJECT_TYPE_INTEGER: return createEventObjectTypeInteger();
			case GithubwfPackage.EVENT_OBJECT_TYPE_NUMBER: return createEventObjectTypeNumber();
			case GithubwfPackage.EVENT_OBJECT_TYPE_BOOLEAN: return createEventObjectTypeBoolean();
			case GithubwfPackage.EVENT_OBJECT_TYPE_OBJECT: return createEventObjectTypeObject();
			case GithubwfPackage.EVENT_OBJECT_TYPE_ARRAY: return createEventObjectTypeArray();
			case GithubwfPackage.EVENT_OBJECT_ITEMS: return createEventObjectItems();
			case GithubwfPackage.EVENT_OBJECT_TYPE_NULL: return createEventObjectTypeNull();
			case GithubwfPackage.EVENT_OBJECT_ONE_OF0_ADDITIONAL_PROPERTIES: return createEventObjectOneOf0AdditionalProperties();
			case GithubwfPackage.REF_TYPE_STRING: return createRefTypeString();
			case GithubwfPackage.REF_TYPE_INTEGER: return createRefTypeInteger();
			case GithubwfPackage.REF_TYPE_NUMBER: return createRefTypeNumber();
			case GithubwfPackage.REF_TYPE_BOOLEAN: return createRefTypeBoolean();
			case GithubwfPackage.REF_TYPE_OBJECT: return createRefTypeObject();
			case GithubwfPackage.REF_ADDITIONAL_PROPERTIES: return createRefAdditionalProperties();
			case GithubwfPackage.REF_TYPE_ARRAY: return createRefTypeArray();
			case GithubwfPackage.REF_ITEMS: return createRefItems();
			case GithubwfPackage.REF_TYPE_NULL: return createRefTypeNull();
			case GithubwfPackage.REF_ONE_OF0_ADDITIONAL_PROPERTIES: return createRefOneOf0AdditionalProperties();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_TYPE_STRING: return createRefOneOf0AllOf0TypeString();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_TYPE_INTEGER: return createRefOneOf0AllOf0TypeInteger();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_TYPE_NUMBER: return createRefOneOf0AllOf0TypeNumber();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_TYPE_BOOLEAN: return createRefOneOf0AllOf0TypeBoolean();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_TYPE_OBJECT: return createRefOneOf0AllOf0TypeObject();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_ADDITIONAL_PROPERTIES: return createRefOneOf0AllOf0AdditionalProperties();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_TYPE_ARRAY: return createRefOneOf0AllOf0TypeArray();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_ITEMS: return createRefOneOf0AllOf0Items();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_TYPE_NULL: return createRefOneOf0AllOf0TypeNull();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_NOT_TYPE_STRING: return createRefOneOf0AllOf0NotTypeString();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_NOT_TYPE_INTEGER: return createRefOneOf0AllOf0NotTypeInteger();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_NOT_TYPE_NUMBER: return createRefOneOf0AllOf0NotTypeNumber();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_NOT_TYPE_BOOLEAN: return createRefOneOf0AllOf0NotTypeBoolean();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_NOT_TYPE_OBJECT: return createRefOneOf0AllOf0NotTypeObject();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_NOT_ADDITIONAL_PROPERTIES: return createRefOneOf0AllOf0NotAdditionalProperties();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_NOT_TYPE_ARRAY: return createRefOneOf0AllOf0NotTypeArray();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_NOT_ITEMS: return createRefOneOf0AllOf0NotItems();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF0_NOT_TYPE_NULL: return createRefOneOf0AllOf0NotTypeNull();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_TYPE_STRING: return createRefOneOf0AllOf1TypeString();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_TYPE_INTEGER: return createRefOneOf0AllOf1TypeInteger();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_TYPE_NUMBER: return createRefOneOf0AllOf1TypeNumber();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_TYPE_BOOLEAN: return createRefOneOf0AllOf1TypeBoolean();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_TYPE_OBJECT: return createRefOneOf0AllOf1TypeObject();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_ADDITIONAL_PROPERTIES: return createRefOneOf0AllOf1AdditionalProperties();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_TYPE_ARRAY: return createRefOneOf0AllOf1TypeArray();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_ITEMS: return createRefOneOf0AllOf1Items();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_TYPE_NULL: return createRefOneOf0AllOf1TypeNull();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_NOT_TYPE_STRING: return createRefOneOf0AllOf1NotTypeString();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_NOT_TYPE_INTEGER: return createRefOneOf0AllOf1NotTypeInteger();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_NOT_TYPE_NUMBER: return createRefOneOf0AllOf1NotTypeNumber();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_NOT_TYPE_BOOLEAN: return createRefOneOf0AllOf1NotTypeBoolean();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_NOT_TYPE_OBJECT: return createRefOneOf0AllOf1NotTypeObject();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_NOT_ADDITIONAL_PROPERTIES: return createRefOneOf0AllOf1NotAdditionalProperties();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_NOT_TYPE_ARRAY: return createRefOneOf0AllOf1NotTypeArray();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_NOT_ITEMS: return createRefOneOf0AllOf1NotItems();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF1_NOT_TYPE_NULL: return createRefOneOf0AllOf1NotTypeNull();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_TYPE_STRING: return createRefOneOf0AllOf2TypeString();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_TYPE_INTEGER: return createRefOneOf0AllOf2TypeInteger();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_TYPE_NUMBER: return createRefOneOf0AllOf2TypeNumber();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_TYPE_BOOLEAN: return createRefOneOf0AllOf2TypeBoolean();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_TYPE_OBJECT: return createRefOneOf0AllOf2TypeObject();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_ADDITIONAL_PROPERTIES: return createRefOneOf0AllOf2AdditionalProperties();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_TYPE_ARRAY: return createRefOneOf0AllOf2TypeArray();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_ITEMS: return createRefOneOf0AllOf2Items();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_TYPE_NULL: return createRefOneOf0AllOf2TypeNull();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_NOT_TYPE_STRING: return createRefOneOf0AllOf2NotTypeString();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_NOT_TYPE_INTEGER: return createRefOneOf0AllOf2NotTypeInteger();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_NOT_TYPE_NUMBER: return createRefOneOf0AllOf2NotTypeNumber();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_NOT_TYPE_BOOLEAN: return createRefOneOf0AllOf2NotTypeBoolean();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_NOT_TYPE_OBJECT: return createRefOneOf0AllOf2NotTypeObject();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_NOT_ADDITIONAL_PROPERTIES: return createRefOneOf0AllOf2NotAdditionalProperties();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_NOT_TYPE_ARRAY: return createRefOneOf0AllOf2NotTypeArray();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_NOT_ITEMS: return createRefOneOf0AllOf2NotItems();
			case GithubwfPackage.REF_ONE_OF0_ALL_OF2_NOT_TYPE_NULL: return createRefOneOf0AllOf2NotTypeNull();
			case GithubwfPackage.SHELL_TYPE_STRING: return createShellTypeString();
			case GithubwfPackage.SHELL_TYPE_INTEGER: return createShellTypeInteger();
			case GithubwfPackage.SHELL_TYPE_NUMBER: return createShellTypeNumber();
			case GithubwfPackage.SHELL_TYPE_BOOLEAN: return createShellTypeBoolean();
			case GithubwfPackage.SHELL_TYPE_OBJECT: return createShellTypeObject();
			case GithubwfPackage.SHELL_ADDITIONAL_PROPERTIES: return createShellAdditionalProperties();
			case GithubwfPackage.SHELL_TYPE_ARRAY: return createShellTypeArray();
			case GithubwfPackage.SHELL_ITEMS: return createShellItems();
			case GithubwfPackage.SHELL_TYPE_NULL: return createShellTypeNull();
			case GithubwfPackage.TYPES_ITEMS: return createTypesItems();
			case GithubwfPackage.JOB_NEEDS_TYPE_STRING: return createJobNeedsTypeString();
			case GithubwfPackage.JOB_NEEDS_TYPE_INTEGER: return createJobNeedsTypeInteger();
			case GithubwfPackage.JOB_NEEDS_TYPE_NUMBER: return createJobNeedsTypeNumber();
			case GithubwfPackage.JOB_NEEDS_TYPE_BOOLEAN: return createJobNeedsTypeBoolean();
			case GithubwfPackage.JOB_NEEDS_TYPE_OBJECT: return createJobNeedsTypeObject();
			case GithubwfPackage.JOB_NEEDS_ADDITIONAL_PROPERTIES: return createJobNeedsAdditionalProperties();
			case GithubwfPackage.JOB_NEEDS_TYPE_ARRAY: return createJobNeedsTypeArray();
			case GithubwfPackage.JOB_NEEDS_ITEMS: return createJobNeedsItems();
			case GithubwfPackage.JOB_NEEDS_TYPE_NULL: return createJobNeedsTypeNull();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_IF_TYPE_BOOLEAN: return createReusableWorkflowCallJobIfTypeBoolean();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_IF_TYPE_NUMBER: return createReusableWorkflowCallJobIfTypeNumber();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_IF_TYPE_STRING: return createReusableWorkflowCallJobIfTypeString();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_TYPE_STRING: return createReusableWorkflowCallJobSecretsTypeString();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_TYPE_INTEGER: return createReusableWorkflowCallJobSecretsTypeInteger();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_TYPE_NUMBER: return createReusableWorkflowCallJobSecretsTypeNumber();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_TYPE_BOOLEAN: return createReusableWorkflowCallJobSecretsTypeBoolean();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_TYPE_OBJECT: return createReusableWorkflowCallJobSecretsTypeObject();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_ADDITIONAL_PROPERTIES: return createReusableWorkflowCallJobSecretsAdditionalProperties();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_TYPE_ARRAY: return createReusableWorkflowCallJobSecretsTypeArray();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_ITEMS: return createReusableWorkflowCallJobSecretsItems();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_SECRETS_TYPE_NULL: return createReusableWorkflowCallJobSecretsTypeNull();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_STRING: return createReusableWorkflowCallJobStrategyMatrixTypeString();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_INTEGER: return createReusableWorkflowCallJobStrategyMatrixTypeInteger();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_NUMBER: return createReusableWorkflowCallJobStrategyMatrixTypeNumber();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_BOOLEAN: return createReusableWorkflowCallJobStrategyMatrixTypeBoolean();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_OBJECT: return createReusableWorkflowCallJobStrategyMatrixTypeObject();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_ARRAY: return createReusableWorkflowCallJobStrategyMatrixTypeArray();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ITEMS: return createReusableWorkflowCallJobStrategyMatrixItems();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_TYPE_NULL: return createReusableWorkflowCallJobStrategyMatrixTypeNull();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ONE_OF0_ADDITIONAL_PROPERTIES: return createReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_STRING: return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_INTEGER: return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_NUMBER: return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_BOOLEAN: return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_OBJECT: return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ADDITIONAL_PROPERTIES: return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_ARRAY: return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ITEMS: return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_NULL: return createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_TYPE_STRING: return createReusableWorkflowCallJobConcurrencyTypeString();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_TYPE_INTEGER: return createReusableWorkflowCallJobConcurrencyTypeInteger();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_TYPE_NUMBER: return createReusableWorkflowCallJobConcurrencyTypeNumber();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_TYPE_BOOLEAN: return createReusableWorkflowCallJobConcurrencyTypeBoolean();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_TYPE_OBJECT: return createReusableWorkflowCallJobConcurrencyTypeObject();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_ADDITIONAL_PROPERTIES: return createReusableWorkflowCallJobConcurrencyAdditionalProperties();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_TYPE_ARRAY: return createReusableWorkflowCallJobConcurrencyTypeArray();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_ITEMS: return createReusableWorkflowCallJobConcurrencyItems();
			case GithubwfPackage.REUSABLE_WORKFLOW_CALL_JOB_CONCURRENCY_TYPE_NULL: return createReusableWorkflowCallJobConcurrencyTypeNull();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_STRING: return createNormalJobRuns_45onTypeString();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_INTEGER: return createNormalJobRuns_45onTypeInteger();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_NUMBER: return createNormalJobRuns_45onTypeNumber();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_BOOLEAN: return createNormalJobRuns_45onTypeBoolean();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_OBJECT: return createNormalJobRuns_45onTypeObject();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ADDITIONAL_PROPERTIES: return createNormalJobRuns_45onAdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_ARRAY: return createNormalJobRuns_45onTypeArray();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ITEMS: return createNormalJobRuns_45onItems();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_TYPE_NULL: return createNormalJobRuns_45onTypeNull();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ITEMS: return createNormalJobRuns_45onOneOf1Items();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_STRING: return createNormalJobRuns_45onOneOf1AnyOf0TypeString();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_INTEGER: return createNormalJobRuns_45onOneOf1AnyOf0TypeInteger();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_NUMBER: return createNormalJobRuns_45onOneOf1AnyOf0TypeNumber();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_BOOLEAN: return createNormalJobRuns_45onOneOf1AnyOf0TypeBoolean();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_OBJECT: return createNormalJobRuns_45onOneOf1AnyOf0TypeObject();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_ADDITIONAL_PROPERTIES: return createNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_ARRAY: return createNormalJobRuns_45onOneOf1AnyOf0TypeArray();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF0_TYPE_NULL: return createNormalJobRuns_45onOneOf1AnyOf0TypeNull();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_STRING: return createNormalJobRuns_45onOneOf1AnyOf1TypeString();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_INTEGER: return createNormalJobRuns_45onOneOf1AnyOf1TypeInteger();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_NUMBER: return createNormalJobRuns_45onOneOf1AnyOf1TypeNumber();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_BOOLEAN: return createNormalJobRuns_45onOneOf1AnyOf1TypeBoolean();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_OBJECT: return createNormalJobRuns_45onOneOf1AnyOf1TypeObject();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_ADDITIONAL_PROPERTIES: return createNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_ARRAY: return createNormalJobRuns_45onOneOf1AnyOf1TypeArray();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF1_TYPE_NULL: return createNormalJobRuns_45onOneOf1AnyOf1TypeNull();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TYPE_STRING: return createNormalJobRuns_45onOneOf1AnyOf2TypeString();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TYPE_INTEGER: return createNormalJobRuns_45onOneOf1AnyOf2TypeInteger();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TYPE_NUMBER: return createNormalJobRuns_45onOneOf1AnyOf2TypeNumber();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TYPE_BOOLEAN: return createNormalJobRuns_45onOneOf1AnyOf2TypeBoolean();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TYPE_OBJECT: return createNormalJobRuns_45onOneOf1AnyOf2TypeObject();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_ADDITIONAL_PROPERTIES: return createNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TYPE_ARRAY: return createNormalJobRuns_45onOneOf1AnyOf2TypeArray();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF2_TYPE_NULL: return createNormalJobRuns_45onOneOf1AnyOf2TypeNull();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF3_TYPE_STRING: return createNormalJobRuns_45onOneOf1AnyOf3TypeString();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF3_TYPE_INTEGER: return createNormalJobRuns_45onOneOf1AnyOf3TypeInteger();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF3_TYPE_NUMBER: return createNormalJobRuns_45onOneOf1AnyOf3TypeNumber();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF3_TYPE_BOOLEAN: return createNormalJobRuns_45onOneOf1AnyOf3TypeBoolean();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF3_TYPE_OBJECT: return createNormalJobRuns_45onOneOf1AnyOf3TypeObject();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF3_ADDITIONAL_PROPERTIES: return createNormalJobRuns_45onOneOf1AnyOf3AdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF3_TYPE_ARRAY: return createNormalJobRuns_45onOneOf1AnyOf3TypeArray();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF3_TYPE_NULL: return createNormalJobRuns_45onOneOf1AnyOf3TypeNull();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_TYPE_STRING: return createNormalJobRuns_45onOneOf1AnyOf4TypeString();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_TYPE_INTEGER: return createNormalJobRuns_45onOneOf1AnyOf4TypeInteger();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_TYPE_NUMBER: return createNormalJobRuns_45onOneOf1AnyOf4TypeNumber();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_TYPE_BOOLEAN: return createNormalJobRuns_45onOneOf1AnyOf4TypeBoolean();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_TYPE_OBJECT: return createNormalJobRuns_45onOneOf1AnyOf4TypeObject();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_ADDITIONAL_PROPERTIES: return createNormalJobRuns_45onOneOf1AnyOf4AdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_TYPE_ARRAY: return createNormalJobRuns_45onOneOf1AnyOf4TypeArray();
			case GithubwfPackage.NORMAL_JOB_RUNS_45ON_ONE_OF1_ANY_OF4_TYPE_NULL: return createNormalJobRuns_45onOneOf1AnyOf4TypeNull();
			case GithubwfPackage.NORMAL_JOB_ENVIRONMENT_TYPE_STRING: return createNormalJobEnvironmentTypeString();
			case GithubwfPackage.NORMAL_JOB_ENVIRONMENT_TYPE_INTEGER: return createNormalJobEnvironmentTypeInteger();
			case GithubwfPackage.NORMAL_JOB_ENVIRONMENT_TYPE_NUMBER: return createNormalJobEnvironmentTypeNumber();
			case GithubwfPackage.NORMAL_JOB_ENVIRONMENT_TYPE_BOOLEAN: return createNormalJobEnvironmentTypeBoolean();
			case GithubwfPackage.NORMAL_JOB_ENVIRONMENT_TYPE_OBJECT: return createNormalJobEnvironmentTypeObject();
			case GithubwfPackage.NORMAL_JOB_ENVIRONMENT_ADDITIONAL_PROPERTIES: return createNormalJobEnvironmentAdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_ENVIRONMENT_TYPE_ARRAY: return createNormalJobEnvironmentTypeArray();
			case GithubwfPackage.NORMAL_JOB_ENVIRONMENT_ITEMS: return createNormalJobEnvironmentItems();
			case GithubwfPackage.NORMAL_JOB_ENVIRONMENT_TYPE_NULL: return createNormalJobEnvironmentTypeNull();
			case GithubwfPackage.NORMAL_JOB_IF_TYPE_BOOLEAN: return createNormalJobIfTypeBoolean();
			case GithubwfPackage.NORMAL_JOB_IF_TYPE_NUMBER: return createNormalJobIfTypeNumber();
			case GithubwfPackage.NORMAL_JOB_IF_TYPE_STRING: return createNormalJobIfTypeString();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_TYPE_STRING: return createNormalJobStepsItemsTypeString();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_TYPE_INTEGER: return createNormalJobStepsItemsTypeInteger();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_TYPE_NUMBER: return createNormalJobStepsItemsTypeNumber();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_TYPE_BOOLEAN: return createNormalJobStepsItemsTypeBoolean();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_TYPE_OBJECT: return createNormalJobStepsItemsTypeObject();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ADDITIONAL_PROPERTIES: return createNormalJobStepsItemsAdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_TYPE_ARRAY: return createNormalJobStepsItemsTypeArray();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ITEMS: return createNormalJobStepsItemsItems();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_TYPE_NULL: return createNormalJobStepsItemsTypeNull();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_TYPE_STRING: return createNormalJobStepsItemsAllOf0TypeString();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_TYPE_INTEGER: return createNormalJobStepsItemsAllOf0TypeInteger();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_TYPE_NUMBER: return createNormalJobStepsItemsAllOf0TypeNumber();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_TYPE_BOOLEAN: return createNormalJobStepsItemsAllOf0TypeBoolean();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_TYPE_OBJECT: return createNormalJobStepsItemsAllOf0TypeObject();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_ADDITIONAL_PROPERTIES: return createNormalJobStepsItemsAllOf0AdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_TYPE_ARRAY: return createNormalJobStepsItemsAllOf0TypeArray();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_ITEMS: return createNormalJobStepsItemsAllOf0Items();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_TYPE_NULL: return createNormalJobStepsItemsAllOf0TypeNull();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_ONE_OF0_ADDITIONAL_PROPERTIES: return createNormalJobStepsItemsAllOf0OneOf0AdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF0_ONE_OF1_ADDITIONAL_PROPERTIES: return createNormalJobStepsItemsAllOf0OneOf1AdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_IF_TYPE_BOOLEAN: return createNormalJobStepsItemsAllOf1IfTypeBoolean();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_IF_TYPE_NUMBER: return createNormalJobStepsItemsAllOf1IfTypeNumber();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_IF_TYPE_STRING: return createNormalJobStepsItemsAllOf1IfTypeString();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_TYPE_STRING: return createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_TYPE_INTEGER: return createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_TYPE_NUMBER: return createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_TYPE_BOOLEAN: return createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_TYPE_OBJECT: return createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_ADDITIONAL_PROPERTIES: return createNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_TYPE_ARRAY: return createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_ITEMS: return createNormalJobStepsItemsAllOf1Continue_45on_45errorItems();
			case GithubwfPackage.NORMAL_JOB_STEPS_ITEMS_ALL_OF1_CONTINUE_45ON_45ERROR_TYPE_NULL: return createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_TYPE_STRING: return createNormalJobStrategyMatrixTypeString();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_TYPE_INTEGER: return createNormalJobStrategyMatrixTypeInteger();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_TYPE_NUMBER: return createNormalJobStrategyMatrixTypeNumber();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_TYPE_BOOLEAN: return createNormalJobStrategyMatrixTypeBoolean();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_TYPE_OBJECT: return createNormalJobStrategyMatrixTypeObject();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_TYPE_ARRAY: return createNormalJobStrategyMatrixTypeArray();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ITEMS: return createNormalJobStrategyMatrixItems();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_TYPE_NULL: return createNormalJobStrategyMatrixTypeNull();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ONE_OF0_ADDITIONAL_PROPERTIES: return createNormalJobStrategyMatrixOneOf0AdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_STRING: return createNormalJobStrategyMatrixAdditionalPropertiesTypeString();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_INTEGER: return createNormalJobStrategyMatrixAdditionalPropertiesTypeInteger();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_NUMBER: return createNormalJobStrategyMatrixAdditionalPropertiesTypeNumber();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_BOOLEAN: return createNormalJobStrategyMatrixAdditionalPropertiesTypeBoolean();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_OBJECT: return createNormalJobStrategyMatrixAdditionalPropertiesTypeObject();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ADDITIONAL_PROPERTIES: return createNormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_ARRAY: return createNormalJobStrategyMatrixAdditionalPropertiesTypeArray();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_ITEMS: return createNormalJobStrategyMatrixAdditionalPropertiesItems();
			case GithubwfPackage.NORMAL_JOB_STRATEGY_MATRIX_ADDITIONAL_PROPERTIES_TYPE_NULL: return createNormalJobStrategyMatrixAdditionalPropertiesTypeNull();
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_STRING: return createNormalJobContinue_45on_45errorTypeString();
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_INTEGER: return createNormalJobContinue_45on_45errorTypeInteger();
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_NUMBER: return createNormalJobContinue_45on_45errorTypeNumber();
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_BOOLEAN: return createNormalJobContinue_45on_45errorTypeBoolean();
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_OBJECT: return createNormalJobContinue_45on_45errorTypeObject();
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_ADDITIONAL_PROPERTIES: return createNormalJobContinue_45on_45errorAdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_ARRAY: return createNormalJobContinue_45on_45errorTypeArray();
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_ITEMS: return createNormalJobContinue_45on_45errorItems();
			case GithubwfPackage.NORMAL_JOB_CONTINUE_45ON_45ERROR_TYPE_NULL: return createNormalJobContinue_45on_45errorTypeNull();
			case GithubwfPackage.NORMAL_JOB_CONTAINER_TYPE_STRING: return createNormalJobContainerTypeString();
			case GithubwfPackage.NORMAL_JOB_CONTAINER_TYPE_INTEGER: return createNormalJobContainerTypeInteger();
			case GithubwfPackage.NORMAL_JOB_CONTAINER_TYPE_NUMBER: return createNormalJobContainerTypeNumber();
			case GithubwfPackage.NORMAL_JOB_CONTAINER_TYPE_BOOLEAN: return createNormalJobContainerTypeBoolean();
			case GithubwfPackage.NORMAL_JOB_CONTAINER_TYPE_OBJECT: return createNormalJobContainerTypeObject();
			case GithubwfPackage.NORMAL_JOB_CONTAINER_ADDITIONAL_PROPERTIES: return createNormalJobContainerAdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_CONTAINER_TYPE_ARRAY: return createNormalJobContainerTypeArray();
			case GithubwfPackage.NORMAL_JOB_CONTAINER_ITEMS: return createNormalJobContainerItems();
			case GithubwfPackage.NORMAL_JOB_CONTAINER_TYPE_NULL: return createNormalJobContainerTypeNull();
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_STRING: return createNormalJobConcurrencyTypeString();
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_INTEGER: return createNormalJobConcurrencyTypeInteger();
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_NUMBER: return createNormalJobConcurrencyTypeNumber();
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_BOOLEAN: return createNormalJobConcurrencyTypeBoolean();
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_OBJECT: return createNormalJobConcurrencyTypeObject();
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_ADDITIONAL_PROPERTIES: return createNormalJobConcurrencyAdditionalProperties();
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_ARRAY: return createNormalJobConcurrencyTypeArray();
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_ITEMS: return createNormalJobConcurrencyItems();
			case GithubwfPackage.NORMAL_JOB_CONCURRENCY_TYPE_NULL: return createNormalJobConcurrencyTypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_TYPE_STRING: return createGithubwfRootOnTypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_TYPE_INTEGER: return createGithubwfRootOnTypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_TYPE_NUMBER: return createGithubwfRootOnTypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_TYPE_BOOLEAN: return createGithubwfRootOnTypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_TYPE_OBJECT: return createGithubwfRootOnTypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ADDITIONAL_PROPERTIES: return createGithubwfRootOnAdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_TYPE_ARRAY: return createGithubwfRootOnTypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ITEMS: return createGithubwfRootOnItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_TYPE_NULL: return createGithubwfRootOnTypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_PATTERN_PROPERTIES0_ITEMS: return createGithubwfRootOnOneOf2Pull_requestPatternProperties0Items();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0_TYPE_STRING: return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0_TYPE_INTEGER: return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0_TYPE_NUMBER: return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0_TYPE_OBJECT: return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0_ADDITIONAL_PROPERTIES: return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0_TYPE_ARRAY: return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0_ITEMS: return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0Items();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_PULL_REQUEST_TARGET_PATTERN_PROPERTIES0_TYPE_NULL: return createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_callTypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_INTEGER: return createGithubwfRootOnOneOf2Workflow_callTypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_callTypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_callTypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_OBJECT: return createGithubwfRootOnOneOf2Workflow_callTypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_ADDITIONAL_PROPERTIES: return createGithubwfRootOnOneOf2Workflow_callAdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_ARRAY: return createGithubwfRootOnOneOf2Workflow_callTypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_ITEMS: return createGithubwfRootOnOneOf2Workflow_callItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_TYPE_NULL: return createGithubwfRootOnOneOf2Workflow_callTypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_callSecretsTypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_TYPE_INTEGER: return createGithubwfRootOnOneOf2Workflow_callSecretsTypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_callSecretsTypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_TYPE_OBJECT: return createGithubwfRootOnOneOf2Workflow_callSecretsTypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_TYPE_ARRAY: return createGithubwfRootOnOneOf2Workflow_callSecretsTypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_ITEMS: return createGithubwfRootOnOneOf2Workflow_callSecretsItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_TYPE_NULL: return createGithubwfRootOnOneOf2Workflow_callSecretsTypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_INTEGER: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_OBJECT: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_ARRAY: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_ITEMS: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Items();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_TYPE_NULL: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_TYPE_INTEGER: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_TYPE_OBJECT: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_ADDITIONAL_PROPERTIES: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_TYPE_ARRAY: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_ITEMS: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_CALL_SECRETS_PATTERN_PROPERTIES0_REQUIRED_TYPE_NULL: return createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_dispatchTypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_INTEGER: return createGithubwfRootOnOneOf2Workflow_dispatchTypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_dispatchTypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_dispatchTypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_OBJECT: return createGithubwfRootOnOneOf2Workflow_dispatchTypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_ADDITIONAL_PROPERTIES: return createGithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_ARRAY: return createGithubwfRootOnOneOf2Workflow_dispatchTypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_ITEMS: return createGithubwfRootOnOneOf2Workflow_dispatchItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_TYPE_NULL: return createGithubwfRootOnOneOf2Workflow_dispatchTypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_INTEGER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_OBJECT: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_ADDITIONAL_PROPERTIES: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_ARRAY: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_ITEMS: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_DEFAULT_TYPE_NULL: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_TYPE_INTEGER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_TYPE_OBJECT: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_ADDITIONAL_PROPERTIES: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_TYPE_ARRAY: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_ITEMS: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Items();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_TYPE_NULL: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE_INTEGER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE_OBJECT: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_ADDITIONAL_PROPERTIES: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE_ARRAY: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_ITEMS: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_IF_TYPE_NULL: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_TYPE_INTEGER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_TYPE_OBJECT: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_ADDITIONAL_PROPERTIES: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_TYPE_ARRAY: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_ITEMS: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_THEN_TYPE_NULL: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_ELSE_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_ELSE_TYPE_INTEGER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_ELSE_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_ELSE_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_ELSE_TYPE_OBJECT: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_ELSE_ADDITIONAL_PROPERTIES: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_ELSE_TYPE_ARRAY: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_ELSE_ITEMS: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF0_ELSE_TYPE_NULL: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_TYPE_INTEGER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_TYPE_OBJECT: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_ADDITIONAL_PROPERTIES: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_TYPE_ARRAY: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_ITEMS: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_TYPE_NULL: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_IF_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_IF_TYPE_INTEGER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_IF_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_IF_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_IF_TYPE_OBJECT: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_IF_ADDITIONAL_PROPERTIES: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_IF_TYPE_ARRAY: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_IF_ITEMS: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_IF_TYPE_NULL: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_THEN_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_THEN_TYPE_INTEGER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_THEN_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_THEN_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_THEN_TYPE_OBJECT: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_THEN_ADDITIONAL_PROPERTIES: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_THEN_TYPE_ARRAY: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_THEN_ITEMS: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_DISPATCH_INPUTS_PATTERN_PROPERTIES0_ALL_OF1_THEN_TYPE_NULL: return createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_PATTERN_PROPERTIES0_TYPE_STRING: return createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_PATTERN_PROPERTIES0_TYPE_INTEGER: return createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_PATTERN_PROPERTIES0_TYPE_NUMBER: return createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_PATTERN_PROPERTIES0_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_PATTERN_PROPERTIES0_TYPE_OBJECT: return createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_PATTERN_PROPERTIES0_ADDITIONAL_PROPERTIES: return createGithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_PATTERN_PROPERTIES0_TYPE_ARRAY: return createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_PATTERN_PROPERTIES0_ITEMS: return createGithubwfRootOnOneOf2Workflow_runPatternProperties0Items();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_WORKFLOW_RUN_PATTERN_PROPERTIES0_TYPE_NULL: return createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_STRING: return createGithubwfRootOnOneOf2ScheduleItemsTypeString();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_INTEGER: return createGithubwfRootOnOneOf2ScheduleItemsTypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_NUMBER: return createGithubwfRootOnOneOf2ScheduleItemsTypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_BOOLEAN: return createGithubwfRootOnOneOf2ScheduleItemsTypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_OBJECT: return createGithubwfRootOnOneOf2ScheduleItemsTypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_ARRAY: return createGithubwfRootOnOneOf2ScheduleItemsTypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_ITEMS: return createGithubwfRootOnOneOf2ScheduleItemsItems();
			case GithubwfPackage.GITHUBWF_ROOT_ON_ONE_OF2_SCHEDULE_ITEMS_TYPE_NULL: return createGithubwfRootOnOneOf2ScheduleItemsTypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY_TYPE_STRING: return createGithubwfRootConcurrencyTypeString();
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY_TYPE_INTEGER: return createGithubwfRootConcurrencyTypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY_TYPE_NUMBER: return createGithubwfRootConcurrencyTypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY_TYPE_BOOLEAN: return createGithubwfRootConcurrencyTypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY_TYPE_OBJECT: return createGithubwfRootConcurrencyTypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY_ADDITIONAL_PROPERTIES: return createGithubwfRootConcurrencyAdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY_TYPE_ARRAY: return createGithubwfRootConcurrencyTypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY_ITEMS: return createGithubwfRootConcurrencyItems();
			case GithubwfPackage.GITHUBWF_ROOT_CONCURRENCY_TYPE_NULL: return createGithubwfRootConcurrencyTypeNull();
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_TYPE_STRING: return createGithubwfRootJobsPatternProperties0TypeString();
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_TYPE_INTEGER: return createGithubwfRootJobsPatternProperties0TypeInteger();
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_TYPE_NUMBER: return createGithubwfRootJobsPatternProperties0TypeNumber();
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_TYPE_BOOLEAN: return createGithubwfRootJobsPatternProperties0TypeBoolean();
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_TYPE_OBJECT: return createGithubwfRootJobsPatternProperties0TypeObject();
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_ADDITIONAL_PROPERTIES: return createGithubwfRootJobsPatternProperties0AdditionalProperties();
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_TYPE_ARRAY: return createGithubwfRootJobsPatternProperties0TypeArray();
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_ITEMS: return createGithubwfRootJobsPatternProperties0Items();
			case GithubwfPackage.GITHUBWF_ROOT_JOBS_PATTERN_PROPERTIES0_TYPE_NULL: return createGithubwfRootJobsPatternProperties0TypeNull();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObjectAdditionalProperties createEventObjectAdditionalProperties() {
		EventObjectAdditionalPropertiesImpl eventObjectAdditionalProperties = new EventObjectAdditionalPropertiesImpl();
		return eventObjectAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRoot createGithubwfRoot() {
		GithubwfRootImpl githubwfRoot = new GithubwfRootImpl();
		return githubwfRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Architecture createArchitecture() {
		ArchitectureImpl architecture = new ArchitectureImpl();
		return architecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Branch createBranch() {
		BranchImpl branch = new BranchImpl();
		return branch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Concurrency createConcurrency() {
		ConcurrencyImpl concurrency = new ConcurrencyImpl();
		return concurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyGroup createConcurrencyGroup() {
		ConcurrencyGroupImpl concurrencyGroup = new ConcurrencyGroupImpl();
		return concurrencyGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyCancel_45in_45progress createConcurrencyCancel_45in_45progress() {
		ConcurrencyCancel_45in_45progressImpl concurrencyCancel_45in_45progress = new ConcurrencyCancel_45in_45progressImpl();
		return concurrencyCancel_45in_45progress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyCancel_45in_45progressOneOf0 createConcurrencyCancel_45in_45progressOneOf0() {
		ConcurrencyCancel_45in_45progressOneOf0Impl concurrencyCancel_45in_45progressOneOf0 = new ConcurrencyCancel_45in_45progressOneOf0Impl();
		return concurrencyCancel_45in_45progressOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyCancel_45in_45progressOneOf1 createConcurrencyCancel_45in_45progressOneOf1() {
		ConcurrencyCancel_45in_45progressOneOf1Impl concurrencyCancel_45in_45progressOneOf1 = new ConcurrencyCancel_45in_45progressOneOf1Impl();
		return concurrencyCancel_45in_45progressOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationOneOf0 createConfigurationOneOf0() {
		ConfigurationOneOf0Impl configurationOneOf0 = new ConfigurationOneOf0Impl();
		return configurationOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationOneOf1 createConfigurationOneOf1() {
		ConfigurationOneOf1Impl configurationOneOf1 = new ConfigurationOneOf1Impl();
		return configurationOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationOneOf2 createConfigurationOneOf2() {
		ConfigurationOneOf2Impl configurationOneOf2 = new ConfigurationOneOf2Impl();
		return configurationOneOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationOneOf3 createConfigurationOneOf3() {
		ConfigurationOneOf3Impl configurationOneOf3 = new ConfigurationOneOf3Impl();
		return configurationOneOf3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationOneOf3AdditionalProperties createConfigurationOneOf3AdditionalProperties() {
		ConfigurationOneOf3AdditionalPropertiesImpl configurationOneOf3AdditionalProperties = new ConfigurationOneOf3AdditionalPropertiesImpl();
		return configurationOneOf3AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationOneOf4 createConfigurationOneOf4() {
		ConfigurationOneOf4Impl configurationOneOf4 = new ConfigurationOneOf4Impl();
		return configurationOneOf4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationOneOf4Items createConfigurationOneOf4Items() {
		ConfigurationOneOf4ItemsImpl configurationOneOf4Items = new ConfigurationOneOf4ItemsImpl();
		return configurationOneOf4Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public githubwf.Container createContainer() {
		ContainerImpl container = new ContainerImpl();
		return container;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerImage createContainerImage() {
		ContainerImageImpl containerImage = new ContainerImageImpl();
		return containerImage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerCredentials createContainerCredentials() {
		ContainerCredentialsImpl containerCredentials = new ContainerCredentialsImpl();
		return containerCredentials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerCredentialsUsername createContainerCredentialsUsername() {
		ContainerCredentialsUsernameImpl containerCredentialsUsername = new ContainerCredentialsUsernameImpl();
		return containerCredentialsUsername;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerCredentialsPassword createContainerCredentialsPassword() {
		ContainerCredentialsPasswordImpl containerCredentialsPassword = new ContainerCredentialsPasswordImpl();
		return containerCredentialsPassword;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerEnv createContainerEnv() {
		ContainerEnvImpl containerEnv = new ContainerEnvImpl();
		return containerEnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPorts createContainerPorts() {
		ContainerPortsImpl containerPorts = new ContainerPortsImpl();
		return containerPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPortsItems createContainerPortsItems() {
		ContainerPortsItemsImpl containerPortsItems = new ContainerPortsItemsImpl();
		return containerPortsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPortsItemsOneOf0 createContainerPortsItemsOneOf0() {
		ContainerPortsItemsOneOf0Impl containerPortsItemsOneOf0 = new ContainerPortsItemsOneOf0Impl();
		return containerPortsItemsOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPortsItemsOneOf1 createContainerPortsItemsOneOf1() {
		ContainerPortsItemsOneOf1Impl containerPortsItemsOneOf1 = new ContainerPortsItemsOneOf1Impl();
		return containerPortsItemsOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerVolumes createContainerVolumes() {
		ContainerVolumesImpl containerVolumes = new ContainerVolumesImpl();
		return containerVolumes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerVolumesItems createContainerVolumesItems() {
		ContainerVolumesItemsImpl containerVolumesItems = new ContainerVolumesItemsImpl();
		return containerVolumesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerOptions createContainerOptions() {
		ContainerOptionsImpl containerOptions = new ContainerOptionsImpl();
		return containerOptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Defaults createDefaults() {
		DefaultsImpl defaults = new DefaultsImpl();
		return defaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultsRun createDefaultsRun() {
		DefaultsRunImpl defaultsRun = new DefaultsRunImpl();
		return defaultsRun;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultsRunShell createDefaultsRunShell() {
		DefaultsRunShellImpl defaultsRunShell = new DefaultsRunShellImpl();
		return defaultsRunShell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DefaultsRunWorking_45directory createDefaultsRunWorking_45directory() {
		DefaultsRunWorking_45directoryImpl defaultsRunWorking_45directory = new DefaultsRunWorking_45directoryImpl();
		return defaultsRunWorking_45directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions createPermissions() {
		PermissionsImpl permissions = new PermissionsImpl();
		return permissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsOneOf0 createPermissionsOneOf0() {
		PermissionsOneOf0Impl permissionsOneOf0 = new PermissionsOneOf0Impl();
		return permissionsOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsOneOf1 createPermissionsOneOf1() {
		PermissionsOneOf1Impl permissionsOneOf1 = new PermissionsOneOf1Impl();
		return permissionsOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45event createPermissions_45event() {
		Permissions_45eventImpl permissions_45event = new Permissions_45eventImpl();
		return permissions_45event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45eventActions createPermissions_45eventActions() {
		Permissions_45eventActionsImpl permissions_45eventActions = new Permissions_45eventActionsImpl();
		return permissions_45eventActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45eventChecks createPermissions_45eventChecks() {
		Permissions_45eventChecksImpl permissions_45eventChecks = new Permissions_45eventChecksImpl();
		return permissions_45eventChecks;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45eventContents createPermissions_45eventContents() {
		Permissions_45eventContentsImpl permissions_45eventContents = new Permissions_45eventContentsImpl();
		return permissions_45eventContents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45eventDeployments createPermissions_45eventDeployments() {
		Permissions_45eventDeploymentsImpl permissions_45eventDeployments = new Permissions_45eventDeploymentsImpl();
		return permissions_45eventDeployments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45eventDiscussions createPermissions_45eventDiscussions() {
		Permissions_45eventDiscussionsImpl permissions_45eventDiscussions = new Permissions_45eventDiscussionsImpl();
		return permissions_45eventDiscussions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45eventId_45token createPermissions_45eventId_45token() {
		Permissions_45eventId_45tokenImpl permissions_45eventId_45token = new Permissions_45eventId_45tokenImpl();
		return permissions_45eventId_45token;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45eventIssues createPermissions_45eventIssues() {
		Permissions_45eventIssuesImpl permissions_45eventIssues = new Permissions_45eventIssuesImpl();
		return permissions_45eventIssues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45eventPackages createPermissions_45eventPackages() {
		Permissions_45eventPackagesImpl permissions_45eventPackages = new Permissions_45eventPackagesImpl();
		return permissions_45eventPackages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45eventPages createPermissions_45eventPages() {
		Permissions_45eventPagesImpl permissions_45eventPages = new Permissions_45eventPagesImpl();
		return permissions_45eventPages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45eventPull_45requests createPermissions_45eventPull_45requests() {
		Permissions_45eventPull_45requestsImpl permissions_45eventPull_45requests = new Permissions_45eventPull_45requestsImpl();
		return permissions_45eventPull_45requests;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45eventRepository_45projects createPermissions_45eventRepository_45projects() {
		Permissions_45eventRepository_45projectsImpl permissions_45eventRepository_45projects = new Permissions_45eventRepository_45projectsImpl();
		return permissions_45eventRepository_45projects;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45eventSecurity_45events createPermissions_45eventSecurity_45events() {
		Permissions_45eventSecurity_45eventsImpl permissions_45eventSecurity_45events = new Permissions_45eventSecurity_45eventsImpl();
		return permissions_45eventSecurity_45events;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45eventStatuses createPermissions_45eventStatuses() {
		Permissions_45eventStatusesImpl permissions_45eventStatuses = new Permissions_45eventStatusesImpl();
		return permissions_45eventStatuses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Permissions_45level createPermissions_45level() {
		Permissions_45levelImpl permissions_45level = new Permissions_45levelImpl();
		return permissions_45level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Env createEnv() {
		EnvImpl env = new EnvImpl();
		return env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf0 createEnvOneOf0() {
		EnvOneOf0Impl envOneOf0 = new EnvOneOf0Impl();
		return envOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf0AdditionalProperties createEnvOneOf0AdditionalProperties() {
		EnvOneOf0AdditionalPropertiesImpl envOneOf0AdditionalProperties = new EnvOneOf0AdditionalPropertiesImpl();
		return envOneOf0AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf0AdditionalPropertiesOneOf0 createEnvOneOf0AdditionalPropertiesOneOf0() {
		EnvOneOf0AdditionalPropertiesOneOf0Impl envOneOf0AdditionalPropertiesOneOf0 = new EnvOneOf0AdditionalPropertiesOneOf0Impl();
		return envOneOf0AdditionalPropertiesOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf0AdditionalPropertiesOneOf1 createEnvOneOf0AdditionalPropertiesOneOf1() {
		EnvOneOf0AdditionalPropertiesOneOf1Impl envOneOf0AdditionalPropertiesOneOf1 = new EnvOneOf0AdditionalPropertiesOneOf1Impl();
		return envOneOf0AdditionalPropertiesOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf0AdditionalPropertiesOneOf2 createEnvOneOf0AdditionalPropertiesOneOf2() {
		EnvOneOf0AdditionalPropertiesOneOf2Impl envOneOf0AdditionalPropertiesOneOf2 = new EnvOneOf0AdditionalPropertiesOneOf2Impl();
		return envOneOf0AdditionalPropertiesOneOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf1 createEnvOneOf1() {
		EnvOneOf1Impl envOneOf1 = new EnvOneOf1Impl();
		return envOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Environment createEnvironment() {
		EnvironmentImpl environment = new EnvironmentImpl();
		return environment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentName createEnvironmentName() {
		EnvironmentNameImpl environmentName = new EnvironmentNameImpl();
		return environmentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvironmentUrl createEnvironmentUrl() {
		EnvironmentUrlImpl environmentUrl = new EnvironmentUrlImpl();
		return environmentUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Event createEvent() {
		EventImpl event = new EventImpl();
		return event;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObject createEventObject() {
		EventObjectImpl eventObject = new EventObjectImpl();
		return eventObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObjectOneOf0 createEventObjectOneOf0() {
		EventObjectOneOf0Impl eventObjectOneOf0 = new EventObjectOneOf0Impl();
		return eventObjectOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObjectOneOf1 createEventObjectOneOf1() {
		EventObjectOneOf1Impl eventObjectOneOf1 = new EventObjectOneOf1Impl();
		return eventObjectOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ExpressionSyntax createExpressionSyntax() {
		ExpressionSyntaxImpl expressionSyntax = new ExpressionSyntaxImpl();
		return expressionSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StringContainingExpressionSyntax createStringContainingExpressionSyntax() {
		StringContainingExpressionSyntaxImpl stringContainingExpressionSyntax = new StringContainingExpressionSyntaxImpl();
		return stringContainingExpressionSyntax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Globs createGlobs() {
		GlobsImpl globs = new GlobsImpl();
		return globs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GlobsItems createGlobsItems() {
		GlobsItemsImpl globsItems = new GlobsItemsImpl();
		return globsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Machine createMachine() {
		MachineImpl machine = new MachineImpl();
		return machine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Name createName() {
		NameImpl name = new NameImpl();
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Path createPath() {
		PathImpl path = new PathImpl();
		return path;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Ref createRef() {
		RefImpl ref = new RefImpl();
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefBranches createRefBranches() {
		RefBranchesImpl refBranches = new RefBranchesImpl();
		return refBranches;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefBranches_45ignore createRefBranches_45ignore() {
		RefBranches_45ignoreImpl refBranches_45ignore = new RefBranches_45ignoreImpl();
		return refBranches_45ignore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefTags createRefTags() {
		RefTagsImpl refTags = new RefTagsImpl();
		return refTags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefTags_45ignore createRefTags_45ignore() {
		RefTags_45ignoreImpl refTags_45ignore = new RefTags_45ignoreImpl();
		return refTags_45ignore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefPaths createRefPaths() {
		RefPathsImpl refPaths = new RefPathsImpl();
		return refPaths;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefPaths_45ignore createRefPaths_45ignore() {
		RefPaths_45ignoreImpl refPaths_45ignore = new RefPaths_45ignoreImpl();
		return refPaths_45ignore;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0 createRefOneOf0() {
		RefOneOf0Impl refOneOf0 = new RefOneOf0Impl();
		return refOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0 createRefOneOf0AllOf0() {
		RefOneOf0AllOf0Impl refOneOf0AllOf0 = new RefOneOf0AllOf0Impl();
		return refOneOf0AllOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0Not createRefOneOf0AllOf0Not() {
		RefOneOf0AllOf0NotImpl refOneOf0AllOf0Not = new RefOneOf0AllOf0NotImpl();
		return refOneOf0AllOf0Not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1 createRefOneOf0AllOf1() {
		RefOneOf0AllOf1Impl refOneOf0AllOf1 = new RefOneOf0AllOf1Impl();
		return refOneOf0AllOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1Not createRefOneOf0AllOf1Not() {
		RefOneOf0AllOf1NotImpl refOneOf0AllOf1Not = new RefOneOf0AllOf1NotImpl();
		return refOneOf0AllOf1Not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2 createRefOneOf0AllOf2() {
		RefOneOf0AllOf2Impl refOneOf0AllOf2 = new RefOneOf0AllOf2Impl();
		return refOneOf0AllOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2Not createRefOneOf0AllOf2Not() {
		RefOneOf0AllOf2NotImpl refOneOf0AllOf2Not = new RefOneOf0AllOf2NotImpl();
		return refOneOf0AllOf2Not;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf1 createRefOneOf1() {
		RefOneOf1Impl refOneOf1 = new RefOneOf1Impl();
		return refOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Shell createShell() {
		ShellImpl shell = new ShellImpl();
		return shell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShellAnyOf0 createShellAnyOf0() {
		ShellAnyOf0Impl shellAnyOf0 = new ShellAnyOf0Impl();
		return shellAnyOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShellAnyOf1 createShellAnyOf1() {
		ShellAnyOf1Impl shellAnyOf1 = new ShellAnyOf1Impl();
		return shellAnyOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Types createTypes() {
		TypesImpl types = new TypesImpl();
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Working_45directory createWorking_45directory() {
		Working_45directoryImpl working_45directory = new Working_45directoryImpl();
		return working_45directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeeds createJobNeeds() {
		JobNeedsImpl jobNeeds = new JobNeedsImpl();
		return jobNeeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeedsOneOf0 createJobNeedsOneOf0() {
		JobNeedsOneOf0Impl jobNeedsOneOf0 = new JobNeedsOneOf0Impl();
		return jobNeedsOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeedsOneOf0Items createJobNeedsOneOf0Items() {
		JobNeedsOneOf0ItemsImpl jobNeedsOneOf0Items = new JobNeedsOneOf0ItemsImpl();
		return jobNeedsOneOf0Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeedsOneOf1 createJobNeedsOneOf1() {
		JobNeedsOneOf1Impl jobNeedsOneOf1 = new JobNeedsOneOf1Impl();
		return jobNeedsOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJob createReusableWorkflowCallJob() {
		ReusableWorkflowCallJobImpl reusableWorkflowCallJob = new ReusableWorkflowCallJobImpl();
		return reusableWorkflowCallJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobName createReusableWorkflowCallJobName() {
		ReusableWorkflowCallJobNameImpl reusableWorkflowCallJobName = new ReusableWorkflowCallJobNameImpl();
		return reusableWorkflowCallJobName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobNeeds createReusableWorkflowCallJobNeeds() {
		ReusableWorkflowCallJobNeedsImpl reusableWorkflowCallJobNeeds = new ReusableWorkflowCallJobNeedsImpl();
		return reusableWorkflowCallJobNeeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobPermissions createReusableWorkflowCallJobPermissions() {
		ReusableWorkflowCallJobPermissionsImpl reusableWorkflowCallJobPermissions = new ReusableWorkflowCallJobPermissionsImpl();
		return reusableWorkflowCallJobPermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobIf createReusableWorkflowCallJobIf() {
		ReusableWorkflowCallJobIfImpl reusableWorkflowCallJobIf = new ReusableWorkflowCallJobIfImpl();
		return reusableWorkflowCallJobIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobUses createReusableWorkflowCallJobUses() {
		ReusableWorkflowCallJobUsesImpl reusableWorkflowCallJobUses = new ReusableWorkflowCallJobUsesImpl();
		return reusableWorkflowCallJobUses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobWith createReusableWorkflowCallJobWith() {
		ReusableWorkflowCallJobWithImpl reusableWorkflowCallJobWith = new ReusableWorkflowCallJobWithImpl();
		return reusableWorkflowCallJobWith;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobSecrets createReusableWorkflowCallJobSecrets() {
		ReusableWorkflowCallJobSecretsImpl reusableWorkflowCallJobSecrets = new ReusableWorkflowCallJobSecretsImpl();
		return reusableWorkflowCallJobSecrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobSecretsOneOf0 createReusableWorkflowCallJobSecretsOneOf0() {
		ReusableWorkflowCallJobSecretsOneOf0Impl reusableWorkflowCallJobSecretsOneOf0 = new ReusableWorkflowCallJobSecretsOneOf0Impl();
		return reusableWorkflowCallJobSecretsOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobSecretsOneOf1 createReusableWorkflowCallJobSecretsOneOf1() {
		ReusableWorkflowCallJobSecretsOneOf1Impl reusableWorkflowCallJobSecretsOneOf1 = new ReusableWorkflowCallJobSecretsOneOf1Impl();
		return reusableWorkflowCallJobSecretsOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategy createReusableWorkflowCallJobStrategy() {
		ReusableWorkflowCallJobStrategyImpl reusableWorkflowCallJobStrategy = new ReusableWorkflowCallJobStrategyImpl();
		return reusableWorkflowCallJobStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrix createReusableWorkflowCallJobStrategyMatrix() {
		ReusableWorkflowCallJobStrategyMatrixImpl reusableWorkflowCallJobStrategyMatrix = new ReusableWorkflowCallJobStrategyMatrixImpl();
		return reusableWorkflowCallJobStrategyMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixOneOf0 createReusableWorkflowCallJobStrategyMatrixOneOf0() {
		ReusableWorkflowCallJobStrategyMatrixOneOf0Impl reusableWorkflowCallJobStrategyMatrixOneOf0 = new ReusableWorkflowCallJobStrategyMatrixOneOf0Impl();
		return reusableWorkflowCallJobStrategyMatrixOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixOneOf1 createReusableWorkflowCallJobStrategyMatrixOneOf1() {
		ReusableWorkflowCallJobStrategyMatrixOneOf1Impl reusableWorkflowCallJobStrategyMatrixOneOf1 = new ReusableWorkflowCallJobStrategyMatrixOneOf1Impl();
		return reusableWorkflowCallJobStrategyMatrixOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixPatternProperties0 createReusableWorkflowCallJobStrategyMatrixPatternProperties0() {
		ReusableWorkflowCallJobStrategyMatrixPatternProperties0Impl reusableWorkflowCallJobStrategyMatrixPatternProperties0 = new ReusableWorkflowCallJobStrategyMatrixPatternProperties0Impl();
		return reusableWorkflowCallJobStrategyMatrixPatternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixPatternProperties0Items createReusableWorkflowCallJobStrategyMatrixPatternProperties0Items() {
		ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsImpl reusableWorkflowCallJobStrategyMatrixPatternProperties0Items = new ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsImpl();
		return reusableWorkflowCallJobStrategyMatrixPatternProperties0Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties createReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties() {
		ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesImpl reusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties = new ReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesImpl();
		return reusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixAdditionalProperties createReusableWorkflowCallJobStrategyMatrixAdditionalProperties() {
		ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesImpl reusableWorkflowCallJobStrategyMatrixAdditionalProperties = new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesImpl();
		return reusableWorkflowCallJobStrategyMatrixAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0 createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0() {
		ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Impl reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0 = new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Impl();
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items() {
		ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0ItemsImpl reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items = new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0ItemsImpl();
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1 createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1() {
		ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Impl reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1 = new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1Impl();
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyFail_45fast createReusableWorkflowCallJobStrategyFail_45fast() {
		ReusableWorkflowCallJobStrategyFail_45fastImpl reusableWorkflowCallJobStrategyFail_45fast = new ReusableWorkflowCallJobStrategyFail_45fastImpl();
		return reusableWorkflowCallJobStrategyFail_45fast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMax_45parallel createReusableWorkflowCallJobStrategyMax_45parallel() {
		ReusableWorkflowCallJobStrategyMax_45parallelImpl reusableWorkflowCallJobStrategyMax_45parallel = new ReusableWorkflowCallJobStrategyMax_45parallelImpl();
		return reusableWorkflowCallJobStrategyMax_45parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobConcurrency createReusableWorkflowCallJobConcurrency() {
		ReusableWorkflowCallJobConcurrencyImpl reusableWorkflowCallJobConcurrency = new ReusableWorkflowCallJobConcurrencyImpl();
		return reusableWorkflowCallJobConcurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobConcurrencyOneOf0 createReusableWorkflowCallJobConcurrencyOneOf0() {
		ReusableWorkflowCallJobConcurrencyOneOf0Impl reusableWorkflowCallJobConcurrencyOneOf0 = new ReusableWorkflowCallJobConcurrencyOneOf0Impl();
		return reusableWorkflowCallJobConcurrencyOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobConcurrencyOneOf1 createReusableWorkflowCallJobConcurrencyOneOf1() {
		ReusableWorkflowCallJobConcurrencyOneOf1Impl reusableWorkflowCallJobConcurrencyOneOf1 = new ReusableWorkflowCallJobConcurrencyOneOf1Impl();
		return reusableWorkflowCallJobConcurrencyOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJob createNormalJob() {
		NormalJobImpl normalJob = new NormalJobImpl();
		return normalJob;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobName createNormalJobName() {
		NormalJobNameImpl normalJobName = new NormalJobNameImpl();
		return normalJobName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobNeeds createNormalJobNeeds() {
		NormalJobNeedsImpl normalJobNeeds = new NormalJobNeedsImpl();
		return normalJobNeeds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobPermissions createNormalJobPermissions() {
		NormalJobPermissionsImpl normalJobPermissions = new NormalJobPermissionsImpl();
		return normalJobPermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45on createNormalJobRuns_45on() {
		NormalJobRuns_45onImpl normalJobRuns_45on = new NormalJobRuns_45onImpl();
		return normalJobRuns_45on;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf0 createNormalJobRuns_45onOneOf0() {
		NormalJobRuns_45onOneOf0Impl normalJobRuns_45onOneOf0 = new NormalJobRuns_45onOneOf0Impl();
		return normalJobRuns_45onOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1 createNormalJobRuns_45onOneOf1() {
		NormalJobRuns_45onOneOf1Impl normalJobRuns_45onOneOf1 = new NormalJobRuns_45onOneOf1Impl();
		return normalJobRuns_45onOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf0 createNormalJobRuns_45onOneOf1AnyOf0() {
		NormalJobRuns_45onOneOf1AnyOf0Impl normalJobRuns_45onOneOf1AnyOf0 = new NormalJobRuns_45onOneOf1AnyOf0Impl();
		return normalJobRuns_45onOneOf1AnyOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf0Items0 createNormalJobRuns_45onOneOf1AnyOf0Items0() {
		NormalJobRuns_45onOneOf1AnyOf0Items0Impl normalJobRuns_45onOneOf1AnyOf0Items0 = new NormalJobRuns_45onOneOf1AnyOf0Items0Impl();
		return normalJobRuns_45onOneOf1AnyOf0Items0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf0AdditionalItems createNormalJobRuns_45onOneOf1AnyOf0AdditionalItems() {
		NormalJobRuns_45onOneOf1AnyOf0AdditionalItemsImpl normalJobRuns_45onOneOf1AnyOf0AdditionalItems = new NormalJobRuns_45onOneOf1AnyOf0AdditionalItemsImpl();
		return normalJobRuns_45onOneOf1AnyOf0AdditionalItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf1 createNormalJobRuns_45onOneOf1AnyOf1() {
		NormalJobRuns_45onOneOf1AnyOf1Impl normalJobRuns_45onOneOf1AnyOf1 = new NormalJobRuns_45onOneOf1AnyOf1Impl();
		return normalJobRuns_45onOneOf1AnyOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf1Items0 createNormalJobRuns_45onOneOf1AnyOf1Items0() {
		NormalJobRuns_45onOneOf1AnyOf1Items0Impl normalJobRuns_45onOneOf1AnyOf1Items0 = new NormalJobRuns_45onOneOf1AnyOf1Items0Impl();
		return normalJobRuns_45onOneOf1AnyOf1Items0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf1Items1 createNormalJobRuns_45onOneOf1AnyOf1Items1() {
		NormalJobRuns_45onOneOf1AnyOf1Items1Impl normalJobRuns_45onOneOf1AnyOf1Items1 = new NormalJobRuns_45onOneOf1AnyOf1Items1Impl();
		return normalJobRuns_45onOneOf1AnyOf1Items1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf1AdditionalItems createNormalJobRuns_45onOneOf1AnyOf1AdditionalItems() {
		NormalJobRuns_45onOneOf1AnyOf1AdditionalItemsImpl normalJobRuns_45onOneOf1AnyOf1AdditionalItems = new NormalJobRuns_45onOneOf1AnyOf1AdditionalItemsImpl();
		return normalJobRuns_45onOneOf1AnyOf1AdditionalItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2 createNormalJobRuns_45onOneOf1AnyOf2() {
		NormalJobRuns_45onOneOf1AnyOf2Impl normalJobRuns_45onOneOf1AnyOf2 = new NormalJobRuns_45onOneOf1AnyOf2Impl();
		return normalJobRuns_45onOneOf1AnyOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2Items0 createNormalJobRuns_45onOneOf1AnyOf2Items0() {
		NormalJobRuns_45onOneOf1AnyOf2Items0Impl normalJobRuns_45onOneOf1AnyOf2Items0 = new NormalJobRuns_45onOneOf1AnyOf2Items0Impl();
		return normalJobRuns_45onOneOf1AnyOf2Items0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2Items1 createNormalJobRuns_45onOneOf1AnyOf2Items1() {
		NormalJobRuns_45onOneOf1AnyOf2Items1Impl normalJobRuns_45onOneOf1AnyOf2Items1 = new NormalJobRuns_45onOneOf1AnyOf2Items1Impl();
		return normalJobRuns_45onOneOf1AnyOf2Items1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2AdditionalItems createNormalJobRuns_45onOneOf1AnyOf2AdditionalItems() {
		NormalJobRuns_45onOneOf1AnyOf2AdditionalItemsImpl normalJobRuns_45onOneOf1AnyOf2AdditionalItems = new NormalJobRuns_45onOneOf1AnyOf2AdditionalItemsImpl();
		return normalJobRuns_45onOneOf1AnyOf2AdditionalItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf3 createNormalJobRuns_45onOneOf1AnyOf3() {
		NormalJobRuns_45onOneOf1AnyOf3Impl normalJobRuns_45onOneOf1AnyOf3 = new NormalJobRuns_45onOneOf1AnyOf3Impl();
		return normalJobRuns_45onOneOf1AnyOf3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf3Items0 createNormalJobRuns_45onOneOf1AnyOf3Items0() {
		NormalJobRuns_45onOneOf1AnyOf3Items0Impl normalJobRuns_45onOneOf1AnyOf3Items0 = new NormalJobRuns_45onOneOf1AnyOf3Items0Impl();
		return normalJobRuns_45onOneOf1AnyOf3Items0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf3Items1 createNormalJobRuns_45onOneOf1AnyOf3Items1() {
		NormalJobRuns_45onOneOf1AnyOf3Items1Impl normalJobRuns_45onOneOf1AnyOf3Items1 = new NormalJobRuns_45onOneOf1AnyOf3Items1Impl();
		return normalJobRuns_45onOneOf1AnyOf3Items1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf3Items2 createNormalJobRuns_45onOneOf1AnyOf3Items2() {
		NormalJobRuns_45onOneOf1AnyOf3Items2Impl normalJobRuns_45onOneOf1AnyOf3Items2 = new NormalJobRuns_45onOneOf1AnyOf3Items2Impl();
		return normalJobRuns_45onOneOf1AnyOf3Items2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf3AdditionalItems createNormalJobRuns_45onOneOf1AnyOf3AdditionalItems() {
		NormalJobRuns_45onOneOf1AnyOf3AdditionalItemsImpl normalJobRuns_45onOneOf1AnyOf3AdditionalItems = new NormalJobRuns_45onOneOf1AnyOf3AdditionalItemsImpl();
		return normalJobRuns_45onOneOf1AnyOf3AdditionalItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf4 createNormalJobRuns_45onOneOf1AnyOf4() {
		NormalJobRuns_45onOneOf1AnyOf4Impl normalJobRuns_45onOneOf1AnyOf4 = new NormalJobRuns_45onOneOf1AnyOf4Impl();
		return normalJobRuns_45onOneOf1AnyOf4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf4Items0 createNormalJobRuns_45onOneOf1AnyOf4Items0() {
		NormalJobRuns_45onOneOf1AnyOf4Items0Impl normalJobRuns_45onOneOf1AnyOf4Items0 = new NormalJobRuns_45onOneOf1AnyOf4Items0Impl();
		return normalJobRuns_45onOneOf1AnyOf4Items0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf4Items1 createNormalJobRuns_45onOneOf1AnyOf4Items1() {
		NormalJobRuns_45onOneOf1AnyOf4Items1Impl normalJobRuns_45onOneOf1AnyOf4Items1 = new NormalJobRuns_45onOneOf1AnyOf4Items1Impl();
		return normalJobRuns_45onOneOf1AnyOf4Items1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf4Items2 createNormalJobRuns_45onOneOf1AnyOf4Items2() {
		NormalJobRuns_45onOneOf1AnyOf4Items2Impl normalJobRuns_45onOneOf1AnyOf4Items2 = new NormalJobRuns_45onOneOf1AnyOf4Items2Impl();
		return normalJobRuns_45onOneOf1AnyOf4Items2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf4AdditionalItems createNormalJobRuns_45onOneOf1AnyOf4AdditionalItems() {
		NormalJobRuns_45onOneOf1AnyOf4AdditionalItemsImpl normalJobRuns_45onOneOf1AnyOf4AdditionalItems = new NormalJobRuns_45onOneOf1AnyOf4AdditionalItemsImpl();
		return normalJobRuns_45onOneOf1AnyOf4AdditionalItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf2 createNormalJobRuns_45onOneOf2() {
		NormalJobRuns_45onOneOf2Impl normalJobRuns_45onOneOf2 = new NormalJobRuns_45onOneOf2Impl();
		return normalJobRuns_45onOneOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobEnvironment createNormalJobEnvironment() {
		NormalJobEnvironmentImpl normalJobEnvironment = new NormalJobEnvironmentImpl();
		return normalJobEnvironment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobEnvironmentOneOf0 createNormalJobEnvironmentOneOf0() {
		NormalJobEnvironmentOneOf0Impl normalJobEnvironmentOneOf0 = new NormalJobEnvironmentOneOf0Impl();
		return normalJobEnvironmentOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobEnvironmentOneOf1 createNormalJobEnvironmentOneOf1() {
		NormalJobEnvironmentOneOf1Impl normalJobEnvironmentOneOf1 = new NormalJobEnvironmentOneOf1Impl();
		return normalJobEnvironmentOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobOutputs createNormalJobOutputs() {
		NormalJobOutputsImpl normalJobOutputs = new NormalJobOutputsImpl();
		return normalJobOutputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobOutputsAdditionalProperties createNormalJobOutputsAdditionalProperties() {
		NormalJobOutputsAdditionalPropertiesImpl normalJobOutputsAdditionalProperties = new NormalJobOutputsAdditionalPropertiesImpl();
		return normalJobOutputsAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobEnv createNormalJobEnv() {
		NormalJobEnvImpl normalJobEnv = new NormalJobEnvImpl();
		return normalJobEnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobDefaults createNormalJobDefaults() {
		NormalJobDefaultsImpl normalJobDefaults = new NormalJobDefaultsImpl();
		return normalJobDefaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobIf createNormalJobIf() {
		NormalJobIfImpl normalJobIf = new NormalJobIfImpl();
		return normalJobIf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobSteps createNormalJobSteps() {
		NormalJobStepsImpl normalJobSteps = new NormalJobStepsImpl();
		return normalJobSteps;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItems createNormalJobStepsItems() {
		NormalJobStepsItemsImpl normalJobStepsItems = new NormalJobStepsItemsImpl();
		return normalJobStepsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0 createNormalJobStepsItemsAllOf0() {
		NormalJobStepsItemsAllOf0Impl normalJobStepsItemsAllOf0 = new NormalJobStepsItemsAllOf0Impl();
		return normalJobStepsItemsAllOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0OneOf0 createNormalJobStepsItemsAllOf0OneOf0() {
		NormalJobStepsItemsAllOf0OneOf0Impl normalJobStepsItemsAllOf0OneOf0 = new NormalJobStepsItemsAllOf0OneOf0Impl();
		return normalJobStepsItemsAllOf0OneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0OneOf0Uses createNormalJobStepsItemsAllOf0OneOf0Uses() {
		NormalJobStepsItemsAllOf0OneOf0UsesImpl normalJobStepsItemsAllOf0OneOf0Uses = new NormalJobStepsItemsAllOf0OneOf0UsesImpl();
		return normalJobStepsItemsAllOf0OneOf0Uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0OneOf1 createNormalJobStepsItemsAllOf0OneOf1() {
		NormalJobStepsItemsAllOf0OneOf1Impl normalJobStepsItemsAllOf0OneOf1 = new NormalJobStepsItemsAllOf0OneOf1Impl();
		return normalJobStepsItemsAllOf0OneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0OneOf1Run createNormalJobStepsItemsAllOf0OneOf1Run() {
		NormalJobStepsItemsAllOf0OneOf1RunImpl normalJobStepsItemsAllOf0OneOf1Run = new NormalJobStepsItemsAllOf0OneOf1RunImpl();
		return normalJobStepsItemsAllOf0OneOf1Run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1 createNormalJobStepsItemsAllOf1() {
		NormalJobStepsItemsAllOf1Impl normalJobStepsItemsAllOf1 = new NormalJobStepsItemsAllOf1Impl();
		return normalJobStepsItemsAllOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Id createNormalJobStepsItemsAllOf1Id() {
		NormalJobStepsItemsAllOf1IdImpl normalJobStepsItemsAllOf1Id = new NormalJobStepsItemsAllOf1IdImpl();
		return normalJobStepsItemsAllOf1Id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1If createNormalJobStepsItemsAllOf1If() {
		NormalJobStepsItemsAllOf1IfImpl normalJobStepsItemsAllOf1If = new NormalJobStepsItemsAllOf1IfImpl();
		return normalJobStepsItemsAllOf1If;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Name createNormalJobStepsItemsAllOf1Name() {
		NormalJobStepsItemsAllOf1NameImpl normalJobStepsItemsAllOf1Name = new NormalJobStepsItemsAllOf1NameImpl();
		return normalJobStepsItemsAllOf1Name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Uses createNormalJobStepsItemsAllOf1Uses() {
		NormalJobStepsItemsAllOf1UsesImpl normalJobStepsItemsAllOf1Uses = new NormalJobStepsItemsAllOf1UsesImpl();
		return normalJobStepsItemsAllOf1Uses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Run createNormalJobStepsItemsAllOf1Run() {
		NormalJobStepsItemsAllOf1RunImpl normalJobStepsItemsAllOf1Run = new NormalJobStepsItemsAllOf1RunImpl();
		return normalJobStepsItemsAllOf1Run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Working_45directory createNormalJobStepsItemsAllOf1Working_45directory() {
		NormalJobStepsItemsAllOf1Working_45directoryImpl normalJobStepsItemsAllOf1Working_45directory = new NormalJobStepsItemsAllOf1Working_45directoryImpl();
		return normalJobStepsItemsAllOf1Working_45directory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Shell createNormalJobStepsItemsAllOf1Shell() {
		NormalJobStepsItemsAllOf1ShellImpl normalJobStepsItemsAllOf1Shell = new NormalJobStepsItemsAllOf1ShellImpl();
		return normalJobStepsItemsAllOf1Shell;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1With createNormalJobStepsItemsAllOf1With() {
		NormalJobStepsItemsAllOf1WithImpl normalJobStepsItemsAllOf1With = new NormalJobStepsItemsAllOf1WithImpl();
		return normalJobStepsItemsAllOf1With;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1WithArgs createNormalJobStepsItemsAllOf1WithArgs() {
		NormalJobStepsItemsAllOf1WithArgsImpl normalJobStepsItemsAllOf1WithArgs = new NormalJobStepsItemsAllOf1WithArgsImpl();
		return normalJobStepsItemsAllOf1WithArgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1WithEntrypoint createNormalJobStepsItemsAllOf1WithEntrypoint() {
		NormalJobStepsItemsAllOf1WithEntrypointImpl normalJobStepsItemsAllOf1WithEntrypoint = new NormalJobStepsItemsAllOf1WithEntrypointImpl();
		return normalJobStepsItemsAllOf1WithEntrypoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Env createNormalJobStepsItemsAllOf1Env() {
		NormalJobStepsItemsAllOf1EnvImpl normalJobStepsItemsAllOf1Env = new NormalJobStepsItemsAllOf1EnvImpl();
		return normalJobStepsItemsAllOf1Env;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Continue_45on_45error createNormalJobStepsItemsAllOf1Continue_45on_45error() {
		NormalJobStepsItemsAllOf1Continue_45on_45errorImpl normalJobStepsItemsAllOf1Continue_45on_45error = new NormalJobStepsItemsAllOf1Continue_45on_45errorImpl();
		return normalJobStepsItemsAllOf1Continue_45on_45error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0 createNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0() {
		NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Impl normalJobStepsItemsAllOf1Continue_45on_45errorOneOf0 = new NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0Impl();
		return normalJobStepsItemsAllOf1Continue_45on_45errorOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 createNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1() {
		NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Impl normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1 = new NormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1Impl();
		return normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Timeout_45minutes createNormalJobStepsItemsAllOf1Timeout_45minutes() {
		NormalJobStepsItemsAllOf1Timeout_45minutesImpl normalJobStepsItemsAllOf1Timeout_45minutes = new NormalJobStepsItemsAllOf1Timeout_45minutesImpl();
		return normalJobStepsItemsAllOf1Timeout_45minutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobTimeout_45minutes createNormalJobTimeout_45minutes() {
		NormalJobTimeout_45minutesImpl normalJobTimeout_45minutes = new NormalJobTimeout_45minutesImpl();
		return normalJobTimeout_45minutes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategy createNormalJobStrategy() {
		NormalJobStrategyImpl normalJobStrategy = new NormalJobStrategyImpl();
		return normalJobStrategy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrix createNormalJobStrategyMatrix() {
		NormalJobStrategyMatrixImpl normalJobStrategyMatrix = new NormalJobStrategyMatrixImpl();
		return normalJobStrategyMatrix;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixOneOf0 createNormalJobStrategyMatrixOneOf0() {
		NormalJobStrategyMatrixOneOf0Impl normalJobStrategyMatrixOneOf0 = new NormalJobStrategyMatrixOneOf0Impl();
		return normalJobStrategyMatrixOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixOneOf1 createNormalJobStrategyMatrixOneOf1() {
		NormalJobStrategyMatrixOneOf1Impl normalJobStrategyMatrixOneOf1 = new NormalJobStrategyMatrixOneOf1Impl();
		return normalJobStrategyMatrixOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixPatternProperties0 createNormalJobStrategyMatrixPatternProperties0() {
		NormalJobStrategyMatrixPatternProperties0Impl normalJobStrategyMatrixPatternProperties0 = new NormalJobStrategyMatrixPatternProperties0Impl();
		return normalJobStrategyMatrixPatternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixPatternProperties0Items createNormalJobStrategyMatrixPatternProperties0Items() {
		NormalJobStrategyMatrixPatternProperties0ItemsImpl normalJobStrategyMatrixPatternProperties0Items = new NormalJobStrategyMatrixPatternProperties0ItemsImpl();
		return normalJobStrategyMatrixPatternProperties0Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties createNormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties() {
		NormalJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesImpl normalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties = new NormalJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesImpl();
		return normalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixAdditionalProperties createNormalJobStrategyMatrixAdditionalProperties() {
		NormalJobStrategyMatrixAdditionalPropertiesImpl normalJobStrategyMatrixAdditionalProperties = new NormalJobStrategyMatrixAdditionalPropertiesImpl();
		return normalJobStrategyMatrixAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixAdditionalPropertiesOneOf0 createNormalJobStrategyMatrixAdditionalPropertiesOneOf0() {
		NormalJobStrategyMatrixAdditionalPropertiesOneOf0Impl normalJobStrategyMatrixAdditionalPropertiesOneOf0 = new NormalJobStrategyMatrixAdditionalPropertiesOneOf0Impl();
		return normalJobStrategyMatrixAdditionalPropertiesOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixAdditionalPropertiesOneOf0Items createNormalJobStrategyMatrixAdditionalPropertiesOneOf0Items() {
		NormalJobStrategyMatrixAdditionalPropertiesOneOf0ItemsImpl normalJobStrategyMatrixAdditionalPropertiesOneOf0Items = new NormalJobStrategyMatrixAdditionalPropertiesOneOf0ItemsImpl();
		return normalJobStrategyMatrixAdditionalPropertiesOneOf0Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixAdditionalPropertiesOneOf1 createNormalJobStrategyMatrixAdditionalPropertiesOneOf1() {
		NormalJobStrategyMatrixAdditionalPropertiesOneOf1Impl normalJobStrategyMatrixAdditionalPropertiesOneOf1 = new NormalJobStrategyMatrixAdditionalPropertiesOneOf1Impl();
		return normalJobStrategyMatrixAdditionalPropertiesOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyFail_45fast createNormalJobStrategyFail_45fast() {
		NormalJobStrategyFail_45fastImpl normalJobStrategyFail_45fast = new NormalJobStrategyFail_45fastImpl();
		return normalJobStrategyFail_45fast;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMax_45parallel createNormalJobStrategyMax_45parallel() {
		NormalJobStrategyMax_45parallelImpl normalJobStrategyMax_45parallel = new NormalJobStrategyMax_45parallelImpl();
		return normalJobStrategyMax_45parallel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContinue_45on_45error createNormalJobContinue_45on_45error() {
		NormalJobContinue_45on_45errorImpl normalJobContinue_45on_45error = new NormalJobContinue_45on_45errorImpl();
		return normalJobContinue_45on_45error;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContinue_45on_45errorOneOf0 createNormalJobContinue_45on_45errorOneOf0() {
		NormalJobContinue_45on_45errorOneOf0Impl normalJobContinue_45on_45errorOneOf0 = new NormalJobContinue_45on_45errorOneOf0Impl();
		return normalJobContinue_45on_45errorOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContinue_45on_45errorOneOf1 createNormalJobContinue_45on_45errorOneOf1() {
		NormalJobContinue_45on_45errorOneOf1Impl normalJobContinue_45on_45errorOneOf1 = new NormalJobContinue_45on_45errorOneOf1Impl();
		return normalJobContinue_45on_45errorOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContainer createNormalJobContainer() {
		NormalJobContainerImpl normalJobContainer = new NormalJobContainerImpl();
		return normalJobContainer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContainerOneOf0 createNormalJobContainerOneOf0() {
		NormalJobContainerOneOf0Impl normalJobContainerOneOf0 = new NormalJobContainerOneOf0Impl();
		return normalJobContainerOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContainerOneOf1 createNormalJobContainerOneOf1() {
		NormalJobContainerOneOf1Impl normalJobContainerOneOf1 = new NormalJobContainerOneOf1Impl();
		return normalJobContainerOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobServices createNormalJobServices() {
		NormalJobServicesImpl normalJobServices = new NormalJobServicesImpl();
		return normalJobServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobServicesAdditionalProperties createNormalJobServicesAdditionalProperties() {
		NormalJobServicesAdditionalPropertiesImpl normalJobServicesAdditionalProperties = new NormalJobServicesAdditionalPropertiesImpl();
		return normalJobServicesAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobConcurrency createNormalJobConcurrency() {
		NormalJobConcurrencyImpl normalJobConcurrency = new NormalJobConcurrencyImpl();
		return normalJobConcurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobConcurrencyOneOf0 createNormalJobConcurrencyOneOf0() {
		NormalJobConcurrencyOneOf0Impl normalJobConcurrencyOneOf0 = new NormalJobConcurrencyOneOf0Impl();
		return normalJobConcurrencyOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobConcurrencyOneOf1 createNormalJobConcurrencyOneOf1() {
		NormalJobConcurrencyOneOf1Impl normalJobConcurrencyOneOf1 = new NormalJobConcurrencyOneOf1Impl();
		return normalJobConcurrencyOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootName createGithubwfRootName() {
		GithubwfRootNameImpl githubwfRootName = new GithubwfRootNameImpl();
		return githubwfRootName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOn createGithubwfRootOn() {
		GithubwfRootOnImpl githubwfRootOn = new GithubwfRootOnImpl();
		return githubwfRootOn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf0 createGithubwfRootOnOneOf0() {
		GithubwfRootOnOneOf0Impl githubwfRootOnOneOf0 = new GithubwfRootOnOneOf0Impl();
		return githubwfRootOnOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf1 createGithubwfRootOnOneOf1() {
		GithubwfRootOnOneOf1Impl githubwfRootOnOneOf1 = new GithubwfRootOnOneOf1Impl();
		return githubwfRootOnOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf1Items createGithubwfRootOnOneOf1Items() {
		GithubwfRootOnOneOf1ItemsImpl githubwfRootOnOneOf1Items = new GithubwfRootOnOneOf1ItemsImpl();
		return githubwfRootOnOneOf1Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2 createGithubwfRootOnOneOf2() {
		GithubwfRootOnOneOf2Impl githubwfRootOnOneOf2 = new GithubwfRootOnOneOf2Impl();
		return githubwfRootOnOneOf2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Branch_protection_rule createGithubwfRootOnOneOf2Branch_protection_rule() {
		GithubwfRootOnOneOf2Branch_protection_ruleImpl githubwfRootOnOneOf2Branch_protection_rule = new GithubwfRootOnOneOf2Branch_protection_ruleImpl();
		return githubwfRootOnOneOf2Branch_protection_rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Branch_protection_ruleTypes createGithubwfRootOnOneOf2Branch_protection_ruleTypes() {
		GithubwfRootOnOneOf2Branch_protection_ruleTypesImpl githubwfRootOnOneOf2Branch_protection_ruleTypes = new GithubwfRootOnOneOf2Branch_protection_ruleTypesImpl();
		return githubwfRootOnOneOf2Branch_protection_ruleTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Branch_protection_ruleTypesItems createGithubwfRootOnOneOf2Branch_protection_ruleTypesItems() {
		GithubwfRootOnOneOf2Branch_protection_ruleTypesItemsImpl githubwfRootOnOneOf2Branch_protection_ruleTypesItems = new GithubwfRootOnOneOf2Branch_protection_ruleTypesItemsImpl();
		return githubwfRootOnOneOf2Branch_protection_ruleTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Check_run createGithubwfRootOnOneOf2Check_run() {
		GithubwfRootOnOneOf2Check_runImpl githubwfRootOnOneOf2Check_run = new GithubwfRootOnOneOf2Check_runImpl();
		return githubwfRootOnOneOf2Check_run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Check_runTypes createGithubwfRootOnOneOf2Check_runTypes() {
		GithubwfRootOnOneOf2Check_runTypesImpl githubwfRootOnOneOf2Check_runTypes = new GithubwfRootOnOneOf2Check_runTypesImpl();
		return githubwfRootOnOneOf2Check_runTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Check_runTypesItems createGithubwfRootOnOneOf2Check_runTypesItems() {
		GithubwfRootOnOneOf2Check_runTypesItemsImpl githubwfRootOnOneOf2Check_runTypesItems = new GithubwfRootOnOneOf2Check_runTypesItemsImpl();
		return githubwfRootOnOneOf2Check_runTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Check_suite createGithubwfRootOnOneOf2Check_suite() {
		GithubwfRootOnOneOf2Check_suiteImpl githubwfRootOnOneOf2Check_suite = new GithubwfRootOnOneOf2Check_suiteImpl();
		return githubwfRootOnOneOf2Check_suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Check_suiteTypes createGithubwfRootOnOneOf2Check_suiteTypes() {
		GithubwfRootOnOneOf2Check_suiteTypesImpl githubwfRootOnOneOf2Check_suiteTypes = new GithubwfRootOnOneOf2Check_suiteTypesImpl();
		return githubwfRootOnOneOf2Check_suiteTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Check_suiteTypesItems createGithubwfRootOnOneOf2Check_suiteTypesItems() {
		GithubwfRootOnOneOf2Check_suiteTypesItemsImpl githubwfRootOnOneOf2Check_suiteTypesItems = new GithubwfRootOnOneOf2Check_suiteTypesItemsImpl();
		return githubwfRootOnOneOf2Check_suiteTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Create createGithubwfRootOnOneOf2Create() {
		GithubwfRootOnOneOf2CreateImpl githubwfRootOnOneOf2Create = new GithubwfRootOnOneOf2CreateImpl();
		return githubwfRootOnOneOf2Create;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Delete createGithubwfRootOnOneOf2Delete() {
		GithubwfRootOnOneOf2DeleteImpl githubwfRootOnOneOf2Delete = new GithubwfRootOnOneOf2DeleteImpl();
		return githubwfRootOnOneOf2Delete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Deployment createGithubwfRootOnOneOf2Deployment() {
		GithubwfRootOnOneOf2DeploymentImpl githubwfRootOnOneOf2Deployment = new GithubwfRootOnOneOf2DeploymentImpl();
		return githubwfRootOnOneOf2Deployment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Deployment_status createGithubwfRootOnOneOf2Deployment_status() {
		GithubwfRootOnOneOf2Deployment_statusImpl githubwfRootOnOneOf2Deployment_status = new GithubwfRootOnOneOf2Deployment_statusImpl();
		return githubwfRootOnOneOf2Deployment_status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Discussion createGithubwfRootOnOneOf2Discussion() {
		GithubwfRootOnOneOf2DiscussionImpl githubwfRootOnOneOf2Discussion = new GithubwfRootOnOneOf2DiscussionImpl();
		return githubwfRootOnOneOf2Discussion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2DiscussionTypes createGithubwfRootOnOneOf2DiscussionTypes() {
		GithubwfRootOnOneOf2DiscussionTypesImpl githubwfRootOnOneOf2DiscussionTypes = new GithubwfRootOnOneOf2DiscussionTypesImpl();
		return githubwfRootOnOneOf2DiscussionTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2DiscussionTypesItems createGithubwfRootOnOneOf2DiscussionTypesItems() {
		GithubwfRootOnOneOf2DiscussionTypesItemsImpl githubwfRootOnOneOf2DiscussionTypesItems = new GithubwfRootOnOneOf2DiscussionTypesItemsImpl();
		return githubwfRootOnOneOf2DiscussionTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Discussion_comment createGithubwfRootOnOneOf2Discussion_comment() {
		GithubwfRootOnOneOf2Discussion_commentImpl githubwfRootOnOneOf2Discussion_comment = new GithubwfRootOnOneOf2Discussion_commentImpl();
		return githubwfRootOnOneOf2Discussion_comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Discussion_commentTypes createGithubwfRootOnOneOf2Discussion_commentTypes() {
		GithubwfRootOnOneOf2Discussion_commentTypesImpl githubwfRootOnOneOf2Discussion_commentTypes = new GithubwfRootOnOneOf2Discussion_commentTypesImpl();
		return githubwfRootOnOneOf2Discussion_commentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Discussion_commentTypesItems createGithubwfRootOnOneOf2Discussion_commentTypesItems() {
		GithubwfRootOnOneOf2Discussion_commentTypesItemsImpl githubwfRootOnOneOf2Discussion_commentTypesItems = new GithubwfRootOnOneOf2Discussion_commentTypesItemsImpl();
		return githubwfRootOnOneOf2Discussion_commentTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Fork createGithubwfRootOnOneOf2Fork() {
		GithubwfRootOnOneOf2ForkImpl githubwfRootOnOneOf2Fork = new GithubwfRootOnOneOf2ForkImpl();
		return githubwfRootOnOneOf2Fork;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Gollum createGithubwfRootOnOneOf2Gollum() {
		GithubwfRootOnOneOf2GollumImpl githubwfRootOnOneOf2Gollum = new GithubwfRootOnOneOf2GollumImpl();
		return githubwfRootOnOneOf2Gollum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Issue_comment createGithubwfRootOnOneOf2Issue_comment() {
		GithubwfRootOnOneOf2Issue_commentImpl githubwfRootOnOneOf2Issue_comment = new GithubwfRootOnOneOf2Issue_commentImpl();
		return githubwfRootOnOneOf2Issue_comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Issue_commentTypes createGithubwfRootOnOneOf2Issue_commentTypes() {
		GithubwfRootOnOneOf2Issue_commentTypesImpl githubwfRootOnOneOf2Issue_commentTypes = new GithubwfRootOnOneOf2Issue_commentTypesImpl();
		return githubwfRootOnOneOf2Issue_commentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Issue_commentTypesItems createGithubwfRootOnOneOf2Issue_commentTypesItems() {
		GithubwfRootOnOneOf2Issue_commentTypesItemsImpl githubwfRootOnOneOf2Issue_commentTypesItems = new GithubwfRootOnOneOf2Issue_commentTypesItemsImpl();
		return githubwfRootOnOneOf2Issue_commentTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Issues createGithubwfRootOnOneOf2Issues() {
		GithubwfRootOnOneOf2IssuesImpl githubwfRootOnOneOf2Issues = new GithubwfRootOnOneOf2IssuesImpl();
		return githubwfRootOnOneOf2Issues;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2IssuesTypes createGithubwfRootOnOneOf2IssuesTypes() {
		GithubwfRootOnOneOf2IssuesTypesImpl githubwfRootOnOneOf2IssuesTypes = new GithubwfRootOnOneOf2IssuesTypesImpl();
		return githubwfRootOnOneOf2IssuesTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2IssuesTypesItems createGithubwfRootOnOneOf2IssuesTypesItems() {
		GithubwfRootOnOneOf2IssuesTypesItemsImpl githubwfRootOnOneOf2IssuesTypesItems = new GithubwfRootOnOneOf2IssuesTypesItemsImpl();
		return githubwfRootOnOneOf2IssuesTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Label createGithubwfRootOnOneOf2Label() {
		GithubwfRootOnOneOf2LabelImpl githubwfRootOnOneOf2Label = new GithubwfRootOnOneOf2LabelImpl();
		return githubwfRootOnOneOf2Label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2LabelTypes createGithubwfRootOnOneOf2LabelTypes() {
		GithubwfRootOnOneOf2LabelTypesImpl githubwfRootOnOneOf2LabelTypes = new GithubwfRootOnOneOf2LabelTypesImpl();
		return githubwfRootOnOneOf2LabelTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2LabelTypesItems createGithubwfRootOnOneOf2LabelTypesItems() {
		GithubwfRootOnOneOf2LabelTypesItemsImpl githubwfRootOnOneOf2LabelTypesItems = new GithubwfRootOnOneOf2LabelTypesItemsImpl();
		return githubwfRootOnOneOf2LabelTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Member createGithubwfRootOnOneOf2Member() {
		GithubwfRootOnOneOf2MemberImpl githubwfRootOnOneOf2Member = new GithubwfRootOnOneOf2MemberImpl();
		return githubwfRootOnOneOf2Member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2MemberTypes createGithubwfRootOnOneOf2MemberTypes() {
		GithubwfRootOnOneOf2MemberTypesImpl githubwfRootOnOneOf2MemberTypes = new GithubwfRootOnOneOf2MemberTypesImpl();
		return githubwfRootOnOneOf2MemberTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2MemberTypesItems createGithubwfRootOnOneOf2MemberTypesItems() {
		GithubwfRootOnOneOf2MemberTypesItemsImpl githubwfRootOnOneOf2MemberTypesItems = new GithubwfRootOnOneOf2MemberTypesItemsImpl();
		return githubwfRootOnOneOf2MemberTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Merge_group createGithubwfRootOnOneOf2Merge_group() {
		GithubwfRootOnOneOf2Merge_groupImpl githubwfRootOnOneOf2Merge_group = new GithubwfRootOnOneOf2Merge_groupImpl();
		return githubwfRootOnOneOf2Merge_group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Merge_groupTypes createGithubwfRootOnOneOf2Merge_groupTypes() {
		GithubwfRootOnOneOf2Merge_groupTypesImpl githubwfRootOnOneOf2Merge_groupTypes = new GithubwfRootOnOneOf2Merge_groupTypesImpl();
		return githubwfRootOnOneOf2Merge_groupTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Merge_groupTypesItems createGithubwfRootOnOneOf2Merge_groupTypesItems() {
		GithubwfRootOnOneOf2Merge_groupTypesItemsImpl githubwfRootOnOneOf2Merge_groupTypesItems = new GithubwfRootOnOneOf2Merge_groupTypesItemsImpl();
		return githubwfRootOnOneOf2Merge_groupTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Milestone createGithubwfRootOnOneOf2Milestone() {
		GithubwfRootOnOneOf2MilestoneImpl githubwfRootOnOneOf2Milestone = new GithubwfRootOnOneOf2MilestoneImpl();
		return githubwfRootOnOneOf2Milestone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2MilestoneTypes createGithubwfRootOnOneOf2MilestoneTypes() {
		GithubwfRootOnOneOf2MilestoneTypesImpl githubwfRootOnOneOf2MilestoneTypes = new GithubwfRootOnOneOf2MilestoneTypesImpl();
		return githubwfRootOnOneOf2MilestoneTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2MilestoneTypesItems createGithubwfRootOnOneOf2MilestoneTypesItems() {
		GithubwfRootOnOneOf2MilestoneTypesItemsImpl githubwfRootOnOneOf2MilestoneTypesItems = new GithubwfRootOnOneOf2MilestoneTypesItemsImpl();
		return githubwfRootOnOneOf2MilestoneTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Page_build createGithubwfRootOnOneOf2Page_build() {
		GithubwfRootOnOneOf2Page_buildImpl githubwfRootOnOneOf2Page_build = new GithubwfRootOnOneOf2Page_buildImpl();
		return githubwfRootOnOneOf2Page_build;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Project createGithubwfRootOnOneOf2Project() {
		GithubwfRootOnOneOf2ProjectImpl githubwfRootOnOneOf2Project = new GithubwfRootOnOneOf2ProjectImpl();
		return githubwfRootOnOneOf2Project;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2ProjectTypes createGithubwfRootOnOneOf2ProjectTypes() {
		GithubwfRootOnOneOf2ProjectTypesImpl githubwfRootOnOneOf2ProjectTypes = new GithubwfRootOnOneOf2ProjectTypesImpl();
		return githubwfRootOnOneOf2ProjectTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2ProjectTypesItems createGithubwfRootOnOneOf2ProjectTypesItems() {
		GithubwfRootOnOneOf2ProjectTypesItemsImpl githubwfRootOnOneOf2ProjectTypesItems = new GithubwfRootOnOneOf2ProjectTypesItemsImpl();
		return githubwfRootOnOneOf2ProjectTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Project_card createGithubwfRootOnOneOf2Project_card() {
		GithubwfRootOnOneOf2Project_cardImpl githubwfRootOnOneOf2Project_card = new GithubwfRootOnOneOf2Project_cardImpl();
		return githubwfRootOnOneOf2Project_card;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Project_cardTypes createGithubwfRootOnOneOf2Project_cardTypes() {
		GithubwfRootOnOneOf2Project_cardTypesImpl githubwfRootOnOneOf2Project_cardTypes = new GithubwfRootOnOneOf2Project_cardTypesImpl();
		return githubwfRootOnOneOf2Project_cardTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Project_cardTypesItems createGithubwfRootOnOneOf2Project_cardTypesItems() {
		GithubwfRootOnOneOf2Project_cardTypesItemsImpl githubwfRootOnOneOf2Project_cardTypesItems = new GithubwfRootOnOneOf2Project_cardTypesItemsImpl();
		return githubwfRootOnOneOf2Project_cardTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Project_column createGithubwfRootOnOneOf2Project_column() {
		GithubwfRootOnOneOf2Project_columnImpl githubwfRootOnOneOf2Project_column = new GithubwfRootOnOneOf2Project_columnImpl();
		return githubwfRootOnOneOf2Project_column;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Project_columnTypes createGithubwfRootOnOneOf2Project_columnTypes() {
		GithubwfRootOnOneOf2Project_columnTypesImpl githubwfRootOnOneOf2Project_columnTypes = new GithubwfRootOnOneOf2Project_columnTypesImpl();
		return githubwfRootOnOneOf2Project_columnTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Project_columnTypesItems createGithubwfRootOnOneOf2Project_columnTypesItems() {
		GithubwfRootOnOneOf2Project_columnTypesItemsImpl githubwfRootOnOneOf2Project_columnTypesItems = new GithubwfRootOnOneOf2Project_columnTypesItemsImpl();
		return githubwfRootOnOneOf2Project_columnTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Public createGithubwfRootOnOneOf2Public() {
		GithubwfRootOnOneOf2PublicImpl githubwfRootOnOneOf2Public = new GithubwfRootOnOneOf2PublicImpl();
		return githubwfRootOnOneOf2Public;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request createGithubwfRootOnOneOf2Pull_request() {
		GithubwfRootOnOneOf2Pull_requestImpl githubwfRootOnOneOf2Pull_request = new GithubwfRootOnOneOf2Pull_requestImpl();
		return githubwfRootOnOneOf2Pull_request;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_requestTypes createGithubwfRootOnOneOf2Pull_requestTypes() {
		GithubwfRootOnOneOf2Pull_requestTypesImpl githubwfRootOnOneOf2Pull_requestTypes = new GithubwfRootOnOneOf2Pull_requestTypesImpl();
		return githubwfRootOnOneOf2Pull_requestTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_requestTypesItems createGithubwfRootOnOneOf2Pull_requestTypesItems() {
		GithubwfRootOnOneOf2Pull_requestTypesItemsImpl githubwfRootOnOneOf2Pull_requestTypesItems = new GithubwfRootOnOneOf2Pull_requestTypesItemsImpl();
		return githubwfRootOnOneOf2Pull_requestTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_requestPatternProperties0 createGithubwfRootOnOneOf2Pull_requestPatternProperties0() {
		GithubwfRootOnOneOf2Pull_requestPatternProperties0Impl githubwfRootOnOneOf2Pull_requestPatternProperties0 = new GithubwfRootOnOneOf2Pull_requestPatternProperties0Impl();
		return githubwfRootOnOneOf2Pull_requestPatternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_review createGithubwfRootOnOneOf2Pull_request_review() {
		GithubwfRootOnOneOf2Pull_request_reviewImpl githubwfRootOnOneOf2Pull_request_review = new GithubwfRootOnOneOf2Pull_request_reviewImpl();
		return githubwfRootOnOneOf2Pull_request_review;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_reviewTypes createGithubwfRootOnOneOf2Pull_request_reviewTypes() {
		GithubwfRootOnOneOf2Pull_request_reviewTypesImpl githubwfRootOnOneOf2Pull_request_reviewTypes = new GithubwfRootOnOneOf2Pull_request_reviewTypesImpl();
		return githubwfRootOnOneOf2Pull_request_reviewTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_reviewTypesItems createGithubwfRootOnOneOf2Pull_request_reviewTypesItems() {
		GithubwfRootOnOneOf2Pull_request_reviewTypesItemsImpl githubwfRootOnOneOf2Pull_request_reviewTypesItems = new GithubwfRootOnOneOf2Pull_request_reviewTypesItemsImpl();
		return githubwfRootOnOneOf2Pull_request_reviewTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_review_comment createGithubwfRootOnOneOf2Pull_request_review_comment() {
		GithubwfRootOnOneOf2Pull_request_review_commentImpl githubwfRootOnOneOf2Pull_request_review_comment = new GithubwfRootOnOneOf2Pull_request_review_commentImpl();
		return githubwfRootOnOneOf2Pull_request_review_comment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_review_commentTypes createGithubwfRootOnOneOf2Pull_request_review_commentTypes() {
		GithubwfRootOnOneOf2Pull_request_review_commentTypesImpl githubwfRootOnOneOf2Pull_request_review_commentTypes = new GithubwfRootOnOneOf2Pull_request_review_commentTypesImpl();
		return githubwfRootOnOneOf2Pull_request_review_commentTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_review_commentTypesItems createGithubwfRootOnOneOf2Pull_request_review_commentTypesItems() {
		GithubwfRootOnOneOf2Pull_request_review_commentTypesItemsImpl githubwfRootOnOneOf2Pull_request_review_commentTypesItems = new GithubwfRootOnOneOf2Pull_request_review_commentTypesItemsImpl();
		return githubwfRootOnOneOf2Pull_request_review_commentTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_target createGithubwfRootOnOneOf2Pull_request_target() {
		GithubwfRootOnOneOf2Pull_request_targetImpl githubwfRootOnOneOf2Pull_request_target = new GithubwfRootOnOneOf2Pull_request_targetImpl();
		return githubwfRootOnOneOf2Pull_request_target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_targetTypes createGithubwfRootOnOneOf2Pull_request_targetTypes() {
		GithubwfRootOnOneOf2Pull_request_targetTypesImpl githubwfRootOnOneOf2Pull_request_targetTypes = new GithubwfRootOnOneOf2Pull_request_targetTypesImpl();
		return githubwfRootOnOneOf2Pull_request_targetTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_targetTypesItems createGithubwfRootOnOneOf2Pull_request_targetTypesItems() {
		GithubwfRootOnOneOf2Pull_request_targetTypesItemsImpl githubwfRootOnOneOf2Pull_request_targetTypesItems = new GithubwfRootOnOneOf2Pull_request_targetTypesItemsImpl();
		return githubwfRootOnOneOf2Pull_request_targetTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_targetPatternProperties0 createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0() {
		GithubwfRootOnOneOf2Pull_request_targetPatternProperties0Impl githubwfRootOnOneOf2Pull_request_targetPatternProperties0 = new GithubwfRootOnOneOf2Pull_request_targetPatternProperties0Impl();
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Push createGithubwfRootOnOneOf2Push() {
		GithubwfRootOnOneOf2PushImpl githubwfRootOnOneOf2Push = new GithubwfRootOnOneOf2PushImpl();
		return githubwfRootOnOneOf2Push;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2PushPatternProperties0 createGithubwfRootOnOneOf2PushPatternProperties0() {
		GithubwfRootOnOneOf2PushPatternProperties0Impl githubwfRootOnOneOf2PushPatternProperties0 = new GithubwfRootOnOneOf2PushPatternProperties0Impl();
		return githubwfRootOnOneOf2PushPatternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2PushPatternProperties0Items createGithubwfRootOnOneOf2PushPatternProperties0Items() {
		GithubwfRootOnOneOf2PushPatternProperties0ItemsImpl githubwfRootOnOneOf2PushPatternProperties0Items = new GithubwfRootOnOneOf2PushPatternProperties0ItemsImpl();
		return githubwfRootOnOneOf2PushPatternProperties0Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Registry_package createGithubwfRootOnOneOf2Registry_package() {
		GithubwfRootOnOneOf2Registry_packageImpl githubwfRootOnOneOf2Registry_package = new GithubwfRootOnOneOf2Registry_packageImpl();
		return githubwfRootOnOneOf2Registry_package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Registry_packageTypes createGithubwfRootOnOneOf2Registry_packageTypes() {
		GithubwfRootOnOneOf2Registry_packageTypesImpl githubwfRootOnOneOf2Registry_packageTypes = new GithubwfRootOnOneOf2Registry_packageTypesImpl();
		return githubwfRootOnOneOf2Registry_packageTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Registry_packageTypesItems createGithubwfRootOnOneOf2Registry_packageTypesItems() {
		GithubwfRootOnOneOf2Registry_packageTypesItemsImpl githubwfRootOnOneOf2Registry_packageTypesItems = new GithubwfRootOnOneOf2Registry_packageTypesItemsImpl();
		return githubwfRootOnOneOf2Registry_packageTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Release createGithubwfRootOnOneOf2Release() {
		GithubwfRootOnOneOf2ReleaseImpl githubwfRootOnOneOf2Release = new GithubwfRootOnOneOf2ReleaseImpl();
		return githubwfRootOnOneOf2Release;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2ReleaseTypes createGithubwfRootOnOneOf2ReleaseTypes() {
		GithubwfRootOnOneOf2ReleaseTypesImpl githubwfRootOnOneOf2ReleaseTypes = new GithubwfRootOnOneOf2ReleaseTypesImpl();
		return githubwfRootOnOneOf2ReleaseTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2ReleaseTypesItems createGithubwfRootOnOneOf2ReleaseTypesItems() {
		GithubwfRootOnOneOf2ReleaseTypesItemsImpl githubwfRootOnOneOf2ReleaseTypesItems = new GithubwfRootOnOneOf2ReleaseTypesItemsImpl();
		return githubwfRootOnOneOf2ReleaseTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Status createGithubwfRootOnOneOf2Status() {
		GithubwfRootOnOneOf2StatusImpl githubwfRootOnOneOf2Status = new GithubwfRootOnOneOf2StatusImpl();
		return githubwfRootOnOneOf2Status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Watch createGithubwfRootOnOneOf2Watch() {
		GithubwfRootOnOneOf2WatchImpl githubwfRootOnOneOf2Watch = new GithubwfRootOnOneOf2WatchImpl();
		return githubwfRootOnOneOf2Watch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_call createGithubwfRootOnOneOf2Workflow_call() {
		GithubwfRootOnOneOf2Workflow_callImpl githubwfRootOnOneOf2Workflow_call = new GithubwfRootOnOneOf2Workflow_callImpl();
		return githubwfRootOnOneOf2Workflow_call;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callInputs createGithubwfRootOnOneOf2Workflow_callInputs() {
		GithubwfRootOnOneOf2Workflow_callInputsImpl githubwfRootOnOneOf2Workflow_callInputs = new GithubwfRootOnOneOf2Workflow_callInputsImpl();
		return githubwfRootOnOneOf2Workflow_callInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0 createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0() {
		GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Impl githubwfRootOnOneOf2Workflow_callInputsPatternProperties0 = new GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Impl();
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Description createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Description() {
		GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DescriptionImpl githubwfRootOnOneOf2Workflow_callInputsPatternProperties0Description = new GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DescriptionImpl();
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0Description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage() {
		GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessageImpl githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage = new GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessageImpl();
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required() {
		GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0RequiredImpl githubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required = new GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0RequiredImpl();
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type() {
		GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0TypeImpl githubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type = new GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0TypeImpl();
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default() {
		GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultImpl githubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default = new GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultImpl();
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecrets createGithubwfRootOnOneOf2Workflow_callSecrets() {
		GithubwfRootOnOneOf2Workflow_callSecretsImpl githubwfRootOnOneOf2Workflow_callSecrets = new GithubwfRootOnOneOf2Workflow_callSecretsImpl();
		return githubwfRootOnOneOf2Workflow_callSecrets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0 createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Impl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0 = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Impl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Description createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Description() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0DescriptionImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Description = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0DescriptionImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatch createGithubwfRootOnOneOf2Workflow_dispatch() {
		GithubwfRootOnOneOf2Workflow_dispatchImpl githubwfRootOnOneOf2Workflow_dispatch = new GithubwfRootOnOneOf2Workflow_dispatchImpl();
		return githubwfRootOnOneOf2Workflow_dispatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputs createGithubwfRootOnOneOf2Workflow_dispatchInputs() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsImpl githubwfRootOnOneOf2Workflow_dispatchInputs = new GithubwfRootOnOneOf2Workflow_dispatchInputsImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0 createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Impl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0 = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Impl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Description createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Description() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DescriptionImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Description = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DescriptionImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessage createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessage() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessageImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessage = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessageImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Required createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Required() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0RequiredImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Required = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0RequiredImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0TypeImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0TypeImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItems createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItems() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItemsImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItems = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItemsImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0 createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Impl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0 = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Impl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1 createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Impl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1 = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Impl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_run createGithubwfRootOnOneOf2Workflow_run() {
		GithubwfRootOnOneOf2Workflow_runImpl githubwfRootOnOneOf2Workflow_run = new GithubwfRootOnOneOf2Workflow_runImpl();
		return githubwfRootOnOneOf2Workflow_run;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_runTypes createGithubwfRootOnOneOf2Workflow_runTypes() {
		GithubwfRootOnOneOf2Workflow_runTypesImpl githubwfRootOnOneOf2Workflow_runTypes = new GithubwfRootOnOneOf2Workflow_runTypesImpl();
		return githubwfRootOnOneOf2Workflow_runTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_runTypesItems createGithubwfRootOnOneOf2Workflow_runTypesItems() {
		GithubwfRootOnOneOf2Workflow_runTypesItemsImpl githubwfRootOnOneOf2Workflow_runTypesItems = new GithubwfRootOnOneOf2Workflow_runTypesItemsImpl();
		return githubwfRootOnOneOf2Workflow_runTypesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_runWorkflows createGithubwfRootOnOneOf2Workflow_runWorkflows() {
		GithubwfRootOnOneOf2Workflow_runWorkflowsImpl githubwfRootOnOneOf2Workflow_runWorkflows = new GithubwfRootOnOneOf2Workflow_runWorkflowsImpl();
		return githubwfRootOnOneOf2Workflow_runWorkflows;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_runWorkflowsItems createGithubwfRootOnOneOf2Workflow_runWorkflowsItems() {
		GithubwfRootOnOneOf2Workflow_runWorkflowsItemsImpl githubwfRootOnOneOf2Workflow_runWorkflowsItems = new GithubwfRootOnOneOf2Workflow_runWorkflowsItemsImpl();
		return githubwfRootOnOneOf2Workflow_runWorkflowsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_runPatternProperties0 createGithubwfRootOnOneOf2Workflow_runPatternProperties0() {
		GithubwfRootOnOneOf2Workflow_runPatternProperties0Impl githubwfRootOnOneOf2Workflow_runPatternProperties0 = new GithubwfRootOnOneOf2Workflow_runPatternProperties0Impl();
		return githubwfRootOnOneOf2Workflow_runPatternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Repository_dispatch createGithubwfRootOnOneOf2Repository_dispatch() {
		GithubwfRootOnOneOf2Repository_dispatchImpl githubwfRootOnOneOf2Repository_dispatch = new GithubwfRootOnOneOf2Repository_dispatchImpl();
		return githubwfRootOnOneOf2Repository_dispatch;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Schedule createGithubwfRootOnOneOf2Schedule() {
		GithubwfRootOnOneOf2ScheduleImpl githubwfRootOnOneOf2Schedule = new GithubwfRootOnOneOf2ScheduleImpl();
		return githubwfRootOnOneOf2Schedule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2ScheduleItems createGithubwfRootOnOneOf2ScheduleItems() {
		GithubwfRootOnOneOf2ScheduleItemsImpl githubwfRootOnOneOf2ScheduleItems = new GithubwfRootOnOneOf2ScheduleItemsImpl();
		return githubwfRootOnOneOf2ScheduleItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2ScheduleItemsCron createGithubwfRootOnOneOf2ScheduleItemsCron() {
		GithubwfRootOnOneOf2ScheduleItemsCronImpl githubwfRootOnOneOf2ScheduleItemsCron = new GithubwfRootOnOneOf2ScheduleItemsCronImpl();
		return githubwfRootOnOneOf2ScheduleItemsCron;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootEnv createGithubwfRootEnv() {
		GithubwfRootEnvImpl githubwfRootEnv = new GithubwfRootEnvImpl();
		return githubwfRootEnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootDefaults createGithubwfRootDefaults() {
		GithubwfRootDefaultsImpl githubwfRootDefaults = new GithubwfRootDefaultsImpl();
		return githubwfRootDefaults;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootConcurrency createGithubwfRootConcurrency() {
		GithubwfRootConcurrencyImpl githubwfRootConcurrency = new GithubwfRootConcurrencyImpl();
		return githubwfRootConcurrency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootConcurrencyOneOf0 createGithubwfRootConcurrencyOneOf0() {
		GithubwfRootConcurrencyOneOf0Impl githubwfRootConcurrencyOneOf0 = new GithubwfRootConcurrencyOneOf0Impl();
		return githubwfRootConcurrencyOneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootConcurrencyOneOf1 createGithubwfRootConcurrencyOneOf1() {
		GithubwfRootConcurrencyOneOf1Impl githubwfRootConcurrencyOneOf1 = new GithubwfRootConcurrencyOneOf1Impl();
		return githubwfRootConcurrencyOneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootJobs createGithubwfRootJobs() {
		GithubwfRootJobsImpl githubwfRootJobs = new GithubwfRootJobsImpl();
		return githubwfRootJobs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootJobsPatternProperties0 createGithubwfRootJobsPatternProperties0() {
		GithubwfRootJobsPatternProperties0Impl githubwfRootJobsPatternProperties0 = new GithubwfRootJobsPatternProperties0Impl();
		return githubwfRootJobsPatternProperties0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootJobsPatternProperties0OneOf0 createGithubwfRootJobsPatternProperties0OneOf0() {
		GithubwfRootJobsPatternProperties0OneOf0Impl githubwfRootJobsPatternProperties0OneOf0 = new GithubwfRootJobsPatternProperties0OneOf0Impl();
		return githubwfRootJobsPatternProperties0OneOf0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootJobsPatternProperties0OneOf1 createGithubwfRootJobsPatternProperties0OneOf1() {
		GithubwfRootJobsPatternProperties0OneOf1Impl githubwfRootJobsPatternProperties0OneOf1 = new GithubwfRootJobsPatternProperties0OneOf1Impl();
		return githubwfRootJobsPatternProperties0OneOf1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootRun_45name createGithubwfRootRun_45name() {
		GithubwfRootRun_45nameImpl githubwfRootRun_45name = new GithubwfRootRun_45nameImpl();
		return githubwfRootRun_45name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootPermissions createGithubwfRootPermissions() {
		GithubwfRootPermissionsImpl githubwfRootPermissions = new GithubwfRootPermissionsImpl();
		return githubwfRootPermissions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf0Tuple createNormalJobRuns_45onOneOf1AnyOf0Tuple() {
		NormalJobRuns_45onOneOf1AnyOf0TupleImpl normalJobRuns_45onOneOf1AnyOf0Tuple = new NormalJobRuns_45onOneOf1AnyOf0TupleImpl();
		return normalJobRuns_45onOneOf1AnyOf0Tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf1Tuple createNormalJobRuns_45onOneOf1AnyOf1Tuple() {
		NormalJobRuns_45onOneOf1AnyOf1TupleImpl normalJobRuns_45onOneOf1AnyOf1Tuple = new NormalJobRuns_45onOneOf1AnyOf1TupleImpl();
		return normalJobRuns_45onOneOf1AnyOf1Tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2Tuple createNormalJobRuns_45onOneOf1AnyOf2Tuple() {
		NormalJobRuns_45onOneOf1AnyOf2TupleImpl normalJobRuns_45onOneOf1AnyOf2Tuple = new NormalJobRuns_45onOneOf1AnyOf2TupleImpl();
		return normalJobRuns_45onOneOf1AnyOf2Tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf3Tuple createNormalJobRuns_45onOneOf1AnyOf3Tuple() {
		NormalJobRuns_45onOneOf1AnyOf3TupleImpl normalJobRuns_45onOneOf1AnyOf3Tuple = new NormalJobRuns_45onOneOf1AnyOf3TupleImpl();
		return normalJobRuns_45onOneOf1AnyOf3Tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf4Tuple createNormalJobRuns_45onOneOf1AnyOf4Tuple() {
		NormalJobRuns_45onOneOf1AnyOf4TupleImpl normalJobRuns_45onOneOf1AnyOf4Tuple = new NormalJobRuns_45onOneOf1AnyOf4TupleImpl();
		return normalJobRuns_45onOneOf1AnyOf4Tuple;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyCancel_45in_45progressTypeString createConcurrencyCancel_45in_45progressTypeString() {
		ConcurrencyCancel_45in_45progressTypeStringImpl concurrencyCancel_45in_45progressTypeString = new ConcurrencyCancel_45in_45progressTypeStringImpl();
		return concurrencyCancel_45in_45progressTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyCancel_45in_45progressTypeInteger createConcurrencyCancel_45in_45progressTypeInteger() {
		ConcurrencyCancel_45in_45progressTypeIntegerImpl concurrencyCancel_45in_45progressTypeInteger = new ConcurrencyCancel_45in_45progressTypeIntegerImpl();
		return concurrencyCancel_45in_45progressTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyCancel_45in_45progressTypeNumber createConcurrencyCancel_45in_45progressTypeNumber() {
		ConcurrencyCancel_45in_45progressTypeNumberImpl concurrencyCancel_45in_45progressTypeNumber = new ConcurrencyCancel_45in_45progressTypeNumberImpl();
		return concurrencyCancel_45in_45progressTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyCancel_45in_45progressTypeBoolean createConcurrencyCancel_45in_45progressTypeBoolean() {
		ConcurrencyCancel_45in_45progressTypeBooleanImpl concurrencyCancel_45in_45progressTypeBoolean = new ConcurrencyCancel_45in_45progressTypeBooleanImpl();
		return concurrencyCancel_45in_45progressTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyCancel_45in_45progressTypeObject createConcurrencyCancel_45in_45progressTypeObject() {
		ConcurrencyCancel_45in_45progressTypeObjectImpl concurrencyCancel_45in_45progressTypeObject = new ConcurrencyCancel_45in_45progressTypeObjectImpl();
		return concurrencyCancel_45in_45progressTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyCancel_45in_45progressAdditionalProperties createConcurrencyCancel_45in_45progressAdditionalProperties() {
		ConcurrencyCancel_45in_45progressAdditionalPropertiesImpl concurrencyCancel_45in_45progressAdditionalProperties = new ConcurrencyCancel_45in_45progressAdditionalPropertiesImpl();
		return concurrencyCancel_45in_45progressAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyCancel_45in_45progressTypeArray createConcurrencyCancel_45in_45progressTypeArray() {
		ConcurrencyCancel_45in_45progressTypeArrayImpl concurrencyCancel_45in_45progressTypeArray = new ConcurrencyCancel_45in_45progressTypeArrayImpl();
		return concurrencyCancel_45in_45progressTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyCancel_45in_45progressItems createConcurrencyCancel_45in_45progressItems() {
		ConcurrencyCancel_45in_45progressItemsImpl concurrencyCancel_45in_45progressItems = new ConcurrencyCancel_45in_45progressItemsImpl();
		return concurrencyCancel_45in_45progressItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConcurrencyCancel_45in_45progressTypeNull createConcurrencyCancel_45in_45progressTypeNull() {
		ConcurrencyCancel_45in_45progressTypeNullImpl concurrencyCancel_45in_45progressTypeNull = new ConcurrencyCancel_45in_45progressTypeNullImpl();
		return concurrencyCancel_45in_45progressTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationTypeString createConfigurationTypeString() {
		ConfigurationTypeStringImpl configurationTypeString = new ConfigurationTypeStringImpl();
		return configurationTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationTypeInteger createConfigurationTypeInteger() {
		ConfigurationTypeIntegerImpl configurationTypeInteger = new ConfigurationTypeIntegerImpl();
		return configurationTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationTypeNumber createConfigurationTypeNumber() {
		ConfigurationTypeNumberImpl configurationTypeNumber = new ConfigurationTypeNumberImpl();
		return configurationTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationTypeBoolean createConfigurationTypeBoolean() {
		ConfigurationTypeBooleanImpl configurationTypeBoolean = new ConfigurationTypeBooleanImpl();
		return configurationTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationTypeObject createConfigurationTypeObject() {
		ConfigurationTypeObjectImpl configurationTypeObject = new ConfigurationTypeObjectImpl();
		return configurationTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationAdditionalProperties createConfigurationAdditionalProperties() {
		ConfigurationAdditionalPropertiesImpl configurationAdditionalProperties = new ConfigurationAdditionalPropertiesImpl();
		return configurationAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationTypeArray createConfigurationTypeArray() {
		ConfigurationTypeArrayImpl configurationTypeArray = new ConfigurationTypeArrayImpl();
		return configurationTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationItems createConfigurationItems() {
		ConfigurationItemsImpl configurationItems = new ConfigurationItemsImpl();
		return configurationItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConfigurationTypeNull createConfigurationTypeNull() {
		ConfigurationTypeNullImpl configurationTypeNull = new ConfigurationTypeNullImpl();
		return configurationTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerCredentialsAdditionalProperties createContainerCredentialsAdditionalProperties() {
		ContainerCredentialsAdditionalPropertiesImpl containerCredentialsAdditionalProperties = new ContainerCredentialsAdditionalPropertiesImpl();
		return containerCredentialsAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPortsItemsTypeString createContainerPortsItemsTypeString() {
		ContainerPortsItemsTypeStringImpl containerPortsItemsTypeString = new ContainerPortsItemsTypeStringImpl();
		return containerPortsItemsTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPortsItemsTypeInteger createContainerPortsItemsTypeInteger() {
		ContainerPortsItemsTypeIntegerImpl containerPortsItemsTypeInteger = new ContainerPortsItemsTypeIntegerImpl();
		return containerPortsItemsTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPortsItemsTypeNumber createContainerPortsItemsTypeNumber() {
		ContainerPortsItemsTypeNumberImpl containerPortsItemsTypeNumber = new ContainerPortsItemsTypeNumberImpl();
		return containerPortsItemsTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPortsItemsTypeBoolean createContainerPortsItemsTypeBoolean() {
		ContainerPortsItemsTypeBooleanImpl containerPortsItemsTypeBoolean = new ContainerPortsItemsTypeBooleanImpl();
		return containerPortsItemsTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPortsItemsTypeObject createContainerPortsItemsTypeObject() {
		ContainerPortsItemsTypeObjectImpl containerPortsItemsTypeObject = new ContainerPortsItemsTypeObjectImpl();
		return containerPortsItemsTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPortsItemsAdditionalProperties createContainerPortsItemsAdditionalProperties() {
		ContainerPortsItemsAdditionalPropertiesImpl containerPortsItemsAdditionalProperties = new ContainerPortsItemsAdditionalPropertiesImpl();
		return containerPortsItemsAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPortsItemsTypeArray createContainerPortsItemsTypeArray() {
		ContainerPortsItemsTypeArrayImpl containerPortsItemsTypeArray = new ContainerPortsItemsTypeArrayImpl();
		return containerPortsItemsTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPortsItemsItems createContainerPortsItemsItems() {
		ContainerPortsItemsItemsImpl containerPortsItemsItems = new ContainerPortsItemsItemsImpl();
		return containerPortsItemsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ContainerPortsItemsTypeNull createContainerPortsItemsTypeNull() {
		ContainerPortsItemsTypeNullImpl containerPortsItemsTypeNull = new ContainerPortsItemsTypeNullImpl();
		return containerPortsItemsTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsTypeString createPermissionsTypeString() {
		PermissionsTypeStringImpl permissionsTypeString = new PermissionsTypeStringImpl();
		return permissionsTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsTypeInteger createPermissionsTypeInteger() {
		PermissionsTypeIntegerImpl permissionsTypeInteger = new PermissionsTypeIntegerImpl();
		return permissionsTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsTypeNumber createPermissionsTypeNumber() {
		PermissionsTypeNumberImpl permissionsTypeNumber = new PermissionsTypeNumberImpl();
		return permissionsTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsTypeBoolean createPermissionsTypeBoolean() {
		PermissionsTypeBooleanImpl permissionsTypeBoolean = new PermissionsTypeBooleanImpl();
		return permissionsTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsTypeObject createPermissionsTypeObject() {
		PermissionsTypeObjectImpl permissionsTypeObject = new PermissionsTypeObjectImpl();
		return permissionsTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsAdditionalProperties createPermissionsAdditionalProperties() {
		PermissionsAdditionalPropertiesImpl permissionsAdditionalProperties = new PermissionsAdditionalPropertiesImpl();
		return permissionsAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsTypeArray createPermissionsTypeArray() {
		PermissionsTypeArrayImpl permissionsTypeArray = new PermissionsTypeArrayImpl();
		return permissionsTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsItems createPermissionsItems() {
		PermissionsItemsImpl permissionsItems = new PermissionsItemsImpl();
		return permissionsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PermissionsTypeNull createPermissionsTypeNull() {
		PermissionsTypeNullImpl permissionsTypeNull = new PermissionsTypeNullImpl();
		return permissionsTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvTypeString createEnvTypeString() {
		EnvTypeStringImpl envTypeString = new EnvTypeStringImpl();
		return envTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvTypeInteger createEnvTypeInteger() {
		EnvTypeIntegerImpl envTypeInteger = new EnvTypeIntegerImpl();
		return envTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvTypeNumber createEnvTypeNumber() {
		EnvTypeNumberImpl envTypeNumber = new EnvTypeNumberImpl();
		return envTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvTypeBoolean createEnvTypeBoolean() {
		EnvTypeBooleanImpl envTypeBoolean = new EnvTypeBooleanImpl();
		return envTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvTypeObject createEnvTypeObject() {
		EnvTypeObjectImpl envTypeObject = new EnvTypeObjectImpl();
		return envTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvAdditionalProperties createEnvAdditionalProperties() {
		EnvAdditionalPropertiesImpl envAdditionalProperties = new EnvAdditionalPropertiesImpl();
		return envAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvTypeArray createEnvTypeArray() {
		EnvTypeArrayImpl envTypeArray = new EnvTypeArrayImpl();
		return envTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvItems createEnvItems() {
		EnvItemsImpl envItems = new EnvItemsImpl();
		return envItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvTypeNull createEnvTypeNull() {
		EnvTypeNullImpl envTypeNull = new EnvTypeNullImpl();
		return envTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf0AdditionalPropertiesTypeString createEnvOneOf0AdditionalPropertiesTypeString() {
		EnvOneOf0AdditionalPropertiesTypeStringImpl envOneOf0AdditionalPropertiesTypeString = new EnvOneOf0AdditionalPropertiesTypeStringImpl();
		return envOneOf0AdditionalPropertiesTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf0AdditionalPropertiesTypeInteger createEnvOneOf0AdditionalPropertiesTypeInteger() {
		EnvOneOf0AdditionalPropertiesTypeIntegerImpl envOneOf0AdditionalPropertiesTypeInteger = new EnvOneOf0AdditionalPropertiesTypeIntegerImpl();
		return envOneOf0AdditionalPropertiesTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf0AdditionalPropertiesTypeNumber createEnvOneOf0AdditionalPropertiesTypeNumber() {
		EnvOneOf0AdditionalPropertiesTypeNumberImpl envOneOf0AdditionalPropertiesTypeNumber = new EnvOneOf0AdditionalPropertiesTypeNumberImpl();
		return envOneOf0AdditionalPropertiesTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf0AdditionalPropertiesTypeBoolean createEnvOneOf0AdditionalPropertiesTypeBoolean() {
		EnvOneOf0AdditionalPropertiesTypeBooleanImpl envOneOf0AdditionalPropertiesTypeBoolean = new EnvOneOf0AdditionalPropertiesTypeBooleanImpl();
		return envOneOf0AdditionalPropertiesTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf0AdditionalPropertiesTypeObject createEnvOneOf0AdditionalPropertiesTypeObject() {
		EnvOneOf0AdditionalPropertiesTypeObjectImpl envOneOf0AdditionalPropertiesTypeObject = new EnvOneOf0AdditionalPropertiesTypeObjectImpl();
		return envOneOf0AdditionalPropertiesTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf0AdditionalPropertiesAdditionalProperties createEnvOneOf0AdditionalPropertiesAdditionalProperties() {
		EnvOneOf0AdditionalPropertiesAdditionalPropertiesImpl envOneOf0AdditionalPropertiesAdditionalProperties = new EnvOneOf0AdditionalPropertiesAdditionalPropertiesImpl();
		return envOneOf0AdditionalPropertiesAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf0AdditionalPropertiesTypeArray createEnvOneOf0AdditionalPropertiesTypeArray() {
		EnvOneOf0AdditionalPropertiesTypeArrayImpl envOneOf0AdditionalPropertiesTypeArray = new EnvOneOf0AdditionalPropertiesTypeArrayImpl();
		return envOneOf0AdditionalPropertiesTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf0AdditionalPropertiesItems createEnvOneOf0AdditionalPropertiesItems() {
		EnvOneOf0AdditionalPropertiesItemsImpl envOneOf0AdditionalPropertiesItems = new EnvOneOf0AdditionalPropertiesItemsImpl();
		return envOneOf0AdditionalPropertiesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EnvOneOf0AdditionalPropertiesTypeNull createEnvOneOf0AdditionalPropertiesTypeNull() {
		EnvOneOf0AdditionalPropertiesTypeNullImpl envOneOf0AdditionalPropertiesTypeNull = new EnvOneOf0AdditionalPropertiesTypeNullImpl();
		return envOneOf0AdditionalPropertiesTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObjectTypeString createEventObjectTypeString() {
		EventObjectTypeStringImpl eventObjectTypeString = new EventObjectTypeStringImpl();
		return eventObjectTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObjectTypeInteger createEventObjectTypeInteger() {
		EventObjectTypeIntegerImpl eventObjectTypeInteger = new EventObjectTypeIntegerImpl();
		return eventObjectTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObjectTypeNumber createEventObjectTypeNumber() {
		EventObjectTypeNumberImpl eventObjectTypeNumber = new EventObjectTypeNumberImpl();
		return eventObjectTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObjectTypeBoolean createEventObjectTypeBoolean() {
		EventObjectTypeBooleanImpl eventObjectTypeBoolean = new EventObjectTypeBooleanImpl();
		return eventObjectTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObjectTypeObject createEventObjectTypeObject() {
		EventObjectTypeObjectImpl eventObjectTypeObject = new EventObjectTypeObjectImpl();
		return eventObjectTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObjectTypeArray createEventObjectTypeArray() {
		EventObjectTypeArrayImpl eventObjectTypeArray = new EventObjectTypeArrayImpl();
		return eventObjectTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObjectItems createEventObjectItems() {
		EventObjectItemsImpl eventObjectItems = new EventObjectItemsImpl();
		return eventObjectItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObjectTypeNull createEventObjectTypeNull() {
		EventObjectTypeNullImpl eventObjectTypeNull = new EventObjectTypeNullImpl();
		return eventObjectTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EventObjectOneOf0AdditionalProperties createEventObjectOneOf0AdditionalProperties() {
		EventObjectOneOf0AdditionalPropertiesImpl eventObjectOneOf0AdditionalProperties = new EventObjectOneOf0AdditionalPropertiesImpl();
		return eventObjectOneOf0AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefTypeString createRefTypeString() {
		RefTypeStringImpl refTypeString = new RefTypeStringImpl();
		return refTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefTypeInteger createRefTypeInteger() {
		RefTypeIntegerImpl refTypeInteger = new RefTypeIntegerImpl();
		return refTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefTypeNumber createRefTypeNumber() {
		RefTypeNumberImpl refTypeNumber = new RefTypeNumberImpl();
		return refTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefTypeBoolean createRefTypeBoolean() {
		RefTypeBooleanImpl refTypeBoolean = new RefTypeBooleanImpl();
		return refTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefTypeObject createRefTypeObject() {
		RefTypeObjectImpl refTypeObject = new RefTypeObjectImpl();
		return refTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefAdditionalProperties createRefAdditionalProperties() {
		RefAdditionalPropertiesImpl refAdditionalProperties = new RefAdditionalPropertiesImpl();
		return refAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefTypeArray createRefTypeArray() {
		RefTypeArrayImpl refTypeArray = new RefTypeArrayImpl();
		return refTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefItems createRefItems() {
		RefItemsImpl refItems = new RefItemsImpl();
		return refItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefTypeNull createRefTypeNull() {
		RefTypeNullImpl refTypeNull = new RefTypeNullImpl();
		return refTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AdditionalProperties createRefOneOf0AdditionalProperties() {
		RefOneOf0AdditionalPropertiesImpl refOneOf0AdditionalProperties = new RefOneOf0AdditionalPropertiesImpl();
		return refOneOf0AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0TypeString createRefOneOf0AllOf0TypeString() {
		RefOneOf0AllOf0TypeStringImpl refOneOf0AllOf0TypeString = new RefOneOf0AllOf0TypeStringImpl();
		return refOneOf0AllOf0TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0TypeInteger createRefOneOf0AllOf0TypeInteger() {
		RefOneOf0AllOf0TypeIntegerImpl refOneOf0AllOf0TypeInteger = new RefOneOf0AllOf0TypeIntegerImpl();
		return refOneOf0AllOf0TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0TypeNumber createRefOneOf0AllOf0TypeNumber() {
		RefOneOf0AllOf0TypeNumberImpl refOneOf0AllOf0TypeNumber = new RefOneOf0AllOf0TypeNumberImpl();
		return refOneOf0AllOf0TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0TypeBoolean createRefOneOf0AllOf0TypeBoolean() {
		RefOneOf0AllOf0TypeBooleanImpl refOneOf0AllOf0TypeBoolean = new RefOneOf0AllOf0TypeBooleanImpl();
		return refOneOf0AllOf0TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0TypeObject createRefOneOf0AllOf0TypeObject() {
		RefOneOf0AllOf0TypeObjectImpl refOneOf0AllOf0TypeObject = new RefOneOf0AllOf0TypeObjectImpl();
		return refOneOf0AllOf0TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0AdditionalProperties createRefOneOf0AllOf0AdditionalProperties() {
		RefOneOf0AllOf0AdditionalPropertiesImpl refOneOf0AllOf0AdditionalProperties = new RefOneOf0AllOf0AdditionalPropertiesImpl();
		return refOneOf0AllOf0AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0TypeArray createRefOneOf0AllOf0TypeArray() {
		RefOneOf0AllOf0TypeArrayImpl refOneOf0AllOf0TypeArray = new RefOneOf0AllOf0TypeArrayImpl();
		return refOneOf0AllOf0TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0Items createRefOneOf0AllOf0Items() {
		RefOneOf0AllOf0ItemsImpl refOneOf0AllOf0Items = new RefOneOf0AllOf0ItemsImpl();
		return refOneOf0AllOf0Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0TypeNull createRefOneOf0AllOf0TypeNull() {
		RefOneOf0AllOf0TypeNullImpl refOneOf0AllOf0TypeNull = new RefOneOf0AllOf0TypeNullImpl();
		return refOneOf0AllOf0TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0NotTypeString createRefOneOf0AllOf0NotTypeString() {
		RefOneOf0AllOf0NotTypeStringImpl refOneOf0AllOf0NotTypeString = new RefOneOf0AllOf0NotTypeStringImpl();
		return refOneOf0AllOf0NotTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0NotTypeInteger createRefOneOf0AllOf0NotTypeInteger() {
		RefOneOf0AllOf0NotTypeIntegerImpl refOneOf0AllOf0NotTypeInteger = new RefOneOf0AllOf0NotTypeIntegerImpl();
		return refOneOf0AllOf0NotTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0NotTypeNumber createRefOneOf0AllOf0NotTypeNumber() {
		RefOneOf0AllOf0NotTypeNumberImpl refOneOf0AllOf0NotTypeNumber = new RefOneOf0AllOf0NotTypeNumberImpl();
		return refOneOf0AllOf0NotTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0NotTypeBoolean createRefOneOf0AllOf0NotTypeBoolean() {
		RefOneOf0AllOf0NotTypeBooleanImpl refOneOf0AllOf0NotTypeBoolean = new RefOneOf0AllOf0NotTypeBooleanImpl();
		return refOneOf0AllOf0NotTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0NotTypeObject createRefOneOf0AllOf0NotTypeObject() {
		RefOneOf0AllOf0NotTypeObjectImpl refOneOf0AllOf0NotTypeObject = new RefOneOf0AllOf0NotTypeObjectImpl();
		return refOneOf0AllOf0NotTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0NotAdditionalProperties createRefOneOf0AllOf0NotAdditionalProperties() {
		RefOneOf0AllOf0NotAdditionalPropertiesImpl refOneOf0AllOf0NotAdditionalProperties = new RefOneOf0AllOf0NotAdditionalPropertiesImpl();
		return refOneOf0AllOf0NotAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0NotTypeArray createRefOneOf0AllOf0NotTypeArray() {
		RefOneOf0AllOf0NotTypeArrayImpl refOneOf0AllOf0NotTypeArray = new RefOneOf0AllOf0NotTypeArrayImpl();
		return refOneOf0AllOf0NotTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0NotItems createRefOneOf0AllOf0NotItems() {
		RefOneOf0AllOf0NotItemsImpl refOneOf0AllOf0NotItems = new RefOneOf0AllOf0NotItemsImpl();
		return refOneOf0AllOf0NotItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf0NotTypeNull createRefOneOf0AllOf0NotTypeNull() {
		RefOneOf0AllOf0NotTypeNullImpl refOneOf0AllOf0NotTypeNull = new RefOneOf0AllOf0NotTypeNullImpl();
		return refOneOf0AllOf0NotTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1TypeString createRefOneOf0AllOf1TypeString() {
		RefOneOf0AllOf1TypeStringImpl refOneOf0AllOf1TypeString = new RefOneOf0AllOf1TypeStringImpl();
		return refOneOf0AllOf1TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1TypeInteger createRefOneOf0AllOf1TypeInteger() {
		RefOneOf0AllOf1TypeIntegerImpl refOneOf0AllOf1TypeInteger = new RefOneOf0AllOf1TypeIntegerImpl();
		return refOneOf0AllOf1TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1TypeNumber createRefOneOf0AllOf1TypeNumber() {
		RefOneOf0AllOf1TypeNumberImpl refOneOf0AllOf1TypeNumber = new RefOneOf0AllOf1TypeNumberImpl();
		return refOneOf0AllOf1TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1TypeBoolean createRefOneOf0AllOf1TypeBoolean() {
		RefOneOf0AllOf1TypeBooleanImpl refOneOf0AllOf1TypeBoolean = new RefOneOf0AllOf1TypeBooleanImpl();
		return refOneOf0AllOf1TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1TypeObject createRefOneOf0AllOf1TypeObject() {
		RefOneOf0AllOf1TypeObjectImpl refOneOf0AllOf1TypeObject = new RefOneOf0AllOf1TypeObjectImpl();
		return refOneOf0AllOf1TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1AdditionalProperties createRefOneOf0AllOf1AdditionalProperties() {
		RefOneOf0AllOf1AdditionalPropertiesImpl refOneOf0AllOf1AdditionalProperties = new RefOneOf0AllOf1AdditionalPropertiesImpl();
		return refOneOf0AllOf1AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1TypeArray createRefOneOf0AllOf1TypeArray() {
		RefOneOf0AllOf1TypeArrayImpl refOneOf0AllOf1TypeArray = new RefOneOf0AllOf1TypeArrayImpl();
		return refOneOf0AllOf1TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1Items createRefOneOf0AllOf1Items() {
		RefOneOf0AllOf1ItemsImpl refOneOf0AllOf1Items = new RefOneOf0AllOf1ItemsImpl();
		return refOneOf0AllOf1Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1TypeNull createRefOneOf0AllOf1TypeNull() {
		RefOneOf0AllOf1TypeNullImpl refOneOf0AllOf1TypeNull = new RefOneOf0AllOf1TypeNullImpl();
		return refOneOf0AllOf1TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1NotTypeString createRefOneOf0AllOf1NotTypeString() {
		RefOneOf0AllOf1NotTypeStringImpl refOneOf0AllOf1NotTypeString = new RefOneOf0AllOf1NotTypeStringImpl();
		return refOneOf0AllOf1NotTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1NotTypeInteger createRefOneOf0AllOf1NotTypeInteger() {
		RefOneOf0AllOf1NotTypeIntegerImpl refOneOf0AllOf1NotTypeInteger = new RefOneOf0AllOf1NotTypeIntegerImpl();
		return refOneOf0AllOf1NotTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1NotTypeNumber createRefOneOf0AllOf1NotTypeNumber() {
		RefOneOf0AllOf1NotTypeNumberImpl refOneOf0AllOf1NotTypeNumber = new RefOneOf0AllOf1NotTypeNumberImpl();
		return refOneOf0AllOf1NotTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1NotTypeBoolean createRefOneOf0AllOf1NotTypeBoolean() {
		RefOneOf0AllOf1NotTypeBooleanImpl refOneOf0AllOf1NotTypeBoolean = new RefOneOf0AllOf1NotTypeBooleanImpl();
		return refOneOf0AllOf1NotTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1NotTypeObject createRefOneOf0AllOf1NotTypeObject() {
		RefOneOf0AllOf1NotTypeObjectImpl refOneOf0AllOf1NotTypeObject = new RefOneOf0AllOf1NotTypeObjectImpl();
		return refOneOf0AllOf1NotTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1NotAdditionalProperties createRefOneOf0AllOf1NotAdditionalProperties() {
		RefOneOf0AllOf1NotAdditionalPropertiesImpl refOneOf0AllOf1NotAdditionalProperties = new RefOneOf0AllOf1NotAdditionalPropertiesImpl();
		return refOneOf0AllOf1NotAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1NotTypeArray createRefOneOf0AllOf1NotTypeArray() {
		RefOneOf0AllOf1NotTypeArrayImpl refOneOf0AllOf1NotTypeArray = new RefOneOf0AllOf1NotTypeArrayImpl();
		return refOneOf0AllOf1NotTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1NotItems createRefOneOf0AllOf1NotItems() {
		RefOneOf0AllOf1NotItemsImpl refOneOf0AllOf1NotItems = new RefOneOf0AllOf1NotItemsImpl();
		return refOneOf0AllOf1NotItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf1NotTypeNull createRefOneOf0AllOf1NotTypeNull() {
		RefOneOf0AllOf1NotTypeNullImpl refOneOf0AllOf1NotTypeNull = new RefOneOf0AllOf1NotTypeNullImpl();
		return refOneOf0AllOf1NotTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2TypeString createRefOneOf0AllOf2TypeString() {
		RefOneOf0AllOf2TypeStringImpl refOneOf0AllOf2TypeString = new RefOneOf0AllOf2TypeStringImpl();
		return refOneOf0AllOf2TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2TypeInteger createRefOneOf0AllOf2TypeInteger() {
		RefOneOf0AllOf2TypeIntegerImpl refOneOf0AllOf2TypeInteger = new RefOneOf0AllOf2TypeIntegerImpl();
		return refOneOf0AllOf2TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2TypeNumber createRefOneOf0AllOf2TypeNumber() {
		RefOneOf0AllOf2TypeNumberImpl refOneOf0AllOf2TypeNumber = new RefOneOf0AllOf2TypeNumberImpl();
		return refOneOf0AllOf2TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2TypeBoolean createRefOneOf0AllOf2TypeBoolean() {
		RefOneOf0AllOf2TypeBooleanImpl refOneOf0AllOf2TypeBoolean = new RefOneOf0AllOf2TypeBooleanImpl();
		return refOneOf0AllOf2TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2TypeObject createRefOneOf0AllOf2TypeObject() {
		RefOneOf0AllOf2TypeObjectImpl refOneOf0AllOf2TypeObject = new RefOneOf0AllOf2TypeObjectImpl();
		return refOneOf0AllOf2TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2AdditionalProperties createRefOneOf0AllOf2AdditionalProperties() {
		RefOneOf0AllOf2AdditionalPropertiesImpl refOneOf0AllOf2AdditionalProperties = new RefOneOf0AllOf2AdditionalPropertiesImpl();
		return refOneOf0AllOf2AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2TypeArray createRefOneOf0AllOf2TypeArray() {
		RefOneOf0AllOf2TypeArrayImpl refOneOf0AllOf2TypeArray = new RefOneOf0AllOf2TypeArrayImpl();
		return refOneOf0AllOf2TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2Items createRefOneOf0AllOf2Items() {
		RefOneOf0AllOf2ItemsImpl refOneOf0AllOf2Items = new RefOneOf0AllOf2ItemsImpl();
		return refOneOf0AllOf2Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2TypeNull createRefOneOf0AllOf2TypeNull() {
		RefOneOf0AllOf2TypeNullImpl refOneOf0AllOf2TypeNull = new RefOneOf0AllOf2TypeNullImpl();
		return refOneOf0AllOf2TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2NotTypeString createRefOneOf0AllOf2NotTypeString() {
		RefOneOf0AllOf2NotTypeStringImpl refOneOf0AllOf2NotTypeString = new RefOneOf0AllOf2NotTypeStringImpl();
		return refOneOf0AllOf2NotTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2NotTypeInteger createRefOneOf0AllOf2NotTypeInteger() {
		RefOneOf0AllOf2NotTypeIntegerImpl refOneOf0AllOf2NotTypeInteger = new RefOneOf0AllOf2NotTypeIntegerImpl();
		return refOneOf0AllOf2NotTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2NotTypeNumber createRefOneOf0AllOf2NotTypeNumber() {
		RefOneOf0AllOf2NotTypeNumberImpl refOneOf0AllOf2NotTypeNumber = new RefOneOf0AllOf2NotTypeNumberImpl();
		return refOneOf0AllOf2NotTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2NotTypeBoolean createRefOneOf0AllOf2NotTypeBoolean() {
		RefOneOf0AllOf2NotTypeBooleanImpl refOneOf0AllOf2NotTypeBoolean = new RefOneOf0AllOf2NotTypeBooleanImpl();
		return refOneOf0AllOf2NotTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2NotTypeObject createRefOneOf0AllOf2NotTypeObject() {
		RefOneOf0AllOf2NotTypeObjectImpl refOneOf0AllOf2NotTypeObject = new RefOneOf0AllOf2NotTypeObjectImpl();
		return refOneOf0AllOf2NotTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2NotAdditionalProperties createRefOneOf0AllOf2NotAdditionalProperties() {
		RefOneOf0AllOf2NotAdditionalPropertiesImpl refOneOf0AllOf2NotAdditionalProperties = new RefOneOf0AllOf2NotAdditionalPropertiesImpl();
		return refOneOf0AllOf2NotAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2NotTypeArray createRefOneOf0AllOf2NotTypeArray() {
		RefOneOf0AllOf2NotTypeArrayImpl refOneOf0AllOf2NotTypeArray = new RefOneOf0AllOf2NotTypeArrayImpl();
		return refOneOf0AllOf2NotTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2NotItems createRefOneOf0AllOf2NotItems() {
		RefOneOf0AllOf2NotItemsImpl refOneOf0AllOf2NotItems = new RefOneOf0AllOf2NotItemsImpl();
		return refOneOf0AllOf2NotItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RefOneOf0AllOf2NotTypeNull createRefOneOf0AllOf2NotTypeNull() {
		RefOneOf0AllOf2NotTypeNullImpl refOneOf0AllOf2NotTypeNull = new RefOneOf0AllOf2NotTypeNullImpl();
		return refOneOf0AllOf2NotTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShellTypeString createShellTypeString() {
		ShellTypeStringImpl shellTypeString = new ShellTypeStringImpl();
		return shellTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShellTypeInteger createShellTypeInteger() {
		ShellTypeIntegerImpl shellTypeInteger = new ShellTypeIntegerImpl();
		return shellTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShellTypeNumber createShellTypeNumber() {
		ShellTypeNumberImpl shellTypeNumber = new ShellTypeNumberImpl();
		return shellTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShellTypeBoolean createShellTypeBoolean() {
		ShellTypeBooleanImpl shellTypeBoolean = new ShellTypeBooleanImpl();
		return shellTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShellTypeObject createShellTypeObject() {
		ShellTypeObjectImpl shellTypeObject = new ShellTypeObjectImpl();
		return shellTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShellAdditionalProperties createShellAdditionalProperties() {
		ShellAdditionalPropertiesImpl shellAdditionalProperties = new ShellAdditionalPropertiesImpl();
		return shellAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShellTypeArray createShellTypeArray() {
		ShellTypeArrayImpl shellTypeArray = new ShellTypeArrayImpl();
		return shellTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShellItems createShellItems() {
		ShellItemsImpl shellItems = new ShellItemsImpl();
		return shellItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ShellTypeNull createShellTypeNull() {
		ShellTypeNullImpl shellTypeNull = new ShellTypeNullImpl();
		return shellTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypesItems createTypesItems() {
		TypesItemsImpl typesItems = new TypesItemsImpl();
		return typesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeedsTypeString createJobNeedsTypeString() {
		JobNeedsTypeStringImpl jobNeedsTypeString = new JobNeedsTypeStringImpl();
		return jobNeedsTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeedsTypeInteger createJobNeedsTypeInteger() {
		JobNeedsTypeIntegerImpl jobNeedsTypeInteger = new JobNeedsTypeIntegerImpl();
		return jobNeedsTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeedsTypeNumber createJobNeedsTypeNumber() {
		JobNeedsTypeNumberImpl jobNeedsTypeNumber = new JobNeedsTypeNumberImpl();
		return jobNeedsTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeedsTypeBoolean createJobNeedsTypeBoolean() {
		JobNeedsTypeBooleanImpl jobNeedsTypeBoolean = new JobNeedsTypeBooleanImpl();
		return jobNeedsTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeedsTypeObject createJobNeedsTypeObject() {
		JobNeedsTypeObjectImpl jobNeedsTypeObject = new JobNeedsTypeObjectImpl();
		return jobNeedsTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeedsAdditionalProperties createJobNeedsAdditionalProperties() {
		JobNeedsAdditionalPropertiesImpl jobNeedsAdditionalProperties = new JobNeedsAdditionalPropertiesImpl();
		return jobNeedsAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeedsTypeArray createJobNeedsTypeArray() {
		JobNeedsTypeArrayImpl jobNeedsTypeArray = new JobNeedsTypeArrayImpl();
		return jobNeedsTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeedsItems createJobNeedsItems() {
		JobNeedsItemsImpl jobNeedsItems = new JobNeedsItemsImpl();
		return jobNeedsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JobNeedsTypeNull createJobNeedsTypeNull() {
		JobNeedsTypeNullImpl jobNeedsTypeNull = new JobNeedsTypeNullImpl();
		return jobNeedsTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobIfTypeBoolean createReusableWorkflowCallJobIfTypeBoolean() {
		ReusableWorkflowCallJobIfTypeBooleanImpl reusableWorkflowCallJobIfTypeBoolean = new ReusableWorkflowCallJobIfTypeBooleanImpl();
		return reusableWorkflowCallJobIfTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobIfTypeNumber createReusableWorkflowCallJobIfTypeNumber() {
		ReusableWorkflowCallJobIfTypeNumberImpl reusableWorkflowCallJobIfTypeNumber = new ReusableWorkflowCallJobIfTypeNumberImpl();
		return reusableWorkflowCallJobIfTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobIfTypeString createReusableWorkflowCallJobIfTypeString() {
		ReusableWorkflowCallJobIfTypeStringImpl reusableWorkflowCallJobIfTypeString = new ReusableWorkflowCallJobIfTypeStringImpl();
		return reusableWorkflowCallJobIfTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobSecretsTypeString createReusableWorkflowCallJobSecretsTypeString() {
		ReusableWorkflowCallJobSecretsTypeStringImpl reusableWorkflowCallJobSecretsTypeString = new ReusableWorkflowCallJobSecretsTypeStringImpl();
		return reusableWorkflowCallJobSecretsTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobSecretsTypeInteger createReusableWorkflowCallJobSecretsTypeInteger() {
		ReusableWorkflowCallJobSecretsTypeIntegerImpl reusableWorkflowCallJobSecretsTypeInteger = new ReusableWorkflowCallJobSecretsTypeIntegerImpl();
		return reusableWorkflowCallJobSecretsTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobSecretsTypeNumber createReusableWorkflowCallJobSecretsTypeNumber() {
		ReusableWorkflowCallJobSecretsTypeNumberImpl reusableWorkflowCallJobSecretsTypeNumber = new ReusableWorkflowCallJobSecretsTypeNumberImpl();
		return reusableWorkflowCallJobSecretsTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobSecretsTypeBoolean createReusableWorkflowCallJobSecretsTypeBoolean() {
		ReusableWorkflowCallJobSecretsTypeBooleanImpl reusableWorkflowCallJobSecretsTypeBoolean = new ReusableWorkflowCallJobSecretsTypeBooleanImpl();
		return reusableWorkflowCallJobSecretsTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobSecretsTypeObject createReusableWorkflowCallJobSecretsTypeObject() {
		ReusableWorkflowCallJobSecretsTypeObjectImpl reusableWorkflowCallJobSecretsTypeObject = new ReusableWorkflowCallJobSecretsTypeObjectImpl();
		return reusableWorkflowCallJobSecretsTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobSecretsAdditionalProperties createReusableWorkflowCallJobSecretsAdditionalProperties() {
		ReusableWorkflowCallJobSecretsAdditionalPropertiesImpl reusableWorkflowCallJobSecretsAdditionalProperties = new ReusableWorkflowCallJobSecretsAdditionalPropertiesImpl();
		return reusableWorkflowCallJobSecretsAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobSecretsTypeArray createReusableWorkflowCallJobSecretsTypeArray() {
		ReusableWorkflowCallJobSecretsTypeArrayImpl reusableWorkflowCallJobSecretsTypeArray = new ReusableWorkflowCallJobSecretsTypeArrayImpl();
		return reusableWorkflowCallJobSecretsTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobSecretsItems createReusableWorkflowCallJobSecretsItems() {
		ReusableWorkflowCallJobSecretsItemsImpl reusableWorkflowCallJobSecretsItems = new ReusableWorkflowCallJobSecretsItemsImpl();
		return reusableWorkflowCallJobSecretsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobSecretsTypeNull createReusableWorkflowCallJobSecretsTypeNull() {
		ReusableWorkflowCallJobSecretsTypeNullImpl reusableWorkflowCallJobSecretsTypeNull = new ReusableWorkflowCallJobSecretsTypeNullImpl();
		return reusableWorkflowCallJobSecretsTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixTypeString createReusableWorkflowCallJobStrategyMatrixTypeString() {
		ReusableWorkflowCallJobStrategyMatrixTypeStringImpl reusableWorkflowCallJobStrategyMatrixTypeString = new ReusableWorkflowCallJobStrategyMatrixTypeStringImpl();
		return reusableWorkflowCallJobStrategyMatrixTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixTypeInteger createReusableWorkflowCallJobStrategyMatrixTypeInteger() {
		ReusableWorkflowCallJobStrategyMatrixTypeIntegerImpl reusableWorkflowCallJobStrategyMatrixTypeInteger = new ReusableWorkflowCallJobStrategyMatrixTypeIntegerImpl();
		return reusableWorkflowCallJobStrategyMatrixTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixTypeNumber createReusableWorkflowCallJobStrategyMatrixTypeNumber() {
		ReusableWorkflowCallJobStrategyMatrixTypeNumberImpl reusableWorkflowCallJobStrategyMatrixTypeNumber = new ReusableWorkflowCallJobStrategyMatrixTypeNumberImpl();
		return reusableWorkflowCallJobStrategyMatrixTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixTypeBoolean createReusableWorkflowCallJobStrategyMatrixTypeBoolean() {
		ReusableWorkflowCallJobStrategyMatrixTypeBooleanImpl reusableWorkflowCallJobStrategyMatrixTypeBoolean = new ReusableWorkflowCallJobStrategyMatrixTypeBooleanImpl();
		return reusableWorkflowCallJobStrategyMatrixTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixTypeObject createReusableWorkflowCallJobStrategyMatrixTypeObject() {
		ReusableWorkflowCallJobStrategyMatrixTypeObjectImpl reusableWorkflowCallJobStrategyMatrixTypeObject = new ReusableWorkflowCallJobStrategyMatrixTypeObjectImpl();
		return reusableWorkflowCallJobStrategyMatrixTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixTypeArray createReusableWorkflowCallJobStrategyMatrixTypeArray() {
		ReusableWorkflowCallJobStrategyMatrixTypeArrayImpl reusableWorkflowCallJobStrategyMatrixTypeArray = new ReusableWorkflowCallJobStrategyMatrixTypeArrayImpl();
		return reusableWorkflowCallJobStrategyMatrixTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixItems createReusableWorkflowCallJobStrategyMatrixItems() {
		ReusableWorkflowCallJobStrategyMatrixItemsImpl reusableWorkflowCallJobStrategyMatrixItems = new ReusableWorkflowCallJobStrategyMatrixItemsImpl();
		return reusableWorkflowCallJobStrategyMatrixItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixTypeNull createReusableWorkflowCallJobStrategyMatrixTypeNull() {
		ReusableWorkflowCallJobStrategyMatrixTypeNullImpl reusableWorkflowCallJobStrategyMatrixTypeNull = new ReusableWorkflowCallJobStrategyMatrixTypeNullImpl();
		return reusableWorkflowCallJobStrategyMatrixTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties createReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties() {
		ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesImpl reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties = new ReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesImpl();
		return reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString() {
		ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeStringImpl reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString = new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeStringImpl();
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger() {
		ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeIntegerImpl reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger = new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeIntegerImpl();
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber() {
		ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumberImpl reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber = new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumberImpl();
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean() {
		ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBooleanImpl reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean = new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBooleanImpl();
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject() {
		ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectImpl reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject = new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectImpl();
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties() {
		ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesImpl reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties = new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesImpl();
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray() {
		ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayImpl reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray = new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayImpl();
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems() {
		ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItemsImpl reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems = new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItemsImpl();
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull createReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull() {
		ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNullImpl reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull = new ReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNullImpl();
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobConcurrencyTypeString createReusableWorkflowCallJobConcurrencyTypeString() {
		ReusableWorkflowCallJobConcurrencyTypeStringImpl reusableWorkflowCallJobConcurrencyTypeString = new ReusableWorkflowCallJobConcurrencyTypeStringImpl();
		return reusableWorkflowCallJobConcurrencyTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobConcurrencyTypeInteger createReusableWorkflowCallJobConcurrencyTypeInteger() {
		ReusableWorkflowCallJobConcurrencyTypeIntegerImpl reusableWorkflowCallJobConcurrencyTypeInteger = new ReusableWorkflowCallJobConcurrencyTypeIntegerImpl();
		return reusableWorkflowCallJobConcurrencyTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobConcurrencyTypeNumber createReusableWorkflowCallJobConcurrencyTypeNumber() {
		ReusableWorkflowCallJobConcurrencyTypeNumberImpl reusableWorkflowCallJobConcurrencyTypeNumber = new ReusableWorkflowCallJobConcurrencyTypeNumberImpl();
		return reusableWorkflowCallJobConcurrencyTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobConcurrencyTypeBoolean createReusableWorkflowCallJobConcurrencyTypeBoolean() {
		ReusableWorkflowCallJobConcurrencyTypeBooleanImpl reusableWorkflowCallJobConcurrencyTypeBoolean = new ReusableWorkflowCallJobConcurrencyTypeBooleanImpl();
		return reusableWorkflowCallJobConcurrencyTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobConcurrencyTypeObject createReusableWorkflowCallJobConcurrencyTypeObject() {
		ReusableWorkflowCallJobConcurrencyTypeObjectImpl reusableWorkflowCallJobConcurrencyTypeObject = new ReusableWorkflowCallJobConcurrencyTypeObjectImpl();
		return reusableWorkflowCallJobConcurrencyTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobConcurrencyAdditionalProperties createReusableWorkflowCallJobConcurrencyAdditionalProperties() {
		ReusableWorkflowCallJobConcurrencyAdditionalPropertiesImpl reusableWorkflowCallJobConcurrencyAdditionalProperties = new ReusableWorkflowCallJobConcurrencyAdditionalPropertiesImpl();
		return reusableWorkflowCallJobConcurrencyAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobConcurrencyTypeArray createReusableWorkflowCallJobConcurrencyTypeArray() {
		ReusableWorkflowCallJobConcurrencyTypeArrayImpl reusableWorkflowCallJobConcurrencyTypeArray = new ReusableWorkflowCallJobConcurrencyTypeArrayImpl();
		return reusableWorkflowCallJobConcurrencyTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobConcurrencyItems createReusableWorkflowCallJobConcurrencyItems() {
		ReusableWorkflowCallJobConcurrencyItemsImpl reusableWorkflowCallJobConcurrencyItems = new ReusableWorkflowCallJobConcurrencyItemsImpl();
		return reusableWorkflowCallJobConcurrencyItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReusableWorkflowCallJobConcurrencyTypeNull createReusableWorkflowCallJobConcurrencyTypeNull() {
		ReusableWorkflowCallJobConcurrencyTypeNullImpl reusableWorkflowCallJobConcurrencyTypeNull = new ReusableWorkflowCallJobConcurrencyTypeNullImpl();
		return reusableWorkflowCallJobConcurrencyTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onTypeString createNormalJobRuns_45onTypeString() {
		NormalJobRuns_45onTypeStringImpl normalJobRuns_45onTypeString = new NormalJobRuns_45onTypeStringImpl();
		return normalJobRuns_45onTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onTypeInteger createNormalJobRuns_45onTypeInteger() {
		NormalJobRuns_45onTypeIntegerImpl normalJobRuns_45onTypeInteger = new NormalJobRuns_45onTypeIntegerImpl();
		return normalJobRuns_45onTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onTypeNumber createNormalJobRuns_45onTypeNumber() {
		NormalJobRuns_45onTypeNumberImpl normalJobRuns_45onTypeNumber = new NormalJobRuns_45onTypeNumberImpl();
		return normalJobRuns_45onTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onTypeBoolean createNormalJobRuns_45onTypeBoolean() {
		NormalJobRuns_45onTypeBooleanImpl normalJobRuns_45onTypeBoolean = new NormalJobRuns_45onTypeBooleanImpl();
		return normalJobRuns_45onTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onTypeObject createNormalJobRuns_45onTypeObject() {
		NormalJobRuns_45onTypeObjectImpl normalJobRuns_45onTypeObject = new NormalJobRuns_45onTypeObjectImpl();
		return normalJobRuns_45onTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onAdditionalProperties createNormalJobRuns_45onAdditionalProperties() {
		NormalJobRuns_45onAdditionalPropertiesImpl normalJobRuns_45onAdditionalProperties = new NormalJobRuns_45onAdditionalPropertiesImpl();
		return normalJobRuns_45onAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onTypeArray createNormalJobRuns_45onTypeArray() {
		NormalJobRuns_45onTypeArrayImpl normalJobRuns_45onTypeArray = new NormalJobRuns_45onTypeArrayImpl();
		return normalJobRuns_45onTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onItems createNormalJobRuns_45onItems() {
		NormalJobRuns_45onItemsImpl normalJobRuns_45onItems = new NormalJobRuns_45onItemsImpl();
		return normalJobRuns_45onItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onTypeNull createNormalJobRuns_45onTypeNull() {
		NormalJobRuns_45onTypeNullImpl normalJobRuns_45onTypeNull = new NormalJobRuns_45onTypeNullImpl();
		return normalJobRuns_45onTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1Items createNormalJobRuns_45onOneOf1Items() {
		NormalJobRuns_45onOneOf1ItemsImpl normalJobRuns_45onOneOf1Items = new NormalJobRuns_45onOneOf1ItemsImpl();
		return normalJobRuns_45onOneOf1Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf0TypeString createNormalJobRuns_45onOneOf1AnyOf0TypeString() {
		NormalJobRuns_45onOneOf1AnyOf0TypeStringImpl normalJobRuns_45onOneOf1AnyOf0TypeString = new NormalJobRuns_45onOneOf1AnyOf0TypeStringImpl();
		return normalJobRuns_45onOneOf1AnyOf0TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf0TypeInteger createNormalJobRuns_45onOneOf1AnyOf0TypeInteger() {
		NormalJobRuns_45onOneOf1AnyOf0TypeIntegerImpl normalJobRuns_45onOneOf1AnyOf0TypeInteger = new NormalJobRuns_45onOneOf1AnyOf0TypeIntegerImpl();
		return normalJobRuns_45onOneOf1AnyOf0TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf0TypeNumber createNormalJobRuns_45onOneOf1AnyOf0TypeNumber() {
		NormalJobRuns_45onOneOf1AnyOf0TypeNumberImpl normalJobRuns_45onOneOf1AnyOf0TypeNumber = new NormalJobRuns_45onOneOf1AnyOf0TypeNumberImpl();
		return normalJobRuns_45onOneOf1AnyOf0TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf0TypeBoolean createNormalJobRuns_45onOneOf1AnyOf0TypeBoolean() {
		NormalJobRuns_45onOneOf1AnyOf0TypeBooleanImpl normalJobRuns_45onOneOf1AnyOf0TypeBoolean = new NormalJobRuns_45onOneOf1AnyOf0TypeBooleanImpl();
		return normalJobRuns_45onOneOf1AnyOf0TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf0TypeObject createNormalJobRuns_45onOneOf1AnyOf0TypeObject() {
		NormalJobRuns_45onOneOf1AnyOf0TypeObjectImpl normalJobRuns_45onOneOf1AnyOf0TypeObject = new NormalJobRuns_45onOneOf1AnyOf0TypeObjectImpl();
		return normalJobRuns_45onOneOf1AnyOf0TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf0AdditionalProperties createNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties() {
		NormalJobRuns_45onOneOf1AnyOf0AdditionalPropertiesImpl normalJobRuns_45onOneOf1AnyOf0AdditionalProperties = new NormalJobRuns_45onOneOf1AnyOf0AdditionalPropertiesImpl();
		return normalJobRuns_45onOneOf1AnyOf0AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf0TypeArray createNormalJobRuns_45onOneOf1AnyOf0TypeArray() {
		NormalJobRuns_45onOneOf1AnyOf0TypeArrayImpl normalJobRuns_45onOneOf1AnyOf0TypeArray = new NormalJobRuns_45onOneOf1AnyOf0TypeArrayImpl();
		return normalJobRuns_45onOneOf1AnyOf0TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf0TypeNull createNormalJobRuns_45onOneOf1AnyOf0TypeNull() {
		NormalJobRuns_45onOneOf1AnyOf0TypeNullImpl normalJobRuns_45onOneOf1AnyOf0TypeNull = new NormalJobRuns_45onOneOf1AnyOf0TypeNullImpl();
		return normalJobRuns_45onOneOf1AnyOf0TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf1TypeString createNormalJobRuns_45onOneOf1AnyOf1TypeString() {
		NormalJobRuns_45onOneOf1AnyOf1TypeStringImpl normalJobRuns_45onOneOf1AnyOf1TypeString = new NormalJobRuns_45onOneOf1AnyOf1TypeStringImpl();
		return normalJobRuns_45onOneOf1AnyOf1TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf1TypeInteger createNormalJobRuns_45onOneOf1AnyOf1TypeInteger() {
		NormalJobRuns_45onOneOf1AnyOf1TypeIntegerImpl normalJobRuns_45onOneOf1AnyOf1TypeInteger = new NormalJobRuns_45onOneOf1AnyOf1TypeIntegerImpl();
		return normalJobRuns_45onOneOf1AnyOf1TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf1TypeNumber createNormalJobRuns_45onOneOf1AnyOf1TypeNumber() {
		NormalJobRuns_45onOneOf1AnyOf1TypeNumberImpl normalJobRuns_45onOneOf1AnyOf1TypeNumber = new NormalJobRuns_45onOneOf1AnyOf1TypeNumberImpl();
		return normalJobRuns_45onOneOf1AnyOf1TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf1TypeBoolean createNormalJobRuns_45onOneOf1AnyOf1TypeBoolean() {
		NormalJobRuns_45onOneOf1AnyOf1TypeBooleanImpl normalJobRuns_45onOneOf1AnyOf1TypeBoolean = new NormalJobRuns_45onOneOf1AnyOf1TypeBooleanImpl();
		return normalJobRuns_45onOneOf1AnyOf1TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf1TypeObject createNormalJobRuns_45onOneOf1AnyOf1TypeObject() {
		NormalJobRuns_45onOneOf1AnyOf1TypeObjectImpl normalJobRuns_45onOneOf1AnyOf1TypeObject = new NormalJobRuns_45onOneOf1AnyOf1TypeObjectImpl();
		return normalJobRuns_45onOneOf1AnyOf1TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf1AdditionalProperties createNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties() {
		NormalJobRuns_45onOneOf1AnyOf1AdditionalPropertiesImpl normalJobRuns_45onOneOf1AnyOf1AdditionalProperties = new NormalJobRuns_45onOneOf1AnyOf1AdditionalPropertiesImpl();
		return normalJobRuns_45onOneOf1AnyOf1AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf1TypeArray createNormalJobRuns_45onOneOf1AnyOf1TypeArray() {
		NormalJobRuns_45onOneOf1AnyOf1TypeArrayImpl normalJobRuns_45onOneOf1AnyOf1TypeArray = new NormalJobRuns_45onOneOf1AnyOf1TypeArrayImpl();
		return normalJobRuns_45onOneOf1AnyOf1TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf1TypeNull createNormalJobRuns_45onOneOf1AnyOf1TypeNull() {
		NormalJobRuns_45onOneOf1AnyOf1TypeNullImpl normalJobRuns_45onOneOf1AnyOf1TypeNull = new NormalJobRuns_45onOneOf1AnyOf1TypeNullImpl();
		return normalJobRuns_45onOneOf1AnyOf1TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2TypeString createNormalJobRuns_45onOneOf1AnyOf2TypeString() {
		NormalJobRuns_45onOneOf1AnyOf2TypeStringImpl normalJobRuns_45onOneOf1AnyOf2TypeString = new NormalJobRuns_45onOneOf1AnyOf2TypeStringImpl();
		return normalJobRuns_45onOneOf1AnyOf2TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2TypeInteger createNormalJobRuns_45onOneOf1AnyOf2TypeInteger() {
		NormalJobRuns_45onOneOf1AnyOf2TypeIntegerImpl normalJobRuns_45onOneOf1AnyOf2TypeInteger = new NormalJobRuns_45onOneOf1AnyOf2TypeIntegerImpl();
		return normalJobRuns_45onOneOf1AnyOf2TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2TypeNumber createNormalJobRuns_45onOneOf1AnyOf2TypeNumber() {
		NormalJobRuns_45onOneOf1AnyOf2TypeNumberImpl normalJobRuns_45onOneOf1AnyOf2TypeNumber = new NormalJobRuns_45onOneOf1AnyOf2TypeNumberImpl();
		return normalJobRuns_45onOneOf1AnyOf2TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2TypeBoolean createNormalJobRuns_45onOneOf1AnyOf2TypeBoolean() {
		NormalJobRuns_45onOneOf1AnyOf2TypeBooleanImpl normalJobRuns_45onOneOf1AnyOf2TypeBoolean = new NormalJobRuns_45onOneOf1AnyOf2TypeBooleanImpl();
		return normalJobRuns_45onOneOf1AnyOf2TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2TypeObject createNormalJobRuns_45onOneOf1AnyOf2TypeObject() {
		NormalJobRuns_45onOneOf1AnyOf2TypeObjectImpl normalJobRuns_45onOneOf1AnyOf2TypeObject = new NormalJobRuns_45onOneOf1AnyOf2TypeObjectImpl();
		return normalJobRuns_45onOneOf1AnyOf2TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2AdditionalProperties createNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties() {
		NormalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesImpl normalJobRuns_45onOneOf1AnyOf2AdditionalProperties = new NormalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesImpl();
		return normalJobRuns_45onOneOf1AnyOf2AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2TypeArray createNormalJobRuns_45onOneOf1AnyOf2TypeArray() {
		NormalJobRuns_45onOneOf1AnyOf2TypeArrayImpl normalJobRuns_45onOneOf1AnyOf2TypeArray = new NormalJobRuns_45onOneOf1AnyOf2TypeArrayImpl();
		return normalJobRuns_45onOneOf1AnyOf2TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf2TypeNull createNormalJobRuns_45onOneOf1AnyOf2TypeNull() {
		NormalJobRuns_45onOneOf1AnyOf2TypeNullImpl normalJobRuns_45onOneOf1AnyOf2TypeNull = new NormalJobRuns_45onOneOf1AnyOf2TypeNullImpl();
		return normalJobRuns_45onOneOf1AnyOf2TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf3TypeString createNormalJobRuns_45onOneOf1AnyOf3TypeString() {
		NormalJobRuns_45onOneOf1AnyOf3TypeStringImpl normalJobRuns_45onOneOf1AnyOf3TypeString = new NormalJobRuns_45onOneOf1AnyOf3TypeStringImpl();
		return normalJobRuns_45onOneOf1AnyOf3TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf3TypeInteger createNormalJobRuns_45onOneOf1AnyOf3TypeInteger() {
		NormalJobRuns_45onOneOf1AnyOf3TypeIntegerImpl normalJobRuns_45onOneOf1AnyOf3TypeInteger = new NormalJobRuns_45onOneOf1AnyOf3TypeIntegerImpl();
		return normalJobRuns_45onOneOf1AnyOf3TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf3TypeNumber createNormalJobRuns_45onOneOf1AnyOf3TypeNumber() {
		NormalJobRuns_45onOneOf1AnyOf3TypeNumberImpl normalJobRuns_45onOneOf1AnyOf3TypeNumber = new NormalJobRuns_45onOneOf1AnyOf3TypeNumberImpl();
		return normalJobRuns_45onOneOf1AnyOf3TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf3TypeBoolean createNormalJobRuns_45onOneOf1AnyOf3TypeBoolean() {
		NormalJobRuns_45onOneOf1AnyOf3TypeBooleanImpl normalJobRuns_45onOneOf1AnyOf3TypeBoolean = new NormalJobRuns_45onOneOf1AnyOf3TypeBooleanImpl();
		return normalJobRuns_45onOneOf1AnyOf3TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf3TypeObject createNormalJobRuns_45onOneOf1AnyOf3TypeObject() {
		NormalJobRuns_45onOneOf1AnyOf3TypeObjectImpl normalJobRuns_45onOneOf1AnyOf3TypeObject = new NormalJobRuns_45onOneOf1AnyOf3TypeObjectImpl();
		return normalJobRuns_45onOneOf1AnyOf3TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf3AdditionalProperties createNormalJobRuns_45onOneOf1AnyOf3AdditionalProperties() {
		NormalJobRuns_45onOneOf1AnyOf3AdditionalPropertiesImpl normalJobRuns_45onOneOf1AnyOf3AdditionalProperties = new NormalJobRuns_45onOneOf1AnyOf3AdditionalPropertiesImpl();
		return normalJobRuns_45onOneOf1AnyOf3AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf3TypeArray createNormalJobRuns_45onOneOf1AnyOf3TypeArray() {
		NormalJobRuns_45onOneOf1AnyOf3TypeArrayImpl normalJobRuns_45onOneOf1AnyOf3TypeArray = new NormalJobRuns_45onOneOf1AnyOf3TypeArrayImpl();
		return normalJobRuns_45onOneOf1AnyOf3TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf3TypeNull createNormalJobRuns_45onOneOf1AnyOf3TypeNull() {
		NormalJobRuns_45onOneOf1AnyOf3TypeNullImpl normalJobRuns_45onOneOf1AnyOf3TypeNull = new NormalJobRuns_45onOneOf1AnyOf3TypeNullImpl();
		return normalJobRuns_45onOneOf1AnyOf3TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf4TypeString createNormalJobRuns_45onOneOf1AnyOf4TypeString() {
		NormalJobRuns_45onOneOf1AnyOf4TypeStringImpl normalJobRuns_45onOneOf1AnyOf4TypeString = new NormalJobRuns_45onOneOf1AnyOf4TypeStringImpl();
		return normalJobRuns_45onOneOf1AnyOf4TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf4TypeInteger createNormalJobRuns_45onOneOf1AnyOf4TypeInteger() {
		NormalJobRuns_45onOneOf1AnyOf4TypeIntegerImpl normalJobRuns_45onOneOf1AnyOf4TypeInteger = new NormalJobRuns_45onOneOf1AnyOf4TypeIntegerImpl();
		return normalJobRuns_45onOneOf1AnyOf4TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf4TypeNumber createNormalJobRuns_45onOneOf1AnyOf4TypeNumber() {
		NormalJobRuns_45onOneOf1AnyOf4TypeNumberImpl normalJobRuns_45onOneOf1AnyOf4TypeNumber = new NormalJobRuns_45onOneOf1AnyOf4TypeNumberImpl();
		return normalJobRuns_45onOneOf1AnyOf4TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf4TypeBoolean createNormalJobRuns_45onOneOf1AnyOf4TypeBoolean() {
		NormalJobRuns_45onOneOf1AnyOf4TypeBooleanImpl normalJobRuns_45onOneOf1AnyOf4TypeBoolean = new NormalJobRuns_45onOneOf1AnyOf4TypeBooleanImpl();
		return normalJobRuns_45onOneOf1AnyOf4TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf4TypeObject createNormalJobRuns_45onOneOf1AnyOf4TypeObject() {
		NormalJobRuns_45onOneOf1AnyOf4TypeObjectImpl normalJobRuns_45onOneOf1AnyOf4TypeObject = new NormalJobRuns_45onOneOf1AnyOf4TypeObjectImpl();
		return normalJobRuns_45onOneOf1AnyOf4TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf4AdditionalProperties createNormalJobRuns_45onOneOf1AnyOf4AdditionalProperties() {
		NormalJobRuns_45onOneOf1AnyOf4AdditionalPropertiesImpl normalJobRuns_45onOneOf1AnyOf4AdditionalProperties = new NormalJobRuns_45onOneOf1AnyOf4AdditionalPropertiesImpl();
		return normalJobRuns_45onOneOf1AnyOf4AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf4TypeArray createNormalJobRuns_45onOneOf1AnyOf4TypeArray() {
		NormalJobRuns_45onOneOf1AnyOf4TypeArrayImpl normalJobRuns_45onOneOf1AnyOf4TypeArray = new NormalJobRuns_45onOneOf1AnyOf4TypeArrayImpl();
		return normalJobRuns_45onOneOf1AnyOf4TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobRuns_45onOneOf1AnyOf4TypeNull createNormalJobRuns_45onOneOf1AnyOf4TypeNull() {
		NormalJobRuns_45onOneOf1AnyOf4TypeNullImpl normalJobRuns_45onOneOf1AnyOf4TypeNull = new NormalJobRuns_45onOneOf1AnyOf4TypeNullImpl();
		return normalJobRuns_45onOneOf1AnyOf4TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobEnvironmentTypeString createNormalJobEnvironmentTypeString() {
		NormalJobEnvironmentTypeStringImpl normalJobEnvironmentTypeString = new NormalJobEnvironmentTypeStringImpl();
		return normalJobEnvironmentTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobEnvironmentTypeInteger createNormalJobEnvironmentTypeInteger() {
		NormalJobEnvironmentTypeIntegerImpl normalJobEnvironmentTypeInteger = new NormalJobEnvironmentTypeIntegerImpl();
		return normalJobEnvironmentTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobEnvironmentTypeNumber createNormalJobEnvironmentTypeNumber() {
		NormalJobEnvironmentTypeNumberImpl normalJobEnvironmentTypeNumber = new NormalJobEnvironmentTypeNumberImpl();
		return normalJobEnvironmentTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobEnvironmentTypeBoolean createNormalJobEnvironmentTypeBoolean() {
		NormalJobEnvironmentTypeBooleanImpl normalJobEnvironmentTypeBoolean = new NormalJobEnvironmentTypeBooleanImpl();
		return normalJobEnvironmentTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobEnvironmentTypeObject createNormalJobEnvironmentTypeObject() {
		NormalJobEnvironmentTypeObjectImpl normalJobEnvironmentTypeObject = new NormalJobEnvironmentTypeObjectImpl();
		return normalJobEnvironmentTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobEnvironmentAdditionalProperties createNormalJobEnvironmentAdditionalProperties() {
		NormalJobEnvironmentAdditionalPropertiesImpl normalJobEnvironmentAdditionalProperties = new NormalJobEnvironmentAdditionalPropertiesImpl();
		return normalJobEnvironmentAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobEnvironmentTypeArray createNormalJobEnvironmentTypeArray() {
		NormalJobEnvironmentTypeArrayImpl normalJobEnvironmentTypeArray = new NormalJobEnvironmentTypeArrayImpl();
		return normalJobEnvironmentTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobEnvironmentItems createNormalJobEnvironmentItems() {
		NormalJobEnvironmentItemsImpl normalJobEnvironmentItems = new NormalJobEnvironmentItemsImpl();
		return normalJobEnvironmentItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobEnvironmentTypeNull createNormalJobEnvironmentTypeNull() {
		NormalJobEnvironmentTypeNullImpl normalJobEnvironmentTypeNull = new NormalJobEnvironmentTypeNullImpl();
		return normalJobEnvironmentTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobIfTypeBoolean createNormalJobIfTypeBoolean() {
		NormalJobIfTypeBooleanImpl normalJobIfTypeBoolean = new NormalJobIfTypeBooleanImpl();
		return normalJobIfTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobIfTypeNumber createNormalJobIfTypeNumber() {
		NormalJobIfTypeNumberImpl normalJobIfTypeNumber = new NormalJobIfTypeNumberImpl();
		return normalJobIfTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobIfTypeString createNormalJobIfTypeString() {
		NormalJobIfTypeStringImpl normalJobIfTypeString = new NormalJobIfTypeStringImpl();
		return normalJobIfTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsTypeString createNormalJobStepsItemsTypeString() {
		NormalJobStepsItemsTypeStringImpl normalJobStepsItemsTypeString = new NormalJobStepsItemsTypeStringImpl();
		return normalJobStepsItemsTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsTypeInteger createNormalJobStepsItemsTypeInteger() {
		NormalJobStepsItemsTypeIntegerImpl normalJobStepsItemsTypeInteger = new NormalJobStepsItemsTypeIntegerImpl();
		return normalJobStepsItemsTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsTypeNumber createNormalJobStepsItemsTypeNumber() {
		NormalJobStepsItemsTypeNumberImpl normalJobStepsItemsTypeNumber = new NormalJobStepsItemsTypeNumberImpl();
		return normalJobStepsItemsTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsTypeBoolean createNormalJobStepsItemsTypeBoolean() {
		NormalJobStepsItemsTypeBooleanImpl normalJobStepsItemsTypeBoolean = new NormalJobStepsItemsTypeBooleanImpl();
		return normalJobStepsItemsTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsTypeObject createNormalJobStepsItemsTypeObject() {
		NormalJobStepsItemsTypeObjectImpl normalJobStepsItemsTypeObject = new NormalJobStepsItemsTypeObjectImpl();
		return normalJobStepsItemsTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAdditionalProperties createNormalJobStepsItemsAdditionalProperties() {
		NormalJobStepsItemsAdditionalPropertiesImpl normalJobStepsItemsAdditionalProperties = new NormalJobStepsItemsAdditionalPropertiesImpl();
		return normalJobStepsItemsAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsTypeArray createNormalJobStepsItemsTypeArray() {
		NormalJobStepsItemsTypeArrayImpl normalJobStepsItemsTypeArray = new NormalJobStepsItemsTypeArrayImpl();
		return normalJobStepsItemsTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsItems createNormalJobStepsItemsItems() {
		NormalJobStepsItemsItemsImpl normalJobStepsItemsItems = new NormalJobStepsItemsItemsImpl();
		return normalJobStepsItemsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsTypeNull createNormalJobStepsItemsTypeNull() {
		NormalJobStepsItemsTypeNullImpl normalJobStepsItemsTypeNull = new NormalJobStepsItemsTypeNullImpl();
		return normalJobStepsItemsTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0TypeString createNormalJobStepsItemsAllOf0TypeString() {
		NormalJobStepsItemsAllOf0TypeStringImpl normalJobStepsItemsAllOf0TypeString = new NormalJobStepsItemsAllOf0TypeStringImpl();
		return normalJobStepsItemsAllOf0TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0TypeInteger createNormalJobStepsItemsAllOf0TypeInteger() {
		NormalJobStepsItemsAllOf0TypeIntegerImpl normalJobStepsItemsAllOf0TypeInteger = new NormalJobStepsItemsAllOf0TypeIntegerImpl();
		return normalJobStepsItemsAllOf0TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0TypeNumber createNormalJobStepsItemsAllOf0TypeNumber() {
		NormalJobStepsItemsAllOf0TypeNumberImpl normalJobStepsItemsAllOf0TypeNumber = new NormalJobStepsItemsAllOf0TypeNumberImpl();
		return normalJobStepsItemsAllOf0TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0TypeBoolean createNormalJobStepsItemsAllOf0TypeBoolean() {
		NormalJobStepsItemsAllOf0TypeBooleanImpl normalJobStepsItemsAllOf0TypeBoolean = new NormalJobStepsItemsAllOf0TypeBooleanImpl();
		return normalJobStepsItemsAllOf0TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0TypeObject createNormalJobStepsItemsAllOf0TypeObject() {
		NormalJobStepsItemsAllOf0TypeObjectImpl normalJobStepsItemsAllOf0TypeObject = new NormalJobStepsItemsAllOf0TypeObjectImpl();
		return normalJobStepsItemsAllOf0TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0AdditionalProperties createNormalJobStepsItemsAllOf0AdditionalProperties() {
		NormalJobStepsItemsAllOf0AdditionalPropertiesImpl normalJobStepsItemsAllOf0AdditionalProperties = new NormalJobStepsItemsAllOf0AdditionalPropertiesImpl();
		return normalJobStepsItemsAllOf0AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0TypeArray createNormalJobStepsItemsAllOf0TypeArray() {
		NormalJobStepsItemsAllOf0TypeArrayImpl normalJobStepsItemsAllOf0TypeArray = new NormalJobStepsItemsAllOf0TypeArrayImpl();
		return normalJobStepsItemsAllOf0TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0Items createNormalJobStepsItemsAllOf0Items() {
		NormalJobStepsItemsAllOf0ItemsImpl normalJobStepsItemsAllOf0Items = new NormalJobStepsItemsAllOf0ItemsImpl();
		return normalJobStepsItemsAllOf0Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0TypeNull createNormalJobStepsItemsAllOf0TypeNull() {
		NormalJobStepsItemsAllOf0TypeNullImpl normalJobStepsItemsAllOf0TypeNull = new NormalJobStepsItemsAllOf0TypeNullImpl();
		return normalJobStepsItemsAllOf0TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0OneOf0AdditionalProperties createNormalJobStepsItemsAllOf0OneOf0AdditionalProperties() {
		NormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesImpl normalJobStepsItemsAllOf0OneOf0AdditionalProperties = new NormalJobStepsItemsAllOf0OneOf0AdditionalPropertiesImpl();
		return normalJobStepsItemsAllOf0OneOf0AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf0OneOf1AdditionalProperties createNormalJobStepsItemsAllOf0OneOf1AdditionalProperties() {
		NormalJobStepsItemsAllOf0OneOf1AdditionalPropertiesImpl normalJobStepsItemsAllOf0OneOf1AdditionalProperties = new NormalJobStepsItemsAllOf0OneOf1AdditionalPropertiesImpl();
		return normalJobStepsItemsAllOf0OneOf1AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1IfTypeBoolean createNormalJobStepsItemsAllOf1IfTypeBoolean() {
		NormalJobStepsItemsAllOf1IfTypeBooleanImpl normalJobStepsItemsAllOf1IfTypeBoolean = new NormalJobStepsItemsAllOf1IfTypeBooleanImpl();
		return normalJobStepsItemsAllOf1IfTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1IfTypeNumber createNormalJobStepsItemsAllOf1IfTypeNumber() {
		NormalJobStepsItemsAllOf1IfTypeNumberImpl normalJobStepsItemsAllOf1IfTypeNumber = new NormalJobStepsItemsAllOf1IfTypeNumberImpl();
		return normalJobStepsItemsAllOf1IfTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1IfTypeString createNormalJobStepsItemsAllOf1IfTypeString() {
		NormalJobStepsItemsAllOf1IfTypeStringImpl normalJobStepsItemsAllOf1IfTypeString = new NormalJobStepsItemsAllOf1IfTypeStringImpl();
		return normalJobStepsItemsAllOf1IfTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Continue_45on_45errorTypeString createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString() {
		NormalJobStepsItemsAllOf1Continue_45on_45errorTypeStringImpl normalJobStepsItemsAllOf1Continue_45on_45errorTypeString = new NormalJobStepsItemsAllOf1Continue_45on_45errorTypeStringImpl();
		return normalJobStepsItemsAllOf1Continue_45on_45errorTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger() {
		NormalJobStepsItemsAllOf1Continue_45on_45errorTypeIntegerImpl normalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger = new NormalJobStepsItemsAllOf1Continue_45on_45errorTypeIntegerImpl();
		return normalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber() {
		NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumberImpl normalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber = new NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumberImpl();
		return normalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean() {
		NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBooleanImpl normalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean = new NormalJobStepsItemsAllOf1Continue_45on_45errorTypeBooleanImpl();
		return normalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject() {
		NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectImpl normalJobStepsItemsAllOf1Continue_45on_45errorTypeObject = new NormalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectImpl();
		return normalJobStepsItemsAllOf1Continue_45on_45errorTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties createNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties() {
		NormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesImpl normalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties = new NormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesImpl();
		return normalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray() {
		NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayImpl normalJobStepsItemsAllOf1Continue_45on_45errorTypeArray = new NormalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayImpl();
		return normalJobStepsItemsAllOf1Continue_45on_45errorTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Continue_45on_45errorItems createNormalJobStepsItemsAllOf1Continue_45on_45errorItems() {
		NormalJobStepsItemsAllOf1Continue_45on_45errorItemsImpl normalJobStepsItemsAllOf1Continue_45on_45errorItems = new NormalJobStepsItemsAllOf1Continue_45on_45errorItemsImpl();
		return normalJobStepsItemsAllOf1Continue_45on_45errorItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull createNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull() {
		NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNullImpl normalJobStepsItemsAllOf1Continue_45on_45errorTypeNull = new NormalJobStepsItemsAllOf1Continue_45on_45errorTypeNullImpl();
		return normalJobStepsItemsAllOf1Continue_45on_45errorTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixTypeString createNormalJobStrategyMatrixTypeString() {
		NormalJobStrategyMatrixTypeStringImpl normalJobStrategyMatrixTypeString = new NormalJobStrategyMatrixTypeStringImpl();
		return normalJobStrategyMatrixTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixTypeInteger createNormalJobStrategyMatrixTypeInteger() {
		NormalJobStrategyMatrixTypeIntegerImpl normalJobStrategyMatrixTypeInteger = new NormalJobStrategyMatrixTypeIntegerImpl();
		return normalJobStrategyMatrixTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixTypeNumber createNormalJobStrategyMatrixTypeNumber() {
		NormalJobStrategyMatrixTypeNumberImpl normalJobStrategyMatrixTypeNumber = new NormalJobStrategyMatrixTypeNumberImpl();
		return normalJobStrategyMatrixTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixTypeBoolean createNormalJobStrategyMatrixTypeBoolean() {
		NormalJobStrategyMatrixTypeBooleanImpl normalJobStrategyMatrixTypeBoolean = new NormalJobStrategyMatrixTypeBooleanImpl();
		return normalJobStrategyMatrixTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixTypeObject createNormalJobStrategyMatrixTypeObject() {
		NormalJobStrategyMatrixTypeObjectImpl normalJobStrategyMatrixTypeObject = new NormalJobStrategyMatrixTypeObjectImpl();
		return normalJobStrategyMatrixTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixTypeArray createNormalJobStrategyMatrixTypeArray() {
		NormalJobStrategyMatrixTypeArrayImpl normalJobStrategyMatrixTypeArray = new NormalJobStrategyMatrixTypeArrayImpl();
		return normalJobStrategyMatrixTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixItems createNormalJobStrategyMatrixItems() {
		NormalJobStrategyMatrixItemsImpl normalJobStrategyMatrixItems = new NormalJobStrategyMatrixItemsImpl();
		return normalJobStrategyMatrixItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixTypeNull createNormalJobStrategyMatrixTypeNull() {
		NormalJobStrategyMatrixTypeNullImpl normalJobStrategyMatrixTypeNull = new NormalJobStrategyMatrixTypeNullImpl();
		return normalJobStrategyMatrixTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixOneOf0AdditionalProperties createNormalJobStrategyMatrixOneOf0AdditionalProperties() {
		NormalJobStrategyMatrixOneOf0AdditionalPropertiesImpl normalJobStrategyMatrixOneOf0AdditionalProperties = new NormalJobStrategyMatrixOneOf0AdditionalPropertiesImpl();
		return normalJobStrategyMatrixOneOf0AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixAdditionalPropertiesTypeString createNormalJobStrategyMatrixAdditionalPropertiesTypeString() {
		NormalJobStrategyMatrixAdditionalPropertiesTypeStringImpl normalJobStrategyMatrixAdditionalPropertiesTypeString = new NormalJobStrategyMatrixAdditionalPropertiesTypeStringImpl();
		return normalJobStrategyMatrixAdditionalPropertiesTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixAdditionalPropertiesTypeInteger createNormalJobStrategyMatrixAdditionalPropertiesTypeInteger() {
		NormalJobStrategyMatrixAdditionalPropertiesTypeIntegerImpl normalJobStrategyMatrixAdditionalPropertiesTypeInteger = new NormalJobStrategyMatrixAdditionalPropertiesTypeIntegerImpl();
		return normalJobStrategyMatrixAdditionalPropertiesTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixAdditionalPropertiesTypeNumber createNormalJobStrategyMatrixAdditionalPropertiesTypeNumber() {
		NormalJobStrategyMatrixAdditionalPropertiesTypeNumberImpl normalJobStrategyMatrixAdditionalPropertiesTypeNumber = new NormalJobStrategyMatrixAdditionalPropertiesTypeNumberImpl();
		return normalJobStrategyMatrixAdditionalPropertiesTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixAdditionalPropertiesTypeBoolean createNormalJobStrategyMatrixAdditionalPropertiesTypeBoolean() {
		NormalJobStrategyMatrixAdditionalPropertiesTypeBooleanImpl normalJobStrategyMatrixAdditionalPropertiesTypeBoolean = new NormalJobStrategyMatrixAdditionalPropertiesTypeBooleanImpl();
		return normalJobStrategyMatrixAdditionalPropertiesTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixAdditionalPropertiesTypeObject createNormalJobStrategyMatrixAdditionalPropertiesTypeObject() {
		NormalJobStrategyMatrixAdditionalPropertiesTypeObjectImpl normalJobStrategyMatrixAdditionalPropertiesTypeObject = new NormalJobStrategyMatrixAdditionalPropertiesTypeObjectImpl();
		return normalJobStrategyMatrixAdditionalPropertiesTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties createNormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties() {
		NormalJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesImpl normalJobStrategyMatrixAdditionalPropertiesAdditionalProperties = new NormalJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesImpl();
		return normalJobStrategyMatrixAdditionalPropertiesAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixAdditionalPropertiesTypeArray createNormalJobStrategyMatrixAdditionalPropertiesTypeArray() {
		NormalJobStrategyMatrixAdditionalPropertiesTypeArrayImpl normalJobStrategyMatrixAdditionalPropertiesTypeArray = new NormalJobStrategyMatrixAdditionalPropertiesTypeArrayImpl();
		return normalJobStrategyMatrixAdditionalPropertiesTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixAdditionalPropertiesItems createNormalJobStrategyMatrixAdditionalPropertiesItems() {
		NormalJobStrategyMatrixAdditionalPropertiesItemsImpl normalJobStrategyMatrixAdditionalPropertiesItems = new NormalJobStrategyMatrixAdditionalPropertiesItemsImpl();
		return normalJobStrategyMatrixAdditionalPropertiesItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobStrategyMatrixAdditionalPropertiesTypeNull createNormalJobStrategyMatrixAdditionalPropertiesTypeNull() {
		NormalJobStrategyMatrixAdditionalPropertiesTypeNullImpl normalJobStrategyMatrixAdditionalPropertiesTypeNull = new NormalJobStrategyMatrixAdditionalPropertiesTypeNullImpl();
		return normalJobStrategyMatrixAdditionalPropertiesTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContinue_45on_45errorTypeString createNormalJobContinue_45on_45errorTypeString() {
		NormalJobContinue_45on_45errorTypeStringImpl normalJobContinue_45on_45errorTypeString = new NormalJobContinue_45on_45errorTypeStringImpl();
		return normalJobContinue_45on_45errorTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContinue_45on_45errorTypeInteger createNormalJobContinue_45on_45errorTypeInteger() {
		NormalJobContinue_45on_45errorTypeIntegerImpl normalJobContinue_45on_45errorTypeInteger = new NormalJobContinue_45on_45errorTypeIntegerImpl();
		return normalJobContinue_45on_45errorTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContinue_45on_45errorTypeNumber createNormalJobContinue_45on_45errorTypeNumber() {
		NormalJobContinue_45on_45errorTypeNumberImpl normalJobContinue_45on_45errorTypeNumber = new NormalJobContinue_45on_45errorTypeNumberImpl();
		return normalJobContinue_45on_45errorTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContinue_45on_45errorTypeBoolean createNormalJobContinue_45on_45errorTypeBoolean() {
		NormalJobContinue_45on_45errorTypeBooleanImpl normalJobContinue_45on_45errorTypeBoolean = new NormalJobContinue_45on_45errorTypeBooleanImpl();
		return normalJobContinue_45on_45errorTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContinue_45on_45errorTypeObject createNormalJobContinue_45on_45errorTypeObject() {
		NormalJobContinue_45on_45errorTypeObjectImpl normalJobContinue_45on_45errorTypeObject = new NormalJobContinue_45on_45errorTypeObjectImpl();
		return normalJobContinue_45on_45errorTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContinue_45on_45errorAdditionalProperties createNormalJobContinue_45on_45errorAdditionalProperties() {
		NormalJobContinue_45on_45errorAdditionalPropertiesImpl normalJobContinue_45on_45errorAdditionalProperties = new NormalJobContinue_45on_45errorAdditionalPropertiesImpl();
		return normalJobContinue_45on_45errorAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContinue_45on_45errorTypeArray createNormalJobContinue_45on_45errorTypeArray() {
		NormalJobContinue_45on_45errorTypeArrayImpl normalJobContinue_45on_45errorTypeArray = new NormalJobContinue_45on_45errorTypeArrayImpl();
		return normalJobContinue_45on_45errorTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContinue_45on_45errorItems createNormalJobContinue_45on_45errorItems() {
		NormalJobContinue_45on_45errorItemsImpl normalJobContinue_45on_45errorItems = new NormalJobContinue_45on_45errorItemsImpl();
		return normalJobContinue_45on_45errorItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContinue_45on_45errorTypeNull createNormalJobContinue_45on_45errorTypeNull() {
		NormalJobContinue_45on_45errorTypeNullImpl normalJobContinue_45on_45errorTypeNull = new NormalJobContinue_45on_45errorTypeNullImpl();
		return normalJobContinue_45on_45errorTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContainerTypeString createNormalJobContainerTypeString() {
		NormalJobContainerTypeStringImpl normalJobContainerTypeString = new NormalJobContainerTypeStringImpl();
		return normalJobContainerTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContainerTypeInteger createNormalJobContainerTypeInteger() {
		NormalJobContainerTypeIntegerImpl normalJobContainerTypeInteger = new NormalJobContainerTypeIntegerImpl();
		return normalJobContainerTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContainerTypeNumber createNormalJobContainerTypeNumber() {
		NormalJobContainerTypeNumberImpl normalJobContainerTypeNumber = new NormalJobContainerTypeNumberImpl();
		return normalJobContainerTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContainerTypeBoolean createNormalJobContainerTypeBoolean() {
		NormalJobContainerTypeBooleanImpl normalJobContainerTypeBoolean = new NormalJobContainerTypeBooleanImpl();
		return normalJobContainerTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContainerTypeObject createNormalJobContainerTypeObject() {
		NormalJobContainerTypeObjectImpl normalJobContainerTypeObject = new NormalJobContainerTypeObjectImpl();
		return normalJobContainerTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContainerAdditionalProperties createNormalJobContainerAdditionalProperties() {
		NormalJobContainerAdditionalPropertiesImpl normalJobContainerAdditionalProperties = new NormalJobContainerAdditionalPropertiesImpl();
		return normalJobContainerAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContainerTypeArray createNormalJobContainerTypeArray() {
		NormalJobContainerTypeArrayImpl normalJobContainerTypeArray = new NormalJobContainerTypeArrayImpl();
		return normalJobContainerTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContainerItems createNormalJobContainerItems() {
		NormalJobContainerItemsImpl normalJobContainerItems = new NormalJobContainerItemsImpl();
		return normalJobContainerItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobContainerTypeNull createNormalJobContainerTypeNull() {
		NormalJobContainerTypeNullImpl normalJobContainerTypeNull = new NormalJobContainerTypeNullImpl();
		return normalJobContainerTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobConcurrencyTypeString createNormalJobConcurrencyTypeString() {
		NormalJobConcurrencyTypeStringImpl normalJobConcurrencyTypeString = new NormalJobConcurrencyTypeStringImpl();
		return normalJobConcurrencyTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobConcurrencyTypeInteger createNormalJobConcurrencyTypeInteger() {
		NormalJobConcurrencyTypeIntegerImpl normalJobConcurrencyTypeInteger = new NormalJobConcurrencyTypeIntegerImpl();
		return normalJobConcurrencyTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobConcurrencyTypeNumber createNormalJobConcurrencyTypeNumber() {
		NormalJobConcurrencyTypeNumberImpl normalJobConcurrencyTypeNumber = new NormalJobConcurrencyTypeNumberImpl();
		return normalJobConcurrencyTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobConcurrencyTypeBoolean createNormalJobConcurrencyTypeBoolean() {
		NormalJobConcurrencyTypeBooleanImpl normalJobConcurrencyTypeBoolean = new NormalJobConcurrencyTypeBooleanImpl();
		return normalJobConcurrencyTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobConcurrencyTypeObject createNormalJobConcurrencyTypeObject() {
		NormalJobConcurrencyTypeObjectImpl normalJobConcurrencyTypeObject = new NormalJobConcurrencyTypeObjectImpl();
		return normalJobConcurrencyTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobConcurrencyAdditionalProperties createNormalJobConcurrencyAdditionalProperties() {
		NormalJobConcurrencyAdditionalPropertiesImpl normalJobConcurrencyAdditionalProperties = new NormalJobConcurrencyAdditionalPropertiesImpl();
		return normalJobConcurrencyAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobConcurrencyTypeArray createNormalJobConcurrencyTypeArray() {
		NormalJobConcurrencyTypeArrayImpl normalJobConcurrencyTypeArray = new NormalJobConcurrencyTypeArrayImpl();
		return normalJobConcurrencyTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobConcurrencyItems createNormalJobConcurrencyItems() {
		NormalJobConcurrencyItemsImpl normalJobConcurrencyItems = new NormalJobConcurrencyItemsImpl();
		return normalJobConcurrencyItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NormalJobConcurrencyTypeNull createNormalJobConcurrencyTypeNull() {
		NormalJobConcurrencyTypeNullImpl normalJobConcurrencyTypeNull = new NormalJobConcurrencyTypeNullImpl();
		return normalJobConcurrencyTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnTypeString createGithubwfRootOnTypeString() {
		GithubwfRootOnTypeStringImpl githubwfRootOnTypeString = new GithubwfRootOnTypeStringImpl();
		return githubwfRootOnTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnTypeInteger createGithubwfRootOnTypeInteger() {
		GithubwfRootOnTypeIntegerImpl githubwfRootOnTypeInteger = new GithubwfRootOnTypeIntegerImpl();
		return githubwfRootOnTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnTypeNumber createGithubwfRootOnTypeNumber() {
		GithubwfRootOnTypeNumberImpl githubwfRootOnTypeNumber = new GithubwfRootOnTypeNumberImpl();
		return githubwfRootOnTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnTypeBoolean createGithubwfRootOnTypeBoolean() {
		GithubwfRootOnTypeBooleanImpl githubwfRootOnTypeBoolean = new GithubwfRootOnTypeBooleanImpl();
		return githubwfRootOnTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnTypeObject createGithubwfRootOnTypeObject() {
		GithubwfRootOnTypeObjectImpl githubwfRootOnTypeObject = new GithubwfRootOnTypeObjectImpl();
		return githubwfRootOnTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnAdditionalProperties createGithubwfRootOnAdditionalProperties() {
		GithubwfRootOnAdditionalPropertiesImpl githubwfRootOnAdditionalProperties = new GithubwfRootOnAdditionalPropertiesImpl();
		return githubwfRootOnAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnTypeArray createGithubwfRootOnTypeArray() {
		GithubwfRootOnTypeArrayImpl githubwfRootOnTypeArray = new GithubwfRootOnTypeArrayImpl();
		return githubwfRootOnTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnItems createGithubwfRootOnItems() {
		GithubwfRootOnItemsImpl githubwfRootOnItems = new GithubwfRootOnItemsImpl();
		return githubwfRootOnItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnTypeNull createGithubwfRootOnTypeNull() {
		GithubwfRootOnTypeNullImpl githubwfRootOnTypeNull = new GithubwfRootOnTypeNullImpl();
		return githubwfRootOnTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_requestPatternProperties0Items createGithubwfRootOnOneOf2Pull_requestPatternProperties0Items() {
		GithubwfRootOnOneOf2Pull_requestPatternProperties0ItemsImpl githubwfRootOnOneOf2Pull_requestPatternProperties0Items = new GithubwfRootOnOneOf2Pull_requestPatternProperties0ItemsImpl();
		return githubwfRootOnOneOf2Pull_requestPatternProperties0Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeString createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeString() {
		GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeStringImpl githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeString = new GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeStringImpl();
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger() {
		GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeIntegerImpl githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger = new GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeIntegerImpl();
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumber createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumber() {
		GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumberImpl githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumber = new GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumberImpl();
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBoolean createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBoolean() {
		GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBooleanImpl githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBoolean = new GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBooleanImpl();
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObject createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObject() {
		GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObjectImpl githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObject = new GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObjectImpl();
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties() {
		GithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalPropertiesImpl githubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties = new GithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalPropertiesImpl();
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArray createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArray() {
		GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArrayImpl githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArray = new GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArrayImpl();
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_targetPatternProperties0Items createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0Items() {
		GithubwfRootOnOneOf2Pull_request_targetPatternProperties0ItemsImpl githubwfRootOnOneOf2Pull_request_targetPatternProperties0Items = new GithubwfRootOnOneOf2Pull_request_targetPatternProperties0ItemsImpl();
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNull createGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNull() {
		GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNullImpl githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNull = new GithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNullImpl();
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callTypeString createGithubwfRootOnOneOf2Workflow_callTypeString() {
		GithubwfRootOnOneOf2Workflow_callTypeStringImpl githubwfRootOnOneOf2Workflow_callTypeString = new GithubwfRootOnOneOf2Workflow_callTypeStringImpl();
		return githubwfRootOnOneOf2Workflow_callTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callTypeInteger createGithubwfRootOnOneOf2Workflow_callTypeInteger() {
		GithubwfRootOnOneOf2Workflow_callTypeIntegerImpl githubwfRootOnOneOf2Workflow_callTypeInteger = new GithubwfRootOnOneOf2Workflow_callTypeIntegerImpl();
		return githubwfRootOnOneOf2Workflow_callTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callTypeNumber createGithubwfRootOnOneOf2Workflow_callTypeNumber() {
		GithubwfRootOnOneOf2Workflow_callTypeNumberImpl githubwfRootOnOneOf2Workflow_callTypeNumber = new GithubwfRootOnOneOf2Workflow_callTypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_callTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callTypeBoolean createGithubwfRootOnOneOf2Workflow_callTypeBoolean() {
		GithubwfRootOnOneOf2Workflow_callTypeBooleanImpl githubwfRootOnOneOf2Workflow_callTypeBoolean = new GithubwfRootOnOneOf2Workflow_callTypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_callTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callTypeObject createGithubwfRootOnOneOf2Workflow_callTypeObject() {
		GithubwfRootOnOneOf2Workflow_callTypeObjectImpl githubwfRootOnOneOf2Workflow_callTypeObject = new GithubwfRootOnOneOf2Workflow_callTypeObjectImpl();
		return githubwfRootOnOneOf2Workflow_callTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callAdditionalProperties createGithubwfRootOnOneOf2Workflow_callAdditionalProperties() {
		GithubwfRootOnOneOf2Workflow_callAdditionalPropertiesImpl githubwfRootOnOneOf2Workflow_callAdditionalProperties = new GithubwfRootOnOneOf2Workflow_callAdditionalPropertiesImpl();
		return githubwfRootOnOneOf2Workflow_callAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callTypeArray createGithubwfRootOnOneOf2Workflow_callTypeArray() {
		GithubwfRootOnOneOf2Workflow_callTypeArrayImpl githubwfRootOnOneOf2Workflow_callTypeArray = new GithubwfRootOnOneOf2Workflow_callTypeArrayImpl();
		return githubwfRootOnOneOf2Workflow_callTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callItems createGithubwfRootOnOneOf2Workflow_callItems() {
		GithubwfRootOnOneOf2Workflow_callItemsImpl githubwfRootOnOneOf2Workflow_callItems = new GithubwfRootOnOneOf2Workflow_callItemsImpl();
		return githubwfRootOnOneOf2Workflow_callItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callTypeNull createGithubwfRootOnOneOf2Workflow_callTypeNull() {
		GithubwfRootOnOneOf2Workflow_callTypeNullImpl githubwfRootOnOneOf2Workflow_callTypeNull = new GithubwfRootOnOneOf2Workflow_callTypeNullImpl();
		return githubwfRootOnOneOf2Workflow_callTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBoolean createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBoolean() {
		GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBooleanImpl githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBoolean = new GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumber createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumber() {
		GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumberImpl githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumber = new GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString createGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString() {
		GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeStringImpl githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString = new GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeStringImpl();
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsTypeString createGithubwfRootOnOneOf2Workflow_callSecretsTypeString() {
		GithubwfRootOnOneOf2Workflow_callSecretsTypeStringImpl githubwfRootOnOneOf2Workflow_callSecretsTypeString = new GithubwfRootOnOneOf2Workflow_callSecretsTypeStringImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsTypeInteger createGithubwfRootOnOneOf2Workflow_callSecretsTypeInteger() {
		GithubwfRootOnOneOf2Workflow_callSecretsTypeIntegerImpl githubwfRootOnOneOf2Workflow_callSecretsTypeInteger = new GithubwfRootOnOneOf2Workflow_callSecretsTypeIntegerImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsTypeNumber createGithubwfRootOnOneOf2Workflow_callSecretsTypeNumber() {
		GithubwfRootOnOneOf2Workflow_callSecretsTypeNumberImpl githubwfRootOnOneOf2Workflow_callSecretsTypeNumber = new GithubwfRootOnOneOf2Workflow_callSecretsTypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean createGithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean() {
		GithubwfRootOnOneOf2Workflow_callSecretsTypeBooleanImpl githubwfRootOnOneOf2Workflow_callSecretsTypeBoolean = new GithubwfRootOnOneOf2Workflow_callSecretsTypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsTypeObject createGithubwfRootOnOneOf2Workflow_callSecretsTypeObject() {
		GithubwfRootOnOneOf2Workflow_callSecretsTypeObjectImpl githubwfRootOnOneOf2Workflow_callSecretsTypeObject = new GithubwfRootOnOneOf2Workflow_callSecretsTypeObjectImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsTypeArray createGithubwfRootOnOneOf2Workflow_callSecretsTypeArray() {
		GithubwfRootOnOneOf2Workflow_callSecretsTypeArrayImpl githubwfRootOnOneOf2Workflow_callSecretsTypeArray = new GithubwfRootOnOneOf2Workflow_callSecretsTypeArrayImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsItems createGithubwfRootOnOneOf2Workflow_callSecretsItems() {
		GithubwfRootOnOneOf2Workflow_callSecretsItemsImpl githubwfRootOnOneOf2Workflow_callSecretsItems = new GithubwfRootOnOneOf2Workflow_callSecretsItemsImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsTypeNull createGithubwfRootOnOneOf2Workflow_callSecretsTypeNull() {
		GithubwfRootOnOneOf2Workflow_callSecretsTypeNullImpl githubwfRootOnOneOf2Workflow_callSecretsTypeNull = new GithubwfRootOnOneOf2Workflow_callSecretsTypeNullImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeString createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeString() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeStringImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeString = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeStringImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeInteger createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeInteger() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeIntegerImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeInteger = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeIntegerImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumber createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumber() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumberImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumber = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBoolean createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBoolean() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBooleanImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBoolean = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObjectImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObjectImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArray createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArray() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArrayImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArray = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArrayImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Items createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Items() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0ItemsImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Items = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0ItemsImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNull createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNull() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNullImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNull = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNullImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeString createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeString() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeStringImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeString = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeStringImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeInteger createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeInteger() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeIntegerImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeInteger = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeIntegerImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumber createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumber() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumberImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumber = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBoolean createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBoolean() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBooleanImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBoolean = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObject createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObject() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObjectImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObject = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObjectImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalPropertiesImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalPropertiesImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArrayImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArrayImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItemsImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItemsImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNull createGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNull() {
		GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNullImpl githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNull = new GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNullImpl();
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchTypeString createGithubwfRootOnOneOf2Workflow_dispatchTypeString() {
		GithubwfRootOnOneOf2Workflow_dispatchTypeStringImpl githubwfRootOnOneOf2Workflow_dispatchTypeString = new GithubwfRootOnOneOf2Workflow_dispatchTypeStringImpl();
		return githubwfRootOnOneOf2Workflow_dispatchTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchTypeInteger createGithubwfRootOnOneOf2Workflow_dispatchTypeInteger() {
		GithubwfRootOnOneOf2Workflow_dispatchTypeIntegerImpl githubwfRootOnOneOf2Workflow_dispatchTypeInteger = new GithubwfRootOnOneOf2Workflow_dispatchTypeIntegerImpl();
		return githubwfRootOnOneOf2Workflow_dispatchTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchTypeNumber createGithubwfRootOnOneOf2Workflow_dispatchTypeNumber() {
		GithubwfRootOnOneOf2Workflow_dispatchTypeNumberImpl githubwfRootOnOneOf2Workflow_dispatchTypeNumber = new GithubwfRootOnOneOf2Workflow_dispatchTypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_dispatchTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchTypeBoolean createGithubwfRootOnOneOf2Workflow_dispatchTypeBoolean() {
		GithubwfRootOnOneOf2Workflow_dispatchTypeBooleanImpl githubwfRootOnOneOf2Workflow_dispatchTypeBoolean = new GithubwfRootOnOneOf2Workflow_dispatchTypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_dispatchTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchTypeObject createGithubwfRootOnOneOf2Workflow_dispatchTypeObject() {
		GithubwfRootOnOneOf2Workflow_dispatchTypeObjectImpl githubwfRootOnOneOf2Workflow_dispatchTypeObject = new GithubwfRootOnOneOf2Workflow_dispatchTypeObjectImpl();
		return githubwfRootOnOneOf2Workflow_dispatchTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties createGithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties() {
		GithubwfRootOnOneOf2Workflow_dispatchAdditionalPropertiesImpl githubwfRootOnOneOf2Workflow_dispatchAdditionalProperties = new GithubwfRootOnOneOf2Workflow_dispatchAdditionalPropertiesImpl();
		return githubwfRootOnOneOf2Workflow_dispatchAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchTypeArray createGithubwfRootOnOneOf2Workflow_dispatchTypeArray() {
		GithubwfRootOnOneOf2Workflow_dispatchTypeArrayImpl githubwfRootOnOneOf2Workflow_dispatchTypeArray = new GithubwfRootOnOneOf2Workflow_dispatchTypeArrayImpl();
		return githubwfRootOnOneOf2Workflow_dispatchTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchItems createGithubwfRootOnOneOf2Workflow_dispatchItems() {
		GithubwfRootOnOneOf2Workflow_dispatchItemsImpl githubwfRootOnOneOf2Workflow_dispatchItems = new GithubwfRootOnOneOf2Workflow_dispatchItemsImpl();
		return githubwfRootOnOneOf2Workflow_dispatchItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchTypeNull createGithubwfRootOnOneOf2Workflow_dispatchTypeNull() {
		GithubwfRootOnOneOf2Workflow_dispatchTypeNullImpl githubwfRootOnOneOf2Workflow_dispatchTypeNull = new GithubwfRootOnOneOf2Workflow_dispatchTypeNullImpl();
		return githubwfRootOnOneOf2Workflow_dispatchTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeString createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeString() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeStringImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeString = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeStringImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeInteger createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeInteger() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeIntegerImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeInteger = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeIntegerImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumber createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumber() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumberImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumber = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBoolean createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBoolean() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBooleanImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBoolean = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObject createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObject() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObjectImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObject = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObjectImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalPropertiesImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalPropertiesImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArray createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArray() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArrayImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArray = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArrayImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItems createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItems() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItemsImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItems = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItemsImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNullImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNullImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeString createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeString() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeStringImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeString = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeStringImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeInteger createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeInteger() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeIntegerImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeInteger = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeIntegerImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumber createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumber() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumberImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumber = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBoolean createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBoolean() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBooleanImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBoolean = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObjectImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObjectImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalPropertiesImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalPropertiesImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArray createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArray() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArrayImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArray = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArrayImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Items createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Items() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ItemsImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Items = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ItemsImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNull createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNull() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNullImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNull = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNullImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeStringImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeStringImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeIntegerImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeIntegerImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumberImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBooleanImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObjectImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObjectImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalPropertiesImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalPropertiesImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArrayImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArrayImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItemsImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItemsImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNullImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNullImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeStringImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeStringImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeIntegerImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeIntegerImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumberImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItemsImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItemsImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNullImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNullImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull createGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull() {
		GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullImpl githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull = new GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullImpl();
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeString createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeString() {
		GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeStringImpl githubwfRootOnOneOf2Workflow_runPatternProperties0TypeString = new GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeStringImpl();
		return githubwfRootOnOneOf2Workflow_runPatternProperties0TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeInteger createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeInteger() {
		GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeIntegerImpl githubwfRootOnOneOf2Workflow_runPatternProperties0TypeInteger = new GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeIntegerImpl();
		return githubwfRootOnOneOf2Workflow_runPatternProperties0TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumber createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumber() {
		GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumberImpl githubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumber = new GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumberImpl();
		return githubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBoolean createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBoolean() {
		GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBooleanImpl githubwfRootOnOneOf2Workflow_runPatternProperties0TypeBoolean = new GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBooleanImpl();
		return githubwfRootOnOneOf2Workflow_runPatternProperties0TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject() {
		GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObjectImpl githubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject = new GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObjectImpl();
		return githubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties createGithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties() {
		GithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalPropertiesImpl githubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties = new GithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalPropertiesImpl();
		return githubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArray createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArray() {
		GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArrayImpl githubwfRootOnOneOf2Workflow_runPatternProperties0TypeArray = new GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArrayImpl();
		return githubwfRootOnOneOf2Workflow_runPatternProperties0TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_runPatternProperties0Items createGithubwfRootOnOneOf2Workflow_runPatternProperties0Items() {
		GithubwfRootOnOneOf2Workflow_runPatternProperties0ItemsImpl githubwfRootOnOneOf2Workflow_runPatternProperties0Items = new GithubwfRootOnOneOf2Workflow_runPatternProperties0ItemsImpl();
		return githubwfRootOnOneOf2Workflow_runPatternProperties0Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNull createGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNull() {
		GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNullImpl githubwfRootOnOneOf2Workflow_runPatternProperties0TypeNull = new GithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNullImpl();
		return githubwfRootOnOneOf2Workflow_runPatternProperties0TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2ScheduleItemsTypeString createGithubwfRootOnOneOf2ScheduleItemsTypeString() {
		GithubwfRootOnOneOf2ScheduleItemsTypeStringImpl githubwfRootOnOneOf2ScheduleItemsTypeString = new GithubwfRootOnOneOf2ScheduleItemsTypeStringImpl();
		return githubwfRootOnOneOf2ScheduleItemsTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2ScheduleItemsTypeInteger createGithubwfRootOnOneOf2ScheduleItemsTypeInteger() {
		GithubwfRootOnOneOf2ScheduleItemsTypeIntegerImpl githubwfRootOnOneOf2ScheduleItemsTypeInteger = new GithubwfRootOnOneOf2ScheduleItemsTypeIntegerImpl();
		return githubwfRootOnOneOf2ScheduleItemsTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2ScheduleItemsTypeNumber createGithubwfRootOnOneOf2ScheduleItemsTypeNumber() {
		GithubwfRootOnOneOf2ScheduleItemsTypeNumberImpl githubwfRootOnOneOf2ScheduleItemsTypeNumber = new GithubwfRootOnOneOf2ScheduleItemsTypeNumberImpl();
		return githubwfRootOnOneOf2ScheduleItemsTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2ScheduleItemsTypeBoolean createGithubwfRootOnOneOf2ScheduleItemsTypeBoolean() {
		GithubwfRootOnOneOf2ScheduleItemsTypeBooleanImpl githubwfRootOnOneOf2ScheduleItemsTypeBoolean = new GithubwfRootOnOneOf2ScheduleItemsTypeBooleanImpl();
		return githubwfRootOnOneOf2ScheduleItemsTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2ScheduleItemsTypeObject createGithubwfRootOnOneOf2ScheduleItemsTypeObject() {
		GithubwfRootOnOneOf2ScheduleItemsTypeObjectImpl githubwfRootOnOneOf2ScheduleItemsTypeObject = new GithubwfRootOnOneOf2ScheduleItemsTypeObjectImpl();
		return githubwfRootOnOneOf2ScheduleItemsTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2ScheduleItemsTypeArray createGithubwfRootOnOneOf2ScheduleItemsTypeArray() {
		GithubwfRootOnOneOf2ScheduleItemsTypeArrayImpl githubwfRootOnOneOf2ScheduleItemsTypeArray = new GithubwfRootOnOneOf2ScheduleItemsTypeArrayImpl();
		return githubwfRootOnOneOf2ScheduleItemsTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2ScheduleItemsItems createGithubwfRootOnOneOf2ScheduleItemsItems() {
		GithubwfRootOnOneOf2ScheduleItemsItemsImpl githubwfRootOnOneOf2ScheduleItemsItems = new GithubwfRootOnOneOf2ScheduleItemsItemsImpl();
		return githubwfRootOnOneOf2ScheduleItemsItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootOnOneOf2ScheduleItemsTypeNull createGithubwfRootOnOneOf2ScheduleItemsTypeNull() {
		GithubwfRootOnOneOf2ScheduleItemsTypeNullImpl githubwfRootOnOneOf2ScheduleItemsTypeNull = new GithubwfRootOnOneOf2ScheduleItemsTypeNullImpl();
		return githubwfRootOnOneOf2ScheduleItemsTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootConcurrencyTypeString createGithubwfRootConcurrencyTypeString() {
		GithubwfRootConcurrencyTypeStringImpl githubwfRootConcurrencyTypeString = new GithubwfRootConcurrencyTypeStringImpl();
		return githubwfRootConcurrencyTypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootConcurrencyTypeInteger createGithubwfRootConcurrencyTypeInteger() {
		GithubwfRootConcurrencyTypeIntegerImpl githubwfRootConcurrencyTypeInteger = new GithubwfRootConcurrencyTypeIntegerImpl();
		return githubwfRootConcurrencyTypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootConcurrencyTypeNumber createGithubwfRootConcurrencyTypeNumber() {
		GithubwfRootConcurrencyTypeNumberImpl githubwfRootConcurrencyTypeNumber = new GithubwfRootConcurrencyTypeNumberImpl();
		return githubwfRootConcurrencyTypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootConcurrencyTypeBoolean createGithubwfRootConcurrencyTypeBoolean() {
		GithubwfRootConcurrencyTypeBooleanImpl githubwfRootConcurrencyTypeBoolean = new GithubwfRootConcurrencyTypeBooleanImpl();
		return githubwfRootConcurrencyTypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootConcurrencyTypeObject createGithubwfRootConcurrencyTypeObject() {
		GithubwfRootConcurrencyTypeObjectImpl githubwfRootConcurrencyTypeObject = new GithubwfRootConcurrencyTypeObjectImpl();
		return githubwfRootConcurrencyTypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootConcurrencyAdditionalProperties createGithubwfRootConcurrencyAdditionalProperties() {
		GithubwfRootConcurrencyAdditionalPropertiesImpl githubwfRootConcurrencyAdditionalProperties = new GithubwfRootConcurrencyAdditionalPropertiesImpl();
		return githubwfRootConcurrencyAdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootConcurrencyTypeArray createGithubwfRootConcurrencyTypeArray() {
		GithubwfRootConcurrencyTypeArrayImpl githubwfRootConcurrencyTypeArray = new GithubwfRootConcurrencyTypeArrayImpl();
		return githubwfRootConcurrencyTypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootConcurrencyItems createGithubwfRootConcurrencyItems() {
		GithubwfRootConcurrencyItemsImpl githubwfRootConcurrencyItems = new GithubwfRootConcurrencyItemsImpl();
		return githubwfRootConcurrencyItems;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootConcurrencyTypeNull createGithubwfRootConcurrencyTypeNull() {
		GithubwfRootConcurrencyTypeNullImpl githubwfRootConcurrencyTypeNull = new GithubwfRootConcurrencyTypeNullImpl();
		return githubwfRootConcurrencyTypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootJobsPatternProperties0TypeString createGithubwfRootJobsPatternProperties0TypeString() {
		GithubwfRootJobsPatternProperties0TypeStringImpl githubwfRootJobsPatternProperties0TypeString = new GithubwfRootJobsPatternProperties0TypeStringImpl();
		return githubwfRootJobsPatternProperties0TypeString;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootJobsPatternProperties0TypeInteger createGithubwfRootJobsPatternProperties0TypeInteger() {
		GithubwfRootJobsPatternProperties0TypeIntegerImpl githubwfRootJobsPatternProperties0TypeInteger = new GithubwfRootJobsPatternProperties0TypeIntegerImpl();
		return githubwfRootJobsPatternProperties0TypeInteger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootJobsPatternProperties0TypeNumber createGithubwfRootJobsPatternProperties0TypeNumber() {
		GithubwfRootJobsPatternProperties0TypeNumberImpl githubwfRootJobsPatternProperties0TypeNumber = new GithubwfRootJobsPatternProperties0TypeNumberImpl();
		return githubwfRootJobsPatternProperties0TypeNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootJobsPatternProperties0TypeBoolean createGithubwfRootJobsPatternProperties0TypeBoolean() {
		GithubwfRootJobsPatternProperties0TypeBooleanImpl githubwfRootJobsPatternProperties0TypeBoolean = new GithubwfRootJobsPatternProperties0TypeBooleanImpl();
		return githubwfRootJobsPatternProperties0TypeBoolean;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootJobsPatternProperties0TypeObject createGithubwfRootJobsPatternProperties0TypeObject() {
		GithubwfRootJobsPatternProperties0TypeObjectImpl githubwfRootJobsPatternProperties0TypeObject = new GithubwfRootJobsPatternProperties0TypeObjectImpl();
		return githubwfRootJobsPatternProperties0TypeObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootJobsPatternProperties0AdditionalProperties createGithubwfRootJobsPatternProperties0AdditionalProperties() {
		GithubwfRootJobsPatternProperties0AdditionalPropertiesImpl githubwfRootJobsPatternProperties0AdditionalProperties = new GithubwfRootJobsPatternProperties0AdditionalPropertiesImpl();
		return githubwfRootJobsPatternProperties0AdditionalProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootJobsPatternProperties0TypeArray createGithubwfRootJobsPatternProperties0TypeArray() {
		GithubwfRootJobsPatternProperties0TypeArrayImpl githubwfRootJobsPatternProperties0TypeArray = new GithubwfRootJobsPatternProperties0TypeArrayImpl();
		return githubwfRootJobsPatternProperties0TypeArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootJobsPatternProperties0Items createGithubwfRootJobsPatternProperties0Items() {
		GithubwfRootJobsPatternProperties0ItemsImpl githubwfRootJobsPatternProperties0Items = new GithubwfRootJobsPatternProperties0ItemsImpl();
		return githubwfRootJobsPatternProperties0Items;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfRootJobsPatternProperties0TypeNull createGithubwfRootJobsPatternProperties0TypeNull() {
		GithubwfRootJobsPatternProperties0TypeNullImpl githubwfRootJobsPatternProperties0TypeNull = new GithubwfRootJobsPatternProperties0TypeNullImpl();
		return githubwfRootJobsPatternProperties0TypeNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfPackage getGithubwfPackage() {
		return (GithubwfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GithubwfPackage getPackage() {
		return GithubwfPackage.eINSTANCE;
	}

} //GithubwfFactoryImpl
