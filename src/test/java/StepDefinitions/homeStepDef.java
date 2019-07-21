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
import util.CONSTANTS;

public class homeStepDef {
	
	WebDriver driver;
	LoginPage loginPage;
	HomePage homePage;
	PageObjectManager pageObjectManager;
	WebDriverManager webDriverManager;
	
	@Given("^User is on WebPage$")
	public void user_is_on_WebPage()  {
		webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
	    
	}

	@When("^user verifies all the links in the home page$")
	public void user_verifies_all_the_links_in_the_home_page() {
		pageObjectManager = new PageObjectManager(driver);
		homePage = pageObjectManager.getHomePage();
		loginPage = pageObjectManager.getLoginPage();
		
		boolean ph = homePage.puppyHome.isEnabled();
		Assert.assertTrue("Home is not enable", ph);
		
		boolean fpp = homePage.findPuppyPage.isEnabled();
		Assert.assertTrue("Find a Puppy is not enable", fpp);
		
		boolean lpp = homePage.listApuppyPage.isEnabled();
		Assert.assertTrue("List a Puppy is not enable", lpp);
		
		boolean mI = homePage.moreInfo.isEnabled();
		Assert.assertTrue("More Info is not enable", mI);
		
		boolean mL = loginPage.memberLogin.isEnabled();
		Assert.assertTrue("Member login is not enable", mL);
		
		boolean hs = homePage.homeSearch.isDisplayed();
		Assert.assertTrue("Home search tab is not displayed", hs);
		
		boolean fb = homePage.findPuppyButton.isDisplayed();
		Assert.assertTrue("FindButton is not Displayed", fb);
		
		boolean hI = homePage.featuredHomeImage.isDisplayed();
		Assert.assertTrue("FeatureImage is not displayed", hI);
		
		boolean ps = homePage.puppySearch.isDisplayed();
		Assert.assertTrue("Puppy search is not displayed", ps);
		System.out.println("Feature image on home page and puppy search on side bar are displayed");
		System.out.println("All the links are displayed ");
	    
	}

	@Then("^user confirms the links are corresponding to their respective pages$")
	public void user_confirms_the_links_are_corresponding_to_their_respective_pages() throws InterruptedException {
		homePage.getfindAPuppyPage();
		 String findPuppyUrl = driver.getCurrentUrl();
		Assert.assertEquals("https://www.puppyfind.com/browse/", findPuppyUrl);
		Thread.sleep(CONSTANTS.STEP_DELAY);
		driver.navigate().back();
		Thread.sleep(CONSTANTS.STEP_DELAY);
	
		
		homePage.getListPuppyPage();
		String listPuppyUrl = driver.getCurrentUrl();
		Assert.assertEquals("https://www.puppyfind.com/list/", listPuppyUrl);
		Thread.sleep(CONSTANTS.STEP_DELAY);
		driver.navigate().back();
		Thread.sleep(CONSTANTS.STEP_DELAY);
		
		
		homePage.getMoreInfo();
		String moreInfoUrl = driver.getCurrentUrl();
		Assert.assertEquals("https://www.puppyfind.com/info/", moreInfoUrl);
		Thread.sleep(CONSTANTS.STEP_DELAY);
		driver.navigate().back();
		Thread.sleep(CONSTANTS.STEP_DELAY);
		
		
		homePage.getSupport();
		String supportUrl = driver.getCurrentUrl();
		Assert.assertEquals("https://www.puppyfind.com/support/", supportUrl);
		Thread.sleep(CONSTANTS.STEP_DELAY);
		driver.navigate().back();
		Thread.sleep(CONSTANTS.STEP_DELAY);
	
		
		System.out.println("All the links in the home page are corresponding to their respective pages");
	    webDriverManager.closeDriver();
		
	   
	}
	
	
	

}
