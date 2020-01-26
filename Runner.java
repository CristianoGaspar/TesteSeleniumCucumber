package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@CucumberOptions(
		glue = "steps",
		features = "resources/features/incluir_nova_conta.feature"
		)
@RunWith(Cucumber.class)
public class Runner {

}
