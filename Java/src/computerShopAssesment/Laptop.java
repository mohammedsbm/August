package computerShopAssesment;

/**
 * Created by student on 8/26/2016.
 */
public class Laptop extends Computer {

    private String size;
    private Double weight;
    private String batteryLife;

    //properties

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(String batteryLife) {
        this.batteryLife = batteryLife;
    }

    //constructors

    Laptop() {}

    public Laptop(String size, Double weight, String batteryLife) {
        this.size = size;
        this.weight = weight;
        this.batteryLife = batteryLife;
    }

    public Laptop(CpuType cpuType, int ramSize, int hardDrive, String graphicsCard, ComputerType pcType, String size, Double weight, String batteryLife) {
        super(cpuType, ramSize, hardDrive, graphicsCard, pcType);
        this.size = size;
        this.weight = weight;
        this.batteryLife = batteryLife;
    }
}
