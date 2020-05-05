package edu.psu.creational.factory;

import edu.psu.creational.factory.enums.ProductType;
import edu.psu.creational.product.AbstractProduct;
import edu.psu.creational.product.MotifWindow;
import edu.psu.creational.product.PMWindow;

public class WindowFactory extends AbstractWidgetFactory {
    @Override
    public AbstractProduct getProduct(ProductType productType) throws CloneNotSupportedException {
        switch (productType){
            case DEFAULTPMWINDOW:
                MotifWindow defaultmw=new MotifWindow();
                return (AbstractProduct) defaultmw.clone();
            case DEFAULTMOTIFWINDOW:
                PMWindow defaultpm=new PMWindow();
                //we can change this cloned object- this is implementation of Prototype in Creational design pattern
                return (AbstractProduct) defaultpm.clone();
            case MOTIFWINDOW:
                return new MotifWindow("Red","Motif Window title bar");
            case PMWINDOW:
                return new PMWindow("Blue"," PM Window title bar");

        }
        return null;
    }
}
