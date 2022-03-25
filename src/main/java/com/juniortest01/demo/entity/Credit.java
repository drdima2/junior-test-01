package com.juniortest01.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "credit")
public class Credit extends AbstractEntity{

    @Column(name = "credit_limit")
    private int creditLimit;

    @Column(name = "interest")
    private float interest;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_bank", nullable = false)
    private Bank bank;


    @OneToMany(mappedBy = "credit" , cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ClientCredit> clientCreditList;






}
