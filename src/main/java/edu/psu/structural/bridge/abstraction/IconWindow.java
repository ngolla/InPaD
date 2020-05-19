package edu.psu.structural.bridge.abstraction;

import edu.psu.structural.bridge.implementor.WindowImp;

public class IconWindow extends Window {
    public IconWindow(WindowImp x, WindowImp pm) {
        super(x, pm);
    }

    @Override
    public void operation() {
        System.out.print("Operated Window Icon operation!");
        xwindow.operationImpl();
        pmwindow.operationImpl();

    }
}
