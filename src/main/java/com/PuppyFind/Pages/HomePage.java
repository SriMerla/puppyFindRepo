package com.PuppyFind.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public static WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how=How.XPATH, using="//a[@title='PuppyFind Home']")
	public WebElement puppyHome;

	@FindBy(how=How.XPATH, using="//a[@title='PuppyFind Find a Puppy']")
	public WebElement findPuppyPage;
	
	@FindBy(how=How.XPATH, using="//a[@title='PuppyFind List a Puppy']")
	public WebElement listApuppyPage;
	
	@FindBy(how=How.XPATH, using="//a[@title='PuppyFind More Info']")
	public WebElement moreInfo;
	
	@FindBy(how=How.XPATH, using="//a[@title='PuppyFind Support']")
	public WebElement support;
	
	@FindBy(how=How.XPATH, using="//a[@title='PuppyFind Logout']")
	public WebElement logout;
	
	@FindBy(how=How.XPATH, using="//h1[contains(text(),'Puppies for Sale')]")
	public WebElement pageTitle;
	
	@FindBy(how=How.XPATH, using="//input[@placeholder='Type a breed..']")
	public WebElement homeSearch;
	
	@FindBy(how=How.XPATH, using="//div[@id='search']")
	public WebElement findPuppyButton;

	@FindBy(how=How.XPATH, using="//div[@class='featured-image']")
	public WebElement featuredHomeImage;
	
	@FindBy(how=How.XPATH, using="//h2[@class='margin-bottom-0']")
	public WebElement featuredBreed;
	
	@FindBy(how=How.XPATH, using="//h2[contains(text(),'Puppy Search')]")
	public WebElement puppySearch;
	
	@FindBy(how=How.XPATH, using="/html/body/div[2]/div/div/div[2]/div[1]")
	public WebElement puppyImages;
	
	@FindBy(how=How.XPATH, using="//a[contains(text(),'More Puppies for Sale')]")
	public WebElement morePuppiesForSale;
	
	@FindBy(how=How.XPATH, using="//div[@class='featured-info']//div[@class='btn puppies-btn']")
	public WebElement moreAboutPuppy;
	
	@FindBy(how=How.XPATH, using="/h1[contains(text(),'Popular Dog Breeds')]")
	public WebElement popularPuppies;
	
	@FindBy(how=How.XPATH, using="//a[@title='Pug Puppies for Sale']")
	public WebElement pugPupppies;
	
	@FindBy(how=How.XPATH, using="//a[@title='PuppyFind My Account']")
	public WebElement myAccount;
		
  public void getfindAPuppyPage() throws InterruptedException {
	   
	  findPuppyPage.click();
	  Thread.sleep(2000);
	   }
   
   public void getListPuppyPage() throws InterruptedException {
	  
	   listApuppyPage.click();
	   Thread.sleep(2000);
	   
   }
  
   public void getMoreInfo() throws InterruptedException {
	   moreInfo.click();
	   Thread.sleep(2000);
   }
	
   public void getSupport() throws InterruptedException {
	   support.click();
	   Thread.sleep(2000);
   }

}
