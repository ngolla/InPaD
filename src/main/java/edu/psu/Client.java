package edu.psu;

import edu.psu.behavioural.observer.ConcreteSubject;
import edu.psu.behavioural.observer.Observer;
import edu.psu.behavioural.observer.ObserverImpl;
import edu.psu.behavioural.strategy.ArrayCompositor;
import edu.psu.behavioural.strategy.Composition;
import edu.psu.behavioural.strategy.SimpleCompositor;
import edu.psu.behavioural.strategy.TeXCompositor;
import edu.psu.creational.FactoryGenerator;
import edu.psu.creational.enums.FactoryType;
import edu.psu.creational.factory.AbstractWidgetFactory;
import edu.psu.creational.factory.enums.ProductType;
import edu.psu.creational.product.AbstractProduct;
import edu.psu.structural.adapter.TextAdapter;
import edu.psu.structural.adapter.TextView;
import edu.psu.structural.target.Shape;
import edu.psu.structural.target.ShapeType;

public class Client {

    public static void main(String[] args) {
        System.out.println("Creational design Pattern - Abstract factory and Prototype(Clone)");
        creationalDesignPattern();
        System.out.println("Structural Design Pattern - Adapter");
        StructuralDesignPattern();
        System.out.println("Behavioural Design pattern - Observer and Strategy");
        behaviouralDesignPattern();
    }

    private static void behaviouralDesignPattern() {
        strategyDesignPattern();
        observerDesignPattern();
    }

    private static void observerDesignPattern() {
        ConcreteSubject subject=new ConcreteSubject();
        Observer ob1=new ObserverImpl("observer1");
        Observer ob2=new ObserverImpl("observer2");
        subject.attach(ob1);
        subject.attach(ob2);
        ob1.subscribe(subject);
        ob2.subscribe(subject);
        ob1.update();
        ob2.update();
        subject.postMessage("New message to notify");
        subject.detach(ob2);
        subject.postMessage("Another message after detach");
    }

    private static void strategyDesignPattern() {
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

    private static void StructuralDesignPattern() {
        adapterDesignPattern();
    }

    private static void adapterDesignPattern() {
        Shape shape=new Shape();
        shape.setHeight(10);
        shape.setLeft(10);
        shape.setTop(10);
        shape.setWidth(10);
        ShapeType shapeType=new ShapeType();
        shapeType.setButtonBegining(2);
        shapeType.setButtonEnd(2);
        shapeType.setButtonHelp(2);
        shape.setShapeType(shapeType);
        //Adapter to Shape class to link with textshape
        TextView textView=new TextAdapter(shape);
        System.out.println(textView.getHeight());
        System.out.println(textView.getLeft());
        System.out.println(textView.getTop());
        System.out.println(textView.getWidth());
        System.out.println(textView.getShapeType());
    }

    private static void creationalDesignPattern() {
        //Creational - Abstract Factory
        AbstractProduct product = null;
        AbstractWidgetFactory widgetFactory = null;
        try {
            //Testing clonable default values - creating default motif window
            product = FactoryGenerator.getFactory(FactoryType.WINDOW).getProduct(ProductType.DEFAULTMOTIFWINDOW);
            System.out.println(" Default Motif Window");
            System.out.println(product.getProductDetails());
            System.out.println(product.toString());
            //Creating Motif scroll bar
            product = FactoryGenerator.getFactory(FactoryType.SCROLLBAR).getProduct(ProductType.MOTIFSCROLLBAR);
            System.out.println("Creating Motif scroll bar");
            System.out.println(product.getProductDetails());
            System.out.println(product.toString());
            // Creating default  pm scroll bar
            product = FactoryGenerator.getFactory(FactoryType.SCROLLBAR).getProduct(ProductType.DEFAULTPMSCROLLBAR);
            System.out.println(" Default PM Scroll bar");
            System.out.println(product.getProductDetails());
            System.out.println(product.toString());
            // Creating PM window
            widgetFactory = FactoryGenerator.getFactory(FactoryType.WINDOW);
            product = widgetFactory.getProduct(ProductType.PMWINDOW);
            System.out.println("Creating PM window");
            System.out.println(product.toString());
            System.out.println(product.getProductDetails());

        } catch (CloneNotSupportedException e) {
            System.out.println("Clone exception "+e);
        }
    }
}
