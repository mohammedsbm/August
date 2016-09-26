package UI;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Sabiha on 22/09/2016.
 */
public class MainWindow implements ActionListener{

    //constructor
    public MainWindow() {
        JFrame mainFrame = new JFrame("Staff POS"); //create frame
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

        //mainFrame.setJMenuBar(createMenu()); //set the menu bar

        //content = (JPanel) mainFrame.getContentPane(); //add this panel into the frame
        //content.setLayout(new GridLayout(1, 2, 5, 5)); //put two panels inside main panel

        //prepareJList();

        //listPanel = new JPanel(); //create panel
        //listPanel.setBorder(new EtchedBorder(EtchedBorder.LOWERED));
        //JScrollPane scrollPane = new JScrollPane(createEmployeeList()); //add scroll pane
        //scrollPane.setPreferredSize(new Dimension(380, 335)); //set size
        //listPanel.add(scrollPane); //add scroll pane to list panel
        //listPanel.setVisible(false); //set list panel to non visible
        //content.add(listPanel); //add list panel to content

        //fieldPanel = new JPanel(); //create panel
        //TitledBorder title;
        //title = BorderFactory.createTitledBorder("Employees Details");
        //fieldPanel.setBorder(title);
        //fieldPanel.add(createFieldsPanel(), BorderLayout.CENTER); //once field panel is created move to center
        //fieldPanel.add(createButtonPanel(), BorderLayout.SOUTH); //once button panel is created move to bottom
        //fieldPanel.setVisible(false); //make field panel non visible
        //content.add(fieldPanel); //add field panel to content

        mainFrame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
