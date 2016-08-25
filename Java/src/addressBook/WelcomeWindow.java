package addressBook;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by student on 8/25/2016.
 */
public class WelcomeWindow extends JFrame{

    private JPanel contentPane;
    private JButton btnEnter;
    private JLabel lblWelcome;

    //constructor

    public WelcomeWindow() {
        setTitle("Welcome Frame"); //setTitle - method from JFrame
        setSize(800, 400); //set width and height of window
        setResizable(false); //set window to be non resizable

        //center the frame
        //setLocationRelativeTo(null); //easy way to center frame but effects pixels
        //get dimension of screen
        Dimension di = getToolkit().getScreenSize();
        //get window to be in the middle of the screen
        setLocation(di.width/2 - getWidth()/2, di.height/2 - getHeight()/2); //get height/width of screen and divide by height/width of window

        //terminate window and clean anything thats not needed
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        //design welcome window
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null); //set no layout

        //create button
        btnEnter = new JButton("Enter");
        //button controller(listener object)
        btnEnter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) { //please run frame 2
                //load mainframe
                MainWindow mainFrame = new MainWindow();
            }
        });

        //set location of button
        btnEnter.setBounds(360, 200, 70, 25);
        //add button to panel(window frame)
        contentPane.add(btnEnter);

        //create label
        lblWelcome = new JLabel("Welcome To Employee Programme!");
        lblWelcome.setForeground(Color.BLUE); //set label colour
        lblWelcome.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 20)); //set font type, size
        lblWelcome.setBounds(220, 80, 400, 100); //set position of label
        contentPane.add(lblWelcome); //add label to window

        //see button
        setVisible(true);
    }
}
