package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {

	WebDriver ldriver;
	public RegistrationPage(WebDriver rdriver) {
		ldriver= rdriver;
		PageFactory.initElements(rdriver,this);
	}
	
	@FindBy(id="input-firstname")
	WebElement firstname_txtbox;
	
	@FindBy(id="input-lastname")
	WebElement lastname_txtbox;
	
	@FindBy(id="input-email")
	WebElement email_txtbox;
	
	@FindBy(name="telephone")
	WebElement phone_txtbox;
	
	@FindBy(name="password")
	WebElement password_txtbox;
	
	@FindBy(name="confirm")
	WebElement conformpass_txtbox;
	
	@FindBy(xpath="//input[@name='agree']")
	WebElement policy_textbox;
	
	@FindBy(xpath="//input[@value='Continue']")
	WebElement continue_btn;
	
	
	public void enterFirstname(String firstname) {
		firstname_txtbox.sendKeys(firstname);
	}
	
	public void enterLastname(String lastname) {
		lastname_txtbox.sendKeys(lastname);
	}
	
	public void enterEmail(String email) {
		email_txtbox.sendKeys(email);
	}
	
	public void enterPnoneNumber(String number) {
		phone_txtbox.sendKeys(number);
	}
	
	public void enterPassword(String password) {
		password_txtbox.sendKeys(password);
	}
	
	public void enterConfirmPass(String confirmpass) {
		conformpass_txtbox.sendKeys(confirmpass);
	}
	
	public void clickOnPolicyCheckBox() {
		policy_textbox.click();
	}
	
	public void clickOnContinueButton() {
		continue_btn.click();
	}
}
