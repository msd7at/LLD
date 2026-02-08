package org.designpatterns.observer;

import org.designpatterns.observer.concreateobserver.PhoneObserver;
import org.designpatterns.observer.concreateobserver.Tablet;
import org.designpatterns.observer.concreatesubject.WeatherStation;
import org.designpatterns.observer.interfaces.Observer;

public class main {
    public static void main(String[] args) {
        Observer ph = new PhoneObserver();
        Observer tab = new Tablet();

        WeatherStation st = new WeatherStation();
        st.setWwather("Sunny");

        st.registerObserevr(ph);
        st.registerObserevr(tab);

        st.notifyObserver();

        st.removeObserver(tab);

        st.notifyObserver();



    }
}
