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

public class NormalJobRuns_45onOneOf1Validator extends AbstractNormalJobRuns_45onOneOf1Validator {
	
	@Inject githubwf.githubwf.services.NormalJobRuns_45onOneOf1GrammarAccess grammarAccess;	
	
	private List<EObject> processedPatternProperties = new ArrayList<EObject>();

	@Check
	public void anyOfValidationNormalJobRuns_45onOneOf1(githubwf.NormalJobRuns_45onOneOf1 enclosingEClass){
	//	String enclosingEClassText = NodeModelUtils.getTokenText(NodeModelUtils.getNode(enclosingEClass));
		String enclosingEClassText = getNodeText(enclosingEClass);
		boolean validSchemaFound = false;
		if(!validSchemaFound){
			InputStream in0 = new ByteArrayInputStream(enclosingEClassText.getBytes());
			ResourceSet reset0 = new ResourceSetImpl();
			Resource resource0 = reset0.createResource(URI.createURI("platform:/dummy.normaljobruns_45ononeof1anyof0"));
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
					validSchemaFound=true;
				}	
				
			}
		}
		if(!validSchemaFound){
			InputStream in1 = new ByteArrayInputStream(enclosingEClassText.getBytes());
			ResourceSet reset1 = new ResourceSetImpl();
			Resource resource1 = reset1.createResource(URI.createURI("platform:/dummy.normaljobruns_45ononeof1anyof1"));
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
					validSchemaFound=true;
				}	
				
			}
		}
		if(!validSchemaFound){
			InputStream in2 = new ByteArrayInputStream(enclosingEClassText.getBytes());
			ResourceSet reset2 = new ResourceSetImpl();
			Resource resource2 = reset2.createResource(URI.createURI("platform:/dummy.normaljobruns_45ononeof1anyof2"));
			try {
				resource2.load(in2, reset2.getLoadOptions());
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(resource2.getErrors().isEmpty()) {
				XtextResource xtextResource = (XtextResource)resource2;
				IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
				List<Issue> issues = resourceValidator.validate(resource2, CheckMode.ALL, CancelIndicator.NullImpl);
				if(issues.isEmpty()){
					validSchemaFound=true;
				}	
				
			}
		}
		if(!validSchemaFound){
			InputStream in3 = new ByteArrayInputStream(enclosingEClassText.getBytes());
			ResourceSet reset3 = new ResourceSetImpl();
			Resource resource3 = reset3.createResource(URI.createURI("platform:/dummy.normaljobruns_45ononeof1anyof3"));
			try {
				resource3.load(in3, reset3.getLoadOptions());
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(resource3.getErrors().isEmpty()) {
				XtextResource xtextResource = (XtextResource)resource3;
				IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
				List<Issue> issues = resourceValidator.validate(resource3, CheckMode.ALL, CancelIndicator.NullImpl);
				if(issues.isEmpty()){
					validSchemaFound=true;
				}	
				
			}
		}
		if(!validSchemaFound){
			InputStream in4 = new ByteArrayInputStream(enclosingEClassText.getBytes());
			ResourceSet reset4 = new ResourceSetImpl();
			Resource resource4 = reset4.createResource(URI.createURI("platform:/dummy.normaljobruns_45ononeof1anyof4"));
			try {
				resource4.load(in4, reset4.getLoadOptions());
			} catch (IOException e) {
				e.printStackTrace();
			}
			if(resource4.getErrors().isEmpty()) {
				XtextResource xtextResource = (XtextResource)resource4;
				IResourceValidator resourceValidator = xtextResource.getResourceServiceProvider().getResourceValidator();
				List<Issue> issues = resourceValidator.validate(resource4, CheckMode.ALL, CancelIndicator.NullImpl);
				if(issues.isEmpty()){
					validSchemaFound=true;
				}	
				
			}
		}
		if(!validSchemaFound){
			error("No valid schema found in the AnyOf NormalJobRuns_45onOneOf1", null);
		}	
	}

	private void independentValidation(String eClassName, List<EObject> processedListName, InputStream inputStream){
		try {
			Method getRule = githubwf.githubwf.services.NormalJobRuns_45onOneOf1GrammarAccess.class.getDeclaredMethod("get"+eClassName+"Rule");
			ParserRule parserRule = (ParserRule) getRule.invoke(grammarAccess);
			List<Issue> issues = new ArrayList<Issue>();
			List<Diagnostic> diagnostics=new ArrayList<Diagnostic>();
			Thread validationThread = new Thread(new Runnable() {
				@Override
			    public void run() {
			    	try {
						URI uri=URI.createURI("platform:/dummy.normaljobruns_45ononeof1");
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

