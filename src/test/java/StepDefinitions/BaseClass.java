package StepDefinitions;

import java.io.File;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.logging.LogManager;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.apache.logging.log4j.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.RegistrationPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.ReadConfig;

/* parent class */
public class BaseClass {

	public static WebDriver driver;
	public static LoginPage lp;
	public static RegistrationPage rp;
	public static HomePage hp;
	public static Logger log;
	public ReadConfig readConfig;

	

	// for random email generation
	public String generaterandomEmail() {
		return (RandomStringUtils.randomAlphabetic(5));

	}

}
