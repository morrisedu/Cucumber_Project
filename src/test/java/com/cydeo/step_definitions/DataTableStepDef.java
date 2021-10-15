package com.cydeo.step_definitions;

import com.cydeo.pages.WLoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;
import java.util.Map;

public class DataTableStepDef {
    @Given("I have a {string}")
    public void i_have_a(String animal) {
        System.out.println("I have " + animal);
    }
    @When("I call their names")
    public void i_call_their_names() {
        System.out.println("I call the animal");
    }
    @Then("they come")
    public void they_come() {
        System.out.println("They come");
    }

    @Given("I have the following animals")
    public void iHaveTheFollowingAnimals(List<String> animals) {
        System.out.println("Animals= " + animals);
    }

    @When("I call their names as below")
    public void iCallTheirNamesAsBelow(List<String> animal_names) {
        System.out.println("animal_names = " + animal_names);
    }

//    @Then("they come to me with the sounds")
//    public void theyComeToMeWithTheSounds(Map<String, String> animal_sounds) {
//        System.out.println("animal_sounds = " + animal_sounds);
//    }

    @Then("they come to me with the sounds")
    public void theyComeToMeWithTheSounds(List<List<String>> animal_sounds) {
        System.out.println("animal_sounds = " + animal_sounds);
    }

    @When("we provide the credentials below")
    public void weProvideTheCredentialsBelow(Map<String, String> credentials) {
        WLoginPage weborder_login = new WLoginPage();
        weborder_login.goTo();
        weborder_login.login(credentials.get("username"), credentials.get("password"));
    }

    @Given("This is the product reference")
    public void thisIsTheProductReference(List<Map<String, Object>> products_pricelist) {
//        for (Map<String, Object> product : products_pricelist) {
//            System.out.println(product);
//        }

        // Map<String, Object> third_row = products_pricelist.get(2);
        int i = 0;

//        for (Map<String, Object> each : products_pricelist) {
//            System.out.println(each.get("Price"));
//            i++;
//        }
    }

    @Given("I have this names")
    public void iHaveThisNames(Map<String, Map<String, String>> names_with_heros) {
        System.out.println("names_with_heros = " + names_with_heros);
    }

    @And("I have another table without a header")
    public void iHaveAnotherTableWithoutAHeader(List<List<String>> product_info) {
        System.out.println(product_info.get(0).get(1));
    }
}
