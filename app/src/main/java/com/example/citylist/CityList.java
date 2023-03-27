package com.example.citylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * This is a class that keeps track of a list of city objects
 */
public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if that city does not exist
     *
     * @param city This is the city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This delete a city from the list if that city  exist
     *
     * @param city This is the city to delte
     */
    public void delete(City city) {
        if (!cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        else
            cities.remove(city);
    }


    /**
     * This returns a count of the cities
     *
     * @return Return the total count of cities
     */
    public int count() {
        return cities.size();
    }


    /**
     * This returns a sorted list of province when i=1 and returns a sorted list of cities when i-0
     *
     * @return Return the sorted list of province or Return the sorted list of cities
     */
    public List<City> getCities(int i) {
        List<City> cityList = cities;
        if(i==0)
        Collections.sort(cityList);
        else
        {
            Collections.sort(cityList, new Comparator<City>() {
                @Override
                public int compare(City city, City t1) {
                    return city.getProvinceName().compareToIgnoreCase(t1.getProvinceName());
                }
            });
        }
        return cityList;
    }



}