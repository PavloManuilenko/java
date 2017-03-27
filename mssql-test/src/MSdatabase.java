import java.sql.*;

public class MSdatabase {
    private String dbURL = "";
    private String dbUser = "";
    private String dbUserPass = "";

    public MSdatabase() {
        this.dbURL = "jdbc:sqlserver://CCITESQL15.coastalcontacts.com:1433;databaseName=MIG4_TEST";
        this.dbUser = "devuser";
        this.dbUserPass = "W@11gen";
    }

    public MSdatabase(String dbURL, String dbUser, String dbUserPass) {
        this.dbURL = dbURL;
        this.dbUser = dbUser;
        this.dbUserPass = dbUserPass;
    }

    public Customer selectCustomerFromDBByEmail(String email) {
        Customer customer = new Customer();

        try (Connection connection = DriverManager.getConnection(this.dbURL, this.dbUser, this.dbUserPass)) {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("" +
                    "select uidpk, first_name, last_name, email, password, store_uid\n" +
                    "from tcustomer\n" +
                    "where email = '" + email + "';");

            resultSet.next();
            customer.setId(resultSet.getLong("uidpk"));
            customer.setfName(resultSet.getString("first_name"));
            customer.setlName(resultSet.getString("last_name"));
            customer.setMail(resultSet.getString("email"));
            customer.setPass(resultSet.getString("password"));
            customer.setStoreFront(resultSet.getInt("store_uid"));

        } catch (NullPointerException | SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return customer;
    }

    public Customer selectCustomerFromDBByID(long id) {
        Customer customer = new Customer();

        try (Connection connection = DriverManager.getConnection(this.dbURL, this.dbUser, this.dbUserPass)) {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("" +
                    "select uidpk, first_name, last_name, email, password, store_uid\n" +
                    "from tcustomer\n" +
                    "where uidpk = " + id + ";");

            resultSet.next();
            customer.setId(resultSet.getLong("uidpk"));
            customer.setfName(resultSet.getString("first_name"));
            customer.setlName(resultSet.getString("last_name"));
            customer.setMail(resultSet.getString("email"));
            customer.setPass(resultSet.getString("password"));
            customer.setStoreFront(resultSet.getInt("store_uid"));

        } catch (NullPointerException | SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return customer;
    }

}
