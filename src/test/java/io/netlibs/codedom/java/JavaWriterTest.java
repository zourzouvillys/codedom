package io.netlibs.codedom.java;

import java.io.ByteArrayOutputStream;

import org.junit.Test;

import io.netlibs.codedom.java.codedom.Block;
import io.netlibs.codedom.java.codedom.CompilationUnit;
import io.netlibs.codedom.java.codedom.Expressions;
import io.netlibs.codedom.java.codedom.MethodDeclaration;
import io.netlibs.codedom.java.codedom.Modifier;
import io.netlibs.codedom.java.codedom.TypeDeclaration;

public class JavaWriterTest
{

  @Test
  public void test()
  {

    ByteArrayOutputStream os = new ByteArrayOutputStream();

    TypeDeclaration.Builder klass = TypeDeclaration.builder()
        .name("TestClass")
        .modifier(Modifier.PUBLIC)
        .modifier(Modifier.FINAL)
        .javadoc("This is some documentation for this class.")
        .bodyDeclaration(
            MethodDeclaration.builder()
                .type("String")
                .name("getXYZ")
                .modifier(Modifier.PUBLIC)
                .body(Block.builder()
                    .statement(Expressions.$return("hello"))
                    .build())
                .build());

    CompilationUnit unit = CompilationUnit.builder()
        .packageName("io.netlibs.codedom.example")
        .type(klass.build())
        .build();

    new JavaWriter(os).visitCompilationUnit(unit);

    System.err.println(os.toString());

  }

}
