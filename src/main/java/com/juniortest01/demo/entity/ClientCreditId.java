package com.juniortest01.demo.entity;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Getter @Setter @EqualsAndHashCode @NoArgsConstructor
@Embeddable
public class ClientCreditId implements Serializable {

    @Column(name = "client_id")
    private int clientId;

    @Column(name = "credit_id")
    private int creditId;



}
