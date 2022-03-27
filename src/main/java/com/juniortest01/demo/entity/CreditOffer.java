package com.juniortest01.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "credit_offer")
public class CreditOffer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "credit_id")
    private Credit credit;

    @Column(name = "credit_amount")
    private double creditAmount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "payment_schedule_id")
    private PaymentSchedule paymentSchedule;

    public CreditOffer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public PaymentSchedule getPaymentSchedule() {
        return paymentSchedule;
    }

    public void setPaymentSchedule(PaymentSchedule paymentSchedule) {
        this.paymentSchedule = paymentSchedule;
    }
}
