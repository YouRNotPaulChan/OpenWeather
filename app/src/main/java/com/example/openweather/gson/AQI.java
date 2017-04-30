package com.example.openweather.gson;

/**
 * Created by paul_chan on 17-4-30.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
