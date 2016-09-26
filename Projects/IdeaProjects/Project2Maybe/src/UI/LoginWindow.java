package UI;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import Processor.*;

/**
 * Created by Sabiha on 22/09/2016.
 */
public class LoginWindow {

    private JPanel contentPane;
    private JButton btnEnter;
    private JLabel lblWelcome;
    private JLabel lblUsername;
    private JLabel lblPassword;
    private JTextField txtUsername;
    private JPasswordField txtPassword;

    //String userName = "admin";
    //String passWord = "password";
    //MyDatabase db;

    //constructor
    public LoginWindow() {
        //db = new MyDatabase();

        JFrame loginFrame = new JFrame("Login");
        loginFrame.setTitle("Login Window"); //setTitle - method from JFrame
        loginFrame.setSize(300, 200); //set width and height of window
        loginFrame.setResizable(false); //set window to be non resizable

        //center the frame
        //setLocationRelativeTo(null); //easy way to center frame but effects pixels
        //get dimension of screen
        Dimension di = loginFrame.getToolkit().getScreenSize();
        //get window to be in the middle of the screen
        loginFrame.setLocation(di.width/2 - loginFrame.getWidth()/2, di.height/2 - loginFrame.getHeight()/2); //get height/width of screen and divide by height/width of window

        //terminate window and clean anything thats not needed
        loginFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //design welcome window
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        loginFrame.setContentPane(contentPane);
        contentPane.setLayout(null); //set no layout

        //create text box
        txtUsername = new JTextField("Username");
        //set location of text box
        txtUsername.setBounds(135, 25, 100, 25);
        //add text box to panel(window frame)
        contentPane.add(txtUsername);

        //create password box
        txtPassword = new JPasswordField("Password");
        //set location of password box
        txtPassword.setBounds(135, 55, 100, 25);
        //add password box to panel(window frame)
        contentPane.add(txtPassword);

        //create label for text box
        lblUsername = new JLabel("Username: ");
        //set location of password box
        lblUsername.setBounds(55, 25, 100, 25);
        //add password box to panel(window frame)
        contentPane.add(lblUsername);

        //create label for password box
        lblPassword = new JLabel("Password: ");
        //set location of password box
        lblPassword.setBounds(55, 55, 100, 25);
        //add password box to panel(window frame)
        contentPane.add(lblPassword);

        //create button
        btnEnter = new JButton("Login");
        //button controller(listener object)
        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //please run frame 2
                //check logged in user and load mainframe
                //MainWindow mainFrame = new MainWindow();
                TaskProcessing.loginStatus(txtUsername, txtPassword);
            }
        });
        //set location of button
        btnEnter.setBounds(115, 90, 70, 25);
        //add button to panel(window frame)
        contentPane.add(btnEnter);

      /*  //create label
        lblWelcome = new JLabel("Welcome To Employee Programme!");
        lblWelcome.setForeground(Color.BLUE); //set label colour
        lblWelcome.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20)); //set font type, size
        lblWelcome.setBounds(220, 80, 400, 100); //set position of label
        contentPane.add(lblWelcome); //add label to window*/

        //see button
        loginFrame.setVisible(true);
    }

}
