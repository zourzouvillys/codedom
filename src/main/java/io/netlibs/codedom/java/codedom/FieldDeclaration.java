package io.netlibs.codedom.java.codedom;

import java.util.Set;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;

@Value
@Builder(builderClassName = "Builder")
public class FieldDeclaration implements BodyDeclaration
{

  @Singular
  private final Set<Modifier> modifiers;

  private final TypeRef type;
  private final String name;

  @Override
  public <R> R apply(BodyDeclarationVisitor<R> visitor)
  {
    return visitor.visitField(this);
  }

}
