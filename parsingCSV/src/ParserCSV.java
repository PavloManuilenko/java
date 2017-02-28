import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ParserCSV {

    public static List<Customer> ParseToCustomer(String fileCSV) {
        List<Customer> listOfCustomer = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileCSV))){
            String line;
            while (null != (line = reader.readLine()) && !line.startsWith("id")) {
                Scanner scanner = new Scanner(line);
                scanner.useDelimiter(";");

                long id = scanner.nextLong();
                String fName = scanner.next();
                String lName = scanner.next();
                String mail = scanner.next();
                String pass = scanner.next();
                int storeFront = scanner.nextInt();

                listOfCustomer.add(new Customer(id, fName, lName, mail, pass, storeFront));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfCustomer;
    }
}
