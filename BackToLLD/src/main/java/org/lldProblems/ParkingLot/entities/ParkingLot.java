package org.lldProblems.ParkingLot.entities;

import org.lldProblems.ParkingLot.strategy.ParkingPriceStrategy;

import java.util.List;
import java.util.UUID;

public class ParkingLot {
    SpotManager spotManager;
    ParkingPriceStrategy priceStrategy;


    public ParkingLot(List<ParkingFloor> floors, ParkingPriceStrategy priceStrategy){
        spotManager = new SpotManager(floors);
        this.priceStrategy = priceStrategy;
    }

    public synchronized  Ticket park(Vehicle vehicle){
        ParkingSpot availableSpot = spotManager.getAvailableSpot(vehicle);
        if (availableSpot == null){
            System.out.println("ALL SLots are FULL");
        }
        return new Ticket(UUID.randomUUID(), vehicle, availableSpot);

    }

    public synchronized double  unPark(Ticket ticket){
        double totalFee = priceStrategy.caluculateAmount(ticket);
        ticket.spot.unPark();
        System.out.println("Vehicle " + ticket.vehicle.number + " exited, Total Amount : " + totalFee);
        return totalFee;
    }
}
