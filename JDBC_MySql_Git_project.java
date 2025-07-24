
import java.sql.*;

public class JDBC_MySql_Git_project {
    public static void main(String[] args) {
        System.out.println("Here, I have show that how Java application connect with DB using JDBC.");
        System.out.println("After Connect java Application with DB through JDBC then i will upload in GitHub");
        System.out.println("MySql DB --> Java Application --> Upload in GitHub ");

        // First of all i connect java Application to DB through JDBC Driver connection
        // After that i follow the JDBC step

        // Step 1: DB url, user, password
        String url = "jdbc:mysql://localhost:3306/libraryDB";
        String username = "root";
        String password = "12345";

        try{
            // Step 2: Load the JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 3: Establish Connection of MySql Db
            Connection connection = DriverManager.getConnection(url,username,password);

            // Step 4: Create a statement object to run queries
            Statement statement = connection.createStatement();
            System.out.println("Successfully Connect with DB!");

            // Step 5: Execute MySql queries
            String query = "SELECT * FROM students";
            ResultSet rs= statement.executeQuery(query);

            // Step 6: Process the result
            System.out.println("Students details: ");

            while (rs.next()){

                int id = rs.getInt("id");
                String gender = rs.getString("gender");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println("ID: " +id+ ", Gender : " +gender+ ", Name : " +name+ ", Age : " +age);
            }

        }catch (Exception e){
            System.out.println("SQL Exception: " +e.getMessage());
        }

        System.out.println("Successfully Execute Java Application Program connect with JDBC...");
        System.out.println("Java application executed successfully using JDBC.");
        System.out.println("Hello from feature branch!");
    }
}