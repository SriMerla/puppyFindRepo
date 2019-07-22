package StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.PuppyFind.Pages.HomePage;
import com.PuppyFind.Pages.LoginPage;
import com.PuppyFind.Pages.UpdatePage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import managers.PageObjectManager;
import managers.WebDriverManager;
import util.CONSTANTS;

public class UpdateAccount {
	
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	UpdatePage updatePage;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	
	@Given("^user is on webPage and logs in$")
	public void user_is_on_webPage_and_logs_in() throws InterruptedException {
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		loginPage = pageObjectManager.getLoginPage();
		loginPage.useronloginpage();
		loginPage.loginIntoPage();
		loginPage.userAction();
	    
	}

	@Given("^user navigates to My Account$")
	public void user_navigates_to_My_Account() {
		homePage = pageObjectManager.getHomePage();
		homePage.myAccount.click();
	    
	}

	@When("^user enters the details to update the account$")
	public void user_enters_the_details_to_update_the_account() throws InterruptedException {
		updatePage = pageObjectManager.getUpdatePage();
		updatePage.updateContactInfo("james", "smith");
	}

	/*
	 * @Then("^user login in to the web page with new credentials$") public void
	 * user_login_in_to_the_web_page_with_new_credentials() throws
	 * InterruptedException { loginPage.Email.sendKeys("puppydemo@gmail.com");
	 * loginPage.password.sendKeys("testpuppy"); loginPage.userAction();
	 */
	    
	//}

	@Then("^verifies the login confirmation$")
	public void verifies_the_login_confirmation() throws InterruptedException {
		updatePage.updateConfirmaionMsg();
		System.out.println("Account is updated");
		
		webDriverManager.closeDriver();
	    
	}

}
