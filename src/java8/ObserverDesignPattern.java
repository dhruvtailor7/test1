package java8;

import java.util.ArrayList;
import java.util.List;

public class ObserverDesignPattern {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new Observer(subject);
        new Observer(subject);

        subject.setState1(4);

    }
}

class Observer{
    Subject subject;
    Observer(Subject subject){
        this.subject = subject;
        this.subject.addObserver(this);
    }
    void update(){

        System.out.println(subject.getState1());
    }
}
class Subject{
    int state1;
    List<Observer> observers=new ArrayList<>();
    int getState1(){
        return state1;
    }

    void setState1(int state1){
        this.state1 = state1;

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
