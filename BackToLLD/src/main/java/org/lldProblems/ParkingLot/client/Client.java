package org.lldProblems.ParkingLot.client;

import org.lldProblems.ParkingLot.entities.*;
import org.lldProblems.ParkingLot.strategy.HourlyPricingStrategy;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void      main(String[] args) {
        int numberOfFlors = 5;
        int spotsOnEachFloor = 20;
        List<ParkingFloor> floors = new ArrayList<>();

        for (int i =0 ; i < numberOfFlors ; i++){
            ParkingFloor floor = new ParkingFloor(i);
            int carsSpot = (75/spotsOnEachFloor) * 100;
            int bikeSpots = (20/spotsOnEachFloor) * 100;
            int truckSpots = (5/spotsOnEachFloor)* 100;
            int c = 0;
            for (int x =0 ; x < carsSpot; x++){
                ParkingSpot carSpot = new ParkingSpot(VehicleType.CAR, c++);
                floor.spots.add(carSpot);
            }
            for (int x =0 ; x < bikeSpots; x++){
                ParkingSpot bikeSpot = new ParkingSpot(VehicleType.BIKE, c++);
                floor.spots.add(bikeSpot);
            }
            for (int x =0 ; x < carsSpot; x++){
                ParkingSpot truckSpot = new ParkingSpot(VehicleType.TRUCK, c++);
                floor.spots.add(truckSpot);
            }
            floors.add(floor);
        }

        ParkingLot lot = new ParkingLot(floors, new HourlyPricingStrategy());

        Vehicle car = new Car("DL 4C 7845", VehicleType.CAR);

        Ticket newTicket = lot.park(car);

        if (newTicket == null){
            System.out.println("All Parked");
        }

        lot.unPark(newTicket);


    }
}
