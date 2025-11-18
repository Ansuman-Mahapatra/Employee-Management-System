package employee.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class conn {

    public Connection connection;
    public Statement statement;

    public conn() {
        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to database (change password if needed)
            connection = DriverManager.getConnection(
                "jdbc:mysql://127.0.0.1:3306/employeemanagement", 
                "ansuman", 
                "0747"
            );
            statement = connection.createStatement();

            // Create login table if it doesn't exist
            String createTable = """
                CREATE TABLE IF NOT EXISTS login (
                    username VARCHAR(50) PRIMARY KEY,
                    password VARCHAR(50) NOT NULL,
                    role VARCHAR(20) DEFAULT 'user'
                )""";
            statement.executeUpdate(createTable);

            // Check if default users exist, if not → insert them
            ResultSet rs = statement.executeQuery("SELECT COUNT(*) FROM login");
            rs.next();
            int count = rs.getInt(1);
            rs.close();

            if (count == 0) {
                // Insert default Admin and User
                statement.executeUpdate(
                    "INSERT INTO login (username, password, role) VALUES ('admin', 'admin123', 'admin')"
                );
                statement.executeUpdate(
                    "INSERT INTO login (username, password, role) VALUES ('user', 'user123', 'user')"
                );
                System.out.println("Default users created: admin/admin123 and user/user123");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}