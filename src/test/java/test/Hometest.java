package test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "Features", glue = "stepdef")
public class Hometest extends AbstractTestNGCucumberTests {


}
