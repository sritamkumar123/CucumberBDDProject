package StepDefinitions;

import io.cucumber.java.en.When;

public class RegistrationStepDef extends BaseClass {

	@When("Enters firstname as {string} and lastname as {string}")
	public void enters_firstname_as_and_lastname_as(String firstname, String lastname) {
		rp.enterFirstname(firstname);
		rp.enterLastname(lastname);
		log.info("firstname and lastname entered");
	}

	@When("Enters valid email")
	public void enters_email_as() {
		rp.enterEmail(generaterandomEmail() + "@gmail.com");
		log.info("random email generated");
	}

	@When("Enters telephone as {string}")
	public void enters_telephone_as(String phoneNo) {
		rp.enterPnoneNumber(phoneNo);
		log.info("phone number entered successfully");
	}

	@When("Enters password as {string} and confirm password as {string}")
	public void enters_password_as_and_confirm_password_as(String pwd, String conpwd) {
		rp.enterPassword(pwd);
		rp.enterConfirmPass(conpwd);
		log.info("password and confirm password entered successfully");
	}

	@When("Click on policy checkbox")
	public void click_on_policy_checkbox() {
		rp.clickOnPolicyCheckBox();
		log.info("policy button clicked successfully");
	}

	@When("Click on Continue button")
	public void click_on_continue_button() {
		rp.clickOnContinueButton();
		log.info("continue button clicked successfully");
	}

}
