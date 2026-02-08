package org.lldProblems.ParkingLot.entities;

import java.util.List;

public class SpotManager {
    List<ParkingFloor> floors;

    SpotManager(List<ParkingFloor> floors){
        this.floors = floors;
    }

    public ParkingSpot getAvailableSpot(Vehicle vehicle){
        for (ParkingFloor flr : floors){
            ParkingSpot availableSpot = flr.getFreeSpot(vehicle);
            if (availableSpot != null){
                return  availableSpot;
            }
        }
        return null;
    }


}
