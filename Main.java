import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;



public class Main {

    public static HashMap<Integer, AirportsInfo> airport_data = new HashMap<>();
    public static HashMap<Integer, AirlinesInfo> airline_data = new HashMap<>();
    public static ArrayList<Routes> routes_data = new ArrayList<>();
    public static HashMap<Integer, ArrayList<Routes>> routeMap = new HashMap<>();

    public static void main(String[] args) {

        ArrayList<String[]> airport_attr_arr = new ArrayList<>(ReadWriteFiles.readFile("Intermediate Computer Programming/src/airports.csv"));
        for(String[] array: airport_attr_arr) {
            AirportsInfo airport_obj = create_object.airport_obj(array);
            airport_data.put(airport_obj.getAirport_id(), airport_obj);
        }


        ArrayList<String[]> airline_attr_arr= new ArrayList<>(ReadWriteFiles.readFile("Intermediate Computer Programming/src/airports.csv"));
        for(String[] array: airline_attr_arr) {
            AirlinesInfo airline_obj = create_object.airline_obj(array);
            airline_data.put(airline_obj.getAirline_id(),airline_obj);
        }


        ArrayList<String[]> routes_attr_arr = new ArrayList<>(ReadWriteFiles.readFile("Intermediate Computer Programming/src/airports.csv"));
        for(String[] array: routes_attr_arr) {
            Routes routes_obj = create_object.routes_obj(array);
            if (routes_obj.getAirport_id_source() != 0 && routes_obj.getDestination_airport_id() != 0) {
                routes_data.add(routes_obj);
            } else {
                System.out.println("The source or destination ID cannot be null or zero.");
            }
        }

        ArrayList<String[]> routes_arr = new ArrayList<>(ReadWriteFiles.readFile("Intermediate Computer Programming/src/routes.csv"));
        for(String[] array: routes_arr) {
            Routes routes_obj = create_object.routes_obj(array);
            if (routes_obj.getAirport_id_source() != 0 && routes_obj.getDestination_airport_id() != 0) {
                routes_data.add(routes_obj);
                if (!(routeMap.containsKey(routes_obj.getAirport_id_source()))) {
                    ArrayList<Routes> list_of_routes= new ArrayList<>();
                    list_of_routes.add(routes_obj);
                    routeMap.put(routes_obj.getAirport_id_source(), list_of_routes);
                } else {
                    ArrayList<Routes> routeList = routeMap.get(routes_obj.getAirport_id_source());
                    routeList.add(routes_obj);
                }
            } else {
                System.out.println("The source or destination ID cannot be null or zero.");
            }
        }

//
//        ArrayList<Integer> source_airport_ids = getairport_id("Accra", "Ghana");
//        ArrayList<Integer> destination_airport_ids = getairport_id("Winnipeg", "Canada");
        ArrayList<Paths> all_paths = new ArrayList<>();

        ArrayList<String[]> input_file = ReadWriteFiles.readFile("Intermediate Computer Programming/src/Accra-Winnipeg.txt");
        String[] source_city_country = input_file.get(0);
        String[] dest_city_country = input_file.get(1);

        ArrayList<Integer> source_airport_ids = getairport_id(source_city_country[0].trim(),
                source_city_country[1].trim());
        ArrayList<Integer> destination_airport_ids = getairport_id(dest_city_country[0].trim(),
                dest_city_country[1].trim());

        for (Integer source_airport_id: source_airport_ids) {
            for (Integer destination_airport_id: destination_airport_ids) {
                Problem new_problem = new Problem(source_airport_id, destination_airport_id, routeMap);
                Paths path = ucs.uniform_cost_search(new_problem);
                if (path != null) {
                    all_paths.add(path);
                }
            }
        }

        StringBuilder data = new StringBuilder();
        int iterations = 0;
        int stops = 0;
        Collections.sort(all_paths);
        Paths optimal_path = all_paths.get(0);
        System.out.println(optimal_path);

        for (Integer airportID: optimal_path.getState_seq()) {
            for (Routes route: Main.routeMap.get(airportID)) {
                if (iterations < (optimal_path.getState_seq().size() -1)) {
                    if (route.getDestination_airport_id() == optimal_path.getState_seq().get(iterations + 1)) {
                        data.append((iterations + 1) + ". " +
                                route.getAirline_code() + " from " +
                                Main.airport_data.get(route.getAirport_id_source()).getIATA_code() + " to " +
                                Main.airport_data.get(route.getDestination_airport_id()).getIATA_code() + " " +
                                route.getStops() + " stops.\n"
                        );
                        iterations++;
                        stops += route.getStops();
                    }
                }
                }
            }

            data.append("\nTotal flights: ").append(iterations);
            data.append("\nTotal additional stops: ").append(stops);
            data.append("\nOptimality criteria: flights");

            ReadWriteFiles.writeFile("Intermediate Computer Programming/src/Accra-Winnipeg-output.txt", data);
        }


    public static ArrayList<Integer> getairport_id(String city, String country) {
        ArrayList<Integer> result = new ArrayList<>();
        for (AirportsInfo airport : airport_data.values()) {
            if (airport.getCity().equals(city) && airport.getCountry().equals(country)) {
                result.add(airport.getAirport_id());
            }
        }return result;

    }



    public static String getRoutebySourceID(int SourceID) {
        String result = null;
        for (Routes element : routes_data) {
            if (element.getAirport_id_source() == SourceID) {
                result = element.getAirport_code_source();
            }
        }
        return result;
    }

}
