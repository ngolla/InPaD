package edu.psu.creational.builder.builders;

import edu.psu.creational.builder.product.*;

public class StandardMazeBuilder implements MazeBuilder{
    public StandardMazeBuilder(){

    }
    private Maze _currentMaze;
    @Override
    public void buildMaze() {
        System.out.println("Building Maze!! ");
        _currentMaze=new Maze();
    }

    @Override
    public void buildRoom(int roomNo) {
        System.out.println("Build Room!! ");
        Room room = _currentMaze.roomNo(roomNo);
        if(room ==null){
            room=new Room(roomNo);
            _currentMaze.addRoom(room);
            room.setSide(Direction.EAST, new Wall());
            room.setSide(Direction.WEST, new Wall());
            room.setSide(Direction.NORTH, new Wall());
            room.setSide(Direction.SOUTH, new Wall());
        }
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        System.out.println("Building Door!! ");
        Room room1=_currentMaze.roomNo(roomFrom);
        Room room2=_currentMaze.roomNo(roomTo);
        Door door=new Door(room1,room2);
        room1.setSide(Direction.EAST,door);
        room2.setSide(Direction.WEST,door);
    }

    @Override
    public Maze getMaze() {
        return _currentMaze;
    }
}
