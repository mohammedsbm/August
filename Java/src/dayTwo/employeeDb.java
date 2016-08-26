package dayTwo;

/**
 * Created by student on 8/25/2016.
 */
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class employeeDb {
    List<Employee> employees = new ArrayList<>();
    List<String> data = new ArrayList<>();
    static Connection con;
    static Statement statement = null;
    static ResultSet rs = null; //retrieve data and store here
    static ResultSetMetaData metaData; //identify how many rows and columns we have
    static int rowCount = 0; //count number of rows

    String userName = "root";
    String password = "Password100";
    String url = "jdbc:mysql://localhost:3306/augustdpp?UseSSL=false"; //static connection to database on machine

    public employeeDb() throws Exception {
        //Load driver
        Class.forName("com.mysql.jdbc.Driver");
        //connect to augustDpp
        con = DriverManager.getConnection(url, userName, password);
    }
    //query database and return result to temporary collection
    public void queryAll() throws SQLException { //SQLException - handle errors
        statement = con.createStatement();
        rs = statement.executeQuery("SELECT * from employee"); //retrieve every record from database into object rs
        metaData = rs.getMetaData(); //retrieve information about the information
        int columnCount = metaData.getColumnCount(); //count how many columns in each row

        while (rs.next()) { //while loop - checks rows and creates new record in each column of row
            for (int i = 2; i <= columnCount; i++) {
                data.add(rs.getString(i)); //add 7 strings per row
            }
            TaskProcessing.createEmployee(data);
            data.clear();
            rowCount++; //how many rows have been counted
        }
    }
    //add new employee to database
    public void addEmployee(List<String> data) throws SQLException {
        //create dynamic statement
        PreparedStatement statement = con.prepareStatement("INSERT INTO employee(firstname," +
                                        "lastname,height,weight,birthdate,sextype,position," +
                                        "hiredate) VALUES (?,?,?,?,?,?,?,?)");

        //add data to database
        statement.setString(1, data.get(0));
        statement.setString(2, data.get(1));
        statement.setInt(3, Integer.parseInt(data.get(2)));
        statement.setDouble(4, Double.parseDouble(data.get(3)));
        statement.setDate(5, Date.valueOf(data.get(4)));
        statement.setString(6, data.get(5));
        statement.setString(7, data.get(6));
        statement.setDate(8, Date.valueOf(data.get(7)));

        //update database
        statement.executeUpdate();
        //close database
        statement.close();

    }
}