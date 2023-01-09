package Lesson_7.Project.entity;


public class Weather {
    private String city;
    private String localDate;
    private String minTemperature;
    private String maxTemperature;

    public Weather(String city, String localDate, String minTemperature, String maxTemperature) {
        this.city = city;
        this.localDate = localDate;
        this.minTemperature = minTemperature;
        this.maxTemperature = maxTemperature;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    public String getMinTemperature() {
        return minTemperature;
    }

    public void setTemperature(String temperature) {
        this.minTemperature = temperature;
    }

    public void setMinTemperature(String minTemperature) {
        this.minTemperature = minTemperature;
    }

    public String getMaxTemperature() {
        return maxTemperature;
    }

    public void setMaxTemperature(String maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "city='" + city + '\'' +
                ", localDate='" + localDate + '\'' +
                ", temperature=" + String.format("%.2f", minTemperature) +
                '}';
    }
}