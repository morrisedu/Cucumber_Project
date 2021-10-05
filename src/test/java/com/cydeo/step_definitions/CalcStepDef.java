package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalcStepDef {
    @Given("calculator app is open")
    public void calculator_app_is_open() {
        System.out.println("Calc is open");
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer num1, Integer num2) {
        System.out.println("Add " + num1 + " + " + num2);
    }
    @Then("I should get the result {int} displayed")
    public void i_should_get_the_result_displayed(Integer result) {
        System.out.println("Result should be " + result);
    }
}
