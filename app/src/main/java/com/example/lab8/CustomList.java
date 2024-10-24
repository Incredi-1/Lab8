package com.example.lab8;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

/**
 * This class represents a custom list of cities, extending the ArrayAdapter.
 */
public class CustomList extends ArrayAdapter<City> {

    private ArrayList<City> cities;
    private Context context;

    /**
     * Constructs a new CustomList.
     *
     * @param context The application context.
     * @param cities The list of cities to display.
     */
    public CustomList(Context context, ArrayList<City> cities) {
        super(context, 0, cities);
        this.cities = cities;
        this.context = context;
    }

    /**
     * Provides a view for the ListView.
     *
     * @param position The position of the item within the list.
     * @param convertView The old view to reuse, if possible.
     * @param parent The parent that this view will eventually be attached to.
     * @return A View corresponding to the city at the specified position.
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(context).inflate(R.layout.content, parent, false);
        }

        City city = cities.get(position);
        TextView cityName = view.findViewById(R.id.city_text);
        TextView provinceName = view.findViewById(R.id.province_text);

        cityName.setText(city.getCityName());
        provinceName.setText(city.getProvinceName());

        return view;
    }

    /**
     * Gets the total number of cities in the list.
     *
     * @return The number of cities.
     */
    public int getCount() {
        return cities.size();
    }

    /**
     * Adds a city to the list.
     *
     * @param city The city to add.
     */
    public void addCity(City city) {
        cities.add(city);
    }

    /**
     * Checks if a given city is in the list.
     *
     * @param city The city to check.
     * @return true if the city is in the list, false otherwise.
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

    /**
     * Deletes a city from the list.
     *
     * @param city The city to delete.
     */
    public void deleteCity(City city) {
        cities.remove(city);
    }

    /**
     * Counts the total number of cities in the list.
     *
     * @return The number of cities in the list.
     */
    public int countCities() {
        return cities.size();
    }
}
