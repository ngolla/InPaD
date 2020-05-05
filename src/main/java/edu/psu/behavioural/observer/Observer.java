package edu.psu.behavioural.observer;

public interface Observer {
    public void update();
    public void subscribe(Subject subject);
}
