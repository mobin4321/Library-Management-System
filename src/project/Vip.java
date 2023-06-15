package project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import javax.swing.JOptionPane;

public class Vip extends Student {

    public Vip(String id) {
        super.setstudentid(id);
    }

    public Vip() {
        super.setstudentid("");
    }

    @Override
    public void addstudent() throws SQLException {
        Cipher cipher = new Cipher();
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        try {
            String query1 = "Select * FROM vips WHERE vip_id = '" + cipher.encode(super.getstudentid()) + "'";
            ResultSet r1 = statement.executeQuery(query1);
            if (r1.next()) {
                JOptionPane.showMessageDialog(null, "I.D " + super.getstudentid() + " already has active membership.");
            } else {
                LocalDateTime now = LocalDateTime.now();
                LocalDateTime due_date = now.plusMonths(6);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY/MM/dd");
                String str = formatter.format(due_date);
                String query2 = "INSERT INTO vips VALUES('" + cipher.encode(super.getstudentid()) + "', '" + cipher.encode(str) + "')";
                statement.executeUpdate(query2);
                JOptionPane.showMessageDialog(null, "VIP Membership Successful for I.D " + super.getstudentid());

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            con.close();
            statement.close();
        }
    }

    @Override
    public void removestudent() throws SQLException {
        Cipher cipher = new Cipher();
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        try {

            String query1 = "Select * FROM vips WHERE vip_id = '" + cipher.encode(super.getstudentid()) + "'";
            ResultSet r1 = statement.executeQuery(query1);
            if (r1.next()) {
                String query2 = "DELETE FROM vips WHERE vip_id='" + cipher.encode(super.getstudentid()) + "'";
                statement.executeUpdate(query2);
                JOptionPane.showMessageDialog(null, "Membership cancelled forI.D " + super.getstudentid() + ".");
            } else {
                JOptionPane.showMessageDialog(null, "I.D " + super.getstudentid() + " has no active membership.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went Wrong !");
        } finally {
            con.close();
            statement.close();
        }
    }

    public void vipended() throws SQLException {
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        try {
            String query = "SELECT * FROM  vips";
            ResultSet result = statement.executeQuery(query);
            if (result.next()) {
                while (result.next()) {
                    LocalDateTime now = LocalDateTime.now();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
                    String str = formatter.format(now);
                    Date a = java.sql.Date.valueOf(str);
                    Date b = result.getDate(2);
                    int c = a.compareTo(b);
                    if (c > 0) {
                        String query2 = "DELETE FROM vips WHERE vip_id='" + result.getInt(1) + "'";
                        statement.executeUpdate(query2);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            con.close();
            statement.close();
        }
    }

    @Override
    public String countstudents() throws SQLException {
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        try {
            String totalvips = null;
            String query = "SELECT COUNT(vip_id) FROM vips";

            ResultSet result = statement.executeQuery(query);
            if (result.next()) {
                totalvips = Integer.toString(result.getInt(1));

            }
            return totalvips;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went Wrong !");
            return "";
        } finally {
            con.close();
            statement.close();
        }
    }

    public ResultSet getstudent(String query) throws SQLException {
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        try {
            ResultSet result = statement.executeQuery(query);
            return result;
        } catch (Exception e) {
            return null;
        }
    }
}
