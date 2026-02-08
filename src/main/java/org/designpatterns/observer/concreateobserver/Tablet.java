package org.designpatterns.observer.concreateobserver;

import org.designpatterns.observer.interfaces.Observer;

public class Tablet implements Observer {

    @Override
    public void update(String weather) {
        System.out.println("Tablet reccived weather msg " + weather);
    }
}
