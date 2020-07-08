package edu.psu.behavioural.strategy;

import edu.psu.behavioural.strategy.composition.Composition;
import edu.psu.behavioural.strategy.compositor.ArrayCompositor;
import edu.psu.behavioural.strategy.compositor.SimpleCompositor;
import edu.psu.behavioural.strategy.compositor.TeXCompositor;

public class Demo {
    public static void main(String[] args) {
        Composition composition=new Composition("compose");
        composition.setCompositor(new SimpleCompositor());
        composition.action();
        Composition aComposition=new Composition("repair");
        aComposition.setCompositor(new ArrayCompositor());
        aComposition.action();
        System.out.println("After :");
        aComposition.setCompositor(new TeXCompositor());
        aComposition.action();
    }
}
