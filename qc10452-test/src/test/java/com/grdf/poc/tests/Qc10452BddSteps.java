package com.grdf.poc.tests;

import com.grdf.poc.*;
import io.cucumber.java.en.*;

import static org.junit.Assert.*;

public class Qc10452BddSteps
{
  private Qc10452Srv srv = new Qc10452Service().getQc10452Port();
  private String response;

  @Given("web service proxy is instantiated")
  public void webServiceProxyIsInstantiated()
  {
    srv = new Qc10452Service().getQc10452Port();
  }

  @When("user wants to get data literal")
  public void userWantsToGetDataLiteral()
  {
    response = srv.qc10452Literal(">160M3/H");
  }

  @Then("data literal is successfully returned")
  public void dataLiteralSuccessfullyReturned()
  {
    assertEquals(">160M3/H", response);
  }

  @When("user wants to get HTML escaped data")
  public void userWantsToGetHtmlEscapedData()
  {
    response = srv.qc10452Escaped(">160M3/H");
  }

  @Then("HTML escaped data is successfully returned")
  public void htmlEscapedDataSuccessfullyReturned()
  {
    assertEquals("&gt;160M3/H", response);
  }

  @When("user wants to get HTML unescaped data")
  public void userWantsToGetHtmlUnescapedData()
  {
    response = srv.qc10452Unescaped("&gt;160M3/H");
  }

  @Then("HTML unescaped data is successfully returned")
  public void htmlUnescapedDataSuccessfullyReturned()
  {
    assertEquals(">160M3/H", response);
  }
}
