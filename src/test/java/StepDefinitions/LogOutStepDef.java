package StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PuppyFind.Pages.HomePage;
import com.PuppyFind.Pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class LogOutStepDef {
	
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	
	@Given("^user is on  homepage$")
	public void user_is_on_homepage() throws InterruptedException {
		
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		loginPage = pageObjectManager.getLoginPage();
		loginPage.useronloginpage();
		loginPage.loginIntoPage();
		loginPage.userAction();
	}
	    
	
	    @When("^user clicks the logout button$")
	public void user_clicks_the_logout_button(){
		
		homePage = pageObjectManager.getHomePage();
		homePage.signOut();
	    
	}

	@Then("^user verifies logout confirmation$")
	public void user_verifies_logout_confirmation()  {
		String msg = driver.getCurrentUrl();
		Assert.assertEquals("https://www.puppyfind.com/login/?alert=logout", msg);
		webDriverManager.closeDriver();
	    
	}

}
