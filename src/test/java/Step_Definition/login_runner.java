package Step_Definition;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= "C:\\Users\\balra\\eclipse-workspace01\\login.id\\src\\test\\resources\\features\\Login.feature",
glue = {"Step_Definition"} ,plugin= {"pretty","junit:target/JunitReports/report.xml",
		"json:target/cucumber.json",
		}  )

public class login_runner {

}
