package lbstest.example.com.coolweather.gson;

/**
 * Created by 123 on 2017/9/22.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
