package com.example.openweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by paul_chan on 17-4-28.
 */

public class Province extends DataSupport {
    private int id;//每个实体类中应有的字段
    private String provinceName;//省名
    private int provinceCode;//省代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }
}
