package edu.psu.structural.bridge.abstraction;

import edu.psu.structural.bridge.implementor.WindowImp;

public abstract class Window {
    protected WindowImp xwindow;
    protected WindowImp pmwindow;
    public Window(WindowImp x,WindowImp pm){
        xwindow=x;
        pmwindow=pm;
    }
    abstract public void operation();
}
