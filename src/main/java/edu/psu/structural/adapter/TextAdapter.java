package edu.psu.structural.adapter;

import edu.psu.structural.adapter.target.Shape;

public class TextAdapter extends TextShape implements TextView {
    private Shape shape;

    public TextAdapter(Shape shape) {
        this.shape = shape;
        this.adapt();
    }

    private void adapt() {
        this.setHeight(shape.getHeight());
        this.setLeft(shape.getLeft());
        this.setWidth(shape.getWidth());
        this.setTop(shape.getTop());
        this.setShapeType(shape.getShapeType());
    }
}
