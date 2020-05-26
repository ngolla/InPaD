package edu.psu.structural.composite.components;

import edu.psu.structural.composite.compositors.Equipment;

public class Card extends Equipment {
    public Card(String name) {
        this.name=name;
    }

    @Override
    public int price() {
        return 100;
    }

    @Override
    public void add(Equipment equipment) {
        System.out.println(equipment.getName()+ " Card Added!!");
    }

    @Override
    public void remove(Equipment equipment) {
        System.out.println(equipment.getName()+ ": Card removed");
    }
}
