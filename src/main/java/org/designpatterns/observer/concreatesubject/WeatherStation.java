package org.designpatterns.observer.concreatesubject;

import org.designpatterns.observer.interfaces.Observer;
import org.designpatterns.observer.interfaces.Subject;
import java.util.*;

public class WeatherStation implements Subject {
    List<Observer> observers = new ArrayList<>();
    String weather;
    public void setWwather(String wh){
            this.weather = wh;
            notifyObserver();
    }

    @Override
    public void registerObserevr(Observer ob) {
        observers.add(ob);
        System.out.println("Object added");
    }

    @Override
    public void removeObserver(Observer ob) {
        observers.remove(ob);
    }

    @Override
    public void notifyObserver() {
        for (Observer ob : observers){
            ob.update(weather);
        }
    }
}
