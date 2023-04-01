package StepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Then;

public class CloseBrowser extends BaseClass {

	
	@Then("Close the browser")
	public void close_the_browser() {
		driver.close();
		log.info("driver got closed");
		// driver.quit();
	}
}
