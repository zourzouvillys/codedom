package io.netlibs.codedom.java;

import java.io.PrintStream;

/**
 * An indentation implementation which formats with braces on a new line, and a
 * 2 spaces per indentation.
 * 
 * @author Theo Zourzouvillys
 *
 */

public class DefaultJavaIndenter implements JavaIndender
{

  @Override
  public void indent(PrintStream out, int depth, int extra)
  {
    for (int i = 0; i < depth + extra; ++i)
      out.print("  ");
  }

}
