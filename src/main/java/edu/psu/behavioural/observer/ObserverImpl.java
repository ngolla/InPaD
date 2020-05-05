package edu.psu.behavioural.observer;

public class ObserverImpl implements Observer {
    String name;
    Subject subject;

    public ObserverImpl(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        String msg=(String)subject.getUpdate(this);
        if(msg==null)
            System.out.println(name+ " : No new messages ");
        else
            System.out.println(name+ " : "+msg);
    }

    @Override
    public void subscribe(Subject subject) {
        this.subject=subject;
    }
}
