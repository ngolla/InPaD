package edu.psu.creational.builder.product;

import java.util.HashSet;
import java.util.Set;

public class Maze {
    public Maze(){
        System.out.println("Creating maze! ");
    }
    private Set<Room> _rooms = new HashSet<Room>();
    public void addRoom(Room room){
        if(!_rooms.contains(room))
            _rooms.add(room);
    }
    public Room roomNo(int n){
        for(Room room:_rooms){
            if(room.roomNo==n)
                return room;
        }
        return null;
    }
}
