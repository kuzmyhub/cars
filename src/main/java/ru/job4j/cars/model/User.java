package ru.job4j.cars.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "auto_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String login;
    private String password;

    @ManyToMany
    @JoinTable(
            name = "participates",
            joinColumns = { @JoinColumn (name = "user_id") },
            inverseJoinColumns = { @JoinColumn (name = "post_id") }
    )
    private List<Post> participates;
}
