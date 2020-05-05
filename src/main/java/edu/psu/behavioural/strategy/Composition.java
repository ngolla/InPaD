package edu.psu.behavioural.strategy;

public class Composition {
    Compositor compositor;
    String type;
    public Composition(String type){
        this.type=type;
    }
    public void setCompositor(Compositor behavior){
        this.compositor=behavior;
    }
    public void action(){
        System.out.println("Composition: "+this.type +" "+compositor.compose());
    }
}
