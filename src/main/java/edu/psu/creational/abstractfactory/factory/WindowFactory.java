package edu.psu.creational.abstractfactory.factory;

import edu.psu.creational.abstractfactory.factory.enums.ProductType;
import edu.psu.creational.abstractfactory.product.AbstractProduct;
import edu.psu.creational.abstractfactory.product.MotifWindow;
import edu.psu.creational.abstractfactory.product.PMWindow;

public class WindowFactory extends AbstractWidgetFactory {
    @Override
    public AbstractProduct getProduct(ProductType productType) {
        switch (productType){
            case MOTIFWINDOW:
                return new MotifWindow("Red","Motif Window title bar");
            case PMWINDOW:
                return new PMWindow("Blue"," PM Window title bar");
        }
        return null;
    }
}
