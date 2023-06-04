package githubwf.githubwf.validation;

import org.eclipse.emf.common.util.URI;
import org.eclipse.ocl.xtext.completeocl.validation.CompleteOCLEObjectValidator;
import org.eclipse.xtext.validation.EValidatorRegistrar;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.Resource.Diagnostic;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.ArrayList;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;
import org.eclipse.xtext.util.CancelIndicator;

import relatedSchemas.RelatedSchemas;
import relatedSchemas.EnclosingSchema;
import jsonMM.JsonDocument;
import org.eclipse.emf.converter.util.ConverterUtil;

import jku.se.atl.transformation.utils.Utils;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.ParserRule;
import java.lang.reflect.Method;
import com.google.inject.Inject;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.xtext.nodemodel.ICompositeNode;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

public class GithubwfRootOnOneOf2Validator extends AbstractGithubwfRootOnOneOf2Validator {
	
	@Inject githubwf.githubwf.services.GithubwfRootOnOneOf2GrammarAccess grammarAccess;	
	
	private List<EObject> processedPatternProperties = new ArrayList<EObject>();

	@Check
	public void oneOfValidationEventObject(githubwf.EventObject enclosingEClass){
	//	String enclosingEClassText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(enclosingEClass));
		String enclosingEClassText = getNodeText(enclosingEClass);
		int validSchemasCount = 0;
		InputStream in0 = new ByteArrayInputStream(enclosingEClassText.getBytes());
		ResourceSet reset0 = new ResourceSetImpl();
		Resource resource0 = reset0.createResource(URI.createURI("platform:/dummy.eventobjectoneof0"));
		try {
			resource0.load(in0, reset0.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(resource0.getErrors().isEmpty()) {
			XtextResource xtextResource = (XtextResource)resource0;
			IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
			List<Issue> issues = resourceValidator.validate(resource0, CheckMode.ALL, CancelIndicator.NullImpl);
			if(issues.isEmpty()){
				validSchemasCount++;
			}	
			
		}
		InputStream in1 = new ByteArrayInputStream(enclosingEClassText.getBytes());
		ResourceSet reset1 = new ResourceSetImpl();
		Resource resource1 = reset1.createResource(URI.createURI("platform:/dummy.eventobjectoneof1"));
		try {
			resource1.load(in1, reset1.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(resource1.getErrors().isEmpty()) {
			XtextResource xtextResource = (XtextResource)resource1;
			IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
			List<Issue> issues = resourceValidator.validate(resource1, CheckMode.ALL, CancelIndicator.NullImpl);
			if(issues.isEmpty()){
				validSchemasCount++;
			}	
			
		}
		if(validSchemasCount==0){
			error("No valid schema found in the OneOf EventObject", null);
		}else if(validSchemasCount>1){
			error("Found "+validSchemasCount+" valid schemas in the OneOf EventObject", null);
		}	
	}

	@Check
	public void oneOfValidationRef(githubwf.Ref enclosingEClass){
	//	String enclosingEClassText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(enclosingEClass));
		String enclosingEClassText = getNodeText(enclosingEClass);
		int validSchemasCount = 0;
		InputStream in0 = new ByteArrayInputStream(enclosingEClassText.getBytes());
		ResourceSet reset0 = new ResourceSetImpl();
		Resource resource0 = reset0.createResource(URI.createURI("platform:/dummy.refoneof0"));
		try {
			resource0.load(in0, reset0.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(resource0.getErrors().isEmpty()) {
			XtextResource xtextResource = (XtextResource)resource0;
			IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
			List<Issue> issues = resourceValidator.validate(resource0, CheckMode.ALL, CancelIndicator.NullImpl);
			if(issues.isEmpty()){
				validSchemasCount++;
			}	
			
		}
		InputStream in1 = new ByteArrayInputStream(enclosingEClassText.getBytes());
		ResourceSet reset1 = new ResourceSetImpl();
		Resource resource1 = reset1.createResource(URI.createURI("platform:/dummy.refoneof1"));
		try {
			resource1.load(in1, reset1.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(resource1.getErrors().isEmpty()) {
			XtextResource xtextResource = (XtextResource)resource1;
			IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
			List<Issue> issues = resourceValidator.validate(resource1, CheckMode.ALL, CancelIndicator.NullImpl);
			if(issues.isEmpty()){
				validSchemasCount++;
			}	
			
		}
		if(validSchemasCount==0){
			error("No valid schema found in the OneOf Ref", null);
		}else if(validSchemasCount>1){
			error("Found "+validSchemasCount+" valid schemas in the OneOf Ref", null);
		}	
	}

	@Check
	public void enumValidationGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type(githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type enclosingEClass){
		ResourceSet reset  = ConverterUtil.createResourceSet();
		Resource resource = reset.getResource(URI.createPlatformResourceURI("/githubwf/model/githubwf.relatedSchemas", true), true);
		
		if (! (resource.getContents().get(0) instanceof RelatedSchemas)) {
			throw new IllegalArgumentException("Expecting RelatedSchema type of object");
			
		}  
		RelatedSchemas relatedSchemas = (RelatedSchemas )resource.getContents().get(0);
		EnclosingSchema enclosingSchema = relatedSchemas.getEnclosingschemas().stream().filter(es -> es.getEnclosingSchema().getName().equals("GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0Type")).findFirst().get();
		List<JsonDocument> enumJsonDocuments=enclosingSchema.getConstEnum().getEnum().getEnum();
		JsonDocument enumJson = enclosingEClass.getType();
		
		if (enumJsonDocuments.stream().filter(json ->json.semanticEquals(enumJson)).findAny().orElse(null) == null){	
			error("Element "+enumJson.toString()+" not included in the enumeration", null);
		}
	}

	@Check
	public void allOfValidationGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0(githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0 enclosingEClass){
	//	String enclosingEClassText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(enclosingEClass));
		String enclosingEClassText = getNodeText(enclosingEClass);
		InputStream in0 = new ByteArrayInputStream(enclosingEClassText.getBytes());
		ResourceSet reset0 = new ResourceSetImpl();
		Resource resource0 = reset0.createResource(URI.createURI("platform:/dummy.githubwfrootononeof2workflow_dispatchinputspatternproperties0allof0"));
		try {
			resource0.load(in0, reset0.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Diagnostic diagnostic : resource0.getErrors()) {
			error(diagnostic.getMessage(), null);
		}
		if(resource0.getErrors().isEmpty()) {
			XtextResource xtextResource = (XtextResource)resource0;
			IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
			List<Issue> issues = resourceValidator.validate(resource0, CheckMode.ALL, CancelIndicator.NullImpl);
			for(Issue issue :issues) {
				error(issue.getMessage(), null);
			}
		}
		InputStream in1 = new ByteArrayInputStream(enclosingEClassText.getBytes());
		ResourceSet reset1 = new ResourceSetImpl();
		Resource resource1 = reset1.createResource(URI.createURI("platform:/dummy.githubwfrootononeof2workflow_dispatchinputspatternproperties0allof1"));
		try {
			resource1.load(in1, reset1.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		for (Diagnostic diagnostic : resource1.getErrors()) {
			error(diagnostic.getMessage(), null);
		}
		if(resource1.getErrors().isEmpty()) {
			XtextResource xtextResource = (XtextResource)resource1;
			IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
			List<Issue> issues = resourceValidator.validate(resource1, CheckMode.ALL, CancelIndicator.NullImpl);
			for(Issue issue :issues) {
				error(issue.getMessage(), null);
			}
		}
	}

	@Check
	public void enumValidationGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type(githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type enclosingEClass){
		ResourceSet reset  = ConverterUtil.createResourceSet();
		Resource resource = reset.getResource(URI.createPlatformResourceURI("/githubwf/model/githubwf.relatedSchemas", true), true);
		
		if (! (resource.getContents().get(0) instanceof RelatedSchemas)) {
			throw new IllegalArgumentException("Expecting RelatedSchema type of object");
			
		}  
		RelatedSchemas relatedSchemas = (RelatedSchemas )resource.getContents().get(0);
		EnclosingSchema enclosingSchema = relatedSchemas.getEnclosingschemas().stream().filter(es -> es.getEnclosingSchema().getName().equals("GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0Type")).findFirst().get();
		List<JsonDocument> enumJsonDocuments=enclosingSchema.getConstEnum().getEnum().getEnum();
		JsonDocument enumJson = enclosingEClass.getType();
		
		if (enumJsonDocuments.stream().filter(json ->json.semanticEquals(enumJson)).findAny().orElse(null) == null){	
			error("Element "+enumJson.toString()+" not included in the enumeration", null);
		}
	}

	@Check
	public void validateGithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0(githubwf.GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0 patternProperties){
		if(this.processedPatternProperties.contains(patternProperties)) return;
		githubwf.GithubwfPackage ePackage = githubwf.GithubwfPackage.eINSTANCE;
		EClass underValidationEClass = (EClass) ePackage.getEClassifier("GithubwfRootOnOneOf2Workflow_callSecretsPatternProperties0");
		List<EClass> matchingSiblings = Utils.findMatchingPatternPropertiesSiblings(underValidationEClass, patternProperties.getKey(), ePackage);
		
		if(!matchingSiblings.isEmpty()){
			ICompositeNode patternPropertiesINode =NodeModelUtils.getNode(patternProperties);
			String patternPropertiesText = NodeModelUtils.getTokenText(patternPropertiesINode);
			InputStream inputStream = new ByteArrayInputStream(patternPropertiesText.getBytes());
			
			for(EClass matchingPatternProperties : matchingSiblings){
				
				try {
					Method getRule = githubwf.githubwf.services.GithubwfRootOnOneOf2GrammarAccess.class.getDeclaredMethod("get"+matchingPatternProperties.getName()+"Rule");
					ParserRule parserRule = (ParserRule) getRule.invoke(grammarAccess);
					List<Issue> issues = new ArrayList<Issue>();
					List<Diagnostic> diagnostics=new ArrayList<Diagnostic>();
					Thread validationThread = new Thread(new Runnable() {
						@Override
					    public void run() {
					    	try {
								URI uri=URI.createURI("platform:/dummy.githubwfrootononeof2");
								XtextResourceSet reset = new XtextResourceSet();
								XtextResource xtextResource = (XtextResource) reset.createResource(uri);
								xtextResource.setEntryPoint(parserRule);
								xtextResource.load(inputStream, xtextResource.getResourceSet().getLoadOptions());
								diagnostics.addAll(xtextResource.getErrors());
								if(xtextResource.getErrors().isEmpty()) {
									processedPatternProperties.add(xtextResource.getContents().get(0));
									IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
									issues.addAll(resourceValidator.validate(xtextResource, CheckMode.ALL, CancelIndicator.NullImpl));
								}
							} catch (IOException e) {
								e.printStackTrace();
							}	
						}
					}); 		
					validationThread.start();
					validationThread.join();
					for (Diagnostic diagnostic : diagnostics) {
						error(diagnostic.getMessage(), null);
					}
					for(Issue issue :issues) {
						error(issue.getMessage(), null);
					}
				}catch (Exception e) {
					e.printStackTrace();
				} 
				
			}
		}	
	}

	@Check
	public void validateGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0(githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0 patternProperties){
		if(this.processedPatternProperties.contains(patternProperties)) return;
		githubwf.GithubwfPackage ePackage = githubwf.GithubwfPackage.eINSTANCE;
		EClass underValidationEClass = (EClass) ePackage.getEClassifier("GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0");
		List<EClass> matchingSiblings = Utils.findMatchingPatternPropertiesSiblings(underValidationEClass, patternProperties.getKey(), ePackage);
		
		if(!matchingSiblings.isEmpty()){
			ICompositeNode patternPropertiesINode =NodeModelUtils.getNode(patternProperties);
			String patternPropertiesText = NodeModelUtils.getTokenText(patternPropertiesINode);
			InputStream inputStream = new ByteArrayInputStream(patternPropertiesText.getBytes());
			
			for(EClass matchingPatternProperties : matchingSiblings){
				
				try {
					Method getRule = githubwf.githubwf.services.GithubwfRootOnOneOf2GrammarAccess.class.getDeclaredMethod("get"+matchingPatternProperties.getName()+"Rule");
					ParserRule parserRule = (ParserRule) getRule.invoke(grammarAccess);
					List<Issue> issues = new ArrayList<Issue>();
					List<Diagnostic> diagnostics=new ArrayList<Diagnostic>();
					Thread validationThread = new Thread(new Runnable() {
						@Override
					    public void run() {
					    	try {
								URI uri=URI.createURI("platform:/dummy.githubwfrootononeof2");
								XtextResourceSet reset = new XtextResourceSet();
								XtextResource xtextResource = (XtextResource) reset.createResource(uri);
								xtextResource.setEntryPoint(parserRule);
								xtextResource.load(inputStream, xtextResource.getResourceSet().getLoadOptions());
								diagnostics.addAll(xtextResource.getErrors());
								if(xtextResource.getErrors().isEmpty()) {
									processedPatternProperties.add(xtextResource.getContents().get(0));
									IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
									issues.addAll(resourceValidator.validate(xtextResource, CheckMode.ALL, CancelIndicator.NullImpl));
								}
							} catch (IOException e) {
								e.printStackTrace();
							}	
						}
					}); 		
					validationThread.start();
					validationThread.join();
					for (Diagnostic diagnostic : diagnostics) {
						error(diagnostic.getMessage(), null);
					}
					for(Issue issue :issues) {
						error(issue.getMessage(), null);
					}
				}catch (Exception e) {
					e.printStackTrace();
				} 
				
			}
		}	
	}

	@Check
	public void validateGithubwfRootOnOneOf2Workflow_callInputsPatternProperties0(githubwf.GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0 patternProperties){
		if(this.processedPatternProperties.contains(patternProperties)) return;
		githubwf.GithubwfPackage ePackage = githubwf.GithubwfPackage.eINSTANCE;
		EClass underValidationEClass = (EClass) ePackage.getEClassifier("GithubwfRootOnOneOf2Workflow_callInputsPatternProperties0");
		List<EClass> matchingSiblings = Utils.findMatchingPatternPropertiesSiblings(underValidationEClass, patternProperties.getKey(), ePackage);
		
		if(!matchingSiblings.isEmpty()){
			ICompositeNode patternPropertiesINode =NodeModelUtils.getNode(patternProperties);
			String patternPropertiesText = NodeModelUtils.getTokenText(patternPropertiesINode);
			InputStream inputStream = new ByteArrayInputStream(patternPropertiesText.getBytes());
			
			for(EClass matchingPatternProperties : matchingSiblings){
				
				try {
					Method getRule = githubwf.githubwf.services.GithubwfRootOnOneOf2GrammarAccess.class.getDeclaredMethod("get"+matchingPatternProperties.getName()+"Rule");
					ParserRule parserRule = (ParserRule) getRule.invoke(grammarAccess);
					List<Issue> issues = new ArrayList<Issue>();
					List<Diagnostic> diagnostics=new ArrayList<Diagnostic>();
					Thread validationThread = new Thread(new Runnable() {
						@Override
					    public void run() {
					    	try {
								URI uri=URI.createURI("platform:/dummy.githubwfrootononeof2");
								XtextResourceSet reset = new XtextResourceSet();
								XtextResource xtextResource = (XtextResource) reset.createResource(uri);
								xtextResource.setEntryPoint(parserRule);
								xtextResource.load(inputStream, xtextResource.getResourceSet().getLoadOptions());
								diagnostics.addAll(xtextResource.getErrors());
								if(xtextResource.getErrors().isEmpty()) {
									processedPatternProperties.add(xtextResource.getContents().get(0));
									IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
									issues.addAll(resourceValidator.validate(xtextResource, CheckMode.ALL, CancelIndicator.NullImpl));
								}
							} catch (IOException e) {
								e.printStackTrace();
							}	
						}
					}); 		
					validationThread.start();
					validationThread.join();
					for (Diagnostic diagnostic : diagnostics) {
						error(diagnostic.getMessage(), null);
					}
					for(Issue issue :issues) {
						error(issue.getMessage(), null);
					}
				}catch (Exception e) {
					e.printStackTrace();
				} 
				
			}
		}	
	}

	private void independentValidation(String eClassName, List<EObject> processedListName, InputStream inputStream){
		try {
			Method getRule = githubwf.githubwf.services.GithubwfRootOnOneOf2GrammarAccess.class.getDeclaredMethod("get"+eClassName+"Rule");
			ParserRule parserRule = (ParserRule) getRule.invoke(grammarAccess);
			List<Issue> issues = new ArrayList<Issue>();
			List<Diagnostic> diagnostics=new ArrayList<Diagnostic>();
			Thread validationThread = new Thread(new Runnable() {
				@Override
			    public void run() {
			    	try {
						URI uri=URI.createURI("platform:/dummy.githubwfrootononeof2");
						XtextResourceSet reset = new XtextResourceSet();
						XtextResource xtextResource = (XtextResource) reset.createResource(uri);
						xtextResource.setEntryPoint(parserRule);
						xtextResource.load(inputStream, xtextResource.getResourceSet().getLoadOptions());
						diagnostics.addAll(xtextResource.getErrors());
						if(xtextResource.getErrors().isEmpty()) {
							/**we add the processed pattern properties on purspose. No need to propagate the validation 
							 * because all the matches are going to be processed in this loop
							 */
							if(processedListName!=null){
								processedListName.add(xtextResource.getContents().get(0));
							}	
							IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
							issues.addAll(resourceValidator.validate(xtextResource, CheckMode.ALL, CancelIndicator.NullImpl));
						}
					} catch (IOException e) {
						e.printStackTrace();
					}	
				}
			}); 		
			validationThread.start();
			validationThread.join();
			for (Diagnostic diagnostic : diagnostics) {
				error(diagnostic.getMessage(), null);
			}
			for(Issue issue :issues) {
				error(issue.getMessage(), null);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	private String getNodeText(EObject enclosingEClass){
		EObject enclosingEObject=enclosingEClass;
		String enclosingEClassText = null;
		if(enclosingEClass.eClass().getEAnnotation("AdditionalProperties")!=null || enclosingEClass.eClass().getEAnnotation("PatternProperties")!=null) {
			EStructuralFeature additionalOrPatternPropertiesFeature = enclosingEClass.eClass().getEStructuralFeatures().stream().filter(sf->!sf.getName().equals("key")).findFirst().get();
			Object additionalOrPatternPropertiesValue = enclosingEClass.eGet(additionalOrPatternPropertiesFeature);
			if(additionalOrPatternPropertiesValue instanceof EObject) {
				enclosingEObject=(EObject) enclosingEClass.eGet(additionalOrPatternPropertiesFeature);
			}else if(additionalOrPatternPropertiesValue instanceof String){
				enclosingEClassText="\""+additionalOrPatternPropertiesValue.toString()+"\"";
			}else {
				enclosingEClassText= additionalOrPatternPropertiesValue.toString();
			}
		}
	//	String enclosingEClassText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(enclosingEClass));
		if(enclosingEClassText==null) {
			enclosingEClassText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(enclosingEObject));
		}
		return enclosingEClassText;
	}		

}

