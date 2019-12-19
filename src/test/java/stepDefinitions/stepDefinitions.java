package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class stepDefinitions {
	
	WebDriver driver;
	

	
	@Given("^User is on TekSchool of America page$")
	public void user_is_on_TekSchool_of_America_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("Webdriver.chrome.driver", "c://chromedriver.exe");
		
		//instantiation chromeDriver
		driver = new ChromeDriver();
		driver.get("https://tekschoolofamerica.com/");
		
	    
	}

	@When("^User navigate to test Environmene$")
	public void user_navigate_to_test_Environmene() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("//a[text()='Test Environment']")).sendKeys(Keys.ENTER);
	}

	@Then("^Tek School is Displyed$")
	public void tek_School_is_Displyed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		String testEnvPageTitle = driver.getTitle();
		System.out.println(testEnvPageTitle);
	    
	}


}
