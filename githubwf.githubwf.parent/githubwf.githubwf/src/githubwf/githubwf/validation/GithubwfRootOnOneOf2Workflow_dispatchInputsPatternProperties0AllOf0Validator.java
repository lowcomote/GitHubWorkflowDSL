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

public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Validator extends AbstractGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0Validator {
	
	@Inject githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0GrammarAccess grammarAccess;	
	
	private List<EObject> processedPatternProperties = new ArrayList<EObject>();

	@Check
	public void ifThenElseValidationGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0(githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0 enclosingEClass){
		//String enclosingEClassText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(enclosingEClass));
		String enclosingEClassText = getNodeText(enclosingEClass);
		InputStream inIf = new ByteArrayInputStream(enclosingEClassText.getBytes());
		ResourceSet resetIf = new ResourceSetImpl();
		Resource resourceIf = resetIf.createResource(URI.createURI("platform:/dummy.githubwfrootononeof2workflow_dispatchinputspatternproperties0allof0if"));
		boolean isIfSchemaValid = false;
		try {
			resourceIf.load(inIf, resetIf.getLoadOptions());
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(resourceIf.getErrors().isEmpty()) {
			XtextResource xtextResource = (XtextResource)resourceIf;
			IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
			List<Issue> issues = resourceValidator.validate(resourceIf, CheckMode.ALL, CancelIndicator.NullImpl);
			if(issues.isEmpty()){
				isIfSchemaValid=true;
			}	
			
		}
		if(isIfSchemaValid){
			boolean isThenValid = false;
			InputStream inThen = new ByteArrayInputStream(enclosingEClassText.getBytes());
			ResourceSet resetThen = new ResourceSetImpl();
			Resource resourceThen = resetThen.createResource(URI.createURI("platform:/dummy.githubwfrootononeof2workflow_dispatchinputspatternproperties0allof0then"));
			try {
				resourceThen.load(inThen, resetThen.getLoadOptions());
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(resourceThen.getErrors().isEmpty()) {
				XtextResource xtextResource = (XtextResource)resourceThen;
				IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
				List<Issue> issues = resourceValidator.validate(resourceThen, CheckMode.ALL, CancelIndicator.NullImpl);
				if(issues.isEmpty()){
					isThenValid=true;
				}	
				
			}
			if(!isThenValid){
				error("The IF GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0 Schema is valid but the THEN GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0 is not valid", null);
			}
		}else{
			boolean isElseValid = false;
			InputStream inElse = new ByteArrayInputStream(enclosingEClassText.getBytes());
			ResourceSet resetElse = new ResourceSetImpl();
			Resource resourceElse = resetElse.createResource(URI.createURI("platform:/dummy.githubwfrootononeof2workflow_dispatchinputspatternproperties0allof0else"));
			try {
				resourceElse.load(inElse, resetElse.getLoadOptions());
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(resourceElse.getErrors().isEmpty()) {
				XtextResource xtextResource = (XtextResource)resourceElse;
				IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
				List<Issue> issues = resourceValidator.validate(resourceElse, CheckMode.ALL, CancelIndicator.NullImpl);
				if(issues.isEmpty()){
					isElseValid=true;
				}	
				
			}
			if(!isElseValid){
				error("The IF GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0 Schema is not valid and the ELSE GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0 either", null);
			}
		}
	}

	private void independentValidation(String eClassName, List<EObject> processedListName, InputStream inputStream){
		try {
			Method getRule = githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf0GrammarAccess.class.getDeclaredMethod("get"+eClassName+"Rule");
			ParserRule parserRule = (ParserRule) getRule.invoke(grammarAccess);
			List<Issue> issues = new ArrayList<Issue>();
			List<Diagnostic> diagnostics=new ArrayList<Diagnostic>();
			Thread validationThread = new Thread(new Runnable() {
				@Override
			    public void run() {
			    	try {
						URI uri=URI.createURI("platform:/dummy.githubwfrootononeof2workflow_dispatchinputspatternproperties0allof0");
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
