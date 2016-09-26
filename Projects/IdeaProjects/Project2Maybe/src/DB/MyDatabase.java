package DB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import CollectUsers.*;
import Processor.*;

/**
 * Created by Sabiha on 24/09/2016.
 */
public class MyDatabase {

    List<Users> users = new ArrayList<>();
    List<String> data = new ArrayList<>();
    static Connection con;
    static Statement statement = null;
    static ResultSet rs = null; //retrieve data and store here
    static ResultSetMetaData metaData; //identify how many rows and columns we have
    static int rowCount = 0; //count number of rows

    String userName = "root";
    String password = "Password100";
    String url = "jdbc:mysql://localhost:3306/posdb?UseSSL=false"; //static connection to database on machine

    public MyDatabase() throws Exception {
        //Load driver
        Class.forName("com.mysql.jdbc.Driver");
        //connect to augustDpp
        con = DriverManager.getConnection(url, userName, password);
    }

    public boolean checkUser(String username, String password) {
        try {

            PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");

            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean checkType(String username) {
        try {
            PreparedStatement ps = con.prepareStatement("SELECT * FROM users WHERE username=? AND usertype='admin'");

            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public void queryAllUsers() throws SQLException { //SQLException - handle errors
        statement = con.createStatement();
        rs = statement.executeQuery("SELECT * from users"); //retrieve every record from database into object rs
        metaData = rs.getMetaData(); //retrieve information about the information
        int columnCount = metaData.getColumnCount(); //count how many columns in each row

        while (rs.next()) { //while loop - checks rows and creates new record in each column of row
            for (int i = 2; i <= columnCount; i++) {
                data.add(rs.getString(i)); //add 7 strings per row
            }
            TaskProcessing.createUser(data);
            data.clear();
            rowCount++; //how many rows have been counted
        }
    }

    //add new employee to database
    public void addUser(List<String> data) throws SQLException {
        //create dynamic statement
        PreparedStatement statement = con.prepareStatement("INSERT INTO users(username, password, usertype) VALUES (?,?,?)");

        //add data to database
        statement.setString(1, data.get(0));
        statement.setString(2, data.get(1));
        statement.setString(3, data.get(2));

        //update database
        statement.executeUpdate();
        //close database
        statement.close();

    }
}
