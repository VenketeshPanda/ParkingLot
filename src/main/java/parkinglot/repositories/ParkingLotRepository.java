package parkinglot.repositories;

import parkinglot.models.Gate;
import parkinglot.models.ParkingLot;

import java.util.Map;
import java.util.TreeMap;

public class ParkingLotRepository {
    private Map<Integer,ParkingLot> parkingLots=new TreeMap<>();
    private static int id=0;
    public ParkingLot findParkingLotByEntryGate(Gate gate){
         for(ParkingLot parkingLot: parkingLots.values()){
             for(Gate gate1: parkingLot.getEntryGates()) {
                 if(gate1.getId() == gate.getId()){
                     return parkingLot;
                 }
             }
         }
         return null;
    }

    public ParkingLot saveParkingLot(ParkingLot lot){
        id+=1;
        lot.setId(id);
        parkingLots.put(id,lot);
        return lot;
    }

    public ParkingLot findParkingLotById(int id){
        if(parkingLots.containsKey(id)){
            return parkingLots.get(id);
        }
        return null;
    }
}


//A Map: TreeMap best resembles the DB

/**
 * Instead of getting the parking lot from the gate, we can have a ParkingLot ref
 * in the Gate class and we can access the ParkingLot from getters
 */