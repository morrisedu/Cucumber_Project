package com.cydeo.step_definitions;

import com.cydeo.pages.DashboardPage;
import com.cydeo.pages.LibLoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static com.cydeo.utility.Driver.getDriver;
import static org.junit.Assert.assertEquals;

public class LibraryLoginStepDef {
    LibLoginPage lib = new LibLoginPage();
    DashboardPage dashboard = new DashboardPage();

    @Given("user is at library login page")
    public void user_is_at_library_login_page() {
        lib.goTo();
    }

    @When("user uses username {string} and passcode {string}")
    public void userUsesUsernameAndPasscode(String email, String password) {
        lib.login(email, password);
        System.out.println("email: " + email + ", password: " + password);
    }

    @Then("user should be at dashboard page")
    public void user_should_be_at_dashboard_page() {
        assertEquals("Library", getDriver().getTitle());
    }
}
