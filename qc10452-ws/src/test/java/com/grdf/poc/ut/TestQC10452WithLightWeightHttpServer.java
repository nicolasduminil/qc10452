package com.grdf.poc.ut;

import com.grdf.poc.*;
import org.junit.*;

import javax.xml.namespace.*;
import javax.xml.ws.*;
import java.net.*;

import static org.junit.Assert.*;

public class TestQC10452WithLightWeightHttpServer
{
  @Test
  public void testWithLightWeightHttpServer() throws MalformedURLException
  {
    Endpoint endpoint = Endpoint.publish("http://localhost:8080/Qc10452Service", new Qc10452WS());
    assertTrue(endpoint.isPublished());
    assertEquals("http://schemas.xmlsoap.org/wsdl/soap/http", endpoint.getBinding().getBindingID());
    URL wsdlDocumentLocation = new URL("http://localhost:8080/Qc10452Service?WSDL");
    String namespaceURI = "http://www.poc.grdf.com";
    String servicePart = "Qc10452Service";
    String portName = "Qc10452Port";
    QName serviceQN = new QName(namespaceURI, servicePart);
    QName portQN = new QName(namespaceURI, portName);
    Service service = Service.create(wsdlDocumentLocation, serviceQN);
    Qc10452Srv qc10452 = service.getPort(portQN, Qc10452Srv.class);
    assertEquals(">160M3/H", qc10452.qc10452Literal(">160M3/H"));
    assertEquals("&gt;160M3/H", qc10452.qc10452Escaped(">160M3/H"));
    assertEquals("&amp;gt;160M3/H", qc10452.qc10452Escaped("&gt;160M3/H"));
    assertEquals("&lt;160M3/H", qc10452.qc10452Escaped("<160M3/H"));
    assertEquals("&amp;lt;160M3/H", qc10452.qc10452Escaped("&lt;160M3/H"));
    assertEquals(">160M3/H", qc10452.qc10452Unescaped("&gt;160M3/H"));
    assertEquals("&gt;160M3/H", qc10452.qc10452Unescaped("&amp;gt;160M3/H"));
    assertEquals("<160M3/H", qc10452.qc10452Unescaped("&lt;160M3/H"));
    assertEquals("&lt;160M3/H", qc10452.qc10452Unescaped("&amp;lt;160M3/H"));
  }
}
