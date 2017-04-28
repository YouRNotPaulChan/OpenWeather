package com.example.openweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by paul_chan on 17-4-28.
 */

public class County extends DataSupport {
    private int id;
    private String countyName;//县名
    private String weatherId;//天气代号
    private int cityId;//所属城市ID

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
