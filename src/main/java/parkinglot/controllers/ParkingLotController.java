package parkinglot.controllers;

import parkinglot.models.*;

public class ParkingLotController {
    public ParkingLot initializeParkingLot(){
        return null;
    }

    public ParkingLotStatus getAvailabilityStatus(ParkingLot parkingLot){
        return ParkingLotStatus.FULL;
    }

    public void park(Vehicle vehicle, ParkingLot parkingLot){

    }

    public void unPark(Ticket ticket){

    }

    public Bill calculateBill(Ticket ticket){
        return null;
    }
    

}

//Creation of ticket: CRUD : ticket
//Ticket controller
