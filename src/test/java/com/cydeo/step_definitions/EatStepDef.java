package com.cydeo.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.Assert.assertEquals;

public class EatStepDef {
    // Alice
    @Given("Alice is hungry")
    public void alice_is_hungry() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("This is @Given");
    }

    @When("he eats {int} cucumbers")
    public void he_eats_cucumbers(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("This is @When");
    }

    @Then("she will be full")
    public void she_will_be_full() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("This is @Then");
    }

    // Ivan
    @Given("Ivan is hungry")
    public void ivan_is_hungry() {
        System.out.println("Ivan is hungry");
    }

    @Then("he faints")
    public void he_faints() {
        System.out.println("Ivan faints");
    }

    int start, ate;
    @Given("there are {int} cucumbers")
    public void there_are_cucumbers(Integer start) {
        this.start = start;
    }
    @When("I eat {int} cucumbers")
    public void i_eat_cucumbers(Integer ate) {
        this.ate = ate;
    }
    @Then("I should have {int} cucumbers")
    public void i_should_have_cucumbers(Integer left) {
        assertEquals((long) left, (long) (start - ate));
    }
}
