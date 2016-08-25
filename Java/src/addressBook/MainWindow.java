package addressBook;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by student on 8/25/2016.
 */
public class MainWindow implements ActionListener {

    //declare labels
    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblBirthDate;
    private JLabel lblDoorNumber;
    private JLabel lblAddress;
    private JLabel lblTown;
    private JLabel lblPostCode;
    private JLabel lblTelephone;
    private JLabel lblEmail;

    //declare text fields
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtBirthDate;
    private JTextField txtDoorNumber;
    private JTextField txtAddress;
    private JTextField txtTown;
    private JTextField txtPostCode;
    private JTextField txtTelephone;
    private JTextField txtEmail;

    //declare buttons
    private JButton btnUpdate;
    private JButton btnRemove;

    //declare menu bar
    private JMenuBar menuBar;

    //declare menu items
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenuItem newMenuItem;
    private JMenuItem exitMenuItem;
    private JMenuItem searchMenuItem;

    //declare panels
    private JPanel content;
    private JPanel listPanel;
    private JPanel fieldPanel;
    private JPanel inputPanel;
    private JPanel btnPanel;

    //declare list
    private JList contactList;

    private int contactIndex = -1;
    private boolean createNew;

    public MainWindow() {

        JFrame mainFrame = new JFrame("Address Book");
        mainFrame.setSize(800, 400);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        //create popup window confirming window close
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(mainFrame,
                        "Are You Sure?", "Exit?",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, null, null);
                if(confirm == 0) {
                    mainFrame.dispose();
                    System.exit(0);
                }
            }
        };


    }
}
