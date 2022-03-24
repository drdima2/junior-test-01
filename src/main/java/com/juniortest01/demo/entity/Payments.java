package com.juniortest01.demo.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "payments")
public class Payments extends AbstractEntity{
    LocalDate dateOfPayment;
    float sumOfPayment;
    float sumOfPaymentBody;
    float sumOfPaymentInterest;

}
