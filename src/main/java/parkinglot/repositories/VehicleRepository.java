package parkinglot.repositories;

import parkinglot.models.Vehicle;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class VehicleRepository {
    Map<Integer,Vehicle> vehicles = new TreeMap<>();
    private static int vehicleId=0;
    public Optional<Vehicle> findVehicleByVehicleNo(String vehicleNo){
        for(Vehicle vehicle: vehicles.values()){
            if(vehicle.getNumber().equals(vehicleNo)){
                return Optional.of(vehicle);
            }
        }
        return null;
    }

    public Vehicle saveVehicle(Vehicle vehicle){
        //id will be attached
        vehicleId+=1;
        vehicle.setId(vehicleId);
        vehicles.put(vehicleId,vehicle);
        return vehicle;
    }
}
