package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FaceBookLoginPage {
	@FindBy (xpath="//input[@id='email']")private WebElement email;
	@FindBy (xpath="//input[@id='pass']")private WebElement password;
	@FindBy (xpath="//button[@id='loginbutton']")private WebElement login ;
	@FindBy (xpath="//href[@'class='_97w4'")private WebElement forgotpassword ;
	@FindBy (xpath="")private WebElement CreateNewAccount;
	
	public FaceBookLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
		public void enterEmailId(String mailId) {
			email.sendKeys(mailId);
			}
		public void enterPassword(String pass) {
			password.sendKeys(pass);
		}
		public void clickOnLogin() {
			login.click();
		}
		public void clickOnForgotPassword () {
			forgotpassword.click();
			
		}
		public void clickOnCreateNewAccount() {
			CreateNewAccount.click();
		}
		
	

	
	}
	
	
	
	
	


