package org.designpatterns.observer.interfaces;

public interface Subject {
        void registerObserevr(Observer ob);
        void removeObserver(Observer ob);
        void notifyObserver();
}
