package io.netlibs.codedom.java.codedom;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class SimpleClassTypeRef implements TypeRef
{

  private String scope;
  private final String className;

  public SimpleClassTypeRef(String scope, String className)
  {
    this.scope = scope;
    this.className = className;
  }

  @Override
  public <R> R apply(TypeRefVisitor<R> ref)
  {
    return ref.visitSimpleClassTypeRef(this);
  }

}
