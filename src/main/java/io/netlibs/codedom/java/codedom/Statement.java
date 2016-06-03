package io.netlibs.codedom.java.codedom;

public interface Statement
{
  
  <R> R apply(StatementVisitor<R> visitor);

}
