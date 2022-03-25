package com.juniortest01.demo.entity;

import lombok.ToString;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

@Entity
@Table(name = "bank")
public class Bank extends AbstractEntity{

    @ToString.Exclude
    @OneToMany(mappedBy = "bank", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Client> clientList;

    @ToString.Exclude
    @OneToMany(mappedBy = "bank", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Credit> creditList;
}
