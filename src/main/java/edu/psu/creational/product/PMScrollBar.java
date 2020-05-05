package edu.psu.creational.product;

public class PMScrollBar extends AbstractProduct implements Cloneable {
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

    public void setDefaults(){
        this.orientation="Default Orientation PM";
        this.max=500;
        this.min=0;
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        PMScrollBar sb=new PMScrollBar();
        sb.setDefaults();
        return sb;
    }
}
