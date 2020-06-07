package edu.psu.creational.abstractfactory.product;

public class PMScrollBar extends AbstractProduct {
    private String orientation;
    private int max;
    private int min;

    public PMScrollBar(String orientation, int max, int min) {
        this.orientation = orientation;
        this.max = max;
        this.min = min;
    }

    public PMScrollBar() {
    }

    @Override
    public String getProductDetails() {
        return "PM ScrollBar with component values of Orientation as "+orientation+" Max value as "+max+" Min value as "+min;
    }

    @Override
    public String toString() {
        return "PMScrollBar{" +
                "orientation='" + orientation + '\'' +
                ", max=" + max +
                ", min=" + min +
                '}';
    }
}
