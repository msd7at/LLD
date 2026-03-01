package org.elevatorsystem.state;

import org.elevatorsystem.model.Elevator;

public class IdleState implements  ElevatorState{
    @Override
    public void move(Elevator elevator) {
        // Elevator is idle, waiting for requests
        System.out.println("Elevator " + elevator.id + " is idle at floor " + elevator.currentFloor);
        if (elevator.hasRequests()) {
            elevator.setState(elevator.getNextState());
        }
    }
}
