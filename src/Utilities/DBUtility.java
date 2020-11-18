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
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/F20COMP1011TEST2",
                    user, password);

            //2. create a statement object
            statement = conn.createStatement();

            //3. create/execute the sql query
            resultSet = statement.executeQuery("SELECT  number, givenname, surname,age,gender,city,province,telephonenumber FROM customers LIMIT 0 1000");

            public Customer(int id, String gender, String firstName, String lastName, String province, String bloodType, String birthday) {
                setId(id);
                setGender(gender);
                setFirstName(firstName);
                setLastName(lastName);
                setProvince(province);
                setbloodType(bloodType);
                setBirthday(birthday);
            }
            //4. loop over the results
            while (resultSet.next()) {
                Customer newFood = new Customer(
                        resultSet.getInt("number"),
                        resultSet.getString("givenname"),
                        resultSet.getString("surname"),
                        resultSet.getString("age"),
                        resultSet.getString("gender"),
                        resultSet.getString("city"),
                        resultSet.getString("province"),
                        resultSet.getString("telephonenumber")
                );
                customers.add(newFood);
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
