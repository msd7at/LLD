package org.lldProblems.ParkingLot.entities;

public class ParkingSpot {
    int spotId;
    VehicleType type;
    boolean isFree = true;
    Vehicle vehicle;

    public ParkingSpot(VehicleType type, int id){
        this.type = type;
        this.spotId = id;
    }

    public synchronized  boolean park(Vehicle vehicle){
        if (vehicle.type != type){
            return false;
        }
        isFree = false;
        this.vehicle = vehicle;
        return true;
    }

    public synchronized void unPark(){
        this.vehicle = null;
        isFree = true;
    }

}
