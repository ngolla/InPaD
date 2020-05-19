package edu.psu.creational.abstractfactory.product;

public class MotifScrollBar extends AbstractProduct implements Cloneable {
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

    public void setDefaults(){
        this.orientation="Default Orientation";
        this.max=500;
        this.min=0;
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        MotifScrollBar temp = new MotifScrollBar();
        temp.setDefaults();
        return temp;
    }
}
