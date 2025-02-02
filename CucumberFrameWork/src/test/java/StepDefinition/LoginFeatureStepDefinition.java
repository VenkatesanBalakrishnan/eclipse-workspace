package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginFeatureStepDefinition {
	
	WebDriver driver;
	
	@Given("Launch Gmail Application")
	public void launch_gmail_application() {
	  
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("http://gmail.com/");
		driver.manage().window().maximize();
		
	}

	@When("Enter the invalid {string}")
	public void enter_the_invalid(String string) {
		
		driver.findElement(By.cssSelector("input[id='identifierId']")).sendKeys(string);
	   
	}

	@When("Click on {string} button")
	public void click_on_button(String string) {
	 
		driver.findElement(By.xpath("//span[text()='Next']")).click();
	}

	@Then("Verify the Error message")
	public void verify_the_error_message() {
		
		WebElement el =driver.findElement(By.xpath("//div[text()='Couldn’t find your Google Account']"));
		Assert.assertTrue("Error Message not displayed", el.isDisplayed());
	   
	}

	@Given("Regression Test Feature")
	public void regression_test_feature() {
	 System.out.println("Regression Test Excecution");
	}

	@Given("Smoke Test Feature")
	public void smoke_test_feature() {
		 System.out.println("Smoke Test Excecution");
	}

	@Given("Sanity Test Feature")
	public void sanity_test_feature() {
		 System.out.println("Sanity Test Excecution");
	}

	@Given("RegressionSanity Test Feature")
	public void regression_sanity_test_feature() {
		 System.out.println("Regression & Sanity Test Excecution");
	}


	@Given("Background Steps")
	public void background_steps() {
	   System.out.println("Background Excecution Method");
	}
	@Before("@Sanity")
	public void brforeHook()
	{
		System.out.println("BEFORE HOOK");
	}
	
	@Before(order=1)
	public void brforeHook1()
	{
		System.out.println("BEFORE HOOK 1 Order 1");
	}
	
	@Before(order=-4)
	public void brforeHook2()
	{
		System.out.println("BEFORE HOOK 2 Order -4");
	}
	@After(order=10)
	public void aftereHook()
	{
		System.out.println("AFTER HOOK 1 Order 10");
	}
	
	@After(order=5)
	public void aftereHook1()
	{
		System.out.println("AFTER HOOK 1 Order 5");
	}
	
	@After("@Sanity")
	public void aftereHook2()
	{
		System.out.println("AFTER HOOK");
	}
}
