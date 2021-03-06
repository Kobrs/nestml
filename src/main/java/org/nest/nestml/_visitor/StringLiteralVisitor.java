package org.nest.nestml._visitor;

import org.nest.nestml._ast.ASTExpr;
import org.nest.nestml._symboltable.typechecking.Either;

import static org.nest.nestml._symboltable.predefined.PredefinedTypes.getStringType;

/**
 * @author ptraeder
 */
public class StringLiteralVisitor implements NESTMLVisitor {

  @Override
  public void visit(ASTExpr expr) {
    expr.setType(Either.value(getStringType()));
  }
}
