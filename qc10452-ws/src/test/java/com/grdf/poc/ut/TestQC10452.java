package com.grdf.poc.ut;

import com.grdf.poc.*;
import org.junit.*;

import static org.junit.Assert.*;

public class TestQC10452
{
  private static Qc10452WS qc10452ws = new Qc10452WS();

  @Test
  public void testqc10452Literal()
  {
    assertEquals(">160M3/H", qc10452ws.qc10452Literal(">160M3/H"));
  }

  @Test
  public void testqc10452Escape()
  {
    assertEquals("&gt;160M3/H", qc10452ws.qc10452Escaped(">160M3/H"));
    assertEquals("&amp;gt;160M3/H", qc10452ws.qc10452Escaped("&gt;160M3/H"));
    assertEquals("&lt;160M3/H", qc10452ws.qc10452Escaped("<160M3/H"));
    assertEquals("&amp;lt;160M3/H", qc10452ws.qc10452Escaped("&lt;160M3/H"));
  }

  @Test
  public void testqc10452Unescape()
  {
    assertEquals(">160M3/H", qc10452ws.qc10452Unescaped("&gt;160M3/H"));
    assertEquals("&gt;160M3/H", qc10452ws.qc10452Unescaped("&amp;gt;160M3/H"));
    assertEquals("<160M3/H", qc10452ws.qc10452Unescaped("&lt;160M3/H"));
    assertEquals("&lt;160M3/H", qc10452ws.qc10452Unescaped("&amp;lt;160M3/H"));
  }
}
