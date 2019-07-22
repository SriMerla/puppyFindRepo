package StepDefinitions;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import com.PuppyFind.Pages.CreateAccountPage;
import com.PuppyFind.Pages.HomePage;
import com.PuppyFind.Pages.LoginPage;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import managers.WebDriverManager;

public class CreateAnAccountStepDef {
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	CreateAccountPage createAccountPage;
	
	@Given("^user is on loginpage$")
	public void user_is_on_loginpage(){
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		loginPage = pageObjectManager.getLoginPage();
		loginPage.memberLogin.click();
		
		
	}

	@And("^user clicks on link buying a puppy\\?$")
	public void user_clicks_on_link_buying_a_puppy() {
		
		loginPage.registertoBuyPuppy.click();
	    
	}

	@When("^user enters valid data on Page to create an account$")
	public void user_enters_valid_data_on_Page_to_create_an_account(DataTable userDetails) throws InterruptedException{
	   for(Map<String, String> data : userDetails.asMaps(String.class, String.class)){
		   createAccountPage = pageObjectManager.getCreateAccountPage();
		   createAccountPage.createAccount(data.get("firstname"), data.get("lastname"), data.get("email"), data.get("confirmEmail"), data.get("pass"), data.get("confirmPass"));
		   driver.switchTo().alert().accept();
		   driver.navigate().back();
		   
	   }
	    
	}

	@Then("^user verifies confirmation message$")
	public void user_verifies_confirmation_message() {
		System.out.println("user created their accounts");
		webDriverManager.closeDriver();
	    
	}
		

}
