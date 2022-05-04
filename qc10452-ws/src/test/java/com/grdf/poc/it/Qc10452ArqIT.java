package com.grdf.poc.it;

import com.grdf.poc.*;
import org.jboss.arquillian.container.test.api.*;
import org.jboss.arquillian.junit.*;
import org.jboss.arquillian.test.api.*;
import org.jboss.shrinkwrap.api.*;
import org.jboss.shrinkwrap.api.spec.*;
import org.jboss.shrinkwrap.resolver.api.maven.*;
import org.junit.*;
import org.junit.runner.*;

import javax.xml.namespace.*;
import javax.xml.ws.*;
import java.net.*;

import static org.junit.Assert.*;
import static org.junit.runners.MethodSorters.*;

@RunWith(Arquillian.class)
@FixMethodOrder(NAME_ASCENDING)
public class Qc10452ArqIT
{
  @ArquillianResource
  private URL url;
  private static Service service;

  @Deployment(testable = false)
  public static WebArchive createDeployment()
  {
    return ShrinkWrap.create(WebArchive.class, "my.war").addPackage("com.grdf.poc").addAsLibraries(Maven.resolver().resolve("org.apache.commons:commons-text:1.9").withTransitivity().asFile());
  }

  @Before
  public void setupClass() throws MalformedURLException
  {
    service = Service.create(
      new URL(url, "Qc10452Service?WSDL"),
      new QName("http://www.poc.grdf.com", "Qc10452Service"));
  }

  @Test
  public void test123()
  {
    assertEquals("&gt;160M3/H", service.getPort(Qc10452Srv.class).qc10452Escaped(">160M3/H"));
  }

  @Test
  public void testQc10452EscapeWithArquilian()
  {
    assertEquals("&gt;160M3/H", service.getPort(Qc10452Srv.class).qc10452Escaped(">160M3/H"));
    assertEquals("&amp;gt;160M3/H", service.getPort(Qc10452Srv.class).qc10452Escaped("&gt;160M3/H"));
    assertEquals("&lt;160M3/H", service.getPort(Qc10452Srv.class).qc10452Escaped("<160M3/H"));
    assertEquals("&amp;lt;160M3/H", service.getPort(Qc10452Srv.class).qc10452Escaped("&lt;160M3/H"));
  }

  @Test
  public void testQc10452UnescapeWithArquilian()
  {
    assertEquals(">160M3/H", service.getPort(Qc10452Srv.class).qc10452Unescaped("&gt;160M3/H"));
    assertEquals("&gt;160M3/H", service.getPort(Qc10452Srv.class).qc10452Unescaped("&amp;gt;160M3/H"));
    assertEquals("<160M3/H", service.getPort(Qc10452Srv.class).qc10452Unescaped("&lt;160M3/H"));
    assertEquals("&lt;160M3/H", service.getPort(Qc10452Srv.class).qc10452Unescaped("&amp;lt;160M3/H"));
  }
}
