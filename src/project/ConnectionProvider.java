package project;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionProvider {

    static Connection c = null;

    public static Connection getconnection() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "mobinahmed_32");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong!");
        }
        return c;
    }
}
