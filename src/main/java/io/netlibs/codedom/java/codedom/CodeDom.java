package io.netlibs.codedom.java.codedom;

import java.util.Arrays;

public class CodeDom
{

  public static CompilationUnit unitOf(String packageName, TypeDeclaration... types)
  {
    return CompilationUnit.builder().packageName(packageName).types(Arrays.asList(types)).build();
  }

}
