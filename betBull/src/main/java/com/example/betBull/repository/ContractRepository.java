package com.example.betBull.repository;

import com.example.betBull.model.Contract;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContractRepository extends JpaRepository<Contract, Long > {
}
