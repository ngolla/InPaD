package edu.psu.behavioural.observer;

public interface Subject {
    public void attach(Observer observer);
    public void detach(Observer observer);
    public void notifyObservers();
    public Object getUpdate(Observer observer);
}
