package edu.psu.creational.builder.product;

public class Room implements MapSite{
    public int roomNo;
    public Room(){
        this. roomNo=0;
        System.out.println("Room number with rooms =0 ");
    }
    public Room(int roomNo){
        this.roomNo=roomNo;
    }
    public void setSide(Direction direction, MapSite mapSite){
        System.out.println("Set direction "+direction.toString());
    }

    @Override
    public void enter(Maze maze) {
        System.out.println("Entered Room!");
    }
}
