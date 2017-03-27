
public class Main {

    public static void main(String[] args) {

        MSdatabase db = new MSdatabase();
        Customer customer1 = db.selectCustomerFromDBByEmail("luxoft-test01@test.com");
        Customer customer2 = db.selectCustomerFromDBByID(19684360192L);
        System.out.println(customer1.toString());
        System.out.println(customer2.toString());

    }
}
