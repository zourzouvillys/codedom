package io.netlibs.codedom.java.codedom;

import lombok.Builder;
import lombok.Value;

@Value
@Builder(builderClassName = "Builder")
public class SingleVariableDeclaration
{

  private String name;
  private TypeRef type;
  private boolean varargs;
  private int modifiers;

}
