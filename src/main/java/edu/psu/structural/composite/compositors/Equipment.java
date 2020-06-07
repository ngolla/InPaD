package edu.psu.structural.composite.compositors;

import java.util.Iterator;

public abstract class Equipment {
    private static final Iterator<Equipment> NULL_ITERATOR = null;
    public String name;
    public Equipment(){

    }
    public Equipment(String name){
        this.name=name;
    }

    public String getName() {
        return name;
    }
    public abstract int price();
    public abstract void add(Equipment equipment);
    public abstract void remove(Equipment equipment);
    public Iterator<Equipment> iterator(){
        return NULL_ITERATOR;
    }

}
