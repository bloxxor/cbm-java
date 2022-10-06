package OOP.AbstractElectronics;

public abstract class ElectronicDevice {

    public int voltage;
    public int powerConsumption;

    public ElectronicDevice(int voltage, int powerConsumption) {
        this.voltage = voltage;
        this.powerConsumption = powerConsumption;
    }

    public abstract void getData();

}
