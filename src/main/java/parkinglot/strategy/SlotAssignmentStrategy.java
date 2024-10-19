package parkinglot.strategy;

import parkinglot.models.ParkingLot;
import parkinglot.models.ParkingSlot;
import parkinglot.models.VehicleType;

public interface SlotAssignmentStrategy {
    public ParkingSlot assignSlot(ParkingLot lot, VehicleType vehicleType);
}

//to assign the parking lot what all data is required
//vehicleType+floor
//do we have floors directly available?
//floors are in lot, we do not have lot data as well
//the client sent the gateId

//using the gate object can we find the parking lot?