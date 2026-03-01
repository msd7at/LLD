package org.elevatorsystem.strategy;

import org.elevatorsystem.model.Elevator;
import org.elevatorsystem.model.Request;

import java.util.List;

public interface ElevatorSelectionStrategy {

        Elevator selectElevator(List<Elevator> elevators, Request request);

}
