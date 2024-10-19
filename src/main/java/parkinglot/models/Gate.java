package parkinglot.models;

public class Gate extends BaseModel{

    GateType gateType;
    Operator operator;
    String gateName;

    public ParkingLot getParkingLot() {
        return parkingLot;
    }

    public void setParkingLot(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    ParkingLot parkingLot;

    public GateStatus getGateStatus() {
        return gateStatus;
    }

    public void setGateStatus(GateStatus gateStatus) {
        this.gateStatus = gateStatus;
    }

    public Gate(GateType gateType, Operator operator, String gateName, ParkingLot parkingLot, GateStatus gateStatus) {
        this.gateType = gateType;
        this.operator = operator;
        this.gateName = gateName;
        this.parkingLot = parkingLot;
        this.gateStatus = gateStatus;
    }

    GateStatus gateStatus;


    public GateType getGateType() {
        return gateType;
    }

    public void setGateType(GateType gateType) {
        this.gateType = gateType;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public String getGateName() {
        return gateName;
    }

    public void setGateName(String gateName) {
        this.gateName = gateName;
    }
}
