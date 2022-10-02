import java.io.*;
import java.util.ArrayList;

//This class creates Airport, Airline and Route Objects
public class create_object {
    public static AirportsInfo airport_obj(String[] airport_arr) {
        int airport_id = 0;
        double latitude = 0.0;
        double longitude = 0.0;
        double altitude = 0.0;
        double timezone = 0.0;

        try {
            airport_id = Integer.parseInt(airport_arr[0]);
            latitude = Double.parseDouble(airport_arr[6]);
            longitude = Double.parseDouble(airport_arr[7]);
            altitude = Double.parseDouble(airport_arr[8]);
            timezone = Double.parseDouble(airport_arr[9]);
        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());

        }

        String airport_name = airport_arr[1];
        String city = airport_arr[2];
        String country = airport_arr[3];
        String IATA_code = airport_arr[4];
        String ICAO_code = airport_arr[5];
        String daylight_savings_time = airport_arr[10];
        String time_zone_db = airport_arr[11];
        String type = airport_arr[12];
        String data_source = airport_arr[13];

        return new AirportsInfo(
                airport_id, airport_name, city, country, IATA_code, ICAO_code, latitude, longitude, altitude,
                timezone, daylight_savings_time, time_zone_db, type, data_source
        );
    }

    public static AirlinesInfo airline_obj(String[] airline_arr) {
        int airline_id = 0;

        try {
            airline_id = Integer.parseInt(airline_arr[0]);

        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());

        }

        String airline_name = airline_arr[1];
        String alias = airline_arr[2];
        String IATA_code = airline_arr[3];
        String ICAO_code = airline_arr[4];
        String callsign = airline_arr[5];
        String country = airline_arr[6];
        String active = airline_arr[7];


        return new AirlinesInfo(
                airline_id,airline_name, alias, IATA_code, ICAO_code, callsign, country, active
        );
    }
    public static Routes routes_obj(String[] routes_arr) {
        int airline_id = 0;
        int destination_airport_id = 0;
        int airport_id_source =0;
        int stops = 0;

        try {
            airline_id = Integer.parseInt(routes_arr[1]);
            destination_airport_id = Integer.parseInt(routes_arr[5]);
            airport_id_source = Integer.parseInt(routes_arr[3]);
            stops = Integer.parseInt(routes_arr[7]);

        } catch (NumberFormatException nfe) {
            System.out.println("NumberFormatException: " + nfe.getMessage());

        }

        String airline_code = routes_arr[0];
        String airport_code_source = routes_arr[2];
        String destination_airport_code = routes_arr[4];
        String codeshare = routes_arr[6];

        String equipment = routes_arr[routes_arr.length - 1];


        Routes Routes = new Routes(
                airline_code, airline_id, airport_code_source , airport_id_source,
                destination_airport_code,destination_airport_id , codeshare, stops, equipment
        );
        return Routes;
    }

}