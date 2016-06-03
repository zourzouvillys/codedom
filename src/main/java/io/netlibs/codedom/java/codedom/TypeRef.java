package io.netlibs.codedom.java.codedom;

public interface TypeRef
{

  <R> R apply(TypeRefVisitor<R> ref);

}
