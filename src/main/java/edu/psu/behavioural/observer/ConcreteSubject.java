package edu.psu.behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements Subject {
    List<Observer> observerList;
    private String message;
    private boolean changed;

    public ConcreteSubject() {
        this.observerList = new ArrayList<Observer>();
    }

    @Override
    public void attach(Observer observer) {
        if(observer==null)
            throw new NullPointerException("no observer to add");
        if(!observerList.contains(observer))
            this.observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.remove(observer);
    }

    // Broadcast message
    @Override
    public void notifyObservers() {
        if(!changed)
            return;
        for (Observer ob :observerList) {
            ob.update();
        }

    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    public void postMessage(String msg){
        System.out.println("Message to be posted: "+msg);
        this.message=msg;
        this.changed=true;
        this.notifyObservers();
    }
}
