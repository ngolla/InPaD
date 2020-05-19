package edu.psu.structural.adapter;

import edu.psu.structural.adapter.target.ShapeType;

public interface TextView {
    public int getWidth();
    public int getHeight();
    public int getTop();
    public int getLeft();
    public ShapeType getShapeType();
}
