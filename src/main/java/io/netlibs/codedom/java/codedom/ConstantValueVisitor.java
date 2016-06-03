package io.netlibs.codedom.java.codedom;

public interface ConstantValueVisitor<R>
{
  
  <R> R visitStringValue(StringValue value);

}
