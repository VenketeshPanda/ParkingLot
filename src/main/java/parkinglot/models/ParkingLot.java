package parkinglot.models;

import java.util.List;

public class ParkingLot extends BaseModel{
    String name;
    List<ParkingFloor> floorList;

    public ParkingLot(){

    }
    public ParkingLot(ParkingLotBuilder parkingLotBuilder) {
        this.name = name;
        this.floorList = floorList;
        this.entryGates = entryGates;
        this.exitGates = exitGates;
        this.parkingLotStatus = parkingLotStatus;
        this.allowedVehicleTypesCapacity = allowedVehicleTypesCapacity;
        this.slotAssignmentStrategyType = slotAssignmentStrategyType;
    }

    List<Gate> entryGates;

    public SlotAssignmentStrategyType getSlotAssignmentStrategyType() {
        return slotAssignmentStrategyType;
    }

    public void setSlotAssignmentStrategyType(SlotAssignmentStrategyType slotAssignmentStrategyType) {
        this.slotAssignmentStrategyType = slotAssignmentStrategyType;
    }

    List<Gate> exitGates;
    ParkingLotStatus parkingLotStatus;
    List<SupportedVehicleTypes> allowedVehicleTypesCapacity;
    SlotAssignmentStrategyType slotAssignmentStrategyType;

    public List<SupportedVehicleTypes> getAllowedVehicleTypesCapacity() {
        return allowedVehicleTypesCapacity;
    }

    public void setAllowedVehicleTypesCapacity(List<SupportedVehicleTypes> allowedVehicleTypesCapacity) {
        this.allowedVehicleTypesCapacity = allowedVehicleTypesCapacity;
    }


    public static ParkingLotBuilder getBuilder(){
        return new ParkingLotBuilder();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ParkingFloor> getFloorList() {
        return floorList;
    }

    public void setFloorList(List<ParkingFloor> floorList) {
        this.floorList = floorList;
    }

    public List<Gate> getEntryGates() {
        return entryGates;
    }

    public void setEntryGates(List<Gate> entryGates) {
        this.entryGates = entryGates;
    }

    public List<Gate> getExitGates() {
        return exitGates;
    }

    public void setExitGates(List<Gate> exitGates) {
        this.exitGates = exitGates;
    }

    public ParkingLotStatus getParkingLotStatus() {
        return parkingLotStatus;
    }

    public void setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }



    public static class ParkingLotBuilder{

        String name;
        List<ParkingFloor> floorList;
        List<Gate> entryGates;
        List<Gate> exitGates;
        ParkingLotStatus parkingLotStatus;
        List<SupportedVehicleTypes> allowedVehicleTypesCapacity;


        public ParkingLotBuilder setSlotAssignmentStrategyType(SlotAssignmentStrategyType slotAssignmentStrategyType) {
            this.slotAssignmentStrategyType = slotAssignmentStrategyType;
            return this;
        }

        SlotAssignmentStrategyType slotAssignmentStrategyType;

        public ParkingLotBuilder(){

        }

        public ParkingLot build(){
            System.out.println("Parking lot created");
            return new ParkingLot(this);
        }

        public ParkingLotBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public ParkingLotBuilder setFloorList(List<ParkingFloor> floorList) {
            this.floorList = floorList;
            return this;
        }

        public ParkingLotBuilder setEntryGates(List<Gate> entryGates) {
            this.entryGates = entryGates;
            return this;
        }

        public ParkingLotBuilder setExitGates(List<Gate> exitGates) {
            this.exitGates = exitGates;
            return this;
        }

        public ParkingLotBuilder setParkingLotStatus(ParkingLotStatus parkingLotStatus) {
            this.parkingLotStatus = parkingLotStatus;
            return this;
        }

        public ParkingLotBuilder setAllowedVehicleTypes(List<SupportedVehicleTypes> allowedVehicleTypesCapacity) {
            this.allowedVehicleTypesCapacity = allowedVehicleTypesCapacity;
            return this;
        }


    }
}
