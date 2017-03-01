import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParserCSV {

    public static List<Customer> parseToCustomer(String fileCSV) {
        List<Customer> listOfCustomer = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileCSV))) {
            String line;
            while (null != (line = reader.readLine())) {
                if (!line.startsWith("id")) {
                    String[] fields = line.split(";");

                    long id = Long.valueOf(fields[0]);
                    String fName = fields[1];
                    String lName = fields[2];
                    String mail = fields[3];
                    String pass = fields[4];
                    int storeFront = Integer.valueOf(fields[5]);

                    listOfCustomer.add(new Customer(id, fName, lName, mail, pass, storeFront));
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfCustomer;
    }
}
