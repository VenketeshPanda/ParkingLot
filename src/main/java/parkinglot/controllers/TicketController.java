package parkinglot.controllers;

import parkinglot.dtos.IssueTicketRequestDTO;
import parkinglot.dtos.IssueTicketResponseDTO;
import parkinglot.dtos.ResponseStatus;
import parkinglot.models.Ticket;
import parkinglot.services.TicketService;

public class TicketController {

    TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public IssueTicketResponseDTO issueTicket(IssueTicketRequestDTO issueTicketRequestDTO){
        IssueTicketResponseDTO responseDTO = new IssueTicketResponseDTO();
        try{
            Ticket ticket=ticketService.issueTicket(
                    issueTicketRequestDTO.getGateId(),
                    issueTicketRequestDTO.getVehicleNo(),
                    issueTicketRequestDTO.getOwnerName(),
                    issueTicketRequestDTO.getVehicleType());

            responseDTO.setTicket(ticket);
            responseDTO.setResponseStatus(ResponseStatus.SUCCESS);
        }catch (Exception e){
            responseDTO.setResponseStatus(ResponseStatus.FAILURE);
            responseDTO.setFailureMessage(e.getMessage());
        }
        return  responseDTO;
    }
}
