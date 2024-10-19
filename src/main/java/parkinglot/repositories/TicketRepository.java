package parkinglot.repositories;

import parkinglot.models.Ticket;

import java.util.Map;
import java.util.TreeMap;

public class TicketRepository {

    Map<Integer,Ticket> tickets = new TreeMap<>();
    private static int previousId=0;

    public Ticket saveTicket(Ticket ticket){
        previousId+=1;
        ticket.setId(previousId);
        tickets.put(previousId,ticket);
        return ticket;
    }


}
