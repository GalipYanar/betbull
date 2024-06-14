package com.example.betBull.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "players")
@Getter
@Setter

public class Player {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id

    private Long id;
    private String name;
    private Long dateOfBirth;


}
