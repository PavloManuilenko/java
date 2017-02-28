import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Customer> listOfCustomer = ParserCSV.ParseToCustomer("E:\\GitHub\\java\\parsingCSV\\customer.csv");
        System.out.println(listOfCustomer.toString());
    }
}
