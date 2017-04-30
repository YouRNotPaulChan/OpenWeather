package com.example.openweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by paul_chan on 17-4-30.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}
