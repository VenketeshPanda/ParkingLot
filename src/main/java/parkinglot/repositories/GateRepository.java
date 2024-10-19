package parkinglot.repositories;

import parkinglot.models.Gate;

import java.util.Map;
import java.util.Optional;
import java.util.TreeMap;

public class GateRepository {
    Map<Integer,Gate> gates = new TreeMap<>();
    private static int prevGateId = 0;
    public Gate findGateById(int gateId){
        if(gates.containsKey(gateId)) return gates.get(gateId);
        return null;
    }

    public Gate saveGate(Gate gate){
        prevGateId+=1;
        gate.setId(prevGateId);
        gates.put(prevGateId,gate);
        return gate;
    }
}
