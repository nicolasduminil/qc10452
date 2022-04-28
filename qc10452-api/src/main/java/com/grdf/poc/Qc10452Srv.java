package com.grdf.poc;

import javax.jws.*;
import javax.jws.soap.*;

@WebService(name = "Qc10452Srv")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT)
public interface Qc10452Srv extends Iqc10452
{
  @WebMethod
  @WebResult(name="literalData")
  public String qc10452Literal(@WebParam(name="data2literal")String data);
  @WebMethod
  @WebResult(name="escapedData")
  public String qc10452Escaped(@WebParam(name="data2escape")String data);
  @WebMethod
  @WebResult(name="unescapedData")
  public String qc10452Unescaped(@WebParam(name="data2unescape")String data);
}
