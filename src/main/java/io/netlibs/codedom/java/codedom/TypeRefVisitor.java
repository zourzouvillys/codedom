package io.netlibs.codedom.java.codedom;

public interface TypeRefVisitor<R>
{

  R visitSimpleClassTypeRef(SimpleClassTypeRef ref);

}
