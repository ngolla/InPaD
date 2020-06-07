package edu.psu.creational.singleton;

public class Client {
    public static void main(String[] args) {
        MazeFactory env=MazeFactory.instance();
        env.setAppName("MyApp");
        System.out.println("Single Instance - created environment: "+ MazeFactory.instance().getAppName());
    }
}
