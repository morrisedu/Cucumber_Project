package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import static com.cydeo.utility.BrowserUtil.getTextFromWebElements;
import static com.cydeo.utility.Driver.getDriver;

public class WAllProductPage {
    @FindBy(xpath = "//table[@class='ProductsTable']//tr/th")
    private List<WebElement> products_header;

    @FindBy(xpath = "//table[@class='ProductsTable']//tr[2]/td")
    private List<WebElement> products_firstrow;

    @FindBy(xpath = "//table[@class='ProductsTable']//tr[3]/td")
    private List<WebElement> products_secondrow;

    @FindBy(xpath = "//table[@class='ProductsTable']//tr[4]/td")
    private List<WebElement> products_thirdrow;

    public WAllProductPage() {
        PageFactory.initElements(getDriver(), this);
    }

    // Store all rows text values as List<String>

    public List<String> getHeaderText() {
        return getTextFromWebElements(products_header);
    }

    public List<String> getFirstRowText() {
        return getTextFromWebElements(products_firstrow);
    }

    public List<String> getSecondRowText() {
        return getTextFromWebElements(products_secondrow);
    }

    public List<String> getThirdRowText() {
        return getTextFromWebElements(products_thirdrow);
    }

    /*
        -   Eventually each row is expected result in step definition
        -   Each row is represented as a map, so one way to organize the method is to get the actual result
            as a map, then do a map to map comparison
     */
    public Map<String, String> getRowMapFromWebTable() {
        /*
            Create a map, key as column name, value as cell value
         */
        Map<String, String> row_map = new LinkedHashMap<>();

        // All headers
        List<String> all_headers = getHeaderText();

        //First row
        List<String> items_first_row = getFirstRowText();

        for (int i = 0; i < all_headers.size(); i++) {
            row_map.put(all_headers.get(i), items_first_row.get(i));
        }

        return row_map;
    }
}
