/**
 */
package githubwf.impl;

import githubwf.GithubwfFactory;
import githubwf.GithubwfPackage;

import java.io.IOException;

import java.net.URL;

import jsonMM.JsonMMPackage;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GithubwfPackageImpl extends EPackageImpl implements GithubwfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "githubwf.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass architectureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass branchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyCancel_45in_45progressEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyCancel_45in_45progressOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyCancel_45in_45progressOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationOneOf2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationOneOf3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationOneOf3AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationOneOf4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationOneOf4ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerImageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerCredentialsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerCredentialsUsernameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerCredentialsPasswordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerEnvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsItemsOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsItemsOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerVolumesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerVolumesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerOptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultsRunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultsRunShellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultsRunWorking_45directoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventActionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventChecksEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventContentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventDeploymentsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventDiscussionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventId_45tokenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventIssuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventPackagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventPagesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventPull_45requestsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventRepository_45projectsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventSecurity_45eventsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventStatusesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45levelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesOneOf2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentUrlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass expressionSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stringContainingExpressionSyntaxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass machineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refBranchesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refBranches_45ignoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTagsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTags_45ignoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refPathsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refPaths_45ignoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0NotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1NotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2NotEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellAnyOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellAnyOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass working_45directoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsOneOf0ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobNeedsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobPermissionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobUsesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobWithEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobSecretsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobSecretsOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobSecretsOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixPatternProperties0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyFail_45fastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMax_45parallelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobConcurrencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobConcurrencyOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobConcurrencyOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobNeedsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobPermissionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf0Items0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf0AdditionalItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1Items0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1Items1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1AdditionalItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2Items0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2Items1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2AdditionalItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3Items0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3Items1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3Items2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3AdditionalItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4Items0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4Items1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4Items2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4AdditionalItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvironmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvironmentOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvironmentOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobOutputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobOutputsAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobDefaultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobIfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0OneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0OneOf0UsesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0OneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0OneOf1RunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1IdEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1IfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1NameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1UsesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1RunEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Working_45directoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1ShellEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1WithEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1WithArgsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1WithEntrypointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1EnvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Continue_45on_45errorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Continue_45on_45errorOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Timeout_45minutesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobTimeout_45minutesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixPatternProperties0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixPatternProperties0ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesOneOf0ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyFail_45fastEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMax_45parallelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContinue_45on_45errorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContinue_45on_45errorOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContinue_45on_45errorOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContainerOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContainerOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobServicesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobServicesAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobConcurrencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobConcurrencyOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobConcurrencyOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf1ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Branch_protection_ruleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Branch_protection_ruleTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Branch_protection_ruleTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Check_runEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Check_runTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Check_runTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Check_suiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Check_suiteTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Check_suiteTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2CreateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2DeleteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2DeploymentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Deployment_statusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2DiscussionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2DiscussionTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2DiscussionTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Discussion_commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Discussion_commentTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Discussion_commentTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ForkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2GollumEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Issue_commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Issue_commentTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Issue_commentTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2IssuesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2IssuesTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2IssuesTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2LabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2LabelTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2LabelTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2MemberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2MemberTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2MemberTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Merge_groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Merge_groupTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Merge_groupTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2MilestoneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2MilestoneTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2MilestoneTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Page_buildEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ProjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ProjectTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ProjectTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Project_cardEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Project_cardTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Project_cardTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Project_columnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Project_columnTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Project_columnTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2PublicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_requestEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_requestTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_requestTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_requestPatternProperties0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_reviewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_reviewTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_reviewTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_review_commentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_review_commentTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_review_commentTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetPatternProperties0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2PushEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2PushPatternProperties0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2PushPatternProperties0ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Registry_packageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Registry_packageTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Registry_packageTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ReleaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ReleaseTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ReleaseTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2StatusEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2WatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callInputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callInputsPatternProperties0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callInputsPatternProperties0RequiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callInputsPatternProperties0TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0DescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0RequiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runTypesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runTypesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runWorkflowsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runWorkflowsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runPatternProperties0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Repository_dispatchEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ScheduleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ScheduleItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ScheduleItemsCronEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootEnvEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootDefaultsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootConcurrencyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootConcurrencyOneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootConcurrencyOneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPatternProperties0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPatternProperties0OneOf0EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPatternProperties0OneOf1EClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootRun_45nameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootPermissionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf0TupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1TupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2TupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3TupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4TupleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyCancel_45in_45progressAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyCancel_45in_45progressTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyCancel_45in_45progressTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyCancel_45in_45progressTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyCancel_45in_45progressTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyCancel_45in_45progressTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyCancel_45in_45progressPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyCancel_45in_45progressAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyCancel_45in_45progressTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyCancel_45in_45progressItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass concurrencyCancel_45in_45progressTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass configurationOneOf3PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerCredentialsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerCredentialsAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsItemsAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsItemsTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsItemsTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsItemsTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsItemsTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsItemsTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsItemsAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsItemsTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsItemsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass containerPortsItemsTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultsRunPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissionsTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass permissions_45eventPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envOneOf0AdditionalPropertiesTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass environmentPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectOneOf0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventObjectOneOf0AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0TypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0NotAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0NotTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0NotTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0NotTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0NotTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0NotTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0NotPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0NotAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0NotTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0NotItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf0NotTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1TypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1NotAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1NotTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1NotTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1NotTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1NotTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1NotTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1NotPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1NotAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1NotTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1NotItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf1NotTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2TypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2NotAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2NotTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2NotTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2NotTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2NotTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2NotTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2NotPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2NotAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2NotTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2NotItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refOneOf0AllOf2NotTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass shellTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jobNeedsTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobIfAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobIfTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobIfTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobIfTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobSecretsAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobSecretsTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobSecretsTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobSecretsTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobSecretsTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobSecretsTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobSecretsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobSecretsAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobSecretsTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobSecretsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobSecretsTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobConcurrencyAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobConcurrencyTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobConcurrencyTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobConcurrencyTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobConcurrencyTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobConcurrencyTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobConcurrencyPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobConcurrencyAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobConcurrencyTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobConcurrencyItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass reusableWorkflowCallJobConcurrencyTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf0AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf0TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf0TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf0TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf0TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf0TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf0AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf0TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf0TypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf1TypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf2TypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf3TypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobRuns_45onOneOf1AnyOf4TypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvironmentAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvironmentTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvironmentTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvironmentTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvironmentTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvironmentTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvironmentPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvironmentAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvironmentTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvironmentItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobEnvironmentTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobOutputsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobIfAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobIfTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobIfTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobIfTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0TypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0OneOf0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0OneOf0AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0OneOf1PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf0OneOf1AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1IfAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1IfTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1IfTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1IfTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Continue_45on_45errorAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Continue_45on_45errorTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Continue_45on_45errorTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Continue_45on_45errorTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Continue_45on_45errorTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Continue_45on_45errorItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStepsItemsAllOf1Continue_45on_45errorTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixOneOf0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixOneOf0AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobStrategyMatrixAdditionalPropertiesTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContinue_45on_45errorAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContinue_45on_45errorTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContinue_45on_45errorTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContinue_45on_45errorTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContinue_45on_45errorTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContinue_45on_45errorTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContinue_45on_45errorPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContinue_45on_45errorAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContinue_45on_45errorTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContinue_45on_45errorItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContinue_45on_45errorTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContainerAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContainerTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContainerTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContainerTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContainerTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContainerTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContainerPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContainerAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContainerTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContainerItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobContainerTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobServicesPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobConcurrencyAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobConcurrencyTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobConcurrencyTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobConcurrencyTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobConcurrencyTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobConcurrencyTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobConcurrencyPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobConcurrencyAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobConcurrencyTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobConcurrencyItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass normalJobConcurrencyTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_requestPatternProperties0ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetPatternProperties0AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetPatternProperties0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetPatternProperties0ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callInputsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runPatternProperties0AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runPatternProperties0TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runPatternProperties0TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runPatternProperties0TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runPatternProperties0TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runPatternProperties0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runPatternProperties0TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runPatternProperties0ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2Workflow_runPatternProperties0TypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ScheduleItemsAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ScheduleItemsTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ScheduleItemsTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ScheduleItemsTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ScheduleItemsTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ScheduleItemsTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ScheduleItemsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ScheduleItemsTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ScheduleItemsItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootOnOneOf2ScheduleItemsTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootConcurrencyAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootConcurrencyTypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootConcurrencyTypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootConcurrencyTypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootConcurrencyTypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootConcurrencyTypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootConcurrencyPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootConcurrencyAdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootConcurrencyTypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootConcurrencyItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootConcurrencyTypeNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPatternProperties0AbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPatternProperties0TypeStringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPatternProperties0TypeIntegerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPatternProperties0TypeNumberEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPatternProperties0TypeBooleanEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPatternProperties0TypeObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPatternProperties0PropertiesAbstractEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPatternProperties0AdditionalPropertiesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPatternProperties0TypeArrayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPatternProperties0ItemsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass githubwfRootJobsPatternProperties0TypeNullEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see githubwf.GithubwfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private GithubwfPackageImpl() {
		super(eNS_URI, GithubwfFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link GithubwfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static GithubwfPackage init() {
		if (isInited) return (GithubwfPackage)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredGithubwfPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		GithubwfPackageImpl theGithubwfPackage = registeredGithubwfPackage instanceof GithubwfPackageImpl ? (GithubwfPackageImpl)registeredGithubwfPackage : new GithubwfPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		JsonMMPackage.eINSTANCE.eClass();

		// Load packages
		theGithubwfPackage.loadPackage();

		// Fix loaded packages
		theGithubwfPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theGithubwfPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(GithubwfPackage.eNS_URI, theGithubwfPackage);
		return theGithubwfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectAdditionalProperties() {
		if (eventObjectAdditionalPropertiesEClass == null) {
			eventObjectAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(0);
		}
		return eventObjectAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventObjectAdditionalProperties_Key() {
        return (EAttribute)getEventObjectAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventObjectAdditionalProperties_AdditionalProperties() {
        return (EReference)getEventObjectAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEventObjectAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getEventObjectAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEventObjectAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getEventObjectAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRoot() {
		if (githubwfRootEClass == null) {
			githubwfRootEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(1);
		}
		return githubwfRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRoot_GithubwfRoot() {
        return (EReference)getGithubwfRoot().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRoot_Name() {
        return (EAttribute)getGithubwfRoot().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRoot_On() {
        return (EReference)getGithubwfRoot().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRoot_Env() {
        return (EReference)getGithubwfRoot().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRoot_Defaults() {
        return (EReference)getGithubwfRoot().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRoot_Concurrency() {
        return (EReference)getGithubwfRoot().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRoot_Jobs() {
        return (EReference)getGithubwfRoot().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRoot_Run_45name() {
        return (EAttribute)getGithubwfRoot().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRoot_Permissions() {
        return (EReference)getGithubwfRoot().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRoot__Get__String() {
        return getGithubwfRoot().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getArchitecture() {
		if (architectureEClass == null) {
			architectureEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(2);
		}
		return architectureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getArchitecture_Architecture() {
        return (EReference)getArchitecture().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBranch() {
		if (branchEClass == null) {
			branchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(3);
		}
		return branchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBranch_Branch() {
        return (EReference)getBranch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrency() {
		if (concurrencyEClass == null) {
			concurrencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(4);
		}
		return concurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcurrency_Concurrency() {
        return (EReference)getConcurrency().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcurrency_Group() {
        return (EAttribute)getConcurrency().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcurrency_Cancel_45in_45progress() {
        return (EReference)getConcurrency().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConcurrency__Get__String() {
        return getConcurrency().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyGroup() {
		if (concurrencyGroupEClass == null) {
			concurrencyGroupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(5);
		}
		return concurrencyGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcurrencyGroup_Group() {
        return (EAttribute)getConcurrencyGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyCancel_45in_45progress() {
		if (concurrencyCancel_45in_45progressEClass == null) {
			concurrencyCancel_45in_45progressEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(6);
		}
		return concurrencyCancel_45in_45progressEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcurrencyCancel_45in_45progress_Cancel_45in_45progress() {
        return (EReference)getConcurrencyCancel_45in_45progress().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyCancel_45in_45progressOneOf0() {
		if (concurrencyCancel_45in_45progressOneOf0EClass == null) {
			concurrencyCancel_45in_45progressOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(7);
		}
		return concurrencyCancel_45in_45progressOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcurrencyCancel_45in_45progressOneOf0_Cancel_45in_45progress() {
        return (EAttribute)getConcurrencyCancel_45in_45progressOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyCancel_45in_45progressOneOf1() {
		if (concurrencyCancel_45in_45progressOneOf1EClass == null) {
			concurrencyCancel_45in_45progressOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(8);
		}
		return concurrencyCancel_45in_45progressOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcurrencyCancel_45in_45progressOneOf1_Cancel_45in_45progress() {
        return (EReference)getConcurrencyCancel_45in_45progressOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfiguration() {
		if (configurationEClass == null) {
			configurationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(9);
		}
		return configurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfiguration_Configuration() {
        return (EReference)getConfiguration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationOneOf0() {
		if (configurationOneOf0EClass == null) {
			configurationOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(10);
		}
		return configurationOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationOneOf0_Configuration() {
        return (EAttribute)getConfigurationOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationOneOf1() {
		if (configurationOneOf1EClass == null) {
			configurationOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(11);
		}
		return configurationOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationOneOf1_Configuration() {
        return (EAttribute)getConfigurationOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationOneOf2() {
		if (configurationOneOf2EClass == null) {
			configurationOneOf2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(12);
		}
		return configurationOneOf2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationOneOf2_Configuration() {
        return (EAttribute)getConfigurationOneOf2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationOneOf3() {
		if (configurationOneOf3EClass == null) {
			configurationOneOf3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(13);
		}
		return configurationOneOf3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationOneOf3_Configuration() {
        return (EReference)getConfigurationOneOf3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfigurationOneOf3__Get__String() {
        return getConfigurationOneOf3().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationOneOf3AdditionalProperties() {
		if (configurationOneOf3AdditionalPropertiesEClass == null) {
			configurationOneOf3AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(14);
		}
		return configurationOneOf3AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationOneOf3AdditionalProperties_Key() {
        return (EAttribute)getConfigurationOneOf3AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationOneOf3AdditionalProperties_AdditionalProperties() {
        return (EReference)getConfigurationOneOf3AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfigurationOneOf3AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getConfigurationOneOf3AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfigurationOneOf3AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getConfigurationOneOf3AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationOneOf4() {
		if (configurationOneOf4EClass == null) {
			configurationOneOf4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(15);
		}
		return configurationOneOf4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationOneOf4_Configuration() {
        return (EReference)getConfigurationOneOf4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationOneOf4Items() {
		if (configurationOneOf4ItemsEClass == null) {
			configurationOneOf4ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(16);
		}
		return configurationOneOf4ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationOneOf4Items_Items() {
        return (EReference)getConfigurationOneOf4Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainer() {
		if (containerEClass == null) {
			containerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(17);
		}
		return containerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Container() {
        return (EReference)getContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Image() {
        return (EAttribute)getContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Credentials() {
        return (EReference)getContainer().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Env() {
        return (EReference)getContainer().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Ports() {
        return (EReference)getContainer().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainer_Volumes() {
        return (EReference)getContainer().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainer_Options() {
        return (EAttribute)getContainer().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContainer__Get__String() {
        return getContainer().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerImage() {
		if (containerImageEClass == null) {
			containerImageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(18);
		}
		return containerImageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerImage_Image() {
        return (EAttribute)getContainerImage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerCredentials() {
		if (containerCredentialsEClass == null) {
			containerCredentialsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(19);
		}
		return containerCredentialsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerCredentials_Credentials() {
        return (EReference)getContainerCredentials().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerCredentials_Username() {
        return (EAttribute)getContainerCredentials().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerCredentials_Password() {
        return (EAttribute)getContainerCredentials().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContainerCredentials__Get__String() {
        return getContainerCredentials().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerCredentialsUsername() {
		if (containerCredentialsUsernameEClass == null) {
			containerCredentialsUsernameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(20);
		}
		return containerCredentialsUsernameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerCredentialsUsername_Username() {
        return (EAttribute)getContainerCredentialsUsername().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerCredentialsPassword() {
		if (containerCredentialsPasswordEClass == null) {
			containerCredentialsPasswordEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(21);
		}
		return containerCredentialsPasswordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerCredentialsPassword_Password() {
        return (EAttribute)getContainerCredentialsPassword().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerEnv() {
		if (containerEnvEClass == null) {
			containerEnvEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(22);
		}
		return containerEnvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerEnv_Env() {
        return (EReference)getContainerEnv().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPorts() {
		if (containerPortsEClass == null) {
			containerPortsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(23);
		}
		return containerPortsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerPorts_Ports() {
        return (EReference)getContainerPorts().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPortsItems() {
		if (containerPortsItemsEClass == null) {
			containerPortsItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(24);
		}
		return containerPortsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerPortsItems_Items() {
        return (EReference)getContainerPortsItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPortsItemsOneOf0() {
		if (containerPortsItemsOneOf0EClass == null) {
			containerPortsItemsOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(25);
		}
		return containerPortsItemsOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerPortsItemsOneOf0_Items() {
        return (EAttribute)getContainerPortsItemsOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPortsItemsOneOf1() {
		if (containerPortsItemsOneOf1EClass == null) {
			containerPortsItemsOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(26);
		}
		return containerPortsItemsOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerPortsItemsOneOf1_Items() {
        return (EAttribute)getContainerPortsItemsOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerVolumes() {
		if (containerVolumesEClass == null) {
			containerVolumesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(27);
		}
		return containerVolumesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerVolumes_Volumes() {
        return (EReference)getContainerVolumes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerVolumesItems() {
		if (containerVolumesItemsEClass == null) {
			containerVolumesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(28);
		}
		return containerVolumesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerVolumesItems_Items() {
        return (EAttribute)getContainerVolumesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContainerVolumesItems__RegexMatch() {
        return getContainerVolumesItems().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerOptions() {
		if (containerOptionsEClass == null) {
			containerOptionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(29);
		}
		return containerOptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerOptions_Options() {
        return (EAttribute)getContainerOptions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaults() {
		if (defaultsEClass == null) {
			defaultsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(30);
		}
		return defaultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefaults_Defaults() {
        return (EReference)getDefaults().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefaults_Run() {
        return (EReference)getDefaults().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefaults__Get__String() {
        return getDefaults().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultsRun() {
		if (defaultsRunEClass == null) {
			defaultsRunEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(31);
		}
		return defaultsRunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefaultsRun_Run() {
        return (EReference)getDefaultsRun().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefaultsRun_Shell() {
        return (EReference)getDefaultsRun().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefaultsRun_Working_45directory() {
        return (EReference)getDefaultsRun().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getDefaultsRun__Get__String() {
        return getDefaultsRun().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultsRunShell() {
		if (defaultsRunShellEClass == null) {
			defaultsRunShellEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(32);
		}
		return defaultsRunShellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefaultsRunShell_Shell() {
        return (EReference)getDefaultsRunShell().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultsRunWorking_45directory() {
		if (defaultsRunWorking_45directoryEClass == null) {
			defaultsRunWorking_45directoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(33);
		}
		return defaultsRunWorking_45directoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getDefaultsRunWorking_45directory_Working_45directory() {
        return (EReference)getDefaultsRunWorking_45directory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions() {
		if (permissionsEClass == null) {
			permissionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(34);
		}
		return permissionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_Permissions() {
        return (EReference)getPermissions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissionsOneOf0() {
		if (permissionsOneOf0EClass == null) {
			permissionsOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(35);
		}
		return permissionsOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissionsOneOf0_Permissions() {
        return (EReference)getPermissionsOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissionsOneOf1() {
		if (permissionsOneOf1EClass == null) {
			permissionsOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(36);
		}
		return permissionsOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissionsOneOf1_Permissions() {
        return (EReference)getPermissionsOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45event() {
		if (permissions_45eventEClass == null) {
			permissions_45eventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(37);
		}
		return permissions_45eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45event_Permissions_45event() {
        return (EReference)getPermissions_45event().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45event_Actions() {
        return (EReference)getPermissions_45event().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45event_Checks() {
        return (EReference)getPermissions_45event().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45event_Contents() {
        return (EReference)getPermissions_45event().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45event_Deployments() {
        return (EReference)getPermissions_45event().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45event_Discussions() {
        return (EReference)getPermissions_45event().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45event_Id_45token() {
        return (EReference)getPermissions_45event().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45event_Issues() {
        return (EReference)getPermissions_45event().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45event_Packages() {
        return (EReference)getPermissions_45event().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45event_Pages() {
        return (EReference)getPermissions_45event().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45event_Pull_45requests() {
        return (EReference)getPermissions_45event().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45event_Repository_45projects() {
        return (EReference)getPermissions_45event().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45event_Security_45events() {
        return (EReference)getPermissions_45event().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45event_Statuses() {
        return (EReference)getPermissions_45event().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPermissions_45event__Get__String() {
        return getPermissions_45event().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45eventActions() {
		if (permissions_45eventActionsEClass == null) {
			permissions_45eventActionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(38);
		}
		return permissions_45eventActionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45eventActions_Actions() {
        return (EReference)getPermissions_45eventActions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45eventChecks() {
		if (permissions_45eventChecksEClass == null) {
			permissions_45eventChecksEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(39);
		}
		return permissions_45eventChecksEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45eventChecks_Checks() {
        return (EReference)getPermissions_45eventChecks().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45eventContents() {
		if (permissions_45eventContentsEClass == null) {
			permissions_45eventContentsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(40);
		}
		return permissions_45eventContentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45eventContents_Contents() {
        return (EReference)getPermissions_45eventContents().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45eventDeployments() {
		if (permissions_45eventDeploymentsEClass == null) {
			permissions_45eventDeploymentsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(41);
		}
		return permissions_45eventDeploymentsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45eventDeployments_Deployments() {
        return (EReference)getPermissions_45eventDeployments().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45eventDiscussions() {
		if (permissions_45eventDiscussionsEClass == null) {
			permissions_45eventDiscussionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(42);
		}
		return permissions_45eventDiscussionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45eventDiscussions_Discussions() {
        return (EReference)getPermissions_45eventDiscussions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45eventId_45token() {
		if (permissions_45eventId_45tokenEClass == null) {
			permissions_45eventId_45tokenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(43);
		}
		return permissions_45eventId_45tokenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45eventId_45token_Id_45token() {
        return (EReference)getPermissions_45eventId_45token().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45eventIssues() {
		if (permissions_45eventIssuesEClass == null) {
			permissions_45eventIssuesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(44);
		}
		return permissions_45eventIssuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45eventIssues_Issues() {
        return (EReference)getPermissions_45eventIssues().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45eventPackages() {
		if (permissions_45eventPackagesEClass == null) {
			permissions_45eventPackagesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(45);
		}
		return permissions_45eventPackagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45eventPackages_Packages() {
        return (EReference)getPermissions_45eventPackages().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45eventPages() {
		if (permissions_45eventPagesEClass == null) {
			permissions_45eventPagesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(46);
		}
		return permissions_45eventPagesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45eventPages_Pages() {
        return (EReference)getPermissions_45eventPages().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45eventPull_45requests() {
		if (permissions_45eventPull_45requestsEClass == null) {
			permissions_45eventPull_45requestsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(47);
		}
		return permissions_45eventPull_45requestsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45eventPull_45requests_Pull_45requests() {
        return (EReference)getPermissions_45eventPull_45requests().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45eventRepository_45projects() {
		if (permissions_45eventRepository_45projectsEClass == null) {
			permissions_45eventRepository_45projectsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(48);
		}
		return permissions_45eventRepository_45projectsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45eventRepository_45projects_Repository_45projects() {
        return (EReference)getPermissions_45eventRepository_45projects().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45eventSecurity_45events() {
		if (permissions_45eventSecurity_45eventsEClass == null) {
			permissions_45eventSecurity_45eventsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(49);
		}
		return permissions_45eventSecurity_45eventsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45eventSecurity_45events_Security_45events() {
        return (EReference)getPermissions_45eventSecurity_45events().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45eventStatuses() {
		if (permissions_45eventStatusesEClass == null) {
			permissions_45eventStatusesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(50);
		}
		return permissions_45eventStatusesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45eventStatuses_Statuses() {
        return (EReference)getPermissions_45eventStatuses().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45level() {
		if (permissions_45levelEClass == null) {
			permissions_45levelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(51);
		}
		return permissions_45levelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissions_45level_Permissions_45level() {
        return (EReference)getPermissions_45level().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnv() {
		if (envEClass == null) {
			envEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(52);
		}
		return envEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnv_Env() {
        return (EReference)getEnv().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0() {
		if (envOneOf0EClass == null) {
			envOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(53);
		}
		return envOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvOneOf0_Env() {
        return (EReference)getEnvOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnvOneOf0__Get__String() {
        return getEnvOneOf0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalProperties() {
		if (envOneOf0AdditionalPropertiesEClass == null) {
			envOneOf0AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(54);
		}
		return envOneOf0AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvOneOf0AdditionalProperties_Key() {
        return (EAttribute)getEnvOneOf0AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvOneOf0AdditionalProperties_AdditionalProperties() {
        return (EReference)getEnvOneOf0AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnvOneOf0AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getEnvOneOf0AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnvOneOf0AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getEnvOneOf0AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalPropertiesOneOf0() {
		if (envOneOf0AdditionalPropertiesOneOf0EClass == null) {
			envOneOf0AdditionalPropertiesOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(55);
		}
		return envOneOf0AdditionalPropertiesOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvOneOf0AdditionalPropertiesOneOf0_AdditionalProperties() {
        return (EAttribute)getEnvOneOf0AdditionalPropertiesOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalPropertiesOneOf1() {
		if (envOneOf0AdditionalPropertiesOneOf1EClass == null) {
			envOneOf0AdditionalPropertiesOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(56);
		}
		return envOneOf0AdditionalPropertiesOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvOneOf0AdditionalPropertiesOneOf1_AdditionalProperties() {
        return (EAttribute)getEnvOneOf0AdditionalPropertiesOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalPropertiesOneOf2() {
		if (envOneOf0AdditionalPropertiesOneOf2EClass == null) {
			envOneOf0AdditionalPropertiesOneOf2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(57);
		}
		return envOneOf0AdditionalPropertiesOneOf2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvOneOf0AdditionalPropertiesOneOf2_AdditionalProperties() {
        return (EAttribute)getEnvOneOf0AdditionalPropertiesOneOf2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf1() {
		if (envOneOf1EClass == null) {
			envOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(58);
		}
		return envOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvOneOf1_Env() {
        return (EReference)getEnvOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironment() {
		if (environmentEClass == null) {
			environmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(59);
		}
		return environmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvironment_Environment() {
        return (EReference)getEnvironment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_Name() {
        return (EAttribute)getEnvironment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironment_Url() {
        return (EAttribute)getEnvironment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnvironment__Get__String() {
        return getEnvironment().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentName() {
		if (environmentNameEClass == null) {
			environmentNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(60);
		}
		return environmentNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentName_Name() {
        return (EAttribute)getEnvironmentName().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentUrl() {
		if (environmentUrlEClass == null) {
			environmentUrlEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(61);
		}
		return environmentUrlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvironmentUrl_Url() {
        return (EAttribute)getEnvironmentUrl().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEvent() {
		if (eventEClass == null) {
			eventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(62);
		}
		return eventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEvent_Event() {
        return (EReference)getEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObject() {
		if (eventObjectEClass == null) {
			eventObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(63);
		}
		return eventObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventObject_EventObject() {
        return (EReference)getEventObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectOneOf0() {
		if (eventObjectOneOf0EClass == null) {
			eventObjectOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(64);
		}
		return eventObjectOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventObjectOneOf0_EventObject() {
        return (EReference)getEventObjectOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEventObjectOneOf0__Get__String() {
        return getEventObjectOneOf0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectOneOf1() {
		if (eventObjectOneOf1EClass == null) {
			eventObjectOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(65);
		}
		return eventObjectOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventObjectOneOf1_EventObject() {
        return (EReference)getEventObjectOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getExpressionSyntax() {
		if (expressionSyntaxEClass == null) {
			expressionSyntaxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(66);
		}
		return expressionSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getExpressionSyntax_ExpressionSyntax() {
        return (EAttribute)getExpressionSyntax().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getExpressionSyntax__RegexMatch() {
        return getExpressionSyntax().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getStringContainingExpressionSyntax() {
		if (stringContainingExpressionSyntaxEClass == null) {
			stringContainingExpressionSyntaxEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(67);
		}
		return stringContainingExpressionSyntaxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getStringContainingExpressionSyntax_StringContainingExpressionSyntax() {
        return (EAttribute)getStringContainingExpressionSyntax().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getStringContainingExpressionSyntax__RegexMatch() {
        return getStringContainingExpressionSyntax().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlobs() {
		if (globsEClass == null) {
			globsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(68);
		}
		return globsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobs_Globs() {
        return (EReference)getGlobs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlobsItems() {
		if (globsItemsEClass == null) {
			globsItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(69);
		}
		return globsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGlobsItems_Items() {
        return (EAttribute)getGlobsItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMachine() {
		if (machineEClass == null) {
			machineEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(70);
		}
		return machineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMachine_Machine() {
        return (EReference)getMachine().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getName_() {
		if (nameEClass == null) {
			nameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(71);
		}
		return nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getName_Name() {
        return (EAttribute)getName_().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getName__RegexMatch() {
        return getName_().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPath() {
		if (pathEClass == null) {
			pathEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(72);
		}
		return pathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPath_Path() {
        return (EReference)getPath().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRef() {
		if (refEClass == null) {
			refEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(73);
		}
		return refEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRef_Ref() {
        return (EReference)getRef().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefBranches() {
		if (refBranchesEClass == null) {
			refBranchesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(74);
		}
		return refBranchesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefBranches_Branches() {
        return (EReference)getRefBranches().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefBranches_45ignore() {
		if (refBranches_45ignoreEClass == null) {
			refBranches_45ignoreEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(75);
		}
		return refBranches_45ignoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefBranches_45ignore_Branches_45ignore() {
        return (EReference)getRefBranches_45ignore().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefTags() {
		if (refTagsEClass == null) {
			refTagsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(76);
		}
		return refTagsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefTags_Tags() {
        return (EReference)getRefTags().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefTags_45ignore() {
		if (refTags_45ignoreEClass == null) {
			refTags_45ignoreEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(77);
		}
		return refTags_45ignoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefTags_45ignore_Tags_45ignore() {
        return (EReference)getRefTags_45ignore().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefPaths() {
		if (refPathsEClass == null) {
			refPathsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(78);
		}
		return refPathsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefPaths_Paths() {
        return (EReference)getRefPaths().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefPaths_45ignore() {
		if (refPaths_45ignoreEClass == null) {
			refPaths_45ignoreEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(79);
		}
		return refPaths_45ignoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefPaths_45ignore_Paths_45ignore() {
        return (EReference)getRefPaths_45ignore().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0() {
		if (refOneOf0EClass == null) {
			refOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(80);
		}
		return refOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0_Ref() {
        return (EReference)getRefOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0__Get__String() {
        return getRefOneOf0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0() {
		if (refOneOf0AllOf0EClass == null) {
			refOneOf0AllOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(81);
		}
		return refOneOf0AllOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf0_Ref() {
        return (EReference)getRefOneOf0AllOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0Not() {
		if (refOneOf0AllOf0NotEClass == null) {
			refOneOf0AllOf0NotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(82);
		}
		return refOneOf0AllOf0NotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf0Not_Ref() {
        return (EReference)getRefOneOf0AllOf0Not().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1() {
		if (refOneOf0AllOf1EClass == null) {
			refOneOf0AllOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(83);
		}
		return refOneOf0AllOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf1_Ref() {
        return (EReference)getRefOneOf0AllOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1Not() {
		if (refOneOf0AllOf1NotEClass == null) {
			refOneOf0AllOf1NotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(84);
		}
		return refOneOf0AllOf1NotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf1Not_Ref() {
        return (EReference)getRefOneOf0AllOf1Not().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2() {
		if (refOneOf0AllOf2EClass == null) {
			refOneOf0AllOf2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(85);
		}
		return refOneOf0AllOf2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf2_Ref() {
        return (EReference)getRefOneOf0AllOf2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2Not() {
		if (refOneOf0AllOf2NotEClass == null) {
			refOneOf0AllOf2NotEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(86);
		}
		return refOneOf0AllOf2NotEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf2Not_Ref() {
        return (EReference)getRefOneOf0AllOf2Not().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf1() {
		if (refOneOf1EClass == null) {
			refOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(87);
		}
		return refOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf1_Ref() {
        return (EReference)getRefOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShell() {
		if (shellEClass == null) {
			shellEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(88);
		}
		return shellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShell_Shell() {
        return (EReference)getShell().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShellAnyOf0() {
		if (shellAnyOf0EClass == null) {
			shellAnyOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(89);
		}
		return shellAnyOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShellAnyOf0_Shell() {
        return (EAttribute)getShellAnyOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShellAnyOf1() {
		if (shellAnyOf1EClass == null) {
			shellAnyOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(90);
		}
		return shellAnyOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShellAnyOf1_Shell() {
        return (EReference)getShellAnyOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypes() {
		if (typesEClass == null) {
			typesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(91);
		}
		return typesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypes_Types() {
        return (EReference)getTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getWorking_45directory() {
		if (working_45directoryEClass == null) {
			working_45directoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(92);
		}
		return working_45directoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getWorking_45directory_Working_45directory() {
        return (EAttribute)getWorking_45directory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeeds() {
		if (jobNeedsEClass == null) {
			jobNeedsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(93);
		}
		return jobNeedsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobNeeds_JobNeeds() {
        return (EReference)getJobNeeds().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeedsOneOf0() {
		if (jobNeedsOneOf0EClass == null) {
			jobNeedsOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(94);
		}
		return jobNeedsOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobNeedsOneOf0_JobNeeds() {
        return (EReference)getJobNeedsOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeedsOneOf0Items() {
		if (jobNeedsOneOf0ItemsEClass == null) {
			jobNeedsOneOf0ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(95);
		}
		return jobNeedsOneOf0ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobNeedsOneOf0Items_Items() {
        return (EReference)getJobNeedsOneOf0Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeedsOneOf1() {
		if (jobNeedsOneOf1EClass == null) {
			jobNeedsOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(96);
		}
		return jobNeedsOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobNeedsOneOf1_JobNeeds() {
        return (EReference)getJobNeedsOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJob() {
		if (reusableWorkflowCallJobEClass == null) {
			reusableWorkflowCallJobEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(97);
		}
		return reusableWorkflowCallJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJob_ReusableWorkflowCallJob() {
        return (EReference)getReusableWorkflowCallJob().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJob_Name() {
        return (EAttribute)getReusableWorkflowCallJob().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJob_Needs() {
        return (EReference)getReusableWorkflowCallJob().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJob_Permissions() {
        return (EReference)getReusableWorkflowCallJob().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJob_If_() {
        return (EReference)getReusableWorkflowCallJob().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJob_Uses() {
        return (EAttribute)getReusableWorkflowCallJob().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJob_With() {
        return (EReference)getReusableWorkflowCallJob().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJob_Secrets() {
        return (EReference)getReusableWorkflowCallJob().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJob_Strategy() {
        return (EReference)getReusableWorkflowCallJob().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJob_Concurrency() {
        return (EReference)getReusableWorkflowCallJob().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJob__Get__String() {
        return getReusableWorkflowCallJob().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobName() {
		if (reusableWorkflowCallJobNameEClass == null) {
			reusableWorkflowCallJobNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(98);
		}
		return reusableWorkflowCallJobNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobName_Name() {
        return (EAttribute)getReusableWorkflowCallJobName().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobNeeds() {
		if (reusableWorkflowCallJobNeedsEClass == null) {
			reusableWorkflowCallJobNeedsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(99);
		}
		return reusableWorkflowCallJobNeedsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobNeeds_Needs() {
        return (EReference)getReusableWorkflowCallJobNeeds().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobPermissions() {
		if (reusableWorkflowCallJobPermissionsEClass == null) {
			reusableWorkflowCallJobPermissionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(100);
		}
		return reusableWorkflowCallJobPermissionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobPermissions_Permissions() {
        return (EReference)getReusableWorkflowCallJobPermissions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobIf() {
		if (reusableWorkflowCallJobIfEClass == null) {
			reusableWorkflowCallJobIfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(101);
		}
		return reusableWorkflowCallJobIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobIf_If_() {
        return (EReference)getReusableWorkflowCallJobIf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobUses() {
		if (reusableWorkflowCallJobUsesEClass == null) {
			reusableWorkflowCallJobUsesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(102);
		}
		return reusableWorkflowCallJobUsesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobUses_Uses() {
        return (EAttribute)getReusableWorkflowCallJobUses().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobUses__RegexMatch() {
        return getReusableWorkflowCallJobUses().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobWith() {
		if (reusableWorkflowCallJobWithEClass == null) {
			reusableWorkflowCallJobWithEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(103);
		}
		return reusableWorkflowCallJobWithEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobWith_With() {
        return (EReference)getReusableWorkflowCallJobWith().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobSecrets() {
		if (reusableWorkflowCallJobSecretsEClass == null) {
			reusableWorkflowCallJobSecretsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(104);
		}
		return reusableWorkflowCallJobSecretsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobSecrets_Secrets() {
        return (EReference)getReusableWorkflowCallJobSecrets().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobSecretsOneOf0() {
		if (reusableWorkflowCallJobSecretsOneOf0EClass == null) {
			reusableWorkflowCallJobSecretsOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(105);
		}
		return reusableWorkflowCallJobSecretsOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobSecretsOneOf0_Secrets() {
        return (EReference)getReusableWorkflowCallJobSecretsOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobSecretsOneOf1() {
		if (reusableWorkflowCallJobSecretsOneOf1EClass == null) {
			reusableWorkflowCallJobSecretsOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(106);
		}
		return reusableWorkflowCallJobSecretsOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobSecretsOneOf1_Secrets() {
        return (EReference)getReusableWorkflowCallJobSecretsOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategy() {
		if (reusableWorkflowCallJobStrategyEClass == null) {
			reusableWorkflowCallJobStrategyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(107);
		}
		return reusableWorkflowCallJobStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategy_Strategy() {
        return (EReference)getReusableWorkflowCallJobStrategy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategy_Matrix() {
        return (EReference)getReusableWorkflowCallJobStrategy().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategy_Fail_45fast() {
        return (EAttribute)getReusableWorkflowCallJobStrategy().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategy_Max_45parallel() {
        return (EAttribute)getReusableWorkflowCallJobStrategy().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategy__Get__String() {
        return getReusableWorkflowCallJobStrategy().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrix() {
		if (reusableWorkflowCallJobStrategyMatrixEClass == null) {
			reusableWorkflowCallJobStrategyMatrixEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(108);
		}
		return reusableWorkflowCallJobStrategyMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrix_Matrix() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrix().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixOneOf0() {
		if (reusableWorkflowCallJobStrategyMatrixOneOf0EClass == null) {
			reusableWorkflowCallJobStrategyMatrixOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(109);
		}
		return reusableWorkflowCallJobStrategyMatrixOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixOneOf0_Matrix() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixOneOf0__Get__String() {
        return getReusableWorkflowCallJobStrategyMatrixOneOf0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixOneOf1() {
		if (reusableWorkflowCallJobStrategyMatrixOneOf1EClass == null) {
			reusableWorkflowCallJobStrategyMatrixOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(110);
		}
		return reusableWorkflowCallJobStrategyMatrixOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixOneOf1_Matrix() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixPatternProperties0() {
		if (reusableWorkflowCallJobStrategyMatrixPatternProperties0EClass == null) {
			reusableWorkflowCallJobStrategyMatrixPatternProperties0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(111);
		}
		return reusableWorkflowCallJobStrategyMatrixPatternProperties0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyMatrixPatternProperties0_Key() {
        return (EAttribute)getReusableWorkflowCallJobStrategyMatrixPatternProperties0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixPatternProperties0_PatternProperties0() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixPatternProperties0().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixPatternProperties0__Find__String() {
        return getReusableWorkflowCallJobStrategyMatrixPatternProperties0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixPatternProperties0__Find() {
        return getReusableWorkflowCallJobStrategyMatrixPatternProperties0().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixPatternProperties0__ValidateKeyOnDefinedPatternProperties() {
        return getReusableWorkflowCallJobStrategyMatrixPatternProperties0().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixPatternProperties0__ValidateKeyOnDefinedProperties() {
        return getReusableWorkflowCallJobStrategyMatrixPatternProperties0().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixPatternProperties0Items() {
		if (reusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsEClass == null) {
			reusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(112);
		}
		return reusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixPatternProperties0Items_Items() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixPatternProperties0Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixPatternProperties0Items__Get__String() {
        return getReusableWorkflowCallJobStrategyMatrixPatternProperties0Items().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties() {
		if (reusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesEClass == null) {
			reusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(113);
		}
		return reusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties_Key() {
        return (EAttribute)getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties_AdditionalProperties() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalProperties() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesEClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(114);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyMatrixAdditionalProperties_Key() {
        return (EAttribute)getReusableWorkflowCallJobStrategyMatrixAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixAdditionalProperties_AdditionalProperties() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getReusableWorkflowCallJobStrategyMatrixAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getReusableWorkflowCallJobStrategyMatrixAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0EClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(115);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0_AdditionalProperties() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0ItemsEClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(116);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items_Items() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf0Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1EClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(117);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1_AdditionalProperties() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyFail_45fast() {
		if (reusableWorkflowCallJobStrategyFail_45fastEClass == null) {
			reusableWorkflowCallJobStrategyFail_45fastEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(118);
		}
		return reusableWorkflowCallJobStrategyFail_45fastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyFail_45fast_Fail_45fast() {
        return (EAttribute)getReusableWorkflowCallJobStrategyFail_45fast().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMax_45parallel() {
		if (reusableWorkflowCallJobStrategyMax_45parallelEClass == null) {
			reusableWorkflowCallJobStrategyMax_45parallelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(119);
		}
		return reusableWorkflowCallJobStrategyMax_45parallelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyMax_45parallel_Max_45parallel() {
        return (EAttribute)getReusableWorkflowCallJobStrategyMax_45parallel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobConcurrency() {
		if (reusableWorkflowCallJobConcurrencyEClass == null) {
			reusableWorkflowCallJobConcurrencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(120);
		}
		return reusableWorkflowCallJobConcurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobConcurrency_Concurrency() {
        return (EReference)getReusableWorkflowCallJobConcurrency().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobConcurrencyOneOf0() {
		if (reusableWorkflowCallJobConcurrencyOneOf0EClass == null) {
			reusableWorkflowCallJobConcurrencyOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(121);
		}
		return reusableWorkflowCallJobConcurrencyOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobConcurrencyOneOf0_Concurrency() {
        return (EAttribute)getReusableWorkflowCallJobConcurrencyOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobConcurrencyOneOf1() {
		if (reusableWorkflowCallJobConcurrencyOneOf1EClass == null) {
			reusableWorkflowCallJobConcurrencyOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(122);
		}
		return reusableWorkflowCallJobConcurrencyOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobConcurrencyOneOf1_Concurrency() {
        return (EReference)getReusableWorkflowCallJobConcurrencyOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJob() {
		if (normalJobEClass == null) {
			normalJobEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(123);
		}
		return normalJobEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_NormalJob() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJob_Name() {
        return (EAttribute)getNormalJob().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_Needs() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_Permissions() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_Runs_45on() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_Environment() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_Outputs() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_Env() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_Defaults() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_If_() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_Steps() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJob_Timeout_45minutes() {
        return (EAttribute)getNormalJob().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_Strategy() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_Continue_45on_45error() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_Container() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_Services() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJob_Concurrency() {
        return (EReference)getNormalJob().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJob__Get__String() {
        return getNormalJob().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobName() {
		if (normalJobNameEClass == null) {
			normalJobNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(124);
		}
		return normalJobNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobName_Name() {
        return (EAttribute)getNormalJobName().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobNeeds() {
		if (normalJobNeedsEClass == null) {
			normalJobNeedsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(125);
		}
		return normalJobNeedsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobNeeds_Needs() {
        return (EReference)getNormalJobNeeds().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobPermissions() {
		if (normalJobPermissionsEClass == null) {
			normalJobPermissionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(126);
		}
		return normalJobPermissionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobPermissions_Permissions() {
        return (EReference)getNormalJobPermissions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45on() {
		if (normalJobRuns_45onEClass == null) {
			normalJobRuns_45onEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(127);
		}
		return normalJobRuns_45onEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45on_Runs_45on() {
        return (EReference)getNormalJobRuns_45on().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf0() {
		if (normalJobRuns_45onOneOf0EClass == null) {
			normalJobRuns_45onOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(128);
		}
		return normalJobRuns_45onOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf0_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1() {
		if (normalJobRuns_45onOneOf1EClass == null) {
			normalJobRuns_45onOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(129);
		}
		return normalJobRuns_45onOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf0() {
		if (normalJobRuns_45onOneOf1AnyOf0EClass == null) {
			normalJobRuns_45onOneOf1AnyOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(130);
		}
		return normalJobRuns_45onOneOf1AnyOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf0_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf0Items0() {
		if (normalJobRuns_45onOneOf1AnyOf0Items0EClass == null) {
			normalJobRuns_45onOneOf1AnyOf0Items0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(131);
		}
		return normalJobRuns_45onOneOf1AnyOf0Items0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf0Items0_Items0() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf0Items0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf0AdditionalItems() {
		if (normalJobRuns_45onOneOf1AnyOf0AdditionalItemsEClass == null) {
			normalJobRuns_45onOneOf1AnyOf0AdditionalItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(132);
		}
		return normalJobRuns_45onOneOf1AnyOf0AdditionalItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf0AdditionalItems_AdditionalItems() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf0AdditionalItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1() {
		if (normalJobRuns_45onOneOf1AnyOf1EClass == null) {
			normalJobRuns_45onOneOf1AnyOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(133);
		}
		return normalJobRuns_45onOneOf1AnyOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf1_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1Items0() {
		if (normalJobRuns_45onOneOf1AnyOf1Items0EClass == null) {
			normalJobRuns_45onOneOf1AnyOf1Items0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(134);
		}
		return normalJobRuns_45onOneOf1AnyOf1Items0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf1Items0_Items0() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf1Items0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1Items1() {
		if (normalJobRuns_45onOneOf1AnyOf1Items1EClass == null) {
			normalJobRuns_45onOneOf1AnyOf1Items1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(135);
		}
		return normalJobRuns_45onOneOf1AnyOf1Items1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf1Items1_Items1() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf1Items1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1AdditionalItems() {
		if (normalJobRuns_45onOneOf1AnyOf1AdditionalItemsEClass == null) {
			normalJobRuns_45onOneOf1AnyOf1AdditionalItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(136);
		}
		return normalJobRuns_45onOneOf1AnyOf1AdditionalItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf1AdditionalItems_AdditionalItems() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf1AdditionalItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2() {
		if (normalJobRuns_45onOneOf1AnyOf2EClass == null) {
			normalJobRuns_45onOneOf1AnyOf2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(137);
		}
		return normalJobRuns_45onOneOf1AnyOf2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf2_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2Items0() {
		if (normalJobRuns_45onOneOf1AnyOf2Items0EClass == null) {
			normalJobRuns_45onOneOf1AnyOf2Items0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(138);
		}
		return normalJobRuns_45onOneOf1AnyOf2Items0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf2Items0_Items0() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf2Items0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2Items1() {
		if (normalJobRuns_45onOneOf1AnyOf2Items1EClass == null) {
			normalJobRuns_45onOneOf1AnyOf2Items1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(139);
		}
		return normalJobRuns_45onOneOf1AnyOf2Items1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf2Items1_Items1() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf2Items1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2AdditionalItems() {
		if (normalJobRuns_45onOneOf1AnyOf2AdditionalItemsEClass == null) {
			normalJobRuns_45onOneOf1AnyOf2AdditionalItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(140);
		}
		return normalJobRuns_45onOneOf1AnyOf2AdditionalItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf2AdditionalItems_AdditionalItems() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf2AdditionalItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3() {
		if (normalJobRuns_45onOneOf1AnyOf3EClass == null) {
			normalJobRuns_45onOneOf1AnyOf3EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(141);
		}
		return normalJobRuns_45onOneOf1AnyOf3EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf3_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf3().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3Items0() {
		if (normalJobRuns_45onOneOf1AnyOf3Items0EClass == null) {
			normalJobRuns_45onOneOf1AnyOf3Items0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(142);
		}
		return normalJobRuns_45onOneOf1AnyOf3Items0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf3Items0_Items0() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf3Items0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3Items1() {
		if (normalJobRuns_45onOneOf1AnyOf3Items1EClass == null) {
			normalJobRuns_45onOneOf1AnyOf3Items1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(143);
		}
		return normalJobRuns_45onOneOf1AnyOf3Items1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf3Items1_Items1() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf3Items1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3Items2() {
		if (normalJobRuns_45onOneOf1AnyOf3Items2EClass == null) {
			normalJobRuns_45onOneOf1AnyOf3Items2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(144);
		}
		return normalJobRuns_45onOneOf1AnyOf3Items2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf3Items2_Items2() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf3Items2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3AdditionalItems() {
		if (normalJobRuns_45onOneOf1AnyOf3AdditionalItemsEClass == null) {
			normalJobRuns_45onOneOf1AnyOf3AdditionalItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(145);
		}
		return normalJobRuns_45onOneOf1AnyOf3AdditionalItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf3AdditionalItems_AdditionalItems() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf3AdditionalItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4() {
		if (normalJobRuns_45onOneOf1AnyOf4EClass == null) {
			normalJobRuns_45onOneOf1AnyOf4EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(146);
		}
		return normalJobRuns_45onOneOf1AnyOf4EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf4_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf4().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4Items0() {
		if (normalJobRuns_45onOneOf1AnyOf4Items0EClass == null) {
			normalJobRuns_45onOneOf1AnyOf4Items0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(147);
		}
		return normalJobRuns_45onOneOf1AnyOf4Items0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf4Items0_Items0() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf4Items0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4Items1() {
		if (normalJobRuns_45onOneOf1AnyOf4Items1EClass == null) {
			normalJobRuns_45onOneOf1AnyOf4Items1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(148);
		}
		return normalJobRuns_45onOneOf1AnyOf4Items1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf4Items1_Items1() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf4Items1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4Items2() {
		if (normalJobRuns_45onOneOf1AnyOf4Items2EClass == null) {
			normalJobRuns_45onOneOf1AnyOf4Items2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(149);
		}
		return normalJobRuns_45onOneOf1AnyOf4Items2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf4Items2_Items2() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf4Items2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4AdditionalItems() {
		if (normalJobRuns_45onOneOf1AnyOf4AdditionalItemsEClass == null) {
			normalJobRuns_45onOneOf1AnyOf4AdditionalItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(150);
		}
		return normalJobRuns_45onOneOf1AnyOf4AdditionalItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf4AdditionalItems_AdditionalItems() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf4AdditionalItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf2() {
		if (normalJobRuns_45onOneOf2EClass == null) {
			normalJobRuns_45onOneOf2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(151);
		}
		return normalJobRuns_45onOneOf2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf2_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnvironment() {
		if (normalJobEnvironmentEClass == null) {
			normalJobEnvironmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(152);
		}
		return normalJobEnvironmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobEnvironment_Environment() {
        return (EReference)getNormalJobEnvironment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnvironmentOneOf0() {
		if (normalJobEnvironmentOneOf0EClass == null) {
			normalJobEnvironmentOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(153);
		}
		return normalJobEnvironmentOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobEnvironmentOneOf0_Environment() {
        return (EAttribute)getNormalJobEnvironmentOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnvironmentOneOf1() {
		if (normalJobEnvironmentOneOf1EClass == null) {
			normalJobEnvironmentOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(154);
		}
		return normalJobEnvironmentOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobEnvironmentOneOf1_Environment() {
        return (EReference)getNormalJobEnvironmentOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobOutputs() {
		if (normalJobOutputsEClass == null) {
			normalJobOutputsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(155);
		}
		return normalJobOutputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobOutputs_Outputs() {
        return (EReference)getNormalJobOutputs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobOutputs__Get__String() {
        return getNormalJobOutputs().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobOutputsAdditionalProperties() {
		if (normalJobOutputsAdditionalPropertiesEClass == null) {
			normalJobOutputsAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(156);
		}
		return normalJobOutputsAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobOutputsAdditionalProperties_Key() {
        return (EAttribute)getNormalJobOutputsAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobOutputsAdditionalProperties_AdditionalProperties() {
        return (EAttribute)getNormalJobOutputsAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobOutputsAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobOutputsAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobOutputsAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobOutputsAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnv() {
		if (normalJobEnvEClass == null) {
			normalJobEnvEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(157);
		}
		return normalJobEnvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobEnv_Env() {
        return (EReference)getNormalJobEnv().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobDefaults() {
		if (normalJobDefaultsEClass == null) {
			normalJobDefaultsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(158);
		}
		return normalJobDefaultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobDefaults_Defaults() {
        return (EReference)getNormalJobDefaults().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobIf() {
		if (normalJobIfEClass == null) {
			normalJobIfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(159);
		}
		return normalJobIfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobIf_If_() {
        return (EReference)getNormalJobIf().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobSteps() {
		if (normalJobStepsEClass == null) {
			normalJobStepsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(160);
		}
		return normalJobStepsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobSteps_Steps() {
        return (EReference)getNormalJobSteps().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItems() {
		if (normalJobStepsItemsEClass == null) {
			normalJobStepsItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(161);
		}
		return normalJobStepsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItems_Items() {
        return (EReference)getNormalJobStepsItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0() {
		if (normalJobStepsItemsAllOf0EClass == null) {
			normalJobStepsItemsAllOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(162);
		}
		return normalJobStepsItemsAllOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf0_Items() {
        return (EReference)getNormalJobStepsItemsAllOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0OneOf0() {
		if (normalJobStepsItemsAllOf0OneOf0EClass == null) {
			normalJobStepsItemsAllOf0OneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(163);
		}
		return normalJobStepsItemsAllOf0OneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf0OneOf0_Items() {
        return (EReference)getNormalJobStepsItemsAllOf0OneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf0OneOf0_Uses() {
        return (EAttribute)getNormalJobStepsItemsAllOf0OneOf0().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAllOf0OneOf0__Get__String() {
        return getNormalJobStepsItemsAllOf0OneOf0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0OneOf0Uses() {
		if (normalJobStepsItemsAllOf0OneOf0UsesEClass == null) {
			normalJobStepsItemsAllOf0OneOf0UsesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(164);
		}
		return normalJobStepsItemsAllOf0OneOf0UsesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf0OneOf0Uses_Uses() {
        return (EAttribute)getNormalJobStepsItemsAllOf0OneOf0Uses().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0OneOf1() {
		if (normalJobStepsItemsAllOf0OneOf1EClass == null) {
			normalJobStepsItemsAllOf0OneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(165);
		}
		return normalJobStepsItemsAllOf0OneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf0OneOf1_Items() {
        return (EReference)getNormalJobStepsItemsAllOf0OneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf0OneOf1_Run() {
        return (EAttribute)getNormalJobStepsItemsAllOf0OneOf1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAllOf0OneOf1__Get__String() {
        return getNormalJobStepsItemsAllOf0OneOf1().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0OneOf1Run() {
		if (normalJobStepsItemsAllOf0OneOf1RunEClass == null) {
			normalJobStepsItemsAllOf0OneOf1RunEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(166);
		}
		return normalJobStepsItemsAllOf0OneOf1RunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf0OneOf1Run_Run() {
        return (EAttribute)getNormalJobStepsItemsAllOf0OneOf1Run().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1() {
		if (normalJobStepsItemsAllOf1EClass == null) {
			normalJobStepsItemsAllOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(167);
		}
		return normalJobStepsItemsAllOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1_Items() {
        return (EReference)getNormalJobStepsItemsAllOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1_Id() {
        return (EAttribute)getNormalJobStepsItemsAllOf1().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1_If_() {
        return (EReference)getNormalJobStepsItemsAllOf1().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1_Name() {
        return (EAttribute)getNormalJobStepsItemsAllOf1().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1_Uses() {
        return (EAttribute)getNormalJobStepsItemsAllOf1().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1_Run() {
        return (EAttribute)getNormalJobStepsItemsAllOf1().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1_Working_45directory() {
        return (EReference)getNormalJobStepsItemsAllOf1().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1_Shell() {
        return (EReference)getNormalJobStepsItemsAllOf1().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1_With() {
        return (EReference)getNormalJobStepsItemsAllOf1().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1_Env() {
        return (EReference)getNormalJobStepsItemsAllOf1().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1_Continue_45on_45error() {
        return (EReference)getNormalJobStepsItemsAllOf1().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1_Timeout_45minutes() {
        return (EAttribute)getNormalJobStepsItemsAllOf1().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAllOf1__Get__String() {
        return getNormalJobStepsItemsAllOf1().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Id() {
		if (normalJobStepsItemsAllOf1IdEClass == null) {
			normalJobStepsItemsAllOf1IdEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(168);
		}
		return normalJobStepsItemsAllOf1IdEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1Id_Id() {
        return (EAttribute)getNormalJobStepsItemsAllOf1Id().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1If() {
		if (normalJobStepsItemsAllOf1IfEClass == null) {
			normalJobStepsItemsAllOf1IfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(169);
		}
		return normalJobStepsItemsAllOf1IfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1If_If_() {
        return (EReference)getNormalJobStepsItemsAllOf1If().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Name() {
		if (normalJobStepsItemsAllOf1NameEClass == null) {
			normalJobStepsItemsAllOf1NameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(170);
		}
		return normalJobStepsItemsAllOf1NameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1Name_Name() {
        return (EAttribute)getNormalJobStepsItemsAllOf1Name().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Uses() {
		if (normalJobStepsItemsAllOf1UsesEClass == null) {
			normalJobStepsItemsAllOf1UsesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(171);
		}
		return normalJobStepsItemsAllOf1UsesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1Uses_Uses() {
        return (EAttribute)getNormalJobStepsItemsAllOf1Uses().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Run() {
		if (normalJobStepsItemsAllOf1RunEClass == null) {
			normalJobStepsItemsAllOf1RunEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(172);
		}
		return normalJobStepsItemsAllOf1RunEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1Run_Run() {
        return (EAttribute)getNormalJobStepsItemsAllOf1Run().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Working_45directory() {
		if (normalJobStepsItemsAllOf1Working_45directoryEClass == null) {
			normalJobStepsItemsAllOf1Working_45directoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(173);
		}
		return normalJobStepsItemsAllOf1Working_45directoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1Working_45directory_Working_45directory() {
        return (EReference)getNormalJobStepsItemsAllOf1Working_45directory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Shell() {
		if (normalJobStepsItemsAllOf1ShellEClass == null) {
			normalJobStepsItemsAllOf1ShellEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(174);
		}
		return normalJobStepsItemsAllOf1ShellEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1Shell_Shell() {
        return (EReference)getNormalJobStepsItemsAllOf1Shell().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1With() {
		if (normalJobStepsItemsAllOf1WithEClass == null) {
			normalJobStepsItemsAllOf1WithEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(175);
		}
		return normalJobStepsItemsAllOf1WithEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1With_With() {
        return (EReference)getNormalJobStepsItemsAllOf1With().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1WithArgs() {
		if (normalJobStepsItemsAllOf1WithArgsEClass == null) {
			normalJobStepsItemsAllOf1WithArgsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(176);
		}
		return normalJobStepsItemsAllOf1WithArgsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1WithArgs_Args() {
        return (EAttribute)getNormalJobStepsItemsAllOf1WithArgs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1WithEntrypoint() {
		if (normalJobStepsItemsAllOf1WithEntrypointEClass == null) {
			normalJobStepsItemsAllOf1WithEntrypointEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(177);
		}
		return normalJobStepsItemsAllOf1WithEntrypointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1WithEntrypoint_Entrypoint() {
        return (EAttribute)getNormalJobStepsItemsAllOf1WithEntrypoint().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Env() {
		if (normalJobStepsItemsAllOf1EnvEClass == null) {
			normalJobStepsItemsAllOf1EnvEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(178);
		}
		return normalJobStepsItemsAllOf1EnvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1Env_Env() {
        return (EReference)getNormalJobStepsItemsAllOf1Env().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Continue_45on_45error() {
		if (normalJobStepsItemsAllOf1Continue_45on_45errorEClass == null) {
			normalJobStepsItemsAllOf1Continue_45on_45errorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(179);
		}
		return normalJobStepsItemsAllOf1Continue_45on_45errorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1Continue_45on_45error_Continue_45on_45error() {
        return (EReference)getNormalJobStepsItemsAllOf1Continue_45on_45error().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0() {
		if (normalJobStepsItemsAllOf1Continue_45on_45errorOneOf0EClass == null) {
			normalJobStepsItemsAllOf1Continue_45on_45errorOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(180);
		}
		return normalJobStepsItemsAllOf1Continue_45on_45errorOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0_Continue_45on_45error() {
        return (EAttribute)getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1() {
		if (normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1EClass == null) {
			normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(181);
		}
		return normalJobStepsItemsAllOf1Continue_45on_45errorOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1_Continue_45on_45error() {
        return (EReference)getNormalJobStepsItemsAllOf1Continue_45on_45errorOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Timeout_45minutes() {
		if (normalJobStepsItemsAllOf1Timeout_45minutesEClass == null) {
			normalJobStepsItemsAllOf1Timeout_45minutesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(182);
		}
		return normalJobStepsItemsAllOf1Timeout_45minutesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1Timeout_45minutes_Timeout_45minutes() {
        return (EAttribute)getNormalJobStepsItemsAllOf1Timeout_45minutes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobTimeout_45minutes() {
		if (normalJobTimeout_45minutesEClass == null) {
			normalJobTimeout_45minutesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(183);
		}
		return normalJobTimeout_45minutesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobTimeout_45minutes_Timeout_45minutes() {
        return (EAttribute)getNormalJobTimeout_45minutes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategy() {
		if (normalJobStrategyEClass == null) {
			normalJobStrategyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(184);
		}
		return normalJobStrategyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategy_Strategy() {
        return (EReference)getNormalJobStrategy().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategy_Matrix() {
        return (EReference)getNormalJobStrategy().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategy_Fail_45fast() {
        return (EAttribute)getNormalJobStrategy().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategy_Max_45parallel() {
        return (EAttribute)getNormalJobStrategy().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategy__Get__String() {
        return getNormalJobStrategy().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrix() {
		if (normalJobStrategyMatrixEClass == null) {
			normalJobStrategyMatrixEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(185);
		}
		return normalJobStrategyMatrixEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrix_Matrix() {
        return (EReference)getNormalJobStrategyMatrix().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixOneOf0() {
		if (normalJobStrategyMatrixOneOf0EClass == null) {
			normalJobStrategyMatrixOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(186);
		}
		return normalJobStrategyMatrixOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixOneOf0_Matrix() {
        return (EReference)getNormalJobStrategyMatrixOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixOneOf0__Get__String() {
        return getNormalJobStrategyMatrixOneOf0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixOneOf1() {
		if (normalJobStrategyMatrixOneOf1EClass == null) {
			normalJobStrategyMatrixOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(187);
		}
		return normalJobStrategyMatrixOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixOneOf1_Matrix() {
        return (EReference)getNormalJobStrategyMatrixOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixPatternProperties0() {
		if (normalJobStrategyMatrixPatternProperties0EClass == null) {
			normalJobStrategyMatrixPatternProperties0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(188);
		}
		return normalJobStrategyMatrixPatternProperties0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyMatrixPatternProperties0_Key() {
        return (EAttribute)getNormalJobStrategyMatrixPatternProperties0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixPatternProperties0_PatternProperties0() {
        return (EReference)getNormalJobStrategyMatrixPatternProperties0().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixPatternProperties0__Find__String() {
        return getNormalJobStrategyMatrixPatternProperties0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixPatternProperties0__Find() {
        return getNormalJobStrategyMatrixPatternProperties0().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixPatternProperties0__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobStrategyMatrixPatternProperties0().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixPatternProperties0__ValidateKeyOnDefinedProperties() {
        return getNormalJobStrategyMatrixPatternProperties0().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixPatternProperties0Items() {
		if (normalJobStrategyMatrixPatternProperties0ItemsEClass == null) {
			normalJobStrategyMatrixPatternProperties0ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(189);
		}
		return normalJobStrategyMatrixPatternProperties0ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixPatternProperties0Items_Items() {
        return (EReference)getNormalJobStrategyMatrixPatternProperties0Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixPatternProperties0Items__Get__String() {
        return getNormalJobStrategyMatrixPatternProperties0Items().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties() {
		if (normalJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesEClass == null) {
			normalJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(190);
		}
		return normalJobStrategyMatrixPatternProperties0ItemsAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties_Key() {
        return (EAttribute)getNormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobStrategyMatrixPatternProperties0ItemsAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalProperties() {
		if (normalJobStrategyMatrixAdditionalPropertiesEClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(191);
		}
		return normalJobStrategyMatrixAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyMatrixAdditionalProperties_Key() {
        return (EAttribute)getNormalJobStrategyMatrixAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixAdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobStrategyMatrixAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobStrategyMatrixAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobStrategyMatrixAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalPropertiesOneOf0() {
		if (normalJobStrategyMatrixAdditionalPropertiesOneOf0EClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(192);
		}
		return normalJobStrategyMatrixAdditionalPropertiesOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixAdditionalPropertiesOneOf0_AdditionalProperties() {
        return (EReference)getNormalJobStrategyMatrixAdditionalPropertiesOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalPropertiesOneOf0Items() {
		if (normalJobStrategyMatrixAdditionalPropertiesOneOf0ItemsEClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesOneOf0ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(193);
		}
		return normalJobStrategyMatrixAdditionalPropertiesOneOf0ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixAdditionalPropertiesOneOf0Items_Items() {
        return (EReference)getNormalJobStrategyMatrixAdditionalPropertiesOneOf0Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalPropertiesOneOf1() {
		if (normalJobStrategyMatrixAdditionalPropertiesOneOf1EClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(194);
		}
		return normalJobStrategyMatrixAdditionalPropertiesOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixAdditionalPropertiesOneOf1_AdditionalProperties() {
        return (EReference)getNormalJobStrategyMatrixAdditionalPropertiesOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyFail_45fast() {
		if (normalJobStrategyFail_45fastEClass == null) {
			normalJobStrategyFail_45fastEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(195);
		}
		return normalJobStrategyFail_45fastEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyFail_45fast_Fail_45fast() {
        return (EAttribute)getNormalJobStrategyFail_45fast().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMax_45parallel() {
		if (normalJobStrategyMax_45parallelEClass == null) {
			normalJobStrategyMax_45parallelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(196);
		}
		return normalJobStrategyMax_45parallelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyMax_45parallel_Max_45parallel() {
        return (EAttribute)getNormalJobStrategyMax_45parallel().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContinue_45on_45error() {
		if (normalJobContinue_45on_45errorEClass == null) {
			normalJobContinue_45on_45errorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(197);
		}
		return normalJobContinue_45on_45errorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobContinue_45on_45error_Continue_45on_45error() {
        return (EReference)getNormalJobContinue_45on_45error().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContinue_45on_45errorOneOf0() {
		if (normalJobContinue_45on_45errorOneOf0EClass == null) {
			normalJobContinue_45on_45errorOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(198);
		}
		return normalJobContinue_45on_45errorOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobContinue_45on_45errorOneOf0_Continue_45on_45error() {
        return (EAttribute)getNormalJobContinue_45on_45errorOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContinue_45on_45errorOneOf1() {
		if (normalJobContinue_45on_45errorOneOf1EClass == null) {
			normalJobContinue_45on_45errorOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(199);
		}
		return normalJobContinue_45on_45errorOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobContinue_45on_45errorOneOf1_Continue_45on_45error() {
        return (EReference)getNormalJobContinue_45on_45errorOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContainer() {
		if (normalJobContainerEClass == null) {
			normalJobContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(200);
		}
		return normalJobContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobContainer_Container() {
        return (EReference)getNormalJobContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContainerOneOf0() {
		if (normalJobContainerOneOf0EClass == null) {
			normalJobContainerOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(201);
		}
		return normalJobContainerOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobContainerOneOf0_Container() {
        return (EAttribute)getNormalJobContainerOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContainerOneOf1() {
		if (normalJobContainerOneOf1EClass == null) {
			normalJobContainerOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(202);
		}
		return normalJobContainerOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobContainerOneOf1_Container() {
        return (EReference)getNormalJobContainerOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobServices() {
		if (normalJobServicesEClass == null) {
			normalJobServicesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(203);
		}
		return normalJobServicesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobServices_Services() {
        return (EReference)getNormalJobServices().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobServices__Get__String() {
        return getNormalJobServices().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobServicesAdditionalProperties() {
		if (normalJobServicesAdditionalPropertiesEClass == null) {
			normalJobServicesAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(204);
		}
		return normalJobServicesAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobServicesAdditionalProperties_Key() {
        return (EAttribute)getNormalJobServicesAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobServicesAdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobServicesAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobServicesAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobServicesAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobServicesAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobServicesAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobConcurrency() {
		if (normalJobConcurrencyEClass == null) {
			normalJobConcurrencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(205);
		}
		return normalJobConcurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobConcurrency_Concurrency() {
        return (EReference)getNormalJobConcurrency().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobConcurrencyOneOf0() {
		if (normalJobConcurrencyOneOf0EClass == null) {
			normalJobConcurrencyOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(206);
		}
		return normalJobConcurrencyOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobConcurrencyOneOf0_Concurrency() {
        return (EAttribute)getNormalJobConcurrencyOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobConcurrencyOneOf1() {
		if (normalJobConcurrencyOneOf1EClass == null) {
			normalJobConcurrencyOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(207);
		}
		return normalJobConcurrencyOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobConcurrencyOneOf1_Concurrency() {
        return (EReference)getNormalJobConcurrencyOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootName() {
		if (githubwfRootNameEClass == null) {
			githubwfRootNameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(208);
		}
		return githubwfRootNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootName_Name() {
        return (EAttribute)getGithubwfRootName().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOn() {
		if (githubwfRootOnEClass == null) {
			githubwfRootOnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(209);
		}
		return githubwfRootOnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOn_On() {
        return (EReference)getGithubwfRootOn().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf0() {
		if (githubwfRootOnOneOf0EClass == null) {
			githubwfRootOnOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(210);
		}
		return githubwfRootOnOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf0_On() {
        return (EReference)getGithubwfRootOnOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf1() {
		if (githubwfRootOnOneOf1EClass == null) {
			githubwfRootOnOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(211);
		}
		return githubwfRootOnOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf1_On() {
        return (EReference)getGithubwfRootOnOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf1Items() {
		if (githubwfRootOnOneOf1ItemsEClass == null) {
			githubwfRootOnOneOf1ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(212);
		}
		return githubwfRootOnOneOf1ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf1Items_Items() {
        return (EReference)getGithubwfRootOnOneOf1Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2() {
		if (githubwfRootOnOneOf2EClass == null) {
			githubwfRootOnOneOf2EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(213);
		}
		return githubwfRootOnOneOf2EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_On() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Branch_protection_rule() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Check_run() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Check_suite() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Create() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Delete() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Deployment() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Deployment_status() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Discussion() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Discussion_comment() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Fork() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Gollum() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Issue_comment() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Issues() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Label() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Member() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Merge_group() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Milestone() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Page_build() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Project() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Project_card() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Project_column() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Public_() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Pull_request() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Pull_request_review() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Pull_request_review_comment() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Pull_request_target() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Push() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Registry_package() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Release() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Status() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Watch() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Workflow_call() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Workflow_dispatch() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Workflow_run() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Repository_dispatch() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2_Schedule() {
        return (EReference)getGithubwfRootOnOneOf2().getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2__Get__String() {
        return getGithubwfRootOnOneOf2().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Branch_protection_rule() {
		if (githubwfRootOnOneOf2Branch_protection_ruleEClass == null) {
			githubwfRootOnOneOf2Branch_protection_ruleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(214);
		}
		return githubwfRootOnOneOf2Branch_protection_ruleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Branch_protection_rule_Branch_protection_rule() {
        return (EReference)getGithubwfRootOnOneOf2Branch_protection_rule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Branch_protection_ruleTypes() {
		if (githubwfRootOnOneOf2Branch_protection_ruleTypesEClass == null) {
			githubwfRootOnOneOf2Branch_protection_ruleTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(215);
		}
		return githubwfRootOnOneOf2Branch_protection_ruleTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Branch_protection_ruleTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2Branch_protection_ruleTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Branch_protection_ruleTypesItems() {
		if (githubwfRootOnOneOf2Branch_protection_ruleTypesItemsEClass == null) {
			githubwfRootOnOneOf2Branch_protection_ruleTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(216);
		}
		return githubwfRootOnOneOf2Branch_protection_ruleTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Branch_protection_ruleTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Branch_protection_ruleTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Check_run() {
		if (githubwfRootOnOneOf2Check_runEClass == null) {
			githubwfRootOnOneOf2Check_runEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(217);
		}
		return githubwfRootOnOneOf2Check_runEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Check_run_Check_run() {
        return (EReference)getGithubwfRootOnOneOf2Check_run().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Check_runTypes() {
		if (githubwfRootOnOneOf2Check_runTypesEClass == null) {
			githubwfRootOnOneOf2Check_runTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(218);
		}
		return githubwfRootOnOneOf2Check_runTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Check_runTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2Check_runTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Check_runTypesItems() {
		if (githubwfRootOnOneOf2Check_runTypesItemsEClass == null) {
			githubwfRootOnOneOf2Check_runTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(219);
		}
		return githubwfRootOnOneOf2Check_runTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Check_runTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Check_runTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Check_suite() {
		if (githubwfRootOnOneOf2Check_suiteEClass == null) {
			githubwfRootOnOneOf2Check_suiteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(220);
		}
		return githubwfRootOnOneOf2Check_suiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Check_suite_Check_suite() {
        return (EReference)getGithubwfRootOnOneOf2Check_suite().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Check_suiteTypes() {
		if (githubwfRootOnOneOf2Check_suiteTypesEClass == null) {
			githubwfRootOnOneOf2Check_suiteTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(221);
		}
		return githubwfRootOnOneOf2Check_suiteTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Check_suiteTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2Check_suiteTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Check_suiteTypesItems() {
		if (githubwfRootOnOneOf2Check_suiteTypesItemsEClass == null) {
			githubwfRootOnOneOf2Check_suiteTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(222);
		}
		return githubwfRootOnOneOf2Check_suiteTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Check_suiteTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Check_suiteTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Create() {
		if (githubwfRootOnOneOf2CreateEClass == null) {
			githubwfRootOnOneOf2CreateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(223);
		}
		return githubwfRootOnOneOf2CreateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Create_Create() {
        return (EReference)getGithubwfRootOnOneOf2Create().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Delete() {
		if (githubwfRootOnOneOf2DeleteEClass == null) {
			githubwfRootOnOneOf2DeleteEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(224);
		}
		return githubwfRootOnOneOf2DeleteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Delete_Delete() {
        return (EReference)getGithubwfRootOnOneOf2Delete().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Deployment() {
		if (githubwfRootOnOneOf2DeploymentEClass == null) {
			githubwfRootOnOneOf2DeploymentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(225);
		}
		return githubwfRootOnOneOf2DeploymentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Deployment_Deployment() {
        return (EReference)getGithubwfRootOnOneOf2Deployment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Deployment_status() {
		if (githubwfRootOnOneOf2Deployment_statusEClass == null) {
			githubwfRootOnOneOf2Deployment_statusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(226);
		}
		return githubwfRootOnOneOf2Deployment_statusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Deployment_status_Deployment_status() {
        return (EReference)getGithubwfRootOnOneOf2Deployment_status().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Discussion() {
		if (githubwfRootOnOneOf2DiscussionEClass == null) {
			githubwfRootOnOneOf2DiscussionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(227);
		}
		return githubwfRootOnOneOf2DiscussionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Discussion_Discussion() {
        return (EReference)getGithubwfRootOnOneOf2Discussion().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2DiscussionTypes() {
		if (githubwfRootOnOneOf2DiscussionTypesEClass == null) {
			githubwfRootOnOneOf2DiscussionTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(228);
		}
		return githubwfRootOnOneOf2DiscussionTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2DiscussionTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2DiscussionTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2DiscussionTypesItems() {
		if (githubwfRootOnOneOf2DiscussionTypesItemsEClass == null) {
			githubwfRootOnOneOf2DiscussionTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(229);
		}
		return githubwfRootOnOneOf2DiscussionTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2DiscussionTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2DiscussionTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Discussion_comment() {
		if (githubwfRootOnOneOf2Discussion_commentEClass == null) {
			githubwfRootOnOneOf2Discussion_commentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(230);
		}
		return githubwfRootOnOneOf2Discussion_commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Discussion_comment_Discussion_comment() {
        return (EReference)getGithubwfRootOnOneOf2Discussion_comment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Discussion_commentTypes() {
		if (githubwfRootOnOneOf2Discussion_commentTypesEClass == null) {
			githubwfRootOnOneOf2Discussion_commentTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(231);
		}
		return githubwfRootOnOneOf2Discussion_commentTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Discussion_commentTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2Discussion_commentTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Discussion_commentTypesItems() {
		if (githubwfRootOnOneOf2Discussion_commentTypesItemsEClass == null) {
			githubwfRootOnOneOf2Discussion_commentTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(232);
		}
		return githubwfRootOnOneOf2Discussion_commentTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Discussion_commentTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Discussion_commentTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Fork() {
		if (githubwfRootOnOneOf2ForkEClass == null) {
			githubwfRootOnOneOf2ForkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(233);
		}
		return githubwfRootOnOneOf2ForkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Fork_Fork() {
        return (EReference)getGithubwfRootOnOneOf2Fork().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Gollum() {
		if (githubwfRootOnOneOf2GollumEClass == null) {
			githubwfRootOnOneOf2GollumEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(234);
		}
		return githubwfRootOnOneOf2GollumEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Gollum_Gollum() {
        return (EReference)getGithubwfRootOnOneOf2Gollum().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Issue_comment() {
		if (githubwfRootOnOneOf2Issue_commentEClass == null) {
			githubwfRootOnOneOf2Issue_commentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(235);
		}
		return githubwfRootOnOneOf2Issue_commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Issue_comment_Issue_comment() {
        return (EReference)getGithubwfRootOnOneOf2Issue_comment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Issue_commentTypes() {
		if (githubwfRootOnOneOf2Issue_commentTypesEClass == null) {
			githubwfRootOnOneOf2Issue_commentTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(236);
		}
		return githubwfRootOnOneOf2Issue_commentTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Issue_commentTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2Issue_commentTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Issue_commentTypesItems() {
		if (githubwfRootOnOneOf2Issue_commentTypesItemsEClass == null) {
			githubwfRootOnOneOf2Issue_commentTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(237);
		}
		return githubwfRootOnOneOf2Issue_commentTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Issue_commentTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Issue_commentTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Issues() {
		if (githubwfRootOnOneOf2IssuesEClass == null) {
			githubwfRootOnOneOf2IssuesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(238);
		}
		return githubwfRootOnOneOf2IssuesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Issues_Issues() {
        return (EReference)getGithubwfRootOnOneOf2Issues().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2IssuesTypes() {
		if (githubwfRootOnOneOf2IssuesTypesEClass == null) {
			githubwfRootOnOneOf2IssuesTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(239);
		}
		return githubwfRootOnOneOf2IssuesTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2IssuesTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2IssuesTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2IssuesTypesItems() {
		if (githubwfRootOnOneOf2IssuesTypesItemsEClass == null) {
			githubwfRootOnOneOf2IssuesTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(240);
		}
		return githubwfRootOnOneOf2IssuesTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2IssuesTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2IssuesTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Label() {
		if (githubwfRootOnOneOf2LabelEClass == null) {
			githubwfRootOnOneOf2LabelEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(241);
		}
		return githubwfRootOnOneOf2LabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Label_Label() {
        return (EReference)getGithubwfRootOnOneOf2Label().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2LabelTypes() {
		if (githubwfRootOnOneOf2LabelTypesEClass == null) {
			githubwfRootOnOneOf2LabelTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(242);
		}
		return githubwfRootOnOneOf2LabelTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2LabelTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2LabelTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2LabelTypesItems() {
		if (githubwfRootOnOneOf2LabelTypesItemsEClass == null) {
			githubwfRootOnOneOf2LabelTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(243);
		}
		return githubwfRootOnOneOf2LabelTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2LabelTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2LabelTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Member() {
		if (githubwfRootOnOneOf2MemberEClass == null) {
			githubwfRootOnOneOf2MemberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(244);
		}
		return githubwfRootOnOneOf2MemberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Member_Member() {
        return (EReference)getGithubwfRootOnOneOf2Member().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2MemberTypes() {
		if (githubwfRootOnOneOf2MemberTypesEClass == null) {
			githubwfRootOnOneOf2MemberTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(245);
		}
		return githubwfRootOnOneOf2MemberTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2MemberTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2MemberTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2MemberTypesItems() {
		if (githubwfRootOnOneOf2MemberTypesItemsEClass == null) {
			githubwfRootOnOneOf2MemberTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(246);
		}
		return githubwfRootOnOneOf2MemberTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2MemberTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2MemberTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Merge_group() {
		if (githubwfRootOnOneOf2Merge_groupEClass == null) {
			githubwfRootOnOneOf2Merge_groupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(247);
		}
		return githubwfRootOnOneOf2Merge_groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Merge_group_Merge_group() {
        return (EReference)getGithubwfRootOnOneOf2Merge_group().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Merge_groupTypes() {
		if (githubwfRootOnOneOf2Merge_groupTypesEClass == null) {
			githubwfRootOnOneOf2Merge_groupTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(248);
		}
		return githubwfRootOnOneOf2Merge_groupTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Merge_groupTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2Merge_groupTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Merge_groupTypesItems() {
		if (githubwfRootOnOneOf2Merge_groupTypesItemsEClass == null) {
			githubwfRootOnOneOf2Merge_groupTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(249);
		}
		return githubwfRootOnOneOf2Merge_groupTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Merge_groupTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Merge_groupTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Milestone() {
		if (githubwfRootOnOneOf2MilestoneEClass == null) {
			githubwfRootOnOneOf2MilestoneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(250);
		}
		return githubwfRootOnOneOf2MilestoneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Milestone_Milestone() {
        return (EReference)getGithubwfRootOnOneOf2Milestone().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2MilestoneTypes() {
		if (githubwfRootOnOneOf2MilestoneTypesEClass == null) {
			githubwfRootOnOneOf2MilestoneTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(251);
		}
		return githubwfRootOnOneOf2MilestoneTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2MilestoneTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2MilestoneTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2MilestoneTypesItems() {
		if (githubwfRootOnOneOf2MilestoneTypesItemsEClass == null) {
			githubwfRootOnOneOf2MilestoneTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(252);
		}
		return githubwfRootOnOneOf2MilestoneTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2MilestoneTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2MilestoneTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Page_build() {
		if (githubwfRootOnOneOf2Page_buildEClass == null) {
			githubwfRootOnOneOf2Page_buildEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(253);
		}
		return githubwfRootOnOneOf2Page_buildEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Page_build_Page_build() {
        return (EReference)getGithubwfRootOnOneOf2Page_build().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Project() {
		if (githubwfRootOnOneOf2ProjectEClass == null) {
			githubwfRootOnOneOf2ProjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(254);
		}
		return githubwfRootOnOneOf2ProjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Project_Project() {
        return (EReference)getGithubwfRootOnOneOf2Project().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ProjectTypes() {
		if (githubwfRootOnOneOf2ProjectTypesEClass == null) {
			githubwfRootOnOneOf2ProjectTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(255);
		}
		return githubwfRootOnOneOf2ProjectTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2ProjectTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2ProjectTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ProjectTypesItems() {
		if (githubwfRootOnOneOf2ProjectTypesItemsEClass == null) {
			githubwfRootOnOneOf2ProjectTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(256);
		}
		return githubwfRootOnOneOf2ProjectTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2ProjectTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2ProjectTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Project_card() {
		if (githubwfRootOnOneOf2Project_cardEClass == null) {
			githubwfRootOnOneOf2Project_cardEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(257);
		}
		return githubwfRootOnOneOf2Project_cardEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Project_card_Project_card() {
        return (EReference)getGithubwfRootOnOneOf2Project_card().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Project_cardTypes() {
		if (githubwfRootOnOneOf2Project_cardTypesEClass == null) {
			githubwfRootOnOneOf2Project_cardTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(258);
		}
		return githubwfRootOnOneOf2Project_cardTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Project_cardTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2Project_cardTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Project_cardTypesItems() {
		if (githubwfRootOnOneOf2Project_cardTypesItemsEClass == null) {
			githubwfRootOnOneOf2Project_cardTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(259);
		}
		return githubwfRootOnOneOf2Project_cardTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Project_cardTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Project_cardTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Project_column() {
		if (githubwfRootOnOneOf2Project_columnEClass == null) {
			githubwfRootOnOneOf2Project_columnEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(260);
		}
		return githubwfRootOnOneOf2Project_columnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Project_column_Project_column() {
        return (EReference)getGithubwfRootOnOneOf2Project_column().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Project_columnTypes() {
		if (githubwfRootOnOneOf2Project_columnTypesEClass == null) {
			githubwfRootOnOneOf2Project_columnTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(261);
		}
		return githubwfRootOnOneOf2Project_columnTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Project_columnTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2Project_columnTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Project_columnTypesItems() {
		if (githubwfRootOnOneOf2Project_columnTypesItemsEClass == null) {
			githubwfRootOnOneOf2Project_columnTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(262);
		}
		return githubwfRootOnOneOf2Project_columnTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Project_columnTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Project_columnTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Public() {
		if (githubwfRootOnOneOf2PublicEClass == null) {
			githubwfRootOnOneOf2PublicEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(263);
		}
		return githubwfRootOnOneOf2PublicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Public_Public_() {
        return (EReference)getGithubwfRootOnOneOf2Public().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request() {
		if (githubwfRootOnOneOf2Pull_requestEClass == null) {
			githubwfRootOnOneOf2Pull_requestEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(264);
		}
		return githubwfRootOnOneOf2Pull_requestEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_Pull_request() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_requestTypes() {
		if (githubwfRootOnOneOf2Pull_requestTypesEClass == null) {
			githubwfRootOnOneOf2Pull_requestTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(265);
		}
		return githubwfRootOnOneOf2Pull_requestTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_requestTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2Pull_requestTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_requestTypesItems() {
		if (githubwfRootOnOneOf2Pull_requestTypesItemsEClass == null) {
			githubwfRootOnOneOf2Pull_requestTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(266);
		}
		return githubwfRootOnOneOf2Pull_requestTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_requestTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Pull_requestTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_requestPatternProperties0() {
		if (githubwfRootOnOneOf2Pull_requestPatternProperties0EClass == null) {
			githubwfRootOnOneOf2Pull_requestPatternProperties0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(267);
		}
		return githubwfRootOnOneOf2Pull_requestPatternProperties0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Pull_requestPatternProperties0_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Pull_requestPatternProperties0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_requestPatternProperties0_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Pull_requestPatternProperties0().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Pull_requestPatternProperties0__Find__String() {
        return getGithubwfRootOnOneOf2Pull_requestPatternProperties0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Pull_requestPatternProperties0__Find() {
        return getGithubwfRootOnOneOf2Pull_requestPatternProperties0().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Pull_requestPatternProperties0__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Pull_requestPatternProperties0().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Pull_requestPatternProperties0__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Pull_requestPatternProperties0().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_review() {
		if (githubwfRootOnOneOf2Pull_request_reviewEClass == null) {
			githubwfRootOnOneOf2Pull_request_reviewEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(268);
		}
		return githubwfRootOnOneOf2Pull_request_reviewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_review_Pull_request_review() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_review().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_reviewTypes() {
		if (githubwfRootOnOneOf2Pull_request_reviewTypesEClass == null) {
			githubwfRootOnOneOf2Pull_request_reviewTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(269);
		}
		return githubwfRootOnOneOf2Pull_request_reviewTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_reviewTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_reviewTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_reviewTypesItems() {
		if (githubwfRootOnOneOf2Pull_request_reviewTypesItemsEClass == null) {
			githubwfRootOnOneOf2Pull_request_reviewTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(270);
		}
		return githubwfRootOnOneOf2Pull_request_reviewTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_reviewTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_reviewTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_review_comment() {
		if (githubwfRootOnOneOf2Pull_request_review_commentEClass == null) {
			githubwfRootOnOneOf2Pull_request_review_commentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(271);
		}
		return githubwfRootOnOneOf2Pull_request_review_commentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_review_comment_Pull_request_review_comment() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_review_comment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_review_commentTypes() {
		if (githubwfRootOnOneOf2Pull_request_review_commentTypesEClass == null) {
			githubwfRootOnOneOf2Pull_request_review_commentTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(272);
		}
		return githubwfRootOnOneOf2Pull_request_review_commentTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_review_commentTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_review_commentTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_review_commentTypesItems() {
		if (githubwfRootOnOneOf2Pull_request_review_commentTypesItemsEClass == null) {
			githubwfRootOnOneOf2Pull_request_review_commentTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(273);
		}
		return githubwfRootOnOneOf2Pull_request_review_commentTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_review_commentTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_review_commentTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_target() {
		if (githubwfRootOnOneOf2Pull_request_targetEClass == null) {
			githubwfRootOnOneOf2Pull_request_targetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(274);
		}
		return githubwfRootOnOneOf2Pull_request_targetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_target_Pull_request_target() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_target().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_targetTypes() {
		if (githubwfRootOnOneOf2Pull_request_targetTypesEClass == null) {
			githubwfRootOnOneOf2Pull_request_targetTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(275);
		}
		return githubwfRootOnOneOf2Pull_request_targetTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_targetTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_targetTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_targetTypesItems() {
		if (githubwfRootOnOneOf2Pull_request_targetTypesItemsEClass == null) {
			githubwfRootOnOneOf2Pull_request_targetTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(276);
		}
		return githubwfRootOnOneOf2Pull_request_targetTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_targetTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_targetTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0() {
		if (githubwfRootOnOneOf2Pull_request_targetPatternProperties0EClass == null) {
			githubwfRootOnOneOf2Pull_request_targetPatternProperties0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(277);
		}
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0__Find__String() {
        return getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0__Find() {
        return getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Push() {
		if (githubwfRootOnOneOf2PushEClass == null) {
			githubwfRootOnOneOf2PushEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(278);
		}
		return githubwfRootOnOneOf2PushEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Push_Push() {
        return (EReference)getGithubwfRootOnOneOf2Push().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2PushPatternProperties0() {
		if (githubwfRootOnOneOf2PushPatternProperties0EClass == null) {
			githubwfRootOnOneOf2PushPatternProperties0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(279);
		}
		return githubwfRootOnOneOf2PushPatternProperties0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2PushPatternProperties0_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2PushPatternProperties0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2PushPatternProperties0_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2PushPatternProperties0().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2PushPatternProperties0__Find__String() {
        return getGithubwfRootOnOneOf2PushPatternProperties0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2PushPatternProperties0__Find() {
        return getGithubwfRootOnOneOf2PushPatternProperties0().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2PushPatternProperties0__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2PushPatternProperties0().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2PushPatternProperties0__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2PushPatternProperties0().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2PushPatternProperties0Items() {
		if (githubwfRootOnOneOf2PushPatternProperties0ItemsEClass == null) {
			githubwfRootOnOneOf2PushPatternProperties0ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(280);
		}
		return githubwfRootOnOneOf2PushPatternProperties0ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2PushPatternProperties0Items_Items() {
        return (EAttribute)getGithubwfRootOnOneOf2PushPatternProperties0Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Registry_package() {
		if (githubwfRootOnOneOf2Registry_packageEClass == null) {
			githubwfRootOnOneOf2Registry_packageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(281);
		}
		return githubwfRootOnOneOf2Registry_packageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Registry_package_Registry_package() {
        return (EReference)getGithubwfRootOnOneOf2Registry_package().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Registry_packageTypes() {
		if (githubwfRootOnOneOf2Registry_packageTypesEClass == null) {
			githubwfRootOnOneOf2Registry_packageTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(282);
		}
		return githubwfRootOnOneOf2Registry_packageTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Registry_packageTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2Registry_packageTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Registry_packageTypesItems() {
		if (githubwfRootOnOneOf2Registry_packageTypesItemsEClass == null) {
			githubwfRootOnOneOf2Registry_packageTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(283);
		}
		return githubwfRootOnOneOf2Registry_packageTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Registry_packageTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Registry_packageTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Release() {
		if (githubwfRootOnOneOf2ReleaseEClass == null) {
			githubwfRootOnOneOf2ReleaseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(284);
		}
		return githubwfRootOnOneOf2ReleaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Release_Release() {
        return (EReference)getGithubwfRootOnOneOf2Release().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ReleaseTypes() {
		if (githubwfRootOnOneOf2ReleaseTypesEClass == null) {
			githubwfRootOnOneOf2ReleaseTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(285);
		}
		return githubwfRootOnOneOf2ReleaseTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2ReleaseTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2ReleaseTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ReleaseTypesItems() {
		if (githubwfRootOnOneOf2ReleaseTypesItemsEClass == null) {
			githubwfRootOnOneOf2ReleaseTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(286);
		}
		return githubwfRootOnOneOf2ReleaseTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2ReleaseTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2ReleaseTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Status() {
		if (githubwfRootOnOneOf2StatusEClass == null) {
			githubwfRootOnOneOf2StatusEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(287);
		}
		return githubwfRootOnOneOf2StatusEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Status_Status() {
        return (EReference)getGithubwfRootOnOneOf2Status().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Watch() {
		if (githubwfRootOnOneOf2WatchEClass == null) {
			githubwfRootOnOneOf2WatchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(288);
		}
		return githubwfRootOnOneOf2WatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Watch_Watch() {
        return (EReference)getGithubwfRootOnOneOf2Watch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_call() {
		if (githubwfRootOnOneOf2Workflow_callEClass == null) {
			githubwfRootOnOneOf2Workflow_callEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(289);
		}
		return githubwfRootOnOneOf2Workflow_callEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_call_Workflow_call() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_call().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callInputs() {
		if (githubwfRootOnOneOf2Workflow_callInputsEClass == null) {
			githubwfRootOnOneOf2Workflow_callInputsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(290);
		}
		return githubwfRootOnOneOf2Workflow_callInputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callInputs_Inputs() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callInputs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callInputs__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_callInputs().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0() {
		if (githubwfRootOnOneOf2Workflow_callInputsPatternProperties0EClass == null) {
			githubwfRootOnOneOf2Workflow_callInputsPatternProperties0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(291);
		}
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0_Description() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0_DeprecationMessage() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0_Required() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0_Type() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0_Default_() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0__Find__String() {
        return getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0__Find() {
        return getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Description() {
		if (githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DescriptionEClass == null) {
			githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(292);
		}
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Description_Description() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Description().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage() {
		if (githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessageEClass == null) {
			githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(293);
		}
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage_DeprecationMessage() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DeprecationMessage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required() {
		if (githubwfRootOnOneOf2Workflow_callInputsPatternProperties0RequiredEClass == null) {
			githubwfRootOnOneOf2Workflow_callInputsPatternProperties0RequiredEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(294);
		}
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0RequiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required_Required() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Required().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type() {
		if (githubwfRootOnOneOf2Workflow_callInputsPatternProperties0TypeEClass == null) {
			githubwfRootOnOneOf2Workflow_callInputsPatternProperties0TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(295);
		}
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type_Type() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default() {
		if (githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultEClass == null) {
			githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(296);
		}
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default_Default_() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Default().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecrets() {
		if (githubwfRootOnOneOf2Workflow_callSecretsEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(297);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecrets_Secrets() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecrets().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0EClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(298);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0__Find__String() {
        return getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0__Find() {
        return getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Description() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0DescriptionEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0DescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(299);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0DescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Description_Description() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Description().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(300);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required_Required() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Required().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatch() {
		if (githubwfRootOnOneOf2Workflow_dispatchEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(301);
		}
		return githubwfRootOnOneOf2Workflow_dispatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatch_Workflow_dispatch() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputs() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(302);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputs_Inputs() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputs__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputs().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0EClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(303);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0_Description() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0_DeprecationMessage() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0_Required() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0_Default_() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0_Type() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0_Options() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0__Find__String() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0__Find() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Description() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DescriptionEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DescriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(304);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Description_Description() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Description().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessage() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessageEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(305);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessage_DeprecationMessage() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DeprecationMessage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Required() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0RequiredEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0RequiredEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(306);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0RequiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Required_Required() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Required().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(307);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default_Default_() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Default().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0TypeEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0TypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(308);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type_Type() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(309);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options_Options() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Options().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItems() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(310);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItems_Items() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0OptionsItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0EClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(311);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(312);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0If().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(313);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType_Type() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(314);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Then().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(315);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault_Default_() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenDefault().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(316);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Else().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(317);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault_Default_() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseDefault().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1EClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(318);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(319);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1If().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(320);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType_Type() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(321);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Then().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_run() {
		if (githubwfRootOnOneOf2Workflow_runEClass == null) {
			githubwfRootOnOneOf2Workflow_runEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(322);
		}
		return githubwfRootOnOneOf2Workflow_runEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_run_Workflow_run() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_run().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runTypes() {
		if (githubwfRootOnOneOf2Workflow_runTypesEClass == null) {
			githubwfRootOnOneOf2Workflow_runTypesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(323);
		}
		return githubwfRootOnOneOf2Workflow_runTypesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_runTypes_Types() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_runTypes().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runTypesItems() {
		if (githubwfRootOnOneOf2Workflow_runTypesItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_runTypesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(324);
		}
		return githubwfRootOnOneOf2Workflow_runTypesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_runTypesItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_runTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runWorkflows() {
		if (githubwfRootOnOneOf2Workflow_runWorkflowsEClass == null) {
			githubwfRootOnOneOf2Workflow_runWorkflowsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(325);
		}
		return githubwfRootOnOneOf2Workflow_runWorkflowsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_runWorkflows_Workflows() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_runWorkflows().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runWorkflowsItems() {
		if (githubwfRootOnOneOf2Workflow_runWorkflowsItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_runWorkflowsItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(326);
		}
		return githubwfRootOnOneOf2Workflow_runWorkflowsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_runWorkflowsItems_Items() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_runWorkflowsItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runPatternProperties0() {
		if (githubwfRootOnOneOf2Workflow_runPatternProperties0EClass == null) {
			githubwfRootOnOneOf2Workflow_runPatternProperties0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(327);
		}
		return githubwfRootOnOneOf2Workflow_runPatternProperties0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_runPatternProperties0_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_runPatternProperties0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_runPatternProperties0_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_runPatternProperties0().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_runPatternProperties0__Find__String() {
        return getGithubwfRootOnOneOf2Workflow_runPatternProperties0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_runPatternProperties0__Find() {
        return getGithubwfRootOnOneOf2Workflow_runPatternProperties0().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_runPatternProperties0__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_runPatternProperties0().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_runPatternProperties0__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_runPatternProperties0().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Repository_dispatch() {
		if (githubwfRootOnOneOf2Repository_dispatchEClass == null) {
			githubwfRootOnOneOf2Repository_dispatchEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(328);
		}
		return githubwfRootOnOneOf2Repository_dispatchEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Repository_dispatch_Repository_dispatch() {
        return (EReference)getGithubwfRootOnOneOf2Repository_dispatch().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Schedule() {
		if (githubwfRootOnOneOf2ScheduleEClass == null) {
			githubwfRootOnOneOf2ScheduleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(329);
		}
		return githubwfRootOnOneOf2ScheduleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Schedule_Schedule() {
        return (EReference)getGithubwfRootOnOneOf2Schedule().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ScheduleItems() {
		if (githubwfRootOnOneOf2ScheduleItemsEClass == null) {
			githubwfRootOnOneOf2ScheduleItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(330);
		}
		return githubwfRootOnOneOf2ScheduleItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2ScheduleItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2ScheduleItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ScheduleItemsCron() {
		if (githubwfRootOnOneOf2ScheduleItemsCronEClass == null) {
			githubwfRootOnOneOf2ScheduleItemsCronEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(331);
		}
		return githubwfRootOnOneOf2ScheduleItemsCronEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2ScheduleItemsCron_Cron() {
        return (EAttribute)getGithubwfRootOnOneOf2ScheduleItemsCron().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2ScheduleItemsCron__RegexMatch() {
        return getGithubwfRootOnOneOf2ScheduleItemsCron().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootEnv() {
		if (githubwfRootEnvEClass == null) {
			githubwfRootEnvEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(332);
		}
		return githubwfRootEnvEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootEnv_Env() {
        return (EReference)getGithubwfRootEnv().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootDefaults() {
		if (githubwfRootDefaultsEClass == null) {
			githubwfRootDefaultsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(333);
		}
		return githubwfRootDefaultsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootDefaults_Defaults() {
        return (EReference)getGithubwfRootDefaults().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootConcurrency() {
		if (githubwfRootConcurrencyEClass == null) {
			githubwfRootConcurrencyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(334);
		}
		return githubwfRootConcurrencyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootConcurrency_Concurrency() {
        return (EReference)getGithubwfRootConcurrency().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootConcurrencyOneOf0() {
		if (githubwfRootConcurrencyOneOf0EClass == null) {
			githubwfRootConcurrencyOneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(335);
		}
		return githubwfRootConcurrencyOneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootConcurrencyOneOf0_Concurrency() {
        return (EAttribute)getGithubwfRootConcurrencyOneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootConcurrencyOneOf1() {
		if (githubwfRootConcurrencyOneOf1EClass == null) {
			githubwfRootConcurrencyOneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(336);
		}
		return githubwfRootConcurrencyOneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootConcurrencyOneOf1_Concurrency() {
        return (EReference)getGithubwfRootConcurrencyOneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobs() {
		if (githubwfRootJobsEClass == null) {
			githubwfRootJobsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(337);
		}
		return githubwfRootJobsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootJobs_Jobs() {
        return (EReference)getGithubwfRootJobs().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootJobs__Get__String() {
        return getGithubwfRootJobs().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPatternProperties0() {
		if (githubwfRootJobsPatternProperties0EClass == null) {
			githubwfRootJobsPatternProperties0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(338);
		}
		return githubwfRootJobsPatternProperties0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootJobsPatternProperties0_Key() {
        return (EAttribute)getGithubwfRootJobsPatternProperties0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootJobsPatternProperties0_PatternProperties0() {
        return (EReference)getGithubwfRootJobsPatternProperties0().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootJobsPatternProperties0__Find__String() {
        return getGithubwfRootJobsPatternProperties0().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootJobsPatternProperties0__Find() {
        return getGithubwfRootJobsPatternProperties0().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootJobsPatternProperties0__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootJobsPatternProperties0().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootJobsPatternProperties0__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootJobsPatternProperties0().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPatternProperties0OneOf0() {
		if (githubwfRootJobsPatternProperties0OneOf0EClass == null) {
			githubwfRootJobsPatternProperties0OneOf0EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(339);
		}
		return githubwfRootJobsPatternProperties0OneOf0EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootJobsPatternProperties0OneOf0_PatternProperties0() {
        return (EReference)getGithubwfRootJobsPatternProperties0OneOf0().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPatternProperties0OneOf1() {
		if (githubwfRootJobsPatternProperties0OneOf1EClass == null) {
			githubwfRootJobsPatternProperties0OneOf1EClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(340);
		}
		return githubwfRootJobsPatternProperties0OneOf1EClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootJobsPatternProperties0OneOf1_PatternProperties0() {
        return (EReference)getGithubwfRootJobsPatternProperties0OneOf1().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootRun_45name() {
		if (githubwfRootRun_45nameEClass == null) {
			githubwfRootRun_45nameEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(341);
		}
		return githubwfRootRun_45nameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootRun_45name_Run_45name() {
        return (EAttribute)getGithubwfRootRun_45name().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootPermissions() {
		if (githubwfRootPermissionsEClass == null) {
			githubwfRootPermissionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(342);
		}
		return githubwfRootPermissionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootPermissions_Permissions() {
        return (EReference)getGithubwfRootPermissions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf0Tuple() {
		if (normalJobRuns_45onOneOf1AnyOf0TupleEClass == null) {
			normalJobRuns_45onOneOf1AnyOf0TupleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(343);
		}
		return normalJobRuns_45onOneOf1AnyOf0TupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf0Tuple_Items0() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf0Tuple().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf0Tuple_AdditionalItems() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf0Tuple().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf0Tuple__GetItemsNumber() {
        return getNormalJobRuns_45onOneOf1AnyOf0Tuple().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1Tuple() {
		if (normalJobRuns_45onOneOf1AnyOf1TupleEClass == null) {
			normalJobRuns_45onOneOf1AnyOf1TupleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(344);
		}
		return normalJobRuns_45onOneOf1AnyOf1TupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf1Tuple_Items0() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf1Tuple().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf1Tuple_Items1() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf1Tuple().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf1Tuple_AdditionalItems() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf1Tuple().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf1Tuple__GetItemsNumber() {
        return getNormalJobRuns_45onOneOf1AnyOf1Tuple().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2Tuple() {
		if (normalJobRuns_45onOneOf1AnyOf2TupleEClass == null) {
			normalJobRuns_45onOneOf1AnyOf2TupleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(345);
		}
		return normalJobRuns_45onOneOf1AnyOf2TupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf2Tuple_Items0() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf2Tuple().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf2Tuple_Items1() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf2Tuple().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf2Tuple_AdditionalItems() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf2Tuple().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf2Tuple__GetItemsNumber() {
        return getNormalJobRuns_45onOneOf1AnyOf2Tuple().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3Tuple() {
		if (normalJobRuns_45onOneOf1AnyOf3TupleEClass == null) {
			normalJobRuns_45onOneOf1AnyOf3TupleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(346);
		}
		return normalJobRuns_45onOneOf1AnyOf3TupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf3Tuple_Items0() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf3Tuple().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf3Tuple_Items1() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf3Tuple().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf3Tuple_Items2() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf3Tuple().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf3Tuple_AdditionalItems() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf3Tuple().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf3Tuple__GetItemsNumber() {
        return getNormalJobRuns_45onOneOf1AnyOf3Tuple().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4Tuple() {
		if (normalJobRuns_45onOneOf1AnyOf4TupleEClass == null) {
			normalJobRuns_45onOneOf1AnyOf4TupleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(347);
		}
		return normalJobRuns_45onOneOf1AnyOf4TupleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf4Tuple_Items0() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf4Tuple().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf4Tuple_Items1() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf4Tuple().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf4Tuple_Items2() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf4Tuple().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf4Tuple_AdditionalItems() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf4Tuple().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf4Tuple__GetItemsNumber() {
        return getNormalJobRuns_45onOneOf1AnyOf4Tuple().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectPropertiesAbstract() {
		if (eventObjectPropertiesAbstractEClass == null) {
			eventObjectPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(348);
		}
		return eventObjectPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootPropertiesAbstract() {
		if (githubwfRootPropertiesAbstractEClass == null) {
			githubwfRootPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(349);
		}
		return githubwfRootPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyPropertiesAbstract() {
		if (concurrencyPropertiesAbstractEClass == null) {
			concurrencyPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(350);
		}
		return concurrencyPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyCancel_45in_45progressAbstract() {
		if (concurrencyCancel_45in_45progressAbstractEClass == null) {
			concurrencyCancel_45in_45progressAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(351);
		}
		return concurrencyCancel_45in_45progressAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyCancel_45in_45progressTypeString() {
		if (concurrencyCancel_45in_45progressTypeStringEClass == null) {
			concurrencyCancel_45in_45progressTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(352);
		}
		return concurrencyCancel_45in_45progressTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcurrencyCancel_45in_45progressTypeString_Cancel_45in_45progress() {
        return (EAttribute)getConcurrencyCancel_45in_45progressTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyCancel_45in_45progressTypeInteger() {
		if (concurrencyCancel_45in_45progressTypeIntegerEClass == null) {
			concurrencyCancel_45in_45progressTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(353);
		}
		return concurrencyCancel_45in_45progressTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcurrencyCancel_45in_45progressTypeInteger_Cancel_45in_45progress() {
        return (EAttribute)getConcurrencyCancel_45in_45progressTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyCancel_45in_45progressTypeNumber() {
		if (concurrencyCancel_45in_45progressTypeNumberEClass == null) {
			concurrencyCancel_45in_45progressTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(354);
		}
		return concurrencyCancel_45in_45progressTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcurrencyCancel_45in_45progressTypeNumber_Cancel_45in_45progress() {
        return (EAttribute)getConcurrencyCancel_45in_45progressTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyCancel_45in_45progressTypeBoolean() {
		if (concurrencyCancel_45in_45progressTypeBooleanEClass == null) {
			concurrencyCancel_45in_45progressTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(355);
		}
		return concurrencyCancel_45in_45progressTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcurrencyCancel_45in_45progressTypeBoolean_Cancel_45in_45progress() {
        return (EAttribute)getConcurrencyCancel_45in_45progressTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyCancel_45in_45progressTypeObject() {
		if (concurrencyCancel_45in_45progressTypeObjectEClass == null) {
			concurrencyCancel_45in_45progressTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(356);
		}
		return concurrencyCancel_45in_45progressTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcurrencyCancel_45in_45progressTypeObject_Cancel_45in_45progress() {
        return (EReference)getConcurrencyCancel_45in_45progressTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConcurrencyCancel_45in_45progressTypeObject__Get__String() {
        return getConcurrencyCancel_45in_45progressTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyCancel_45in_45progressPropertiesAbstract() {
		if (concurrencyCancel_45in_45progressPropertiesAbstractEClass == null) {
			concurrencyCancel_45in_45progressPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(357);
		}
		return concurrencyCancel_45in_45progressPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyCancel_45in_45progressAdditionalProperties() {
		if (concurrencyCancel_45in_45progressAdditionalPropertiesEClass == null) {
			concurrencyCancel_45in_45progressAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(358);
		}
		return concurrencyCancel_45in_45progressAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConcurrencyCancel_45in_45progressAdditionalProperties_Key() {
        return (EAttribute)getConcurrencyCancel_45in_45progressAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcurrencyCancel_45in_45progressAdditionalProperties_AdditionalProperties() {
        return (EReference)getConcurrencyCancel_45in_45progressAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConcurrencyCancel_45in_45progressAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getConcurrencyCancel_45in_45progressAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConcurrencyCancel_45in_45progressAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getConcurrencyCancel_45in_45progressAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyCancel_45in_45progressTypeArray() {
		if (concurrencyCancel_45in_45progressTypeArrayEClass == null) {
			concurrencyCancel_45in_45progressTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(359);
		}
		return concurrencyCancel_45in_45progressTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcurrencyCancel_45in_45progressTypeArray_Cancel_45in_45progress() {
        return (EReference)getConcurrencyCancel_45in_45progressTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyCancel_45in_45progressItems() {
		if (concurrencyCancel_45in_45progressItemsEClass == null) {
			concurrencyCancel_45in_45progressItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(360);
		}
		return concurrencyCancel_45in_45progressItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcurrencyCancel_45in_45progressItems_Items() {
        return (EReference)getConcurrencyCancel_45in_45progressItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConcurrencyCancel_45in_45progressTypeNull() {
		if (concurrencyCancel_45in_45progressTypeNullEClass == null) {
			concurrencyCancel_45in_45progressTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(361);
		}
		return concurrencyCancel_45in_45progressTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConcurrencyCancel_45in_45progressTypeNull_Cancel_45in_45progress() {
        return (EReference)getConcurrencyCancel_45in_45progressTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationAbstract() {
		if (configurationAbstractEClass == null) {
			configurationAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(362);
		}
		return configurationAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationTypeString() {
		if (configurationTypeStringEClass == null) {
			configurationTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(363);
		}
		return configurationTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationTypeString_Configuration() {
        return (EAttribute)getConfigurationTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationTypeInteger() {
		if (configurationTypeIntegerEClass == null) {
			configurationTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(364);
		}
		return configurationTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationTypeInteger_Configuration() {
        return (EAttribute)getConfigurationTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationTypeNumber() {
		if (configurationTypeNumberEClass == null) {
			configurationTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(365);
		}
		return configurationTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationTypeNumber_Configuration() {
        return (EAttribute)getConfigurationTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationTypeBoolean() {
		if (configurationTypeBooleanEClass == null) {
			configurationTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(366);
		}
		return configurationTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationTypeBoolean_Configuration() {
        return (EAttribute)getConfigurationTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationTypeObject() {
		if (configurationTypeObjectEClass == null) {
			configurationTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(367);
		}
		return configurationTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationTypeObject_Configuration() {
        return (EReference)getConfigurationTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfigurationTypeObject__Get__String() {
        return getConfigurationTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationPropertiesAbstract() {
		if (configurationPropertiesAbstractEClass == null) {
			configurationPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(368);
		}
		return configurationPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationAdditionalProperties() {
		if (configurationAdditionalPropertiesEClass == null) {
			configurationAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(369);
		}
		return configurationAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getConfigurationAdditionalProperties_Key() {
        return (EAttribute)getConfigurationAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationAdditionalProperties_AdditionalProperties() {
        return (EReference)getConfigurationAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfigurationAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getConfigurationAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getConfigurationAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getConfigurationAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationTypeArray() {
		if (configurationTypeArrayEClass == null) {
			configurationTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(370);
		}
		return configurationTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationTypeArray_Configuration() {
        return (EReference)getConfigurationTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationItems() {
		if (configurationItemsEClass == null) {
			configurationItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(371);
		}
		return configurationItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationItems_Items() {
        return (EReference)getConfigurationItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationTypeNull() {
		if (configurationTypeNullEClass == null) {
			configurationTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(372);
		}
		return configurationTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getConfigurationTypeNull_Configuration() {
        return (EReference)getConfigurationTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getConfigurationOneOf3PropertiesAbstract() {
		if (configurationOneOf3PropertiesAbstractEClass == null) {
			configurationOneOf3PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(373);
		}
		return configurationOneOf3PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPropertiesAbstract() {
		if (containerPropertiesAbstractEClass == null) {
			containerPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(374);
		}
		return containerPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerCredentialsPropertiesAbstract() {
		if (containerCredentialsPropertiesAbstractEClass == null) {
			containerCredentialsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(375);
		}
		return containerCredentialsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerCredentialsAdditionalProperties() {
		if (containerCredentialsAdditionalPropertiesEClass == null) {
			containerCredentialsAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(376);
		}
		return containerCredentialsAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerCredentialsAdditionalProperties_Key() {
        return (EAttribute)getContainerCredentialsAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerCredentialsAdditionalProperties_AdditionalProperties() {
        return (EReference)getContainerCredentialsAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContainerCredentialsAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getContainerCredentialsAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContainerCredentialsAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getContainerCredentialsAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPortsItemsAbstract() {
		if (containerPortsItemsAbstractEClass == null) {
			containerPortsItemsAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(377);
		}
		return containerPortsItemsAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPortsItemsTypeString() {
		if (containerPortsItemsTypeStringEClass == null) {
			containerPortsItemsTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(378);
		}
		return containerPortsItemsTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerPortsItemsTypeString_Items() {
        return (EAttribute)getContainerPortsItemsTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPortsItemsTypeInteger() {
		if (containerPortsItemsTypeIntegerEClass == null) {
			containerPortsItemsTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(379);
		}
		return containerPortsItemsTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerPortsItemsTypeInteger_Items() {
        return (EAttribute)getContainerPortsItemsTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPortsItemsTypeNumber() {
		if (containerPortsItemsTypeNumberEClass == null) {
			containerPortsItemsTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(380);
		}
		return containerPortsItemsTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerPortsItemsTypeNumber_Items() {
        return (EAttribute)getContainerPortsItemsTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPortsItemsTypeBoolean() {
		if (containerPortsItemsTypeBooleanEClass == null) {
			containerPortsItemsTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(381);
		}
		return containerPortsItemsTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerPortsItemsTypeBoolean_Items() {
        return (EAttribute)getContainerPortsItemsTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPortsItemsTypeObject() {
		if (containerPortsItemsTypeObjectEClass == null) {
			containerPortsItemsTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(382);
		}
		return containerPortsItemsTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerPortsItemsTypeObject_Items() {
        return (EReference)getContainerPortsItemsTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContainerPortsItemsTypeObject__Get__String() {
        return getContainerPortsItemsTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPortsItemsPropertiesAbstract() {
		if (containerPortsItemsPropertiesAbstractEClass == null) {
			containerPortsItemsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(383);
		}
		return containerPortsItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPortsItemsAdditionalProperties() {
		if (containerPortsItemsAdditionalPropertiesEClass == null) {
			containerPortsItemsAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(384);
		}
		return containerPortsItemsAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getContainerPortsItemsAdditionalProperties_Key() {
        return (EAttribute)getContainerPortsItemsAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerPortsItemsAdditionalProperties_AdditionalProperties() {
        return (EReference)getContainerPortsItemsAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContainerPortsItemsAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getContainerPortsItemsAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getContainerPortsItemsAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getContainerPortsItemsAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPortsItemsTypeArray() {
		if (containerPortsItemsTypeArrayEClass == null) {
			containerPortsItemsTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(385);
		}
		return containerPortsItemsTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerPortsItemsTypeArray_Items() {
        return (EReference)getContainerPortsItemsTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPortsItemsItems() {
		if (containerPortsItemsItemsEClass == null) {
			containerPortsItemsItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(386);
		}
		return containerPortsItemsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerPortsItemsItems_Items() {
        return (EReference)getContainerPortsItemsItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getContainerPortsItemsTypeNull() {
		if (containerPortsItemsTypeNullEClass == null) {
			containerPortsItemsTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(387);
		}
		return containerPortsItemsTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getContainerPortsItemsTypeNull_Items() {
        return (EReference)getContainerPortsItemsTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultsPropertiesAbstract() {
		if (defaultsPropertiesAbstractEClass == null) {
			defaultsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(388);
		}
		return defaultsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getDefaultsRunPropertiesAbstract() {
		if (defaultsRunPropertiesAbstractEClass == null) {
			defaultsRunPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(389);
		}
		return defaultsRunPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissionsAbstract() {
		if (permissionsAbstractEClass == null) {
			permissionsAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(390);
		}
		return permissionsAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissionsTypeString() {
		if (permissionsTypeStringEClass == null) {
			permissionsTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(391);
		}
		return permissionsTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermissionsTypeString_Permissions() {
        return (EAttribute)getPermissionsTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissionsTypeInteger() {
		if (permissionsTypeIntegerEClass == null) {
			permissionsTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(392);
		}
		return permissionsTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermissionsTypeInteger_Permissions() {
        return (EAttribute)getPermissionsTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissionsTypeNumber() {
		if (permissionsTypeNumberEClass == null) {
			permissionsTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(393);
		}
		return permissionsTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermissionsTypeNumber_Permissions() {
        return (EAttribute)getPermissionsTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissionsTypeBoolean() {
		if (permissionsTypeBooleanEClass == null) {
			permissionsTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(394);
		}
		return permissionsTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermissionsTypeBoolean_Permissions() {
        return (EAttribute)getPermissionsTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissionsTypeObject() {
		if (permissionsTypeObjectEClass == null) {
			permissionsTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(395);
		}
		return permissionsTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissionsTypeObject_Permissions() {
        return (EReference)getPermissionsTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPermissionsTypeObject__Get__String() {
        return getPermissionsTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissionsPropertiesAbstract() {
		if (permissionsPropertiesAbstractEClass == null) {
			permissionsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(396);
		}
		return permissionsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissionsAdditionalProperties() {
		if (permissionsAdditionalPropertiesEClass == null) {
			permissionsAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(397);
		}
		return permissionsAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getPermissionsAdditionalProperties_Key() {
        return (EAttribute)getPermissionsAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissionsAdditionalProperties_AdditionalProperties() {
        return (EReference)getPermissionsAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPermissionsAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getPermissionsAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getPermissionsAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getPermissionsAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissionsTypeArray() {
		if (permissionsTypeArrayEClass == null) {
			permissionsTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(398);
		}
		return permissionsTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissionsTypeArray_Permissions() {
        return (EReference)getPermissionsTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissionsItems() {
		if (permissionsItemsEClass == null) {
			permissionsItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(399);
		}
		return permissionsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissionsItems_Items() {
        return (EReference)getPermissionsItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissionsTypeNull() {
		if (permissionsTypeNullEClass == null) {
			permissionsTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(400);
		}
		return permissionsTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getPermissionsTypeNull_Permissions() {
        return (EReference)getPermissionsTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getPermissions_45eventPropertiesAbstract() {
		if (permissions_45eventPropertiesAbstractEClass == null) {
			permissions_45eventPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(401);
		}
		return permissions_45eventPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvAbstract() {
		if (envAbstractEClass == null) {
			envAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(402);
		}
		return envAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvTypeString() {
		if (envTypeStringEClass == null) {
			envTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(403);
		}
		return envTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvTypeString_Env() {
        return (EAttribute)getEnvTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvTypeInteger() {
		if (envTypeIntegerEClass == null) {
			envTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(404);
		}
		return envTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvTypeInteger_Env() {
        return (EAttribute)getEnvTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvTypeNumber() {
		if (envTypeNumberEClass == null) {
			envTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(405);
		}
		return envTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvTypeNumber_Env() {
        return (EAttribute)getEnvTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvTypeBoolean() {
		if (envTypeBooleanEClass == null) {
			envTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(406);
		}
		return envTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvTypeBoolean_Env() {
        return (EAttribute)getEnvTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvTypeObject() {
		if (envTypeObjectEClass == null) {
			envTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(407);
		}
		return envTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvTypeObject_Env() {
        return (EReference)getEnvTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnvTypeObject__Get__String() {
        return getEnvTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvPropertiesAbstract() {
		if (envPropertiesAbstractEClass == null) {
			envPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(408);
		}
		return envPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvAdditionalProperties() {
		if (envAdditionalPropertiesEClass == null) {
			envAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(409);
		}
		return envAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvAdditionalProperties_Key() {
        return (EAttribute)getEnvAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvAdditionalProperties_AdditionalProperties() {
        return (EReference)getEnvAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnvAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getEnvAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnvAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getEnvAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvTypeArray() {
		if (envTypeArrayEClass == null) {
			envTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(410);
		}
		return envTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvTypeArray_Env() {
        return (EReference)getEnvTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvItems() {
		if (envItemsEClass == null) {
			envItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(411);
		}
		return envItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvItems_Items() {
        return (EReference)getEnvItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvTypeNull() {
		if (envTypeNullEClass == null) {
			envTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(412);
		}
		return envTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvTypeNull_Env() {
        return (EReference)getEnvTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0PropertiesAbstract() {
		if (envOneOf0PropertiesAbstractEClass == null) {
			envOneOf0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(413);
		}
		return envOneOf0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalPropertiesAbstract() {
		if (envOneOf0AdditionalPropertiesAbstractEClass == null) {
			envOneOf0AdditionalPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(414);
		}
		return envOneOf0AdditionalPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalPropertiesTypeString() {
		if (envOneOf0AdditionalPropertiesTypeStringEClass == null) {
			envOneOf0AdditionalPropertiesTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(415);
		}
		return envOneOf0AdditionalPropertiesTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvOneOf0AdditionalPropertiesTypeString_AdditionalProperties() {
        return (EAttribute)getEnvOneOf0AdditionalPropertiesTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalPropertiesTypeInteger() {
		if (envOneOf0AdditionalPropertiesTypeIntegerEClass == null) {
			envOneOf0AdditionalPropertiesTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(416);
		}
		return envOneOf0AdditionalPropertiesTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvOneOf0AdditionalPropertiesTypeInteger_AdditionalProperties() {
        return (EAttribute)getEnvOneOf0AdditionalPropertiesTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalPropertiesTypeNumber() {
		if (envOneOf0AdditionalPropertiesTypeNumberEClass == null) {
			envOneOf0AdditionalPropertiesTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(417);
		}
		return envOneOf0AdditionalPropertiesTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvOneOf0AdditionalPropertiesTypeNumber_AdditionalProperties() {
        return (EAttribute)getEnvOneOf0AdditionalPropertiesTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalPropertiesTypeBoolean() {
		if (envOneOf0AdditionalPropertiesTypeBooleanEClass == null) {
			envOneOf0AdditionalPropertiesTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(418);
		}
		return envOneOf0AdditionalPropertiesTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvOneOf0AdditionalPropertiesTypeBoolean_AdditionalProperties() {
        return (EAttribute)getEnvOneOf0AdditionalPropertiesTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalPropertiesTypeObject() {
		if (envOneOf0AdditionalPropertiesTypeObjectEClass == null) {
			envOneOf0AdditionalPropertiesTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(419);
		}
		return envOneOf0AdditionalPropertiesTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvOneOf0AdditionalPropertiesTypeObject_AdditionalProperties() {
        return (EReference)getEnvOneOf0AdditionalPropertiesTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnvOneOf0AdditionalPropertiesTypeObject__Get__String() {
        return getEnvOneOf0AdditionalPropertiesTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalPropertiesPropertiesAbstract() {
		if (envOneOf0AdditionalPropertiesPropertiesAbstractEClass == null) {
			envOneOf0AdditionalPropertiesPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(420);
		}
		return envOneOf0AdditionalPropertiesPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalPropertiesAdditionalProperties() {
		if (envOneOf0AdditionalPropertiesAdditionalPropertiesEClass == null) {
			envOneOf0AdditionalPropertiesAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(421);
		}
		return envOneOf0AdditionalPropertiesAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEnvOneOf0AdditionalPropertiesAdditionalProperties_Key() {
        return (EAttribute)getEnvOneOf0AdditionalPropertiesAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvOneOf0AdditionalPropertiesAdditionalProperties_AdditionalProperties() {
        return (EReference)getEnvOneOf0AdditionalPropertiesAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnvOneOf0AdditionalPropertiesAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getEnvOneOf0AdditionalPropertiesAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEnvOneOf0AdditionalPropertiesAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getEnvOneOf0AdditionalPropertiesAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalPropertiesTypeArray() {
		if (envOneOf0AdditionalPropertiesTypeArrayEClass == null) {
			envOneOf0AdditionalPropertiesTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(422);
		}
		return envOneOf0AdditionalPropertiesTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvOneOf0AdditionalPropertiesTypeArray_AdditionalProperties() {
        return (EReference)getEnvOneOf0AdditionalPropertiesTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalPropertiesItems() {
		if (envOneOf0AdditionalPropertiesItemsEClass == null) {
			envOneOf0AdditionalPropertiesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(423);
		}
		return envOneOf0AdditionalPropertiesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvOneOf0AdditionalPropertiesItems_Items() {
        return (EReference)getEnvOneOf0AdditionalPropertiesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvOneOf0AdditionalPropertiesTypeNull() {
		if (envOneOf0AdditionalPropertiesTypeNullEClass == null) {
			envOneOf0AdditionalPropertiesTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(424);
		}
		return envOneOf0AdditionalPropertiesTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEnvOneOf0AdditionalPropertiesTypeNull_AdditionalProperties() {
        return (EReference)getEnvOneOf0AdditionalPropertiesTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEnvironmentPropertiesAbstract() {
		if (environmentPropertiesAbstractEClass == null) {
			environmentPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(425);
		}
		return environmentPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectAbstract() {
		if (eventObjectAbstractEClass == null) {
			eventObjectAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(426);
		}
		return eventObjectAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectTypeString() {
		if (eventObjectTypeStringEClass == null) {
			eventObjectTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(427);
		}
		return eventObjectTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventObjectTypeString_EventObject() {
        return (EAttribute)getEventObjectTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectTypeInteger() {
		if (eventObjectTypeIntegerEClass == null) {
			eventObjectTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(428);
		}
		return eventObjectTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventObjectTypeInteger_EventObject() {
        return (EAttribute)getEventObjectTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectTypeNumber() {
		if (eventObjectTypeNumberEClass == null) {
			eventObjectTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(429);
		}
		return eventObjectTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventObjectTypeNumber_EventObject() {
        return (EAttribute)getEventObjectTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectTypeBoolean() {
		if (eventObjectTypeBooleanEClass == null) {
			eventObjectTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(430);
		}
		return eventObjectTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventObjectTypeBoolean_EventObject() {
        return (EAttribute)getEventObjectTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectTypeObject() {
		if (eventObjectTypeObjectEClass == null) {
			eventObjectTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(431);
		}
		return eventObjectTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventObjectTypeObject_EventObject() {
        return (EReference)getEventObjectTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEventObjectTypeObject__Get__String() {
        return getEventObjectTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectTypeArray() {
		if (eventObjectTypeArrayEClass == null) {
			eventObjectTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(432);
		}
		return eventObjectTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventObjectTypeArray_EventObject() {
        return (EReference)getEventObjectTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectItems() {
		if (eventObjectItemsEClass == null) {
			eventObjectItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(433);
		}
		return eventObjectItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventObjectItems_Items() {
        return (EReference)getEventObjectItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectTypeNull() {
		if (eventObjectTypeNullEClass == null) {
			eventObjectTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(434);
		}
		return eventObjectTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventObjectTypeNull_EventObject() {
        return (EReference)getEventObjectTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectOneOf0PropertiesAbstract() {
		if (eventObjectOneOf0PropertiesAbstractEClass == null) {
			eventObjectOneOf0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(435);
		}
		return eventObjectOneOf0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getEventObjectOneOf0AdditionalProperties() {
		if (eventObjectOneOf0AdditionalPropertiesEClass == null) {
			eventObjectOneOf0AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(436);
		}
		return eventObjectOneOf0AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getEventObjectOneOf0AdditionalProperties_Key() {
        return (EAttribute)getEventObjectOneOf0AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getEventObjectOneOf0AdditionalProperties_AdditionalProperties() {
        return (EReference)getEventObjectOneOf0AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEventObjectOneOf0AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getEventObjectOneOf0AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getEventObjectOneOf0AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getEventObjectOneOf0AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefAbstract() {
		if (refAbstractEClass == null) {
			refAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(437);
		}
		return refAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefTypeString() {
		if (refTypeStringEClass == null) {
			refTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(438);
		}
		return refTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefTypeString_Ref() {
        return (EAttribute)getRefTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefTypeInteger() {
		if (refTypeIntegerEClass == null) {
			refTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(439);
		}
		return refTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefTypeInteger_Ref() {
        return (EAttribute)getRefTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefTypeNumber() {
		if (refTypeNumberEClass == null) {
			refTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(440);
		}
		return refTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefTypeNumber_Ref() {
        return (EAttribute)getRefTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefTypeBoolean() {
		if (refTypeBooleanEClass == null) {
			refTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(441);
		}
		return refTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefTypeBoolean_Ref() {
        return (EAttribute)getRefTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefTypeObject() {
		if (refTypeObjectEClass == null) {
			refTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(442);
		}
		return refTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefTypeObject_Ref() {
        return (EReference)getRefTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefTypeObject_Branches() {
        return (EReference)getRefTypeObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefTypeObject_Branches_45ignore() {
        return (EReference)getRefTypeObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefTypeObject_Tags() {
        return (EReference)getRefTypeObject().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefTypeObject_Tags_45ignore() {
        return (EReference)getRefTypeObject().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefTypeObject_Paths() {
        return (EReference)getRefTypeObject().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefTypeObject_Paths_45ignore() {
        return (EReference)getRefTypeObject().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefTypeObject__Get__String() {
        return getRefTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefPropertiesAbstract() {
		if (refPropertiesAbstractEClass == null) {
			refPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(443);
		}
		return refPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefAdditionalProperties() {
		if (refAdditionalPropertiesEClass == null) {
			refAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(444);
		}
		return refAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefAdditionalProperties_Key() {
        return (EAttribute)getRefAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefAdditionalProperties_AdditionalProperties() {
        return (EReference)getRefAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getRefAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getRefAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefTypeArray() {
		if (refTypeArrayEClass == null) {
			refTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(445);
		}
		return refTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefTypeArray_Ref() {
        return (EReference)getRefTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefItems() {
		if (refItemsEClass == null) {
			refItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(446);
		}
		return refItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefItems_Items() {
        return (EReference)getRefItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefTypeNull() {
		if (refTypeNullEClass == null) {
			refTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(447);
		}
		return refTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefTypeNull_Ref() {
        return (EReference)getRefTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0PropertiesAbstract() {
		if (refOneOf0PropertiesAbstractEClass == null) {
			refOneOf0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(448);
		}
		return refOneOf0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AdditionalProperties() {
		if (refOneOf0AdditionalPropertiesEClass == null) {
			refOneOf0AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(449);
		}
		return refOneOf0AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AdditionalProperties_Key() {
        return (EAttribute)getRefOneOf0AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AdditionalProperties_AdditionalProperties() {
        return (EReference)getRefOneOf0AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getRefOneOf0AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getRefOneOf0AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0Abstract() {
		if (refOneOf0AllOf0AbstractEClass == null) {
			refOneOf0AllOf0AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(450);
		}
		return refOneOf0AllOf0AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0TypeString() {
		if (refOneOf0AllOf0TypeStringEClass == null) {
			refOneOf0AllOf0TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(451);
		}
		return refOneOf0AllOf0TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf0TypeString_Ref() {
        return (EAttribute)getRefOneOf0AllOf0TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0TypeInteger() {
		if (refOneOf0AllOf0TypeIntegerEClass == null) {
			refOneOf0AllOf0TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(452);
		}
		return refOneOf0AllOf0TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf0TypeInteger_Ref() {
        return (EAttribute)getRefOneOf0AllOf0TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0TypeNumber() {
		if (refOneOf0AllOf0TypeNumberEClass == null) {
			refOneOf0AllOf0TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(453);
		}
		return refOneOf0AllOf0TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf0TypeNumber_Ref() {
        return (EAttribute)getRefOneOf0AllOf0TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0TypeBoolean() {
		if (refOneOf0AllOf0TypeBooleanEClass == null) {
			refOneOf0AllOf0TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(454);
		}
		return refOneOf0AllOf0TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf0TypeBoolean_Ref() {
        return (EAttribute)getRefOneOf0AllOf0TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0TypeObject() {
		if (refOneOf0AllOf0TypeObjectEClass == null) {
			refOneOf0AllOf0TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(455);
		}
		return refOneOf0AllOf0TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf0TypeObject_Ref() {
        return (EReference)getRefOneOf0AllOf0TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf0TypeObject__Get__String() {
        return getRefOneOf0AllOf0TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0PropertiesAbstract() {
		if (refOneOf0AllOf0PropertiesAbstractEClass == null) {
			refOneOf0AllOf0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(456);
		}
		return refOneOf0AllOf0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0AdditionalProperties() {
		if (refOneOf0AllOf0AdditionalPropertiesEClass == null) {
			refOneOf0AllOf0AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(457);
		}
		return refOneOf0AllOf0AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf0AdditionalProperties_Key() {
        return (EAttribute)getRefOneOf0AllOf0AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf0AdditionalProperties_AdditionalProperties() {
        return (EReference)getRefOneOf0AllOf0AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf0AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getRefOneOf0AllOf0AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf0AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getRefOneOf0AllOf0AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0TypeArray() {
		if (refOneOf0AllOf0TypeArrayEClass == null) {
			refOneOf0AllOf0TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(458);
		}
		return refOneOf0AllOf0TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf0TypeArray_Ref() {
        return (EReference)getRefOneOf0AllOf0TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0Items() {
		if (refOneOf0AllOf0ItemsEClass == null) {
			refOneOf0AllOf0ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(459);
		}
		return refOneOf0AllOf0ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf0Items_Items() {
        return (EReference)getRefOneOf0AllOf0Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0TypeNull() {
		if (refOneOf0AllOf0TypeNullEClass == null) {
			refOneOf0AllOf0TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(460);
		}
		return refOneOf0AllOf0TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf0TypeNull_Ref() {
        return (EReference)getRefOneOf0AllOf0TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0NotAbstract() {
		if (refOneOf0AllOf0NotAbstractEClass == null) {
			refOneOf0AllOf0NotAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(461);
		}
		return refOneOf0AllOf0NotAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0NotTypeString() {
		if (refOneOf0AllOf0NotTypeStringEClass == null) {
			refOneOf0AllOf0NotTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(462);
		}
		return refOneOf0AllOf0NotTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf0NotTypeString_Ref() {
        return (EAttribute)getRefOneOf0AllOf0NotTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0NotTypeInteger() {
		if (refOneOf0AllOf0NotTypeIntegerEClass == null) {
			refOneOf0AllOf0NotTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(463);
		}
		return refOneOf0AllOf0NotTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf0NotTypeInteger_Ref() {
        return (EAttribute)getRefOneOf0AllOf0NotTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0NotTypeNumber() {
		if (refOneOf0AllOf0NotTypeNumberEClass == null) {
			refOneOf0AllOf0NotTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(464);
		}
		return refOneOf0AllOf0NotTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf0NotTypeNumber_Ref() {
        return (EAttribute)getRefOneOf0AllOf0NotTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0NotTypeBoolean() {
		if (refOneOf0AllOf0NotTypeBooleanEClass == null) {
			refOneOf0AllOf0NotTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(465);
		}
		return refOneOf0AllOf0NotTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf0NotTypeBoolean_Ref() {
        return (EAttribute)getRefOneOf0AllOf0NotTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0NotTypeObject() {
		if (refOneOf0AllOf0NotTypeObjectEClass == null) {
			refOneOf0AllOf0NotTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(466);
		}
		return refOneOf0AllOf0NotTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf0NotTypeObject_Ref() {
        return (EReference)getRefOneOf0AllOf0NotTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf0NotTypeObject__Get__String() {
        return getRefOneOf0AllOf0NotTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0NotPropertiesAbstract() {
		if (refOneOf0AllOf0NotPropertiesAbstractEClass == null) {
			refOneOf0AllOf0NotPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(467);
		}
		return refOneOf0AllOf0NotPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0NotAdditionalProperties() {
		if (refOneOf0AllOf0NotAdditionalPropertiesEClass == null) {
			refOneOf0AllOf0NotAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(468);
		}
		return refOneOf0AllOf0NotAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf0NotAdditionalProperties_Key() {
        return (EAttribute)getRefOneOf0AllOf0NotAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf0NotAdditionalProperties_AdditionalProperties() {
        return (EReference)getRefOneOf0AllOf0NotAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf0NotAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getRefOneOf0AllOf0NotAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf0NotAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getRefOneOf0AllOf0NotAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0NotTypeArray() {
		if (refOneOf0AllOf0NotTypeArrayEClass == null) {
			refOneOf0AllOf0NotTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(469);
		}
		return refOneOf0AllOf0NotTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf0NotTypeArray_Ref() {
        return (EReference)getRefOneOf0AllOf0NotTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0NotItems() {
		if (refOneOf0AllOf0NotItemsEClass == null) {
			refOneOf0AllOf0NotItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(470);
		}
		return refOneOf0AllOf0NotItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf0NotItems_Items() {
        return (EReference)getRefOneOf0AllOf0NotItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf0NotTypeNull() {
		if (refOneOf0AllOf0NotTypeNullEClass == null) {
			refOneOf0AllOf0NotTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(471);
		}
		return refOneOf0AllOf0NotTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf0NotTypeNull_Ref() {
        return (EReference)getRefOneOf0AllOf0NotTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1Abstract() {
		if (refOneOf0AllOf1AbstractEClass == null) {
			refOneOf0AllOf1AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(472);
		}
		return refOneOf0AllOf1AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1TypeString() {
		if (refOneOf0AllOf1TypeStringEClass == null) {
			refOneOf0AllOf1TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(473);
		}
		return refOneOf0AllOf1TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf1TypeString_Ref() {
        return (EAttribute)getRefOneOf0AllOf1TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1TypeInteger() {
		if (refOneOf0AllOf1TypeIntegerEClass == null) {
			refOneOf0AllOf1TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(474);
		}
		return refOneOf0AllOf1TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf1TypeInteger_Ref() {
        return (EAttribute)getRefOneOf0AllOf1TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1TypeNumber() {
		if (refOneOf0AllOf1TypeNumberEClass == null) {
			refOneOf0AllOf1TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(475);
		}
		return refOneOf0AllOf1TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf1TypeNumber_Ref() {
        return (EAttribute)getRefOneOf0AllOf1TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1TypeBoolean() {
		if (refOneOf0AllOf1TypeBooleanEClass == null) {
			refOneOf0AllOf1TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(476);
		}
		return refOneOf0AllOf1TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf1TypeBoolean_Ref() {
        return (EAttribute)getRefOneOf0AllOf1TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1TypeObject() {
		if (refOneOf0AllOf1TypeObjectEClass == null) {
			refOneOf0AllOf1TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(477);
		}
		return refOneOf0AllOf1TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf1TypeObject_Ref() {
        return (EReference)getRefOneOf0AllOf1TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf1TypeObject__Get__String() {
        return getRefOneOf0AllOf1TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1PropertiesAbstract() {
		if (refOneOf0AllOf1PropertiesAbstractEClass == null) {
			refOneOf0AllOf1PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(478);
		}
		return refOneOf0AllOf1PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1AdditionalProperties() {
		if (refOneOf0AllOf1AdditionalPropertiesEClass == null) {
			refOneOf0AllOf1AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(479);
		}
		return refOneOf0AllOf1AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf1AdditionalProperties_Key() {
        return (EAttribute)getRefOneOf0AllOf1AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf1AdditionalProperties_AdditionalProperties() {
        return (EReference)getRefOneOf0AllOf1AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf1AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getRefOneOf0AllOf1AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf1AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getRefOneOf0AllOf1AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1TypeArray() {
		if (refOneOf0AllOf1TypeArrayEClass == null) {
			refOneOf0AllOf1TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(480);
		}
		return refOneOf0AllOf1TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf1TypeArray_Ref() {
        return (EReference)getRefOneOf0AllOf1TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1Items() {
		if (refOneOf0AllOf1ItemsEClass == null) {
			refOneOf0AllOf1ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(481);
		}
		return refOneOf0AllOf1ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf1Items_Items() {
        return (EReference)getRefOneOf0AllOf1Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1TypeNull() {
		if (refOneOf0AllOf1TypeNullEClass == null) {
			refOneOf0AllOf1TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(482);
		}
		return refOneOf0AllOf1TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf1TypeNull_Ref() {
        return (EReference)getRefOneOf0AllOf1TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1NotAbstract() {
		if (refOneOf0AllOf1NotAbstractEClass == null) {
			refOneOf0AllOf1NotAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(483);
		}
		return refOneOf0AllOf1NotAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1NotTypeString() {
		if (refOneOf0AllOf1NotTypeStringEClass == null) {
			refOneOf0AllOf1NotTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(484);
		}
		return refOneOf0AllOf1NotTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf1NotTypeString_Ref() {
        return (EAttribute)getRefOneOf0AllOf1NotTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1NotTypeInteger() {
		if (refOneOf0AllOf1NotTypeIntegerEClass == null) {
			refOneOf0AllOf1NotTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(485);
		}
		return refOneOf0AllOf1NotTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf1NotTypeInteger_Ref() {
        return (EAttribute)getRefOneOf0AllOf1NotTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1NotTypeNumber() {
		if (refOneOf0AllOf1NotTypeNumberEClass == null) {
			refOneOf0AllOf1NotTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(486);
		}
		return refOneOf0AllOf1NotTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf1NotTypeNumber_Ref() {
        return (EAttribute)getRefOneOf0AllOf1NotTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1NotTypeBoolean() {
		if (refOneOf0AllOf1NotTypeBooleanEClass == null) {
			refOneOf0AllOf1NotTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(487);
		}
		return refOneOf0AllOf1NotTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf1NotTypeBoolean_Ref() {
        return (EAttribute)getRefOneOf0AllOf1NotTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1NotTypeObject() {
		if (refOneOf0AllOf1NotTypeObjectEClass == null) {
			refOneOf0AllOf1NotTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(488);
		}
		return refOneOf0AllOf1NotTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf1NotTypeObject_Ref() {
        return (EReference)getRefOneOf0AllOf1NotTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf1NotTypeObject__Get__String() {
        return getRefOneOf0AllOf1NotTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1NotPropertiesAbstract() {
		if (refOneOf0AllOf1NotPropertiesAbstractEClass == null) {
			refOneOf0AllOf1NotPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(489);
		}
		return refOneOf0AllOf1NotPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1NotAdditionalProperties() {
		if (refOneOf0AllOf1NotAdditionalPropertiesEClass == null) {
			refOneOf0AllOf1NotAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(490);
		}
		return refOneOf0AllOf1NotAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf1NotAdditionalProperties_Key() {
        return (EAttribute)getRefOneOf0AllOf1NotAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf1NotAdditionalProperties_AdditionalProperties() {
        return (EReference)getRefOneOf0AllOf1NotAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf1NotAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getRefOneOf0AllOf1NotAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf1NotAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getRefOneOf0AllOf1NotAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1NotTypeArray() {
		if (refOneOf0AllOf1NotTypeArrayEClass == null) {
			refOneOf0AllOf1NotTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(491);
		}
		return refOneOf0AllOf1NotTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf1NotTypeArray_Ref() {
        return (EReference)getRefOneOf0AllOf1NotTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1NotItems() {
		if (refOneOf0AllOf1NotItemsEClass == null) {
			refOneOf0AllOf1NotItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(492);
		}
		return refOneOf0AllOf1NotItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf1NotItems_Items() {
        return (EReference)getRefOneOf0AllOf1NotItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf1NotTypeNull() {
		if (refOneOf0AllOf1NotTypeNullEClass == null) {
			refOneOf0AllOf1NotTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(493);
		}
		return refOneOf0AllOf1NotTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf1NotTypeNull_Ref() {
        return (EReference)getRefOneOf0AllOf1NotTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2Abstract() {
		if (refOneOf0AllOf2AbstractEClass == null) {
			refOneOf0AllOf2AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(494);
		}
		return refOneOf0AllOf2AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2TypeString() {
		if (refOneOf0AllOf2TypeStringEClass == null) {
			refOneOf0AllOf2TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(495);
		}
		return refOneOf0AllOf2TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf2TypeString_Ref() {
        return (EAttribute)getRefOneOf0AllOf2TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2TypeInteger() {
		if (refOneOf0AllOf2TypeIntegerEClass == null) {
			refOneOf0AllOf2TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(496);
		}
		return refOneOf0AllOf2TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf2TypeInteger_Ref() {
        return (EAttribute)getRefOneOf0AllOf2TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2TypeNumber() {
		if (refOneOf0AllOf2TypeNumberEClass == null) {
			refOneOf0AllOf2TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(497);
		}
		return refOneOf0AllOf2TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf2TypeNumber_Ref() {
        return (EAttribute)getRefOneOf0AllOf2TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2TypeBoolean() {
		if (refOneOf0AllOf2TypeBooleanEClass == null) {
			refOneOf0AllOf2TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(498);
		}
		return refOneOf0AllOf2TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf2TypeBoolean_Ref() {
        return (EAttribute)getRefOneOf0AllOf2TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2TypeObject() {
		if (refOneOf0AllOf2TypeObjectEClass == null) {
			refOneOf0AllOf2TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(499);
		}
		return refOneOf0AllOf2TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf2TypeObject_Ref() {
        return (EReference)getRefOneOf0AllOf2TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf2TypeObject__Get__String() {
        return getRefOneOf0AllOf2TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2PropertiesAbstract() {
		if (refOneOf0AllOf2PropertiesAbstractEClass == null) {
			refOneOf0AllOf2PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(500);
		}
		return refOneOf0AllOf2PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2AdditionalProperties() {
		if (refOneOf0AllOf2AdditionalPropertiesEClass == null) {
			refOneOf0AllOf2AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(501);
		}
		return refOneOf0AllOf2AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf2AdditionalProperties_Key() {
        return (EAttribute)getRefOneOf0AllOf2AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf2AdditionalProperties_AdditionalProperties() {
        return (EReference)getRefOneOf0AllOf2AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf2AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getRefOneOf0AllOf2AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf2AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getRefOneOf0AllOf2AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2TypeArray() {
		if (refOneOf0AllOf2TypeArrayEClass == null) {
			refOneOf0AllOf2TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(502);
		}
		return refOneOf0AllOf2TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf2TypeArray_Ref() {
        return (EReference)getRefOneOf0AllOf2TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2Items() {
		if (refOneOf0AllOf2ItemsEClass == null) {
			refOneOf0AllOf2ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(503);
		}
		return refOneOf0AllOf2ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf2Items_Items() {
        return (EReference)getRefOneOf0AllOf2Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2TypeNull() {
		if (refOneOf0AllOf2TypeNullEClass == null) {
			refOneOf0AllOf2TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(504);
		}
		return refOneOf0AllOf2TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf2TypeNull_Ref() {
        return (EReference)getRefOneOf0AllOf2TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2NotAbstract() {
		if (refOneOf0AllOf2NotAbstractEClass == null) {
			refOneOf0AllOf2NotAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(505);
		}
		return refOneOf0AllOf2NotAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2NotTypeString() {
		if (refOneOf0AllOf2NotTypeStringEClass == null) {
			refOneOf0AllOf2NotTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(506);
		}
		return refOneOf0AllOf2NotTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf2NotTypeString_Ref() {
        return (EAttribute)getRefOneOf0AllOf2NotTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2NotTypeInteger() {
		if (refOneOf0AllOf2NotTypeIntegerEClass == null) {
			refOneOf0AllOf2NotTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(507);
		}
		return refOneOf0AllOf2NotTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf2NotTypeInteger_Ref() {
        return (EAttribute)getRefOneOf0AllOf2NotTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2NotTypeNumber() {
		if (refOneOf0AllOf2NotTypeNumberEClass == null) {
			refOneOf0AllOf2NotTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(508);
		}
		return refOneOf0AllOf2NotTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf2NotTypeNumber_Ref() {
        return (EAttribute)getRefOneOf0AllOf2NotTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2NotTypeBoolean() {
		if (refOneOf0AllOf2NotTypeBooleanEClass == null) {
			refOneOf0AllOf2NotTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(509);
		}
		return refOneOf0AllOf2NotTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf2NotTypeBoolean_Ref() {
        return (EAttribute)getRefOneOf0AllOf2NotTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2NotTypeObject() {
		if (refOneOf0AllOf2NotTypeObjectEClass == null) {
			refOneOf0AllOf2NotTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(510);
		}
		return refOneOf0AllOf2NotTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf2NotTypeObject_Ref() {
        return (EReference)getRefOneOf0AllOf2NotTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf2NotTypeObject__Get__String() {
        return getRefOneOf0AllOf2NotTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2NotPropertiesAbstract() {
		if (refOneOf0AllOf2NotPropertiesAbstractEClass == null) {
			refOneOf0AllOf2NotPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(511);
		}
		return refOneOf0AllOf2NotPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2NotAdditionalProperties() {
		if (refOneOf0AllOf2NotAdditionalPropertiesEClass == null) {
			refOneOf0AllOf2NotAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(512);
		}
		return refOneOf0AllOf2NotAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getRefOneOf0AllOf2NotAdditionalProperties_Key() {
        return (EAttribute)getRefOneOf0AllOf2NotAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf2NotAdditionalProperties_AdditionalProperties() {
        return (EReference)getRefOneOf0AllOf2NotAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf2NotAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getRefOneOf0AllOf2NotAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getRefOneOf0AllOf2NotAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getRefOneOf0AllOf2NotAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2NotTypeArray() {
		if (refOneOf0AllOf2NotTypeArrayEClass == null) {
			refOneOf0AllOf2NotTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(513);
		}
		return refOneOf0AllOf2NotTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf2NotTypeArray_Ref() {
        return (EReference)getRefOneOf0AllOf2NotTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2NotItems() {
		if (refOneOf0AllOf2NotItemsEClass == null) {
			refOneOf0AllOf2NotItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(514);
		}
		return refOneOf0AllOf2NotItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf2NotItems_Items() {
        return (EReference)getRefOneOf0AllOf2NotItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getRefOneOf0AllOf2NotTypeNull() {
		if (refOneOf0AllOf2NotTypeNullEClass == null) {
			refOneOf0AllOf2NotTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(515);
		}
		return refOneOf0AllOf2NotTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getRefOneOf0AllOf2NotTypeNull_Ref() {
        return (EReference)getRefOneOf0AllOf2NotTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShellAbstract() {
		if (shellAbstractEClass == null) {
			shellAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(516);
		}
		return shellAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShellTypeString() {
		if (shellTypeStringEClass == null) {
			shellTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(517);
		}
		return shellTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShellTypeString_Shell() {
        return (EAttribute)getShellTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShellTypeInteger() {
		if (shellTypeIntegerEClass == null) {
			shellTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(518);
		}
		return shellTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShellTypeInteger_Shell() {
        return (EAttribute)getShellTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShellTypeNumber() {
		if (shellTypeNumberEClass == null) {
			shellTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(519);
		}
		return shellTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShellTypeNumber_Shell() {
        return (EAttribute)getShellTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShellTypeBoolean() {
		if (shellTypeBooleanEClass == null) {
			shellTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(520);
		}
		return shellTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShellTypeBoolean_Shell() {
        return (EAttribute)getShellTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShellTypeObject() {
		if (shellTypeObjectEClass == null) {
			shellTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(521);
		}
		return shellTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShellTypeObject_Shell() {
        return (EReference)getShellTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getShellTypeObject__Get__String() {
        return getShellTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShellPropertiesAbstract() {
		if (shellPropertiesAbstractEClass == null) {
			shellPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(522);
		}
		return shellPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShellAdditionalProperties() {
		if (shellAdditionalPropertiesEClass == null) {
			shellAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(523);
		}
		return shellAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getShellAdditionalProperties_Key() {
        return (EAttribute)getShellAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShellAdditionalProperties_AdditionalProperties() {
        return (EReference)getShellAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getShellAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getShellAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getShellAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getShellAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShellTypeArray() {
		if (shellTypeArrayEClass == null) {
			shellTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(524);
		}
		return shellTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShellTypeArray_Shell() {
        return (EReference)getShellTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShellItems() {
		if (shellItemsEClass == null) {
			shellItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(525);
		}
		return shellItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShellItems_Items() {
        return (EReference)getShellItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getShellTypeNull() {
		if (shellTypeNullEClass == null) {
			shellTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(526);
		}
		return shellTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getShellTypeNull_Shell() {
        return (EReference)getShellTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypesItems() {
		if (typesItemsEClass == null) {
			typesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(527);
		}
		return typesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTypesItems_Items() {
        return (EReference)getTypesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeedsAbstract() {
		if (jobNeedsAbstractEClass == null) {
			jobNeedsAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(528);
		}
		return jobNeedsAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeedsTypeString() {
		if (jobNeedsTypeStringEClass == null) {
			jobNeedsTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(529);
		}
		return jobNeedsTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobNeedsTypeString_JobNeeds() {
        return (EAttribute)getJobNeedsTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeedsTypeInteger() {
		if (jobNeedsTypeIntegerEClass == null) {
			jobNeedsTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(530);
		}
		return jobNeedsTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobNeedsTypeInteger_JobNeeds() {
        return (EAttribute)getJobNeedsTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeedsTypeNumber() {
		if (jobNeedsTypeNumberEClass == null) {
			jobNeedsTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(531);
		}
		return jobNeedsTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobNeedsTypeNumber_JobNeeds() {
        return (EAttribute)getJobNeedsTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeedsTypeBoolean() {
		if (jobNeedsTypeBooleanEClass == null) {
			jobNeedsTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(532);
		}
		return jobNeedsTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobNeedsTypeBoolean_JobNeeds() {
        return (EAttribute)getJobNeedsTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeedsTypeObject() {
		if (jobNeedsTypeObjectEClass == null) {
			jobNeedsTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(533);
		}
		return jobNeedsTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobNeedsTypeObject_JobNeeds() {
        return (EReference)getJobNeedsTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJobNeedsTypeObject__Get__String() {
        return getJobNeedsTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeedsPropertiesAbstract() {
		if (jobNeedsPropertiesAbstractEClass == null) {
			jobNeedsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(534);
		}
		return jobNeedsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeedsAdditionalProperties() {
		if (jobNeedsAdditionalPropertiesEClass == null) {
			jobNeedsAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(535);
		}
		return jobNeedsAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getJobNeedsAdditionalProperties_Key() {
        return (EAttribute)getJobNeedsAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobNeedsAdditionalProperties_AdditionalProperties() {
        return (EReference)getJobNeedsAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJobNeedsAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getJobNeedsAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getJobNeedsAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getJobNeedsAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeedsTypeArray() {
		if (jobNeedsTypeArrayEClass == null) {
			jobNeedsTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(536);
		}
		return jobNeedsTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobNeedsTypeArray_JobNeeds() {
        return (EReference)getJobNeedsTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeedsItems() {
		if (jobNeedsItemsEClass == null) {
			jobNeedsItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(537);
		}
		return jobNeedsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobNeedsItems_Items() {
        return (EReference)getJobNeedsItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJobNeedsTypeNull() {
		if (jobNeedsTypeNullEClass == null) {
			jobNeedsTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(538);
		}
		return jobNeedsTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJobNeedsTypeNull_JobNeeds() {
        return (EReference)getJobNeedsTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobPropertiesAbstract() {
		if (reusableWorkflowCallJobPropertiesAbstractEClass == null) {
			reusableWorkflowCallJobPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(539);
		}
		return reusableWorkflowCallJobPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobIfAbstract() {
		if (reusableWorkflowCallJobIfAbstractEClass == null) {
			reusableWorkflowCallJobIfAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(540);
		}
		return reusableWorkflowCallJobIfAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobIfTypeBoolean() {
		if (reusableWorkflowCallJobIfTypeBooleanEClass == null) {
			reusableWorkflowCallJobIfTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(541);
		}
		return reusableWorkflowCallJobIfTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobIfTypeBoolean_If_() {
        return (EAttribute)getReusableWorkflowCallJobIfTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobIfTypeNumber() {
		if (reusableWorkflowCallJobIfTypeNumberEClass == null) {
			reusableWorkflowCallJobIfTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(542);
		}
		return reusableWorkflowCallJobIfTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobIfTypeNumber_If_() {
        return (EAttribute)getReusableWorkflowCallJobIfTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobIfTypeString() {
		if (reusableWorkflowCallJobIfTypeStringEClass == null) {
			reusableWorkflowCallJobIfTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(543);
		}
		return reusableWorkflowCallJobIfTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobIfTypeString_If_() {
        return (EAttribute)getReusableWorkflowCallJobIfTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobSecretsAbstract() {
		if (reusableWorkflowCallJobSecretsAbstractEClass == null) {
			reusableWorkflowCallJobSecretsAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(544);
		}
		return reusableWorkflowCallJobSecretsAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobSecretsTypeString() {
		if (reusableWorkflowCallJobSecretsTypeStringEClass == null) {
			reusableWorkflowCallJobSecretsTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(545);
		}
		return reusableWorkflowCallJobSecretsTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobSecretsTypeString_Secrets() {
        return (EAttribute)getReusableWorkflowCallJobSecretsTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobSecretsTypeInteger() {
		if (reusableWorkflowCallJobSecretsTypeIntegerEClass == null) {
			reusableWorkflowCallJobSecretsTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(546);
		}
		return reusableWorkflowCallJobSecretsTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobSecretsTypeInteger_Secrets() {
        return (EAttribute)getReusableWorkflowCallJobSecretsTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobSecretsTypeNumber() {
		if (reusableWorkflowCallJobSecretsTypeNumberEClass == null) {
			reusableWorkflowCallJobSecretsTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(547);
		}
		return reusableWorkflowCallJobSecretsTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobSecretsTypeNumber_Secrets() {
        return (EAttribute)getReusableWorkflowCallJobSecretsTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobSecretsTypeBoolean() {
		if (reusableWorkflowCallJobSecretsTypeBooleanEClass == null) {
			reusableWorkflowCallJobSecretsTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(548);
		}
		return reusableWorkflowCallJobSecretsTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobSecretsTypeBoolean_Secrets() {
        return (EAttribute)getReusableWorkflowCallJobSecretsTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobSecretsTypeObject() {
		if (reusableWorkflowCallJobSecretsTypeObjectEClass == null) {
			reusableWorkflowCallJobSecretsTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(549);
		}
		return reusableWorkflowCallJobSecretsTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobSecretsTypeObject_Secrets() {
        return (EReference)getReusableWorkflowCallJobSecretsTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobSecretsTypeObject__Get__String() {
        return getReusableWorkflowCallJobSecretsTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobSecretsPropertiesAbstract() {
		if (reusableWorkflowCallJobSecretsPropertiesAbstractEClass == null) {
			reusableWorkflowCallJobSecretsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(550);
		}
		return reusableWorkflowCallJobSecretsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobSecretsAdditionalProperties() {
		if (reusableWorkflowCallJobSecretsAdditionalPropertiesEClass == null) {
			reusableWorkflowCallJobSecretsAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(551);
		}
		return reusableWorkflowCallJobSecretsAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobSecretsAdditionalProperties_Key() {
        return (EAttribute)getReusableWorkflowCallJobSecretsAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobSecretsAdditionalProperties_AdditionalProperties() {
        return (EReference)getReusableWorkflowCallJobSecretsAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobSecretsAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getReusableWorkflowCallJobSecretsAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobSecretsAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getReusableWorkflowCallJobSecretsAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobSecretsTypeArray() {
		if (reusableWorkflowCallJobSecretsTypeArrayEClass == null) {
			reusableWorkflowCallJobSecretsTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(552);
		}
		return reusableWorkflowCallJobSecretsTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobSecretsTypeArray_Secrets() {
        return (EReference)getReusableWorkflowCallJobSecretsTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobSecretsItems() {
		if (reusableWorkflowCallJobSecretsItemsEClass == null) {
			reusableWorkflowCallJobSecretsItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(553);
		}
		return reusableWorkflowCallJobSecretsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobSecretsItems_Items() {
        return (EReference)getReusableWorkflowCallJobSecretsItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobSecretsTypeNull() {
		if (reusableWorkflowCallJobSecretsTypeNullEClass == null) {
			reusableWorkflowCallJobSecretsTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(554);
		}
		return reusableWorkflowCallJobSecretsTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobSecretsTypeNull_Secrets() {
        return (EReference)getReusableWorkflowCallJobSecretsTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyPropertiesAbstract() {
		if (reusableWorkflowCallJobStrategyPropertiesAbstractEClass == null) {
			reusableWorkflowCallJobStrategyPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(555);
		}
		return reusableWorkflowCallJobStrategyPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAbstract() {
		if (reusableWorkflowCallJobStrategyMatrixAbstractEClass == null) {
			reusableWorkflowCallJobStrategyMatrixAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(556);
		}
		return reusableWorkflowCallJobStrategyMatrixAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixTypeString() {
		if (reusableWorkflowCallJobStrategyMatrixTypeStringEClass == null) {
			reusableWorkflowCallJobStrategyMatrixTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(557);
		}
		return reusableWorkflowCallJobStrategyMatrixTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyMatrixTypeString_Matrix() {
        return (EAttribute)getReusableWorkflowCallJobStrategyMatrixTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixTypeInteger() {
		if (reusableWorkflowCallJobStrategyMatrixTypeIntegerEClass == null) {
			reusableWorkflowCallJobStrategyMatrixTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(558);
		}
		return reusableWorkflowCallJobStrategyMatrixTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyMatrixTypeInteger_Matrix() {
        return (EAttribute)getReusableWorkflowCallJobStrategyMatrixTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixTypeNumber() {
		if (reusableWorkflowCallJobStrategyMatrixTypeNumberEClass == null) {
			reusableWorkflowCallJobStrategyMatrixTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(559);
		}
		return reusableWorkflowCallJobStrategyMatrixTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyMatrixTypeNumber_Matrix() {
        return (EAttribute)getReusableWorkflowCallJobStrategyMatrixTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixTypeBoolean() {
		if (reusableWorkflowCallJobStrategyMatrixTypeBooleanEClass == null) {
			reusableWorkflowCallJobStrategyMatrixTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(560);
		}
		return reusableWorkflowCallJobStrategyMatrixTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyMatrixTypeBoolean_Matrix() {
        return (EAttribute)getReusableWorkflowCallJobStrategyMatrixTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixTypeObject() {
		if (reusableWorkflowCallJobStrategyMatrixTypeObjectEClass == null) {
			reusableWorkflowCallJobStrategyMatrixTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(561);
		}
		return reusableWorkflowCallJobStrategyMatrixTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixTypeObject_Matrix() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixTypeObject__Get__String() {
        return getReusableWorkflowCallJobStrategyMatrixTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixPropertiesAbstract() {
		if (reusableWorkflowCallJobStrategyMatrixPropertiesAbstractEClass == null) {
			reusableWorkflowCallJobStrategyMatrixPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(562);
		}
		return reusableWorkflowCallJobStrategyMatrixPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixTypeArray() {
		if (reusableWorkflowCallJobStrategyMatrixTypeArrayEClass == null) {
			reusableWorkflowCallJobStrategyMatrixTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(563);
		}
		return reusableWorkflowCallJobStrategyMatrixTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixTypeArray_Matrix() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixItems() {
		if (reusableWorkflowCallJobStrategyMatrixItemsEClass == null) {
			reusableWorkflowCallJobStrategyMatrixItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(564);
		}
		return reusableWorkflowCallJobStrategyMatrixItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixItems_Items() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixTypeNull() {
		if (reusableWorkflowCallJobStrategyMatrixTypeNullEClass == null) {
			reusableWorkflowCallJobStrategyMatrixTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(565);
		}
		return reusableWorkflowCallJobStrategyMatrixTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixTypeNull_Matrix() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstract() {
		if (reusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstractEClass == null) {
			reusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(566);
		}
		return reusableWorkflowCallJobStrategyMatrixOneOf0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties() {
		if (reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesEClass == null) {
			reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(567);
		}
		return reusableWorkflowCallJobStrategyMatrixOneOf0AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties_Key() {
        return (EAttribute)getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties_AdditionalProperties() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getReusableWorkflowCallJobStrategyMatrixOneOf0AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract() {
		if (reusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractEClass == null) {
			reusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(568);
		}
		return reusableWorkflowCallJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstract() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractEClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(569);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeStringEClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(570);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString_AdditionalProperties() {
        return (EAttribute)getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeIntegerEClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(571);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger_AdditionalProperties() {
        return (EAttribute)getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumberEClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(572);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber_AdditionalProperties() {
        return (EAttribute)getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBooleanEClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(573);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean_AdditionalProperties() {
        return (EAttribute)getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectEClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(574);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject_AdditionalProperties() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject__Get__String() {
        return getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstract() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstractEClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(575);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesEClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(576);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties_Key() {
        return (EAttribute)getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties_AdditionalProperties() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayEClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(577);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray_AdditionalProperties() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItemsEClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(578);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems_Items() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull() {
		if (reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNullEClass == null) {
			reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(579);
		}
		return reusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull_AdditionalProperties() {
        return (EReference)getReusableWorkflowCallJobStrategyMatrixAdditionalPropertiesTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobConcurrencyAbstract() {
		if (reusableWorkflowCallJobConcurrencyAbstractEClass == null) {
			reusableWorkflowCallJobConcurrencyAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(580);
		}
		return reusableWorkflowCallJobConcurrencyAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobConcurrencyTypeString() {
		if (reusableWorkflowCallJobConcurrencyTypeStringEClass == null) {
			reusableWorkflowCallJobConcurrencyTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(581);
		}
		return reusableWorkflowCallJobConcurrencyTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobConcurrencyTypeString_Concurrency() {
        return (EAttribute)getReusableWorkflowCallJobConcurrencyTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobConcurrencyTypeInteger() {
		if (reusableWorkflowCallJobConcurrencyTypeIntegerEClass == null) {
			reusableWorkflowCallJobConcurrencyTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(582);
		}
		return reusableWorkflowCallJobConcurrencyTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobConcurrencyTypeInteger_Concurrency() {
        return (EAttribute)getReusableWorkflowCallJobConcurrencyTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobConcurrencyTypeNumber() {
		if (reusableWorkflowCallJobConcurrencyTypeNumberEClass == null) {
			reusableWorkflowCallJobConcurrencyTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(583);
		}
		return reusableWorkflowCallJobConcurrencyTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobConcurrencyTypeNumber_Concurrency() {
        return (EAttribute)getReusableWorkflowCallJobConcurrencyTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobConcurrencyTypeBoolean() {
		if (reusableWorkflowCallJobConcurrencyTypeBooleanEClass == null) {
			reusableWorkflowCallJobConcurrencyTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(584);
		}
		return reusableWorkflowCallJobConcurrencyTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobConcurrencyTypeBoolean_Concurrency() {
        return (EAttribute)getReusableWorkflowCallJobConcurrencyTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobConcurrencyTypeObject() {
		if (reusableWorkflowCallJobConcurrencyTypeObjectEClass == null) {
			reusableWorkflowCallJobConcurrencyTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(585);
		}
		return reusableWorkflowCallJobConcurrencyTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobConcurrencyTypeObject_Concurrency() {
        return (EReference)getReusableWorkflowCallJobConcurrencyTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobConcurrencyTypeObject__Get__String() {
        return getReusableWorkflowCallJobConcurrencyTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobConcurrencyPropertiesAbstract() {
		if (reusableWorkflowCallJobConcurrencyPropertiesAbstractEClass == null) {
			reusableWorkflowCallJobConcurrencyPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(586);
		}
		return reusableWorkflowCallJobConcurrencyPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobConcurrencyAdditionalProperties() {
		if (reusableWorkflowCallJobConcurrencyAdditionalPropertiesEClass == null) {
			reusableWorkflowCallJobConcurrencyAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(587);
		}
		return reusableWorkflowCallJobConcurrencyAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getReusableWorkflowCallJobConcurrencyAdditionalProperties_Key() {
        return (EAttribute)getReusableWorkflowCallJobConcurrencyAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobConcurrencyAdditionalProperties_AdditionalProperties() {
        return (EReference)getReusableWorkflowCallJobConcurrencyAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobConcurrencyAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getReusableWorkflowCallJobConcurrencyAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getReusableWorkflowCallJobConcurrencyAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getReusableWorkflowCallJobConcurrencyAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobConcurrencyTypeArray() {
		if (reusableWorkflowCallJobConcurrencyTypeArrayEClass == null) {
			reusableWorkflowCallJobConcurrencyTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(588);
		}
		return reusableWorkflowCallJobConcurrencyTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobConcurrencyTypeArray_Concurrency() {
        return (EReference)getReusableWorkflowCallJobConcurrencyTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobConcurrencyItems() {
		if (reusableWorkflowCallJobConcurrencyItemsEClass == null) {
			reusableWorkflowCallJobConcurrencyItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(589);
		}
		return reusableWorkflowCallJobConcurrencyItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobConcurrencyItems_Items() {
        return (EReference)getReusableWorkflowCallJobConcurrencyItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getReusableWorkflowCallJobConcurrencyTypeNull() {
		if (reusableWorkflowCallJobConcurrencyTypeNullEClass == null) {
			reusableWorkflowCallJobConcurrencyTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(590);
		}
		return reusableWorkflowCallJobConcurrencyTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getReusableWorkflowCallJobConcurrencyTypeNull_Concurrency() {
        return (EReference)getReusableWorkflowCallJobConcurrencyTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobPropertiesAbstract() {
		if (normalJobPropertiesAbstractEClass == null) {
			normalJobPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(591);
		}
		return normalJobPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onAbstract() {
		if (normalJobRuns_45onAbstractEClass == null) {
			normalJobRuns_45onAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(592);
		}
		return normalJobRuns_45onAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onTypeString() {
		if (normalJobRuns_45onTypeStringEClass == null) {
			normalJobRuns_45onTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(593);
		}
		return normalJobRuns_45onTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onTypeString_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onTypeInteger() {
		if (normalJobRuns_45onTypeIntegerEClass == null) {
			normalJobRuns_45onTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(594);
		}
		return normalJobRuns_45onTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onTypeInteger_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onTypeNumber() {
		if (normalJobRuns_45onTypeNumberEClass == null) {
			normalJobRuns_45onTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(595);
		}
		return normalJobRuns_45onTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onTypeNumber_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onTypeBoolean() {
		if (normalJobRuns_45onTypeBooleanEClass == null) {
			normalJobRuns_45onTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(596);
		}
		return normalJobRuns_45onTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onTypeBoolean_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onTypeObject() {
		if (normalJobRuns_45onTypeObjectEClass == null) {
			normalJobRuns_45onTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(597);
		}
		return normalJobRuns_45onTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onTypeObject_Runs_45on() {
        return (EReference)getNormalJobRuns_45onTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onTypeObject__Get__String() {
        return getNormalJobRuns_45onTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onPropertiesAbstract() {
		if (normalJobRuns_45onPropertiesAbstractEClass == null) {
			normalJobRuns_45onPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(598);
		}
		return normalJobRuns_45onPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onAdditionalProperties() {
		if (normalJobRuns_45onAdditionalPropertiesEClass == null) {
			normalJobRuns_45onAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(599);
		}
		return normalJobRuns_45onAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onAdditionalProperties_Key() {
        return (EAttribute)getNormalJobRuns_45onAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onAdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobRuns_45onAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobRuns_45onAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobRuns_45onAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onTypeArray() {
		if (normalJobRuns_45onTypeArrayEClass == null) {
			normalJobRuns_45onTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(600);
		}
		return normalJobRuns_45onTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onTypeArray_Runs_45on() {
        return (EReference)getNormalJobRuns_45onTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onItems() {
		if (normalJobRuns_45onItemsEClass == null) {
			normalJobRuns_45onItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(601);
		}
		return normalJobRuns_45onItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onItems_Items() {
        return (EReference)getNormalJobRuns_45onItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onTypeNull() {
		if (normalJobRuns_45onTypeNullEClass == null) {
			normalJobRuns_45onTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(602);
		}
		return normalJobRuns_45onTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onTypeNull_Runs_45on() {
        return (EReference)getNormalJobRuns_45onTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1Items() {
		if (normalJobRuns_45onOneOf1ItemsEClass == null) {
			normalJobRuns_45onOneOf1ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(603);
		}
		return normalJobRuns_45onOneOf1ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1Items_Items() {
        return (EReference)getNormalJobRuns_45onOneOf1Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf0Abstract() {
		if (normalJobRuns_45onOneOf1AnyOf0AbstractEClass == null) {
			normalJobRuns_45onOneOf1AnyOf0AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(604);
		}
		return normalJobRuns_45onOneOf1AnyOf0AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf0TypeString() {
		if (normalJobRuns_45onOneOf1AnyOf0TypeStringEClass == null) {
			normalJobRuns_45onOneOf1AnyOf0TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(605);
		}
		return normalJobRuns_45onOneOf1AnyOf0TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf0TypeString_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf0TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf0TypeInteger() {
		if (normalJobRuns_45onOneOf1AnyOf0TypeIntegerEClass == null) {
			normalJobRuns_45onOneOf1AnyOf0TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(606);
		}
		return normalJobRuns_45onOneOf1AnyOf0TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf0TypeInteger_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf0TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf0TypeNumber() {
		if (normalJobRuns_45onOneOf1AnyOf0TypeNumberEClass == null) {
			normalJobRuns_45onOneOf1AnyOf0TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(607);
		}
		return normalJobRuns_45onOneOf1AnyOf0TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf0TypeNumber_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf0TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf0TypeBoolean() {
		if (normalJobRuns_45onOneOf1AnyOf0TypeBooleanEClass == null) {
			normalJobRuns_45onOneOf1AnyOf0TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(608);
		}
		return normalJobRuns_45onOneOf1AnyOf0TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf0TypeBoolean_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf0TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf0TypeObject() {
		if (normalJobRuns_45onOneOf1AnyOf0TypeObjectEClass == null) {
			normalJobRuns_45onOneOf1AnyOf0TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(609);
		}
		return normalJobRuns_45onOneOf1AnyOf0TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf0TypeObject_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf0TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf0TypeObject__Get__String() {
        return getNormalJobRuns_45onOneOf1AnyOf0TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf0PropertiesAbstract() {
		if (normalJobRuns_45onOneOf1AnyOf0PropertiesAbstractEClass == null) {
			normalJobRuns_45onOneOf1AnyOf0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(610);
		}
		return normalJobRuns_45onOneOf1AnyOf0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties() {
		if (normalJobRuns_45onOneOf1AnyOf0AdditionalPropertiesEClass == null) {
			normalJobRuns_45onOneOf1AnyOf0AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(611);
		}
		return normalJobRuns_45onOneOf1AnyOf0AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties_Key() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobRuns_45onOneOf1AnyOf0AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf0TypeArray() {
		if (normalJobRuns_45onOneOf1AnyOf0TypeArrayEClass == null) {
			normalJobRuns_45onOneOf1AnyOf0TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(612);
		}
		return normalJobRuns_45onOneOf1AnyOf0TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf0TypeArray_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf0TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf0TypeNull() {
		if (normalJobRuns_45onOneOf1AnyOf0TypeNullEClass == null) {
			normalJobRuns_45onOneOf1AnyOf0TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(613);
		}
		return normalJobRuns_45onOneOf1AnyOf0TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf0TypeNull_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf0TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1Abstract() {
		if (normalJobRuns_45onOneOf1AnyOf1AbstractEClass == null) {
			normalJobRuns_45onOneOf1AnyOf1AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(614);
		}
		return normalJobRuns_45onOneOf1AnyOf1AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1TypeString() {
		if (normalJobRuns_45onOneOf1AnyOf1TypeStringEClass == null) {
			normalJobRuns_45onOneOf1AnyOf1TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(615);
		}
		return normalJobRuns_45onOneOf1AnyOf1TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf1TypeString_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf1TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1TypeInteger() {
		if (normalJobRuns_45onOneOf1AnyOf1TypeIntegerEClass == null) {
			normalJobRuns_45onOneOf1AnyOf1TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(616);
		}
		return normalJobRuns_45onOneOf1AnyOf1TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf1TypeInteger_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf1TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1TypeNumber() {
		if (normalJobRuns_45onOneOf1AnyOf1TypeNumberEClass == null) {
			normalJobRuns_45onOneOf1AnyOf1TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(617);
		}
		return normalJobRuns_45onOneOf1AnyOf1TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf1TypeNumber_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf1TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1TypeBoolean() {
		if (normalJobRuns_45onOneOf1AnyOf1TypeBooleanEClass == null) {
			normalJobRuns_45onOneOf1AnyOf1TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(618);
		}
		return normalJobRuns_45onOneOf1AnyOf1TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf1TypeBoolean_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf1TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1TypeObject() {
		if (normalJobRuns_45onOneOf1AnyOf1TypeObjectEClass == null) {
			normalJobRuns_45onOneOf1AnyOf1TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(619);
		}
		return normalJobRuns_45onOneOf1AnyOf1TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf1TypeObject_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf1TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf1TypeObject__Get__String() {
        return getNormalJobRuns_45onOneOf1AnyOf1TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1PropertiesAbstract() {
		if (normalJobRuns_45onOneOf1AnyOf1PropertiesAbstractEClass == null) {
			normalJobRuns_45onOneOf1AnyOf1PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(620);
		}
		return normalJobRuns_45onOneOf1AnyOf1PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties() {
		if (normalJobRuns_45onOneOf1AnyOf1AdditionalPropertiesEClass == null) {
			normalJobRuns_45onOneOf1AnyOf1AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(621);
		}
		return normalJobRuns_45onOneOf1AnyOf1AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties_Key() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobRuns_45onOneOf1AnyOf1AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1TypeArray() {
		if (normalJobRuns_45onOneOf1AnyOf1TypeArrayEClass == null) {
			normalJobRuns_45onOneOf1AnyOf1TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(622);
		}
		return normalJobRuns_45onOneOf1AnyOf1TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf1TypeArray_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf1TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf1TypeNull() {
		if (normalJobRuns_45onOneOf1AnyOf1TypeNullEClass == null) {
			normalJobRuns_45onOneOf1AnyOf1TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(623);
		}
		return normalJobRuns_45onOneOf1AnyOf1TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf1TypeNull_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf1TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2Abstract() {
		if (normalJobRuns_45onOneOf1AnyOf2AbstractEClass == null) {
			normalJobRuns_45onOneOf1AnyOf2AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(624);
		}
		return normalJobRuns_45onOneOf1AnyOf2AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2TypeString() {
		if (normalJobRuns_45onOneOf1AnyOf2TypeStringEClass == null) {
			normalJobRuns_45onOneOf1AnyOf2TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(625);
		}
		return normalJobRuns_45onOneOf1AnyOf2TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf2TypeString_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf2TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2TypeInteger() {
		if (normalJobRuns_45onOneOf1AnyOf2TypeIntegerEClass == null) {
			normalJobRuns_45onOneOf1AnyOf2TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(626);
		}
		return normalJobRuns_45onOneOf1AnyOf2TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf2TypeInteger_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf2TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2TypeNumber() {
		if (normalJobRuns_45onOneOf1AnyOf2TypeNumberEClass == null) {
			normalJobRuns_45onOneOf1AnyOf2TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(627);
		}
		return normalJobRuns_45onOneOf1AnyOf2TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf2TypeNumber_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf2TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2TypeBoolean() {
		if (normalJobRuns_45onOneOf1AnyOf2TypeBooleanEClass == null) {
			normalJobRuns_45onOneOf1AnyOf2TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(628);
		}
		return normalJobRuns_45onOneOf1AnyOf2TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf2TypeBoolean_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf2TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2TypeObject() {
		if (normalJobRuns_45onOneOf1AnyOf2TypeObjectEClass == null) {
			normalJobRuns_45onOneOf1AnyOf2TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(629);
		}
		return normalJobRuns_45onOneOf1AnyOf2TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf2TypeObject_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf2TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf2TypeObject__Get__String() {
        return getNormalJobRuns_45onOneOf1AnyOf2TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2PropertiesAbstract() {
		if (normalJobRuns_45onOneOf1AnyOf2PropertiesAbstractEClass == null) {
			normalJobRuns_45onOneOf1AnyOf2PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(630);
		}
		return normalJobRuns_45onOneOf1AnyOf2PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties() {
		if (normalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesEClass == null) {
			normalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(631);
		}
		return normalJobRuns_45onOneOf1AnyOf2AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties_Key() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobRuns_45onOneOf1AnyOf2AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2TypeArray() {
		if (normalJobRuns_45onOneOf1AnyOf2TypeArrayEClass == null) {
			normalJobRuns_45onOneOf1AnyOf2TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(632);
		}
		return normalJobRuns_45onOneOf1AnyOf2TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf2TypeArray_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf2TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf2TypeNull() {
		if (normalJobRuns_45onOneOf1AnyOf2TypeNullEClass == null) {
			normalJobRuns_45onOneOf1AnyOf2TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(633);
		}
		return normalJobRuns_45onOneOf1AnyOf2TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf2TypeNull_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf2TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3Abstract() {
		if (normalJobRuns_45onOneOf1AnyOf3AbstractEClass == null) {
			normalJobRuns_45onOneOf1AnyOf3AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(634);
		}
		return normalJobRuns_45onOneOf1AnyOf3AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3TypeString() {
		if (normalJobRuns_45onOneOf1AnyOf3TypeStringEClass == null) {
			normalJobRuns_45onOneOf1AnyOf3TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(635);
		}
		return normalJobRuns_45onOneOf1AnyOf3TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf3TypeString_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf3TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3TypeInteger() {
		if (normalJobRuns_45onOneOf1AnyOf3TypeIntegerEClass == null) {
			normalJobRuns_45onOneOf1AnyOf3TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(636);
		}
		return normalJobRuns_45onOneOf1AnyOf3TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf3TypeInteger_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf3TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3TypeNumber() {
		if (normalJobRuns_45onOneOf1AnyOf3TypeNumberEClass == null) {
			normalJobRuns_45onOneOf1AnyOf3TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(637);
		}
		return normalJobRuns_45onOneOf1AnyOf3TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf3TypeNumber_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf3TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3TypeBoolean() {
		if (normalJobRuns_45onOneOf1AnyOf3TypeBooleanEClass == null) {
			normalJobRuns_45onOneOf1AnyOf3TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(638);
		}
		return normalJobRuns_45onOneOf1AnyOf3TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf3TypeBoolean_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf3TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3TypeObject() {
		if (normalJobRuns_45onOneOf1AnyOf3TypeObjectEClass == null) {
			normalJobRuns_45onOneOf1AnyOf3TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(639);
		}
		return normalJobRuns_45onOneOf1AnyOf3TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf3TypeObject_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf3TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf3TypeObject__Get__String() {
        return getNormalJobRuns_45onOneOf1AnyOf3TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3PropertiesAbstract() {
		if (normalJobRuns_45onOneOf1AnyOf3PropertiesAbstractEClass == null) {
			normalJobRuns_45onOneOf1AnyOf3PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(640);
		}
		return normalJobRuns_45onOneOf1AnyOf3PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3AdditionalProperties() {
		if (normalJobRuns_45onOneOf1AnyOf3AdditionalPropertiesEClass == null) {
			normalJobRuns_45onOneOf1AnyOf3AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(641);
		}
		return normalJobRuns_45onOneOf1AnyOf3AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf3AdditionalProperties_Key() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf3AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf3AdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf3AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf3AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobRuns_45onOneOf1AnyOf3AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf3AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobRuns_45onOneOf1AnyOf3AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3TypeArray() {
		if (normalJobRuns_45onOneOf1AnyOf3TypeArrayEClass == null) {
			normalJobRuns_45onOneOf1AnyOf3TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(642);
		}
		return normalJobRuns_45onOneOf1AnyOf3TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf3TypeArray_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf3TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf3TypeNull() {
		if (normalJobRuns_45onOneOf1AnyOf3TypeNullEClass == null) {
			normalJobRuns_45onOneOf1AnyOf3TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(643);
		}
		return normalJobRuns_45onOneOf1AnyOf3TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf3TypeNull_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf3TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4Abstract() {
		if (normalJobRuns_45onOneOf1AnyOf4AbstractEClass == null) {
			normalJobRuns_45onOneOf1AnyOf4AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(644);
		}
		return normalJobRuns_45onOneOf1AnyOf4AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4TypeString() {
		if (normalJobRuns_45onOneOf1AnyOf4TypeStringEClass == null) {
			normalJobRuns_45onOneOf1AnyOf4TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(645);
		}
		return normalJobRuns_45onOneOf1AnyOf4TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf4TypeString_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf4TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4TypeInteger() {
		if (normalJobRuns_45onOneOf1AnyOf4TypeIntegerEClass == null) {
			normalJobRuns_45onOneOf1AnyOf4TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(646);
		}
		return normalJobRuns_45onOneOf1AnyOf4TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf4TypeInteger_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf4TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4TypeNumber() {
		if (normalJobRuns_45onOneOf1AnyOf4TypeNumberEClass == null) {
			normalJobRuns_45onOneOf1AnyOf4TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(647);
		}
		return normalJobRuns_45onOneOf1AnyOf4TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf4TypeNumber_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf4TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4TypeBoolean() {
		if (normalJobRuns_45onOneOf1AnyOf4TypeBooleanEClass == null) {
			normalJobRuns_45onOneOf1AnyOf4TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(648);
		}
		return normalJobRuns_45onOneOf1AnyOf4TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf4TypeBoolean_Runs_45on() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf4TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4TypeObject() {
		if (normalJobRuns_45onOneOf1AnyOf4TypeObjectEClass == null) {
			normalJobRuns_45onOneOf1AnyOf4TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(649);
		}
		return normalJobRuns_45onOneOf1AnyOf4TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf4TypeObject_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf4TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf4TypeObject__Get__String() {
        return getNormalJobRuns_45onOneOf1AnyOf4TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4PropertiesAbstract() {
		if (normalJobRuns_45onOneOf1AnyOf4PropertiesAbstractEClass == null) {
			normalJobRuns_45onOneOf1AnyOf4PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(650);
		}
		return normalJobRuns_45onOneOf1AnyOf4PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4AdditionalProperties() {
		if (normalJobRuns_45onOneOf1AnyOf4AdditionalPropertiesEClass == null) {
			normalJobRuns_45onOneOf1AnyOf4AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(651);
		}
		return normalJobRuns_45onOneOf1AnyOf4AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobRuns_45onOneOf1AnyOf4AdditionalProperties_Key() {
        return (EAttribute)getNormalJobRuns_45onOneOf1AnyOf4AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf4AdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf4AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf4AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobRuns_45onOneOf1AnyOf4AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobRuns_45onOneOf1AnyOf4AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobRuns_45onOneOf1AnyOf4AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4TypeArray() {
		if (normalJobRuns_45onOneOf1AnyOf4TypeArrayEClass == null) {
			normalJobRuns_45onOneOf1AnyOf4TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(652);
		}
		return normalJobRuns_45onOneOf1AnyOf4TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf4TypeArray_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf4TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobRuns_45onOneOf1AnyOf4TypeNull() {
		if (normalJobRuns_45onOneOf1AnyOf4TypeNullEClass == null) {
			normalJobRuns_45onOneOf1AnyOf4TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(653);
		}
		return normalJobRuns_45onOneOf1AnyOf4TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobRuns_45onOneOf1AnyOf4TypeNull_Runs_45on() {
        return (EReference)getNormalJobRuns_45onOneOf1AnyOf4TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnvironmentAbstract() {
		if (normalJobEnvironmentAbstractEClass == null) {
			normalJobEnvironmentAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(654);
		}
		return normalJobEnvironmentAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnvironmentTypeString() {
		if (normalJobEnvironmentTypeStringEClass == null) {
			normalJobEnvironmentTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(655);
		}
		return normalJobEnvironmentTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobEnvironmentTypeString_Environment() {
        return (EAttribute)getNormalJobEnvironmentTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnvironmentTypeInteger() {
		if (normalJobEnvironmentTypeIntegerEClass == null) {
			normalJobEnvironmentTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(656);
		}
		return normalJobEnvironmentTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobEnvironmentTypeInteger_Environment() {
        return (EAttribute)getNormalJobEnvironmentTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnvironmentTypeNumber() {
		if (normalJobEnvironmentTypeNumberEClass == null) {
			normalJobEnvironmentTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(657);
		}
		return normalJobEnvironmentTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobEnvironmentTypeNumber_Environment() {
        return (EAttribute)getNormalJobEnvironmentTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnvironmentTypeBoolean() {
		if (normalJobEnvironmentTypeBooleanEClass == null) {
			normalJobEnvironmentTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(658);
		}
		return normalJobEnvironmentTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobEnvironmentTypeBoolean_Environment() {
        return (EAttribute)getNormalJobEnvironmentTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnvironmentTypeObject() {
		if (normalJobEnvironmentTypeObjectEClass == null) {
			normalJobEnvironmentTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(659);
		}
		return normalJobEnvironmentTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobEnvironmentTypeObject_Environment() {
        return (EReference)getNormalJobEnvironmentTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobEnvironmentTypeObject__Get__String() {
        return getNormalJobEnvironmentTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnvironmentPropertiesAbstract() {
		if (normalJobEnvironmentPropertiesAbstractEClass == null) {
			normalJobEnvironmentPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(660);
		}
		return normalJobEnvironmentPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnvironmentAdditionalProperties() {
		if (normalJobEnvironmentAdditionalPropertiesEClass == null) {
			normalJobEnvironmentAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(661);
		}
		return normalJobEnvironmentAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobEnvironmentAdditionalProperties_Key() {
        return (EAttribute)getNormalJobEnvironmentAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobEnvironmentAdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobEnvironmentAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobEnvironmentAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobEnvironmentAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobEnvironmentAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobEnvironmentAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnvironmentTypeArray() {
		if (normalJobEnvironmentTypeArrayEClass == null) {
			normalJobEnvironmentTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(662);
		}
		return normalJobEnvironmentTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobEnvironmentTypeArray_Environment() {
        return (EReference)getNormalJobEnvironmentTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnvironmentItems() {
		if (normalJobEnvironmentItemsEClass == null) {
			normalJobEnvironmentItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(663);
		}
		return normalJobEnvironmentItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobEnvironmentItems_Items() {
        return (EReference)getNormalJobEnvironmentItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobEnvironmentTypeNull() {
		if (normalJobEnvironmentTypeNullEClass == null) {
			normalJobEnvironmentTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(664);
		}
		return normalJobEnvironmentTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobEnvironmentTypeNull_Environment() {
        return (EReference)getNormalJobEnvironmentTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobOutputsPropertiesAbstract() {
		if (normalJobOutputsPropertiesAbstractEClass == null) {
			normalJobOutputsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(665);
		}
		return normalJobOutputsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobIfAbstract() {
		if (normalJobIfAbstractEClass == null) {
			normalJobIfAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(666);
		}
		return normalJobIfAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobIfTypeBoolean() {
		if (normalJobIfTypeBooleanEClass == null) {
			normalJobIfTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(667);
		}
		return normalJobIfTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobIfTypeBoolean_If_() {
        return (EAttribute)getNormalJobIfTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobIfTypeNumber() {
		if (normalJobIfTypeNumberEClass == null) {
			normalJobIfTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(668);
		}
		return normalJobIfTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobIfTypeNumber_If_() {
        return (EAttribute)getNormalJobIfTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobIfTypeString() {
		if (normalJobIfTypeStringEClass == null) {
			normalJobIfTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(669);
		}
		return normalJobIfTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobIfTypeString_If_() {
        return (EAttribute)getNormalJobIfTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAbstract() {
		if (normalJobStepsItemsAbstractEClass == null) {
			normalJobStepsItemsAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(670);
		}
		return normalJobStepsItemsAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsTypeString() {
		if (normalJobStepsItemsTypeStringEClass == null) {
			normalJobStepsItemsTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(671);
		}
		return normalJobStepsItemsTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsTypeString_Items() {
        return (EAttribute)getNormalJobStepsItemsTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsTypeInteger() {
		if (normalJobStepsItemsTypeIntegerEClass == null) {
			normalJobStepsItemsTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(672);
		}
		return normalJobStepsItemsTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsTypeInteger_Items() {
        return (EAttribute)getNormalJobStepsItemsTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsTypeNumber() {
		if (normalJobStepsItemsTypeNumberEClass == null) {
			normalJobStepsItemsTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(673);
		}
		return normalJobStepsItemsTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsTypeNumber_Items() {
        return (EAttribute)getNormalJobStepsItemsTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsTypeBoolean() {
		if (normalJobStepsItemsTypeBooleanEClass == null) {
			normalJobStepsItemsTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(674);
		}
		return normalJobStepsItemsTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsTypeBoolean_Items() {
        return (EAttribute)getNormalJobStepsItemsTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsTypeObject() {
		if (normalJobStepsItemsTypeObjectEClass == null) {
			normalJobStepsItemsTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(675);
		}
		return normalJobStepsItemsTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsTypeObject_Items() {
        return (EReference)getNormalJobStepsItemsTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsTypeObject__Get__String() {
        return getNormalJobStepsItemsTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsPropertiesAbstract() {
		if (normalJobStepsItemsPropertiesAbstractEClass == null) {
			normalJobStepsItemsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(676);
		}
		return normalJobStepsItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAdditionalProperties() {
		if (normalJobStepsItemsAdditionalPropertiesEClass == null) {
			normalJobStepsItemsAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(677);
		}
		return normalJobStepsItemsAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAdditionalProperties_Key() {
        return (EAttribute)getNormalJobStepsItemsAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobStepsItemsAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobStepsItemsAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobStepsItemsAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsTypeArray() {
		if (normalJobStepsItemsTypeArrayEClass == null) {
			normalJobStepsItemsTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(678);
		}
		return normalJobStepsItemsTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsTypeArray_Items() {
        return (EReference)getNormalJobStepsItemsTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsItems() {
		if (normalJobStepsItemsItemsEClass == null) {
			normalJobStepsItemsItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(679);
		}
		return normalJobStepsItemsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsItems_Items() {
        return (EReference)getNormalJobStepsItemsItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsTypeNull() {
		if (normalJobStepsItemsTypeNullEClass == null) {
			normalJobStepsItemsTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(680);
		}
		return normalJobStepsItemsTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsTypeNull_Items() {
        return (EReference)getNormalJobStepsItemsTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0Abstract() {
		if (normalJobStepsItemsAllOf0AbstractEClass == null) {
			normalJobStepsItemsAllOf0AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(681);
		}
		return normalJobStepsItemsAllOf0AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0TypeString() {
		if (normalJobStepsItemsAllOf0TypeStringEClass == null) {
			normalJobStepsItemsAllOf0TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(682);
		}
		return normalJobStepsItemsAllOf0TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf0TypeString_Items() {
        return (EAttribute)getNormalJobStepsItemsAllOf0TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0TypeInteger() {
		if (normalJobStepsItemsAllOf0TypeIntegerEClass == null) {
			normalJobStepsItemsAllOf0TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(683);
		}
		return normalJobStepsItemsAllOf0TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf0TypeInteger_Items() {
        return (EAttribute)getNormalJobStepsItemsAllOf0TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0TypeNumber() {
		if (normalJobStepsItemsAllOf0TypeNumberEClass == null) {
			normalJobStepsItemsAllOf0TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(684);
		}
		return normalJobStepsItemsAllOf0TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf0TypeNumber_Items() {
        return (EAttribute)getNormalJobStepsItemsAllOf0TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0TypeBoolean() {
		if (normalJobStepsItemsAllOf0TypeBooleanEClass == null) {
			normalJobStepsItemsAllOf0TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(685);
		}
		return normalJobStepsItemsAllOf0TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf0TypeBoolean_Items() {
        return (EAttribute)getNormalJobStepsItemsAllOf0TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0TypeObject() {
		if (normalJobStepsItemsAllOf0TypeObjectEClass == null) {
			normalJobStepsItemsAllOf0TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(686);
		}
		return normalJobStepsItemsAllOf0TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf0TypeObject_Items() {
        return (EReference)getNormalJobStepsItemsAllOf0TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAllOf0TypeObject__Get__String() {
        return getNormalJobStepsItemsAllOf0TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0PropertiesAbstract() {
		if (normalJobStepsItemsAllOf0PropertiesAbstractEClass == null) {
			normalJobStepsItemsAllOf0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(687);
		}
		return normalJobStepsItemsAllOf0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0AdditionalProperties() {
		if (normalJobStepsItemsAllOf0AdditionalPropertiesEClass == null) {
			normalJobStepsItemsAllOf0AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(688);
		}
		return normalJobStepsItemsAllOf0AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf0AdditionalProperties_Key() {
        return (EAttribute)getNormalJobStepsItemsAllOf0AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf0AdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobStepsItemsAllOf0AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAllOf0AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobStepsItemsAllOf0AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAllOf0AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobStepsItemsAllOf0AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0TypeArray() {
		if (normalJobStepsItemsAllOf0TypeArrayEClass == null) {
			normalJobStepsItemsAllOf0TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(689);
		}
		return normalJobStepsItemsAllOf0TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf0TypeArray_Items() {
        return (EReference)getNormalJobStepsItemsAllOf0TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0Items() {
		if (normalJobStepsItemsAllOf0ItemsEClass == null) {
			normalJobStepsItemsAllOf0ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(690);
		}
		return normalJobStepsItemsAllOf0ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf0Items_Items() {
        return (EReference)getNormalJobStepsItemsAllOf0Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0TypeNull() {
		if (normalJobStepsItemsAllOf0TypeNullEClass == null) {
			normalJobStepsItemsAllOf0TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(691);
		}
		return normalJobStepsItemsAllOf0TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf0TypeNull_Items() {
        return (EReference)getNormalJobStepsItemsAllOf0TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0OneOf0PropertiesAbstract() {
		if (normalJobStepsItemsAllOf0OneOf0PropertiesAbstractEClass == null) {
			normalJobStepsItemsAllOf0OneOf0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(692);
		}
		return normalJobStepsItemsAllOf0OneOf0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0OneOf0AdditionalProperties() {
		if (normalJobStepsItemsAllOf0OneOf0AdditionalPropertiesEClass == null) {
			normalJobStepsItemsAllOf0OneOf0AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(693);
		}
		return normalJobStepsItemsAllOf0OneOf0AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf0OneOf0AdditionalProperties_Key() {
        return (EAttribute)getNormalJobStepsItemsAllOf0OneOf0AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf0OneOf0AdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobStepsItemsAllOf0OneOf0AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAllOf0OneOf0AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobStepsItemsAllOf0OneOf0AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAllOf0OneOf0AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobStepsItemsAllOf0OneOf0AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0OneOf1PropertiesAbstract() {
		if (normalJobStepsItemsAllOf0OneOf1PropertiesAbstractEClass == null) {
			normalJobStepsItemsAllOf0OneOf1PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(694);
		}
		return normalJobStepsItemsAllOf0OneOf1PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf0OneOf1AdditionalProperties() {
		if (normalJobStepsItemsAllOf0OneOf1AdditionalPropertiesEClass == null) {
			normalJobStepsItemsAllOf0OneOf1AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(695);
		}
		return normalJobStepsItemsAllOf0OneOf1AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf0OneOf1AdditionalProperties_Key() {
        return (EAttribute)getNormalJobStepsItemsAllOf0OneOf1AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf0OneOf1AdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobStepsItemsAllOf0OneOf1AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAllOf0OneOf1AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobStepsItemsAllOf0OneOf1AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAllOf0OneOf1AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobStepsItemsAllOf0OneOf1AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1PropertiesAbstract() {
		if (normalJobStepsItemsAllOf1PropertiesAbstractEClass == null) {
			normalJobStepsItemsAllOf1PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(696);
		}
		return normalJobStepsItemsAllOf1PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1IfAbstract() {
		if (normalJobStepsItemsAllOf1IfAbstractEClass == null) {
			normalJobStepsItemsAllOf1IfAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(697);
		}
		return normalJobStepsItemsAllOf1IfAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1IfTypeBoolean() {
		if (normalJobStepsItemsAllOf1IfTypeBooleanEClass == null) {
			normalJobStepsItemsAllOf1IfTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(698);
		}
		return normalJobStepsItemsAllOf1IfTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1IfTypeBoolean_If_() {
        return (EAttribute)getNormalJobStepsItemsAllOf1IfTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1IfTypeNumber() {
		if (normalJobStepsItemsAllOf1IfTypeNumberEClass == null) {
			normalJobStepsItemsAllOf1IfTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(699);
		}
		return normalJobStepsItemsAllOf1IfTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1IfTypeNumber_If_() {
        return (EAttribute)getNormalJobStepsItemsAllOf1IfTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1IfTypeString() {
		if (normalJobStepsItemsAllOf1IfTypeStringEClass == null) {
			normalJobStepsItemsAllOf1IfTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(700);
		}
		return normalJobStepsItemsAllOf1IfTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1IfTypeString_If_() {
        return (EAttribute)getNormalJobStepsItemsAllOf1IfTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Continue_45on_45errorAbstract() {
		if (normalJobStepsItemsAllOf1Continue_45on_45errorAbstractEClass == null) {
			normalJobStepsItemsAllOf1Continue_45on_45errorAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(701);
		}
		return normalJobStepsItemsAllOf1Continue_45on_45errorAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString() {
		if (normalJobStepsItemsAllOf1Continue_45on_45errorTypeStringEClass == null) {
			normalJobStepsItemsAllOf1Continue_45on_45errorTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(702);
		}
		return normalJobStepsItemsAllOf1Continue_45on_45errorTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString_Continue_45on_45error() {
        return (EAttribute)getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger() {
		if (normalJobStepsItemsAllOf1Continue_45on_45errorTypeIntegerEClass == null) {
			normalJobStepsItemsAllOf1Continue_45on_45errorTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(703);
		}
		return normalJobStepsItemsAllOf1Continue_45on_45errorTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger_Continue_45on_45error() {
        return (EAttribute)getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber() {
		if (normalJobStepsItemsAllOf1Continue_45on_45errorTypeNumberEClass == null) {
			normalJobStepsItemsAllOf1Continue_45on_45errorTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(704);
		}
		return normalJobStepsItemsAllOf1Continue_45on_45errorTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber_Continue_45on_45error() {
        return (EAttribute)getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean() {
		if (normalJobStepsItemsAllOf1Continue_45on_45errorTypeBooleanEClass == null) {
			normalJobStepsItemsAllOf1Continue_45on_45errorTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(705);
		}
		return normalJobStepsItemsAllOf1Continue_45on_45errorTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean_Continue_45on_45error() {
        return (EAttribute)getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject() {
		if (normalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectEClass == null) {
			normalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(706);
		}
		return normalJobStepsItemsAllOf1Continue_45on_45errorTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject_Continue_45on_45error() {
        return (EReference)getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject__Get__String() {
        return getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstract() {
		if (normalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstractEClass == null) {
			normalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(707);
		}
		return normalJobStepsItemsAllOf1Continue_45on_45errorPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties() {
		if (normalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesEClass == null) {
			normalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(708);
		}
		return normalJobStepsItemsAllOf1Continue_45on_45errorAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties_Key() {
        return (EAttribute)getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobStepsItemsAllOf1Continue_45on_45errorAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray() {
		if (normalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayEClass == null) {
			normalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(709);
		}
		return normalJobStepsItemsAllOf1Continue_45on_45errorTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray_Continue_45on_45error() {
        return (EReference)getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Continue_45on_45errorItems() {
		if (normalJobStepsItemsAllOf1Continue_45on_45errorItemsEClass == null) {
			normalJobStepsItemsAllOf1Continue_45on_45errorItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(710);
		}
		return normalJobStepsItemsAllOf1Continue_45on_45errorItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1Continue_45on_45errorItems_Items() {
        return (EReference)getNormalJobStepsItemsAllOf1Continue_45on_45errorItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull() {
		if (normalJobStepsItemsAllOf1Continue_45on_45errorTypeNullEClass == null) {
			normalJobStepsItemsAllOf1Continue_45on_45errorTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(711);
		}
		return normalJobStepsItemsAllOf1Continue_45on_45errorTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull_Continue_45on_45error() {
        return (EReference)getNormalJobStepsItemsAllOf1Continue_45on_45errorTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyPropertiesAbstract() {
		if (normalJobStrategyPropertiesAbstractEClass == null) {
			normalJobStrategyPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(712);
		}
		return normalJobStrategyPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAbstract() {
		if (normalJobStrategyMatrixAbstractEClass == null) {
			normalJobStrategyMatrixAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(713);
		}
		return normalJobStrategyMatrixAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixTypeString() {
		if (normalJobStrategyMatrixTypeStringEClass == null) {
			normalJobStrategyMatrixTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(714);
		}
		return normalJobStrategyMatrixTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyMatrixTypeString_Matrix() {
        return (EAttribute)getNormalJobStrategyMatrixTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixTypeInteger() {
		if (normalJobStrategyMatrixTypeIntegerEClass == null) {
			normalJobStrategyMatrixTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(715);
		}
		return normalJobStrategyMatrixTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyMatrixTypeInteger_Matrix() {
        return (EAttribute)getNormalJobStrategyMatrixTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixTypeNumber() {
		if (normalJobStrategyMatrixTypeNumberEClass == null) {
			normalJobStrategyMatrixTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(716);
		}
		return normalJobStrategyMatrixTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyMatrixTypeNumber_Matrix() {
        return (EAttribute)getNormalJobStrategyMatrixTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixTypeBoolean() {
		if (normalJobStrategyMatrixTypeBooleanEClass == null) {
			normalJobStrategyMatrixTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(717);
		}
		return normalJobStrategyMatrixTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyMatrixTypeBoolean_Matrix() {
        return (EAttribute)getNormalJobStrategyMatrixTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixTypeObject() {
		if (normalJobStrategyMatrixTypeObjectEClass == null) {
			normalJobStrategyMatrixTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(718);
		}
		return normalJobStrategyMatrixTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixTypeObject_Matrix() {
        return (EReference)getNormalJobStrategyMatrixTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixTypeObject__Get__String() {
        return getNormalJobStrategyMatrixTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixPropertiesAbstract() {
		if (normalJobStrategyMatrixPropertiesAbstractEClass == null) {
			normalJobStrategyMatrixPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(719);
		}
		return normalJobStrategyMatrixPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixTypeArray() {
		if (normalJobStrategyMatrixTypeArrayEClass == null) {
			normalJobStrategyMatrixTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(720);
		}
		return normalJobStrategyMatrixTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixTypeArray_Matrix() {
        return (EReference)getNormalJobStrategyMatrixTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixItems() {
		if (normalJobStrategyMatrixItemsEClass == null) {
			normalJobStrategyMatrixItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(721);
		}
		return normalJobStrategyMatrixItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixItems_Items() {
        return (EReference)getNormalJobStrategyMatrixItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixTypeNull() {
		if (normalJobStrategyMatrixTypeNullEClass == null) {
			normalJobStrategyMatrixTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(722);
		}
		return normalJobStrategyMatrixTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixTypeNull_Matrix() {
        return (EReference)getNormalJobStrategyMatrixTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixOneOf0PropertiesAbstract() {
		if (normalJobStrategyMatrixOneOf0PropertiesAbstractEClass == null) {
			normalJobStrategyMatrixOneOf0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(723);
		}
		return normalJobStrategyMatrixOneOf0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixOneOf0AdditionalProperties() {
		if (normalJobStrategyMatrixOneOf0AdditionalPropertiesEClass == null) {
			normalJobStrategyMatrixOneOf0AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(724);
		}
		return normalJobStrategyMatrixOneOf0AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyMatrixOneOf0AdditionalProperties_Key() {
        return (EAttribute)getNormalJobStrategyMatrixOneOf0AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixOneOf0AdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobStrategyMatrixOneOf0AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixOneOf0AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobStrategyMatrixOneOf0AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixOneOf0AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobStrategyMatrixOneOf0AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixPatternProperties0ItemsPropertiesAbstract() {
		if (normalJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractEClass == null) {
			normalJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(725);
		}
		return normalJobStrategyMatrixPatternProperties0ItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalPropertiesAbstract() {
		if (normalJobStrategyMatrixAdditionalPropertiesAbstractEClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(726);
		}
		return normalJobStrategyMatrixAdditionalPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalPropertiesTypeString() {
		if (normalJobStrategyMatrixAdditionalPropertiesTypeStringEClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(727);
		}
		return normalJobStrategyMatrixAdditionalPropertiesTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyMatrixAdditionalPropertiesTypeString_AdditionalProperties() {
        return (EAttribute)getNormalJobStrategyMatrixAdditionalPropertiesTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalPropertiesTypeInteger() {
		if (normalJobStrategyMatrixAdditionalPropertiesTypeIntegerEClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(728);
		}
		return normalJobStrategyMatrixAdditionalPropertiesTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyMatrixAdditionalPropertiesTypeInteger_AdditionalProperties() {
        return (EAttribute)getNormalJobStrategyMatrixAdditionalPropertiesTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalPropertiesTypeNumber() {
		if (normalJobStrategyMatrixAdditionalPropertiesTypeNumberEClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(729);
		}
		return normalJobStrategyMatrixAdditionalPropertiesTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyMatrixAdditionalPropertiesTypeNumber_AdditionalProperties() {
        return (EAttribute)getNormalJobStrategyMatrixAdditionalPropertiesTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalPropertiesTypeBoolean() {
		if (normalJobStrategyMatrixAdditionalPropertiesTypeBooleanEClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(730);
		}
		return normalJobStrategyMatrixAdditionalPropertiesTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyMatrixAdditionalPropertiesTypeBoolean_AdditionalProperties() {
        return (EAttribute)getNormalJobStrategyMatrixAdditionalPropertiesTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalPropertiesTypeObject() {
		if (normalJobStrategyMatrixAdditionalPropertiesTypeObjectEClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(731);
		}
		return normalJobStrategyMatrixAdditionalPropertiesTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixAdditionalPropertiesTypeObject_AdditionalProperties() {
        return (EReference)getNormalJobStrategyMatrixAdditionalPropertiesTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixAdditionalPropertiesTypeObject__Get__String() {
        return getNormalJobStrategyMatrixAdditionalPropertiesTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalPropertiesPropertiesAbstract() {
		if (normalJobStrategyMatrixAdditionalPropertiesPropertiesAbstractEClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(732);
		}
		return normalJobStrategyMatrixAdditionalPropertiesPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties() {
		if (normalJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesEClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(733);
		}
		return normalJobStrategyMatrixAdditionalPropertiesAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties_Key() {
        return (EAttribute)getNormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobStrategyMatrixAdditionalPropertiesAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalPropertiesTypeArray() {
		if (normalJobStrategyMatrixAdditionalPropertiesTypeArrayEClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(734);
		}
		return normalJobStrategyMatrixAdditionalPropertiesTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixAdditionalPropertiesTypeArray_AdditionalProperties() {
        return (EReference)getNormalJobStrategyMatrixAdditionalPropertiesTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalPropertiesItems() {
		if (normalJobStrategyMatrixAdditionalPropertiesItemsEClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(735);
		}
		return normalJobStrategyMatrixAdditionalPropertiesItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixAdditionalPropertiesItems_Items() {
        return (EReference)getNormalJobStrategyMatrixAdditionalPropertiesItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobStrategyMatrixAdditionalPropertiesTypeNull() {
		if (normalJobStrategyMatrixAdditionalPropertiesTypeNullEClass == null) {
			normalJobStrategyMatrixAdditionalPropertiesTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(736);
		}
		return normalJobStrategyMatrixAdditionalPropertiesTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobStrategyMatrixAdditionalPropertiesTypeNull_AdditionalProperties() {
        return (EReference)getNormalJobStrategyMatrixAdditionalPropertiesTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContinue_45on_45errorAbstract() {
		if (normalJobContinue_45on_45errorAbstractEClass == null) {
			normalJobContinue_45on_45errorAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(737);
		}
		return normalJobContinue_45on_45errorAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContinue_45on_45errorTypeString() {
		if (normalJobContinue_45on_45errorTypeStringEClass == null) {
			normalJobContinue_45on_45errorTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(738);
		}
		return normalJobContinue_45on_45errorTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobContinue_45on_45errorTypeString_Continue_45on_45error() {
        return (EAttribute)getNormalJobContinue_45on_45errorTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContinue_45on_45errorTypeInteger() {
		if (normalJobContinue_45on_45errorTypeIntegerEClass == null) {
			normalJobContinue_45on_45errorTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(739);
		}
		return normalJobContinue_45on_45errorTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobContinue_45on_45errorTypeInteger_Continue_45on_45error() {
        return (EAttribute)getNormalJobContinue_45on_45errorTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContinue_45on_45errorTypeNumber() {
		if (normalJobContinue_45on_45errorTypeNumberEClass == null) {
			normalJobContinue_45on_45errorTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(740);
		}
		return normalJobContinue_45on_45errorTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobContinue_45on_45errorTypeNumber_Continue_45on_45error() {
        return (EAttribute)getNormalJobContinue_45on_45errorTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContinue_45on_45errorTypeBoolean() {
		if (normalJobContinue_45on_45errorTypeBooleanEClass == null) {
			normalJobContinue_45on_45errorTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(741);
		}
		return normalJobContinue_45on_45errorTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobContinue_45on_45errorTypeBoolean_Continue_45on_45error() {
        return (EAttribute)getNormalJobContinue_45on_45errorTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContinue_45on_45errorTypeObject() {
		if (normalJobContinue_45on_45errorTypeObjectEClass == null) {
			normalJobContinue_45on_45errorTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(742);
		}
		return normalJobContinue_45on_45errorTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobContinue_45on_45errorTypeObject_Continue_45on_45error() {
        return (EReference)getNormalJobContinue_45on_45errorTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobContinue_45on_45errorTypeObject__Get__String() {
        return getNormalJobContinue_45on_45errorTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContinue_45on_45errorPropertiesAbstract() {
		if (normalJobContinue_45on_45errorPropertiesAbstractEClass == null) {
			normalJobContinue_45on_45errorPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(743);
		}
		return normalJobContinue_45on_45errorPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContinue_45on_45errorAdditionalProperties() {
		if (normalJobContinue_45on_45errorAdditionalPropertiesEClass == null) {
			normalJobContinue_45on_45errorAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(744);
		}
		return normalJobContinue_45on_45errorAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobContinue_45on_45errorAdditionalProperties_Key() {
        return (EAttribute)getNormalJobContinue_45on_45errorAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobContinue_45on_45errorAdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobContinue_45on_45errorAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobContinue_45on_45errorAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobContinue_45on_45errorAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobContinue_45on_45errorAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobContinue_45on_45errorAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContinue_45on_45errorTypeArray() {
		if (normalJobContinue_45on_45errorTypeArrayEClass == null) {
			normalJobContinue_45on_45errorTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(745);
		}
		return normalJobContinue_45on_45errorTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobContinue_45on_45errorTypeArray_Continue_45on_45error() {
        return (EReference)getNormalJobContinue_45on_45errorTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContinue_45on_45errorItems() {
		if (normalJobContinue_45on_45errorItemsEClass == null) {
			normalJobContinue_45on_45errorItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(746);
		}
		return normalJobContinue_45on_45errorItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobContinue_45on_45errorItems_Items() {
        return (EReference)getNormalJobContinue_45on_45errorItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContinue_45on_45errorTypeNull() {
		if (normalJobContinue_45on_45errorTypeNullEClass == null) {
			normalJobContinue_45on_45errorTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(747);
		}
		return normalJobContinue_45on_45errorTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobContinue_45on_45errorTypeNull_Continue_45on_45error() {
        return (EReference)getNormalJobContinue_45on_45errorTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContainerAbstract() {
		if (normalJobContainerAbstractEClass == null) {
			normalJobContainerAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(748);
		}
		return normalJobContainerAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContainerTypeString() {
		if (normalJobContainerTypeStringEClass == null) {
			normalJobContainerTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(749);
		}
		return normalJobContainerTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobContainerTypeString_Container() {
        return (EAttribute)getNormalJobContainerTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContainerTypeInteger() {
		if (normalJobContainerTypeIntegerEClass == null) {
			normalJobContainerTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(750);
		}
		return normalJobContainerTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobContainerTypeInteger_Container() {
        return (EAttribute)getNormalJobContainerTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContainerTypeNumber() {
		if (normalJobContainerTypeNumberEClass == null) {
			normalJobContainerTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(751);
		}
		return normalJobContainerTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobContainerTypeNumber_Container() {
        return (EAttribute)getNormalJobContainerTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContainerTypeBoolean() {
		if (normalJobContainerTypeBooleanEClass == null) {
			normalJobContainerTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(752);
		}
		return normalJobContainerTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobContainerTypeBoolean_Container() {
        return (EAttribute)getNormalJobContainerTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContainerTypeObject() {
		if (normalJobContainerTypeObjectEClass == null) {
			normalJobContainerTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(753);
		}
		return normalJobContainerTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobContainerTypeObject_Container() {
        return (EReference)getNormalJobContainerTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobContainerTypeObject__Get__String() {
        return getNormalJobContainerTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContainerPropertiesAbstract() {
		if (normalJobContainerPropertiesAbstractEClass == null) {
			normalJobContainerPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(754);
		}
		return normalJobContainerPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContainerAdditionalProperties() {
		if (normalJobContainerAdditionalPropertiesEClass == null) {
			normalJobContainerAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(755);
		}
		return normalJobContainerAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobContainerAdditionalProperties_Key() {
        return (EAttribute)getNormalJobContainerAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobContainerAdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobContainerAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobContainerAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobContainerAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobContainerAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobContainerAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContainerTypeArray() {
		if (normalJobContainerTypeArrayEClass == null) {
			normalJobContainerTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(756);
		}
		return normalJobContainerTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobContainerTypeArray_Container() {
        return (EReference)getNormalJobContainerTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContainerItems() {
		if (normalJobContainerItemsEClass == null) {
			normalJobContainerItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(757);
		}
		return normalJobContainerItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobContainerItems_Items() {
        return (EReference)getNormalJobContainerItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobContainerTypeNull() {
		if (normalJobContainerTypeNullEClass == null) {
			normalJobContainerTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(758);
		}
		return normalJobContainerTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobContainerTypeNull_Container() {
        return (EReference)getNormalJobContainerTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobServicesPropertiesAbstract() {
		if (normalJobServicesPropertiesAbstractEClass == null) {
			normalJobServicesPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(759);
		}
		return normalJobServicesPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobConcurrencyAbstract() {
		if (normalJobConcurrencyAbstractEClass == null) {
			normalJobConcurrencyAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(760);
		}
		return normalJobConcurrencyAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobConcurrencyTypeString() {
		if (normalJobConcurrencyTypeStringEClass == null) {
			normalJobConcurrencyTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(761);
		}
		return normalJobConcurrencyTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobConcurrencyTypeString_Concurrency() {
        return (EAttribute)getNormalJobConcurrencyTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobConcurrencyTypeInteger() {
		if (normalJobConcurrencyTypeIntegerEClass == null) {
			normalJobConcurrencyTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(762);
		}
		return normalJobConcurrencyTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobConcurrencyTypeInteger_Concurrency() {
        return (EAttribute)getNormalJobConcurrencyTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobConcurrencyTypeNumber() {
		if (normalJobConcurrencyTypeNumberEClass == null) {
			normalJobConcurrencyTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(763);
		}
		return normalJobConcurrencyTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobConcurrencyTypeNumber_Concurrency() {
        return (EAttribute)getNormalJobConcurrencyTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobConcurrencyTypeBoolean() {
		if (normalJobConcurrencyTypeBooleanEClass == null) {
			normalJobConcurrencyTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(764);
		}
		return normalJobConcurrencyTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobConcurrencyTypeBoolean_Concurrency() {
        return (EAttribute)getNormalJobConcurrencyTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobConcurrencyTypeObject() {
		if (normalJobConcurrencyTypeObjectEClass == null) {
			normalJobConcurrencyTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(765);
		}
		return normalJobConcurrencyTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobConcurrencyTypeObject_Concurrency() {
        return (EReference)getNormalJobConcurrencyTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobConcurrencyTypeObject__Get__String() {
        return getNormalJobConcurrencyTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobConcurrencyPropertiesAbstract() {
		if (normalJobConcurrencyPropertiesAbstractEClass == null) {
			normalJobConcurrencyPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(766);
		}
		return normalJobConcurrencyPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobConcurrencyAdditionalProperties() {
		if (normalJobConcurrencyAdditionalPropertiesEClass == null) {
			normalJobConcurrencyAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(767);
		}
		return normalJobConcurrencyAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNormalJobConcurrencyAdditionalProperties_Key() {
        return (EAttribute)getNormalJobConcurrencyAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobConcurrencyAdditionalProperties_AdditionalProperties() {
        return (EReference)getNormalJobConcurrencyAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobConcurrencyAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getNormalJobConcurrencyAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getNormalJobConcurrencyAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getNormalJobConcurrencyAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobConcurrencyTypeArray() {
		if (normalJobConcurrencyTypeArrayEClass == null) {
			normalJobConcurrencyTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(768);
		}
		return normalJobConcurrencyTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobConcurrencyTypeArray_Concurrency() {
        return (EReference)getNormalJobConcurrencyTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobConcurrencyItems() {
		if (normalJobConcurrencyItemsEClass == null) {
			normalJobConcurrencyItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(769);
		}
		return normalJobConcurrencyItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobConcurrencyItems_Items() {
        return (EReference)getNormalJobConcurrencyItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNormalJobConcurrencyTypeNull() {
		if (normalJobConcurrencyTypeNullEClass == null) {
			normalJobConcurrencyTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(770);
		}
		return normalJobConcurrencyTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getNormalJobConcurrencyTypeNull_Concurrency() {
        return (EReference)getNormalJobConcurrencyTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnAbstract() {
		if (githubwfRootOnAbstractEClass == null) {
			githubwfRootOnAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(771);
		}
		return githubwfRootOnAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnTypeString() {
		if (githubwfRootOnTypeStringEClass == null) {
			githubwfRootOnTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(772);
		}
		return githubwfRootOnTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnTypeString_On() {
        return (EAttribute)getGithubwfRootOnTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnTypeInteger() {
		if (githubwfRootOnTypeIntegerEClass == null) {
			githubwfRootOnTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(773);
		}
		return githubwfRootOnTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnTypeInteger_On() {
        return (EAttribute)getGithubwfRootOnTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnTypeNumber() {
		if (githubwfRootOnTypeNumberEClass == null) {
			githubwfRootOnTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(774);
		}
		return githubwfRootOnTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnTypeNumber_On() {
        return (EAttribute)getGithubwfRootOnTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnTypeBoolean() {
		if (githubwfRootOnTypeBooleanEClass == null) {
			githubwfRootOnTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(775);
		}
		return githubwfRootOnTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnTypeBoolean_On() {
        return (EAttribute)getGithubwfRootOnTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnTypeObject() {
		if (githubwfRootOnTypeObjectEClass == null) {
			githubwfRootOnTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(776);
		}
		return githubwfRootOnTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnTypeObject_On() {
        return (EReference)getGithubwfRootOnTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnTypeObject__Get__String() {
        return getGithubwfRootOnTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnPropertiesAbstract() {
		if (githubwfRootOnPropertiesAbstractEClass == null) {
			githubwfRootOnPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(777);
		}
		return githubwfRootOnPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnAdditionalProperties() {
		if (githubwfRootOnAdditionalPropertiesEClass == null) {
			githubwfRootOnAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(778);
		}
		return githubwfRootOnAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnAdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootOnAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnAdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootOnAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnTypeArray() {
		if (githubwfRootOnTypeArrayEClass == null) {
			githubwfRootOnTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(779);
		}
		return githubwfRootOnTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnTypeArray_On() {
        return (EReference)getGithubwfRootOnTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnItems() {
		if (githubwfRootOnItemsEClass == null) {
			githubwfRootOnItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(780);
		}
		return githubwfRootOnItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnItems_Items() {
        return (EReference)getGithubwfRootOnItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnTypeNull() {
		if (githubwfRootOnTypeNullEClass == null) {
			githubwfRootOnTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(781);
		}
		return githubwfRootOnTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnTypeNull_On() {
        return (EReference)getGithubwfRootOnTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2PropertiesAbstract() {
		if (githubwfRootOnOneOf2PropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(782);
		}
		return githubwfRootOnOneOf2PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_requestPatternProperties0Items() {
		if (githubwfRootOnOneOf2Pull_requestPatternProperties0ItemsEClass == null) {
			githubwfRootOnOneOf2Pull_requestPatternProperties0ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(783);
		}
		return githubwfRootOnOneOf2Pull_requestPatternProperties0ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_requestPatternProperties0Items_Items() {
        return (EReference)getGithubwfRootOnOneOf2Pull_requestPatternProperties0Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0Abstract() {
		if (githubwfRootOnOneOf2Pull_request_targetPatternProperties0AbstractEClass == null) {
			githubwfRootOnOneOf2Pull_request_targetPatternProperties0AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(784);
		}
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeString() {
		if (githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeStringEClass == null) {
			githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(785);
		}
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeString_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger() {
		if (githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeIntegerEClass == null) {
			githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(786);
		}
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumber() {
		if (githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumberEClass == null) {
			githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(787);
		}
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumber_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBoolean() {
		if (githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBooleanEClass == null) {
			githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(788);
		}
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBoolean_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObject() {
		if (githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObjectEClass == null) {
			githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(789);
		}
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObject_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0PropertiesAbstract() {
		if (githubwfRootOnOneOf2Pull_request_targetPatternProperties0PropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Pull_request_targetPatternProperties0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(790);
		}
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties() {
		if (githubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalPropertiesEClass == null) {
			githubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(791);
		}
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArray() {
		if (githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArrayEClass == null) {
			githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(792);
		}
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArray_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0Items() {
		if (githubwfRootOnOneOf2Pull_request_targetPatternProperties0ItemsEClass == null) {
			githubwfRootOnOneOf2Pull_request_targetPatternProperties0ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(793);
		}
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0Items_Items() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNull() {
		if (githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNullEClass == null) {
			githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(794);
		}
		return githubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNull_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Pull_request_targetPatternProperties0TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callAbstract() {
		if (githubwfRootOnOneOf2Workflow_callAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_callAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(795);
		}
		return githubwfRootOnOneOf2Workflow_callAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callTypeString() {
		if (githubwfRootOnOneOf2Workflow_callTypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_callTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(796);
		}
		return githubwfRootOnOneOf2Workflow_callTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callTypeString_Workflow_call() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callTypeInteger() {
		if (githubwfRootOnOneOf2Workflow_callTypeIntegerEClass == null) {
			githubwfRootOnOneOf2Workflow_callTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(797);
		}
		return githubwfRootOnOneOf2Workflow_callTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callTypeInteger_Workflow_call() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callTypeNumber() {
		if (githubwfRootOnOneOf2Workflow_callTypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_callTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(798);
		}
		return githubwfRootOnOneOf2Workflow_callTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callTypeNumber_Workflow_call() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callTypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_callTypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_callTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(799);
		}
		return githubwfRootOnOneOf2Workflow_callTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callTypeBoolean_Workflow_call() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callTypeObject() {
		if (githubwfRootOnOneOf2Workflow_callTypeObjectEClass == null) {
			githubwfRootOnOneOf2Workflow_callTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(800);
		}
		return githubwfRootOnOneOf2Workflow_callTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callTypeObject_Workflow_call() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callTypeObject_Inputs() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callTypeObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callTypeObject_Secrets() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callTypeObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callTypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_callTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callPropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_callPropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_callPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(801);
		}
		return githubwfRootOnOneOf2Workflow_callPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callAdditionalProperties() {
		if (githubwfRootOnOneOf2Workflow_callAdditionalPropertiesEClass == null) {
			githubwfRootOnOneOf2Workflow_callAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(802);
		}
		return githubwfRootOnOneOf2Workflow_callAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callAdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callAdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_callAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_callAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callTypeArray() {
		if (githubwfRootOnOneOf2Workflow_callTypeArrayEClass == null) {
			githubwfRootOnOneOf2Workflow_callTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(803);
		}
		return githubwfRootOnOneOf2Workflow_callTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callTypeArray_Workflow_call() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callItems() {
		if (githubwfRootOnOneOf2Workflow_callItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_callItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(804);
		}
		return githubwfRootOnOneOf2Workflow_callItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callTypeNull() {
		if (githubwfRootOnOneOf2Workflow_callTypeNullEClass == null) {
			githubwfRootOnOneOf2Workflow_callTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(805);
		}
		return githubwfRootOnOneOf2Workflow_callTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callTypeNull_Workflow_call() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callInputsPropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_callInputsPropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_callInputsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(806);
		}
		return githubwfRootOnOneOf2Workflow_callInputsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(807);
		}
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstract() {
		if (githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(808);
		}
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(809);
		}
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBoolean_Default_() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumber() {
		if (githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(810);
		}
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumber_Default_() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString() {
		if (githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(811);
		}
		return githubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString_Default_() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0DefaultTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsAbstract() {
		if (githubwfRootOnOneOf2Workflow_callSecretsAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(812);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsTypeString() {
		if (githubwfRootOnOneOf2Workflow_callSecretsTypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(813);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsTypeString_Secrets() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsTypeInteger() {
		if (githubwfRootOnOneOf2Workflow_callSecretsTypeIntegerEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(814);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsTypeInteger_Secrets() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsTypeNumber() {
		if (githubwfRootOnOneOf2Workflow_callSecretsTypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(815);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsTypeNumber_Secrets() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_callSecretsTypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(816);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean_Secrets() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsTypeObject() {
		if (githubwfRootOnOneOf2Workflow_callSecretsTypeObjectEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(817);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsTypeObject_Secrets() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callSecretsTypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_callSecretsTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(818);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsTypeArray() {
		if (githubwfRootOnOneOf2Workflow_callSecretsTypeArrayEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(819);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsTypeArray_Secrets() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsItems() {
		if (githubwfRootOnOneOf2Workflow_callSecretsItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(820);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsTypeNull() {
		if (githubwfRootOnOneOf2Workflow_callSecretsTypeNullEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(821);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsTypeNull_Secrets() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Abstract() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0AbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(822);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeString() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(823);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeString_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeInteger() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeIntegerEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(824);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeInteger_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumber() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(825);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumber_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(826);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBoolean_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObjectEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(827);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject_Description() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject_Required() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(828);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArray() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArrayEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(829);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArray_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Items() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0ItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(830);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Items_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNull() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNullEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(831);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNull_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstract() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(832);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeString() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(833);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeString_Required() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeInteger() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeIntegerEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(834);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeInteger_Required() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumber() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(835);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumber_Required() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(836);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBoolean_Required() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObject() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObjectEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(837);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObject_Required() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredPropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredPropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(838);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalPropertiesEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(839);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArrayEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(840);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray_Required() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(841);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNull() {
		if (githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNullEClass == null) {
			githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(842);
		}
		return githubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNull_Required() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0RequiredTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(843);
		}
		return githubwfRootOnOneOf2Workflow_dispatchAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchTypeString() {
		if (githubwfRootOnOneOf2Workflow_dispatchTypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(844);
		}
		return githubwfRootOnOneOf2Workflow_dispatchTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchTypeString_Workflow_dispatch() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchTypeInteger() {
		if (githubwfRootOnOneOf2Workflow_dispatchTypeIntegerEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(845);
		}
		return githubwfRootOnOneOf2Workflow_dispatchTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchTypeInteger_Workflow_dispatch() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchTypeNumber() {
		if (githubwfRootOnOneOf2Workflow_dispatchTypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(846);
		}
		return githubwfRootOnOneOf2Workflow_dispatchTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchTypeNumber_Workflow_dispatch() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchTypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_dispatchTypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(847);
		}
		return githubwfRootOnOneOf2Workflow_dispatchTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchTypeBoolean_Workflow_dispatch() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchTypeObject() {
		if (githubwfRootOnOneOf2Workflow_dispatchTypeObjectEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(848);
		}
		return githubwfRootOnOneOf2Workflow_dispatchTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchTypeObject_Workflow_dispatch() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchTypeObject_Inputs() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchTypeObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchTypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_dispatchTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchPropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchPropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(849);
		}
		return githubwfRootOnOneOf2Workflow_dispatchPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties() {
		if (githubwfRootOnOneOf2Workflow_dispatchAdditionalPropertiesEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(850);
		}
		return githubwfRootOnOneOf2Workflow_dispatchAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchTypeArray() {
		if (githubwfRootOnOneOf2Workflow_dispatchTypeArrayEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(851);
		}
		return githubwfRootOnOneOf2Workflow_dispatchTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchTypeArray_Workflow_dispatch() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchItems() {
		if (githubwfRootOnOneOf2Workflow_dispatchItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(852);
		}
		return githubwfRootOnOneOf2Workflow_dispatchItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchTypeNull() {
		if (githubwfRootOnOneOf2Workflow_dispatchTypeNullEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(853);
		}
		return githubwfRootOnOneOf2Workflow_dispatchTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchTypeNull_Workflow_dispatch() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(854);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0PropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0PropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(855);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(856);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeString() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(857);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeString_Default_() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeInteger() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeIntegerEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(858);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeInteger_Default_() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumber() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(859);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumber_Default_() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(860);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBoolean_Default_() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObject() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObjectEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(861);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObject_Default_() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultPropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultPropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(862);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalPropertiesEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(863);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArray() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArrayEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(864);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArray_Default_() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItems() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(865);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNullEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(866);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull_Default_() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0DefaultTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Abstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(867);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeString() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(868);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeString_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeInteger() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeIntegerEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(869);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeInteger_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumber() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(870);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumber_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(871);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBoolean_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObjectEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(872);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(873);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalPropertiesEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(874);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArray() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArrayEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(875);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArray_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Items() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(876);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Items_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNull() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNullEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(877);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNull_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(878);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(879);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeIntegerEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(880);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(881);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(882);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObjectEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(883);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject_Type() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(884);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalPropertiesEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(885);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArrayEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(886);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(887);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNullEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(888);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0IfTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(889);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(890);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeIntegerEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(891);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(892);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(893);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(894);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject_Default_() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(895);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(896);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(897);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(898);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNullEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(899);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ThenTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(900);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(901);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(902);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(903);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(904);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(905);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject_Default_() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(906);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElsePropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(907);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(908);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(909);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(910);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0ElseTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Abstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(911);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(912);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(913);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(914);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(915);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(916);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(917);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(918);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(919);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(920);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(921);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(922);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(923);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(924);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(925);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(926);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(927);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject_Type() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(928);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(929);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(930);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(931);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(932);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(933);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(934);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(935);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(936);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(937);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(938);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(939);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(940);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(941);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(942);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull() {
		if (githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullEClass == null) {
			githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(943);
		}
		return githubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1ThenTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runPatternProperties0Abstract() {
		if (githubwfRootOnOneOf2Workflow_runPatternProperties0AbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_runPatternProperties0AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(944);
		}
		return githubwfRootOnOneOf2Workflow_runPatternProperties0AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeString() {
		if (githubwfRootOnOneOf2Workflow_runPatternProperties0TypeStringEClass == null) {
			githubwfRootOnOneOf2Workflow_runPatternProperties0TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(945);
		}
		return githubwfRootOnOneOf2Workflow_runPatternProperties0TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeString_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeInteger() {
		if (githubwfRootOnOneOf2Workflow_runPatternProperties0TypeIntegerEClass == null) {
			githubwfRootOnOneOf2Workflow_runPatternProperties0TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(946);
		}
		return githubwfRootOnOneOf2Workflow_runPatternProperties0TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeInteger_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumber() {
		if (githubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumberEClass == null) {
			githubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(947);
		}
		return githubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumber_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBoolean() {
		if (githubwfRootOnOneOf2Workflow_runPatternProperties0TypeBooleanEClass == null) {
			githubwfRootOnOneOf2Workflow_runPatternProperties0TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(948);
		}
		return githubwfRootOnOneOf2Workflow_runPatternProperties0TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBoolean_PatternProperties0() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject() {
		if (githubwfRootOnOneOf2Workflow_runPatternProperties0TypeObjectEClass == null) {
			githubwfRootOnOneOf2Workflow_runPatternProperties0TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(949);
		}
		return githubwfRootOnOneOf2Workflow_runPatternProperties0TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject__Get__String() {
        return getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runPatternProperties0PropertiesAbstract() {
		if (githubwfRootOnOneOf2Workflow_runPatternProperties0PropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2Workflow_runPatternProperties0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(950);
		}
		return githubwfRootOnOneOf2Workflow_runPatternProperties0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties() {
		if (githubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalPropertiesEClass == null) {
			githubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(951);
		}
		return githubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootOnOneOf2Workflow_runPatternProperties0AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArray() {
		if (githubwfRootOnOneOf2Workflow_runPatternProperties0TypeArrayEClass == null) {
			githubwfRootOnOneOf2Workflow_runPatternProperties0TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(952);
		}
		return githubwfRootOnOneOf2Workflow_runPatternProperties0TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArray_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runPatternProperties0Items() {
		if (githubwfRootOnOneOf2Workflow_runPatternProperties0ItemsEClass == null) {
			githubwfRootOnOneOf2Workflow_runPatternProperties0ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(953);
		}
		return githubwfRootOnOneOf2Workflow_runPatternProperties0ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_runPatternProperties0Items_Items() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_runPatternProperties0Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNull() {
		if (githubwfRootOnOneOf2Workflow_runPatternProperties0TypeNullEClass == null) {
			githubwfRootOnOneOf2Workflow_runPatternProperties0TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(954);
		}
		return githubwfRootOnOneOf2Workflow_runPatternProperties0TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNull_PatternProperties0() {
        return (EReference)getGithubwfRootOnOneOf2Workflow_runPatternProperties0TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ScheduleItemsAbstract() {
		if (githubwfRootOnOneOf2ScheduleItemsAbstractEClass == null) {
			githubwfRootOnOneOf2ScheduleItemsAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(955);
		}
		return githubwfRootOnOneOf2ScheduleItemsAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ScheduleItemsTypeString() {
		if (githubwfRootOnOneOf2ScheduleItemsTypeStringEClass == null) {
			githubwfRootOnOneOf2ScheduleItemsTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(956);
		}
		return githubwfRootOnOneOf2ScheduleItemsTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2ScheduleItemsTypeString_Items() {
        return (EAttribute)getGithubwfRootOnOneOf2ScheduleItemsTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ScheduleItemsTypeInteger() {
		if (githubwfRootOnOneOf2ScheduleItemsTypeIntegerEClass == null) {
			githubwfRootOnOneOf2ScheduleItemsTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(957);
		}
		return githubwfRootOnOneOf2ScheduleItemsTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2ScheduleItemsTypeInteger_Items() {
        return (EAttribute)getGithubwfRootOnOneOf2ScheduleItemsTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ScheduleItemsTypeNumber() {
		if (githubwfRootOnOneOf2ScheduleItemsTypeNumberEClass == null) {
			githubwfRootOnOneOf2ScheduleItemsTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(958);
		}
		return githubwfRootOnOneOf2ScheduleItemsTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2ScheduleItemsTypeNumber_Items() {
        return (EAttribute)getGithubwfRootOnOneOf2ScheduleItemsTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ScheduleItemsTypeBoolean() {
		if (githubwfRootOnOneOf2ScheduleItemsTypeBooleanEClass == null) {
			githubwfRootOnOneOf2ScheduleItemsTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(959);
		}
		return githubwfRootOnOneOf2ScheduleItemsTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2ScheduleItemsTypeBoolean_Items() {
        return (EAttribute)getGithubwfRootOnOneOf2ScheduleItemsTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ScheduleItemsTypeObject() {
		if (githubwfRootOnOneOf2ScheduleItemsTypeObjectEClass == null) {
			githubwfRootOnOneOf2ScheduleItemsTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(960);
		}
		return githubwfRootOnOneOf2ScheduleItemsTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2ScheduleItemsTypeObject_Items() {
        return (EReference)getGithubwfRootOnOneOf2ScheduleItemsTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootOnOneOf2ScheduleItemsTypeObject_Cron() {
        return (EAttribute)getGithubwfRootOnOneOf2ScheduleItemsTypeObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootOnOneOf2ScheduleItemsTypeObject__Get__String() {
        return getGithubwfRootOnOneOf2ScheduleItemsTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ScheduleItemsPropertiesAbstract() {
		if (githubwfRootOnOneOf2ScheduleItemsPropertiesAbstractEClass == null) {
			githubwfRootOnOneOf2ScheduleItemsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(961);
		}
		return githubwfRootOnOneOf2ScheduleItemsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ScheduleItemsTypeArray() {
		if (githubwfRootOnOneOf2ScheduleItemsTypeArrayEClass == null) {
			githubwfRootOnOneOf2ScheduleItemsTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(962);
		}
		return githubwfRootOnOneOf2ScheduleItemsTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2ScheduleItemsTypeArray_Items() {
        return (EReference)getGithubwfRootOnOneOf2ScheduleItemsTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ScheduleItemsItems() {
		if (githubwfRootOnOneOf2ScheduleItemsItemsEClass == null) {
			githubwfRootOnOneOf2ScheduleItemsItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(963);
		}
		return githubwfRootOnOneOf2ScheduleItemsItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2ScheduleItemsItems_Items() {
        return (EReference)getGithubwfRootOnOneOf2ScheduleItemsItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootOnOneOf2ScheduleItemsTypeNull() {
		if (githubwfRootOnOneOf2ScheduleItemsTypeNullEClass == null) {
			githubwfRootOnOneOf2ScheduleItemsTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(964);
		}
		return githubwfRootOnOneOf2ScheduleItemsTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootOnOneOf2ScheduleItemsTypeNull_Items() {
        return (EReference)getGithubwfRootOnOneOf2ScheduleItemsTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootConcurrencyAbstract() {
		if (githubwfRootConcurrencyAbstractEClass == null) {
			githubwfRootConcurrencyAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(965);
		}
		return githubwfRootConcurrencyAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootConcurrencyTypeString() {
		if (githubwfRootConcurrencyTypeStringEClass == null) {
			githubwfRootConcurrencyTypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(966);
		}
		return githubwfRootConcurrencyTypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootConcurrencyTypeString_Concurrency() {
        return (EAttribute)getGithubwfRootConcurrencyTypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootConcurrencyTypeInteger() {
		if (githubwfRootConcurrencyTypeIntegerEClass == null) {
			githubwfRootConcurrencyTypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(967);
		}
		return githubwfRootConcurrencyTypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootConcurrencyTypeInteger_Concurrency() {
        return (EAttribute)getGithubwfRootConcurrencyTypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootConcurrencyTypeNumber() {
		if (githubwfRootConcurrencyTypeNumberEClass == null) {
			githubwfRootConcurrencyTypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(968);
		}
		return githubwfRootConcurrencyTypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootConcurrencyTypeNumber_Concurrency() {
        return (EAttribute)getGithubwfRootConcurrencyTypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootConcurrencyTypeBoolean() {
		if (githubwfRootConcurrencyTypeBooleanEClass == null) {
			githubwfRootConcurrencyTypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(969);
		}
		return githubwfRootConcurrencyTypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootConcurrencyTypeBoolean_Concurrency() {
        return (EAttribute)getGithubwfRootConcurrencyTypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootConcurrencyTypeObject() {
		if (githubwfRootConcurrencyTypeObjectEClass == null) {
			githubwfRootConcurrencyTypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(970);
		}
		return githubwfRootConcurrencyTypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootConcurrencyTypeObject_Concurrency() {
        return (EReference)getGithubwfRootConcurrencyTypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootConcurrencyTypeObject__Get__String() {
        return getGithubwfRootConcurrencyTypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootConcurrencyPropertiesAbstract() {
		if (githubwfRootConcurrencyPropertiesAbstractEClass == null) {
			githubwfRootConcurrencyPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(971);
		}
		return githubwfRootConcurrencyPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootConcurrencyAdditionalProperties() {
		if (githubwfRootConcurrencyAdditionalPropertiesEClass == null) {
			githubwfRootConcurrencyAdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(972);
		}
		return githubwfRootConcurrencyAdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootConcurrencyAdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootConcurrencyAdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootConcurrencyAdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootConcurrencyAdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootConcurrencyAdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootConcurrencyAdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootConcurrencyAdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootConcurrencyAdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootConcurrencyTypeArray() {
		if (githubwfRootConcurrencyTypeArrayEClass == null) {
			githubwfRootConcurrencyTypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(973);
		}
		return githubwfRootConcurrencyTypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootConcurrencyTypeArray_Concurrency() {
        return (EReference)getGithubwfRootConcurrencyTypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootConcurrencyItems() {
		if (githubwfRootConcurrencyItemsEClass == null) {
			githubwfRootConcurrencyItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(974);
		}
		return githubwfRootConcurrencyItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootConcurrencyItems_Items() {
        return (EReference)getGithubwfRootConcurrencyItems().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootConcurrencyTypeNull() {
		if (githubwfRootConcurrencyTypeNullEClass == null) {
			githubwfRootConcurrencyTypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(975);
		}
		return githubwfRootConcurrencyTypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootConcurrencyTypeNull_Concurrency() {
        return (EReference)getGithubwfRootConcurrencyTypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPropertiesAbstract() {
		if (githubwfRootJobsPropertiesAbstractEClass == null) {
			githubwfRootJobsPropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(976);
		}
		return githubwfRootJobsPropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPatternProperties0Abstract() {
		if (githubwfRootJobsPatternProperties0AbstractEClass == null) {
			githubwfRootJobsPatternProperties0AbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(977);
		}
		return githubwfRootJobsPatternProperties0AbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPatternProperties0TypeString() {
		if (githubwfRootJobsPatternProperties0TypeStringEClass == null) {
			githubwfRootJobsPatternProperties0TypeStringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(978);
		}
		return githubwfRootJobsPatternProperties0TypeStringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootJobsPatternProperties0TypeString_PatternProperties0() {
        return (EAttribute)getGithubwfRootJobsPatternProperties0TypeString().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPatternProperties0TypeInteger() {
		if (githubwfRootJobsPatternProperties0TypeIntegerEClass == null) {
			githubwfRootJobsPatternProperties0TypeIntegerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(979);
		}
		return githubwfRootJobsPatternProperties0TypeIntegerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootJobsPatternProperties0TypeInteger_PatternProperties0() {
        return (EAttribute)getGithubwfRootJobsPatternProperties0TypeInteger().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPatternProperties0TypeNumber() {
		if (githubwfRootJobsPatternProperties0TypeNumberEClass == null) {
			githubwfRootJobsPatternProperties0TypeNumberEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(980);
		}
		return githubwfRootJobsPatternProperties0TypeNumberEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootJobsPatternProperties0TypeNumber_PatternProperties0() {
        return (EAttribute)getGithubwfRootJobsPatternProperties0TypeNumber().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPatternProperties0TypeBoolean() {
		if (githubwfRootJobsPatternProperties0TypeBooleanEClass == null) {
			githubwfRootJobsPatternProperties0TypeBooleanEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(981);
		}
		return githubwfRootJobsPatternProperties0TypeBooleanEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootJobsPatternProperties0TypeBoolean_PatternProperties0() {
        return (EAttribute)getGithubwfRootJobsPatternProperties0TypeBoolean().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPatternProperties0TypeObject() {
		if (githubwfRootJobsPatternProperties0TypeObjectEClass == null) {
			githubwfRootJobsPatternProperties0TypeObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(982);
		}
		return githubwfRootJobsPatternProperties0TypeObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootJobsPatternProperties0TypeObject_PatternProperties0() {
        return (EReference)getGithubwfRootJobsPatternProperties0TypeObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootJobsPatternProperties0TypeObject__Get__String() {
        return getGithubwfRootJobsPatternProperties0TypeObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPatternProperties0PropertiesAbstract() {
		if (githubwfRootJobsPatternProperties0PropertiesAbstractEClass == null) {
			githubwfRootJobsPatternProperties0PropertiesAbstractEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(983);
		}
		return githubwfRootJobsPatternProperties0PropertiesAbstractEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPatternProperties0AdditionalProperties() {
		if (githubwfRootJobsPatternProperties0AdditionalPropertiesEClass == null) {
			githubwfRootJobsPatternProperties0AdditionalPropertiesEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(984);
		}
		return githubwfRootJobsPatternProperties0AdditionalPropertiesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getGithubwfRootJobsPatternProperties0AdditionalProperties_Key() {
        return (EAttribute)getGithubwfRootJobsPatternProperties0AdditionalProperties().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootJobsPatternProperties0AdditionalProperties_AdditionalProperties() {
        return (EReference)getGithubwfRootJobsPatternProperties0AdditionalProperties().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootJobsPatternProperties0AdditionalProperties__ValidateKeyOnDefinedPatternProperties() {
        return getGithubwfRootJobsPatternProperties0AdditionalProperties().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getGithubwfRootJobsPatternProperties0AdditionalProperties__ValidateKeyOnDefinedProperties() {
        return getGithubwfRootJobsPatternProperties0AdditionalProperties().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPatternProperties0TypeArray() {
		if (githubwfRootJobsPatternProperties0TypeArrayEClass == null) {
			githubwfRootJobsPatternProperties0TypeArrayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(985);
		}
		return githubwfRootJobsPatternProperties0TypeArrayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootJobsPatternProperties0TypeArray_PatternProperties0() {
        return (EReference)getGithubwfRootJobsPatternProperties0TypeArray().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPatternProperties0Items() {
		if (githubwfRootJobsPatternProperties0ItemsEClass == null) {
			githubwfRootJobsPatternProperties0ItemsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(986);
		}
		return githubwfRootJobsPatternProperties0ItemsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootJobsPatternProperties0Items_Items() {
        return (EReference)getGithubwfRootJobsPatternProperties0Items().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGithubwfRootJobsPatternProperties0TypeNull() {
		if (githubwfRootJobsPatternProperties0TypeNullEClass == null) {
			githubwfRootJobsPatternProperties0TypeNullEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(GithubwfPackage.eNS_URI).getEClassifiers().get(987);
		}
		return githubwfRootJobsPatternProperties0TypeNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGithubwfRootJobsPatternProperties0TypeNull_PatternProperties0() {
        return (EReference)getGithubwfRootJobsPatternProperties0TypeNull().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GithubwfFactory getGithubwfFactory() {
		return (GithubwfFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Loads the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("githubwf." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //GithubwfPackageImpl
