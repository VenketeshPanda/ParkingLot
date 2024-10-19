package parkinglot.models;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public class Bill extends BaseModel{
    Ticket ticket;
    Operator operator;
    Gate entryGate;
    Date exitTime;
    Double amount;
    List<Payment> payment; //List<Payment> to support partial payments

    public Bill(Operator operator, List<Payment> payment, Double amount,
                Date exitTime, Gate entryGate, Ticket ticket) {
        this.operator = operator;
        this.payment = payment;
        this.amount = amount;
        this.exitTime = exitTime;
        this.entryGate = entryGate;
        this.ticket = ticket;
    }


    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public List<Payment> getPayment() {
        return payment;
    }

    public void setPayment(List<Payment> payment) {
        this.payment = payment;
    }
}
