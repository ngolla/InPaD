package edu.psu.creational.factory;

import edu.psu.creational.factory.enums.ProductType;
import edu.psu.creational.product.AbstractProduct;

public abstract class AbstractWidgetFactory {
    public abstract AbstractProduct getProduct(ProductType productType) throws CloneNotSupportedException;
}
