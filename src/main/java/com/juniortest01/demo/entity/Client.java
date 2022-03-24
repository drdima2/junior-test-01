package com.juniortest01.demo.entity;



import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client extends AbstractEntity{
    private String firstName;
    private String lastName;
    private String middleName;
    private String phone;
    private String email;
    private String passport;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_bank", nullable = false)
    private Bank bank;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_credit", nullable = false)
    private ClientCredit clientCredit;
}
