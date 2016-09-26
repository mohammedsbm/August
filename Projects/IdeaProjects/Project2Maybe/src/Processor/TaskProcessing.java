package Processor;

import DB.MyDatabase;
import UI.AdminWindow;

import javax.swing.*;
import java.sql.SQLException;
import java.util.List;
import UI.*;
import CollectUsers.*;

import static CollectUsers.GeneratedUsers.staff;

/**
 * Created by Sabiha on 24/09/2016.
 */


public class TaskProcessing {

    static MyDatabase db;

    public static void prepareDb() throws Exception {
        db = new MyDatabase();
        db.queryAllUsers();
    }

    static UserType checkType(String data) {

        if(data.contains("admin"))
            return UserType.Admin; //if Admin return Admin
        else
            return UserType.Staff; //else return Female

    }

    //when update occurs reload
    public static void loadData() throws SQLException {
        staff.clear(); //clear collection
        db.queryAllUsers(); //retrieve new collection
    }

    //add new employee to database and refresh screen
    public static void newUser(List<String> data) throws SQLException {
        db.addUser(data); //send info to database
        loadData(); //refresh database
    }

    public static int searchByFirstName(String userName) {

        for (Users u : staff) {
            if(u.getUserName().contains(userName)) //search records based on firstname
                return staff.indexOf(u); //if record exists return index of person
        }
        return -1; //if record index not found
    }

    public static void loginStatus(JTextField username, JPasswordField password) {

        if(username.getText().length()==0)  // Checking for empty field
            JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
        else if(password.getPassword().length==0)  // Checking for empty field
            JOptionPane.showMessageDialog(null, "Empty fields detected ! Please fill up all fields");
        else{
            String user = username.getText();   // Collecting the input
            char[] pass = password.getPassword(); // Collecting the input
            String pwd = String.copyValueOf(pass);  // converting from array to string

            if(db.checkUser(user, pwd)) {
                if(db.checkType(user)) {
                    JOptionPane.showMessageDialog(null, "You Have Successfully Logged In" + " " + user);
                    AdminWindow adminFrame = new AdminWindow();
                } else {
                    JOptionPane.showMessageDialog(null, "You are not an admin");
                    MainWindow mainFrame = new MainWindow();
                }

            }
            else {
                JOptionPane.showMessageDialog(null, "Incorrect Login Credentials");
            }
        }
    }

    public static void createUser(List<String> data) {

        Users temp = new Users(data.get(0), data.get(1), checkType(data.get(2)));

        staff.add(temp); //add new user object into collection

        /*String[] dob = data.get(4).split("-"); //split dob string using hyphen
        String[] hireDate = data.get(7).split("-"); //split hiredate string using hyphen

        Employee temp = new Employee(
                data.get(0),
                data.get(1),
                Short.parseShort(data.get(2)),
                Double.parseDouble(data.get(3)),
                LocalDate.of(Integer.parseInt(dob[0]), Integer.parseInt(dob[1]),
                        Integer.parseInt(dob[2])),
                checkSex(data.get(5)),
                data.get(6),
                LocalDate.of(Integer.parseInt(hireDate[0]), Integer.parseInt(hireDate[1]),
                        Integer.parseInt(hireDate[2])));

        people.add(temp); //add new employee object into people collection*/
    }

    public static void editDetails(int index, List<String> data) { //search index number to edit in a collection list

        staff.get(index).setUserName(data.get(0));
        staff.get(index).setPassWord(data.get(1));
        staff.get(index).setUserType(checkType(data.get(2)));
    }

    //Method to retrieve index of an object and remove it
    public static void removeUser(int index) {

        staff.remove(index);
    }
}
