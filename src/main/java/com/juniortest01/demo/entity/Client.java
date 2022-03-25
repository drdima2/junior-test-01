package com.juniortest01.demo.entity;



import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client extends AbstractEntity{

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "middle_name")
    private String middleName;

    @Column(name = "phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "passport")
    private String passport;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_bank", nullable = false)
    private Bank bank;
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="id_credit", nullable = false)
//    private ClientCredit clientCredit;
}
