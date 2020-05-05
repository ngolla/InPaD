package edu.psu.creational;

import edu.psu.creational.enums.FactoryType;
import edu.psu.creational.factory.AbstractWidgetFactory;
import edu.psu.creational.factory.ScrollBarFactory;
import edu.psu.creational.factory.WindowFactory;

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
