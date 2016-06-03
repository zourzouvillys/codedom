package io.netlibs.codedom.java.codedom;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ConstantValueExpression implements Expression
{

  private ConstantValue value;

  public ConstantValueExpression(ConstantValue value)
  {
    this.value = value;
  }

  @Override
  public <R> R apply(ExpressionVisitor<R> visitor)
  {
    return visitor.visitConstantValueExpression(this);
  }

}
