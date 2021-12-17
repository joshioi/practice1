package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"D:/selenium/BDDPract1/src/main/java/resources/login.feature"},
		glue= {"stepDef"},
		monochrome = true //display the console output in a proper readable format
		//strict = true
		
		)

public class TestRunner {

}
