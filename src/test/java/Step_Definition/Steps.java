package Step_Definition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	
	WebDriver driver=null;
	

@Given("browser is open")
public void browser_is_open() {
   System.out.println("inside the step-browser is open"); 
   System.setProperty("webdriver.chrome.driver","C:\\Users\\balra\\eclipse-workspace01\\login.id\\src\\test\\resources\\driver\\chromedriver.exe");
   driver=new ChromeDriver();
   driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
   driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
   
}
@And("user is on loginpage")
public void user_is_on_loginpage() {
	driver.navigate().to("https://example.testproject.io/web/");
	System.out.println("inside the step-user is on login page");
	
}
@When("user enters maria and {int}")
public void user_enters_maria_and(Integer int1) throws InterruptedException {
	driver.findElement(By.id("name")).sendKeys("maria");
	driver.findElement(By.id("password")).sendKeys("12345");
	Thread.sleep(2000);
	
	
}
@Then("user clicks login page")
public void user_clicks_login_page() {
	driver.findElement(By.id("login")).click();
	System.out.println("inside the step-user clicks login page");
	
}

@And("user is navigated to home page")
public void user_is_navigated_to_home_page() throws InterruptedException {
	driver.findElement(By.id("logout")).isDisplayed();
	Thread.sleep(2000);
	driver.close();
	driver.quit();
	
	
	
	System.out.println("inside the step-user is navigated to home page");
}

@When("user enters rima and {int}")
public void user_enters_rima_and(Integer int1) throws InterruptedException {
	driver.findElement(By.id("name")).sendKeys("rima");
	driver.findElement(By.id("password")).sendKeys("12345");
	Thread.sleep(2000);
	
   
}




}
