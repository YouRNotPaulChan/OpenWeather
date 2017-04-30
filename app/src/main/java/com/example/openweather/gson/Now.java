package com.example.openweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by paul_chan on 17-4-30.
 */

public class Now {
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
    @SerializedName("txt")
        public String info;
    }
}
