package io.netlibs.codedom.java;

import java.io.OutputStream;
import java.io.PrintStream;

public interface JavaIndender
{

  void indent(PrintStream out, int depth, int extra);

}
