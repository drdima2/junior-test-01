package com.juniortest01.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "credit")
public class Credit extends AbstractEntity{
    private int creditLimit;
    private float interest;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="id_bank", nullable = false)
    private Bank bank;


}
