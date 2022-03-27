package com.juniortest01.demo.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "credit")
public class Credit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "credit_limit")
    private double creditLimit;

    @Column(name = "interest_rate")
    private double interestRate;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.DETACH, CascadeType.PERSIST, CascadeType.REFRESH})
    @JoinColumn(name = "bank_id")
    private Bank bank;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "credit")
    private List<CreditOffer> creditOffers;

    public Credit() {
    }

    public void addCreditOfferToCredit(CreditOffer creditOffer) {
        creditOffer.setCredit(this);
        creditOffers.add(creditOffer);
    }

    public void removeCreditOfferFromCredit(CreditOffer creditOffer) {
        creditOffer.setCredit(null);
        creditOffers.remove(creditOffer);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public List<CreditOffer> getCreditOffers() {
        return creditOffers;
    }

    public void setCreditOffers(List<CreditOffer> creditOffers) {
        this.creditOffers = creditOffers;
    }
}

