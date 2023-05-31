package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
tags="",
features="src/test/features/exp/orange.feature",
glue="JavaCucumber",
publish = true,
plugin = {
		"pretty","html:target/rapport.html","json:target/rapportjson.json"
}
)
public class Runer {
	

}
