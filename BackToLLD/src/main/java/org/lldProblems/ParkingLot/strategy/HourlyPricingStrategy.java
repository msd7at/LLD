package org.lldProblems.ParkingLot.strategy;

import org.lldProblems.ParkingLot.entities.Ticket;

public class HourlyPricingStrategy implements ParkingPriceStrategy {

    private static final double perSecondCharge = 0.1;

    @Override
    public double caluculateAmount(Ticket ticket) {
        long currentTime = System.currentTimeMillis();
        long startingTime = ticket.entryTime;
        long durationInMillis = currentTime + (5000000) - startingTime;
        long durationInSeconds = durationInMillis / 1000; // Convert milliseconds to seconds
        return durationInSeconds * perSecondCharge;
    }
}