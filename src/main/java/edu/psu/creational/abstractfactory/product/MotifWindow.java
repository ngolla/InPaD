package edu.psu.creational.abstractfactory.product;

public class MotifWindow extends AbstractProduct implements Cloneable {
    private String titleAreaColor;
    private String titleBar;

    public MotifWindow(String titleAreaColor, String titleBar) {
        this.titleAreaColor = titleAreaColor;
        this.titleBar = titleBar;
    }

    public MotifWindow() {

    }

    public void setDefaults(){
        this.titleAreaColor="Orange";
        this.titleBar="Motif Default text";
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        MotifWindow temp = new MotifWindow();
        temp.setDefaults();
        return temp;
    }
}
