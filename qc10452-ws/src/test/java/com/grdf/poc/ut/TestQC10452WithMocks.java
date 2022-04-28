package com.grdf.poc.ut;

import com.grdf.poc.*;
import org.apache.commons.text.*;
import org.junit.*;
import org.junit.runner.*;
import org.mockito.*;
import org.mockito.junit.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class TestQC10452WithMocks
{
  @Mock
  private Iqc10452 qc10452Mock;
  private final ArgumentCaptor<String> param = ArgumentCaptor.forClass(String.class);

  @Before
  public void before()
  {
    MockitoAnnotations.openMocks(this);
    when (qc10452Mock.qc10452Literal(param.capture())).then(s -> param.getValue());
    when (qc10452Mock.qc10452Escaped(param.capture())).then(s -> StringEscapeUtils.escapeHtml4(param.getValue()));
    when (qc10452Mock.qc10452Unescaped(param.capture())).then(s -> StringEscapeUtils.unescapeHtml4(param.getValue()));
  }

  @Test
  public void testQc10452LiteralWithMocks()
  {
    assertEquals(">160M3/H", qc10452Mock.qc10452Literal(">160M3/H"));
  }

  @Test
  public void testqc10452Escape()
  {
    assertEquals("&gt;160M3/H", qc10452Mock.qc10452Escaped(">160M3/H"));
    assertEquals("&amp;gt;160M3/H", qc10452Mock.qc10452Escaped("&gt;160M3/H"));
    assertEquals("&lt;160M3/H", qc10452Mock.qc10452Escaped("<160M3/H"));
    assertEquals("&amp;lt;160M3/H", qc10452Mock.qc10452Escaped("&lt;160M3/H"));
  }

  @Test
  public void testqc10452Unescape()
  {
    assertEquals(">160M3/H", qc10452Mock.qc10452Unescaped("&gt;160M3/H"));
    assertEquals("&gt;160M3/H", qc10452Mock.qc10452Unescaped("&amp;gt;160M3/H"));
    assertEquals("<160M3/H", qc10452Mock.qc10452Unescaped("&lt;160M3/H"));
    assertEquals("&lt;160M3/H", qc10452Mock.qc10452Unescaped("&amp;lt;160M3/H"));
  }
}
