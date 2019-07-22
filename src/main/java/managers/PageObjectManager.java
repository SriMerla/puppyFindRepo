package managers;

import org.openqa.selenium.WebDriver;

import com.PuppyFind.Pages.ContactSellerPage;
import com.PuppyFind.Pages.CreateAccountPage;
import com.PuppyFind.Pages.FindAPuppyPage;
import com.PuppyFind.Pages.HomePage;
import com.PuppyFind.Pages.LoginPage;
import com.PuppyFind.Pages.UpdatePage;


public class PageObjectManager {
		 
		 public WebDriver driver;
		 public LoginPage loginPage;
		 public FindAPuppyPage findAPuppyPage;
		 public HomePage homePage;
		 public CreateAccountPage createAccountPage;
		 public ContactSellerPage contactSellerPage;
		 public UpdatePage updatePage;
		 	 
		 
		 public PageObjectManager(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 }	 
		 
		 public HomePage getHomePage(){
		 
		 return (homePage == null) ? homePage = new HomePage(driver) : homePage;
		 
		 }
		 
		 public LoginPage getLoginPage() {
				
				return(loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
			} 		 
		 
		 public FindAPuppyPage getFindAPuppyPage(){
		 
		 return (findAPuppyPage == null) ? findAPuppyPage = new FindAPuppyPage(driver) : findAPuppyPage;
		 
		 }	 
		 
		 public CreateAccountPage getCreateAccountPage(){
		 
		 return (createAccountPage == null) ? createAccountPage = new CreateAccountPage(driver) : createAccountPage;
		 
		 }
		 			 
		 public ContactSellerPage getContactSellerPage(){
			 
			 return (contactSellerPage == null) ? contactSellerPage = new ContactSellerPage(driver) : contactSellerPage;
			 
			 }
         public UpdatePage getUpdatePage(){
			 
			 return (updatePage == null) ? updatePage = new UpdatePage(driver) : updatePage;
			 
			 }

}
