package computerShopAssesment;

/**
 * Created by student on 8/26/2016.
 */
public class Desktop extends Computer {

    private String monitorSize;

    //properties
    public String getMonitorSize() {
        return monitorSize;
    }

    public void setMonitorSize(String monitorSize) {
        this.monitorSize = monitorSize;
    }

    //constructors
    Desktop() {}

    public Desktop(String monitorSize) {
        this.monitorSize = monitorSize;
    }

    public Desktop(CpuType cpuType, int ramSize, int hardDrive, String graphicsCard, ComputerType pcType, String monitorSize) {
        super(cpuType, ramSize, hardDrive, graphicsCard, pcType);
        this.monitorSize = monitorSize;
    }
}
