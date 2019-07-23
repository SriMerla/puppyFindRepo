package com.PuppyFind.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.util.List;



import managers.PageObjectManager;
import managers.WebDriverManager;

public class ContactSellerPage {
	
	WebDriver driver;
	
	@FindBy(how =  How.XPATH, using="//a[contains(text(),'Beagle')]")
	public WebElement topPuppy;
	
	@FindBy(how =  How.XPATH, using="//b[contains(text(),'Beagle Puppies for Sale')]")
	public WebElement topPuppyForSale;
	 
	@FindBy(how =  How.XPATH, using="//tbody//tr[2]//td[3]//table[1]//tbody[1]//tr[1]//td[1]")
	public WebElement firstPuppy;
	
	@FindBy(how =  How.XPATH, using="//a[contains(text(),'Add to favorites')]")
	public WebElement addToFavorites;
	
	@FindBy(how =  How.XPATH, using="//a[contains(text(),'Contact seller')]")
	public WebElement contactSeller;
	
	@FindBy(how = How.XPATH, using="//textarea[@name='message']")
	public WebElement messageBoxtoContactSeller;
	
	@FindBy(how = How.XPATH, using="//select[@name='list_id']")
    public WebElement favoritesDropDown;

	public ContactSellerPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void selectPuppy() throws InterruptedException {
		topPuppy.click();
		Thread.sleep(2000);
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		topPuppyForSale.click();
		Thread.sleep(2000);
		firstPuppy.click();
		driver.findElement(By.xpath("//tbody//tr[2]//td[3]//table[1]//tbody[1]//tr[1]//td[2]//a[1]")).click();
		
	}
	
	public void addFavorites() throws InterruptedException {
		addToFavorites.click();
		Thread.sleep(2000);
		String added = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(added);
		
	}
	
	public void contactSellerforPuppy() {
		JavascriptExecutor js = ((JavascriptExecutor) driver);
		js.executeScript("window.scrollBy(0,700)");
		boolean cS = contactSeller.isEnabled();
		if(cS == true) {
			contactSeller.click();
			boolean  msg = messageBoxtoContactSeller.isDisplayed();
			System.out.println(msg);
		}
		else {
			
			System.out.println("Upgrade  your account to see contact details");
		}	
		
	}
	
	
	public void countMyFavorites() {
		favoritesDropDown.click();
		Select dropDown = new Select(favoritesDropDown);
        List<WebElement> elementCount = dropDown.getOptions();
        int itemSize = elementCount.size();
        System.out.println("Number of puppies in my favorites "+  itemSize);
        for(int i = 0; i < itemSize ; i++){
            String optionsValue = elementCount.get(i).getText();
            System.out.println(optionsValue);
        }
		
	}

}
