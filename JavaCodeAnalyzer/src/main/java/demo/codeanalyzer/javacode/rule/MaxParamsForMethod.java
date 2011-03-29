package demo.codeanalyzer.javacode.rule;

import java.util.ArrayList;
import java.util.Collection;

import demo.codeanalyzer.common.model.ClassFile;
import demo.codeanalyzer.common.model.ErrorDescription;
import demo.codeanalyzer.common.model.Method;
import demo.codeanalyzer.common.rule.AbstractCodeRule;
import demo.codeanalyzer.common.util.CodeAnalyzerUtil;

/**
 * Rule which checks the maximum allowed parameters
 * for java methods
 *
 * @author Seema Richard (Seema.Richard@ust-global.com)
 * @author Deepa Sobhana (Deepa.Sobhana@ust-global.com)
 */
public class MaxParamsForMethod extends AbstractCodeRule {

	private static final int MAX_METHOD_PARAM = 2;

	@Override
	protected Collection apply(ClassFile clazzInfo) {
		for (Method method : clazzInfo.getMethods()) {
			if (method.getParameters() != null && method.getParameters().size() > MAX_METHOD_PARAM) {
				String errorMessage = String.format("%s : The method '%s' exceeded the maximum allowed parameters",
					CodeAnalyzerUtil.getSimpleNameFromQualifiedName(clazzInfo.getName()), method.getName());
				Collection<ErrorDescription> errorList = new ArrayList<ErrorDescription>();
				errorList.add(setErrorDetails(errorMessage, method.getLocationInfo()));
				return errorList;
			}
		}
		return null;
	}
}
