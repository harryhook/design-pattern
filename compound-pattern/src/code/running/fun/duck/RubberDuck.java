package code.running.fun.duck;

import code.running.fun.Quackable;
import code.running.fun.observer.Observable;
import code.running.fun.observer.Observer;


public class RubberDuck implements Quackable {
    Observable observable;

    public RubberDuck() {
        observable = new Observable(this);
    }

    @Override
    public void quack() {
        // 橡皮鸭吱吱叫
        System.out.println("Squeak");
        notifyObservers();
    }



    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "RubberDuck";
    }
}
