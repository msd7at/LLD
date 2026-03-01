package org.elevatorsystem.state;

import org.elevatorsystem.model.Elevator;

public class MovingUpState implements ElevatorState {
    public void move(Elevator elevator) {
        elevator.moveUp();
    }
}