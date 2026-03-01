package org.elevatorsystem;

import org.elevatorsystem.model.Elevator;
import org.elevatorsystem.model.Request;
import org.elevatorsystem.model.RequestSource;
import org.elevatorsystem.system.ElevatorSystem;

public class TestElevator {
    public static void main(String[] args) {
        System.out.println("Starting test...");

        ElevatorSystem system = new ElevatorSystem(3);

        System.out.println("\n=== Request 1 ===");
        system.requestElevator(new Request(2, 8, RequestSource.EXTERNAL));

        System.out.println("\n=== Request 2 ===");
        system.requestElevator(new Request(1, 5, RequestSource.EXTERNAL));

        System.out.println("\n=== Request 3 ===");
        system.requestElevator(new Request(5, 1, RequestSource.EXTERNAL));

        System.out.println("\n=== Test Complete ===");
    }
}

