import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Sabiha on 21/09/2016.
 */
public class MainWindow implements ActionListener{ //implements - want to add functionality

    //declare labels
   /* private JLabel lblFirstName;
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
    private JMenuItem newMenuItem, exitMenuItem, indexMenuItem;*/
    //declare panels
    private JPanel content;
    private JPanel listPanel;
    private JPanel fieldPanel;
   /* private JPanel inputPanel;
    private JPanel btnPanel;
    //declare list
    private JList employeeList;

    private int employeeIndex = -1;
    private boolean createNew;
*/
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
                if (confirm == 0) { //if response yes terminate program
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

        //mainFrame.setJMenuBar(createMenu()); //set the menu bar

        content = (JPanel) mainFrame.getContentPane(); //add this panel into the frame
        content.setLayout(new GridLayout(1, 2, 5, 5)); //put two panels inside main panel

        //prepareJList();

        listPanel = new JPanel(); //create panel
        listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        //JScrollPane scrollPane = new JScrollPane(createEmployeeList()); //add scroll pane
        //scrollPane.setPreferredSize(new Dimension(380, 335)); //set size
        //listPanel.add(scrollPane); //add scroll pane to list panel
        listPanel.setVisible(false); //set list panel to non visible
        content.add(listPanel); //add list panel to content

        fieldPanel = new JPanel(); //create panel
        TitledBorder title;
        title = BorderFactory.createTitledBorder("Employees Details");
        fieldPanel.setBorder(title);
        //fieldPanel.add(createFieldsPanel(), BorderLayout.CENTER); //once field panel is created move to center
        //fieldPanel.add(createButtonPanel(), BorderLayout.SOUTH); //once button panel is created move to bottom
        fieldPanel.setVisible(false); //make field panel non visible
        content.add(fieldPanel); //add field panel to content

        mainFrame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
     /*   String action = e.getActionCommand(); //get whatever action is found

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
        }*/
    }
    }