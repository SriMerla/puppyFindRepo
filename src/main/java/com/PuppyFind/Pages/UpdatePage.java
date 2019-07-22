package com.PuppyFind.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class UpdatePage {
	WebDriver driver;
	LoginPage loginPage;
	public UpdatePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}

	@FindBy(how = How.XPATH, using="//input[@name='firstname']")
	public WebElement firstNameUpdate;
	
	@FindBy(how = How.XPATH, using="//input[@name='lastname']")
	public WebElement lastNameUpdate;
	
	@FindBy(how = How.XPATH, using="//input[@name='email']")
	public WebElement emailIdUpdate;
	
	@FindBy(how = How.XPATH, using="//tbody//tr[10]//td[1]//input[1]")
	public WebElement contactInfoUpdateButton;
	
	@FindBy(how = How.XPATH, using="//input[@name='password']")
	public WebElement currentPassword;
	
	@FindBy(how = How.XPATH, using="//input[@name='new_password']")
	public WebElement newPassword;
	
	@FindBy(how = How.XPATH, using="//input[@name='new_password2']")
	public WebElement confirmNewPassword;
	
	@FindBy(how = How.XPATH, using="//tbody//tr[19]//td[1]//input[1]")
	public WebElement passwordUpdateButton;
	
	
	public void updateContactInfo(String newFirstname, String newLastname) throws InterruptedException {
		
		firstNameUpdate.clear();
	    firstNameUpdate.sendKeys(newFirstname);
		
		lastNameUpdate.clear();
		lastNameUpdate.sendKeys(newLastname);
		Thread.sleep(2000);
		contactInfoUpdateButton.click();
		Thread.sleep(2000);
		
	}
	
	public void updateEmail(String newEmail) {
		
		emailIdUpdate.clear();
		emailIdUpdate.sendKeys(newEmail);
	}
	public void updatePassword(String currentpass, String newpass, String confirmNewpass) throws InterruptedException {
		
		currentPassword.clear();
		currentPassword.sendKeys(currentpass);
		newPassword.sendKeys(newpass);
		confirmNewPassword.sendKeys(confirmNewpass);
		Thread.sleep(2000);
		passwordUpdateButton.click();	
		
		
	}
	
	public void updateConfirmaionMsg() throws InterruptedException {
        String confirmMsg = driver.switchTo().alert().getText();
        
		driver.switchTo().alert().accept();
		
		System.out.println(confirmMsg);
		
		Thread.sleep(2000);
		
	}

}
