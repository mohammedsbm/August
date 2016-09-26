package UI;

import CollectUsers.Users;
import Processor.TaskProcessing;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;
import java.util.ArrayList;

import static CollectUsers.GeneratedUsers.staff;

/**
 * Created by student on 9/26/2016.
 */
public class RemoveUserWindow implements ActionListener {

    private JLabel lblUserName;
    private JLabel lblPassWord;
    private JLabel lblUserType;

    private JTextField txtUserName;
    private JTextField txtPassWord;
    private JTextField txtUserType;

    private JButton btnRemove;
    //private JButton btnRemoveUser;
    //private JButton btnPos;

    private JMenuBar menuBar;
    //declare menu items
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenuItem newMenuItem, exitMenuItem, indexMenuItem;

    private JPanel content;
    private JPanel listPanel;
    private JPanel inputPanel;
    //private JPanel buttonPanel;
    private JPanel fieldPanel;
    private JPanel btnPanel;

    private JList userList;

    private int userIndex = -1;
    private boolean createNew;

    public RemoveUserWindow() {

        JFrame removeUserFrame = new JFrame("Remove User"); //create frame
        removeUserFrame.setSize(800, 400); //set size of frame fit in the middle
        removeUserFrame.setResizable(false); //non resizeable
        removeUserFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        //create popup window are you sure
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(removeUserFrame, //give user option to terminate
                        "Are you sure? Exit?", "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, null, null);
                if(confirm == 0) { //if response yes terminate program
                    removeUserFrame.dispose();
                    System.exit(0);
                }
            }
        };


        //center the frame
        //setLocationRelativeTo(null); //easy way to center frame but effects pixels
        //get dimension of screen
        Dimension di = removeUserFrame.getToolkit().getScreenSize();
        //get window to be in the middle of the screen
        removeUserFrame.setLocation(di.width/2 - removeUserFrame.getWidth()/2, di.height/2 - removeUserFrame.getHeight()/2); //get height/width of screen and divide by height/width of window

        removeUserFrame.addWindowListener(l); //listening for the option to exit the frame

        //removeUserFrame.setJMenuBar(createMenu()); //set the menu bar

        content = (JPanel) removeUserFrame.getContentPane(); //add this panel into the frame
        content.setLayout(new GridLayout(1, 2, 5, 5)); //put two panels inside main panel

        prepareJList();

        listPanel = new JPanel(); //create panel
        listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        JScrollPane scrollPane = new JScrollPane(createUserList()); //add scroll pane
        scrollPane.setPreferredSize(new Dimension(380, 335)); //set size
        listPanel.add(scrollPane); //add scroll pane to list panel
        listPanel.setVisible(true); //set list panel to non visible
        content.add(listPanel); //add list panel to content

        fieldPanel = new JPanel(); //create panel
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Select An Option");
        fieldPanel.setBorder(title);
        fieldPanel.add(createFieldsPanel(), BorderLayout.CENTER); //once field panel is created move to center
        fieldPanel.add(createButtonPanel(), BorderLayout.SOUTH); //once button panel is created move to bottom
        fieldPanel.setVisible(true); //make field panel non visible
        content.add(fieldPanel); //add field panel to content

        removeUserFrame.setVisible(true);
    }

   /* //create menu bar
    private JMenuBar createMenu() { //declare menu and add items
        menuBar = new JMenuBar();
        //create file menu
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F); //listener to invoke controller for user (shortcut alt+f4)
        //create menu items
        newMenuItem = new JMenuItem ("New");
        newMenuItem.setMnemonic(KeyEvent.VK_N);
        newMenuItem.addActionListener(this); //please listen to event and add listener to file menu

        fileMenu.add(newMenuItem); //add menu item to file menu

        exitMenuItem = new JMenuItem ("Exit");
        exitMenuItem.setMnemonic(KeyEvent.VK_E);
        exitMenuItem.addActionListener(this);

        fileMenu.add(exitMenuItem); //add menu item to file menu

        menuBar.add(fileMenu); //add file menu to menu bar

        //create edit menu
        editMenu = new JMenu("Edit");
        editMenu.setMnemonic(KeyEvent.VK_D);
        //create menu items
        indexMenuItem = new JMenuItem ("Search");
        indexMenuItem.setMnemonic(KeyEvent.VK_S);
        indexMenuItem.addActionListener(this); //please listen to event and add listener to file menu

        editMenu.add(indexMenuItem); //add menu item to file menu

        menuBar.add(editMenu); //add edit menu to menu bar

        return menuBar; //display menu bar
    }*/

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

    private JList createUserList() { //dinamically generate new list collection and display on screen
        DefaultListModel listModel = new DefaultListModel();
        if(staff.size() > 0) { //check weather record found
            for (Users e : staff) //if found add to collection
                listModel.addElement(e); //add to display
        }
        userList.setModel(listModel);

        return userList;
    }

    private JPanel createFieldsPanel() {
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

        lblUserType = new JLabel("User Type (admin/staff): "); //add label to left column
        inputPanel.add(lblUserType);
        txtUserType = new JTextField(); //add text field to right column
        inputPanel.add(txtUserType);

        return inputPanel;
    }

    private JPanel createButtonPanel() {
        btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.CENTER)); //flow buttons to right

       /* btnUpdate = new JButton("Update"); //when button clicked run method to retrieve info
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(createNew && userList.isSelectionEmpty()) { //if new then create new employee
                    try {
                        TaskProcessing.newUser(getFieldsInfo()); //create new employee
                        createUserList(); //update list
                        clearTxtFields(); //clear fields
                    } catch (SQLException createEx) {
                        JOptionPane.showMessageDialog(null, "ERROR ADDING USER" +
                                System.lineSeparator() + createEx);
                    }
                }else { //else if existing edit employee
                    TaskProcessing.editDetails(userIndex, getFieldsInfo());
                    createUserList();
                    listPanel.setVisible(true);
                }
                createNew = false;
                userIndex = -1;
            }
        });
        btnPanel.add(btnUpdate);*/

        btnRemove = new JButton("Remove");
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (userIndex >= 0) {
                    TaskProcessing.removeUser(userIndex);
                    clearTxtFields();
                    createUserList();
                    userIndex = -1;
                } else
                    JOptionPane.showMessageDialog(null, "No Employee Selected!");
            }

        });
        btnPanel.add(btnRemove);

        return btnPanel;
    }

    /*@Override
    public void actionPerformed(ActionEvent e) {

        String action = e.getActionCommand(); //get whatever action is found

        if("New".equals(action)) {
            clearTxtFields(); //clean fields
            if(userIndex < 0) //if there are no employees
                createNew = true; //create new objects
            listPanel.setVisible(true); //set list panel to visible
            fieldPanel.setVisible(true); //if new make inputfield visible
        } else if ("Exit".equals(action)) {
            System.exit(0); //exit system
        } else if ("Search".equals(action)) { //if search selected
            String fnSearch = JOptionPane.showInputDialog("Enter username: "); //retrieve first name from user
            userIndex = TaskProcessing.searchByFirstName(fnSearch); //match first name to index number in list
            if(userIndex != -1) { //if index is found
                loadUsersFields(userIndex); //load employee details
                //listPanel.setVisible(true);
                fieldPanel.setVisible(true);
            }
            else
                JOptionPane.showMessageDialog(null, "Cannot find it!"); //else display message cannot find it
        }

    }*/

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
    private java.util.List<String> getFieldsInfo() {
        java.util.List<String> data = new ArrayList<>();
        data.add(txtUserName.getText());
        data.add(txtPassWord.getText());
        data.add(txtUserType.getText());

        return data;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
