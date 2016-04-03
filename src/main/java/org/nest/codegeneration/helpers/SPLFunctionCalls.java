package org.nest.codegeneration.helpers;

import org.nest.commons._ast.ASTFunctionCall;

/**
 * TODO
 *
 * @author plotnikov
 */
public class SPLFunctionCalls {
  public String printFunctionName(final ASTFunctionCall astFunctionCall) {
    return astFunctionCall.getCalleeName();
  }

  public boolean isIntegrate(final ASTFunctionCall astFunctionCall) {
    return astFunctionCall.getCalleeName().equals("integrate");
  }

}
