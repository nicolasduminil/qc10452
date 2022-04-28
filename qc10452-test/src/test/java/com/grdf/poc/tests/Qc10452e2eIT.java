package com.grdf.poc.tests;

import com.grdf.poc.*;
import org.junit.*;

import static org.junit.Assert.*;

public class Qc10452e2eIT
{
  private Qc10452Srv srv;
  
  @Before
  public void before()
  {
    srv = new Qc10452Service().getQc10452Port();
  }
  
  @After
  public void after()
  {
    srv = null;
  }

  @Test
  public void testqc10452Literal()
  {
    assertEquals(">160M3/H", srv.qc10452Literal(">160M3/H"));
  }

  @Test
  public void testqc10452Escape()
  {
    assertEquals("&gt;160M3/H", srv.qc10452Escaped(">160M3/H"));
    assertEquals("&amp;gt;160M3/H", srv.qc10452Escaped("&gt;160M3/H"));
    assertEquals("&lt;160M3/H", srv.qc10452Escaped("<160M3/H"));
    assertEquals("&amp;lt;160M3/H", srv.qc10452Escaped("&lt;160M3/H"));
  }

  @Test
  public void testqc10452Unescape()
  {
    assertEquals(">160M3/H", srv.qc10452Unescaped("&gt;160M3/H"));
    assertEquals("&gt;160M3/H", srv.qc10452Unescaped("&amp;gt;160M3/H"));
    assertEquals("<160M3/H", srv.qc10452Unescaped("&lt;160M3/H"));
    assertEquals("&lt;160M3/H", srv.qc10452Unescaped("&amp;lt;160M3/H"));
  }
}
