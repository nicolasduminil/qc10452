Feature: Testing the Qc10452 web service
  Users should be able to submit qc10452Literal, qc10452Escaped and qc10452Unescaped against the Qc10452 web service

  Background:
    Given web service proxy is instantiated

  Scenario: Call qc10452Literal
    When user wants to get data literal
    Then data literal is successfully returned

  Scenario: Call qc10452Escaped
    When user wants to get HTML escaped data
    Then HTML escaped data is successfully returned

  Scenario: Call qc10452Unescaped
    When user wants to get HTML unescaped data
    Then HTML unescaped data is successfully returned