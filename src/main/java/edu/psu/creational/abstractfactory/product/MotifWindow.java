package edu.psu.creational.abstractfactory.product;

public class MotifWindow extends AbstractProduct {
    private String titleAreaColor;
    private String titleBar;

    public MotifWindow(String titleAreaColor, String titleBar) {
        this.titleAreaColor = titleAreaColor;
        this.titleBar = titleBar;
    }

    public MotifWindow() {

    }

    @Override
    public String getProductDetails() {
        return "Motif Window components of Title Area Color: "+ titleAreaColor +" Title Bar: "+titleBar;
    }

    @Override
    public String toString() {
        return "MotifWindow{" +
                "titleAreaColor='" + titleAreaColor + '\'' +
                ", titleBar='" + titleBar + '\'' +
                '}';
    }
}
