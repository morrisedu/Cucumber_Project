package com.cydeo.step_definitions;

import com.cydeo.pages.WCommonArea;
import com.cydeo.pages.WOrderPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class WebOrderFunctionality_StepDef {
    WCommonArea common = new WCommonArea();
    WOrderPage order = new WOrderPage();

    @When("we select {string} tab from side bar") // we select "View all products" tab from sidebar
    public void we_select_tab_from_side_bar(String tab_name) {
        switch (tab_name) {
            case "View all products":
                common.viewAllProductTab.click();
                break;
            case "View all orders":
                common.viewAllOrderTab.click();
                break;
            case "Order":
                common.orderTab.click();
                break;
            default:
                System.err.print("Invalid tab");
        }
    }

    @Then("I should see below options in product dropdown list")
    public void i_should_see_below_options_in_product_dropdown_list(List<String> expected_opt) {
        System.out.println("expected_opt = " + expected_opt);

        System.out.println("actual_opt = " + order.availableOptionsDropdown());

        assertEquals(expected_opt, order.availableOptionsDropdown());
    }
}
