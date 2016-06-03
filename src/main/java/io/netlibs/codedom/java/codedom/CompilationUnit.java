package io.netlibs.codedom.java.codedom;

import java.util.List;

import lombok.Builder;
import lombok.Singular;
import lombok.Value;

@Value
@Builder(builderClassName = "Builder")
public class CompilationUnit
{

  private final String packageName;

  @Singular
  private List<TypeDeclaration> types;

}
