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

public class GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfValidator extends AbstractGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfValidator {
	
	@Inject githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfGrammarAccess grammarAccess;	
	
	private List<EObject> processedPatternProperties = new ArrayList<EObject>();

	@Check
	public void constValidationGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType(githubwf.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType enclosingEClass){
		ResourceSet reset  = ConverterUtil.createResourceSet();
		Resource resource = reset.getResource(URI.createPlatformResourceURI("/githubwf/model/githubwf.relatedSchemas", true), true);
		
		if (! (resource.getContents().get(0) instanceof RelatedSchemas)) {
			throw new IllegalArgumentException("Expecting RelatedSchema type of object");
			
		}  
		RelatedSchemas relatedSchemas = (RelatedSchemas )resource.getContents().get(0);
		EnclosingSchema enclosingSchema = relatedSchemas.getEnclosingschemas().stream().filter(es -> es.getEnclosingSchema().getName().equals("GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfType")).findFirst().get();
		JsonDocument constJsonDocument=enclosingSchema.getConstEnum().getConst().getConst();
		JsonDocument inputJsonDocument = enclosingEClass.getType();
		
		if(!constJsonDocument.semanticEquals(inputJsonDocument) ){
			error("Element "+inputJsonDocument.toString()+" is not "+constJsonDocument.toString(), null);
		}
	}

	private void independentValidation(String eClassName, List<EObject> processedListName, InputStream inputStream){
		try {
			Method getRule = githubwf.githubwf.services.GithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfGrammarAccess.class.getDeclaredMethod("get"+eClassName+"Rule");
			ParserRule parserRule = (ParserRule) getRule.invoke(grammarAccess);
			List<Issue> issues = new ArrayList<Issue>();
			List<Diagnostic> diagnostics=new ArrayList<Diagnostic>();
			Thread validationThread = new Thread(new Runnable() {
				@Override
			    public void run() {
			    	try {
						URI uri=URI.createURI("platform:/dummy.githubwfrootononeof2workflow_dispatchinputspatternproperties0allof1if");
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

