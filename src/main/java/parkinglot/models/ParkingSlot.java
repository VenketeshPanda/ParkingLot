package parkinglot.models;

public class ParkingSlot extends BaseModel{
    String slotNo;
    ParkingSlotStatus slotStatus;
    VehicleType vehicleType;


    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getSlotNo() {
        return slotNo;
    }

    public void setSlotNo(String slotNo) {
        this.slotNo = slotNo;
    }


    public ParkingSlotStatus getSlotStatus() {
        return slotStatus;
    }

    public void setSlotStatus(ParkingSlotStatus slotStatus) {
        this.slotStatus = slotStatus;
    }

}
