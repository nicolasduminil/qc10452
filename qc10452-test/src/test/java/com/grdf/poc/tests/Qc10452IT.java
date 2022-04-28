package com.grdf.poc.tests;

import org.jboss.arquillian.container.test.api.*;
import org.jboss.arquillian.junit.*;
import org.jboss.shrinkwrap.api.*;
import org.jboss.shrinkwrap.api.spec.*;
import org.junit.*;
import org.junit.runner.*;

import java.io.*;

@RunWith(Arquillian.class)
public class Qc10452IT
{
  /*@EJB
  private Iqc10452 qc10452;*/

  @Deployment
  public static WebArchive createDeployment()
  {
    return ShrinkWrap.createFromZipFile(WebArchive.class, new File("target/qc10452-test.war"));
  }

  @Test
  public void testQc10452LiteralWithArquilian()
  {
    /*assertNotNull(qc10452);
    assertEquals(">160M3/H", qc10452.qc10452Literal(">160M3/H"));*/
  }
}
