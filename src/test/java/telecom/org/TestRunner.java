package telecom.org;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
                  glue =   "telecom.org", 
                  monochrome = true,
                  plugin =  "html:target", 
                  tags   =  "@tag1")




public class TestRunner {

}
 