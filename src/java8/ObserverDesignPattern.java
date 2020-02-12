package java8;

import java.util.ArrayList;
import java.util.List;

public class ObserverDesignPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new Observer(subject);
        new Observer(subject);
        subject.setAnInt(4);
    }
}

class Observer{
    Subject subject;
    Observer(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }
    void update(){
        System.out.println(subject.getAnInt());


    }
}
class Subject{
    int anInt;
    List<Observer> observers=new ArrayList<>();
    int getAnInt(){
        return anInt;
    }

    void setAnInt(int anInt){
        this.anInt = anInt;
        notifyObservers();
    }
    void notifyObservers(){
        for(Observer observer:observers)
            observer.update();
    }
    void addObserver(Observer observer){
        observers.add(observer);
    }
}
