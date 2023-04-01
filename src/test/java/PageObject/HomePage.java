package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver){
		super(driver);
	}
	
	@FindBy(xpath="//input[@placeholder='Search']")
	WebElement search_box;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-lg1']")
	WebElement search_btn;
	
	public void enterSearchProduct(String product) {
		search_box.sendKeys(product);
	}
	
	public void clickOnsearchBtn() {
		search_btn.click();
	}
	
	public boolean checkproductPresent(String srproduct) {
		boolean flag= false;
		List<WebElement> results= ldriver.findElements(By.xpath("//div[@class='product-thumb']//a"));
	    for(WebElement product:results) {
	    	if(product.getText().equalsIgnoreCase(srproduct)) {
	    		flag=true;
	    		break;
	    	 }
	    	}
    		return flag;
	    }
	
    
}
