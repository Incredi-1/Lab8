package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

/**
 * This class contains unit tests for the CustomList class.
 */
public class CustomListTest {

    private CustomList list;

    /**
     * Mocks an empty CustomList for testing.
     *
     * @return A mocked empty CustomList.
     */
    public CustomList MockCityList() {
        list = new CustomList(null, new ArrayList<>());
        return list;
    }

    /**
     * Tests adding a city to the list and checks if the list size increases.
     */
    @Test
    public void addCityTest() {
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));
        assertEquals(list.getCount(), listSize + 1);
    }

    /**
     * Tests if the list correctly detects the presence of a city.
     */
    @Test
    public void hasCityTest() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        assertEquals(true, list.hasCity(city));

        City notInList = new City("Regina", "SK");
        assertEquals(false, list.hasCity(notInList));
    }

    /**
     * Tests removing a city from the list and checks if it is successfully deleted.
     */
    @Test
    public void deleteCityTest() {
        list = MockCityList();
        City city = new City("Estevan", "SK");
        list.addCity(city);
        list.deleteCity(city);
        assertEquals(false, list.hasCity(city));
    }

    /**
     * Tests counting the number of cities in the list.
     */
    @Test
    public void countCitiesTest() {
        list = MockCityList();
        City city1 = new City("Estevan", "SK");
        City city2 = new City("Regina", "SK");
        list.addCity(city1);
        list.addCity(city2);
        assertEquals(2, list.countCities());
        list.deleteCity(city1);
        assertEquals(1, list.countCities());
    }
}
