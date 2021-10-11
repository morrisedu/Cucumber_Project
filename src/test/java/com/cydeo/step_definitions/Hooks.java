package com.cydeo.step_definitions;

import com.cydeo.utility.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

import static com.cydeo.utility.Driver.getDriver;

/**
 * Hook class contains methods that run before &/or after each scenario
 * With tags, you can run certain code before & after each scenario that is tagged with a particular tag
 */
public class Hooks {
    @Before("@web-ui")
    public void setupDriver() {
        // Setup implicit wait
        getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Maximize window size
        getDriver().manage().window().maximize();
    }

    @After("@web-ui")
    public void tearDown() {
        Driver.closeBrowser();
    }
}
