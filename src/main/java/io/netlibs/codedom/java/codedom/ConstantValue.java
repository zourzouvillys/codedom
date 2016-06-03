package io.netlibs.codedom.java.codedom;

public interface ConstantValue
{

  <R> R apply(ConstantValueVisitor<R> visitor);

}
