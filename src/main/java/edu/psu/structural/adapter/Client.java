package edu.psu.structural.adapter;

import edu.psu.structural.adapter.target.Shape;
import edu.psu.structural.adapter.target.ShapeType;

public class Client {
    public static void main(String[] args) {
        Shape shape=new Shape();
        shape.setHeight(10);
        shape.setLeft(10);
        shape.setTop(10);
        shape.setWidth(10);
        ShapeType shapeType=new ShapeType();
        shapeType.setButtonBegining(2);
        shapeType.setButtonEnd(2);
        shapeType.setButtonHelp(2);
        shape.setShapeType(shapeType);
        //Adapter to Shape class to link with textshape
        TextView textView=new TextAdapter(shape);
        System.out.println(textView.getHeight());
        System.out.println(textView.getLeft());
        System.out.println(textView.getTop());
        System.out.println(textView.getWidth());
        System.out.println(textView.getShapeType());
    }
}
