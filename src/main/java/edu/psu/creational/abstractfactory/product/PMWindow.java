package edu.psu.creational.abstractfactory.product;

public class PMWindow extends AbstractProduct implements Cloneable {
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

    public void setDefaults() {
        this.titleAreaColor="White";
        this.titleBar="This is title bar";
    }

    @Override
    public String toString() {
        return "PMWindow{" +
                "titleAreaColor='" + titleAreaColor + '\'' +
                ", titleBar='" + titleBar + '\'' +
                '}';
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        PMWindow clonewindow=new PMWindow();
        clonewindow.setDefaults();
        return clonewindow;
    }
}
