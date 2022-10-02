/**
 * @author Sandra Nettey
 *
 */

public class AirlinesInfo {
    /**
     * Instance Variables/Fields
     * callsign
     * active
     * airline_id
     * airline_name
     * alias
     * country
     * IATA_code
     * ICAO_code
     */

    private final String callsign;
    private final String active;
    private final int airline_id;
    private final String airline_name;
    private final String alias;
    private final String country;
    private final String IATA_code;
    private final String ICAO_code;

    /**
     * Constructor:
     * Building an object of the AirlinesInfo class
     * @param callsign
     * @param active
     * @param airline_id
     * @param airline_name
     * @param alias
     * @param country
     * @param IATA_code
     * @param ICAO_code
     */


    public AirlinesInfo(int airline_id,
                        String airline_name,
                        String alias,
                        String IATA_code,
                        String ICAO_code,
                        String callsign,
                        String country,
                        String active) {
        this.callsign = callsign;
        this.active = active;
        this.airline_id = airline_id;
        this.airline_name = airline_name;
        this.alias = alias;
        this.country = country;
        this.IATA_code = IATA_code;
        this.ICAO_code = ICAO_code;
    }

    /** Accesor Method
     * @return callsign
     */
    public String getCallsign() {
        return callsign;
    }
    /** Accesor Method
     * @return active
     */
    public String getActive() {
        return active;
    }
    /** Accesor Method
     * @return active
     */
    public int getAirline_id() {
        return airline_id;
    }
    /** Accesor Method
     * @return airline_name
     */
    public String getAirline_name() {
        return airline_name;
    }

    /** Accesor Method
     * @return alias
     */
    public String getAlias() {
        return alias;
    }

    /** Accesor Method
     * @return country
     */
    public String getcountry() {
        return country;
    }

    /** Accesor Method
     * @return IATA_code
     */
    public String getIATA_code() {
        return IATA_code;
    }

    /** Accesor Method
     * @return ICAO_code
     */
    public String getICAO_code() {
        return ICAO_code;
    }

    @Override
    public String toString() {
        return "AirlinesInfo{" +
                "callsign='" + callsign + '\'' +
                ", active='" + active + '\'' +
                ", airline_id=" + airline_id +
                ", airline_name='" + airline_name + '\'' +
                ", alias='" + alias + '\'' +
                ", country='" + country + '\'' +
                ", IATA_code='" + IATA_code + '\'' +
                ", ICAO_code='" + ICAO_code + '\'' +
                '}';
    }
}
