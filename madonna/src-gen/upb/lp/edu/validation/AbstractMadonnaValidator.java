/*
 * generated by Xtext 2.31.0
 */
package upb.lp.edu.validation;

import java.util.ArrayList;
import java.util.List;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.AbstractDeclarativeValidator;

public abstract class AbstractMadonnaValidator extends AbstractDeclarativeValidator {
	
	@Override
	protected List<EPackage> getEPackages() {
		List<EPackage> result = new ArrayList<EPackage>();
		result.add(upb.lp.edu.madonna.MadonnaPackage.eINSTANCE);
		return result;
	}
}