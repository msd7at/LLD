package org.elevatorsystem;

import org.elevatorsystem.model.Request;
import org.elevatorsystem.model.RequestSource;
import org.elevatorsystem.system.ElevatorSystem;

public class ElevatorSystemDemo {

    public static void main(String[] args) {

        ElevatorSystem system = new ElevatorSystem(3);

        system.requestElevator(
                new Request(2, 8, RequestSource.EXTERNAL));

        system.requestElevator(
                new Request(1, 5, RequestSource.EXTERNAL));

        system.requestElevator(
                new Request(5, 1, RequestSource.EXTERNAL));
    }
}
