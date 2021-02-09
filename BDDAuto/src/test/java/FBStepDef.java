import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBStepDef {
WebDriver driver;
	
	@Given("^User need to be on facebook home page$")
	public void User_need_to_be_on_facebook_home_page()
	{
		System.setProperty("webdriver.chrome.driver","F:\\B21\\Drivers\\chromedriver_win32_B39\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
	}
	
	@When("^User enters first name$")
	public void User_enters_first_name()
	{
	driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Shubham");
	}
	
	@Then("^User checks first name is present$")
	public void checks_first_name_is_present()
	{
		String userNameActual = driver.findElement(By.xpath("//input[@name='firstname']")).getAttribute("value");
		Assert.assertEquals("Shubham", userNameActual);
	}
}
