package dayTwo;

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

import static dayTwo.generatedPeople.people;

/**
 * Created by student on 8/24/2016.
 */
public class MainWindow implements ActionListener { //implements - want to add functionality

    //declare labels
    private JLabel lblFirstName;
    private JLabel lblLastName;
    private JLabel lblWeight;
    private JLabel lblHeight;
    private JLabel lblBirthDate;
    private JLabel lblSex;
    private JLabel lblPosition;
    private JLabel lblHireDate;
    //declare text fields
    private JTextField txtFirstName;
    private JTextField txtLastName;
    private JTextField txtWeight;
    private JTextField txtHeight;
    private JTextField txtBirthDate;
    private JTextField txtSex;
    private JTextField txtPosition;
    private JTextField txtHireDate;
    //declare buttons
    private JButton btnUpdate;
    private JButton btnRemove;
    //declare menu
    private JMenuBar menuBar;
    //declare menu items
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenuItem newMenuItem, exitMenuItem, indexMenuItem;
    //declare panels
    private JPanel content;
    private JPanel listPanel;
    private JPanel fieldPanel;
    private JPanel inputPanel;
    private JPanel btnPanel;
    //declare list
    private JList employeeList;

    private int employeeIndex = -1;
    private boolean createNew;

    //constructor
    public MainWindow() {
        JFrame mainFrame = new JFrame("Employee Database"); //create frame
        mainFrame.setSize(800, 400); //set size of frame fit in the middle
        mainFrame.setResizable(false); //non resizeable
        mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        //create popup window are you sure
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(mainFrame, //give user option to terminate
                        "Are you sure? Exit?", "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, null, null);
                if(confirm == 0) { //if response yes terminate program
                    mainFrame.dispose();
                    System.exit(0);
                }
            }
        };

        //center the frame
        //setLocationRelativeTo(null); //easy way to center frame but effects pixels
        //get dimension of screen
        Dimension di = mainFrame.getToolkit().getScreenSize();
        //get window to be in the middle of the screen
        mainFrame.setLocation(di.width/2 - mainFrame.getWidth()/2, di.height/2 - mainFrame.getHeight()/2); //get height/width of screen and divide by height/width of window

        mainFrame.addWindowListener(l); //listening for the option to exit the frame

        mainFrame.setJMenuBar(createMenu()); //set the menu bar

        content = (JPanel) mainFrame.getContentPane(); //add this panel into the frame
        content.setLayout(new GridLayout(1, 2, 5, 5)); //put two panels inside main panel

        prepareJList();

        listPanel = new JPanel(); //create panel
        listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        JScrollPane scrollPane = new JScrollPane(createEmployeeList()); //add scroll pane
        scrollPane.setPreferredSize(new Dimension(380, 335)); //set size
        listPanel.add(scrollPane); //add scroll pane to list panel
        listPanel.setVisible(false); //set list panel to non visible
        content.add(listPanel); //add list panel to content

        fieldPanel = new JPanel(); //create panel
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Employees Details");
        fieldPanel.setBorder(title);
        fieldPanel.add(createFieldsPanel(), BorderLayout.CENTER); //once field panel is created move to center
        fieldPanel.add(createButtonPanel(), BorderLayout.SOUTH); //once button panel is created move to bottom
        fieldPanel.setVisible(false); //make field panel non visible
        content.add(fieldPanel); //add field panel to content

