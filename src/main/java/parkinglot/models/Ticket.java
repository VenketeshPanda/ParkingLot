package parkinglot.models;

import java.time.LocalDateTime;
import java.util.Date;

public class Ticket extends BaseModel{
    Vehicle vehicle;
    Date entryTime;
    Gate entryGate;
    Operator entryOperator;
    ParkingSlot parkingSlot;

//    public Ticket(Vehicle vehicle, Date entryTime, Gate entryGate, Operator entryOperator, ParkingSlot parkingLot) {
//        this.vehicle = vehicle;
//        this.entryTime = entryTime;
//        this.entryGate = entryGate;
//        this.entryOperator = entryOperator;
//        this.parkingSlot = parkingLot;
//    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Operator getEntryOperator() {
        return entryOperator;
    }

    public void setEntryOperator(Operator entryOperator) {
        this.entryOperator = entryOperator;
    }

}

