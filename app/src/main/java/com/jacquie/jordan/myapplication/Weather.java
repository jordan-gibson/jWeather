package com.jacquie.jordan.myapplication;

import java.util.Calendar;

/**
 * Created by Jordan on 4/16/2017.
 *
 * This class represents the weather report for a single location, at a single point in time. For example we could have an instance of Weather containing the weather information for Buffalo's weather
 * at 1:15 pm, Sunday April 16. If we wanted to also have the weather in Phoenix available, we would create another instance of Weather for that location and time containing the weather report.
 *
 * The goal will be to get weather reports using the Dark Sky API (https://darksky.net/dev/). Currently
 */
public class Weather {
    private String mLatitude;
    private String mLongitude;
    private String mWeatherSummary;
    private Calendar mDateTime;

    /**
     * The Constructor for a Weather object.
     *
     * @param latitude - The latitude of the location for which we want to gather weather info.
     * @param longitude - The longitude of the location for which we want to gather weather info.
     */
    public Weather(String latitude,String longitude){

    }

    /**
     * This method is called to get the mWeatherSummary which has been stored in the Weather object.
     * @return The weather summary for an instance of Weather.
     */
    public String getWeatherSummary(){
        return "something";
    }
}
