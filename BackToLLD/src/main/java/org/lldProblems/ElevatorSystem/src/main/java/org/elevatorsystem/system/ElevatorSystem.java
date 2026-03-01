package org.elevatorsystem.system;

import org.elevatorsystem.model.Elevator;
import org.elevatorsystem.model.Request;
import org.elevatorsystem.strategy.ElevatorSelectionStrategy;
import org.elevatorsystem.strategy.NearestElevatorStrategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ElevatorSystem {
    private final Map<Integer, Elevator> elevators = new HashMap<>();
    private final ElevatorSelectionStrategy selectionStrategy;

    public ElevatorSystem(int count) {
        for (int i = 0; i < count; i++) {
            elevators.put(i, new Elevator(i, 5));
        }
        this.selectionStrategy = new NearestElevatorStrategy();
    }

    public void requestElevator(Request req){
        List<Elevator> allElevators = elevators.values().stream().toList();
        Elevator bestElevator =  selectionStrategy.selectElevator(allElevators, req);
        System.out.println("Best Eleveator selected for request  "  + "Souce  "+ req.getSourceFloor() +"Target FLoor  " + req.getTargetFloor());
        System.out.println("Selected Eleavtor is "+ bestElevator.id + " CUreent Loc "+ bestElevator.currentFloor);
        if (bestElevator != null){
            bestElevator.addRequest(req);
        } else {
            System.out.println("No Elevator Available");
        }
    }

}
