package dayTwo;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

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
    //create buttons
    private JButton btnUpdate;
    private JButton btnRemove;
    //create menu
    private JMenuBar menuBar;
    //create menu items
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenuItem newMenuItem, exitMenuItem, indexMenuItem;

    private JPanel content;
    private JPanel listPanel;
    private JPanel fieldPanel;
    private JPanel inputPanel;
    private JPanel btnPanel;

    //create list
    private JList employeeList;

    //constructor
    public MainWindow() {
        JFrame mainFrame = new JFrame("Employee Database");
        mainFrame.setSize(800, 400);
        mainFrame.setResizable(false);
        mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        //create popup window are you sure
        WindowListener l = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int confirm = JOptionPane.showOptionDialog(mainFrame,
                        "Are you sure? Exit?", "Exit Confirmation",
                        JOptionPane.YES_NO_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null, null, null);
                if(confirm == 0) {
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

        mainFrame.addWindowListener(l);

        mainFrame.setJMenuBar(createMenu());

        content = (JPanel) mainFrame.getContentPane(); //add this panel into the frame
        content.setLayout(new GridLayout(1, 2, 5, 5));

        listPanel = new JPanel(); //create panel
        listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        JScrollPane scrollPane = new JScrollPane(createEmployeeList()); //add scroll pane
        scrollPane.setPreferredSize(new Dimension(380, 335)); //set size
        listPanel.add(scrollPane); //add scroll pane to list panel
        content.add(listPanel); //add list panel to content

        fieldPanel = new JPanel(); //create panel
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Employees Details");
        fieldPanel.setBorder(title);
        fieldPanel.add(createFieldsPanel(), BorderLayout.CENTER); //once field panel is created move to center
        fieldPanel.add(createButtonPanel(), BorderLayout.SOUTH); //once field panel is created move to center
        fieldPanel.setVisible(false); //make field panel non visible
        content.add(fieldPanel); //add field panel to content

        mainFrame.setVisible(true);
    }
    //create menu bar
    private JMenuBar createMenu() {
        menuBar = new JMenuBar();
        //create file menu
        fileMenu = new JMenu("File");
        fileMenu.setMnemonic(KeyEvent.VK_F);
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

    private JList createEmployeeList() {
        employeeList = new JList(people.toArray());
        employeeList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); //when each line has been selected we want it to look like the whole this is highlighted

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

        lblWeight = new JLabel("Weight: "); //add label to left column
        inputPanel.add(lblWeight);
        txtWeight = new JTextField(); //add text field to right column
        inputPanel.add(txtWeight);

        lblHeight = new JLabel("Height: "); //add label to left column
        inputPanel.add(lblHeight);
        txtHeight = new JTextField(); //add text field to right column
        inputPanel.add(txtHeight);

        lblBirthDate = new JLabel("DOB (YYYY/MM/DD): "); //add label to left column
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

        lblHireDate = new JLabel("Hire Date (YYYY/MM/DD): "); //add label to left column
        inputPanel.add(lblHireDate);
        txtHireDate = new JTextField(); //add text field to right column
        inputPanel.add(txtHireDate);

       return inputPanel;
    }

    private JPanel createButtonPanel() {
        btnPanel = new JPanel();
        btnPanel.setLayout(new FlowLayout(FlowLayout.RIGHT)); //flow buttons to right

        btnUpdate = new JButton("Update BOOM!");
        btnUpdate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnPanel.add(btnUpdate);

        btnRemove = new JButton("Remove NOT BOOM!");
        btnRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        btnPanel.add(btnRemove);

        return btnPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String action = e.getActionCommand(); //get whatever action is found

        if("New".equals(action)) {
            fieldPanel.setVisible(true); //if new make inputfield visible
        } else if ("Exit".equals(action)) {
            System.exit(0); //exit system
        }
    }

    //getters
    public JTextField getTxtFirstName() {
        return txtFirstName;
    }

    public JTextField getTxtLastName() {
        return txtLastName;
    }

    public JTextField getTxtWeight() {
        return txtWeight;
    }

    public JTextField getTxtHeight() {
        return txtHeight;
    }

    public JTextField getTxtBirthDate() {
        return txtBirthDate;
    }

    public JTextField getTxtSex() {
        return txtSex;
    }

    public JTextField getTxtPosition() {
        return txtPosition;
    }

    public JTextField getTxtHireDate() {
        return txtHireDate;
    }

    public JPanel getInputPanel()  { return inputPanel; }
}
