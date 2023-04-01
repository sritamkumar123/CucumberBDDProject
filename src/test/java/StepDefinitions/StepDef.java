package StepDefinitions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.LogManager;
import org.apache.logging.log4j.*;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.RegistrationPage;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.masterthought.cucumber.json.Output;
import utilities.ReadConfig;

import org.apache.logging.log4j.Logger;

// becomes a child class
public class StepDef extends BaseClass {
	@Before
	public void setup() throws IOException {

		log = org.apache.logging.log4j.LogManager.getLogger(this.getClass());
		readConfig = new ReadConfig();
		String browser = readConfig.getBrowser();
		switch (browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*"); // Unable to establish websocket connection

			driver = new ChromeDriver(options);
			break;

		case "edge":
			WebDriverManager.edgedriver().setup();
			EdgeOptions options1 = new EdgeOptions();
			options1.addArguments("--remote-allow-origins=*"); // Unable to establish websocket connection
			driver = new EdgeDriver(options1);
			break;
		default:
			driver = null;
			break;
		}

		log.info("Setup performed successfully");

	}

//	@After
//	public void teardown(Scenario sc) throws IOException {
//
//		System.out.println("teardown method executed");
//		if (sc.isFailed() == true) {
//			String fileWithPath = "C:\\Users\\SRITAMLINKAN\\eclipse-workspace\\cucumberproject\\screenshot\\failedStep.png";
//			TakesScreenshot srcshot = (TakesScreenshot) driver;
//			File srcFile = srcshot.getScreenshotAs(OutputType.FILE);
//			File desFile = new File(fileWithPath);
//			FileUtils.copyFile(srcFile, desFile);
//
//			log.info("Screenshot captured successully");
//
//		}
//		driver.quit();
//		log.info("driver got quit successfully");
//
//	}
	
	@After
	public void addScreenshot(Scenario scenario) {
		if(scenario.isFailed()) {
			//final byte[] screenshot= ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
			//attach image file report(data, media type, name of the attachment)
			//scenario.attach(screenshot, "image/png",scenario.getName() );
			
			TakesScreenshot ts=(TakesScreenshot) driver;
			byte[] src= ts.getScreenshotAs(OutputType.BYTES);
			scenario.attach(src, "image/png",scenario.getName() );
		}
	}
	
	

	@Given("User lunch browser")
	public void user_lunch_browser() {

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		lp = new LoginPage(driver);
		rp = new RegistrationPage(driver);
		hp = new HomePage(driver);
		log = org.apache.logging.log4j.LogManager.getLogger(this.getClass());

		log.info(" browser lunched successfully");

	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
		driver.get(url);
		log.info("user opened url successfully");
	}

	@When("Enters email as {string} and password as {string}")
	public void enters_email_as_and_password_as(String email, String password) {
		lp.enterEmail(email);
		lp.enterPassword(password);
		log.info("Email and password entered successfully");

	}

	@When("Click on login button")
	public void click_on_login_button() {
		lp.clickOnloginBtn();
		log.info("login button clicked successfully");
	}

	@Then("Page title should be {string}")
	public void page_title_should_be(String PageTitle) {
		if (driver.getTitle().equals(PageTitle)) {
			Assert.assertTrue(true);
			log.info("page title matched");
		} else {
			log.info("page title not matched");
			Assert.assertTrue(false);
		}
	}

	@When("User click on logout button")
	public void user_click_on_logout_button() {
		lp.clickOnLogoutLk();
		log.info("user clicked on logout button successfully");
	}

	/////////////// Registration Steps ////////////////

	///////// Search Functionality ////////////

}
