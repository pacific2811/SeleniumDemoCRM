package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features ="G:/Eclipse Worspace/FreeCrmBDDFramework/src/main/java/Feature",
		glue={"stepDefination"}
	//	format={"pretty","html:test-output"}
		
		)

public class TestRunner {

}
