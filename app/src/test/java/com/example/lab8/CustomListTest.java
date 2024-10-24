package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;

    /**
     * Creates a mock list for cities
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * Test for adding a city and checking if the size increases
     */
    @Test
    public void addCityTest() {
        list = MockCityList();  // Create a mock list
        int initialSize = list.getCount();  // Get initial size
        list.addCity(new City("Estevan", "SK"));  // Add new city
        assertEquals(list.getCount(), initialSize + 1);  // Check if size increased by 1
    }
}
