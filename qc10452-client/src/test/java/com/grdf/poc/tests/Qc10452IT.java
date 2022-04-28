package com.grdf.poc.tests;

import com.grdf.poc.*;
import org.jboss.arquillian.container.test.api.*;
import org.jboss.arquillian.junit.*;
import org.jboss.shrinkwrap.api.*;
import org.jboss.shrinkwrap.api.spec.*;
import org.junit.*;
import org.junit.runner.*;

import javax.xml.ws.*;
import java.io.*;

import static org.junit.Assert.*;

@RunWith(Arquillian.class)
public class Qc10452IT
{
  @WebServiceRef(type = Qc10452Service.class)
  private Qc10452Service qc10452ws;

  @Deployment
  public static WebArchive createDeployment()
  {
    return ShrinkWrap.createFromZipFile(WebArchive.class, new File("target/qc10452-client.war"));
  }

  @Test
  public void testService()
  {
    assertNotNull(qc10452ws);
  }

  @Test
  public void testQc10452LiteralWithArquilian()
  {
    assertEquals(">160M3/H", qc10452ws.getQc10452Port().qc10452Literal(">160M3/H"));
  }

  @Test
  public void testQc10452EscapeWithArquilian()
  {
    assertEquals("&gt;160M3/H", qc10452ws.getQc10452Port().qc10452Escaped(">160M3/H"));
    assertEquals("&amp;gt;160M3/H", qc10452ws.getQc10452Port().qc10452Escaped("&gt;160M3/H"));
    assertEquals("&lt;160M3/H", qc10452ws.getQc10452Port().qc10452Escaped("<160M3/H"));
    assertEquals("&amp;lt;160M3/H", qc10452ws.getQc10452Port().qc10452Escaped("&lt;160M3/H"));
  }

  @Test
  public void testQc10452UnescapeWithArquilian()
  {
    assertEquals(">160M3/H", qc10452ws.getQc10452Port().qc10452Unescaped("&gt;160M3/H"));
    assertEquals("&gt;160M3/H", qc10452ws.getQc10452Port().qc10452Unescaped("&amp;gt;160M3/H"));
    assertEquals("<160M3/H", qc10452ws.getQc10452Port().qc10452Unescaped("&lt;160M3/H"));
    assertEquals("&lt;160M3/H", qc10452ws.getQc10452Port().qc10452Unescaped("&amp;lt;160M3/H"));
  }
}
