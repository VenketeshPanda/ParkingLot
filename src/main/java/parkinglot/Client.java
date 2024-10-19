package parkinglot;

import parkinglot.controllers.TicketController;
import parkinglot.dtos.IssueTicketRequestDTO;
import parkinglot.dtos.IssueTicketResponseDTO;
import parkinglot.dtos.ResponseStatus;
import parkinglot.models.*;
import parkinglot.repositories.GateRepository;
import parkinglot.repositories.TicketRepository;
import parkinglot.repositories.VehicleRepository;
import parkinglot.services.TicketService;

import java.util.List;

public class Client {

    public static void main(String[] args) {
        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();

        TicketService ticketService = new TicketService(gateRepository,vehicleRepository,ticketRepository);

        TicketController ticketController = new TicketController(ticketService);

        ParkingSlot slot = new ParkingSlot();
        slot.setSlotNo("1");
        slot.setSlotStatus(ParkingSlotStatus.EMPTY);
        slot.setVehicleType(VehicleType.TWO_WHEELER);


        ParkingFloor floor = new ParkingFloor("1", List.of(slot),List.of(new SupportedVehicleTypes(VehicleType.TWO_WHEELER,200)),ParkingFloorStatus.OPEN);

        ParkingLot lot = new ParkingLot();
        lot.setName("ParkX+");
        lot.setSlotAssignmentStrategyType(SlotAssignmentStrategyType.RANDOM);
        lot.setFloorList(List.of(floor));

        Gate gate = new Gate(GateType.ENTRY,new Operator("Prasad"),"Entry gate 1",lot,GateStatus.OPEN);
        gateRepository.saveGate(gate);


        IssueTicketRequestDTO issueTicketRequestDTO = new IssueTicketRequestDTO();
        issueTicketRequestDTO.setGateId(1);
        issueTicketRequestDTO.setOwnerName("Venky");
        issueTicketRequestDTO.setVehicleType(VehicleType.TWO_WHEELER);
        issueTicketRequestDTO.setVehicleNo("MH 07J 1287");

        IssueTicketResponseDTO issueTicketResponseDTO = ticketController.issueTicket(issueTicketRequestDTO);
        if(issueTicketResponseDTO.getResponseStatus().equals(ResponseStatus.SUCCESS)){
            System.out.println("Slot created successfully");
            System.out.println(issueTicketResponseDTO.getTicket().getParkingSlot().getSlotNo());
        }else{
            System.out.println("Ticket creation unsuccessful "+ issueTicketResponseDTO.getFailureMessage());
        }
    }
}
/* TicketController : TicketService : Repository
*  We will use Topological sort to figure out who will come before whom
* */