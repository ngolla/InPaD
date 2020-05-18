package edu.psu.creational.builder.product;

public class Door implements MapSite {
    //Room numbers
    private Room room1;
    private Room room2;
    @Override
    public void enter(Maze maze) {
        System.out.println("Entered Door!!");
    }
    public Door(){

    }
    public Door(Room room1,Room room2){
        this.room1=room1;
        this.room2=room2;
    }
}
