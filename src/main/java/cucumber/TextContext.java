package cucumber;

import managers.PageObjectManager;
import managers.WebDriverManager;

public class TextContext {
	public WebDriverManager webDriverManager;
	 public PageObjectManager pageObjectManager;
	 
	 public TextContext(){
	 webDriverManager = new WebDriverManager();
	 pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
	 }
	 
	 public WebDriverManager getWebDriverManager() {
	 return webDriverManager;
	 }
	 
	 public PageObjectManager getPageObjectManager() {
	 return pageObjectManager;
	 }
	 
	}


