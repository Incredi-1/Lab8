package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * Create a mock list for testing
     * @return the mocked list
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * Test the addCity method
     * Ensure that the size of the list increases when a new city is added
     */
    @Test
    public void addCityTest(){
        list = MockCityList();  // Initialize the list with an empty mock list
        int listSize = list.getCount();  // Get the current size of the list

        list.addCity(new City("Estevan", "SK"));  // Add a new city to the list
        assertEquals(list.getCount(), listSize + 1);  // Check if size increased by 1
    }
}
