package edu.psu.behavioural.observer;

public class Demo {
    public static void main(String[] args) {
        ConcreteSubject subject=new ConcreteSubject();
        Observer ob1=new ObserverImpl("observer1");
        Observer ob2=new ObserverImpl("observer2");
        subject.attach(ob1);
        subject.attach(ob2);
        ob1.subscribe(subject);
        ob2.subscribe(subject);
        ob1.update();
        ob2.update();
        subject.postMessage("New message to notify");
        subject.detach(ob2);
        subject.postMessage("Another message after detach");
    }
}
