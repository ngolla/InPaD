package edu.psu.creational.singleton;

public class MazeFactory {
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    private String appName="";
    protected MazeFactory(){}
    private static MazeFactory _instance=null;
    public static MazeFactory instance(){
        if(_instance ==null){
            _instance=new MazeFactory();
        }
        return _instance;
    }

}
