package com.example.betBull.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "teams")
@Getter
@Setter

public class Team {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id

    private Long id;
    private String name;
    private String paymentType;
}
