package com.PuppyFind.Pages;

import java.util.List;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FindAPuppyPage {
	
	WebDriver driver;
	int itemSize;

	public FindAPuppyPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using="//a[@title='PuppyFind Find a Puppy']")
	public WebElement PuppyFind;
	
	@FindBy(how = How.XPATH, using="//h2[contains(text(),'Find a Puppy')]")
	public WebElement SidebarFindPuppy;
	
	@FindBy(how = How.XPATH, using="//input[@placeholder='Enter Breed..']")
	public WebElement BreedName;
	
	@FindBy(how = How.XPATH, using="//select[@name='state']")
	public WebElement StateName;
	
	@FindBy(how = How.XPATH, using="//form[@action='https://www.puppyfind.com/search/?submit=1']//input[@value='Find my breed...']")
	public WebElement SubmitBreed;
	
	@FindBy(how = How.XPATH, using="//input[@value='Search my state...']")
	public WebElement SubmitState;
	
	@FindBy(how = How.XPATH, using="//select[@name='bsize']")
	public WebElement Size;
	
	@FindBy(how = How.XPATH, using="//select[@name='upkeep']")
	public WebElement UpKeep;
	
	@FindBy(how = How.XPATH, using="//select[@name='purpose']")
	public WebElement Purpose;
	
	@FindBy(how = How.XPATH, using="//input[@value='Find my match...']")
	public WebElement FindMatchButton;
	
	@FindBy(how = How.XPATH, using="//td[@align='center']//input[@name='str']")
	public WebElement SearchOptions;
	
	@FindBy(how = How.XPATH, using="//td[@align='right']//input[@value='Find my breed...']")
	public WebElement FindMyBreedButton;
	
	@FindBy(how = How.XPATH, using="//font[contains(text(),'Browse Alphabetically')]")
	public WebElement BrowseAlpha;
	
	@FindBy(how = How.XPATH, using="//b[contains(text(),'G')]")
	public WebElement AlphabetG;
	
	@FindBy(how = How.XPATH, using="//font[@color='#ff0000']")
	public WebElement numberOfResults;
	
	@FindBy(how = How.XPATH, using="//*[@id=\"ui-id-1\"]")
	public WebElement dropDown;
	
	@FindBy(how = How.XPATH,using="//table[@width='100%']//tbody//tr//td//h1")
	public WebElement checkStateRes;
	
	@FindBy(how = How.XPATH,using="//a[contains(text(),'French Bulldog')]")
	public WebElement checkLifestyleRes;
	
	
	public void byBreed(String breedName){
		BreedName.sendKeys(breedName);
		 
			
	}
	
	public void byState(String statename) {
		StateName.click(); 
		Select state = new Select(StateName);
		state.selectByValue(statename);
	
	}
	
	public void stateRes() {
		String res = checkStateRes.getText();
		System.out.println(res);
		 
		
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
	public void lifeStyleRes() {
		
		String res = checkLifestyleRes.getText();
		System.out.println(res);
		
	}
	
	public void searchOptions(String searchName) {
		SearchOptions.sendKeys(searchName);
		
	}
	
	public void alphabeticsearch() {
		
		String alpha = BrowseAlpha.getText();
		System.out.println(alpha);
		AlphabetG.click();
		
	}
	
	
}


