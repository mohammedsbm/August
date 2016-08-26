package computerShopAssesment;

/**
 * Created by student on 8/26/2016.
 */
public abstract class Computer {

    private CpuType cpuType;
    private int ramSize;
    private int hardDrive;
    private String graphicsCard;
    private ComputerType pcType;

    //properties

    public CpuType getCpuType() {
        return cpuType;
    }

    public void setCpuType(CpuType cpuType) {
        this.cpuType = cpuType;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(int hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public ComputerType getPcType() {
        return pcType;
    }

    public void setPcType(ComputerType pcType) {
        this.pcType = pcType;
    }

    //constructors
    Computer(){}

    public Computer(CpuType cpuType, int ramSize, int hardDrive, String graphicsCard, ComputerType pcType) {
        this.cpuType = cpuType;
        this.ramSize = ramSize;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.pcType = pcType;
    }
}
