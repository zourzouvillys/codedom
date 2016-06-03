package io.netlibs.codedom.java.codedom;

public interface Expression
{

  <R> R apply(ExpressionVisitor<R> visitor);
  
}
