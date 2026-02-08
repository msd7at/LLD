package org.lldProblems.ParkingLot.entities;

import java.util.UUID;

public class Ticket {
    UUID ticketId;
    public long entryTime;
    Vehicle vehicle;
    ParkingSpot spot;

    public Ticket(UUID ticketId, Vehicle vehicle, ParkingSpot spot) {
        this.ticketId = ticketId;
        this.vehicle = vehicle;
        this.spot = spot;
        this.entryTime = System.currentTimeMillis();

        System.out.println("Ticket GENRATED for " + vehicle.type + " : " + vehicle.number + ", EntryTime : " + entryTime);
    }


}
