package edu.psu.creational.abstractfactory;

import edu.psu.creational.abstractfactory.factory.enums.FactoryType;
import edu.psu.creational.abstractfactory.factory.AbstractWidgetFactory;
import edu.psu.creational.abstractfactory.factory.ScrollBarFactory;
import edu.psu.creational.abstractfactory.factory.WindowFactory;

public class FactoryGenerator {
    public static AbstractWidgetFactory getFactory(FactoryType factoryType){
        switch (factoryType){
            case WINDOW:
                return new WindowFactory();
            case SCROLLBAR:
                return new ScrollBarFactory();
        }
        return null;
    }
}
