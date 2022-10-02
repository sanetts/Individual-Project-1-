public class Routes {
/**
 * Instance Variables/Fields
 */

    private final String airline_code;
    private final int airline_id;
    private final String airport_code_source;
    private final int airport_id_source;
    private final String destination_airport_code;
    private final int destination_airport_id;
    private final String codeshare;
    private final int stops;
    private final String equipment;

    public Routes(String airline_code, int airline_id,
                  String airport_code_source, int airport_id_source,
                  String destination_airport_code, int destination_airport_id,
                  String codeshare, int stops, String equipment) {
        this.airline_code = airline_code;
        this.airline_id = airline_id;
        this.airport_code_source = airport_code_source;
        this.airport_id_source = airport_id_source;
        this.destination_airport_code = destination_airport_code;
        this.destination_airport_id = destination_airport_id;
        this.codeshare = codeshare;
        this.stops = stops;
        this.equipment = equipment;
    }

    public String getAirline_code() {
        return airline_code;
    }

    public int getAirline_id() {
        return airline_id;
    }

    public String getAirport_code_source() {
        return airport_code_source;
    }

    public int getAirport_id_source() {
        return airport_id_source;
    }

    public String getDestination_airport_code() {
        return destination_airport_code;
    }

    public int getDestination_airport_id() {
        return destination_airport_id;
    }

    public String getCodeshare() {
        return codeshare;
    }

    public int getStops() {
        return stops;
    }

    public String getEquipment() {
        return equipment;
    }

    @Override
    public String toString() {
        return "Routes{" +
                "airline_code='" + airline_code + '\'' +
                ", airline_id=" + airline_id +
                ", airport_code_source='" + airport_code_source + '\'' +
                ", airport_id_source='" + airport_id_source + '\'' +
                ", destination_airport_code='" + destination_airport_code + '\'' +
                ", destination_airport_id=" + destination_airport_id +
                ", codeshare='" + codeshare + '\'' +
                ", stops='" + stops + '\'' +
                ", equipment='" + equipment + '\'' +
                '}';
    }
}


