public class AirportsInfo {
    /**
     * Instance Variables/Fields
     */

    private final int airport_id;
    private final String airport_name;
    private final String city;
    private final String country;
    private final String IATA_code;
    private final String ICAO_code;
    private final double latitude;
    private final  double longitude;
    private final double altitude;
    private final double timezone;
    private final String daylight_savings_time;
    private final String time_zone_db;
    private final String type;
    private final String data_source;

     /**
     * Constructor:
     * Building an object of class AirportsInfo
     @params:
      * airport_name,
      * city,
      * country,
      * IATA_code,
      * ICAO_code,
      * latitude,
      * longitude,
      * altitude,
      * timezone,
      * daylight_savings_time,
      * time_zone_db,
      * type,
      * data_source

     **/

    public AirportsInfo(int airport_id,
                        String airport_name,
                        String city,
                        String country,
                        String IATA_code,
                        String ICAO_code,
                        double latitude,
                        double longitude,
                        double altitude,
                        double timezone,
                        String daylight_savings_time,
                        String time_zone_db,
                        String type,
                        String data_source) {

        this.airport_id = airport_id;
        this.airport_name = airport_name;
        this.city = city;
        this.country = country;
        this.IATA_code = IATA_code;
        this.ICAO_code = ICAO_code;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        this.timezone = timezone;
        this.daylight_savings_time = daylight_savings_time;
        this.time_zone_db = time_zone_db;
        this.type = type;
        this.data_source = data_source;



    }

    /**
     * accessor method for Airport_id:
     * @return airport_id
     */
    public int getAirport_id() {
        return airport_id;
    }

    /**
     * accessor method for getAirport_name:
     * @return airport_name
     */
    public String getAirport_name() {
        return airport_name;
    }

    /**
     * accessor method for city:
     * @return city
     */
    public String getCity() {
        return city;
    }

    /**
     * accessor method for country:
     * @return country
     */

    public String getCountry() {
        return country;
    }

    /**
     * accessor method for IATA_code:
     * @return IATA_code
     */
    public String getIATA_code() {
        return IATA_code;
    }


    /**
     * accessor method for ICAO_code:
     * @return ICAO_code
     */
    public String getICAO_code() {
        return ICAO_code;
    }

    /**
     * accessor method for latitude:
     * @return latitude
     */
    public double getLatitude() {
        return latitude;
    }

    /**
     * accessor method for longitude:
     * @return longitude
     */

    public double getLongitude() {
        return longitude;
    }

    /**
     * accessor method for altitude:
     * @return altitude
     */
    public double getAltitude() {
        return altitude;
    }

    /**
     * accessor method for timezone:
     * @return timezone
     */
    public double getTimezone() {
        return timezone;
    }

    /**
     * accessor method for daylight_savings_time:
     * @return daylight_savings_time
     */
    public String getDaylight_savings_time() {
        return daylight_savings_time;
    }


    /**
     * accessor method for time_zone_db:
     * @return time_zone_db
     */
    public String getTime_zone_db() {
        return time_zone_db;
    }

    /**
     * accessor method for type:
     * @return type
     */
    public String getType() {
        return type;
    }

    /**
     * accessor method for data_source:
     * @return data_source
     */
    public String getData_source() {
        return data_source;
    }


    @Override
    public String toString() {
        return "AirportsInfo{" +
                "airport_id=" + airport_id +
                ", airport_name='" + airport_name + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", IATA_code='" + IATA_code + '\'' +
                ", ICAO_code='" + ICAO_code + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", altitude=" + altitude +
                ", timezone=" + timezone +
                ", daylight_savings_time='" + daylight_savings_time + '\'' +
                ", time_zone_db='" + time_zone_db + '\'' +
                ", type='" + type + '\'' +
                ", data_source='" + data_source + '\'' +
                '}';
    }
}
