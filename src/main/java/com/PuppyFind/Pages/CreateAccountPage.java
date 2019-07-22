package com.PuppyFind.Pages;

import java.lang.invoke.ConstantCallSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


public class CreateAccountPage {
	
	WebDriver driver;

	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using="//input[@name='firstname']")
	public WebElement firstName;
	
	@FindBy(how = How.XPATH, using="	//input[@name='lastname']")
	public WebElement lastName;
	
	@FindBy(how = How.XPATH, using="//input[@name='email']")
	public WebElement emailID;
	
	@FindBy(how = How.XPATH, using="//input[@name='email2']")
	public WebElement confirmEmail;
	
	@FindBy(how = How.XPATH, using="//input[@name='password']")
	public WebElement password;
	
	@FindBy(how = How.XPATH, using="//input[@name='password2']")
	public WebElement confirmPassword;
	
	@FindBy(how = How.XPATH, using="//input[@value='Submit...']")
	public WebElement submitButton;
	
	public void createAccount(String first, String last, String email, String confirmId, String pass , String confirmpwd) throws InterruptedException {
		firstName.clear();
		firstName.sendKeys(first);
		Thread.sleep(2000);
		lastName.clear();
		lastName.sendKeys(last);
		Thread.sleep(2000);
		emailID.clear();
		emailID.sendKeys(email);
		Thread.sleep(2000);
		confirmEmail.clear();
		confirmEmail.sendKeys(confirmId);
		Thread.sleep(2000);
		password.clear();
		password.sendKeys(pass);
		Thread.sleep(2000);
		confirmPassword.clear();
		confirmPassword.sendKeys(confirmpwd);
		Thread.sleep(2000);
		submitButton.click();
		
	}
	
	
	

	

}
