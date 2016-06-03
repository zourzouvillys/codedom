package io.netlibs.codedom.java.codedom;

public class Expressions
{

  public static ReturnStatement $return(Expression expr)
  {
    return ReturnStatement.builder().expression(expr).build();
  }

  public static ReturnStatement $return(ConstantValue value)
  {
    return ReturnStatement.builder().expression(constant(value)).build();
  }

  public static ReturnStatement $return(String value)
  {
    return ReturnStatement.builder().expression(constant(value)).build();
  }

  public static FieldExpression thisField(String name)
  {
    return FieldExpression.builder().expression(ThisExpression.instance()).name(name).build();
  }

  public static SimpleNameExpression simpleName(String name)
  {
    return SimpleNameExpression.builder().name(name).build();
  }

  public static ConstantValueExpression constant(ConstantValue value)
  {
    return new ConstantValueExpression(value);
  }

  public static ConstantValueExpression constant(String string)
  {
    return constant(new StringValue(string));
  }

}
