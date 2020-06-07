package edu.psu.creational.abstractfactory.factory;

import edu.psu.creational.abstractfactory.factory.enums.ProductType;
import edu.psu.creational.abstractfactory.product.AbstractProduct;

public abstract class AbstractWidgetFactory {
    public abstract AbstractProduct getProduct(ProductType productType) ;
}
