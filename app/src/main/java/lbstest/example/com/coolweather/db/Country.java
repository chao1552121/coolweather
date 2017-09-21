package lbstest.example.com.coolweather.db;

import org.litepal.crud.DataSupport;

/**
 * Created by 123 on 2017/9/21.
 */
public class Country extends DataSupport {
    private int id;
    private String countryName;
    private int weatherId;
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public String getCountryName() {
        return countryName;
    }

    public int getId() {
        return id;
    }

    public int getWeatherId() {
        return weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setWeatherId(int weatherId) {
        this.weatherId = weatherId;
    }
}
