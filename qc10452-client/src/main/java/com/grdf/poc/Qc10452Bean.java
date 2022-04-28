package com.grdf.poc;

import javax.ejb.*;
import javax.xml.namespace.*;
import javax.xml.ws.*;

@Stateless
@Local(Iqc10452.class)
public class Qc10452Bean implements Iqc10452
{
  @WebServiceRef(type=Qc10452Service.class)
  private Qc10452Service service;

  public String qc10452Literal(String data)
  {
    return service.getQc10452Port().qc10452Literal(data);
  }

  public String qc10452Escaped(String data)
  {
    return service.getQc10452Port().qc10452Escaped(data);
  }

  public String qc10452Unescaped(String data)
  {
    return service.getQc10452Port().qc10452Unescaped(data);
  }
}
