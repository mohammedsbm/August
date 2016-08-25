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
    String url = "jdbc:mysql://localhost:3306/augustDpp?UseSSL=false"; //static connection to database on machine

    public employeeDb() throws Exception {
        //Load driver
        Class.forName("com.mysql.jdbc.Driver");
        //connect to augustDpp
        con = DriverManager.getConnection(url, userName, password);
    }

    public List<String> queryAll() throws Exception {
        statement = con.createStatement();
        rs = statement.executeQuery("SELECT * from employee");
        int columnCount = metaData.getColumnCount(); //count how many columns in each row

        while (rs.next()) { //while it stil has a new row
            for (int i = 1; i <= columnCount; i++) {
                data.add(rs.getString(i));
            }
            TaskProcessing.printALL(data);
        }
    }
}