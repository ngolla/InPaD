package edu.psu.creational.abstractfactory.product;

public class MotifScrollBar extends AbstractProduct {
    private String orientation;
    private int max;
    private int min;

    public MotifScrollBar(String orientation, int max, int min) {
        this.orientation = orientation;
        this.max = max;
        this.min = min;
    }

    public MotifScrollBar() {
    }

    @Override
    public String getProductDetails() {
        return "MotifScrollBar with component values of Orientation as "+orientation+" Max value as "+max+" Min value as "+min;
    }

    @Override
    public String toString() {
        return "MotifScrollBar{" +
                "orientation='" + orientation + '\'' +
                ", max=" + max +
                ", min=" + min +
                '}';
    }

}
