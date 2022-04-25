package com.grdf.poc;

import org.apache.commons.text.*;

import javax.jws.*;
import javax.jws.soap.*;

@WebService(name="TestWithSoapUI", serviceName="TestWithSoapUIService", portName="TestWithSoapUIPort", targetNamespace="http://www.poc.grdf.com")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT)
public class TestWithSoapUI
{
  @WebMethod
  public String qc10452Literal(String data)
  {
    return data;
  }

  @WebMethod
  public String qc10452Escaped(String data)
  {
    return StringEscapeUtils.escapeHtml4(data);
  }

  public String qc10452Unescaped(String data)
  {
    return StringEscapeUtils.unescapeHtml4(data);
  }
}
