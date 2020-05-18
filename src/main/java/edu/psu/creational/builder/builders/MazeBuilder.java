package edu.psu.creational.builder.builders;

import edu.psu.creational.builder.product.Maze;

public interface MazeBuilder {

    public void buildMaze();
    public void buildRoom(int room);
    public void buildDoor(int roomFrom, int roomTo);
    public Maze getMaze();
}
