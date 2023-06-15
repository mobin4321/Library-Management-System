package project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author MOBIN
 */
public class Defaulter extends Student {

    public Defaulter(String id) {
        super.setstudentid(id);
    }

    public Defaulter() {
        super.setstudentid("");
    }

    @Override
    public void addstudent() throws SQLException {
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        String query = "SELECT * FROM  bookhistory WHERE book_status='pending'";
        try {
            ResultSet result = statement.executeQuery(query);
            if (result.next()) {
                while (result.next()) {
                    LocalDateTime now = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
                    String str = formatter.format(now);
                    Date a = java.sql.Date.valueOf(str);
                    Date b = result.getDate(4);
                    int c = a.compareTo(b);
                    if (c > 0) {
                        String query2 = "INSERT INTO defaulter VALUES('" + result.getInt(1) + "')";
                        statement.executeUpdate(query2);
                    }
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
        } finally {
            con.close();
            statement.close();
        }
    }

    @Override
    public String countstudents() throws SQLException {
        String query = "SELECT COUNT(student_id) FROM defaulter";
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        try {
            String totaldefaulters = null;

            ResultSet result = statement.executeQuery(query);
            if (result.next()) {
                totaldefaulters = Integer.toString(result.getInt(1));
            }
            return totaldefaulters;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went Wrong !");
            return "";
        } finally {
            con.close();
            statement.close();
        }
    }

    public ResultSet getDefaulter(String query) throws SQLException {
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();

        try {
            ResultSet result = statement.executeQuery(query);
            return result;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went Wrong !");
            return null;
        }
    }
}
