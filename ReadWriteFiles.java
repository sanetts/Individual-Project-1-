import java.io.*;
import java.util.ArrayList;

/**
 * @author Sandra Nettey
 *
 */


public class ReadWriteFiles {
    public static ArrayList<String[]> readFile(String filename) {
        ArrayList<String[]> item = new ArrayList<>();

        try {
            File file = new File(filename);
            BufferedReader bufread = new BufferedReader(new FileReader(file));
            String[] attr_arr;
            String line;

            while ((line = bufread.readLine()) != null) {
                attr_arr = line.split(",");
                item.add(attr_arr);
            }

            bufread.close();

        } catch (FileNotFoundException fnfe) {
            System.out.println("An error occured.");
            System.out.println("File Not Found Exception: " + fnfe.getMessage());
            fnfe.printStackTrace();
        } catch (IOException e) {
            System.out.println("IOE Exception: " + e.getMessage());
        }
        return item;
    }


    public static ArrayList<AirportsInfo> airport_data = new ArrayList<>();
    public static ArrayList<AirlinesInfo> airline_data = new ArrayList<>();
    public static ArrayList<Routes> routes_data = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<String[]> airport_attr_arr = new ArrayList<>(ReadWriteFiles.readFile("Intermediate Computer Programming/src/airports.csv"));
        ArrayList<String[]> airline_attr_arr = new ArrayList<>(ReadWriteFiles.readFile("Intermediate Computer Programming/src/airlines.csv"));
        ArrayList<String[]> routes_attr_arr = new ArrayList<>(ReadWriteFiles.readFile("Intermediate Computer Programming/src/routes.csv"));

        for (String[] array : airport_attr_arr) {
            AirportsInfo airport_obj = create_object.airport_obj(array);
            airport_data.add(airport_obj);
        }


        for (String[] array : airline_attr_arr) {
            AirlinesInfo airline_obj = create_object.airline_obj(array);
            airline_data.add(airline_obj);
        }


        for (String[] array : routes_attr_arr) {
            Routes routes_obj = create_object.routes_obj(array);
            routes_data.add(routes_obj);
        }


        //Problem prob = new Problem(248, 492, routes_data);
        //System.out.println(ucs.uniform_cost_search(prob));

    }
    public static void writeFile(String filename, StringBuilder routes_info) {

        String data = routes_info.toString();
        try {
            File writeFile = new File(filename);
            BufferedWriter write = new BufferedWriter(new FileWriter(filename));
            String[] lines = data.split(System.lineSeparator());
            for (String line : lines) {
                write.write(line);
                write.newLine();
            }
            System.out.println("File Created");
            write.close();

        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}