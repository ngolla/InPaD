package edu.psu.creational.builder.director;

import edu.psu.creational.builder.builders.MazeBuilder;
import edu.psu.creational.builder.product.Maze;

public class MazeGame {
    public Maze createMaze(MazeBuilder mazeBuilder){
        mazeBuilder.buildMaze();
        mazeBuilder.buildRoom(1);
        mazeBuilder.buildRoom(2);
        mazeBuilder.buildDoor(1,2);
        return mazeBuilder.getMaze();
    }
    public Maze createComplexMaze(MazeBuilder mazeBuilder){
        for(int i=0; i<10;i++){
            mazeBuilder.buildRoom(i+1);
        }
        return mazeBuilder.getMaze();
    }
}
