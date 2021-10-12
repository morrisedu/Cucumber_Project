package com.cydeo.step_definitions;

import com.cydeo.pages.GoogleHomePage;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.cydeo.utility.Driver.getDriver;
import static org.junit.Assert.assertTrue;

public class GoogleSearchStepDef {
    GoogleHomePage google = new GoogleHomePage();

    @Given("user is at google search-page")
    public void user_is_at_homepage() {
        google.goTo();
    }
    @When("user search for keyword {string}")
    public void user_search_for_keyword(String keyword) {
        google.searchKeyword(keyword);
    }
    @Then("we should see result page")
    public void we_should_see_result_page() {

    }
    @Then("the title should start with {string}")
    public void the_title_should_start_with(String keyword) {
        assertTrue(getDriver().getTitle().startsWith(keyword));
    }
}
