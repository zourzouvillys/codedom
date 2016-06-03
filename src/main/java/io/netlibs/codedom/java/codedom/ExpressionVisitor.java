package io.netlibs.codedom.java.codedom;

public interface ExpressionVisitor<R>
{

  R visitFieldExpression(FieldExpression expr);

  R visitThisExpression(ThisExpression expr);

  R visitAssignmentExpression(AssignmentExpression expr);

  R visitSimpleNameExpression(SimpleNameExpression expr);

  R visitConstantValueExpression(ConstantValueExpression expr);

}
