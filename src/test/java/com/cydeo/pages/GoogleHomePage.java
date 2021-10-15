package com.cydeo.pages;

import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.cydeo.utility.BrowserUtil.waitFor;
import static com.cydeo.utility.ConfigReader.confRead;

public class GoogleHomePage {

    @FindBy(name="q")
    private WebElement searchBox ;

    @FindBy(name="btnK")
    private WebElement searchBtn ;

    public GoogleHomePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    /**
     * navigate to google homepage
     */
    public void goTo(){
//        Driver.getDriver().get(  "https://google.com"     );
        Driver.getDriver().get( confRead("google.url" )    );
    }

    /**
     * Search on google homepage
     * @param keyword keyword you want to search on google
     */
    public void searchKeyword( String keyword  ){

        this.searchBox.sendKeys(keyword);
        waitFor(2);
        this.searchBtn.click();

    }

    /**
     * Check if you are at google home page by checking the title
     * @return true if title is Google false if not
     */

    public boolean isAt(){

        return  Driver.getDriver().getTitle().equals("Google") ;

    }



}
