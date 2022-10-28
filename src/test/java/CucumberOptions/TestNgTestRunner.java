package CucumberOptions;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= "C:\\Users\\Admin\\Desktop\\IT COURSE\\Selenium_Workspace\\Automation3\\src\\test\\java\\features\\Login.feature",
glue="stepDefinations")
public class TestNgTestRunner extends AbstractTestNGCucumberTests {

}
