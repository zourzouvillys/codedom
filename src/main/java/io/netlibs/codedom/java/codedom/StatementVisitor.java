package io.netlibs.codedom.java.codedom;

public interface StatementVisitor<R>
{

  R visitReturnStatement(ReturnStatement stmt);

  R visitExpressionStatement(ExpressionStatement stmt);

}
