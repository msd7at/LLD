package org.lldProblems.ParkingLot.entities;

import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
    int floorNumber;
    public List<ParkingSpot> spots;

    public ParkingFloor(int floorNumber){
        this.floorNumber = floorNumber;
        spots = new ArrayList<>();
    }

    public synchronized  ParkingSpot getFreeSpot(Vehicle vehicle){
        for (ParkingSpot spot : spots){
            if (spot.isFree && spot.type == vehicle.type){
                return spot;
            }
        }
        return  null;
    }

}
