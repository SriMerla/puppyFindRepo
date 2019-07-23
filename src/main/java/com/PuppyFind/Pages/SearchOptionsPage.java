package com.PuppyFind.Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchOptionsPage {
	public WebDriver driver;
	
	
	
	public SearchOptionsPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how = How.XPATH, using="//td[@align='center']//input[@name='str']")
	public WebElement searchOptions;
	
	@FindBy(how = How.XPATH, using="//td[@align='right']//input[@value='Find my breed...']")
	public WebElement findMyBreedButton;
	
	@FindBy(how = How.XPATH, using="//ul[@id='ui-id-2']//li[@class='ui-menu-item']")
	public List<WebElement> goldenSearchDropdown;
	
	@FindBy(how = How.XPATH, using="//a[contains(text(),'English Golden Retrievers')]")
	public WebElement res;
	
	public void searchOptions(String searchName) {
		searchOptions.sendKeys(searchName);
		
	}
	public void searchOptionsdropdown() {
		
		
        int itemSize = goldenSearchDropdown.size();
        System.out.println("SearchDropDown size" + itemSize);
        for(int i = 0; i < itemSize ; i++){
            String optionsValue = goldenSearchDropdown.get(i).getText();
            System.out.println(optionsValue);
            if(optionsValue.equalsIgnoreCase("Golden Retriever")) {
            	
            	goldenSearchDropdown.get(i).click();
            	break;
            	
            }
            
        }
        
        findMyBreedButton.click();
		
	}
	
	
	public void confirmationSearchOptions() {
             

		
	}
	

}
