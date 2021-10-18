package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cydeo.utility.ConfigReader.confRead;
import static com.cydeo.utility.Driver.getDriver;

public class WLoginPage {

    @FindBy(id = "ctl00_MainContent_username")
    public WebElement userNameField ;

    @FindBy(name = "ctl00$MainContent$password")
    public WebElement passwordField ;

    @FindBy(css = "#ctl00_MainContent_login_button")
    public WebElement loginButton ;

    @FindBy(xpath = "//span[.='Invalid Login or Password.']")
    public WebElement errorMsg;

    // Now we need instruct selenium to start looking for element
    // when this constructor is called
    // This is no arg constructor of this class
    public WLoginPage(){
        // PageFactory is a selenium class that support Page Object Model
        // and it has method called initElements
        // once it's called , it will locate all the element
        // specified using @FindBy annotation with locator
        // initElements accept 2 arguments ,
        // WebDriver instance and Page class instance (this) means current instance of this class.
        PageFactory.initElements(getDriver() , this );

    }

    /**
     * Create a method to goTo
     * accept no param just navigate to login page
     * use config.properties for url
     */
    public void goTo(){
        getDriver().navigate().to(confRead("weborder_url")    );
    }

    /**
     * Login with parameters
     * @param username username
     * @param password password
     */
    public void login(String username, String password ){

        // you can access directly using userNameField or this.userNameField
        this.userNameField.sendKeys(username);
        this.passwordField.sendKeys(password);
        this.loginButton.click();

    }

    /**
     * Check error message is present if wrong credentials provided
     * loginErrorMsgPresent  simple return the result of isDisplayed method call
     */

    public boolean loginErrorMsgPresent(){

        return  this.errorMsg.isDisplayed()  ;

    }

    /**
     * Check if test is at login page
     */
    public boolean isAtLoginPage() {
        return (getDriver().getTitle().equals("Web Orders Login")) ? true : false;
    }
}
