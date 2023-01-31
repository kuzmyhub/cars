package ru.cars.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = " driver")
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

    public Driver() {
    }
}
