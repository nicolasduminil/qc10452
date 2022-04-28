package com.grdf.poc.tests;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/resources/it/features")
public class Qc10452Bdd
{
}
