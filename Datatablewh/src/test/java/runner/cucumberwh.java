package runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
	features="src/test/resources/feature/TC01-JOBS.feature",
	tags="",
	glue="Steps"
		)
public class cucumberwh extends AbstractTestNGCucumberTests {
	
	@DataProvider(parallel=true)
	 public Object[][] scenarios() {
        return super.scenarios();
}

}