        mainFrame.setVisible(true);
    }
    //create menu bar
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
    }

    private void prepareJList() { //display selected list item on the text fields
        employeeList = new JList();
        employeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //when each line has been selected we want it to look like the whole thing is highlighted
        employeeList.addListSelectionListener(new ListSelectionListener() { //listener to listen to list item selection
            @Override
            public void valueChanged(ListSelectionEvent e) {
                employeeIndex = employeeList.getSelectedIndex(); //retrieve selected index and display in text fields
                if(people.size() > 0 && employeeIndex != -1)
                    loadEmployeeFields(employeeIndex); //if record found load employee details
                else
                    clearTxtFields(); //if no record found make sure text fields are empty
            }
        });
    }

    private JList createEmployeeList() { //dinamically generate new list collection and display on screen
        DefaultListModel listModel = new DefaultListModel();
        if(people.size() > 0) { //check weather record found
            for (Employee e : people) //if found add to collection
                listModel.addElement(e); //add to display
        }
        employeeList.setModel(listModel);

        return employeeList;
    }

    private JPanel createFieldsPanel() {
        inputPanel = new JPanel();
        //create grid panels
        inputPanel.setLayout(new GridLayout(0, 2, 5, 5)); //column for label and field

        lblFirstName = new JLabel("First Name: "); //add label to left column
        inputPanel.add(lblFirstName);
        txtFirstName = new JTextField(); //add text field to right column
        inputPanel.add(txtFirstName);

        lblLastName = new JLabel("Last Name: "); //add label to left column
        inputPanel.add(lblLastName);
        txtLastName = new JTextField(); //add text field to right column
        inputPanel.add(txtLastName);

        lblHeight = new JLabel("Height: "); //add label to left column
        inputPanel.add(lblHeight);
        txtHeight = new JTextField(); //add text field to right column
        inputPanel.add(txtHeight);

        lblWeight = new JLabel("Weight: "); //add label to left column
        inputPanel.add(lblWeight);
        txtWeight = new JTextField(); //add text field to right column
        inputPanel.add(txtWeight);

        lblBirthDate = new JLabel("DOB (YYYY-MM-DD): "); //add label to left column
        inputPanel.add(lblBirthDate);
        txtBirthDate = new JTextField(); //add text field to right column
        inputPanel.add(txtBirthDate);

        lblSex = new JLabel("Gender (M/F): "); //add label to left column
        inputPanel.add(lblSex);
        txtSex = new JTextField(); //add text field to right column
        inputPanel.add(txtSex);

        lblPosition = new JLabel("Position: "); //add label to left column
        inputPanel.add(lblPosition);
        txtPosition = new JTextField(); //add text field to right column
        inputPanel.add(txtPosition);

        lblHireDate = new JLabel("Hire Date (YYYY-MM-DD): "); //add label to left column
        inputPanel.add(lblHireDate);
        txtHireDate = new JTextField(); //add text field to right column
        inputPanel.add(txtHireDate);

       return inputPanel;
    }

    private JPanel createButtonPanel() {
        btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT)); //flow buttons to right

        btnUpdate = new JButton("Update"); //when button clicked run method to retrieve info
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(createNew && employeeList.isSelectionEmpty()) { //if new then create new employee
                    try {
                        TaskProcessing.newEmployee(getFieldsInfo()); //create new employee
                        createEmployeeList(); //update list
                        clearTxtFields(); //clear fields
                    } catch (SQLException createEx) {
                        JOptionPane.showMessageDialog(null, "ERROR ADDING EMPLOYEE" +
                        System.lineSeparator() + createEx);
                    }
                }else { //else if existing edit employee
                    TaskProcessing.editDetails(employeeIndex, getFieldsInfo());
                    createEmployeeList();
                    listPanel.setVisible(true);
                }
                createNew = false;
                employeeIndex = -1;
            }
        });
        btnPanel.add(btnUpdate);

        btnRemove = new JButton("Remove");
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (employeeIndex >= 0) {
                    TaskProcessing.removeEmployee(employeeIndex);
                    clearTxtFields();
                    createEmployeeList();
                    employeeIndex = -1;
                } else
                    JOptionPane.showMessageDialog(null, "No Employee Selected!");
            }

        });
        btnPanel.add(btnRemove);

        return btnPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand(); //get whatever action is found

        if("New".equals(action)) {
            clearTxtFields(); //clean fields
            if(employeeIndex < 0) //if there are no employees
                createNew = true; //create new objects
            listPanel.setVisible(true); //set list panel to visible
            fieldPanel.setVisible(true); //if new make inputfield visible
        } else if ("Exit".equals(action)) {
            System.exit(0); //exit system
        } else if ("Search".equals(action)) { //if search selected
            String fnSearch = JOptionPane.showInputDialog("Enter First Name: "); //retrieve first name from user
            employeeIndex = TaskProcessing.searchByFirstName(fnSearch); //match first name to index number in list
            if(employeeIndex != -1) { //if index is found
                loadEmployeeFields(employeeIndex); //load employee details
                //listPanel.setVisible(true);
                fieldPanel.setVisible(true);
            }
            else
                JOptionPane.showMessageDialog(null, "Cannot find it!"); //else display message cannot find it
        }
    }
    //clean all text fields
    private void clearTxtFields() {
        txtFirstName.setText("");
        txtLastName.setText("");
        txtHeight.setText("");
        txtWeight.setText("");
        txtBirthDate.setText("");
        txtSex.setText("");
        txtPosition.setText("");
        txtHireDate.setText("");
    }
    //load text fields with selected user details
    private void loadEmployeeFields(int index) {
        txtFirstName.setText(people.get(index).getFirstName());
        txtLastName.setText(people.get(index).getLastName());
        txtHeight.setText(Short.toString(people.get(index).getHeight()));
        txtWeight.setText(Double.toString(people.get(index).getWeight()));
        txtBirthDate.setText(people.get(index).getBirthDate().toString());
        txtSex.setText(people.get(index).getSex().toString());
        txtPosition.setText(people.get(index).getPosition());
        txtHireDate.setText(people.get(index).getHireDate().toString());
    }
    //retrieve details from field
    private List<String> getFieldsInfo() {
        List<String> data = new ArrayList<>();
        data.add(txtFirstName.getText());
        data.add(txtLastName.getText());
        data.add(txtHeight.getText());
        data.add(txtWeight.getText());
        data.add(txtBirthDate.getText());
        data.add(txtSex.getText());
        data.add(txtPosition.getText());
        data.add(txtHireDate.getText());

        return data;

    }

}
