package Processor;

import Processor.TaskProcessing;
import UI.WelcomeWindow;

/**
 * Created by Sabiha on 22/09/2016.
 */
public class MainProgramme {


    public static void main(String[] args) throws Exception {

        TaskProcessing.prepareDb();
        new WelcomeWindow();

    }
}
