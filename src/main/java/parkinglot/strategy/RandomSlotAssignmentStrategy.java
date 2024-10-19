package parkinglot.strategy;

import parkinglot.models.*;

public class RandomSlotAssignmentStrategy implements SlotAssignmentStrategy{
    @Override
    public ParkingSlot assignSlot(ParkingLot lot, VehicleType vehicleType) {
        for(ParkingFloor parkingFloor: lot.getFloorList()){
            for(ParkingSlot parkingSlot: parkingFloor.getSlotList()){
                if(parkingSlot.getSlotStatus().equals(ParkingSlotStatus.EMPTY) &&
                    parkingSlot.getVehicleType().equals(vehicleType)){
                    parkingSlot.setSlotStatus(ParkingSlotStatus.FILLED);
                    return parkingSlot;
                }
            }
        }
        return null;
    }
}
