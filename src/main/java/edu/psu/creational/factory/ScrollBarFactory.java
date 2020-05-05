package edu.psu.creational.factory;

import edu.psu.creational.factory.enums.ProductType;
import edu.psu.creational.product.AbstractProduct;
import edu.psu.creational.product.MotifScrollBar;
import edu.psu.creational.product.PMScrollBar;

public class ScrollBarFactory extends AbstractWidgetFactory {
    @Override
    public AbstractProduct getProduct(ProductType productType) throws CloneNotSupportedException {
        switch (productType){
            case DEFAULTMOTIFSCROLLBAR:
                MotifScrollBar defaultScrollbar = new MotifScrollBar();
                return (AbstractProduct) defaultScrollbar.clone();
            case DEFAULTPMSCROLLBAR:
                PMScrollBar defaultpm=new PMScrollBar();
                return (AbstractProduct) defaultpm.clone();
            case PMSCROLLBAR:
                return new PMScrollBar("PM orientation",50,1);
            case MOTIFSCROLLBAR:
                return new MotifScrollBar("Motif orientation",25,0);
        }
        return null;
    }
}
