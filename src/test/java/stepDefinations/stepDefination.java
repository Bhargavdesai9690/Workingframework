package stepDefinations;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;


@RunWith(Cucumber.class)

public class stepDefination {
	
WebDriver driver;
	@Given("^User is on NetBanking landing page$")
	public void user_is_on_net_banking_landing_page() throws InterruptedException  {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Desktop\\IT COURSE\\SeleniumJars\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver(); 		
	   driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("jbfhfdhj");
		driver.findElement(By.name("pass")).sendKeys("gshsh");
	    
	    
	}
	@When("^User login into application with username and password$")
	public void user_login_into_application_with_username_and_password()  {
		driver.findElement(By.name("pass")).sendKeys("gshsh");
	    
	}
	@Then("^Home page is populated$")
	public void home_page_is_populated() {
		driver.findElement(By.tagName("button")).click();
	    
	}
	@And("^Cards are displayed$")
	public void cards_are_displayed() {
		System.out.println("cdbbcdbhjc");
	    
	}
}



	/*@Given ("^User is on NetBanking landing page$")
	public void user_is_on_NetBanking_landing_page()  {
	System.out.println("futyfjy");
		
	}
	@When ("^User login into application with username and password$")
	public void User_login_into_application_with_username_and_password()throws Throwable
	{System.out.println("futyfjy");
		
	}
	@Then ("^Home page is populated$")
	public void Home_page_is_populated()throws Throwable
	{System.out.println("htdtytftyt");
		
	}
	@And ("^Cards are displayed$")
	public void Cards_are_displayed()throws Throwable
	{
		System.out.println("futyfjy");
	}
}*/
