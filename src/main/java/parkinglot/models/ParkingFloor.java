package parkinglot.models;

import java.util.*;

public class ParkingFloor extends BaseModel{
    private String floorNo;
    private List<ParkingSlot> slotList;
    private List<SupportedVehicleTypes> allowedVehicles;
    private ParkingFloorStatus floorStatus;

    public List<SupportedVehicleTypes> getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(List<SupportedVehicleTypes> allowedVehicles) {
        this.allowedVehicles = allowedVehicles;
    }

    public ParkingFloorStatus getFloorStatus() {
        return floorStatus;
    }

    public void setFloorStatus(ParkingFloorStatus floorStatus) {
        this.floorStatus = floorStatus;
    }

    public ParkingFloor(String floorNo, List<ParkingSlot> slotList, List<SupportedVehicleTypes> allowedVehicles, ParkingFloorStatus floorStatus) {
        this.floorNo = floorNo;
        this.slotList = slotList;
        this.allowedVehicles = allowedVehicles;
        this.floorStatus = floorStatus;
    }



    public List<ParkingSlot> getSlotList() {
        return slotList;
    }

    public void setSlotList(List<ParkingSlot> slotList) {
        this.slotList = slotList;
    }

    public String getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(String floorNo) {
        this.floorNo = floorNo;
    }
}
