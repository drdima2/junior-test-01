package com.juniortest01.demo.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bank")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "bank")
    private List<Credit> credits = new ArrayList<>();

    @OneToMany(cascade = CascadeType.ALL,
            mappedBy = "bank")
    private List<Client> clients = new ArrayList<>();

    public Bank() {
    }

    public void addCreditToCredits(Credit credit) {
        credits.add(credit);
    }

    public void removeCreditFromCredits(Credit credit) {
        credits.remove(credit);
    }

    public void addClientToClients(Client client) {
        clients.add(client);
    }

    public void removeClientFromClients(Client client) {
        clients.remove(client);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Credit> getCredits() {
        return credits;
    }

    public void setCredits(List<Credit> credits) {
        this.credits = credits;
    }

    public List<Client> getClients() {
        return clients;
    }

    public void setClients(List<Client> clients) {
        this.clients = clients;
    }
}
