package io.netlibs.codedom.java;

import io.netlibs.codedom.java.codedom.SimpleClassTypeRef;
import io.netlibs.codedom.java.codedom.TypeRef;

public class Types
{

  public static SimpleClassTypeRef $class(String scope, String className)
  {
    return new SimpleClassTypeRef(scope, className);
  }

  public static TypeRef string()
  {
    return $class("java.lang", "String");
  }

}
