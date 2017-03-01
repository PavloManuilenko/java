import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> listOfCustomer = ParserCSV.ParseToCustomer("customer.csv");
        System.out.println(listOfCustomer.toString());
    }
}
