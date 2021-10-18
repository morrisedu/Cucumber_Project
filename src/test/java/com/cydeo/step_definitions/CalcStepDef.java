package com.cydeo.step_definitions;

import com.cydeo.pages.Calc;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertTrue;

public class CalcStepDef {
    Calc calc = new Calc();;
    int addition;

    @Given("calculator app is open")
    public void calculator_app_is_open() {
        System.out.println("===================");
        System.out.println("Start");
    }

    @When("I add {int} and {int}")
    public void i_add_and(Integer num1, Integer num2) {
        addition = calc.calcAdd(num1, num2);
        System.out.println("" + num1 + "+" + num2 + "=" + addition);
    }

    @Then("I should get the result {int} displayed")
    public void i_should_get_the_result_displayed(int result) {
        assertTrue(addition == result);
    }
}
