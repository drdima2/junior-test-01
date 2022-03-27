package com.juniortest01.demo.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "payments")
public class Payments extends AbstractEntity{
    private LocalDate dateOfPayment;
    private float sumOfPayment;
    private float sumOfPaymentBody;
    private float sumOfPaymentInterest;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumns({
        @JoinColumn(name="client_id", insertable = false, updatable = false),
        @JoinColumn(name="credit_id", insertable = false, updatable = false),
    })
    private ClientCredit clientCredit;

}
