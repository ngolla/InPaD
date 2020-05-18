package edu.psu.creational.builder;

import edu.psu.creational.builder.builders.MazeBuilder;
import edu.psu.creational.builder.builders.StandardMazeBuilder;
import edu.psu.creational.builder.director.MazeGame;
import edu.psu.creational.builder.product.Maze;

public class BuilderClient {
    static Maze maze;
    public static void client(){
        MazeGame mazeGame=new MazeGame();
        MazeBuilder mazeBuilder=new StandardMazeBuilder();
        mazeGame.createMaze(mazeBuilder);
        maze=mazeBuilder.getMaze();
    }
}
