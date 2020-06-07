package edu.psu.structural.bridge;

import edu.psu.structural.bridge.abstraction.IconWindow;
import edu.psu.structural.bridge.abstraction.Window;
import edu.psu.structural.bridge.implementor.PMWindowImp;
import edu.psu.structural.bridge.implementor.XWindowImp;

public class Client {
    public static void main(String[] args) {
        Window iconWindow=new IconWindow(new XWindowImp(), new PMWindowImp());
        iconWindow.operation();
    }
}
