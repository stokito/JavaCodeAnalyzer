package demo.codeanalyzer.common.rule;

import demo.codeanalyzer.common.model.ClassFile;

import java.util.Collection;

import demo.codeanalyzer.common.model.ErrorDescription;
import demo.codeanalyzer.common.model.Location;


/**
 * Executes rules on a subject
 *
 * @param E the TypeElement being visited
 * @author Seema Richard (Seema.Richard@ust-global.com)
 * @author Deepa Sobhana (Deepa.Sobhana@ust-global.com)
 */
public abstract class AbstractCodeRule<E> implements JavaCodeRule<E> {

	/**
	 * Abstract method to apply a rule
	 *
	 * @param clazzInfo the element where the rule will be applied.
	 * @return Rule violations detected after applying the rule
	 */
	protected abstract Collection apply(ClassFile clazzInfo);

	/**
	 * Executes the rule on the subject
	 *
	 * @return Rule violations detected after applying the rule
	 */
	public final Collection execute(ClassFile clazzInfo) {
		return apply(clazzInfo);
	}

	public ErrorDescription setErrorDetails(String errorMessage, Location errorLoc) {
		ErrorDescription errorDesc = new ErrorDescription();
		errorDesc.setErrorMessages(errorMessage);
		errorDesc.setErrorLocation(errorLoc);
		return errorDesc;
	}
}
