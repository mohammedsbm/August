package UI;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Processor.*;
import CollectUsers.*;

import static CollectUsers.GeneratedUsers.staff;

/**
 * Created by student on 9/26/2016.
 */
public class AdminWindow implements ActionListener {

    private JLabel lblUserName;
    private JLabel lblPassWord;
    private JLabel lblUserType;

    private JTextField txtUserName;
    private JTextField txtPassWord;
    private JTextField txtUserType;

    private JButton btnAddUser;
    private JButton btnRemoveUser;
    private JButton btnPos;

    private JPanel content;
    private JPanel listPanel;
    private JPanel inputPanel;
    private JPanel buttonPanel;
    private JPanel fieldPanel;
    private JPanel btnPanel;

    private JList userList;

    private int userIndex = -1;
    private boolean createNew;

    //constructor
    public AdminWindow() {
        JFrame adminFrame = new JFrame("Admin Management"); //create frame
        adminFrame.setSize(800, 400); //set size of frame fit in the middle
        adminFrame.setResizable(false); //non resizeable
        adminFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        //create popup window are you sure
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(adminFrame, //give user option to terminate
                        "Are you sure? Exit?", "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, null, null);
                if(confirm == 0) { //if response yes terminate program
                    adminFrame.dispose();
                    System.exit(0);
                }
            }
        };


        //center the frame
        //setLocationRelativeTo(null); //easy way to center frame but effects pixels
        //get dimension of screen
        Dimension di = adminFrame.getToolkit().getScreenSize();
        //get window to be in the middle of the screen
        adminFrame.setLocation(di.width/2 - adminFrame.getWidth()/2, di.height/2 - adminFrame.getHeight()/2); //get height/width of screen and divide by height/width of window

        adminFrame.addWindowListener(l); //listening for the option to exit the frame

        //mainFrame.setJMenuBar(createMenu()); //set the menu bar

        content = (JPanel) adminFrame.getContentPane(); //add this panel into the frame
        content.setLayout(new GridLayout(1, 2, 5, 5)); //put two panels inside main panel

        //prepareJList();

        /*listPanel = new JPanel(); //create panel
        listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        JScrollPane scrollPane = new JScrollPane(createUserList()); //add scroll pane
        scrollPane.setPreferredSize(new Dimension(380, 335)); //set size
        listPanel.add(scrollPane); //add scroll pane to list panel
        listPanel.setVisible(false); //set list panel to non visible
        content.add(listPanel); //add list panel to content*/

        buttonPanel = new JPanel(); //create panel
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Select An Option");
        buttonPanel.setBorder(title);
        //buttonPanel.add(createFieldsPanel(), BorderLayout.CENTER); //once field panel is created move to center
        buttonPanel.add(createButtonPanel(), BorderLayout.CENTER); //once button panel is created move to bottom
        buttonPanel.setVisible(true); //make field panel non visible
        content.add(buttonPanel); //add field panel to content

        adminFrame.setVisible(true);
    }

   /* private JPanel createFieldsPanel() {
        inputPanel = new JPanel();
        //create grid panels
        inputPanel.setLayout(new GridLayout(0, 2, 5, 5)); //column for label and field

        lblUserName = new JLabel("Username: "); //add label to left column
        inputPanel.add(lblUserName);
        txtUserName = new JTextField(); //add text field to right column
        inputPanel.add(txtUserName);

        lblPassWord = new JLabel("Password: "); //add label to left column
        inputPanel.add(lblPassWord);
        txtPassWord = new JTextField(); //add text field to right column
        inputPanel.add(txtPassWord);

        lblUserType = new JLabel("User Type (A/S): "); //add label to left column
        inputPanel.add(lblUserType);
        txtUserType = new JTextField(); //add text field to right column
        inputPanel.add(txtUserType);

        return inputPanel;
    }*/

    private JPanel createButtonPanel() {
        btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); //flow buttons to right

        btnAddUser = new JButton("Add/Edit User"); //when button clicked run method to retrieve info
        btnAddUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AddUserWindow addUserFrame = new AddUserWindow();
            }
        });
        btnPanel.add(btnAddUser);

        btnRemoveUser = new JButton("Remove User");
        btnRemoveUser.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RemoveUserWindow removeUserFrame = new RemoveUserWindow();
            }
        });
        btnPanel.add(btnRemoveUser);

        btnPos = new JButton("POS Menu");
        btnPos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainWindow mainFrame = new MainWindow();
            }
        });
        btnPanel.add(btnPos);

        return btnPanel;
    }

   /* private JList createUserList() { //dinamically generate new list collection and display on screen
        DefaultListModel listModel = new DefaultListModel();
        if(staff.size() > 0) { //check weather record found
            for (Users e : staff) //if found add to collection
                listModel.addElement(e); //add to display
        }
        userList.setModel(listModel);

        return userList;
    }

    private void prepareJList() { //display selected list item on the text fields
        userList = new JList();
        userList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //when each line has been selected we want it to look like the whole thing is highlighted
        userList.addListSelectionListener(new ListSelectionListener() { //listener to listen to list item selection
            @Override
            public void valueChanged(ListSelectionEvent e) {
                userIndex = userList.getSelectedIndex(); //retrieve selected index and display in text fields
                if(staff.size() > 0 && userIndex != -1)
                    loadUsersFields(userIndex); //if record found load employee details
                else
                    clearTxtFields(); //if no record found make sure text fields are empty
            }
        });
    }

    //clean all text fields
    private void clearTxtFields() {
        txtUserName.setText("");
        txtPassWord.setText("");
        txtUserType.setText("");

    }

    //load text fields with selected user details
    private void loadUsersFields(int index) {
        txtUserName.setText(staff.get(index).getUserName());
        txtPassWord.setText(staff.get(index).getPassWord());
        txtUserType.setText(staff.get(index).getUserType().toString());
    }

    //retrieve details from field
    private List<String> getFieldsInfo() {
        List<String> data = new ArrayList<>();
        data.add(txtUserName.getText());
        data.add(txtPassWord.getText());
        data.add(txtUserType.getText());

        return data;
    }*/

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
