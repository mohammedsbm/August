package computerShopAssesment;

import java.util.DoubleSummaryStatistics;
import java.util.List;

import static computerShopAssesment.GeneratedComputer.desktop;
import static computerShopAssesment.GeneratedComputer.laptop;
import static computerShopAssesment.GeneratedCustomer.custList;

/**
 * Created by student on 8/26/2016.
 */
public class TaskProcessing {

    //create desktop
    static void createDesktop(List<String> data) {

        Desktop dt = new Desktop(
                checkCpuType(data.get(0)),
                Integer.parseInt(data.get(1)),
                Integer.parseInt(data.get(2)),
                data.get(3),
                checkPcType(data.get(4)),
                data.get(5));

        desktop.add(dt);
    }

    static void createLaptop(List<String> data) {

        Laptop lt = new Laptop(
                checkCpuType(data.get(0)),
                Integer.parseInt(data.get(1)),
                Integer.parseInt(data.get(2)),
                data.get(3),
                checkPcType(data.get(4)),
                data.get(5),
                Double.parseDouble(data.get(6)),
                data.get(7));
        laptop.add(lt);
    }

    static void createCustomer(List<String> data) {

        Customer cust = new Customer(data.get(0),
                data.get(1),
                checkPcType(data.get(2)));

        custList.add(cust);
    }

    static ComputerType checkPcType(String data) {

        if(data.contains("Laptop"))
            return ComputerType.LAPTOP;
        else
            return ComputerType.DESKTOP;
    }

    static CpuType checkCpuType(String data) {

        if(data.contains("Quadcore"))
            return CpuType.QUADCORE;
        else
            return CpuType.DUALCORE;
    }

}
