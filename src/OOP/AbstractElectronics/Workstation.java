package OOP.AbstractElectronics;

public class Workstation extends ElectronicDevice {

    public Workstation(int voltage, int powerConsumption) {
        super(voltage, powerConsumption);
    }

    @Override
    public void getData() {
        System.out.println(voltage);
        System.out.println(powerConsumption);
    }

}
