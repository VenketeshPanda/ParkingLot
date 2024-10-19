package parkinglot.models;

import java.time.LocalDateTime;
import java.util.Date;

public class Payment extends BaseModel{
    Double amount;
    PaymentMode paymentMode;
    PaymentStatus paymentStatus;
    String refId;
    Date timeOfPayment;


    public Payment( PaymentMode paymentMode, PaymentStatus paymentStatus, String refId, Date timeOfPayment) {
        this.paymentMode = paymentMode;
        this.paymentStatus = paymentStatus;
        this.refId = refId;
        this.timeOfPayment = timeOfPayment;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }


    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public Date getTimeOfPayment() {
        return timeOfPayment;
    }

    public void setTimeOfPayment(Date timeOfPayment) {
        this.timeOfPayment = timeOfPayment;
    }
}
