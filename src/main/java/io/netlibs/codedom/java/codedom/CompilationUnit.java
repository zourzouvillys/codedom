package io.netlibs.codedom.java.codedom;

import java.util.List;

import lombok.Builder;
import lombok.Singular;

@Builder(builderClassName = "Builder")
public class CompilationUnit
{
  
  @Singular
  private List<TypeDeclaration> types; 

}
