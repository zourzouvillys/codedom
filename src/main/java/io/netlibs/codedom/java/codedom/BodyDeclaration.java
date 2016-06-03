package io.netlibs.codedom.java.codedom;

public interface BodyDeclaration
{

  <R> R apply(BodyDeclarationVisitor<R> visitor);

}
