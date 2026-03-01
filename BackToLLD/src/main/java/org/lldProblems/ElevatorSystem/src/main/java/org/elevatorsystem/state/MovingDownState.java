package org.elevatorsystem.state;


import org.elevatorsystem.model.Elevator;

public class MovingDownState implements ElevatorState {
    public void move(Elevator elevator) {
        elevator.moveDown();
    }
}