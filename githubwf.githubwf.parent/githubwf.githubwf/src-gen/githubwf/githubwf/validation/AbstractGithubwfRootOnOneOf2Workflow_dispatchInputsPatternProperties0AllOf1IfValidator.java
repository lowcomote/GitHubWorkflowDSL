/*
 * generated by Xtext 2.29.0
 */
package githubwf.githubwf.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractGithubwfRootOnOneOf2Workflow_dispatchInputsPatternProperties0AllOf1IfValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://jku.bise.at/githubwf"));
		result.add(EPackage.Registry.INSTANCE.getEPackage("http://at.jku.bise/jsonMM"));
		return result;
	}
}
