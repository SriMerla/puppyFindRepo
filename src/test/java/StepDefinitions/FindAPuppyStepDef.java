package StepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.PuppyFind.Pages.FindAPuppyPage;
import com.PuppyFind.Pages.HomePage;
import com.PuppyFind.Pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import managers.PageObjectManager;
import managers.WebDriverManager;
import util.CONSTANTS;

public class FindAPuppyStepDef {
	WebDriver driver;
	FindAPuppyPage findAPuppyPage;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	
	@Given("^user is on home page$")
	public void user_is_on_home_page() {
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
	    
	}
	
	@Given("^user navigates to find a puppy page$")
	public void user_navigates_to_find_a_puppy_page() {
		pageObjectManager = new PageObjectManager(driver);
		findAPuppyPage = pageObjectManager.getFindAPuppyPage();
		findAPuppyPage.PuppyFind.click();	
	    
	}

	@Then("^user verifies find a puppy by breed ,by state and by Life style are displayed$")
	public void user_verifies_find_a_puppy_by_breed_by_state_and_by_Life_style_are_displayed() {
		boolean a = findAPuppyPage.SidebarFindPuppy.isDisplayed();
		Assert.assertTrue("SideBar Find Puppy is not displayed", a);
		boolean b = findAPuppyPage.BreedName.isDisplayed();
		Assert.assertTrue("Search By Bread is not displayed", b);
		boolean c = findAPuppyPage.StateName.isDisplayed();
		Assert.assertTrue("Search by state is not displayed", c);
		boolean d = findAPuppyPage.Size.isDisplayed();
		Assert.assertTrue("Search by lifestyle is not displayed", d);
	   
	}

	@Then("^user verifes search by keyword , browse alphabetically are enable$")
	public void user_verifes_search_by_keyword_browse_alphabetically_are_enable() {
		boolean searchKey = findAPuppyPage.SearchOptions.isDisplayed();
		Assert.assertTrue("Search tab on find a puppy page is not displayed", searchKey);
		String searchAlpha = findAPuppyPage.BrowseAlpha.getText();
		Assert.assertEquals("Browse Alphabetically", searchAlpha);
		
	    
	}

	@Then("^verifies the number results displayed on the page$")
	public void verifies_the_number_results_displayed_on_the_page() {
		String res = findAPuppyPage.numberOfResults.getText();
		Assert.assertEquals("1 - 10 of 26", res);
		
		System.out.println("Number of results displayes on the page" + res);
		webDriverManager.closeDriver();
	   
	}
	
	@Given("^user navigates to Find a puppy page$")
	public void user_navigates_to_Find_a_puppy_page() {
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		findAPuppyPage = pageObjectManager.getFindAPuppyPage();
		findAPuppyPage.PuppyFind.click();
	}

	@When("^user enters the breed$")
	public void user_enters_the_breed()  {
		findAPuppyPage.byBreed("pug");
	    
	}

	@Then("^user clicks Find by breed button$")
	public void user_clicks_Find_by_breed_button() {
		findAPuppyPage.SubmitBreed.click();
		
	   
	}

	@Then("^user verifies the search results$")
	public void user_verifies_the_search_results() throws Throwable {
      String res = driver.findElement(By.xpath("//a[contains(text(),'Frenchie Pug')]")).getText();
      Assert.assertEquals("Frenchie Pug", res);
      webDriverManager.closeDriver();
	   
	}
	
	@When("^user selects state from dropdown$")
	public void user_selects_state_from_dropdown() throws InterruptedException  {
		findAPuppyPage.byState("CA");
		Thread.sleep(CONSTANTS.STEP_DELAY);
		//driver.navigate().back();
		
	   
	}

	@When("^user clicks the search my state button$")
	public void user_clicks_the_search_my_state_button() throws InterruptedException  {
		findAPuppyPage.SubmitState.click();
		Thread.sleep(CONSTANTS.STEP_DELAY);
		
		
	}

	@Then("^user verifies the puppies for sale in the state$")
	public void user_verifies_the_puppies_for_sale_in_the_state() {
		findAPuppyPage.stateRes();
		webDriverManager.closeDriver();
	   
	}
	@When("^user selects size , upkeep, purpose$")
	public void user_selects_size_upkeep_purpose() throws InterruptedException  {
		findAPuppyPage.byLifeStyle("s", "e", "pet");
	    
	}

	@Then("^user verifies the search results for find puppy by life style$")
	public void user_verifies_the_search_results_for_find_puppy_by_life_style()  {
		findAPuppyPage.lifeStyleRes();
		webDriverManager.closeDriver();
	   
	}

	

}
