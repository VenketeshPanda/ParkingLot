package parkinglot.services;

import parkinglot.models.*;
import parkinglot.repositories.GateRepository;
import parkinglot.repositories.TicketRepository;
import parkinglot.repositories.VehicleRepository;
import parkinglot.strategy.SlotAssignmentStrategy;
import parkinglot.strategy.SlotAssignmentStrategyFactory;

import java.util.Date;
import java.util.Optional;

public class TicketService {
    private GateRepository gateRepository;
    private VehicleRepository vehicleRepository;
    private TicketRepository ticketRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository,TicketRepository ticketRepository){
        this.gateRepository=gateRepository;
        this.vehicleRepository=vehicleRepository;
        this.ticketRepository=ticketRepository;
    }

    public Ticket issueTicket(int gateId, String vehicleNo, String ownerName, VehicleType vehicleType){
        //For ticket, what do we need
        //1. Properly create the ticket object with required details
        //2. Assigning the slot
        //3. Return the data
        Ticket ticket=new Ticket();
        ticket.setEntryTime(new Date());
        Gate gate = gateRepository.findGateById(gateId);
        ticket.setEntryGate(gate);
        ticket.setEntryOperator(gate.getOperator());
        Optional<Vehicle> vehicleOptional = vehicleRepository.findVehicleByVehicleNo(vehicleNo);
        Vehicle vehicle ;
        if(vehicleOptional==null){
            vehicle=new Vehicle();
            vehicle.setNumber(vehicleNo);
            vehicle.setOwnerName(ownerName);
            vehicle.setVehicleType(vehicleType);
            vehicle=vehicleRepository.saveVehicle(vehicle);
        }
        else{
            vehicle=vehicleOptional.get();
        }
        ticket.setVehicle(vehicle);

        //Slot :)
        ParkingLot parkingLot = gate.getParkingLot();
        ParkingSlot parkingSlot = SlotAssignmentStrategyFactory
                .getSlotAssignmentStrategy(parkingLot.getSlotAssignmentStrategyType())
                .assignSlot(parkingLot,vehicleType);
        ticket.setParkingSlot(parkingSlot);
        ticket=ticketRepository.saveTicket(ticket);
        return ticket;
    }
}

/* set up the controller with prop arguments
 2. handle the exceptions
 3. ticket service business logic
 4. start preparing all the data req for ticket object
 5. create gate repository for Gate to find the gate no
 6. discussed why optionals are better than basic null checks
 7. set up the VehicleRepository
 8. Assign the slot using Strategy
 9. Strategy needs ParkingLot
    9.1. We can find the ParkingLot by using the repository
    9.2. We can pass the ParkingLot in the Gate reference --> Preferable
    9.3. Ask the ParkingLot from the customer
 10. Save the ticket in the TicketRepository
 */