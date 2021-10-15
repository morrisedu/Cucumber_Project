package com.cydeo.step_definitions;

import com.cydeo.pages.WAllProductPage;
import io.cucumber.java.en.And;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class HomeworkStepDef {
    @And("we should see table with below content")
    public void weShouldSeeTableWithBelowContent(List<Map<String, String>> product_map_list) {
        System.out.println(product_map_list);

        WAllProductPage all_product = new WAllProductPage();

        // Compare Maps
        Map<String, String> actual_firstrow = all_product.getRowMapFromWebTable();
        assertEquals(product_map_list.get(0), actual_firstrow);

        // Get expected header

        Set<String> header_set = product_map_list.get(0).keySet();
        System.out.println("header_set = " + header_set);
        // Convert Set to List
        List<String> expected_header = new ArrayList<>(header_set);

        // Actual header
        List<String> actual_header = all_product.getHeaderText();
        System.out.println("actual_header = " + actual_header);

        // Size should be the same
        assertEquals(header_set.size(), actual_header.size());

        assertEquals(expected_header, actual_header);
    }
}
