package Snapengage_Cucumber.snapengage_Stepdefs;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class Login {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/Users/devyansh/Downloads/chromedriver");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		this.driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
		
		}
	
	@After
	public void tearDown() {
		this.driver.manage().deleteAllCookies();
		this.driver.quit();
		this.driver = null;
	}
	
	
	@Given("^User navigates to snapengage sigin Page$")
	public void user_navigates_to_snapengage_sigin_Page() throws Throwable {
		driver.get("https://snapengage-qa.appspot.com/signin?to=hub");
		Assert.assertEquals("SnapEngage QA | Sign In", driver.getTitle());
	    driver.findElement(By.id("signin-label")).isDisplayed();
	    driver.findElement(By.id("password-label")).isDisplayed();
	    
		
	}

	@And("^User enters the username and password$")
	public void user_enters_the_username_and_password() throws Throwable {
		
		driver.findElement(By.id("email")).sendKeys("pedroalmodovar@test.com");
		driver.findElement(By.name("password")).sendKeys("1q2w3e");
	
	}

	@When("^User clicks on the sigin Button$")
	public void user_clicks_on_the_sigin_Button() throws Throwable {

		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
	}

	@Then("^User will see the Agent portal succcessfully$")
	public void user_will_see_the_Agent_portal_succcessfully() throws Throwable {
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(scrFile, new File("\\Users\\devyansh\\Lalitha_cucumber\\SnapEngage_Lalitha\\screenshot.png"));
		WebElement live = driver.findElement(By.id("accordion-item-live"));
		Assert.assertEquals(true, live.isDisplayed());

	}

}
