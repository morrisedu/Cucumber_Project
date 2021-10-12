package com.cydeo.step_definitions;

import com.cydeo.pages.WCommonArea;
import com.cydeo.pages.WOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public class WebOrderFunctionality_StepDef {
    WCommonArea common = new WCommonArea();
    WOrderPage order = new WOrderPage();

    @When("we select {string} tab from side bar")
    public void we_select_tab_from_side_bar(String string) {
        common.orderTab.click();
    }

    @Then("I should see below options in product dropdown list")
    public void i_should_see_below_options_in_product_dropdown_list(List<String> expected_opt) {
        System.out.println("expected_opt = " + expected_opt);

        System.out.println("actual_opt = " + order.availableOptionsDropdown());

        assertEquals(expected_opt, order.availableOptionsDropdown());
    }

}
