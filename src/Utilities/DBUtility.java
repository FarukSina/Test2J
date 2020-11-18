package Utilities;
// Faruk Sina Kaya - 200437201

import Models.Customer;

import java.sql.*;
import java.util.ArrayList;

public class DBUtility {
    private static String user = "student";
    private static String password = "student";


    /**
     * This method will return an ArrayList of Edible Products objects from
     * the database.
     */
    public static ArrayList<Customer> getCustomers() throws SQLException {
        ArrayList<Customer> customers = new ArrayList<>();
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;


        try {
            //1. connect to the DB
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/f20comp1011test2",
                    user, password);

            //2. create a statement object
            statement = conn.createStatement();
            //3. create/execute the sql query


            resultSet = statement.executeQuery("SELECT number, gender,givenname,birthday, surname,city, province,bloodtype FROM customers");
            //4. loop over the results
            while (resultSet.next()) {
                Customer newCustomers = new Customer(
                        resultSet.getInt("number"),
                        resultSet.getString("gender"),
                        resultSet.getString("givenname"),
                        resultSet.getString("surname"),
                        resultSet.getString("birthday"),
                        resultSet.getString("city"),
                        resultSet.getString("province"),
                        resultSet.getString("bloodtype")
                );
                customers.add(newCustomers);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (conn != null)
                conn.close();
            if (statement != null)
                statement.close();
            if (resultSet != null)
                resultSet.close();
            return customers;
        }
    }

}
