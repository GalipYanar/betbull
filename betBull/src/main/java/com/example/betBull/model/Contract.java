package com.example.betBull.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contract")
@Getter
@Setter

public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="player_id")
    private Long playerId;

    @Column(name="team_id")
    private Long teamId;

    @Column(name="transfer_payment")
    private Long transferPayment;

    @Column(name="contract_payment")
    private Long contractPayment;

    @Column(name="team_commission")
    private Long teamCommission;

    @Column(name="active_season")
    private Long activeSeason;
}
