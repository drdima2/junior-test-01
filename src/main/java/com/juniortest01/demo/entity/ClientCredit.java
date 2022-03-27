package com.juniortest01.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "client_credit")
public class ClientCredit {

    @Column(unique = true, nullable = false)
    private Integer id;


    @EmbeddedId
    private ClientCreditId idEmbedded;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("clientId")
    private Client client;

    @ManyToOne(fetch = FetchType.LAZY)
    @MapsId("creditId")
    private Credit credit;

    @OneToMany(mappedBy = "clientCredit", cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    private List<Payments> paymentsList;


    private int creditSum;




}
