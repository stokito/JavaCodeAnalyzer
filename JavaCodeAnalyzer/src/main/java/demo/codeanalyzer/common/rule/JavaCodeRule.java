package demo.codeanalyzer.common.rule;

import demo.codeanalyzer.common.model.ClassFile;

import java.util.Collection;

/**
 * Interface to execute rule on a subject
 *
 * @param E the TypeElement being visited
 * @author Seema Richard (Seema.Richard@ust-global.com)
 * @author Deepa Sobhana (Deepa.Sobhana@ust-global.com)
 */
public interface JavaCodeRule<E> {
	/**
	 * Executes the rule on the subject
	 *
	 */
	public Collection execute(ClassFile clazzInfo);
}
