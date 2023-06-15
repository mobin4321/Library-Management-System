package project;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import javax.swing.JOptionPane;

public class Book {

    private String book_id;
    private String book_title;
    private String book_author;
    private String book_genre;
    private int book_quantity;
    private int book_shelf;
    private int book_row;

    public Book(String book_title, String book_author, String book_genre, int book_quantity, int book_shelf, int book_row) {
        this.book_title = book_title;
        this.book_author = book_author;
        this.book_genre = book_genre;
        this.book_quantity = book_quantity;
        this.book_shelf = book_shelf;
        this.book_row = book_row;

    }

    public Book(String std_id) {
        this.book_id = std_id;
    }

    public void setbookid(String id) {
        this.book_id = id;
    }

    public Book() {
        this.book_id = "";
        this.book_title = "";
        this.book_author = "";
        this.book_genre = "";
        this.book_quantity = 0;
        this.book_shelf = 0;
        this.book_row = 0;

    }

    public void addbook() throws SQLException {
        Cipher cipher = new Cipher();
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        Statement statement1 = con.createStatement();
        try {

            String query2 = "SELECT * FROM books WHERE book_name='" + cipher.encode(book_title) + "' AND book_author='" + cipher.encode(book_author) + "'";
            ResultSet result1 = statement.executeQuery(query2);
            if (result1.next()) {
                int a = result1.getInt(5) + book_quantity;
                String query3 = "UPDATE books SET book_quantity=" + a + " WHERE book_id=" + result1.getInt(1) + "";
                statement1.executeUpdate(query3);
                JOptionPane.showMessageDialog(null, "This book already exists\nQuantity has been incremented.");
            } else {
                String query = "INSERT INTO books(book_name, book_author, book_genre, book_quantity, book_shelf,shelf_row )  VALUES('" + cipher.encode(this.book_title) + "' , '" + cipher.encode(this.book_author) + "' , '" + cipher.encode(this.book_genre) + "' , " + this.book_quantity + " , " + this.book_shelf + " , " + this.book_row + ")";
                statement.executeUpdate(query);
                String query1 = "SELECT MAX(book_id) AS book_id FROM books";
                ResultSet result = statement.executeQuery(query1);
                JOptionPane.showMessageDialog(null, "Book Added Successfully.");
                String id = "";
                if (result.next()) {
                    id = result.getString(1);
                }
                JOptionPane.showMessageDialog(null, "New Book ID is : " + id);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            con.close();
            statement.close();
            statement1.close();
        }
    }

    public void removebook() throws SQLException {
        Cipher cipher = new Cipher();
        String query = "DELETE FROM books WHERE book_id='" + cipher.encode(this.book_id) + "'";
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        try {
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Book Removed.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Something went Wrong!");
        } finally {
            statement.close();
            con.close();
        }
    }

    public void updatebook() throws SQLException {
        Cipher cipher = new Cipher();
        String query = "UPDATE books SET book_author='" + cipher.encode(this.book_author) + "', book_genre='" + cipher.encode(this.book_genre) + "', book_shelf='" + this.book_shelf + "', book_quantity='" + this.book_quantity + "', shelf_row='" + this.book_row + "',book_name='" + cipher.encode(this.book_title) + "' WHERE book_id='" + cipher.encode(this.book_id) + "' ";
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        try {
            statement.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Updated.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            con.close();
            statement.close();
        }
    }

    public String mostreadgenre() throws SQLException {
        String output = "";
        Cipher cipher = new Cipher();
        String query = "SELECT book_genre,COUNT(bookhistory.book_id) AS TotalRepetitions FROM bookhistory JOIN books ON books.book_id=bookhistory.book_id GROUP BY book_genre ORDER BY TotalRepetitions DESC LIMIT 1 ";
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        try {
            ResultSet result = statement.executeQuery(query);
            result.next();
            output = cipher.decode(result.getString(1));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            con.close();
            statement.close();
        }
        return output;
    }

    public String mostreadbook() throws SQLException {
        Cipher cipher = new Cipher();
        String query = "SELECT book_name,COUNT(bookhistory.book_id) AS TotalRepetitions FROM bookhistory JOIN books ON books.book_id=bookhistory.book_id GROUP BY book_name ORDER BY TotalRepetitions DESC LIMIT 1 ";
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        String output = "";
        try {
            ResultSet result = statement.executeQuery(query);
            if (result.next()) {
                output = cipher.decode(result.getString(1));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            con.close();
            statement.close();
        }
        return output;
    }

    public String countbooks() throws SQLException {
        String query = "SELECT SUM(book_quantity) FROM books ";
        Connection con = ConnectionProvider.getconnection();
        Statement statement = con.createStatement();
        String a = "";
        try {

            ResultSet result = statement.executeQuery(query);
            result.next();
            int count = result.getInt(1);
            a = Integer.toString(count);
            result.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        } finally {
            con.close();
            statement.close();
        }
        return a;
    }

}