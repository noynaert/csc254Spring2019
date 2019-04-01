public class WeatherStation implements Comparable<WeatherStation> {
    String city;
    String latitude;
    String longitude;

    public WeatherStation(String city, String latitude, String longitude) {
        this.city = city;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "WeatherStation{" +
                "city='" + city + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                '}';
    }

    public int compareTo(WeatherStation other) {
        int result = 0;
        result = this.city.compareToIgnoreCase(other.city);
        if(result == 0)
            result = this.latitude.compareTo(other.latitude);
        return result;
    }
}
