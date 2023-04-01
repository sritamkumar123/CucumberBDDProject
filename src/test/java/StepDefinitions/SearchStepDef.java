package StepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepDef extends BaseClass {

	@When("User enters search product as {string} into the search field")
	public void user_enters_search_product_as_into_the_search_field(String product) {
		hp.enterSearchProduct(product);
		log.info("user entered search producted into the search field successfully");
	}

	@When("Clicks on search button")
	public void clicks_on_search_button() {
		hp.clickOnsearchBtn();
		log.info("search button clicked successfully");
		
	}

	@Then("Product {string} should display in the search results")
	public void product_should_display_in_the_search_results(String product) {
		Assert.assertTrue(hp.checkproductPresent(product));
		log.info("product displayed in the search results successfully");

	}

}
