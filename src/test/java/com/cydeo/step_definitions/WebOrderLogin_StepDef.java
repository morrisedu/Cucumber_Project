package com.cydeo.step_definitions;

import com.cydeo.pages.WLoginPage;
import com.cydeo.utility.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static com.cydeo.utility.BrowserUtil.waitFor;
import static com.cydeo.utility.ConfigReader.confRead;
import static com.cydeo.utility.Driver.getDriver;
import static org.junit.Assert.*;

public class WebOrderLogin_StepDef {
    WLoginPage login_page = new WLoginPage();
    WebDriver driver = getDriver();

    @Given("we are at the web order login page")
    public void we_are_at_the_web_order_login_page() {
        login_page.goTo();
        assertEquals("Web Orders Login", getDriver().getTitle());
    }

    @When("we provide valid credentials")
    public void we_provide_valid_credentials() {
        login_page.login(confRead("weborder_username"), confRead("weborder_password"));
    }

    @Then("we should see the all order page")
    public void we_should_see_the_all_order_page() {
        assertEquals("Web Orders", getDriver().getTitle());
    }

    @When("we provide invalid credentials")
    public void weProvideInvalidCredentials() {
        login_page.login("notausername", "notapaswword");
    }

    @Then("we should still be at the login page")
    public void weShouldStillBeAtTheLoginPage() {
        assertTrue(login_page.isAtLoginPage());
    }

    @And("login error message should appear")
    public void loginErrorMessageShouldAppear() {
        assertTrue(login_page.loginErrorMsgPresent());
    }

    @When("user provides username {string} and password {string}")
    public void userProvidesUsernameAndPassword(String username, String password) {
        login_page.login(username, password);
    }
}
