package com.juniortest01.demo.entity;

import javax.persistence.*;
import java.util.Date;

// Schedule - график
@Entity
@Table(name = "payment_schedule")
public class PaymentSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "date")
    private Date date;

    @Column(name = "amount")
    private double amount;

    @Column(name = "credit_body_repayment")
    private double creditBodyRepayment;

    @Column(name = "credit_interest_repayment")
    private double creditInterestRepayment;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "credit_offer_id")
    private CreditOffer creditOffer;

    public PaymentSchedule() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getCreditBodyRepayment() {
        return creditBodyRepayment;
    }

    public void setCreditBodyRepayment(double creditBodyRepayment) {
        this.creditBodyRepayment = creditBodyRepayment;
    }

    public double getCreditInterestRepayment() {
        return creditInterestRepayment;
    }

    public void setCreditInterestRepayment(double creditInterestRepayment) {
        this.creditInterestRepayment = creditInterestRepayment;
    }

    public CreditOffer getCreditOffer() {
        return creditOffer;
    }

    public void setCreditOffer(CreditOffer creditOffer) {
        this.creditOffer = creditOffer;
    }
}
