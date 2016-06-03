package io.netlibs.codedom.java.codedom;

public interface TypeRefVisitor<R>
{

  R visitSimpleClassTypeRef(SimpleClassTypeRef ref);

  R visitRawTypeRef(RawTypeRef rawTypeRef);

}
