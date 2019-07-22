package com.PuppyFind.Pages;


import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import dataProviders.ConfigFileReader;



public class LoginPage {
	
	WebDriver driver;
	ConfigFileReader configFileReader;
	
	@FindBy(how = How.XPATH, using="//a[@title='PuppyFind Member Login']")
	public WebElement memberLogin;
	
	@FindBy(how = How.XPATH, using="//input[@name='email']")
	public WebElement Email;
	
	@FindBy(how = How.XPATH, using="//input[@name='password']")
	public WebElement password;
	
	@FindBy(how = How.XPATH, using="//select[@name='action']")
	public WebElement action;
	
	@FindBy(how = How.XPATH, using="//option[@value='B']")
	public WebElement buyPuppy;
	
	@FindBy(how = How.XPATH, using="//input[@value='Submit...']")
	public WebElement submitButton;
	
	@FindBy(how = How.XPATH, using="//h2[contains(text(),'Find a Puppy')]")
	public WebElement findPuppy;
	
	@FindBy(how = How.XPATH, using="//a[@href='/register/?back=']")
	public
	WebElement registertoBuyPuppy;
	
	@FindBy(how = How.XPATH, using="//a[@href='/list/']")
	public WebElement registertoSellPuppy;	

	@FindBy(how = How.XPATH, using="//a[contains(text(),\"Click here if you've forgotten your password.\")]")
	public WebElement ForgetPwd;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void useronloginpage() {
		memberLogin.click();
	}
	
	public void loginIntoPage() throws InterruptedException{
		configFileReader = new ConfigFileReader();
		 String email = configFileReader.getUserEmail();
		 String pass = configFileReader.getPassword();
		Email.sendKeys(email);
		password.sendKeys(pass);
		Thread.sleep(2000);
		
	}
	
	public void userAction() throws InterruptedException {
		
		  action.click(); 
		  buyPuppy.click(); 
		  Thread.sleep(2000); 
		  submitButton.click();
		 	

		/*
		 * Action.click(); Select act = new Select(Action);
		 * act.deselectByVisibleText("I'm buying a puppy"); SubmitButton.click();
		 */
		
	}
	
	
	public void confirmationMessage() {
		
		String msg = findPuppy.getText();
		System.out.println("User is on " + msg + " Page");
	}
	
	
		 
		 }

	
	


