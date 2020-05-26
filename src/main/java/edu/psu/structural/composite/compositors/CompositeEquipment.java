package edu.psu.structural.composite.compositors;

import java.util.ArrayList;
import java.util.List;

public class CompositeEquipment extends Equipment {
    List<Equipment> equipments;
    public CompositeEquipment(){
        this.equipments=new ArrayList<>();
    }

    @Override
    public int price() {
        int total=0;
        for(Equipment eq:equipments){
            total+=eq.price();
        }
        return total;
    }

    @Override
    public void add(Equipment equipment) {
        equipments.add(equipment);
    }

    @Override
    public void remove(Equipment equipment) {
        equipments.remove(equipment);
    }

}
