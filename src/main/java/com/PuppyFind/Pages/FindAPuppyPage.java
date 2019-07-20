package com.PuppyFind.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FindAPuppyPage {
	
	WebDriver driver;

	public FindAPuppyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using="//a[@title='PuppyFind Find a Puppy']")
	WebElement PuppyFind;
	
	@FindBy(how = How.XPATH, using="//h2[contains(text(),'Find a Puppy')]")
	WebElement SidebarFindPuppy;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Enter Breed..']")
	WebElement BreedName;
	
	@FindBy(how = How.XPATH, using="//select[@name='state']")
	WebElement StateName;
	
	@FindBy(how = How.XPATH, using="//form[@action='https://www.puppyfind.com/search/?submit=1']//input[@value='Find my breed...']")
	WebElement SubmitBreed;
	
	@FindBy(how = How.XPATH, using="//input[@value='Search my state...']")
	WebElement SubmitState;
	
	@FindBy(how = How.XPATH, using="//select[@name='bsize']")
	WebElement Size;
	
	@FindBy(how = How.XPATH, using="//select[@name='upkeep']")
	WebElement UpKeep;
	
	@FindBy(how = How.XPATH, using="//select[@name='purpose']")
	WebElement Purpose;
	
	@FindBy(how = How.XPATH, using="//input[@value='Find my match...']")
	WebElement FindMatchButton;
	
	@FindBy(how = How.XPATH, using="//td[@align='center']//input[@name='str']")
	WebElement SearchOptions;
	
	@FindBy(how = How.XPATH, using="//td[@align='right']//input[@value='Find my breed...']")
	WebElement FindMyBreedButton;
	
	@FindBy(how = How.XPATH, using="//font[contains(text(),'Browse Alphabetically')]")
	WebElement BrowseAlpha;
	
	@FindBy(how = How.XPATH, using="//b[contains(text(),'G')]")
	WebElement AlphabetG;
	
	public void byBreed(String breedName){
		BreedName.sendKeys(breedName);
		SubmitBreed.click();
			
	}
	
	public void byState(String statename) {
		StateName.click(); 
		Select state = new Select(StateName);
		state.selectByVisibleText(statename);
	}
	
	public void byLifeStyle(String size, String behaviour, String purpose) throws InterruptedException{
		
		Size.click();
		Select s = new Select(Size);
		s.selectByValue(size);
		Thread.sleep(2000);
		UpKeep.click();
		Select b = new Select(UpKeep);
		b.selectByValue(behaviour);
		Thread.sleep(2000);
		Purpose.click();
		Select p = new Select(Purpose);
		p.selectByValue(purpose);
		Thread.sleep(2000);
		FindMatchButton.click();	
		
	}
	
	public void searchOptions(String searchName) {
		SearchOptions.sendKeys(searchName);
		
	}

}


