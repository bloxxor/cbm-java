package Uebungen.ElecronicsVendor;

public class Launcher {

    public static void main(String[] args) {

        ElectronicDevices workstation = new ElectronicDevices("WorkStation XL Pro", "Computer", "NVidia CUDA 8000");

        ElectronicsVendor vobis = new ElectronicsVendor();

        vobis.devices[0] = workstation;

        int inventory = vobis.devices.length - 1;

        for (int i = 0; i < inventory; i++) {
            vobis.devices[i].displayDevices();
        }

    }

}
