package edu.psu.structural.composite;

import edu.psu.structural.composite.components.*;

public class Demo {
    public static void main(String[] args) {
        Chassis chassis=new Chassis();
        MainBoard mainBoard=new MainBoard("HyperMulticore");
        Bus bus=new Bus("PCIeBus");
        chassis.add(mainBoard);
        mainBoard.add(bus);
        chassis.add(new HardDisk("Personal 1TB drive"));
        bus.add(new Card("Graphic card"));
        bus.add(new HardDisk("Smart disk - 200GB"));
        System.out.println("Total Price: "+chassis.price());
    }
}
