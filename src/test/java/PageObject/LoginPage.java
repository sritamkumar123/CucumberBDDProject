package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver ) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id ="input-email")
	WebElement email;
	
	@FindBy(id="input-password")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement login_Btn;
	
	@FindBy(linkText="Logout")
	WebElement logoutLk;
	
	public void enterEmail(String emailAd) {
		email.clear();
		email.sendKeys(emailAd);
	}
	
	public void enterPassword(String pwd) {
		password.clear();
		password.sendKeys(pwd);
	}
	
	public void clickOnloginBtn() {
		login_Btn.click();
	}
	
	public void clickOnLogoutLk() {
		logoutLk.click();
	}


		
	
}
