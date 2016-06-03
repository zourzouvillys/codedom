package io.netlibs.codedom.java.codedom;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class RawTypeRef implements TypeRef
{

  private String raw;

  public RawTypeRef(String raw)
  {
    this.raw = raw;
  }

  @Override
  public <R> R apply(TypeRefVisitor<R> visitor)
  {
    return visitor.visitRawTypeRef(this);
  }

}
