package edu.psu.creational.builder.product;

public class Wall implements MapSite{
    @Override
    public void enter(Maze maze) {
        System.out.println("Entered Wall!! ");
    }
    public Wall(){}
}
