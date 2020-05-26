package edu.psu.structural.composite.components;

import edu.psu.structural.composite.compositors.Equipment;

public class HardDisk extends Equipment {

    public HardDisk(String name) {
        this.name=name;
    }

    @Override
    public int price() {
        return 250;
    }

    @Override
    public void add(Equipment equipment) {
        System.out.println(equipment.getName()+ " Hard disk Added!!");
    }

    @Override
    public void remove(Equipment equipment) {
        System.out.println(equipment.getName()+ " Hard disk removed!!");
    }

}
