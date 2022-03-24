//package com.juniortest01.demo.entity;
//
//import lombok.Data;
//
//import javax.persistence.*;
//
//@Data
//@Entity
//@Table(name = "client_credit")
//public class ClientCredit extends AbstractEntity{
//
//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name="id_client", nullable = false)
//    private Client client;
//
//    private Credit credit;
//
//    private int creditSum;
//
//}
