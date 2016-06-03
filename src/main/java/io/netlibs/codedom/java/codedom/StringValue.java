package io.netlibs.codedom.java.codedom;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class StringValue implements ConstantValue
{

  private String value;

  public StringValue(String value)
  {
    this.value = value;
  }

  @Override
  public <R> R apply(ConstantValueVisitor<R> visitor)
  {
    return visitor.visitStringValue(this);
  }

}
