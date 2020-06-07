package edu.psu.creational.abstractfactory;

import edu.psu.creational.abstractfactory.factory.AbstractWidgetFactory;
import edu.psu.creational.abstractfactory.factory.enums.FactoryType;
import edu.psu.creational.abstractfactory.factory.enums.ProductType;
import edu.psu.creational.abstractfactory.product.AbstractProduct;

public class Client {
    public static void main(String[] args) {
        AbstractProduct product = null;
        AbstractWidgetFactory widgetFactory = null;
        //Creating Motif scroll bar
        product = FactoryGenerator.getFactory(FactoryType.SCROLLBAR).getProduct(ProductType.MOTIFSCROLLBAR);
        System.out.println("Creating Motif scroll bar");
        System.out.println(product.getProductDetails());
        System.out.println(product.toString());
        // Creating PM window
        widgetFactory = FactoryGenerator.getFactory(FactoryType.WINDOW);
        product = widgetFactory.getProduct(ProductType.PMWINDOW);
        System.out.println("Creating PM window");
        System.out.println(product.toString());
        System.out.println(product.getProductDetails());

    }
}
