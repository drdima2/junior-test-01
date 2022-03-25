package com.juniortest01.demo.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Embeddable
@Table(name = "client_credit")
public class ClientCredit {


    @EmbeddedId
    private ClientCreditId id;

    @ManyToOne
    @MapsId("clientId")
    private Client client;

    @ManyToOne
    @MapsId("creditId")
    private Credit credit;


    private int creditSum;

}
