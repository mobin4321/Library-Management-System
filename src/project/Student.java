package project;

import java.sql.*;
import javax.swing.JOptionPane;

public class Student {

    private String std_id;
    private String std_fname;
    private String std_lname;
    private String std_number;
    private String std_address;
    private String std_email;
    private String std_sex;
    private String std_password;

    public Student(String std_fname, String std_lname, String std_number, String std_address, String std_email, String std_sex, String std_password) {
        this.std_fname = std_fname;
        this.std_lname = std_lname;
        this.std_number = std_number;
        this.std_address = std_address;
        this.std_email = std_email;
        this.std_sex = std_sex;
        this.std_password = std_password;

    }

    public Student(String std_id) {
        this.std_id = std_id;
    }

    public void setgender(String gender) {
        this.std_sex = gender;
    }

    public void setstudentid(String id) {
        this.std_id = id;
    }

    public String getstudentid() {
        return std_id;
    }

    public Student() {
        this.std_id = "";
        this.std_fname = "";
        this.std_lname = "";
        this.std_number = "";
        this.std_address = "";
        this.std_email = "";
        this.std_sex = "";
        this.std_password = "";
    }

    public void addstudent() throws SQLException {
        Cipher cipher = new Cipher();
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        try {
            String query = "INSERT INTO student(student_fname,student_lname,student_phone,student_address,student_email,student_sex,student_password) VALUES('" + cipher.encode(this.std_fname) + "' , '" + cipher.encode(this.std_lname) + "' , '" + cipher.encode(this.std_number) + "' , '" + cipher.encode(this.std_address) + "' , '" + cipher.encode(this.std_email) + "' , '" + cipher.encode(this.std_sex) + "' , '" + cipher.encode(this.std_password) + "')";
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Signed up successfully.");
            String query1 = "SELECT MAX(student_id) AS student_id FROM student";
            ResultSet result = statement.executeQuery(query1);
            String id = "";
            if (result.next()) {
                id = result.getString(1);
            }
            JOptionPane.showMessageDialog(null, "Your Student ID is : " + id);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            con.close();
            statement.close();
        }
    }

    public void removestudent() throws SQLException {
        Cipher cipher = new Cipher();
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        try {
            String query = "DELETE FROM student WHERE student_id='" + cipher.encode(this.std_id) + "'";
            statement.executeUpdate(query);
            con.close();
            statement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went Wrong!!!");
        } finally {
            con.close();
            statement.close();
        }
    }

    public void updatestudent() throws SQLException {
        Cipher cipher = new Cipher();
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        try {
            String query = "UPDATE student SET student_lname='" + cipher.encode(this.std_lname) + "', student_phone='" + cipher.encode(this.std_number) + "', student_email='" + cipher.encode(this.std_email) + "', student_address='" + cipher.encode(this.std_address) + "', student_sex='" + cipher.encode(this.std_sex) + "', student_password='" + cipher.encode(this.std_password) + "',student_fname='" + cipher.encode(this.std_fname) + "' WHERE student_id='" + cipher.encode(this.std_id) + "' ";
            statement.executeUpdate(query);
            con.close();
            statement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            con.close();
            statement.close();
        }
    }

    public String countstudents() throws SQLException {
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        String a = "";
        try {
            String query = "SELECT COUNT(*) FROM student ";

            ResultSet result = statement.executeQuery(query);
            result.next();
            int count = result.getInt(1);
            a = Integer.toString(count);
            result.close();
            con.close();
            statement.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            con.close();
            statement.close();
        }
        return a;
    }
}
