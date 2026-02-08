package org.lldProblems.ParkingLot.strategy;

import org.lldProblems.ParkingLot.entities.Ticket;

public interface ParkingPriceStrategy {
    double caluculateAmount(Ticket ticket);
}
