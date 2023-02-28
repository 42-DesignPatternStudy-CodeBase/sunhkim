package observer;

import java.util.*;

public abstract class NumberGenerator {
    private List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }
    
    public void notifyObservers() {
        Iterator<Observer> obsIter = observers.iterator();
        while (obsIter.hasNext()) {
            Observer o = obsIter.next();
            o.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}