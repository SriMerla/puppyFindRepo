 package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= 	{
								"C:/Users/srime/eclipse-workspace1/PuppyFind/src/test/java/Features/"
							},
plugin = { "pretty", 
		"html:target/cucumber-html-report",
		"json:target/cucumber.json",
		"junit:target/cucumber.xml",
		"rerun:target/rerun.txt"},
        glue= {"StepDefinitions"}   
       )
public class TestRun {
	

}
