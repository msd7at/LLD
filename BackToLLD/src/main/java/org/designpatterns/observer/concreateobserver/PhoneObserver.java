package org.designpatterns.observer.concreateobserver;

import org.designpatterns.observer.interfaces.Observer;

public class PhoneObserver implements Observer {

    @Override
    public void update(String weather) {
        System.out.println("Phone reccived weather msg " + weather);
    }
}
