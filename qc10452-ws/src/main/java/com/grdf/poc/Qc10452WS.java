package com.grdf.poc;

import org.apache.commons.text.*;

import javax.jws.*;

@WebService(serviceName = "Qc10452Service", portName = "Qc10452Port", targetNamespace = "http://www.poc.grdf.com", endpointInterface = "com.grdf.poc.Qc10452Srv")
public class Qc10452WS implements Qc10452Srv
{
  @Override
  public String qc10452Literal(String data)
  {
    return data;
  }

  @Override
  public String qc10452Escaped(String data)
  {
    return StringEscapeUtils.escapeHtml4(data);
  }

  @Override
  public String qc10452Unescaped(String data)
  {
    return StringEscapeUtils.unescapeHtml4(data);
  }
}
