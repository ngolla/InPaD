package edu.psu.creational.abstractfactory.product;

public class PMWindow extends AbstractProduct {
    private String titleAreaColor;
    private String titleBar;

    public PMWindow(String titleAreaColor, String titleBar) {
        this.titleAreaColor = titleAreaColor;
        this.titleBar = titleBar;
    }

    public PMWindow() {
    }


    @Override
    public String getProductDetails() {
        return "PM Window components of Title Area Color: "+ titleAreaColor +" Title Bar: "+titleBar;
    }

    @Override
    public String toString() {
        return "PMWindow{" +
                "titleAreaColor='" + titleAreaColor + '\'' +
                ", titleBar='" + titleBar + '\'' +
                '}';
    }

}
